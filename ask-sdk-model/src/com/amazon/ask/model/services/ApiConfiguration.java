/*
 * Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents an interface that provides API configuration options needed by service clients.
 */
public interface ApiConfiguration {

  Serializer getSerializer();
  /**
   * Retrieves the configured API Client implementation.
   * @return the default API client
   */
  ApiClient getApiClient();

  /**
   * Retrieves the Authorization value registered to be sent from the Service Clients
   * @return Authorization Value.
   */
  String getAuthorizationValue();
  /**
   * Retrieves the endpoint for the API call.
   * @return the endpoint for the client to invoke the remote call on.
   */
  String getApiEndpoint();
}
