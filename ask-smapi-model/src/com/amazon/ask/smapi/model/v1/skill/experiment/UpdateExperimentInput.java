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
 * Defines the Experiment body used for requesting an experiment update. Only includes fields that are editable by the user. 
 */

@JsonDeserialize(builder = UpdateExperimentInput.Builder.class)
public final class UpdateExperimentInput {

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("plannedDuration")
    private String plannedDuration = null;

    @JsonProperty("exposurePercentage")
    private Integer exposurePercentage = null;

    @JsonProperty("metricConfigurations")
    private List<com.amazon.ask.smapi.model.v1.skill.experiment.MetricConfiguration> metricConfigurations = new ArrayList<com.amazon.ask.smapi.model.v1.skill.experiment.MetricConfiguration>();

    public static Builder builder() {
        return new Builder();
    }

    private UpdateExperimentInput(Builder builder) {
        if (builder.description != null) {
            this.description = builder.description;
        }
        if (builder.plannedDuration != null) {
            this.plannedDuration = builder.plannedDuration;
        }
        if (builder.exposurePercentage != null) {
            this.exposurePercentage = builder.exposurePercentage;
        }
        if (builder.metricConfigurations != null) {
            this.metricConfigurations = builder.metricConfigurations;
        }
    }

    /**
     * Hypothesis that developer provides to describe the experiment's purpose.
     * @return description
    **/
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }


    /**
     * The number of weeks the skill builder intends to run the experiment. Used for documentation purposes and by metric platform as a reference. Does not impact experiment execution. Format uses ISO-8601 representation of duration. (Example: 4 weeks = \"P4W\") 
     * @return plannedDuration
    **/
    @JsonProperty("plannedDuration")
    public String getPlannedDuration() {
        return plannedDuration;
    }


    /**
     * The percentage of unique customers that will be part of the skill experiment while the experiment is running.
     * minimum: 0
     * maximum: 100
     * @return exposurePercentage
    **/
    @JsonProperty("exposurePercentage")
    public Integer getExposurePercentage() {
        return exposurePercentage;
    }


    /**
     * List of metric configurations that determine which metrics are key/guardrail metrics and the expected metric direction.
     * @return metricConfigurations
    **/
    @JsonProperty("metricConfigurations")
    public List<com.amazon.ask.smapi.model.v1.skill.experiment.MetricConfiguration> getMetricConfigurations() {
        return metricConfigurations;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateExperimentInput v1SkillExperimentUpdateExperimentInput = (UpdateExperimentInput) o;
        return Objects.equals(this.description, v1SkillExperimentUpdateExperimentInput.description) &&
            Objects.equals(this.plannedDuration, v1SkillExperimentUpdateExperimentInput.plannedDuration) &&
            Objects.equals(this.exposurePercentage, v1SkillExperimentUpdateExperimentInput.exposurePercentage) &&
            Objects.equals(this.metricConfigurations, v1SkillExperimentUpdateExperimentInput.metricConfigurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, plannedDuration, exposurePercentage, metricConfigurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateExperimentInput {\n");
        
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    plannedDuration: ").append(toIndentedString(plannedDuration)).append("\n");
        sb.append("    exposurePercentage: ").append(toIndentedString(exposurePercentage)).append("\n");
        sb.append("    metricConfigurations: ").append(toIndentedString(metricConfigurations)).append("\n");
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
        private String description;
        private String plannedDuration;
        private Integer exposurePercentage;
        private List<com.amazon.ask.smapi.model.v1.skill.experiment.MetricConfiguration> metricConfigurations;

        private Builder() {}

        @JsonProperty("description")

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        @JsonProperty("plannedDuration")

        public Builder withPlannedDuration(String plannedDuration) {
            this.plannedDuration = plannedDuration;
            return this;
        }


        @JsonProperty("exposurePercentage")

        public Builder withExposurePercentage(Integer exposurePercentage) {
            this.exposurePercentage = exposurePercentage;
            return this;
        }


        @JsonProperty("metricConfigurations")

        public Builder withMetricConfigurations(List<com.amazon.ask.smapi.model.v1.skill.experiment.MetricConfiguration> metricConfigurations) {
            this.metricConfigurations = metricConfigurations;
            return this;
        }

        public Builder addMetricConfigurationsItem(com.amazon.ask.smapi.model.v1.skill.experiment.MetricConfiguration metricConfigurationsItem) {
            if (this.metricConfigurations == null) {
                this.metricConfigurations = new ArrayList<com.amazon.ask.smapi.model.v1.skill.experiment.MetricConfiguration>();
            }
            this.metricConfigurations.add(metricConfigurationsItem);
            return this;
        }

        public UpdateExperimentInput build() {
            return new UpdateExperimentInput(this);
        }
    }
}

