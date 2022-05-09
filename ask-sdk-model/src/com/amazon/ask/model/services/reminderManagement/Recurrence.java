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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Recurring date/time using the RFC 5545 standard in JSON object form
 */

@JsonDeserialize(builder = Recurrence.Builder.class)
public final class Recurrence {

    @JsonProperty("freq")
    private String freq = null;

    @JsonProperty("byDay")
    private List<com.amazon.ask.model.services.reminderManagement.RecurrenceDay> byDay = new ArrayList<com.amazon.ask.model.services.reminderManagement.RecurrenceDay>();

    @JsonProperty("interval")
    private Integer interval = null;

    @JsonProperty("startDateTime")
    private LocalDateTime startDateTime = null;

    @JsonProperty("endDateTime")
    private LocalDateTime endDateTime = null;

    @JsonProperty("recurrenceRules")
    private List<String> recurrenceRules = new ArrayList<String>();

    public static Builder builder() {
        return new Builder();
    }

    private Recurrence(Builder builder) {
        if (builder.freq != null) {
            this.freq = builder.freq;
        }
        if (builder.byDay != null) {
            this.byDay = builder.byDay;
        }
        if (builder.interval != null) {
            this.interval = builder.interval;
        }
        if (builder.startDateTime != null) {
            this.startDateTime = builder.startDateTime;
        }
        if (builder.endDateTime != null) {
            this.endDateTime = builder.endDateTime;
        }
        if (builder.recurrenceRules != null) {
            this.recurrenceRules = builder.recurrenceRules;
        }
    }

    /**
     * Get freq
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getFreqAsString().
     *
     * @return freq
    **/
    
    public com.amazon.ask.model.services.reminderManagement.RecurrenceFreq getFreq() {
        return com.amazon.ask.model.services.reminderManagement.RecurrenceFreq.fromValue(freq);
    }

    /**
     * Get the underlying String value for freq.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return freq as a String value
    **/
    @JsonProperty("freq")
    public String getFreqAsString() {
      return freq;
    }

    /**
     * Get byDay
     * @return byDay
    **/
    @JsonProperty("byDay")
    public List<com.amazon.ask.model.services.reminderManagement.RecurrenceDay> getByDay() {
        return byDay;
    }


    /**
     * contains a positive integer representing at which intervals the recurrence rule repeats
     * @return interval
    **/
    @JsonProperty("interval")
    public Integer getInterval() {
        return interval;
    }


    /**
     * Valid ISO 8601 format - optional start DateTime of recurrence.
     * @return startDateTime
    **/
    @JsonProperty("startDateTime")
    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Valid ISO 8601 format - optional end DateTime of recurrence
     * @return endDateTime
    **/
    @JsonProperty("endDateTime")
    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Get recurrenceRules
     * @return recurrenceRules
    **/
    @JsonProperty("recurrenceRules")
    public List<String> getRecurrenceRules() {
        return recurrenceRules;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Recurrence servicesReminderManagementRecurrence = (Recurrence) o;
        return Objects.equals(this.freq, servicesReminderManagementRecurrence.freq) &&
            Objects.equals(this.byDay, servicesReminderManagementRecurrence.byDay) &&
            Objects.equals(this.interval, servicesReminderManagementRecurrence.interval) &&
            Objects.equals(this.startDateTime, servicesReminderManagementRecurrence.startDateTime) &&
            Objects.equals(this.endDateTime, servicesReminderManagementRecurrence.endDateTime) &&
            Objects.equals(this.recurrenceRules, servicesReminderManagementRecurrence.recurrenceRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freq, byDay, interval, startDateTime, endDateTime, recurrenceRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Recurrence {\n");
        
        sb.append("    freq: ").append(toIndentedString(freq)).append("\n");
        sb.append("    byDay: ").append(toIndentedString(byDay)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
        sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
        sb.append("    recurrenceRules: ").append(toIndentedString(recurrenceRules)).append("\n");
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
        private String freq;
        private List<com.amazon.ask.model.services.reminderManagement.RecurrenceDay> byDay;
        private Integer interval;
        private LocalDateTime startDateTime;
        private LocalDateTime endDateTime;
        private List<String> recurrenceRules;

        private Builder() {}

        @JsonProperty("freq")

        public Builder withFreq(String freq) {
          this.freq = freq;
          return this;
        }

        public Builder withFreq(com.amazon.ask.model.services.reminderManagement.RecurrenceFreq freq) {
            this.freq = freq != null ? freq.toString() : null;
            return this;
        }


        @JsonProperty("byDay")

        public Builder withByDay(List<com.amazon.ask.model.services.reminderManagement.RecurrenceDay> byDay) {
            this.byDay = byDay;
            return this;
        }

        public Builder addByDayItem(com.amazon.ask.model.services.reminderManagement.RecurrenceDay byDayItem) {
            if (this.byDay == null) {
                this.byDay = new ArrayList<com.amazon.ask.model.services.reminderManagement.RecurrenceDay>();
            }
            this.byDay.add(byDayItem);
            return this;
        }

        @JsonProperty("interval")

        public Builder withInterval(Integer interval) {
            this.interval = interval;
            return this;
        }


        @JsonProperty("startDateTime")

        public Builder withStartDateTime(LocalDateTime startDateTime) {
            this.startDateTime = startDateTime;
            return this;
        }


        @JsonProperty("endDateTime")

        public Builder withEndDateTime(LocalDateTime endDateTime) {
            this.endDateTime = endDateTime;
            return this;
        }


        @JsonProperty("recurrenceRules")

        public Builder withRecurrenceRules(List<String> recurrenceRules) {
            this.recurrenceRules = recurrenceRules;
            return this;
        }

        public Builder addRecurrenceRulesItem(String recurrenceRulesItem) {
            if (this.recurrenceRules == null) {
                this.recurrenceRules = new ArrayList<String>();
            }
            this.recurrenceRules.add(recurrenceRulesItem);
            return this;
        }

        public Recurrence build() {
            return new Recurrence(this);
        }
    }
}

