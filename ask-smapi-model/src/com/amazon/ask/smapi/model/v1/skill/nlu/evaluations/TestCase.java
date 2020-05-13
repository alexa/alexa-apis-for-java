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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * TestCase
 */

@JsonDeserialize(builder = TestCase.Builder.class)
public final class TestCase {

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("inputs")
    private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Inputs inputs = null;

    @JsonProperty("actual")
    private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Actual actual = null;

    @JsonProperty("expected")
    private List<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Expected> expected = new ArrayList<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Expected>();

    public static Builder builder() {
        return new Builder();
    }

    private TestCase(Builder builder) {
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.inputs != null) {
            this.inputs = builder.inputs;
        }
        if (builder.actual != null) {
            this.actual = builder.actual;
        }
        if (builder.expected != null) {
            this.expected = builder.expected;
        }
    }

    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResultsStatus getStatus() {
        return com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResultsStatus.fromValue(status);
    }

    /**
     * Get the underlying String value for status.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return status as a String value
    **/
    @JsonProperty("status")
    public String getStatusAsString() {
      return status;
    }

    /**
     * Get inputs
     * @return inputs
    **/
    @JsonProperty("inputs")
    public com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Inputs getInputs() {
        return inputs;
    }


    /**
     * Get actual
     * @return actual
    **/
    @JsonProperty("actual")
    public com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Actual getActual() {
        return actual;
    }


    /**
     * Get expected
     * @return expected
    **/
    @JsonProperty("expected")
    public List<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Expected> getExpected() {
        return expected;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TestCase v1SkillNluEvaluationsTestCase = (TestCase) o;
        return Objects.equals(this.status, v1SkillNluEvaluationsTestCase.status) &&
            Objects.equals(this.inputs, v1SkillNluEvaluationsTestCase.inputs) &&
            Objects.equals(this.actual, v1SkillNluEvaluationsTestCase.actual) &&
            Objects.equals(this.expected, v1SkillNluEvaluationsTestCase.expected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, inputs, actual, expected);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestCase {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    actual: ").append(toIndentedString(actual)).append("\n");
        sb.append("    expected: ").append(toIndentedString(expected)).append("\n");
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
        private String status;
        private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Inputs inputs;
        private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Actual actual;
        private List<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Expected> expected;

        private Builder() {}

        @JsonProperty("status")
        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResultsStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("inputs")

        public Builder withInputs(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Inputs inputs) {
            this.inputs = inputs;
            return this;
        }


        @JsonProperty("actual")

        public Builder withActual(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Actual actual) {
            this.actual = actual;
            return this;
        }


        @JsonProperty("expected")

        public Builder withExpected(List<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Expected> expected) {
            this.expected = expected;
            return this;
        }

        public Builder addExpectedItem(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Expected expectedItem) {
            if (this.expected == null) {
                this.expected = new ArrayList<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Expected>();
            }
            this.expected.add(expectedItem);
            return this;
        }

        public TestCase build() {
            return new TestCase(this);
        }
    }
}

