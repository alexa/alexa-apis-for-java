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

import java.util.List;
import java.util.Map;

public class ApiResponse<T> {

    private final T response;
    private final int statusCode;
    private final List<Pair<String, String>> headers;

    public ApiResponse(T response, int statusCode, List<Pair<String, String>> headers) {
        this.response = response;
        this.statusCode = statusCode;
        this.headers = headers;
    }

    public T getResponse() {
        return response;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public List<Pair<String, String>> getHeaders() {
        return headers;
    }

}
