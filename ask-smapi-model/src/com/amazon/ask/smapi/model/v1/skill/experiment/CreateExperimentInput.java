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
 * Defines the Experiment body used for requesting an experiment creation. Only includes fields that are editable by the user. 
 */

@JsonDeserialize(builder = CreateExperimentInput.Builder.class)
public final class CreateExperimentInput {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("plannedDuration")
    private String plannedDuration = null;

    @JsonProperty("exposurePercentage")
    private Integer exposurePercentage = null;

    @JsonProperty("metricConfigurations")
    private List<com.amazon.ask.smapi.model.v1.skill.experiment.MetricConfiguration> metricConfigurations = new ArrayList<com.amazon.ask.smapi.model.v1.skill.experiment.MetricConfiguration>();

    public static Builder builder() {
        return new Builder();
    }

    private CreateExperimentInput(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
        if (builder.type != null) {
            this.type = builder.type;
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
     * Name that developer assigns to the experiment for easier identification.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
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
     * Get type
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getTypeAsString().
     *
     * @return type
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentType getType() {
        return com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentType.fromValue(type);
    }

    /**
     * Get the underlying String value for type.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return type as a String value
    **/
    @JsonProperty("type")
    public String getTypeAsString() {
      return type;
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
        CreateExperimentInput v1SkillExperimentCreateExperimentInput = (CreateExperimentInput) o;
        return Objects.equals(this.name, v1SkillExperimentCreateExperimentInput.name) &&
            Objects.equals(this.description, v1SkillExperimentCreateExperimentInput.description) &&
            Objects.equals(this.type, v1SkillExperimentCreateExperimentInput.type) &&
            Objects.equals(this.plannedDuration, v1SkillExperimentCreateExperimentInput.plannedDuration) &&
            Objects.equals(this.exposurePercentage, v1SkillExperimentCreateExperimentInput.exposurePercentage) &&
            Objects.equals(this.metricConfigurations, v1SkillExperimentCreateExperimentInput.metricConfigurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, type, plannedDuration, exposurePercentage, metricConfigurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExperimentInput {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
        private String name;
        private String description;
        private String type;
        private String plannedDuration;
        private Integer exposurePercentage;
        private List<com.amazon.ask.smapi.model.v1.skill.experiment.MetricConfiguration> metricConfigurations;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("description")

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        @JsonProperty("type")

        public Builder withType(String type) {
          this.type = type;
          return this;
        }

        public Builder withType(com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentType type) {
            this.type = type != null ? type.toString() : null;
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

        public CreateExperimentInput build() {
            return new CreateExperimentInput(this);
        }
    }
}

