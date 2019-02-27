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
package com.amazon.ask.model.services;

/**
 * Default implementation of {@link AuthenticationConfiguration}, used to wrap a client ID and client secret.
 */
public class DefaultAuthenticationConfiguration implements AuthenticationConfiguration {

    private final String clientId;
    private final String clientSecret;

    protected DefaultAuthenticationConfiguration(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getClientId() {
        return clientId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getClientSecret() {
        return clientSecret;
    }

    public static class Builder {
        private String clientId;
        private String clientSecret;

        public Builder withClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder withClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public DefaultAuthenticationConfiguration build() {
            return new DefaultAuthenticationConfiguration(clientId, clientSecret);
        }

    }

}
