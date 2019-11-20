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

/**
 * An LWA access token
 */
public class AccessToken {

    private String token;
    private long expiry;

    public AccessToken(String token, long expiry) {
        this.token = token;
        this.expiry = expiry;
    }

    /**
     * Returns the LWA access token.
     * @return LWA access token
     */
    public String getToken() {
        return token;
    }

    /**
     * Returns the LWA token expiry, in seconds
     * @return LWA token expiry, in seconds
     */
    public long getExpiry() {
        return expiry;
    }

}
