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
 * Defines the request body for creating an experiment.
 */

@JsonDeserialize(builder = CreateExperimentRequest.Builder.class)
public final class CreateExperimentRequest {

    @JsonProperty("experiment")
    private com.amazon.ask.smapi.model.v1.skill.experiment.CreateExperimentInput experiment = null;

    public static Builder builder() {
        return new Builder();
    }

    private CreateExperimentRequest(Builder builder) {
        if (builder.experiment != null) {
            this.experiment = builder.experiment;
        }
    }

    /**
     * Get experiment
     * @return experiment
    **/
    @JsonProperty("experiment")
    public com.amazon.ask.smapi.model.v1.skill.experiment.CreateExperimentInput getExperiment() {
        return experiment;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateExperimentRequest v1SkillExperimentCreateExperimentRequest = (CreateExperimentRequest) o;
        return Objects.equals(this.experiment, v1SkillExperimentCreateExperimentRequest.experiment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(experiment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExperimentRequest {\n");
        
        sb.append("    experiment: ").append(toIndentedString(experiment)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.experiment.CreateExperimentInput experiment;

        private Builder() {}

        @JsonProperty("experiment")

        public Builder withExperiment(com.amazon.ask.smapi.model.v1.skill.experiment.CreateExperimentInput experiment) {
            this.experiment = experiment;
            return this;
        }


        public CreateExperimentRequest build() {
            return new CreateExperimentRequest(this);
        }
    }
}

