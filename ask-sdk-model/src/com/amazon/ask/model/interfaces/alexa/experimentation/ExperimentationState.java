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


package com.amazon.ask.model.interfaces.alexa.experimentation;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * ExperimentationState
 */

@JsonDeserialize(builder = ExperimentationState.Builder.class)
public final class ExperimentationState {

    @JsonProperty("activeExperiments")
    private List<com.amazon.ask.model.interfaces.alexa.experimentation.ExperimentAssignment> activeExperiments = new ArrayList<com.amazon.ask.model.interfaces.alexa.experimentation.ExperimentAssignment>();

    private ExperimentationState() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ExperimentationState(Builder builder) {
        if (builder.activeExperiments != null) {
            this.activeExperiments = builder.activeExperiments;
        }
    }

    /**
     * Get activeExperiments
     * @return activeExperiments
    **/
    @JsonProperty("activeExperiments")
    public List<com.amazon.ask.model.interfaces.alexa.experimentation.ExperimentAssignment> getActiveExperiments() {
        return activeExperiments;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExperimentationState interfacesAlexaExperimentationExperimentationState = (ExperimentationState) o;
        return Objects.equals(this.activeExperiments, interfacesAlexaExperimentationExperimentationState.activeExperiments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeExperiments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExperimentationState {\n");
        
        sb.append("    activeExperiments: ").append(toIndentedString(activeExperiments)).append("\n");
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
        private List<com.amazon.ask.model.interfaces.alexa.experimentation.ExperimentAssignment> activeExperiments;

        private Builder() {}

        @JsonProperty("activeExperiments")

        public Builder withActiveExperiments(List<com.amazon.ask.model.interfaces.alexa.experimentation.ExperimentAssignment> activeExperiments) {
            this.activeExperiments = activeExperiments;
            return this;
        }

        public Builder addActiveExperimentsItem(com.amazon.ask.model.interfaces.alexa.experimentation.ExperimentAssignment activeExperimentsItem) {
            if (this.activeExperiments == null) {
                this.activeExperiments = new ArrayList<com.amazon.ask.model.interfaces.alexa.experimentation.ExperimentAssignment>();
            }
            this.activeExperiments.add(activeExperimentsItem);
            return this;
        }

        public ExperimentationState build() {
            return new ExperimentationState(this);
        }
    }
}

