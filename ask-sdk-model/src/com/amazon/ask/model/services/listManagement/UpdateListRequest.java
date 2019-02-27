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


package com.amazon.ask.model.services.listManagement;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateListRequest
 */

@JsonDeserialize(builder = UpdateListRequest.Builder.class)
public final class UpdateListRequest{

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("state")
  private com.amazon.ask.model.services.listManagement.ListState state = null;

  @JsonProperty("version")
  private Long version = null;

  public static Builder builder() {
    return new Builder();
  }

  private UpdateListRequest(Builder builder) {
    this.name = builder.name;
    this.state = builder.state;
    this.version = builder.version;
  }

  /**
    * Get name
  * @return name
  **/
  public String getName() {
    return name;
  }

  /**
    * Get state
  * @return state
  **/
  public com.amazon.ask.model.services.listManagement.ListState getState() {
    return state;
  }

  /**
    * Get version
  * @return version
  **/
  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateListRequest servicesListManagementUpdateListRequest = (UpdateListRequest) o;
    return Objects.equals(this.name, servicesListManagementUpdateListRequest.name) &&
        Objects.equals(this.state, servicesListManagementUpdateListRequest.state) &&
        Objects.equals(this.version, servicesListManagementUpdateListRequest.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, state, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateListRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    private String name;
    private com.amazon.ask.model.services.listManagement.ListState state;
    private Long version;

    private Builder() { }

    @JsonProperty("name")
    public Builder withName(String name) {
      this.name = name;
      return this;
    }
      

    @JsonProperty("state")
    public Builder withState(com.amazon.ask.model.services.listManagement.ListState state) {
      this.state = state;
      return this;
    }
      

    @JsonProperty("version")
    public Builder withVersion(Long version) {
      this.version = version;
      return this;
    }
      

    public UpdateListRequest build() {
      return new UpdateListRequest(this);
    }
  }
}

