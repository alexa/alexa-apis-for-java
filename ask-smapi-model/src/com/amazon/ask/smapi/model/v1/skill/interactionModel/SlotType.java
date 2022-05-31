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


package com.amazon.ask.smapi.model.v1.skill.interactionModel;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Custom slot type to define a list of possible values for a slot. Used for items that are not covered by Amazon&#39;s built-in slot types.
 */

@JsonDeserialize(builder = SlotType.Builder.class)
public final class SlotType {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("generatedBy")
    private String generatedBy = null;

    @JsonProperty("values")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.TypeValue> values = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.TypeValue>();

    @JsonProperty("valueSupplier")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.ValueSupplier valueSupplier = null;

    public static Builder builder() {
        return new Builder();
    }

    private SlotType(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.generatedBy != null) {
            this.generatedBy = builder.generatedBy;
        }
        if (builder.values != null) {
            this.values = builder.values;
        }
        if (builder.valueSupplier != null) {
            this.valueSupplier = builder.valueSupplier;
        }
    }

    /**
     * The name of the custom slot type.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Name of the generator used to generate this object.
     * @return generatedBy
    **/
    @JsonProperty("generatedBy")
    public String getGeneratedBy() {
        return generatedBy;
    }


    /**
     * List of expected values. Values outside the list are still returned.
     * @return values
    **/
    @JsonProperty("values")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.TypeValue> getValues() {
        return values;
    }


    /**
     * Get valueSupplier
     * @return valueSupplier
    **/
    @JsonProperty("valueSupplier")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.ValueSupplier getValueSupplier() {
        return valueSupplier;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlotType v1SkillInteractionModelSlotType = (SlotType) o;
        return Objects.equals(this.name, v1SkillInteractionModelSlotType.name) &&
            Objects.equals(this.generatedBy, v1SkillInteractionModelSlotType.generatedBy) &&
            Objects.equals(this.values, v1SkillInteractionModelSlotType.values) &&
            Objects.equals(this.valueSupplier, v1SkillInteractionModelSlotType.valueSupplier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, generatedBy, values, valueSupplier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlotType {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    generatedBy: ").append(toIndentedString(generatedBy)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    valueSupplier: ").append(toIndentedString(valueSupplier)).append("\n");
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
        private String name;
        private String generatedBy;
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.TypeValue> values;
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.ValueSupplier valueSupplier;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("generatedBy")

        public Builder withGeneratedBy(String generatedBy) {
            this.generatedBy = generatedBy;
            return this;
        }


        @JsonProperty("values")

        public Builder withValues(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.TypeValue> values) {
            this.values = values;
            return this;
        }

        public Builder addValuesItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.TypeValue valuesItem) {
            if (this.values == null) {
                this.values = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.TypeValue>();
            }
            this.values.add(valuesItem);
            return this;
        }

        @JsonProperty("valueSupplier")

        public Builder withValueSupplier(com.amazon.ask.smapi.model.v1.skill.interactionModel.ValueSupplier valueSupplier) {
            this.valueSupplier = valueSupplier;
            return this;
        }


        public SlotType build() {
            return new SlotType(this);
        }
    }
}

