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

import com.amazon.ask.model.services.util.JacksonSerializer;

/**
 * Default implementation of API Configuration options which is pre-configured for
 * most common use scenarios.
 */
public class DefaultApiConfiguration implements ApiConfiguration {

  private static final String DEFAULT_API_ENDPOINT = "https://api.amazon.com";

  private Serializer serializer;
  private ApiClient apiClient;
  private String authorizationValue;
  private String apiEndpoint;

  private DefaultApiConfiguration(Builder builder) {
    this.apiClient = builder.apiClient;
    this.authorizationValue = builder.authorizationValue;
    this.serializer = builder.serializer != null ? builder.serializer : new JacksonSerializer();
    this.apiEndpoint = builder.apiEndpoint != null ? builder.apiEndpoint : DEFAULT_API_ENDPOINT;
  }

  public static Builder builder() {
    return new Builder();
  }

  public Serializer getSerializer() {
    return serializer;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public String getAuthorizationValue() {
    return authorizationValue;
  }

  public String getApiEndpoint() {
    return apiEndpoint;
  }

  /**
   * Helper class that builds an instance of a DefaultConfiguration.
   */
  public static final class Builder {
    private Serializer serializer;
    private ApiClient apiClient;
    private String authorizationValue;
    private String apiEndpoint;

    private Builder() {}

    /**
     * Sets the default <code>Serializer</code> instance to be configured.
     * @param serializer <code>Serializer</code> instance to be configured.
     * @return This instance to continue the build process
     */
    public Builder withSerializer(Serializer serializer) {
      this.serializer = serializer;
      return this;
    }

    /**
     * Sets the default <code>ApiClient</code> instance to be configured.
     * @param apiClient <code>ApiClient</code> instance to be configured.
     * @return This instance to continue the build process
     */
    public Builder withApiClient(ApiClient apiClient) {
      this.apiClient = apiClient;
      return this;
    }

    /**
     * Sets the authorization value to be configured.
     * @param authorizationValue Authorization value or token to be configured.
     * @return This instance to continue the build process
     */
    public Builder withAuthorizationValue(String authorizationValue) {
      this.authorizationValue = authorizationValue;
      return this;
    }

    /**
     * Sets the default endpoint for an Api call.
     * @param apiEndpoint Endpoint string to configure.
     * @return This instance to continue the build process
     */
    public Builder withApiEndpoint(String apiEndpoint) {
      this.apiEndpoint = apiEndpoint;
      return this;
    }

    /**
     * Builds the <code>ApiConfiguration</code> instance with the values previously provided.
     * @return New <code>ApiConfiguration</code> instance
     */
    public DefaultApiConfiguration build() {
      return new DefaultApiConfiguration(this);
    }
  }
}
