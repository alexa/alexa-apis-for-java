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


package com.amazon.ask.smapi.model.v1.skill.asr.evaluations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * indicate the result of the evaluation. This field would be present if the evaluation status is &#x60;COMPLETED&#x60;
 */

@JsonDeserialize(builder = EvaluationMetadataResult.Builder.class)
public final class EvaluationMetadataResult {

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("metrics")
    private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.Metrics metrics = null;

    public static Builder builder() {
        return new Builder();
    }

    private EvaluationMetadataResult(Builder builder) {
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.metrics != null) {
            this.metrics = builder.metrics;
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
    
    public com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationResultStatus getStatus() {
        return com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationResultStatus.fromValue(status);
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
     * Get metrics
     * @return metrics
    **/
    @JsonProperty("metrics")
    public com.amazon.ask.smapi.model.v1.skill.asr.evaluations.Metrics getMetrics() {
        return metrics;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EvaluationMetadataResult v1SkillAsrEvaluationsEvaluationMetadataResult = (EvaluationMetadataResult) o;
        return Objects.equals(this.status, v1SkillAsrEvaluationsEvaluationMetadataResult.status) &&
            Objects.equals(this.metrics, v1SkillAsrEvaluationsEvaluationMetadataResult.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationMetadataResult {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.Metrics metrics;

        private Builder() {}

        @JsonProperty("status")

        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationResultStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("metrics")

        public Builder withMetrics(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.Metrics metrics) {
            this.metrics = metrics;
            return this;
        }


        public EvaluationMetadataResult build() {
            return new EvaluationMetadataResult(this);
        }
    }
}

