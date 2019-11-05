/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
 * except in compliance with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
 * the specific language governing permissions and limitations under the License.
 */

package com.amazon.ask.model.services.lwa;

import com.amazon.ask.model.services.ApiConfiguration;
import com.amazon.ask.model.services.AuthenticationConfiguration;
import com.amazon.ask.model.services.BaseServiceClient;
import com.amazon.ask.model.services.Pair;
import com.amazon.ask.model.services.ServiceClientResponse;
import com.amazon.ask.model.services.lwa.model.AccessToken;
import com.amazon.ask.model.services.lwa.model.AccessTokenRequest;
import com.amazon.ask.model.services.lwa.model.AccessTokenResponse;
import com.amazon.ask.model.services.lwa.model.Error;
import com.amazon.ask.model.services.lwa.model.GrantType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * Client for calling Amazon LWA to retrieve access tokens.
 */
public class LwaClient extends BaseServiceClient {

    private final AuthenticationConfiguration authenticationConfiguration;
    private final Map<String, AccessToken> scopeTokenStore;
    private final String endpoint;
    private final GrantType grantType;

    private static final long EXPIRY_OFFSET_MILLIS = 60000;
    private static final String DEFAULT_LWA_ENDPOINT = "https://api.amazon.com";

    private LwaClient(Builder builder) {
        super(builder.apiConfiguration);
        if (builder.authenticationConfiguration == null) {
            throw new IllegalArgumentException("AuthenticationConfiguration must be provided");
        }
        this.authenticationConfiguration = builder.authenticationConfiguration;
        this.scopeTokenStore = new ConcurrentHashMap<>();
        this.endpoint = builder.apiConfiguration.getApiEndpoint();
        this.grantType = builder.grantType != null ? builder.grantType : GrantType.CLIENT_CREDENTIALS;
    }

    public static Builder builder() { return new Builder(); }

    /**
     * Retrieves an access token using the configured client id, client secret, and refresh token
     * @return retrieved access token
     */
    public String getAccessTokenForRefreshToken() {
        return getAccessTokenForScope(GrantType.REFRESH_TOKEN.toString());
    }

    /**
     * Retrieves an access token for the given scope, using the configured client id and client secret
     * @param scope target scope
     * @return retrieved access token
     */
    public String getAccessTokenForScope(String scope) {
        if (scope == null || scope.isEmpty()) {
            throw new IllegalArgumentException("Scope must be provided");
        }
        AccessToken token = scopeTokenStore.get(scope);
        if (token != null && token.getExpiry() > System.currentTimeMillis() + EXPIRY_OFFSET_MILLIS) {
            return token.getToken();
        }
        long currentEpochMillis = System.currentTimeMillis();
        AccessTokenResponse lwaResponse = generateAccessToken(AccessTokenRequest.builder()
                .withScope(scope)
                .withClientId(authenticationConfiguration.getClientId())
                .withClientSecret(authenticationConfiguration.getClientSecret())
                .withRefreshToken(authenticationConfiguration.getRefreshToken())
                .build());
        scopeTokenStore.put(scope, new AccessToken(lwaResponse.getAccessToken(),
                currentEpochMillis + TimeUnit.SECONDS.toMillis(lwaResponse.getExpiresIn())));
        return lwaResponse.getAccessToken();
    }

    private AccessTokenResponse generateAccessToken(AccessTokenRequest request) {
        List<Pair<String, String>> queryParams = new ArrayList<>();
        Map<String, String> pathParams = new HashMap<>();
        List<Pair<String, String>> headerParams = new ArrayList<>();
        headerParams.add(new Pair<>("Content-Type", "application/x-www-form-urlencoded"));
        String payload = "grant_type=" + grantType.getValue() + "&client_id=" + request.getClientId() +
                "&client_secret=" + request.getClientSecret();
        if (request.getScope().equals(GrantType.REFRESH_TOKEN.name())) {
            payload += "&refresh_token=" + request.getRefreshToken();
        } else {
            payload += "&scope=" + request.getScope();
        }
        List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
        serviceResponseDefinitions.add(new ServiceClientResponse(AccessTokenResponse.class, 200, "Token request sent."));
        serviceResponseDefinitions.add(new ServiceClientResponse(Error.class, 400, "Bad Request"));
        serviceResponseDefinitions.add(new ServiceClientResponse(Error.class, 401, "Authentication Failed"));
        serviceResponseDefinitions.add(new ServiceClientResponse(Error.class, 500, "Internal Server Error"));

        String lwaEndpoint = endpoint != null ? endpoint : DEFAULT_LWA_ENDPOINT;
        return (AccessTokenResponse)invoke("POST", lwaEndpoint, "/auth/O2/token",
                queryParams, headerParams, pathParams, serviceResponseDefinitions, payload, AccessTokenResponse.class, true);
    }

    public static final class Builder {

        private AuthenticationConfiguration authenticationConfiguration;
        private ApiConfiguration apiConfiguration;
        private GrantType grantType;

        public Builder withAuthenticationConfiguration(AuthenticationConfiguration authenticationConfiguration) {
            this.authenticationConfiguration = authenticationConfiguration;
            return this;
        }

        public Builder withApiConfiguration(ApiConfiguration apiConfiguration) {
            this.apiConfiguration = apiConfiguration;
            return this;
        }

        public Builder withGrantType(GrantType grantType) {
            this.grantType = grantType;
            return this;
        }

        public LwaClient build() {
            return new LwaClient(this);
        }

    }

}
