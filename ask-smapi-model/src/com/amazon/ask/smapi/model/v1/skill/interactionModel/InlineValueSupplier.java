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
 * Supplies inline slot type values.
 */

@JsonDeserialize(builder = InlineValueSupplier.Builder.class)
public final class InlineValueSupplier extends com.amazon.ask.smapi.model.v1.skill.interactionModel.ValueSupplier  {

    @JsonProperty("values")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.TypeValue> values = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.TypeValue>();

    public static Builder builder() {
        return new Builder();
    }

    private InlineValueSupplier(Builder builder) {
        String discriminatorValue = "InlineValueSupplier";

        this.type = discriminatorValue;
        if (builder.values != null) {
            this.values = builder.values;
        }
    }

    /**
     * The list of slot type values.
     * @return values
    **/
    @JsonProperty("values")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.TypeValue> getValues() {
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
        InlineValueSupplier v1SkillInteractionModelInlineValueSupplier = (InlineValueSupplier) o;
        return Objects.equals(this.values, v1SkillInteractionModelInlineValueSupplier.values) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineValueSupplier {\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.TypeValue> values;

        private Builder() {}

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

        public InlineValueSupplier build() {
            return new InlineValueSupplier(this);
        }
    }
}

