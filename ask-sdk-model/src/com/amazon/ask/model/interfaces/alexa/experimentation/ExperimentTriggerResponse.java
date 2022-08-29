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
 * Experiment trigger response from skill
 */

@JsonDeserialize(builder = ExperimentTriggerResponse.Builder.class)
public final class ExperimentTriggerResponse {

    @JsonProperty("triggeredExperiments")
    private List<String> triggeredExperiments = new ArrayList<String>();

    private ExperimentTriggerResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ExperimentTriggerResponse(Builder builder) {
        if (builder.triggeredExperiments != null) {
            this.triggeredExperiments = builder.triggeredExperiments;
        }
    }

    /**
     * Contains array of triggered experiment ids
     * @return triggeredExperiments
    **/
    @JsonProperty("triggeredExperiments")
    public List<String> getTriggeredExperiments() {
        return triggeredExperiments;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExperimentTriggerResponse interfacesAlexaExperimentationExperimentTriggerResponse = (ExperimentTriggerResponse) o;
        return Objects.equals(this.triggeredExperiments, interfacesAlexaExperimentationExperimentTriggerResponse.triggeredExperiments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(triggeredExperiments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExperimentTriggerResponse {\n");
        
        sb.append("    triggeredExperiments: ").append(toIndentedString(triggeredExperiments)).append("\n");
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
        private List<String> triggeredExperiments;

        private Builder() {}

        @JsonProperty("triggeredExperiments")

        public Builder withTriggeredExperiments(List<String> triggeredExperiments) {
            this.triggeredExperiments = triggeredExperiments;
            return this;
        }

        public Builder addTriggeredExperimentsItem(String triggeredExperimentsItem) {
            if (this.triggeredExperiments == null) {
                this.triggeredExperiments = new ArrayList<String>();
            }
            this.triggeredExperiments.add(triggeredExperimentsItem);
            return this;
        }

        public ExperimentTriggerResponse build() {
            return new ExperimentTriggerResponse(this);
        }
    }
}

