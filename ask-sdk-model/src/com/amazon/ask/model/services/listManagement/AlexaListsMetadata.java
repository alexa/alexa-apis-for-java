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


package com.amazon.ask.model.services.listManagement;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AlexaListsMetadata
 */

@JsonDeserialize(builder = AlexaListsMetadata.Builder.class)
public final class AlexaListsMetadata{

  @JsonProperty("lists")
  private List<com.amazon.ask.model.services.listManagement.AlexaListMetadata> lists = new ArrayList<com.amazon.ask.model.services.listManagement.AlexaListMetadata>();

  public static Builder builder() {
    return new Builder();
  }

  private AlexaListsMetadata(Builder builder) {
    this.lists = builder.lists;
  }

  /**
    * Get lists
  * @return lists
  **/
  public List<com.amazon.ask.model.services.listManagement.AlexaListMetadata> getLists() {
    return lists;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlexaListsMetadata servicesListManagementAlexaListsMetadata = (AlexaListsMetadata) o;
    return Objects.equals(this.lists, servicesListManagementAlexaListsMetadata.lists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlexaListsMetadata {\n");
    
    sb.append("    lists: ").append(toIndentedString(lists)).append("\n");
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
    private List<com.amazon.ask.model.services.listManagement.AlexaListMetadata> lists;

    private Builder() { }

    @JsonProperty("lists")
    public Builder withLists(List<com.amazon.ask.model.services.listManagement.AlexaListMetadata> lists) {
      this.lists = lists;
      return this;
    }
      
    public Builder addListsItem(com.amazon.ask.model.services.listManagement.AlexaListMetadata listsItem) {
      if (this.lists == null) {
        this.lists = new ArrayList<com.amazon.ask.model.services.listManagement.AlexaListMetadata>();
      }
      this.lists.add(listsItem);
      return this;
    }

    public AlexaListsMetadata build() {
      return new AlexaListsMetadata(this);
    }
  }
}

