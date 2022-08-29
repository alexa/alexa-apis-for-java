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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sets an item at a specified index in a dynamicIndexList.
 */

@JsonDeserialize(builder = SetItemOperation.Builder.class)
public final class SetItemOperation extends com.amazon.ask.model.interfaces.alexa.presentation.apl.listoperations.Operation  {

    @JsonProperty("item")
    private Object item = null;

    private SetItemOperation() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SetItemOperation(Builder builder) {
        String discriminatorValue = "SetItem";

        this.type = discriminatorValue;
        if (builder.index != null) {
            this.index = builder.index;
        }
        if (builder.item != null) {
            this.item = builder.item;
        }
    }

    /**
     * The replacement item.
     * @return item
    **/
    @JsonProperty("item")
    public Object getItem() {
        return item;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetItemOperation interfacesAlexaPresentationAplListoperationsSetItemOperation = (SetItemOperation) o;
        return Objects.equals(this.item, interfacesAlexaPresentationAplListoperationsSetItemOperation.item) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetItemOperation {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
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
        private Object item;

        private Builder() {}

        @JsonProperty("index")

        public Builder withIndex(Integer index) {
            this.index = index;
            return this;
        }


        @JsonProperty("item")

        public Builder withItem(Object item) {
            this.item = item;
            return this;
        }


        public SetItemOperation build() {
            return new SetItemOperation(this);
        }
    }
}

