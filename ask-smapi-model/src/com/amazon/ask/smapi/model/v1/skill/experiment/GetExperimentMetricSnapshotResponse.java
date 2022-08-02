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


package com.amazon.ask.smapi.model.v1.skill.experiment;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Defines the response body for retrieving the experiment results.
 */

@JsonDeserialize(builder = GetExperimentMetricSnapshotResponse.Builder.class)
public final class GetExperimentMetricSnapshotResponse {

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("statusReason")
    private String statusReason = null;

    @JsonProperty("metrics")
    private List<com.amazon.ask.smapi.model.v1.skill.experiment.Metric> metrics = new ArrayList<com.amazon.ask.smapi.model.v1.skill.experiment.Metric>();

    private GetExperimentMetricSnapshotResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private GetExperimentMetricSnapshotResponse(Builder builder) {
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.statusReason != null) {
            this.statusReason = builder.statusReason;
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
    
    public com.amazon.ask.smapi.model.v1.skill.experiment.MetricSnapshotStatus getStatus() {
        return com.amazon.ask.smapi.model.v1.skill.experiment.MetricSnapshotStatus.fromValue(status);
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
     * The reason why the metric snapshot status is unreliable. 
     * @return statusReason
    **/
    @JsonProperty("statusReason")
    public String getStatusReason() {
        return statusReason;
    }


    /**
     * List of actual experiment metrics represented by a metric snapshot.
     * @return metrics
    **/
    @JsonProperty("metrics")
    public List<com.amazon.ask.smapi.model.v1.skill.experiment.Metric> getMetrics() {
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
        GetExperimentMetricSnapshotResponse v1SkillExperimentGetExperimentMetricSnapshotResponse = (GetExperimentMetricSnapshotResponse) o;
        return Objects.equals(this.status, v1SkillExperimentGetExperimentMetricSnapshotResponse.status) &&
            Objects.equals(this.statusReason, v1SkillExperimentGetExperimentMetricSnapshotResponse.statusReason) &&
            Objects.equals(this.metrics, v1SkillExperimentGetExperimentMetricSnapshotResponse.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, statusReason, metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetExperimentMetricSnapshotResponse {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
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
        private String statusReason;
        private List<com.amazon.ask.smapi.model.v1.skill.experiment.Metric> metrics;

        private Builder() {}

        @JsonProperty("status")

        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.experiment.MetricSnapshotStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("statusReason")

        public Builder withStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }


        @JsonProperty("metrics")

        public Builder withMetrics(List<com.amazon.ask.smapi.model.v1.skill.experiment.Metric> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder addMetricsItem(com.amazon.ask.smapi.model.v1.skill.experiment.Metric metricsItem) {
            if (this.metrics == null) {
                this.metrics = new ArrayList<com.amazon.ask.smapi.model.v1.skill.experiment.Metric>();
            }
            this.metrics.add(metricsItem);
            return this;
        }

        public GetExperimentMetricSnapshotResponse build() {
            return new GetExperimentMetricSnapshotResponse(this);
        }
    }
}

