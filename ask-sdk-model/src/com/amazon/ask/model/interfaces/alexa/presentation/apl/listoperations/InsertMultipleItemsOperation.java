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


package com.amazon.ask.model.interfaces.alexa.presentation.apl.listoperations;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Inserts an array of items into consecutive indexes in a dynamicIndexList.
 */

@JsonDeserialize(builder = InsertMultipleItemsOperation.Builder.class)
public final class InsertMultipleItemsOperation extends com.amazon.ask.model.interfaces.alexa.presentation.apl.listoperations.Operation  {

    @JsonProperty("items")
    private List<Object> items = new ArrayList<Object>();

    public static Builder builder() {
        return new Builder();
    }

    private InsertMultipleItemsOperation(Builder builder) {
        String discriminatorValue = "InsertMultipleItems";

        this.type = discriminatorValue;
        if (builder.index != null) {
            this.index = builder.index;
        }
        if (builder.items != null) {
            this.items = builder.items;
        }
    }

    /**
     * The new items to be inserted.
     * @return items
    **/
    @JsonProperty("items")
    public List<Object> getItems() {
        return items;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InsertMultipleItemsOperation interfacesAlexaPresentationAplListoperationsInsertMultipleItemsOperation = (InsertMultipleItemsOperation) o;
        return Objects.equals(this.items, interfacesAlexaPresentationAplListoperationsInsertMultipleItemsOperation.items) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InsertMultipleItemsOperation {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
        private Integer index;
        private List<Object> items;

        private Builder() {}

        @JsonProperty("index")

        public Builder withIndex(Integer index) {
            this.index = index;
            return this;
        }


        @JsonProperty("items")

        public Builder withItems(List<Object> items) {
            this.items = items;
            return this;
        }

        public Builder addItemsItem(Object itemsItem) {
            if (this.items == null) {
                this.items = new ArrayList<Object>();
            }
            this.items.add(itemsItem);
            return this;
        }

        public InsertMultipleItemsOperation build() {
            return new InsertMultipleItemsOperation(this);
        }
    }
}

