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
 * Status
 */

@JsonDeserialize(builder = Status.Builder.class)
public final class Status{

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("status")
  private com.amazon.ask.model.services.listManagement.ListItemState status = null;

  public static Builder builder() {
    return new Builder();
  }

  private Status(Builder builder) {
    this.url = builder.url;
    this.status = builder.status;
  }

  /**
    * Get url
  * @return url
  **/
  public String getUrl() {
    return url;
  }

  /**
    * Get status
  * @return status
  **/
  public com.amazon.ask.model.services.listManagement.ListItemState getStatus() {
    return status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status servicesListManagementStatus = (Status) o;
    return Objects.equals(this.url, servicesListManagementStatus.url) &&
        Objects.equals(this.status, servicesListManagementStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    private String url;
    private com.amazon.ask.model.services.listManagement.ListItemState status;

    private Builder() { }

    @JsonProperty("url")
    public Builder withUrl(String url) {
        this.url = url;
        return this;
    }


    @JsonProperty("status")
    public Builder withStatus(com.amazon.ask.model.services.listManagement.ListItemState status) {
        this.status = status;
        return this;
    }


    public Status build() {
      return new Status(this);
    }
  }
}

