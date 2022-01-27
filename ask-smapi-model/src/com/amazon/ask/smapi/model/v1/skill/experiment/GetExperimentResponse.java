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
 * Defines the response body for retrieving an experiment.
 */

@JsonDeserialize(builder = GetExperimentResponse.Builder.class)
public final class GetExperimentResponse {

    @JsonProperty("experiment")
    private com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentInformation experiment = null;

    @JsonProperty("lastStateTransition")
    private com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentLastStateTransition lastStateTransition = null;

    public static Builder builder() {
        return new Builder();
    }

    private GetExperimentResponse(Builder builder) {
        if (builder.experiment != null) {
            this.experiment = builder.experiment;
        }
        if (builder.lastStateTransition != null) {
            this.lastStateTransition = builder.lastStateTransition;
        }
    }

    /**
     * Get experiment
     * @return experiment
    **/
    @JsonProperty("experiment")
    public com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentInformation getExperiment() {
        return experiment;
    }


    /**
     * Get lastStateTransition
     * @return lastStateTransition
    **/
    @JsonProperty("lastStateTransition")
    public com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentLastStateTransition getLastStateTransition() {
        return lastStateTransition;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetExperimentResponse v1SkillExperimentGetExperimentResponse = (GetExperimentResponse) o;
        return Objects.equals(this.experiment, v1SkillExperimentGetExperimentResponse.experiment) &&
            Objects.equals(this.lastStateTransition, v1SkillExperimentGetExperimentResponse.lastStateTransition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(experiment, lastStateTransition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetExperimentResponse {\n");
        
        sb.append("    experiment: ").append(toIndentedString(experiment)).append("\n");
        sb.append("    lastStateTransition: ").append(toIndentedString(lastStateTransition)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentInformation experiment;
        private com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentLastStateTransition lastStateTransition;

        private Builder() {}

        @JsonProperty("experiment")

        public Builder withExperiment(com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentInformation experiment) {
            this.experiment = experiment;
            return this;
        }


        @JsonProperty("lastStateTransition")

        public Builder withLastStateTransition(com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentLastStateTransition lastStateTransition) {
            this.lastStateTransition = lastStateTransition;
            return this;
        }


        public GetExperimentResponse build() {
            return new GetExperimentResponse(this);
        }
    }
}

