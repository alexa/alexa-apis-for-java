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


package com.amazon.ask.smapi.model.v1.skill.nlu.evaluations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExpectedIntentSlotsProps
 */

@JsonDeserialize(builder = ExpectedIntentSlotsProps.Builder.class)
public final class ExpectedIntentSlotsProps {

    @JsonProperty("value")
    private String value = null;

    public static Builder builder() {
        return new Builder();
    }

    private ExpectedIntentSlotsProps(Builder builder) {
        if (builder.value != null) {
            this.value = builder.value;
        }
    }

    /**
     * Get value
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
        ExpectedIntentSlotsProps v1SkillNluEvaluationsExpectedIntentSlotsProps = (ExpectedIntentSlotsProps) o;
        return Objects.equals(this.value, v1SkillNluEvaluationsExpectedIntentSlotsProps.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpectedIntentSlotsProps {\n");
        
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
        private String value;

        private Builder() {}

        @JsonProperty("value")

        public Builder withValue(String value) {
            this.value = value;
            return this;
        }


        public ExpectedIntentSlotsProps build() {
            return new ExpectedIntentSlotsProps(this);
        }
    }
}

