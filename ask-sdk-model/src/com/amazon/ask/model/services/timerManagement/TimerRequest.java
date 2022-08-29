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


package com.amazon.ask.model.services.timerManagement;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input request for creating a timer.
 */

@JsonDeserialize(builder = TimerRequest.Builder.class)
public final class TimerRequest {

    @JsonProperty("duration")
    private String duration = null;

    @JsonProperty("timerLabel")
    private String timerLabel = null;

    @JsonProperty("creationBehavior")
    private com.amazon.ask.model.services.timerManagement.CreationBehavior creationBehavior = null;

    @JsonProperty("triggeringBehavior")
    private com.amazon.ask.model.services.timerManagement.TriggeringBehavior triggeringBehavior = null;

    private TimerRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private TimerRequest(Builder builder) {
        if (builder.duration != null) {
            this.duration = builder.duration;
        }
        if (builder.timerLabel != null) {
            this.timerLabel = builder.timerLabel;
        }
        if (builder.creationBehavior != null) {
            this.creationBehavior = builder.creationBehavior;
        }
        if (builder.triggeringBehavior != null) {
            this.triggeringBehavior = builder.triggeringBehavior;
        }
    }

    /**
     * An ISO-8601 representation of duration. E.g. for 2 minutes and 3 seconds - \"PT2M3S\".
     * @return duration
    **/
    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }


    /**
     * Label of this timer alert, maximum of 256 characters.
     * @return timerLabel
    **/
    @JsonProperty("timerLabel")
    public String getTimerLabel() {
        return timerLabel;
    }


    /**
     * Get creationBehavior
     * @return creationBehavior
    **/
    @JsonProperty("creationBehavior")
    public com.amazon.ask.model.services.timerManagement.CreationBehavior getCreationBehavior() {
        return creationBehavior;
    }


    /**
     * Get triggeringBehavior
     * @return triggeringBehavior
    **/
    @JsonProperty("triggeringBehavior")
    public com.amazon.ask.model.services.timerManagement.TriggeringBehavior getTriggeringBehavior() {
        return triggeringBehavior;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimerRequest servicesTimerManagementTimerRequest = (TimerRequest) o;
        return Objects.equals(this.duration, servicesTimerManagementTimerRequest.duration) &&
            Objects.equals(this.timerLabel, servicesTimerManagementTimerRequest.timerLabel) &&
            Objects.equals(this.creationBehavior, servicesTimerManagementTimerRequest.creationBehavior) &&
            Objects.equals(this.triggeringBehavior, servicesTimerManagementTimerRequest.triggeringBehavior);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, timerLabel, creationBehavior, triggeringBehavior);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimerRequest {\n");
        
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    timerLabel: ").append(toIndentedString(timerLabel)).append("\n");
        sb.append("    creationBehavior: ").append(toIndentedString(creationBehavior)).append("\n");
        sb.append("    triggeringBehavior: ").append(toIndentedString(triggeringBehavior)).append("\n");
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
        private String duration;
        private String timerLabel;
        private com.amazon.ask.model.services.timerManagement.CreationBehavior creationBehavior;
        private com.amazon.ask.model.services.timerManagement.TriggeringBehavior triggeringBehavior;

        private Builder() {}

        @JsonProperty("duration")

        public Builder withDuration(String duration) {
            this.duration = duration;
            return this;
        }


        @JsonProperty("timerLabel")

        public Builder withTimerLabel(String timerLabel) {
            this.timerLabel = timerLabel;
            return this;
        }


        @JsonProperty("creationBehavior")

        public Builder withCreationBehavior(com.amazon.ask.model.services.timerManagement.CreationBehavior creationBehavior) {
            this.creationBehavior = creationBehavior;
            return this;
        }


        @JsonProperty("triggeringBehavior")

        public Builder withTriggeringBehavior(com.amazon.ask.model.services.timerManagement.TriggeringBehavior triggeringBehavior) {
            this.triggeringBehavior = triggeringBehavior;
            return this;
        }


        public TimerRequest build() {
            return new TimerRequest(this);
        }
    }
}

