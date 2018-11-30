/*
* Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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


package com.amazon.ask.model.events.skillevents;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SkillDisabledRequest
 */

@JsonDeserialize(builder = SkillDisabledRequest.Builder.class)
public final class SkillDisabledRequest extends com.amazon.ask.model.Request {

  @JsonProperty("eventCreationTime")
  private OffsetDateTime eventCreationTime = null;

  @JsonProperty("eventPublishingTime")
  private OffsetDateTime eventPublishingTime = null;

  public static Builder builder() {
    return new Builder();
  }

  private SkillDisabledRequest(Builder builder) {
    String discriminatorValue = "AlexaSkillEvent.SkillDisabled";

    this.type = discriminatorValue;
    this.requestId = builder.requestId;
    this.timestamp = builder.timestamp;
    this.locale = builder.locale;
    this.eventCreationTime = builder.eventCreationTime;
    this.eventPublishingTime = builder.eventPublishingTime;
  }

  /**
    * Get eventCreationTime
  * @return eventCreationTime
  **/
  public OffsetDateTime getEventCreationTime() {
    return eventCreationTime;
  }

  /**
    * Get eventPublishingTime
  * @return eventPublishingTime
  **/
  public OffsetDateTime getEventPublishingTime() {
    return eventPublishingTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillDisabledRequest eventsSkilleventsSkillDisabledRequest = (SkillDisabledRequest) o;
    return Objects.equals(this.eventCreationTime, eventsSkilleventsSkillDisabledRequest.eventCreationTime) &&
        Objects.equals(this.eventPublishingTime, eventsSkilleventsSkillDisabledRequest.eventPublishingTime) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventCreationTime, eventPublishingTime, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillDisabledRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    eventCreationTime: ").append(toIndentedString(eventCreationTime)).append("\n");
    sb.append("    eventPublishingTime: ").append(toIndentedString(eventPublishingTime)).append("\n");
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
    private String requestId;
    private OffsetDateTime timestamp;
    private String locale;
    private OffsetDateTime eventCreationTime;
    private OffsetDateTime eventPublishingTime;

    private Builder() { }
      

    @JsonProperty("requestId")
    public Builder withRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }
      

    @JsonProperty("timestamp")
    public Builder withTimestamp(OffsetDateTime timestamp) {
      this.timestamp = timestamp;
      return this;
    }
      

    @JsonProperty("locale")
    public Builder withLocale(String locale) {
      this.locale = locale;
      return this;
    }
      

    @JsonProperty("eventCreationTime")
    public Builder withEventCreationTime(OffsetDateTime eventCreationTime) {
      this.eventCreationTime = eventCreationTime;
      return this;
    }
      

    @JsonProperty("eventPublishingTime")
    public Builder withEventPublishingTime(OffsetDateTime eventPublishingTime) {
      this.eventPublishingTime = eventPublishingTime;
      return this;
    }
      

    public SkillDisabledRequest build() {
      return new SkillDisabledRequest(this);
    }
  }
}

