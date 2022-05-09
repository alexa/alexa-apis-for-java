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
 * Defines the request body for performing an experiment action to move it to a target state.
 */

@JsonDeserialize(builder = ManageExperimentStateRequest.Builder.class)
public final class ManageExperimentStateRequest {

    @JsonProperty("targetState")
    private String targetState = null;

    @JsonProperty("stoppedReason")
    private String stoppedReason = null;

    public static Builder builder() {
        return new Builder();
    }

    private ManageExperimentStateRequest(Builder builder) {
        if (builder.targetState != null) {
            this.targetState = builder.targetState;
        }
        if (builder.stoppedReason != null) {
            this.stoppedReason = builder.stoppedReason;
        }
    }

    /**
     * Get targetState
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getTargetStateAsString().
     *
     * @return targetState
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.experiment.TargetState getTargetState() {
        return com.amazon.ask.smapi.model.v1.skill.experiment.TargetState.fromValue(targetState);
    }

    /**
     * Get the underlying String value for targetState.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return targetState as a String value
    **/
    @JsonProperty("targetState")
    public String getTargetStateAsString() {
      return targetState;
    }

    /**
     * Get stoppedReason
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStoppedReasonAsString().
     *
     * @return stoppedReason
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentStoppedReason getStoppedReason() {
        return com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentStoppedReason.fromValue(stoppedReason);
    }

    /**
     * Get the underlying String value for stoppedReason.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return stoppedReason as a String value
    **/
    @JsonProperty("stoppedReason")
    public String getStoppedReasonAsString() {
      return stoppedReason;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ManageExperimentStateRequest v1SkillExperimentManageExperimentStateRequest = (ManageExperimentStateRequest) o;
        return Objects.equals(this.targetState, v1SkillExperimentManageExperimentStateRequest.targetState) &&
            Objects.equals(this.stoppedReason, v1SkillExperimentManageExperimentStateRequest.stoppedReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetState, stoppedReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManageExperimentStateRequest {\n");
        
        sb.append("    targetState: ").append(toIndentedString(targetState)).append("\n");
        sb.append("    stoppedReason: ").append(toIndentedString(stoppedReason)).append("\n");
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
        private String targetState;
        private String stoppedReason;

        private Builder() {}

        @JsonProperty("targetState")

        public Builder withTargetState(String targetState) {
          this.targetState = targetState;
          return this;
        }

        public Builder withTargetState(com.amazon.ask.smapi.model.v1.skill.experiment.TargetState targetState) {
            this.targetState = targetState != null ? targetState.toString() : null;
            return this;
        }


        @JsonProperty("stoppedReason")

        public Builder withStoppedReason(String stoppedReason) {
          this.stoppedReason = stoppedReason;
          return this;
        }

        public Builder withStoppedReason(com.amazon.ask.smapi.model.v1.skill.experiment.ExperimentStoppedReason stoppedReason) {
            this.stoppedReason = stoppedReason != null ? stoppedReason.toString() : null;
            return this;
        }


        public ManageExperimentStateRequest build() {
            return new ManageExperimentStateRequest(this);
        }
    }
}

