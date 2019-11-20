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
 * Abstraction for authentication configuration for a client ID and client secret.
 */
public interface AuthenticationConfiguration {

    /**
     * Retrieves the configured client ID.
     * @return client ID
     */
    String getClientId();

    /**
     * Retrieves the configured client secret.
     * @return client secret
     */
    String getClientSecret();

    /**
     * Retrieves the configured refresh token.
     * @return refresh token
     */
    String getRefreshToken();

}
