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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Validates that slot value is greater than or equals to the specified value.
 */

@JsonDeserialize(builder = IsGreaterThanOrEqualTo.Builder.class)
public final class IsGreaterThanOrEqualTo extends com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotValidation  {

    @JsonProperty("value")
    private String value = null;

    private IsGreaterThanOrEqualTo() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private IsGreaterThanOrEqualTo(Builder builder) {
        String discriminatorValue = "isGreaterThanOrEqualTo";

        this.type = discriminatorValue;
        if (builder.prompt != null) {
            this.prompt = builder.prompt;
        }
        if (builder.value != null) {
            this.value = builder.value;
        }
    }

    /**
     * Value to compare to.
     * @return value
    **/
    @JsonProperty("value")
    public String getValue() {
        return value;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IsGreaterThanOrEqualTo v1SkillInteractionModelIsGreaterThanOrEqualTo = (IsGreaterThanOrEqualTo) o;
        return Objects.equals(this.value, v1SkillInteractionModelIsGreaterThanOrEqualTo.value) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IsGreaterThanOrEqualTo {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
        private String value;

        private Builder() {}

        @JsonProperty("prompt")

        public Builder withPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }


        @JsonProperty("value")

        public Builder withValue(String value) {
            this.value = value;
            return this;
        }


        public IsGreaterThanOrEqualTo build() {
            return new IsGreaterThanOrEqualTo(this);
        }
    }
}

