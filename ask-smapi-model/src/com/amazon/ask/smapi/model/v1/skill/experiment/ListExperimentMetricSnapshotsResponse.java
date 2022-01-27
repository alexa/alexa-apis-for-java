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
 * Defines the response body for retrieving the experiment metric snapshots.
 */

@JsonDeserialize(builder = ListExperimentMetricSnapshotsResponse.Builder.class)
public final class ListExperimentMetricSnapshotsResponse {

    @JsonProperty("paginationContext")
    private com.amazon.ask.smapi.model.v1.skill.experiment.PaginationContext paginationContext = null;

    @JsonProperty("metricSnapshots")
    private List<com.amazon.ask.smapi.model.v1.skill.experiment.MetricSnapshot> metricSnapshots = new ArrayList<com.amazon.ask.smapi.model.v1.skill.experiment.MetricSnapshot>();

    public static Builder builder() {
        return new Builder();
    }

    private ListExperimentMetricSnapshotsResponse(Builder builder) {
        if (builder.paginationContext != null) {
            this.paginationContext = builder.paginationContext;
        }
        if (builder.metricSnapshots != null) {
            this.metricSnapshots = builder.metricSnapshots;
        }
    }

    /**
     * Get paginationContext
     * @return paginationContext
    **/
    @JsonProperty("paginationContext")
    public com.amazon.ask.smapi.model.v1.skill.experiment.PaginationContext getPaginationContext() {
        return paginationContext;
    }


    /**
     * List of experiment metric snapshots.
     * @return metricSnapshots
    **/
    @JsonProperty("metricSnapshots")
    public List<com.amazon.ask.smapi.model.v1.skill.experiment.MetricSnapshot> getMetricSnapshots() {
        return metricSnapshots;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListExperimentMetricSnapshotsResponse v1SkillExperimentListExperimentMetricSnapshotsResponse = (ListExperimentMetricSnapshotsResponse) o;
        return Objects.equals(this.paginationContext, v1SkillExperimentListExperimentMetricSnapshotsResponse.paginationContext) &&
            Objects.equals(this.metricSnapshots, v1SkillExperimentListExperimentMetricSnapshotsResponse.metricSnapshots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paginationContext, metricSnapshots);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExperimentMetricSnapshotsResponse {\n");
        
        sb.append("    paginationContext: ").append(toIndentedString(paginationContext)).append("\n");
        sb.append("    metricSnapshots: ").append(toIndentedString(metricSnapshots)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.experiment.PaginationContext paginationContext;
        private List<com.amazon.ask.smapi.model.v1.skill.experiment.MetricSnapshot> metricSnapshots;

        private Builder() {}

        @JsonProperty("paginationContext")

        public Builder withPaginationContext(com.amazon.ask.smapi.model.v1.skill.experiment.PaginationContext paginationContext) {
            this.paginationContext = paginationContext;
            return this;
        }


        @JsonProperty("metricSnapshots")

        public Builder withMetricSnapshots(List<com.amazon.ask.smapi.model.v1.skill.experiment.MetricSnapshot> metricSnapshots) {
            this.metricSnapshots = metricSnapshots;
            return this;
        }

        public Builder addMetricSnapshotsItem(com.amazon.ask.smapi.model.v1.skill.experiment.MetricSnapshot metricSnapshotsItem) {
            if (this.metricSnapshots == null) {
                this.metricSnapshots = new ArrayList<com.amazon.ask.smapi.model.v1.skill.experiment.MetricSnapshot>();
            }
            this.metricSnapshots.add(metricSnapshotsItem);
            return this;
        }

        public ListExperimentMetricSnapshotsResponse build() {
            return new ListExperimentMetricSnapshotsResponse(this);
        }
    }
}

