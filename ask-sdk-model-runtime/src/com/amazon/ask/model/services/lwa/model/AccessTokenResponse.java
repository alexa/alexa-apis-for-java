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

package com.amazon.ask.model.services.lwa.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Response from LWA for retrieving an access token.
 */
@JsonDeserialize(builder = AccessTokenResponse.Builder.class)
public class AccessTokenResponse {

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("expires_in")
    private long expiresIn;

    @JsonProperty("scope")
    private String scope;

    @JsonProperty("token_type")
    private String tokenType;

    private AccessTokenResponse(Builder builder) {
        this.accessToken = builder.accessToken;
        this.expiresIn = builder.expiresIn;
        this.scope = builder.scope;
        this.tokenType = builder.tokenType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAccessToken() {
        return accessToken;
    }

    public long getExpiresIn() {
        return expiresIn;
    }

    public String getScope() {
        return scope;
    }

    public String getTokenType() {
        return tokenType;
    }

    public static class Builder {
        private String accessToken;
        private long expiresIn;
        private String scope;
        private String tokenType;

        @JsonProperty("access_token")
        public Builder withAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        @JsonProperty("expires_in")
        public Builder withExpiresIn(long expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        @JsonProperty("scope")
        public Builder withScope(String scope) {
            this.scope = scope;
            return this;
        }

        @JsonProperty("token_type")
        public Builder withTokenType(String tokenType) {
            this.tokenType = tokenType;
            return this;
        }

        public AccessTokenResponse build() {
            return new AccessTokenResponse(this);
        }
    }

}
