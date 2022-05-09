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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EvaluateSHCapabilityRequest
 */

@JsonDeserialize(builder = EvaluateSHCapabilityRequest.Builder.class)
public final class EvaluateSHCapabilityRequest {

    @JsonProperty("capabilityTestPlan")
    private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.CapabilityTestPlan capabilityTestPlan = null;

    @JsonProperty("endpoint")
    private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.Endpoint endpoint = null;

    @JsonProperty("stage")
    private String stage = null;

    public static Builder builder() {
        return new Builder();
    }

    private EvaluateSHCapabilityRequest(Builder builder) {
        if (builder.capabilityTestPlan != null) {
            this.capabilityTestPlan = builder.capabilityTestPlan;
        }
        if (builder.endpoint != null) {
            this.endpoint = builder.endpoint;
        }
        if (builder.stage != null) {
            this.stage = builder.stage;
        }
    }

    /**
     * Get capabilityTestPlan
     * @return capabilityTestPlan
    **/
    @JsonProperty("capabilityTestPlan")
    public com.amazon.ask.smapi.model.v1.smartHomeEvaluation.CapabilityTestPlan getCapabilityTestPlan() {
        return capabilityTestPlan;
    }


    /**
     * Get endpoint
     * @return endpoint
    **/
    @JsonProperty("endpoint")
    public com.amazon.ask.smapi.model.v1.smartHomeEvaluation.Endpoint getEndpoint() {
        return endpoint;
    }


    /**
     * Get stage
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStageAsString().
     *
     * @return stage
    **/
    
    public com.amazon.ask.smapi.model.v1.smartHomeEvaluation.Stage getStage() {
        return com.amazon.ask.smapi.model.v1.smartHomeEvaluation.Stage.fromValue(stage);
    }

    /**
     * Get the underlying String value for stage.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return stage as a String value
    **/
    @JsonProperty("stage")
    public String getStageAsString() {
      return stage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EvaluateSHCapabilityRequest v1SmartHomeEvaluationEvaluateSHCapabilityRequest = (EvaluateSHCapabilityRequest) o;
        return Objects.equals(this.capabilityTestPlan, v1SmartHomeEvaluationEvaluateSHCapabilityRequest.capabilityTestPlan) &&
            Objects.equals(this.endpoint, v1SmartHomeEvaluationEvaluateSHCapabilityRequest.endpoint) &&
            Objects.equals(this.stage, v1SmartHomeEvaluationEvaluateSHCapabilityRequest.stage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capabilityTestPlan, endpoint, stage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluateSHCapabilityRequest {\n");
        
        sb.append("    capabilityTestPlan: ").append(toIndentedString(capabilityTestPlan)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.CapabilityTestPlan capabilityTestPlan;
        private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.Endpoint endpoint;
        private String stage;

        private Builder() {}

        @JsonProperty("capabilityTestPlan")

        public Builder withCapabilityTestPlan(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.CapabilityTestPlan capabilityTestPlan) {
            this.capabilityTestPlan = capabilityTestPlan;
            return this;
        }


        @JsonProperty("endpoint")

        public Builder withEndpoint(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.Endpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }


        @JsonProperty("stage")

        public Builder withStage(String stage) {
          this.stage = stage;
          return this;
        }

        public Builder withStage(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.Stage stage) {
            this.stage = stage != null ? stage.toString() : null;
            return this;
        }


        public EvaluateSHCapabilityRequest build() {
            return new EvaluateSHCapabilityRequest(this);
        }
    }
}

