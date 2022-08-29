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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Timer object
 */

@JsonDeserialize(builder = TimerResponse.Builder.class)
public final class TimerResponse {

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("duration")
    private String duration = null;

    @JsonProperty("triggerTime")
    private OffsetDateTime triggerTime = null;

    @JsonProperty("timerLabel")
    private String timerLabel = null;

    @JsonProperty("createdTime")
    private OffsetDateTime createdTime = null;

    @JsonProperty("updatedTime")
    private OffsetDateTime updatedTime = null;

    @JsonProperty("remainingTimeWhenPaused")
    private String remainingTimeWhenPaused = null;

    private TimerResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private TimerResponse(Builder builder) {
        if (builder.id != null) {
            this.id = builder.id;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.duration != null) {
            this.duration = builder.duration;
        }
        if (builder.triggerTime != null) {
            this.triggerTime = builder.triggerTime;
        }
        if (builder.timerLabel != null) {
            this.timerLabel = builder.timerLabel;
        }
        if (builder.createdTime != null) {
            this.createdTime = builder.createdTime;
        }
        if (builder.updatedTime != null) {
            this.updatedTime = builder.updatedTime;
        }
        if (builder.remainingTimeWhenPaused != null) {
            this.remainingTimeWhenPaused = builder.remainingTimeWhenPaused;
        }
    }

    /**
     * Unique id of this timer alert
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }


    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.model.services.timerManagement.Status getStatus() {
        return com.amazon.ask.model.services.timerManagement.Status.fromValue(status);
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
     * An ISO-8601 representation of duration. E.g. for 2 minutes and 3 seconds - \"PT2M3S\".
     * @return duration
    **/
    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }


    /**
     * Valid ISO 8601 format - Trigger time of this timer alert.
     * @return triggerTime
    **/
    @JsonProperty("triggerTime")
    public OffsetDateTime getTriggerTime() {
        return triggerTime;
    }


    /**
     * Label of this timer alert, maximum of 256 character.
     * @return timerLabel
    **/
    @JsonProperty("timerLabel")
    public String getTimerLabel() {
        return timerLabel;
    }


    /**
     * Valid ISO 8601 format - Creation time of this timer alert.
     * @return createdTime
    **/
    @JsonProperty("createdTime")
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }


    /**
     * Valid ISO 8601 format - Last updated time of this timer alert.
     * @return updatedTime
    **/
    @JsonProperty("updatedTime")
    public OffsetDateTime getUpdatedTime() {
        return updatedTime;
    }


    /**
     * An ISO-8601 representation of duration remaining since the timer was last paused. E.g. for 1 hour, 3 minutes and 31 seconds - \"PT1H3M31S\".
     * @return remainingTimeWhenPaused
    **/
    @JsonProperty("remainingTimeWhenPaused")
    public String getRemainingTimeWhenPaused() {
        return remainingTimeWhenPaused;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimerResponse servicesTimerManagementTimerResponse = (TimerResponse) o;
        return Objects.equals(this.id, servicesTimerManagementTimerResponse.id) &&
            Objects.equals(this.status, servicesTimerManagementTimerResponse.status) &&
            Objects.equals(this.duration, servicesTimerManagementTimerResponse.duration) &&
            Objects.equals(this.triggerTime, servicesTimerManagementTimerResponse.triggerTime) &&
            Objects.equals(this.timerLabel, servicesTimerManagementTimerResponse.timerLabel) &&
            Objects.equals(this.createdTime, servicesTimerManagementTimerResponse.createdTime) &&
            Objects.equals(this.updatedTime, servicesTimerManagementTimerResponse.updatedTime) &&
            Objects.equals(this.remainingTimeWhenPaused, servicesTimerManagementTimerResponse.remainingTimeWhenPaused);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, duration, triggerTime, timerLabel, createdTime, updatedTime, remainingTimeWhenPaused);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimerResponse {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    triggerTime: ").append(toIndentedString(triggerTime)).append("\n");
        sb.append("    timerLabel: ").append(toIndentedString(timerLabel)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    remainingTimeWhenPaused: ").append(toIndentedString(remainingTimeWhenPaused)).append("\n");
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
        private String id;
        private String status;
        private String duration;
        private OffsetDateTime triggerTime;
        private String timerLabel;
        private OffsetDateTime createdTime;
        private OffsetDateTime updatedTime;
        private String remainingTimeWhenPaused;

        private Builder() {}

        @JsonProperty("id")

        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        @JsonProperty("status")

        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.model.services.timerManagement.Status status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("duration")

        public Builder withDuration(String duration) {
            this.duration = duration;
            return this;
        }


        @JsonProperty("triggerTime")

        public Builder withTriggerTime(OffsetDateTime triggerTime) {
            this.triggerTime = triggerTime;
            return this;
        }


        @JsonProperty("timerLabel")

        public Builder withTimerLabel(String timerLabel) {
            this.timerLabel = timerLabel;
            return this;
        }


        @JsonProperty("createdTime")

        public Builder withCreatedTime(OffsetDateTime createdTime) {
            this.createdTime = createdTime;
            return this;
        }


        @JsonProperty("updatedTime")

        public Builder withUpdatedTime(OffsetDateTime updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }


        @JsonProperty("remainingTimeWhenPaused")

        public Builder withRemainingTimeWhenPaused(String remainingTimeWhenPaused) {
            this.remainingTimeWhenPaused = remainingTimeWhenPaused;
            return this;
        }


        public TimerResponse build() {
            return new TimerResponse(this);
        }
    }
}

