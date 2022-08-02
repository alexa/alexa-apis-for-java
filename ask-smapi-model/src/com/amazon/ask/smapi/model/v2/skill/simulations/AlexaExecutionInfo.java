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


package com.amazon.ask.smapi.model.v2.skill.simulations;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * AlexaExecutionInfo
 */

@JsonDeserialize(builder = AlexaExecutionInfo.Builder.class)
public final class AlexaExecutionInfo {

    @JsonProperty("alexaResponses")
    private List<com.amazon.ask.smapi.model.v2.skill.simulations.AlexaResponse> alexaResponses = new ArrayList<com.amazon.ask.smapi.model.v2.skill.simulations.AlexaResponse>();

    @JsonProperty("consideredIntents")
    private List<com.amazon.ask.smapi.model.v2.skill.simulations.Intent> consideredIntents = new ArrayList<com.amazon.ask.smapi.model.v2.skill.simulations.Intent>();

    private AlexaExecutionInfo() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private AlexaExecutionInfo(Builder builder) {
        if (builder.alexaResponses != null) {
            this.alexaResponses = builder.alexaResponses;
        }
        if (builder.consideredIntents != null) {
            this.consideredIntents = builder.consideredIntents;
        }
    }

    /**
     * Get alexaResponses
     * @return alexaResponses
    **/
    @JsonProperty("alexaResponses")
    public List<com.amazon.ask.smapi.model.v2.skill.simulations.AlexaResponse> getAlexaResponses() {
        return alexaResponses;
    }


    /**
     * Get consideredIntents
     * @return consideredIntents
    **/
    @JsonProperty("consideredIntents")
    public List<com.amazon.ask.smapi.model.v2.skill.simulations.Intent> getConsideredIntents() {
        return consideredIntents;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlexaExecutionInfo v2SkillSimulationsAlexaExecutionInfo = (AlexaExecutionInfo) o;
        return Objects.equals(this.alexaResponses, v2SkillSimulationsAlexaExecutionInfo.alexaResponses) &&
            Objects.equals(this.consideredIntents, v2SkillSimulationsAlexaExecutionInfo.consideredIntents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alexaResponses, consideredIntents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlexaExecutionInfo {\n");
        
        sb.append("    alexaResponses: ").append(toIndentedString(alexaResponses)).append("\n");
        sb.append("    consideredIntents: ").append(toIndentedString(consideredIntents)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v2.skill.simulations.AlexaResponse> alexaResponses;
        private List<com.amazon.ask.smapi.model.v2.skill.simulations.Intent> consideredIntents;

        private Builder() {}

        @JsonProperty("alexaResponses")

        public Builder withAlexaResponses(List<com.amazon.ask.smapi.model.v2.skill.simulations.AlexaResponse> alexaResponses) {
            this.alexaResponses = alexaResponses;
            return this;
        }

        public Builder addAlexaResponsesItem(com.amazon.ask.smapi.model.v2.skill.simulations.AlexaResponse alexaResponsesItem) {
            if (this.alexaResponses == null) {
                this.alexaResponses = new ArrayList<com.amazon.ask.smapi.model.v2.skill.simulations.AlexaResponse>();
            }
            this.alexaResponses.add(alexaResponsesItem);
            return this;
        }

        @JsonProperty("consideredIntents")

        public Builder withConsideredIntents(List<com.amazon.ask.smapi.model.v2.skill.simulations.Intent> consideredIntents) {
            this.consideredIntents = consideredIntents;
            return this;
        }

        public Builder addConsideredIntentsItem(com.amazon.ask.smapi.model.v2.skill.simulations.Intent consideredIntentsItem) {
            if (this.consideredIntents == null) {
                this.consideredIntents = new ArrayList<com.amazon.ask.smapi.model.v2.skill.simulations.Intent>();
            }
            this.consideredIntents.add(consideredIntentsItem);
            return this;
        }

        public AlexaExecutionInfo build() {
            return new AlexaExecutionInfo(this);
        }
    }
}

