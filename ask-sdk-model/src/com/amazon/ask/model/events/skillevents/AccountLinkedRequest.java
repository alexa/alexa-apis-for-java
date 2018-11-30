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
 * This event indicates that a customer has linked an account in a third-party application with the Alexa app. This event is useful for an application that support out-of-session (non-voice) user interactions so that this application can be notified when the internal customer can be associated with the Alexa customer. This event is required for many applications that synchronize customer Alexa lists with application lists. During the account linking process, the Alexa app directs the user to the skill website where the customer logs in. When the customer logs in, the skill then provides an access token and a consent token to Alexa. The event includes the same access token and consent token.
 */

@JsonDeserialize(builder = AccountLinkedRequest.Builder.class)
public final class AccountLinkedRequest extends com.amazon.ask.model.Request {

  @JsonProperty("body")
  private com.amazon.ask.model.events.skillevents.AccountLinkedBody body = null;

  @JsonProperty("eventCreationTime")
  private OffsetDateTime eventCreationTime = null;

  @JsonProperty("eventPublishingTime")
  private OffsetDateTime eventPublishingTime = null;

  public static Builder builder() {
    return new Builder();
  }

  private AccountLinkedRequest(Builder builder) {
    String discriminatorValue = "AlexaSkillEvent.SkillAccountLinked";

    this.type = discriminatorValue;
    this.requestId = builder.requestId;
    this.timestamp = builder.timestamp;
    this.locale = builder.locale;
    this.body = builder.body;
    this.eventCreationTime = builder.eventCreationTime;
    this.eventPublishingTime = builder.eventPublishingTime;
  }

  /**
    * Get body
  * @return body
  **/
  public com.amazon.ask.model.events.skillevents.AccountLinkedBody getBody() {
    return body;
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
    AccountLinkedRequest eventsSkilleventsAccountLinkedRequest = (AccountLinkedRequest) o;
    return Objects.equals(this.body, eventsSkilleventsAccountLinkedRequest.body) &&
        Objects.equals(this.eventCreationTime, eventsSkilleventsAccountLinkedRequest.eventCreationTime) &&
        Objects.equals(this.eventPublishingTime, eventsSkilleventsAccountLinkedRequest.eventPublishingTime) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, eventCreationTime, eventPublishingTime, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountLinkedRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
    private com.amazon.ask.model.events.skillevents.AccountLinkedBody body;
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
      

    @JsonProperty("body")
    public Builder withBody(com.amazon.ask.model.events.skillevents.AccountLinkedBody body) {
      this.body = body;
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
      

    public AccountLinkedRequest build() {
      return new AccountLinkedRequest(this);
    }
  }
}

