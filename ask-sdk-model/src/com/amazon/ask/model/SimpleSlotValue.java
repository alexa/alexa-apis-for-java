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
 * Slot value containing a single string value and resolutions.
 */

@JsonDeserialize(builder = SimpleSlotValue.Builder.class)
public final class SimpleSlotValue extends com.amazon.ask.model.SlotValue  {

    @JsonProperty("value")
    private String value = null;

    @JsonProperty("resolutions")
    private com.amazon.ask.model.slu.entityresolution.Resolutions resolutions = null;

    public static Builder builder() {
        return new Builder();
    }

    private SimpleSlotValue(Builder builder) {
        String discriminatorValue = "Simple";

        this.type = discriminatorValue;
        if (builder.value != null) {
            this.value = builder.value;
        }
        if (builder.resolutions != null) {
            this.resolutions = builder.resolutions;
        }
    }

    /**
     * A string that represents the value the user spoke for the slot. This is the actual value the user spoke, not necessarily the canonical value or one of the synonyms defined for the entity. Note that AMAZON.LITERAL slot values sent to your service are always in all lower case.
     * @return value
    **/
    @JsonProperty("value")
    public String getValue() {
        return value;
    }


    /**
     * Contains the results of entity resolution. These are organized by authority. An authority represents the source for the data provided for the slot. For a custom slot type, the authority is the slot type you defined.
     * @return resolutions
    **/
    @JsonProperty("resolutions")
    public com.amazon.ask.model.slu.entityresolution.Resolutions getResolutions() {
        return resolutions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimpleSlotValue simpleSlotValue = (SimpleSlotValue) o;
        return Objects.equals(this.value, simpleSlotValue.value) &&
            Objects.equals(this.resolutions, simpleSlotValue.resolutions) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, resolutions, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleSlotValue {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    resolutions: ").append(toIndentedString(resolutions)).append("\n");
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
        private String value;
        private com.amazon.ask.model.slu.entityresolution.Resolutions resolutions;

        private Builder() {}

        @JsonProperty("value")

        public Builder withValue(String value) {
            this.value = value;
            return this;
        }


        @JsonProperty("resolutions")

        public Builder withResolutions(com.amazon.ask.model.slu.entityresolution.Resolutions resolutions) {
            this.resolutions = resolutions;
            return this;
        }


        public SimpleSlotValue build() {
            return new SimpleSlotValue(this);
        }
    }
}

