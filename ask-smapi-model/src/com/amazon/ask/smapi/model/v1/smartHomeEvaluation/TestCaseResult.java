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


package com.amazon.ask.smapi.model.v1.smartHomeEvaluation;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * TestCaseResult
 */

@JsonDeserialize(builder = TestCaseResult.Builder.class)
public final class TestCaseResult {

    @JsonProperty("actualCapabilityStates")
    private List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityState> actualCapabilityStates = new ArrayList<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityState>();

    @JsonProperty("actualResponse")
    private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityResponse actualResponse = null;

    @JsonProperty("directive")
    private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityDirective directive = null;

    @JsonProperty("error")
    private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityError error = null;

    @JsonProperty("expectedCapabilityStates")
    private List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityState> expectedCapabilityStates = new ArrayList<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityState>();

    @JsonProperty("expectedResponse")
    private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityResponse expectedResponse = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("status")
    private String status = null;

    public static Builder builder() {
        return new Builder();
    }

    private TestCaseResult(Builder builder) {
        if (builder.actualCapabilityStates != null) {
            this.actualCapabilityStates = builder.actualCapabilityStates;
        }
        if (builder.actualResponse != null) {
            this.actualResponse = builder.actualResponse;
        }
        if (builder.directive != null) {
            this.directive = builder.directive;
        }
        if (builder.error != null) {
            this.error = builder.error;
        }
        if (builder.expectedCapabilityStates != null) {
            this.expectedCapabilityStates = builder.expectedCapabilityStates;
        }
        if (builder.expectedResponse != null) {
            this.expectedResponse = builder.expectedResponse;
        }
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
    }

    /**
     * Get actualCapabilityStates
     * @return actualCapabilityStates
    **/
    @JsonProperty("actualCapabilityStates")
    public List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityState> getActualCapabilityStates() {
        return actualCapabilityStates;
    }


    /**
     * Get actualResponse
     * @return actualResponse
    **/
    @JsonProperty("actualResponse")
    public com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityResponse getActualResponse() {
        return actualResponse;
    }


    /**
     * Get directive
     * @return directive
    **/
    @JsonProperty("directive")
    public com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityDirective getDirective() {
        return directive;
    }


    /**
     * Get error
     * @return error
    **/
    @JsonProperty("error")
    public com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityError getError() {
        return error;
    }


    /**
     * Get expectedCapabilityStates
     * @return expectedCapabilityStates
    **/
    @JsonProperty("expectedCapabilityStates")
    public List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityState> getExpectedCapabilityStates() {
        return expectedCapabilityStates;
    }


    /**
     * Get expectedResponse
     * @return expectedResponse
    **/
    @JsonProperty("expectedResponse")
    public com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityResponse getExpectedResponse() {
        return expectedResponse;
    }


    /**
     * Get name
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v1.smartHomeEvaluation.TestCaseResultStatus getStatus() {
        return com.amazon.ask.smapi.model.v1.smartHomeEvaluation.TestCaseResultStatus.fromValue(status);
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TestCaseResult v1SmartHomeEvaluationTestCaseResult = (TestCaseResult) o;
        return Objects.equals(this.actualCapabilityStates, v1SmartHomeEvaluationTestCaseResult.actualCapabilityStates) &&
            Objects.equals(this.actualResponse, v1SmartHomeEvaluationTestCaseResult.actualResponse) &&
            Objects.equals(this.directive, v1SmartHomeEvaluationTestCaseResult.directive) &&
            Objects.equals(this.error, v1SmartHomeEvaluationTestCaseResult.error) &&
            Objects.equals(this.expectedCapabilityStates, v1SmartHomeEvaluationTestCaseResult.expectedCapabilityStates) &&
            Objects.equals(this.expectedResponse, v1SmartHomeEvaluationTestCaseResult.expectedResponse) &&
            Objects.equals(this.name, v1SmartHomeEvaluationTestCaseResult.name) &&
            Objects.equals(this.status, v1SmartHomeEvaluationTestCaseResult.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actualCapabilityStates, actualResponse, directive, error, expectedCapabilityStates, expectedResponse, name, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestCaseResult {\n");
        
        sb.append("    actualCapabilityStates: ").append(toIndentedString(actualCapabilityStates)).append("\n");
        sb.append("    actualResponse: ").append(toIndentedString(actualResponse)).append("\n");
        sb.append("    directive: ").append(toIndentedString(directive)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    expectedCapabilityStates: ").append(toIndentedString(expectedCapabilityStates)).append("\n");
        sb.append("    expectedResponse: ").append(toIndentedString(expectedResponse)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityState> actualCapabilityStates;
        private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityResponse actualResponse;
        private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityDirective directive;
        private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityError error;
        private List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityState> expectedCapabilityStates;
        private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityResponse expectedResponse;
        private String name;
        private String status;

        private Builder() {}

        @JsonProperty("actualCapabilityStates")

        public Builder withActualCapabilityStates(List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityState> actualCapabilityStates) {
            this.actualCapabilityStates = actualCapabilityStates;
            return this;
        }

        public Builder addActualCapabilityStatesItem(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityState actualCapabilityStatesItem) {
            if (this.actualCapabilityStates == null) {
                this.actualCapabilityStates = new ArrayList<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityState>();
            }
            this.actualCapabilityStates.add(actualCapabilityStatesItem);
            return this;
        }

        @JsonProperty("actualResponse")

        public Builder withActualResponse(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityResponse actualResponse) {
            this.actualResponse = actualResponse;
            return this;
        }


        @JsonProperty("directive")

        public Builder withDirective(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityDirective directive) {
            this.directive = directive;
            return this;
        }


        @JsonProperty("error")

        public Builder withError(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityError error) {
            this.error = error;
            return this;
        }


        @JsonProperty("expectedCapabilityStates")

        public Builder withExpectedCapabilityStates(List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityState> expectedCapabilityStates) {
            this.expectedCapabilityStates = expectedCapabilityStates;
            return this;
        }

        public Builder addExpectedCapabilityStatesItem(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityState expectedCapabilityStatesItem) {
            if (this.expectedCapabilityStates == null) {
                this.expectedCapabilityStates = new ArrayList<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityState>();
            }
            this.expectedCapabilityStates.add(expectedCapabilityStatesItem);
            return this;
        }

        @JsonProperty("expectedResponse")

        public Builder withExpectedResponse(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityResponse expectedResponse) {
            this.expectedResponse = expectedResponse;
            return this;
        }


        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("status")

        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.TestCaseResultStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        public TestCaseResult build() {
            return new TestCaseResult(this);
        }
    }
}

