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
 * Defines the response body for retrieving all the experiments of a skill.
 */

@JsonDeserialize(builder = ListExperimentsResponse.Builder.class)
public final class ListExperimentsResponse {

    @JsonProperty("paginationContext")
    private com.amazon.ask.smapi.model.v1.skill.experiment.PaginationContext paginationContext = null;

    @JsonProperty("experiments")
    private List<com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentSummary> experiments = new ArrayList<com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentSummary>();

    private ListExperimentsResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ListExperimentsResponse(Builder builder) {
        if (builder.paginationContext != null) {
            this.paginationContext = builder.paginationContext;
        }
        if (builder.experiments != null) {
            this.experiments = builder.experiments;
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
     * List of experiments with select fields returned.
     * @return experiments
    **/
    @JsonProperty("experiments")
    public List<com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentSummary> getExperiments() {
        return experiments;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListExperimentsResponse v1SkillExperimentListExperimentsResponse = (ListExperimentsResponse) o;
        return Objects.equals(this.paginationContext, v1SkillExperimentListExperimentsResponse.paginationContext) &&
            Objects.equals(this.experiments, v1SkillExperimentListExperimentsResponse.experiments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paginationContext, experiments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExperimentsResponse {\n");
        
        sb.append("    paginationContext: ").append(toIndentedString(paginationContext)).append("\n");
        sb.append("    experiments: ").append(toIndentedString(experiments)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentSummary> experiments;

        private Builder() {}

        @JsonProperty("paginationContext")

        public Builder withPaginationContext(com.amazon.ask.smapi.model.v1.skill.experiment.PaginationContext paginationContext) {
            this.paginationContext = paginationContext;
            return this;
        }


        @JsonProperty("experiments")

        public Builder withExperiments(List<com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentSummary> experiments) {
            this.experiments = experiments;
            return this;
        }

        public Builder addExperimentsItem(com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentSummary experimentsItem) {
            if (this.experiments == null) {
                this.experiments = new ArrayList<com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentSummary>();
            }
            this.experiments.add(experimentsItem);
            return this;
        }

        public ListExperimentsResponse build() {
            return new ListExperimentsResponse(this);
        }
    }
}

