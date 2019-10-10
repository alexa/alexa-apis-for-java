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
 * AlexaList
 */

@JsonDeserialize(builder = AlexaList.Builder.class)
public final class AlexaList {

    @JsonProperty("listId")
    private String listId = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("state")
    private com.amazon.ask.model.services.listManagement.ListState state = null;

    @JsonProperty("version")
    private Long version = null;

    @JsonProperty("items")
    private List<com.amazon.ask.model.services.listManagement.AlexaListItem> items = new ArrayList<com.amazon.ask.model.services.listManagement.AlexaListItem>();

    @JsonProperty("links")
    private com.amazon.ask.model.services.listManagement.Links links = null;

    public static Builder builder() {
        return new Builder();
    }

    private AlexaList(Builder builder) {
        if (builder.listId != null) {
            this.listId = builder.listId;
        }
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.state != null) {
            this.state = builder.state;
        }
        if (builder.version != null) {
            this.version = builder.version;
        }
        if (builder.items != null) {
            this.items = builder.items;
        }
        if (builder.links != null) {
            this.links = builder.links;
        }
    }

    /**
     * Get listId
     * @return listId
    **/
    @JsonProperty("listId")
    public String getListId() {
        return listId;
    }

    /**
     * Get name
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Get state
     * @return state
    **/
    @JsonProperty("state")
    public com.amazon.ask.model.services.listManagement.ListState getState() {
        return state;
    }

    /**
     * Get version
     * @return version
    **/
    @JsonProperty("version")
    public Long getVersion() {
        return version;
    }

    /**
     * Get items
     * @return items
    **/
    @JsonProperty("items")
    public List<com.amazon.ask.model.services.listManagement.AlexaListItem> getItems() {
        return items;
    }

    /**
     * Get links
     * @return links
    **/
    @JsonProperty("links")
    public com.amazon.ask.model.services.listManagement.Links getLinks() {
        return links;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlexaList servicesListManagementAlexaList = (AlexaList) o;
        return Objects.equals(this.listId, servicesListManagementAlexaList.listId) &&
            Objects.equals(this.name, servicesListManagementAlexaList.name) &&
            Objects.equals(this.state, servicesListManagementAlexaList.state) &&
            Objects.equals(this.version, servicesListManagementAlexaList.version) &&
            Objects.equals(this.items, servicesListManagementAlexaList.items) &&
            Objects.equals(this.links, servicesListManagementAlexaList.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listId, name, state, version, items, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlexaList {\n");
        
        sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
        private String name;
        private com.amazon.ask.model.services.listManagement.ListState state;
        private Long version;
        private List<com.amazon.ask.model.services.listManagement.AlexaListItem> items;
        private com.amazon.ask.model.services.listManagement.Links links;

        private Builder() {}

        @JsonProperty("listId")
        public Builder withListId(String listId) {
            this.listId = listId;
            return this;
        }


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


        @JsonProperty("items")
        public Builder withItems(List<com.amazon.ask.model.services.listManagement.AlexaListItem> items) {
            this.items = items;
            return this;
        }

        public Builder addItemsItem(com.amazon.ask.model.services.listManagement.AlexaListItem itemsItem) {
            if (this.items == null) {
                this.items = new ArrayList<com.amazon.ask.model.services.listManagement.AlexaListItem>();
            }
            this.items.add(itemsItem);
            return this;
        }

        @JsonProperty("links")
        public Builder withLinks(com.amazon.ask.model.services.listManagement.Links links) {
            this.links = links;
            return this;
        }


        public AlexaList build() {
            return new AlexaList(this);
        }
    }
}

