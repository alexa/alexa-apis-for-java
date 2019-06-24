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


package com.amazon.ask.model;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the value of LoginWithAmazon(LWA) consent scope. This object is used as in the key-value pairs that are provided in user.permissions.scopes object
 */

@JsonDeserialize(builder = Scope.Builder.class)
public final class Scope{

  @JsonProperty("status")
  private com.amazon.ask.model.PermissionStatus status = null;

  public static Builder builder() {
    return new Builder();
  }

  private Scope(Builder builder) {
    this.status = builder.status;
  }

  /**
    * Get status
  * @return status
  **/
  public com.amazon.ask.model.PermissionStatus getStatus() {
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
    Scope scope = (Scope) o;
    return Objects.equals(this.status, scope.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scope {\n");
    
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
    private com.amazon.ask.model.PermissionStatus status;

    private Builder() { }

    @JsonProperty("status")
    public Builder withStatus(com.amazon.ask.model.PermissionStatus status) {
        this.status = status;
        return this;
    }


    public Scope build() {
      return new Scope(this);
    }
  }
}

