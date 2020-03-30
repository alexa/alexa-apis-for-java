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


package com.amazon.ask.smapi.model.v1.skill.simulations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SimulationResult
 */

@JsonDeserialize(builder = SimulationResult.Builder.class)
public final class SimulationResult {

    @JsonProperty("alexaExecutionInfo")
    private com.amazon.ask.smapi.model.v1.skill.simulations.AlexaExecutionInfo alexaExecutionInfo = null;

    @JsonProperty("skillExecutionInfo")
    private com.amazon.ask.smapi.model.v1.skill.simulations.Invocation skillExecutionInfo = null;

    @JsonProperty("error")
    private com.amazon.ask.smapi.model.v1.Error error = null;

    public static Builder builder() {
        return new Builder();
    }

    private SimulationResult(Builder builder) {
        if (builder.alexaExecutionInfo != null) {
            this.alexaExecutionInfo = builder.alexaExecutionInfo;
        }
        if (builder.skillExecutionInfo != null) {
            this.skillExecutionInfo = builder.skillExecutionInfo;
        }
        if (builder.error != null) {
            this.error = builder.error;
        }
    }

    /**
     * Get alexaExecutionInfo
     * @return alexaExecutionInfo
    **/
    @JsonProperty("alexaExecutionInfo")
    public com.amazon.ask.smapi.model.v1.skill.simulations.AlexaExecutionInfo getAlexaExecutionInfo() {
        return alexaExecutionInfo;
    }


    /**
     * Get skillExecutionInfo
     * @return skillExecutionInfo
    **/
    @JsonProperty("skillExecutionInfo")
    public com.amazon.ask.smapi.model.v1.skill.simulations.Invocation getSkillExecutionInfo() {
        return skillExecutionInfo;
    }


    /**
     * Get error
     * @return error
    **/
    @JsonProperty("error")
    public com.amazon.ask.smapi.model.v1.Error getError() {
        return error;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimulationResult v1SkillSimulationsSimulationResult = (SimulationResult) o;
        return Objects.equals(this.alexaExecutionInfo, v1SkillSimulationsSimulationResult.alexaExecutionInfo) &&
            Objects.equals(this.skillExecutionInfo, v1SkillSimulationsSimulationResult.skillExecutionInfo) &&
            Objects.equals(this.error, v1SkillSimulationsSimulationResult.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alexaExecutionInfo, skillExecutionInfo, error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimulationResult {\n");
        
        sb.append("    alexaExecutionInfo: ").append(toIndentedString(alexaExecutionInfo)).append("\n");
        sb.append("    skillExecutionInfo: ").append(toIndentedString(skillExecutionInfo)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.simulations.AlexaExecutionInfo alexaExecutionInfo;
        private com.amazon.ask.smapi.model.v1.skill.simulations.Invocation skillExecutionInfo;
        private com.amazon.ask.smapi.model.v1.Error error;

        private Builder() {}

        @JsonProperty("alexaExecutionInfo")

        public Builder withAlexaExecutionInfo(com.amazon.ask.smapi.model.v1.skill.simulations.AlexaExecutionInfo alexaExecutionInfo) {
            this.alexaExecutionInfo = alexaExecutionInfo;
            return this;
        }


        @JsonProperty("skillExecutionInfo")

        public Builder withSkillExecutionInfo(com.amazon.ask.smapi.model.v1.skill.simulations.Invocation skillExecutionInfo) {
            this.skillExecutionInfo = skillExecutionInfo;
            return this;
        }


        @JsonProperty("error")

        public Builder withError(com.amazon.ask.smapi.model.v1.Error error) {
            this.error = error;
            return this;
        }


        public SimulationResult build() {
            return new SimulationResult(this);
        }
    }
}

