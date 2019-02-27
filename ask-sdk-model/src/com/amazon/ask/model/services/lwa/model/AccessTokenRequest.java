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
 * Request for retrieving an access token from LWA.
 */
@JsonDeserialize(builder = AccessTokenRequest.Builder.class)
public class AccessTokenRequest {

    @JsonProperty("client_id")
    private String clientId;

    @JsonProperty("client_secret")
    private String clientSecret;

    @JsonProperty("scope")
    private String scope;

    private AccessTokenRequest(Builder builder) {
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public String getScope() {
        return scope;
    }

    public static class Builder {
        private String clientId;
        private String clientSecret;
        private String scope;

        private Builder() {}

        @JsonProperty("client_id")
        public Builder withClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        @JsonProperty("client_secret")
        public Builder withClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        @JsonProperty("scope")
        public Builder withScope(String scope) {
            this.scope = scope;
            return this;
        }

        public AccessTokenRequest build() {
            return new AccessTokenRequest(this);
        }
    }

}
