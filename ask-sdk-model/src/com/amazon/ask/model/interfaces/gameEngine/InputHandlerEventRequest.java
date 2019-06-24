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


package com.amazon.ask.model.interfaces.gameEngine;

import java.util.Objects;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Sent when the conditions of an Echo Button event that your skill defined were met.
 */

@JsonDeserialize(builder = InputHandlerEventRequest.Builder.class)
public final class InputHandlerEventRequest extends com.amazon.ask.model.Request {

  @JsonProperty("originatingRequestId")
  private String originatingRequestId = null;

  @JsonProperty("events")
  private List<com.amazon.ask.model.services.gameEngine.InputHandlerEvent> events = new ArrayList<com.amazon.ask.model.services.gameEngine.InputHandlerEvent>();

  public static Builder builder() {
    return new Builder();
  }

  private InputHandlerEventRequest(Builder builder) {
    String discriminatorValue = "GameEngine.InputHandlerEvent";

    this.type = discriminatorValue;
    this.requestId = builder.requestId;
    this.timestamp = builder.timestamp;
    this.locale = builder.locale;
    this.originatingRequestId = builder.originatingRequestId;
    this.events = builder.events;
  }

  /**
    * The corresponding identifier of the request that started the input handler.
  * @return originatingRequestId
  **/
  public String getOriginatingRequestId() {
    return originatingRequestId;
  }

  /**
    * Get events
  * @return events
  **/
  public List<com.amazon.ask.model.services.gameEngine.InputHandlerEvent> getEvents() {
    return events;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputHandlerEventRequest interfacesGameEngineInputHandlerEventRequest = (InputHandlerEventRequest) o;
    return Objects.equals(this.originatingRequestId, interfacesGameEngineInputHandlerEventRequest.originatingRequestId) &&
        Objects.equals(this.events, interfacesGameEngineInputHandlerEventRequest.events) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originatingRequestId, events, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputHandlerEventRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    originatingRequestId: ").append(toIndentedString(originatingRequestId)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
    private String originatingRequestId;
    private List<com.amazon.ask.model.services.gameEngine.InputHandlerEvent> events;

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


    @JsonProperty("originatingRequestId")
    public Builder withOriginatingRequestId(String originatingRequestId) {
        this.originatingRequestId = originatingRequestId;
        return this;
    }


    @JsonProperty("events")
    public Builder withEvents(List<com.amazon.ask.model.services.gameEngine.InputHandlerEvent> events) {
        this.events = events;
        return this;
    }

    public Builder addEventsItem(com.amazon.ask.model.services.gameEngine.InputHandlerEvent eventsItem) {
      if (this.events == null) {
        this.events = new ArrayList<com.amazon.ask.model.services.gameEngine.InputHandlerEvent>();
      }
      this.events.add(eventsItem);
      return this;
    }

    public InputHandlerEventRequest build() {
      return new InputHandlerEventRequest(this);
    }
  }
}

