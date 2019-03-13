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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * ListItemBody
 */

@JsonDeserialize(builder = ListItemBody.Builder.class)
public final class ListItemBody{

  @JsonProperty("listId")
  private String listId = null;

  @JsonProperty("listItemIds")
  private List<String> listItemIds = new ArrayList<String>();

  public static Builder builder() {
    return new Builder();
  }

  private ListItemBody(Builder builder) {
    this.listId = builder.listId;
    this.listItemIds = builder.listItemIds;
  }

  /**
    * Get listId
  * @return listId
  **/
  public String getListId() {
    return listId;
  }

  /**
    * Get listItemIds
  * @return listItemIds
  **/
  public List<String> getListItemIds() {
    return listItemIds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListItemBody servicesListManagementListItemBody = (ListItemBody) o;
    return Objects.equals(this.listId, servicesListManagementListItemBody.listId) &&
        Objects.equals(this.listItemIds, servicesListManagementListItemBody.listItemIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listId, listItemIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListItemBody {\n");
    
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    listItemIds: ").append(toIndentedString(listItemIds)).append("\n");
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
    private List<String> listItemIds;

    private Builder() { }

    @JsonProperty("listId")
    public Builder withListId(String listId) {
      this.listId = listId;
      return this;
    }
      

    @JsonProperty("listItemIds")
    public Builder withListItemIds(List<String> listItemIds) {
      this.listItemIds = listItemIds;
      return this;
    }
      
    public Builder addListItemIdsItem(String listItemIdsItem) {
      if (this.listItemIds == null) {
        this.listItemIds = new ArrayList<String>();
      }
      this.listItemIds.add(listItemIdsItem);
      return this;
    }

    public ListItemBody build() {
      return new ListItemBody(this);
    }
  }
}

