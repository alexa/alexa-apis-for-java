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


package com.amazon.ask.model.events.skillevents;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PermissionBody
 */

@JsonDeserialize(builder = PermissionBody.Builder.class)
public final class PermissionBody{

  @JsonProperty("acceptedPermissions")
  private List<com.amazon.ask.model.events.skillevents.Permission> acceptedPermissions = new ArrayList<com.amazon.ask.model.events.skillevents.Permission>();

  public static Builder builder() {
    return new Builder();
  }

  private PermissionBody(Builder builder) {
    this.acceptedPermissions = builder.acceptedPermissions;
  }

  /**
    * Get acceptedPermissions
  * @return acceptedPermissions
  **/
  public List<com.amazon.ask.model.events.skillevents.Permission> getAcceptedPermissions() {
    return acceptedPermissions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionBody eventsSkilleventsPermissionBody = (PermissionBody) o;
    return Objects.equals(this.acceptedPermissions, eventsSkilleventsPermissionBody.acceptedPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionBody {\n");
    
    sb.append("    acceptedPermissions: ").append(toIndentedString(acceptedPermissions)).append("\n");
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
    private List<com.amazon.ask.model.events.skillevents.Permission> acceptedPermissions;

    private Builder() { }

    @JsonProperty("acceptedPermissions")
    public Builder withAcceptedPermissions(List<com.amazon.ask.model.events.skillevents.Permission> acceptedPermissions) {
      this.acceptedPermissions = acceptedPermissions;
      return this;
    }
      
    public Builder addAcceptedPermissionsItem(com.amazon.ask.model.events.skillevents.Permission acceptedPermissionsItem) {
      if (this.acceptedPermissions == null) {
        this.acceptedPermissions = new ArrayList<com.amazon.ask.model.events.skillevents.Permission>();
      }
      this.acceptedPermissions.add(acceptedPermissionsItem);
      return this;
    }

    public PermissionBody build() {
      return new PermissionBody(this);
    }
  }
}

