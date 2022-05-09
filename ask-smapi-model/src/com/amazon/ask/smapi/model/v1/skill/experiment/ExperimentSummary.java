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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the shortened Experiment body which would contain a summary of experiment information. 
 */

@JsonDeserialize(builder = ExperimentSummary.Builder.class)
public final class ExperimentSummary {

    @JsonProperty("experimentId")
    private String experimentId = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("state")
    private String state = null;

    @JsonProperty("experimentHistory")
    private com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentHistory experimentHistory = null;

    public static Builder builder() {
        return new Builder();
    }

    private ExperimentSummary(Builder builder) {
        if (builder.experimentId != null) {
            this.experimentId = builder.experimentId;
        }
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.state != null) {
            this.state = builder.state;
        }
        if (builder.experimentHistory != null) {
            this.experimentHistory = builder.experimentHistory;
        }
    }

    /**
     * Identifier for experiment within a skill.
     * @return experimentId
    **/
    @JsonProperty("experimentId")
    public String getExperimentId() {
        return experimentId;
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
     * Get experimentHistory
     * @return experimentHistory
    **/
    @JsonProperty("experimentHistory")
    public com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentHistory getExperimentHistory() {
        return experimentHistory;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExperimentSummary v1SkillExperimentExperimentSummary = (ExperimentSummary) o;
        return Objects.equals(this.experimentId, v1SkillExperimentExperimentSummary.experimentId) &&
            Objects.equals(this.name, v1SkillExperimentExperimentSummary.name) &&
            Objects.equals(this.state, v1SkillExperimentExperimentSummary.state) &&
            Objects.equals(this.experimentHistory, v1SkillExperimentExperimentSummary.experimentHistory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(experimentId, name, state, experimentHistory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExperimentSummary {\n");
        
        sb.append("    experimentId: ").append(toIndentedString(experimentId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    experimentHistory: ").append(toIndentedString(experimentHistory)).append("\n");
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
        private String experimentId;
        private String name;
        private String state;
        private com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentHistory experimentHistory;

        private Builder() {}

        @JsonProperty("experimentId")

        public Builder withExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }


        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
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


        @JsonProperty("experimentHistory")

        public Builder withExperimentHistory(com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentHistory experimentHistory) {
            this.experimentHistory = experimentHistory;
            return this;
        }


        public ExperimentSummary build() {
            return new ExperimentSummary(this);
        }
    }
}

