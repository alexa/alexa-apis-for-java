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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the metric snapshot body with supplemental metadata properties.
 */

@JsonDeserialize(builder = MetricSnapshot.Builder.class)
public final class MetricSnapshot {

    @JsonProperty("metricSnapshotId")
    private String metricSnapshotId = null;

    @JsonProperty("startDate")
    private OffsetDateTime startDate = null;

    @JsonProperty("endDate")
    private OffsetDateTime endDate = null;

    private MetricSnapshot() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private MetricSnapshot(Builder builder) {
        if (builder.metricSnapshotId != null) {
            this.metricSnapshotId = builder.metricSnapshotId;
        }
        if (builder.startDate != null) {
            this.startDate = builder.startDate;
        }
        if (builder.endDate != null) {
            this.endDate = builder.endDate;
        }
    }

    /**
     * Identifies the experiment metric snapshot in a skill experiment.
     * @return metricSnapshotId
    **/
    @JsonProperty("metricSnapshotId")
    public String getMetricSnapshotId() {
        return metricSnapshotId;
    }


    /**
     * The start date of the metric snapshot.
     * @return startDate
    **/
    @JsonProperty("startDate")
    public OffsetDateTime getStartDate() {
        return startDate;
    }


    /**
     * The end date of the metric snapshot.
     * @return endDate
    **/
    @JsonProperty("endDate")
    public OffsetDateTime getEndDate() {
        return endDate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricSnapshot v1SkillExperimentMetricSnapshot = (MetricSnapshot) o;
        return Objects.equals(this.metricSnapshotId, v1SkillExperimentMetricSnapshot.metricSnapshotId) &&
            Objects.equals(this.startDate, v1SkillExperimentMetricSnapshot.startDate) &&
            Objects.equals(this.endDate, v1SkillExperimentMetricSnapshot.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricSnapshotId, startDate, endDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricSnapshot {\n");
        
        sb.append("    metricSnapshotId: ").append(toIndentedString(metricSnapshotId)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
        private String metricSnapshotId;
        private OffsetDateTime startDate;
        private OffsetDateTime endDate;

        private Builder() {}

        @JsonProperty("metricSnapshotId")

        public Builder withMetricSnapshotId(String metricSnapshotId) {
            this.metricSnapshotId = metricSnapshotId;
            return this;
        }


        @JsonProperty("startDate")

        public Builder withStartDate(OffsetDateTime startDate) {
            this.startDate = startDate;
            return this;
        }


        @JsonProperty("endDate")

        public Builder withEndDate(OffsetDateTime endDate) {
            this.endDate = endDate;
            return this;
        }


        public MetricSnapshot build() {
            return new MetricSnapshot(this);
        }
    }
}

