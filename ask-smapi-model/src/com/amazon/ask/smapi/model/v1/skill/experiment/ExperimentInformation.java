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
 * Defines the full Experiment body which would contain all experiment details. 
 */

@JsonDeserialize(builder = ExperimentInformation.Builder.class)
public final class ExperimentInformation {

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

    @JsonProperty("treatmentOverrideCount")
    private Integer treatmentOverrideCount = null;

    @JsonProperty("metricConfigurations")
    private List<com.amazon.ask.smapi.model.v1.skill.experiment.MetricConfiguration> metricConfigurations = new ArrayList<com.amazon.ask.smapi.model.v1.skill.experiment.MetricConfiguration>();

    @JsonProperty("state")
    private String state = null;

    @JsonProperty("history")
    private com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentHistory history = null;

    @JsonProperty("trigger")
    private com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentTrigger trigger = null;

    private ExperimentInformation() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ExperimentInformation(Builder builder) {
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
        if (builder.treatmentOverrideCount != null) {
            this.treatmentOverrideCount = builder.treatmentOverrideCount;
        }
        if (builder.metricConfigurations != null) {
            this.metricConfigurations = builder.metricConfigurations;
        }
        if (builder.state != null) {
            this.state = builder.state;
        }
        if (builder.history != null) {
            this.history = builder.history;
        }
        if (builder.trigger != null) {
            this.trigger = builder.trigger;
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
     * The number of overrides which currently exist for the experiment. 
     * @return treatmentOverrideCount
    **/
    @JsonProperty("treatmentOverrideCount")
    public Integer getTreatmentOverrideCount() {
        return treatmentOverrideCount;
    }


    /**
     * List of metric configurations that determine which metrics are key/guardrail metrics and the expected metric direction. This is required by the system that collects metrics and generates the metric reports. 
     * @return metricConfigurations
    **/
    @JsonProperty("metricConfigurations")
    public List<com.amazon.ask.smapi.model.v1.skill.experiment.MetricConfiguration> getMetricConfigurations() {
        return metricConfigurations;
    }


    /**
     * Get state
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStateAsString().
     *
     * @return state
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.experiment.State getState() {
        return com.amazon.ask.smapi.model.v1.skill.experiment.State.fromValue(state);
    }

    /**
     * Get the underlying String value for state.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return state as a String value
    **/
    @JsonProperty("state")
    public String getStateAsString() {
      return state;
    }

    /**
     * Get history
     * @return history
    **/
    @JsonProperty("history")
    public com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentHistory getHistory() {
        return history;
    }


    /**
     * Get trigger
     * @return trigger
    **/
    @JsonProperty("trigger")
    public com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentTrigger getTrigger() {
        return trigger;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExperimentInformation v1SkillExperimentExperimentInformation = (ExperimentInformation) o;
        return Objects.equals(this.name, v1SkillExperimentExperimentInformation.name) &&
            Objects.equals(this.description, v1SkillExperimentExperimentInformation.description) &&
            Objects.equals(this.type, v1SkillExperimentExperimentInformation.type) &&
            Objects.equals(this.plannedDuration, v1SkillExperimentExperimentInformation.plannedDuration) &&
            Objects.equals(this.exposurePercentage, v1SkillExperimentExperimentInformation.exposurePercentage) &&
            Objects.equals(this.treatmentOverrideCount, v1SkillExperimentExperimentInformation.treatmentOverrideCount) &&
            Objects.equals(this.metricConfigurations, v1SkillExperimentExperimentInformation.metricConfigurations) &&
            Objects.equals(this.state, v1SkillExperimentExperimentInformation.state) &&
            Objects.equals(this.history, v1SkillExperimentExperimentInformation.history) &&
            Objects.equals(this.trigger, v1SkillExperimentExperimentInformation.trigger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, type, plannedDuration, exposurePercentage, treatmentOverrideCount, metricConfigurations, state, history, trigger);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExperimentInformation {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    plannedDuration: ").append(toIndentedString(plannedDuration)).append("\n");
        sb.append("    exposurePercentage: ").append(toIndentedString(exposurePercentage)).append("\n");
        sb.append("    treatmentOverrideCount: ").append(toIndentedString(treatmentOverrideCount)).append("\n");
        sb.append("    metricConfigurations: ").append(toIndentedString(metricConfigurations)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    history: ").append(toIndentedString(history)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
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
        private Integer treatmentOverrideCount;
        private List<com.amazon.ask.smapi.model.v1.skill.experiment.MetricConfiguration> metricConfigurations;
        private String state;
        private com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentHistory history;
        private com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentTrigger trigger;

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


        @JsonProperty("treatmentOverrideCount")

        public Builder withTreatmentOverrideCount(Integer treatmentOverrideCount) {
            this.treatmentOverrideCount = treatmentOverrideCount;
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

        @JsonProperty("state")

        public Builder withState(String state) {
          this.state = state;
          return this;
        }

        public Builder withState(com.amazon.ask.smapi.model.v1.skill.experiment.State state) {
            this.state = state != null ? state.toString() : null;
            return this;
        }


        @JsonProperty("history")

        public Builder withHistory(com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentHistory history) {
            this.history = history;
            return this;
        }


        @JsonProperty("trigger")

        public Builder withTrigger(com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentTrigger trigger) {
            this.trigger = trigger;
            return this;
        }


        public ExperimentInformation build() {
            return new ExperimentInformation(this);
        }
    }
}

