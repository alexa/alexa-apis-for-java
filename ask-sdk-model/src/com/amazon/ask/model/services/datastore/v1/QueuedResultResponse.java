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


package com.amazon.ask.model.services.datastore.v1;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Response for queued deliveries query.
 */

@JsonDeserialize(builder = QueuedResultResponse.Builder.class)
public final class QueuedResultResponse {

    @JsonProperty("items")
    private List<com.amazon.ask.model.services.datastore.v1.CommandsDispatchResult> items = new ArrayList<com.amazon.ask.model.services.datastore.v1.CommandsDispatchResult>();

    @JsonProperty("paginationContext")
    private com.amazon.ask.model.services.datastore.v1.ResponsePaginationContext paginationContext = null;

    private QueuedResultResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private QueuedResultResponse(Builder builder) {
        if (builder.items != null) {
            this.items = builder.items;
        }
        if (builder.paginationContext != null) {
            this.paginationContext = builder.paginationContext;
        }
    }

    /**
     * The array only contains results which have not been a SUCCESS delivery. An empty response means that all targeted devices has been received the commands payload. 
     * @return items
    **/
    @JsonProperty("items")
    public List<com.amazon.ask.model.services.datastore.v1.CommandsDispatchResult> getItems() {
        return items;
    }


    /**
     * Get paginationContext
     * @return paginationContext
    **/
    @JsonProperty("paginationContext")
    public com.amazon.ask.model.services.datastore.v1.ResponsePaginationContext getPaginationContext() {
        return paginationContext;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueuedResultResponse servicesDatastoreV1QueuedResultResponse = (QueuedResultResponse) o;
        return Objects.equals(this.items, servicesDatastoreV1QueuedResultResponse.items) &&
            Objects.equals(this.paginationContext, servicesDatastoreV1QueuedResultResponse.paginationContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, paginationContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueuedResultResponse {\n");
        
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    paginationContext: ").append(toIndentedString(paginationContext)).append("\n");
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
        private List<com.amazon.ask.model.services.datastore.v1.CommandsDispatchResult> items;
        private com.amazon.ask.model.services.datastore.v1.ResponsePaginationContext paginationContext;

        private Builder() {}

        @JsonProperty("items")

        public Builder withItems(List<com.amazon.ask.model.services.datastore.v1.CommandsDispatchResult> items) {
            this.items = items;
            return this;
        }

        public Builder addItemsItem(com.amazon.ask.model.services.datastore.v1.CommandsDispatchResult itemsItem) {
            if (this.items == null) {
                this.items = new ArrayList<com.amazon.ask.model.services.datastore.v1.CommandsDispatchResult>();
            }
            this.items.add(itemsItem);
            return this;
        }

        @JsonProperty("paginationContext")

        public Builder withPaginationContext(com.amazon.ask.model.services.datastore.v1.ResponsePaginationContext paginationContext) {
            this.paginationContext = paginationContext;
            return this;
        }


        public QueuedResultResponse build() {
            return new QueuedResultResponse(this);
        }
    }
}

