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
 * Defines the response body for retrieving the current experiment state.
 */

@JsonDeserialize(builder = GetExperimentStateResponse.Builder.class)
public final class GetExperimentStateResponse {

    @JsonProperty("state")
    private String state = null;

    public static Builder builder() {
        return new Builder();
    }

    private GetExperimentStateResponse(Builder builder) {
        if (builder.state != null) {
            this.state = builder.state;
        }
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetExperimentStateResponse v1SkillExperimentGetExperimentStateResponse = (GetExperimentStateResponse) o;
        return Objects.equals(this.state, v1SkillExperimentGetExperimentStateResponse.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetExperimentStateResponse {\n");
        
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
        private String state;

        private Builder() {}

        @JsonProperty("state")

        public Builder withState(String state) {
          this.state = state;
          return this;
        }

        public Builder withState(com.amazon.ask.smapi.model.v1.skill.experiment.State state) {
            this.state = state != null ? state.toString() : null;
            return this;
        }


        public GetExperimentStateResponse build() {
            return new GetExperimentStateResponse(this);
        }
    }
}

