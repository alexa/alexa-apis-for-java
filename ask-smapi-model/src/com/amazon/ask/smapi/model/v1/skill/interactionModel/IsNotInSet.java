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
 * Validates if the slot is not in the specified set of values.
 */

@JsonDeserialize(builder = IsNotInSet.Builder.class)
public final class IsNotInSet extends com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotValidation  {

    @JsonProperty("values")
    private List<String> values = new ArrayList<String>();

    public static Builder builder() {
        return new Builder();
    }

    private IsNotInSet(Builder builder) {
        String discriminatorValue = "IsNotInSet";

        this.type = discriminatorValue;
        if (builder.prompt != null) {
            this.prompt = builder.prompt;
        }
        if (builder.values != null) {
            this.values = builder.values;
        }
    }

    /**
     * List of values to check.
     * @return values
    **/
    @JsonProperty("values")
    public List<String> getValues() {
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
        IsNotInSet v1SkillInteractionModelIsNotInSet = (IsNotInSet) o;
        return Objects.equals(this.values, v1SkillInteractionModelIsNotInSet.values) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IsNotInSet {\n");
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
        private String prompt;
        private List<String> values;

        private Builder() {}

        @JsonProperty("prompt")
        public Builder withPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }


        @JsonProperty("values")
        public Builder withValues(List<String> values) {
            this.values = values;
            return this;
        }

        public Builder addValuesItem(String valuesItem) {
            if (this.values == null) {
                this.values = new ArrayList<String>();
            }
            this.values.add(valuesItem);
            return this;
        }

        public IsNotInSet build() {
            return new IsNotInSet(this);
        }
    }
}

