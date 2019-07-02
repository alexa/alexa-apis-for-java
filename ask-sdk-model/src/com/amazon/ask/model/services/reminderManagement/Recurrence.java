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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Recurring date/time using the RFC 5545 standard in JSON object form
 */

@JsonDeserialize(builder = Recurrence.Builder.class)
public final class Recurrence{

  @JsonProperty("freq")
  private com.amazon.ask.model.services.reminderManagement.RecurrenceFreq freq = null;

  @JsonProperty("byDay")
  private List<com.amazon.ask.model.services.reminderManagement.RecurrenceDay> byDay = new ArrayList<com.amazon.ask.model.services.reminderManagement.RecurrenceDay>();

  @JsonProperty("interval")
  private Integer interval = null;

  public static Builder builder() {
    return new Builder();
  }

  private Recurrence(Builder builder) {
    this.freq = builder.freq;
    this.byDay = builder.byDay;
    this.interval = builder.interval;
  }

  /**
    * Get freq
  * @return freq
  **/
  @JsonProperty("freq")
  public com.amazon.ask.model.services.reminderManagement.RecurrenceFreq getFreq() {
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
        Objects.equals(this.interval, servicesReminderManagementRecurrence.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freq, byDay, interval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recurrence {\n");
    
    sb.append("    freq: ").append(toIndentedString(freq)).append("\n");
    sb.append("    byDay: ").append(toIndentedString(byDay)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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
    private com.amazon.ask.model.services.reminderManagement.RecurrenceFreq freq;
    private List<com.amazon.ask.model.services.reminderManagement.RecurrenceDay> byDay;
    private Integer interval;

    private Builder() { }

    @JsonProperty("freq")
    public Builder withFreq(com.amazon.ask.model.services.reminderManagement.RecurrenceFreq freq) {
        this.freq = freq;
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


    public Recurrence build() {
      return new Recurrence(this);
    }
  }
}

