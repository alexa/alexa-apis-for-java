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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines historical properties of a skill experiment.
 */

@JsonDeserialize(builder = ExperimentHistory.Builder.class)
public final class ExperimentHistory {

    @JsonProperty("creationTime")
    private OffsetDateTime creationTime = null;

    @JsonProperty("startTime")
    private OffsetDateTime startTime = null;

    @JsonProperty("stoppedReason")
    private String stoppedReason = null;

    public static Builder builder() {
        return new Builder();
    }

    private ExperimentHistory(Builder builder) {
        if (builder.creationTime != null) {
            this.creationTime = builder.creationTime;
        }
        if (builder.startTime != null) {
            this.startTime = builder.startTime;
        }
        if (builder.stoppedReason != null) {
            this.stoppedReason = builder.stoppedReason;
        }
    }

    /**
     * Get creationTime
     * @return creationTime
    **/
    @JsonProperty("creationTime")
    public OffsetDateTime getCreationTime() {
        return creationTime;
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
     * The reason an experiment was stopped if experiment was stopped.
     * @return stoppedReason
    **/
    @JsonProperty("stoppedReason")
    public String getStoppedReason() {
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
        ExperimentHistory v1SkillExperimentExperimentHistory = (ExperimentHistory) o;
        return Objects.equals(this.creationTime, v1SkillExperimentExperimentHistory.creationTime) &&
            Objects.equals(this.startTime, v1SkillExperimentExperimentHistory.startTime) &&
            Objects.equals(this.stoppedReason, v1SkillExperimentExperimentHistory.stoppedReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creationTime, startTime, stoppedReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExperimentHistory {\n");
        
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
        private OffsetDateTime creationTime;
        private OffsetDateTime startTime;
        private String stoppedReason;

        private Builder() {}

        @JsonProperty("creationTime")

        public Builder withCreationTime(OffsetDateTime creationTime) {
            this.creationTime = creationTime;
            return this;
        }


        @JsonProperty("startTime")

        public Builder withStartTime(OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }


        @JsonProperty("stoppedReason")

        public Builder withStoppedReason(String stoppedReason) {
            this.stoppedReason = stoppedReason;
            return this;
        }


        public ExperimentHistory build() {
            return new ExperimentHistory(this);
        }
    }
}

