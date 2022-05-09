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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Defines the last state transition information for the experiment. 
 */

@JsonDeserialize(builder = ExperimentLastStateTransition.Builder.class)
public final class ExperimentLastStateTransition {

    @JsonProperty("sourceState")
    private String sourceState = null;

    @JsonProperty("targetState")
    private String targetState = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("startTime")
    private OffsetDateTime startTime = null;

    @JsonProperty("endTime")
    private OffsetDateTime endTime = null;

    @JsonProperty("errors")
    private List<com.amazon.ask.smapi.model.v1.skill.experiment.StateTransitionError> errors = new ArrayList<com.amazon.ask.smapi.model.v1.skill.experiment.StateTransitionError>();

    public static Builder builder() {
        return new Builder();
    }

    private ExperimentLastStateTransition(Builder builder) {
        if (builder.sourceState != null) {
            this.sourceState = builder.sourceState;
        }
        if (builder.targetState != null) {
            this.targetState = builder.targetState;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.startTime != null) {
            this.startTime = builder.startTime;
        }
        if (builder.endTime != null) {
            this.endTime = builder.endTime;
        }
        if (builder.errors != null) {
            this.errors = builder.errors;
        }
    }

    /**
     * Get sourceState
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getSourceStateAsString().
     *
     * @return sourceState
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.experiment.SourceState getSourceState() {
        return com.amazon.ask.smapi.model.v1.skill.experiment.SourceState.fromValue(sourceState);
    }

    /**
     * Get the underlying String value for sourceState.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return sourceState as a String value
    **/
    @JsonProperty("sourceState")
    public String getSourceStateAsString() {
      return sourceState;
    }

    /**
     * Get targetState
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getTargetStateAsString().
     *
     * @return targetState
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.experiment.DestinationState getTargetState() {
        return com.amazon.ask.smapi.model.v1.skill.experiment.DestinationState.fromValue(targetState);
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
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.experiment.StateTransitionStatus getStatus() {
        return com.amazon.ask.smapi.model.v1.skill.experiment.StateTransitionStatus.fromValue(status);
    }

    /**
     * Get the underlying String value for status.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return status as a String value
    **/
    @JsonProperty("status")
    public String getStatusAsString() {
      return status;
    }

    /**
     * Get startTime
     * @return startTime
    **/
    @JsonProperty("startTime")
    public OffsetDateTime getStartTime() {
        return startTime;
    }


    /**
     * Get endTime
     * @return endTime
    **/
    @JsonProperty("endTime")
    public OffsetDateTime getEndTime() {
        return endTime;
    }


    /**
     * List of error objects which define what errors caused the state transition failure. 
     * @return errors
    **/
    @JsonProperty("errors")
    public List<com.amazon.ask.smapi.model.v1.skill.experiment.StateTransitionError> getErrors() {
        return errors;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExperimentLastStateTransition v1SkillExperimentExperimentLastStateTransition = (ExperimentLastStateTransition) o;
        return Objects.equals(this.sourceState, v1SkillExperimentExperimentLastStateTransition.sourceState) &&
            Objects.equals(this.targetState, v1SkillExperimentExperimentLastStateTransition.targetState) &&
            Objects.equals(this.status, v1SkillExperimentExperimentLastStateTransition.status) &&
            Objects.equals(this.startTime, v1SkillExperimentExperimentLastStateTransition.startTime) &&
            Objects.equals(this.endTime, v1SkillExperimentExperimentLastStateTransition.endTime) &&
            Objects.equals(this.errors, v1SkillExperimentExperimentLastStateTransition.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceState, targetState, status, startTime, endTime, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExperimentLastStateTransition {\n");
        
        sb.append("    sourceState: ").append(toIndentedString(sourceState)).append("\n");
        sb.append("    targetState: ").append(toIndentedString(targetState)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
        private String sourceState;
        private String targetState;
        private String status;
        private OffsetDateTime startTime;
        private OffsetDateTime endTime;
        private List<com.amazon.ask.smapi.model.v1.skill.experiment.StateTransitionError> errors;

        private Builder() {}

        @JsonProperty("sourceState")

        public Builder withSourceState(String sourceState) {
          this.sourceState = sourceState;
          return this;
        }

        public Builder withSourceState(com.amazon.ask.smapi.model.v1.skill.experiment.SourceState sourceState) {
            this.sourceState = sourceState != null ? sourceState.toString() : null;
            return this;
        }


        @JsonProperty("targetState")

        public Builder withTargetState(String targetState) {
          this.targetState = targetState;
          return this;
        }

        public Builder withTargetState(com.amazon.ask.smapi.model.v1.skill.experiment.DestinationState targetState) {
            this.targetState = targetState != null ? targetState.toString() : null;
            return this;
        }


        @JsonProperty("status")

        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.experiment.StateTransitionStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("startTime")

        public Builder withStartTime(OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }


        @JsonProperty("endTime")

        public Builder withEndTime(OffsetDateTime endTime) {
            this.endTime = endTime;
            return this;
        }


        @JsonProperty("errors")

        public Builder withErrors(List<com.amazon.ask.smapi.model.v1.skill.experiment.StateTransitionError> errors) {
            this.errors = errors;
            return this;
        }

        public Builder addErrorsItem(com.amazon.ask.smapi.model.v1.skill.experiment.StateTransitionError errorsItem) {
            if (this.errors == null) {
                this.errors = new ArrayList<com.amazon.ask.smapi.model.v1.skill.experiment.StateTransitionError>();
            }
            this.errors.add(errorsItem);
            return this;
        }

        public ExperimentLastStateTransition build() {
            return new ExperimentLastStateTransition(this);
        }
    }
}

