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
 * ListBody
 */

@JsonDeserialize(builder = ListBody.Builder.class)
public final class ListBody{

  @JsonProperty("listId")
  private String listId = null;

  public static Builder builder() {
    return new Builder();
  }

  private ListBody(Builder builder) {
    this.listId = builder.listId;
  }

  /**
    * Get listId
  * @return listId
  **/
  public String getListId() {
    return listId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBody servicesListManagementListBody = (ListBody) o;
    return Objects.equals(this.listId, servicesListManagementListBody.listId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBody {\n");
    
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
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
    private String listId;

    private Builder() { }

    @JsonProperty("listId")
    public Builder withListId(String listId) {
        this.listId = listId;
        return this;
    }


    public ListBody build() {
      return new ListBody(this);
    }
  }
}

