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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetSHCapabilityEvaluationResponse
 */

@JsonDeserialize(builder = GetSHCapabilityEvaluationResponse.Builder.class)
public final class GetSHCapabilityEvaluationResponse {

    @JsonProperty("endTimestamp")
    private OffsetDateTime endTimestamp = null;

    @JsonProperty("startTimestamp")
    private OffsetDateTime startTimestamp = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("error")
    private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityError error = null;

    @JsonProperty("input")
    private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.EvaluateSHCapabilityRequest input = null;

    @JsonProperty("metrics")
    private Map<String, com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHEvaluationResultsMetric> metrics = new HashMap<String, com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHEvaluationResultsMetric>();

    public static Builder builder() {
        return new Builder();
    }

    private GetSHCapabilityEvaluationResponse(Builder builder) {
        if (builder.endTimestamp != null) {
            this.endTimestamp = builder.endTimestamp;
        }
        if (builder.startTimestamp != null) {
            this.startTimestamp = builder.startTimestamp;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.error != null) {
            this.error = builder.error;
        }
        if (builder.input != null) {
            this.input = builder.input;
        }
        if (builder.metrics != null) {
            this.metrics = builder.metrics;
        }
    }

    /**
     * Get endTimestamp
     * @return endTimestamp
    **/
    @JsonProperty("endTimestamp")
    public OffsetDateTime getEndTimestamp() {
        return endTimestamp;
    }


    /**
     * Get startTimestamp
     * @return startTimestamp
    **/
    @JsonProperty("startTimestamp")
    public OffsetDateTime getStartTimestamp() {
        return startTimestamp;
    }


    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v1.smartHomeEvaluation.EvaluationEntityStatus getStatus() {
        return com.amazon.ask.smapi.model.v1.smartHomeEvaluation.EvaluationEntityStatus.fromValue(status);
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
     * Get error
     * @return error
    **/
    @JsonProperty("error")
    public com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityError getError() {
        return error;
    }


    /**
     * Get input
     * @return input
    **/
    @JsonProperty("input")
    public com.amazon.ask.smapi.model.v1.smartHomeEvaluation.EvaluateSHCapabilityRequest getInput() {
        return input;
    }


    /**
     * Get metrics
     * @return metrics
    **/
    @JsonProperty("metrics")
    public Map<String, com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHEvaluationResultsMetric> getMetrics() {
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
        GetSHCapabilityEvaluationResponse v1SmartHomeEvaluationGetSHCapabilityEvaluationResponse = (GetSHCapabilityEvaluationResponse) o;
        return Objects.equals(this.endTimestamp, v1SmartHomeEvaluationGetSHCapabilityEvaluationResponse.endTimestamp) &&
            Objects.equals(this.startTimestamp, v1SmartHomeEvaluationGetSHCapabilityEvaluationResponse.startTimestamp) &&
            Objects.equals(this.status, v1SmartHomeEvaluationGetSHCapabilityEvaluationResponse.status) &&
            Objects.equals(this.error, v1SmartHomeEvaluationGetSHCapabilityEvaluationResponse.error) &&
            Objects.equals(this.input, v1SmartHomeEvaluationGetSHCapabilityEvaluationResponse.input) &&
            Objects.equals(this.metrics, v1SmartHomeEvaluationGetSHCapabilityEvaluationResponse.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endTimestamp, startTimestamp, status, error, input, metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSHCapabilityEvaluationResponse {\n");
        
        sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
        sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
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
        private OffsetDateTime endTimestamp;
        private OffsetDateTime startTimestamp;
        private String status;
        private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityError error;
        private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.EvaluateSHCapabilityRequest input;
        private Map<String, com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHEvaluationResultsMetric> metrics;

        private Builder() {}

        @JsonProperty("endTimestamp")

        public Builder withEndTimestamp(OffsetDateTime endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }


        @JsonProperty("startTimestamp")

        public Builder withStartTimestamp(OffsetDateTime startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }


        @JsonProperty("status")
        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.EvaluationEntityStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("error")

        public Builder withError(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHCapabilityError error) {
            this.error = error;
            return this;
        }


        @JsonProperty("input")

        public Builder withInput(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.EvaluateSHCapabilityRequest input) {
            this.input = input;
            return this;
        }


        @JsonProperty("metrics")

        public Builder withMetrics(Map<String, com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHEvaluationResultsMetric> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder putMetricsItem(String key, com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHEvaluationResultsMetric metricsItem) {
            if (this.metrics == null) {
                this.metrics = new HashMap<String, com.amazon.ask.smapi.model.v1.smartHomeEvaluation.SHEvaluationResultsMetric>();
            }
            this.metrics.put(key, metricsItem);
            return this;
        }

        public GetSHCapabilityEvaluationResponse build() {
            return new GetSHCapabilityEvaluationResponse(this);
        }
    }
}

