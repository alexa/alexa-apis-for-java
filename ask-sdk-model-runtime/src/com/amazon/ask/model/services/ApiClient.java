/*
 * Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License"). You may not use
 * this file except in compliance with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, express or
 * implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazon.ask.model.services;

/**
 * Represents a basic contract for API request execution.
 */
public interface ApiClient {

  /**
   * Dispatches a request to an API endpoint described in the request.
   * An ApiClient is expected to resolve the Promise in the case an API returns a non-200 HTTP
   * status code. The responsibility of translating a particular response code to an error lies with the
   * caller to invoke.
   * @param request Request to dispatch to the ApiClient
   * @return Response from the ApiClient
   */
  ApiClientResponse invoke(ApiClientRequest request);
}
