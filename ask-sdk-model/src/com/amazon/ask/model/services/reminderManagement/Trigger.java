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


package com.amazon.ask.model.services.reminderManagement;

import java.util.Objects;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Trigger information for Reminder
 */

@JsonDeserialize(builder = Trigger.Builder.class)
public final class Trigger {

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("scheduledTime")
    private LocalDateTime scheduledTime = null;

    @JsonProperty("offsetInSeconds")
    private Integer offsetInSeconds = null;

    @JsonProperty("timeZoneId")
    private String timeZoneId = null;

    @JsonProperty("recurrence")
    private com.amazon.ask.model.services.reminderManagement.Recurrence recurrence = null;

    public static Builder builder() {
        return new Builder();
    }

    private Trigger(Builder builder) {
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.scheduledTime != null) {
            this.scheduledTime = builder.scheduledTime;
        }
        if (builder.offsetInSeconds != null) {
            this.offsetInSeconds = builder.offsetInSeconds;
        }
        if (builder.timeZoneId != null) {
            this.timeZoneId = builder.timeZoneId;
        }
        if (builder.recurrence != null) {
            this.recurrence = builder.recurrence;
        }
    }

    /**
     * Get type
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getTypeAsString().
     *
     * @return type
    **/
    
    public com.amazon.ask.model.services.reminderManagement.TriggerType getType() {
        return com.amazon.ask.model.services.reminderManagement.TriggerType.fromValue(type);
    }

    /**
     * Get the underlying String value for type.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return type as a String value
    **/
    @JsonProperty("type")
    public String getTypeAsString() {
      return type;
    }

    /**
     * Valid ISO 8601 format - Intended trigger time
     * @return scheduledTime
    **/
    @JsonProperty("scheduledTime")
    public LocalDateTime getScheduledTime() {
        return scheduledTime;
    }


    /**
     * If reminder is set using relative time, use this field to specify the time after which reminder ll ring (in seconds)
     * @return offsetInSeconds
    **/
    @JsonProperty("offsetInSeconds")
    public Integer getOffsetInSeconds() {
        return offsetInSeconds;
    }


    /**
     * Intended reminder's timezone
     * @return timeZoneId
    **/
    @JsonProperty("timeZoneId")
    public String getTimeZoneId() {
        return timeZoneId;
    }


    /**
     * Get recurrence
     * @return recurrence
    **/
    @JsonProperty("recurrence")
    public com.amazon.ask.model.services.reminderManagement.Recurrence getRecurrence() {
        return recurrence;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Trigger servicesReminderManagementTrigger = (Trigger) o;
        return Objects.equals(this.type, servicesReminderManagementTrigger.type) &&
            Objects.equals(this.scheduledTime, servicesReminderManagementTrigger.scheduledTime) &&
            Objects.equals(this.offsetInSeconds, servicesReminderManagementTrigger.offsetInSeconds) &&
            Objects.equals(this.timeZoneId, servicesReminderManagementTrigger.timeZoneId) &&
            Objects.equals(this.recurrence, servicesReminderManagementTrigger.recurrence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, scheduledTime, offsetInSeconds, timeZoneId, recurrence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Trigger {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    scheduledTime: ").append(toIndentedString(scheduledTime)).append("\n");
        sb.append("    offsetInSeconds: ").append(toIndentedString(offsetInSeconds)).append("\n");
        sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
        sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
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
        private String type;
        private LocalDateTime scheduledTime;
        private Integer offsetInSeconds;
        private String timeZoneId;
        private com.amazon.ask.model.services.reminderManagement.Recurrence recurrence;

        private Builder() {}

        @JsonProperty("type")
        public Builder withType(String type) {
          this.type = type;
          return this;
        }

        public Builder withType(com.amazon.ask.model.services.reminderManagement.TriggerType type) {
            this.type = type != null ? type.toString() : null;
            return this;
        }


        @JsonProperty("scheduledTime")

        public Builder withScheduledTime(LocalDateTime scheduledTime) {
            this.scheduledTime = scheduledTime;
            return this;
        }


        @JsonProperty("offsetInSeconds")

        public Builder withOffsetInSeconds(Integer offsetInSeconds) {
            this.offsetInSeconds = offsetInSeconds;
            return this;
        }


        @JsonProperty("timeZoneId")

        public Builder withTimeZoneId(String timeZoneId) {
            this.timeZoneId = timeZoneId;
            return this;
        }


        @JsonProperty("recurrence")

        public Builder withRecurrence(com.amazon.ask.model.services.reminderManagement.Recurrence recurrence) {
            this.recurrence = recurrence;
            return this;
        }


        public Trigger build() {
            return new Trigger(this);
        }
    }
}

