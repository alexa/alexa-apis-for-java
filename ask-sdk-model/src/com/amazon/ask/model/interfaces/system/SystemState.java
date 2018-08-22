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


package com.amazon.ask.model.interfaces.system;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SystemState
 */

@JsonDeserialize(builder = SystemState.Builder.class)
public final class SystemState{

  @JsonProperty("application")
  private com.amazon.ask.model.Application application = null;

  @JsonProperty("user")
  private com.amazon.ask.model.User user = null;

  @JsonProperty("device")
  private com.amazon.ask.model.Device device = null;

  @JsonProperty("apiEndpoint")
  private String apiEndpoint = null;

  @JsonProperty("apiAccessToken")
  private String apiAccessToken = null;

  public static Builder builder() {
    return new Builder();
  }

  private SystemState(Builder builder) {
    this.application = builder.application;
    this.user = builder.user;
    this.device = builder.device;
    this.apiEndpoint = builder.apiEndpoint;
    this.apiAccessToken = builder.apiAccessToken;
  }

  /**
    * Get application
  * @return application
  **/
  public com.amazon.ask.model.Application getApplication() {
    return application;
  }

  /**
    * Get user
  * @return user
  **/
  public com.amazon.ask.model.User getUser() {
    return user;
  }

  /**
    * Get device
  * @return device
  **/
  public com.amazon.ask.model.Device getDevice() {
    return device;
  }

  /**
    * Get apiEndpoint
  * @return apiEndpoint
  **/
  public String getApiEndpoint() {
    return apiEndpoint;
  }

  /**
    * Get apiAccessToken
  * @return apiAccessToken
  **/
  public String getApiAccessToken() {
    return apiAccessToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemState interfacesSystemSystemState = (SystemState) o;
    return Objects.equals(this.application, interfacesSystemSystemState.application) &&
        Objects.equals(this.user, interfacesSystemSystemState.user) &&
        Objects.equals(this.device, interfacesSystemSystemState.device) &&
        Objects.equals(this.apiEndpoint, interfacesSystemSystemState.apiEndpoint) &&
        Objects.equals(this.apiAccessToken, interfacesSystemSystemState.apiAccessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, user, device, apiEndpoint, apiAccessToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemState {\n");
    
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    apiEndpoint: ").append(toIndentedString(apiEndpoint)).append("\n");
    sb.append("    apiAccessToken: ").append(toIndentedString(apiAccessToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static class Builder {
    private com.amazon.ask.model.Application application;
    private com.amazon.ask.model.User user;
    private com.amazon.ask.model.Device device;
    private String apiEndpoint;
    private String apiAccessToken;

    private Builder() { }

    @JsonProperty("application")
    public Builder withApplication(com.amazon.ask.model.Application application) {
      this.application = application;
      return this;
    }
      

    @JsonProperty("user")
    public Builder withUser(com.amazon.ask.model.User user) {
      this.user = user;
      return this;
    }
      

    @JsonProperty("device")
    public Builder withDevice(com.amazon.ask.model.Device device) {
      this.device = device;
      return this;
    }
      

    @JsonProperty("apiEndpoint")
    public Builder withApiEndpoint(String apiEndpoint) {
      this.apiEndpoint = apiEndpoint;
      return this;
    }
      

    @JsonProperty("apiAccessToken")
    public Builder withApiAccessToken(String apiAccessToken) {
      this.apiAccessToken = apiAccessToken;
      return this;
    }
      

    public SystemState build() {
      return new SystemState(this);
    }
  }
}

