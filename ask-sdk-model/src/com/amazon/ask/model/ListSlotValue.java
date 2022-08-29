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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Slot value containing a list of other slot value objects.
 */

@JsonDeserialize(builder = ListSlotValue.Builder.class)
public final class ListSlotValue extends com.amazon.ask.model.SlotValue  {

    @JsonProperty("values")
    private List<com.amazon.ask.model.SlotValue> values = new ArrayList<com.amazon.ask.model.SlotValue>();

    private ListSlotValue() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ListSlotValue(Builder builder) {
        String discriminatorValue = "List";

        this.type = discriminatorValue;
        if (builder.values != null) {
            this.values = builder.values;
        }
    }

    /**
     * An array containing the values captured for this slot.
     * @return values
    **/
    @JsonProperty("values")
    public List<com.amazon.ask.model.SlotValue> getValues() {
        return values;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSlotValue listSlotValue = (ListSlotValue) o;
        return Objects.equals(this.values, listSlotValue.values) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSlotValue {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
        private List<com.amazon.ask.model.SlotValue> values;

        private Builder() {}

        @JsonProperty("values")

        public Builder withValues(List<com.amazon.ask.model.SlotValue> values) {
            this.values = values;
            return this;
        }

        public Builder addValuesItem(com.amazon.ask.model.SlotValue valuesItem) {
            if (this.values == null) {
                this.values = new ArrayList<com.amazon.ask.model.SlotValue>();
            }
            this.values.add(valuesItem);
            return this;
        }

        public ListSlotValue build() {
            return new ListSlotValue(this);
        }
    }
}

