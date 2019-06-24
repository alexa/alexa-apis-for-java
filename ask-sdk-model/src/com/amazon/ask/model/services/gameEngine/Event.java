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


package com.amazon.ask.model.services.gameEngine;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * The events object is where you define the conditions that must be met for your skill to be notified of Echo Button input. You must define at least one event.
 */

@JsonDeserialize(builder = Event.Builder.class)
public final class Event{

  @JsonProperty("shouldEndInputHandler")
  private Boolean shouldEndInputHandler = null;

  @JsonProperty("meets")
  private List<String> meets = new ArrayList<String>();

  @JsonProperty("fails")
  private List<String> fails = new ArrayList<String>();

  @JsonProperty("reports")
  private com.amazon.ask.model.services.gameEngine.EventReportingType reports = null;

  @JsonProperty("maximumInvocations")
  private Integer maximumInvocations = null;

  @JsonProperty("triggerTimeMilliseconds")
  private Long triggerTimeMilliseconds = null;

  public static Builder builder() {
    return new Builder();
  }

  private Event(Builder builder) {
    this.shouldEndInputHandler = builder.shouldEndInputHandler;
    this.meets = builder.meets;
    this.fails = builder.fails;
    this.reports = builder.reports;
    this.maximumInvocations = builder.maximumInvocations;
    this.triggerTimeMilliseconds = builder.triggerTimeMilliseconds;
  }

  /**
    * Whether the Input Handler should end after this event fires. If true, the Input Handler will stop and no further events will be sent to your skill unless you call StartInputHandler again.
  * @return shouldEndInputHandler
  **/
  public Boolean getShouldEndInputHandler() {
    return shouldEndInputHandler;
  }

  /**
    * Get meets
  * @return meets
  **/
  public List<String> getMeets() {
    return meets;
  }

  /**
    * Get fails
  * @return fails
  **/
  public List<String> getFails() {
    return fails;
  }

  /**
    * Get reports
  * @return reports
  **/
  public com.amazon.ask.model.services.gameEngine.EventReportingType getReports() {
    return reports;
  }

  /**
    * Enables you to limit the number of times that the skill is notified about the same event during the course of the Input Handler. The default value is 1. This property is mutually exclusive with triggerTimeMilliseconds. 
    * minimum: 1
    * maximum: 2048
  * @return maximumInvocations
  **/
  public Integer getMaximumInvocations() {
    return maximumInvocations;
  }

  /**
    * Adds a time constraint to the event. Instead of being considered whenever a raw button event occurs, an event that has this parameter will only be considered once at triggerTimeMilliseconds after the Input Handler has started. Because a time-triggered event can only fire once, the maximumInvocations value is ignored. Omit this property entirely if you do not want to time-constrain the event. 
    * minimum: 0
    * maximum: 90000
  * @return triggerTimeMilliseconds
  **/
  public Long getTriggerTimeMilliseconds() {
    return triggerTimeMilliseconds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event servicesGameEngineEvent = (Event) o;
    return Objects.equals(this.shouldEndInputHandler, servicesGameEngineEvent.shouldEndInputHandler) &&
        Objects.equals(this.meets, servicesGameEngineEvent.meets) &&
        Objects.equals(this.fails, servicesGameEngineEvent.fails) &&
        Objects.equals(this.reports, servicesGameEngineEvent.reports) &&
        Objects.equals(this.maximumInvocations, servicesGameEngineEvent.maximumInvocations) &&
        Objects.equals(this.triggerTimeMilliseconds, servicesGameEngineEvent.triggerTimeMilliseconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shouldEndInputHandler, meets, fails, reports, maximumInvocations, triggerTimeMilliseconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    shouldEndInputHandler: ").append(toIndentedString(shouldEndInputHandler)).append("\n");
    sb.append("    meets: ").append(toIndentedString(meets)).append("\n");
    sb.append("    fails: ").append(toIndentedString(fails)).append("\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
    sb.append("    maximumInvocations: ").append(toIndentedString(maximumInvocations)).append("\n");
    sb.append("    triggerTimeMilliseconds: ").append(toIndentedString(triggerTimeMilliseconds)).append("\n");
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
    private Boolean shouldEndInputHandler;
    private List<String> meets;
    private List<String> fails;
    private com.amazon.ask.model.services.gameEngine.EventReportingType reports;
    private Integer maximumInvocations;
    private Long triggerTimeMilliseconds;

    private Builder() { }

    @JsonProperty("shouldEndInputHandler")
    public Builder withShouldEndInputHandler(Boolean shouldEndInputHandler) {
        this.shouldEndInputHandler = shouldEndInputHandler;
        return this;
    }


    @JsonProperty("meets")
    public Builder withMeets(List<String> meets) {
        this.meets = meets;
        return this;
    }

    public Builder addMeetsItem(String meetsItem) {
      if (this.meets == null) {
        this.meets = new ArrayList<String>();
      }
      this.meets.add(meetsItem);
      return this;
    }

    @JsonProperty("fails")
    public Builder withFails(List<String> fails) {
        this.fails = fails;
        return this;
    }

    public Builder addFailsItem(String failsItem) {
      if (this.fails == null) {
        this.fails = new ArrayList<String>();
      }
      this.fails.add(failsItem);
      return this;
    }

    @JsonProperty("reports")
    public Builder withReports(com.amazon.ask.model.services.gameEngine.EventReportingType reports) {
        this.reports = reports;
        return this;
    }


    @JsonProperty("maximumInvocations")
    public Builder withMaximumInvocations(Integer maximumInvocations) {
        this.maximumInvocations = maximumInvocations;
        return this;
    }


    @JsonProperty("triggerTimeMilliseconds")
    public Builder withTriggerTimeMilliseconds(Long triggerTimeMilliseconds) {
        this.triggerTimeMilliseconds = triggerTimeMilliseconds;
        return this;
    }


    public Event build() {
      return new Event(this);
    }
  }
}

