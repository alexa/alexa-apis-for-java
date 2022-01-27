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
 * Defines trigger properties of a skill experiment.
 */

@JsonDeserialize(builder = ExperimentTrigger.Builder.class)
public final class ExperimentTrigger {

    @JsonProperty("scheduledEndTime")
    private OffsetDateTime scheduledEndTime = null;

    public static Builder builder() {
        return new Builder();
    }

    private ExperimentTrigger(Builder builder) {
        if (builder.scheduledEndTime != null) {
            this.scheduledEndTime = builder.scheduledEndTime;
        }
    }

    /**
     * Get scheduledEndTime
     * @return scheduledEndTime
    **/
    @JsonProperty("scheduledEndTime")
    public OffsetDateTime getScheduledEndTime() {
        return scheduledEndTime;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExperimentTrigger v1SkillExperimentExperimentTrigger = (ExperimentTrigger) o;
        return Objects.equals(this.scheduledEndTime, v1SkillExperimentExperimentTrigger.scheduledEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduledEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExperimentTrigger {\n");
        
        sb.append("    scheduledEndTime: ").append(toIndentedString(scheduledEndTime)).append("\n");
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
        private OffsetDateTime scheduledEndTime;

        private Builder() {}

        @JsonProperty("scheduledEndTime")

        public Builder withScheduledEndTime(OffsetDateTime scheduledEndTime) {
            this.scheduledEndTime = scheduledEndTime;
            return this;
        }


        public ExperimentTrigger build() {
            return new ExperimentTrigger(this);
        }
    }
}

