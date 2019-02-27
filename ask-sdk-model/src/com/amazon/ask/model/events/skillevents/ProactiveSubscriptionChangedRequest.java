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


package com.amazon.ask.model.events.skillevents;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This event indicates a customer subscription to receive events from your skill and contains information for that user. You need this information to know the userId in order to send events to individual users. Note that these events can arrive out of order, so ensure that your skill service uses the timestamp in the event to correctly record the latest subscription state for a customer. 
 */

@JsonDeserialize(builder = ProactiveSubscriptionChangedRequest.Builder.class)
public final class ProactiveSubscriptionChangedRequest extends com.amazon.ask.model.Request {

  @JsonProperty("body")
  private com.amazon.ask.model.events.skillevents.ProactiveSubscriptionChangedBody body = null;

  public static Builder builder() {
    return new Builder();
  }

  private ProactiveSubscriptionChangedRequest(Builder builder) {
    String discriminatorValue = "AlexaSkillEvent.ProactiveSubscriptionChanged";

    this.type = discriminatorValue;
    this.requestId = builder.requestId;
    this.timestamp = builder.timestamp;
    this.locale = builder.locale;
    this.body = builder.body;
  }

  /**
    * Get body
  * @return body
  **/
  public com.amazon.ask.model.events.skillevents.ProactiveSubscriptionChangedBody getBody() {
    return body;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProactiveSubscriptionChangedRequest eventsSkilleventsProactiveSubscriptionChangedRequest = (ProactiveSubscriptionChangedRequest) o;
    return Objects.equals(this.body, eventsSkilleventsProactiveSubscriptionChangedRequest.body) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProactiveSubscriptionChangedRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
    private com.amazon.ask.model.events.skillevents.ProactiveSubscriptionChangedBody body;

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
    public Builder withBody(com.amazon.ask.model.events.skillevents.ProactiveSubscriptionChangedBody body) {
      this.body = body;
      return this;
    }
      

    public ProactiveSubscriptionChangedRequest build() {
      return new ProactiveSubscriptionChangedRequest(this);
    }
  }
}

