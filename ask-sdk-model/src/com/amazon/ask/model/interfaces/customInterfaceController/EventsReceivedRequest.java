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


package com.amazon.ask.model.interfaces.customInterfaceController;

import java.util.Objects;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Skill receives this type of event when an event meets the filter  conditions provided in the StartEventHandlerDirective.
 */

@JsonDeserialize(builder = EventsReceivedRequest.Builder.class)
public final class EventsReceivedRequest extends com.amazon.ask.model.Request  {

    @JsonProperty("token")
    private String token = null;

    @JsonProperty("events")
    private List<com.amazon.ask.model.interfaces.customInterfaceController.Event> events = new ArrayList<com.amazon.ask.model.interfaces.customInterfaceController.Event>();

    public static Builder builder() {
        return new Builder();
    }

    private EventsReceivedRequest(Builder builder) {
        String discriminatorValue = "CustomInterfaceController.EventsReceived";

        this.type = discriminatorValue;
        if (builder.requestId != null) {
            this.requestId = builder.requestId;
        }
        if (builder.timestamp != null) {
            this.timestamp = builder.timestamp;
        }
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
        if (builder.token != null) {
            this.token = builder.token;
        }
        if (builder.events != null) {
            this.events = builder.events;
        }
    }

    /**
     * Unique identifier associated with the Event Handler that dispatched this event.
     * @return token
    **/
    @JsonProperty("token")
    public String getToken() {
        return token;
    }


    /**
     * A list of events that meet the filter criteria.
     * @return events
    **/
    @JsonProperty("events")
    public List<com.amazon.ask.model.interfaces.customInterfaceController.Event> getEvents() {
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
        EventsReceivedRequest interfacesCustomInterfaceControllerEventsReceivedRequest = (EventsReceivedRequest) o;
        return Objects.equals(this.token, interfacesCustomInterfaceControllerEventsReceivedRequest.token) &&
            Objects.equals(this.events, interfacesCustomInterfaceControllerEventsReceivedRequest.events) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, events, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventsReceivedRequest {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
        private String token;
        private List<com.amazon.ask.model.interfaces.customInterfaceController.Event> events;

        private Builder() {}

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


        @JsonProperty("token")

        public Builder withToken(String token) {
            this.token = token;
            return this;
        }


        @JsonProperty("events")

        public Builder withEvents(List<com.amazon.ask.model.interfaces.customInterfaceController.Event> events) {
            this.events = events;
            return this;
        }

        public Builder addEventsItem(com.amazon.ask.model.interfaces.customInterfaceController.Event eventsItem) {
            if (this.events == null) {
                this.events = new ArrayList<com.amazon.ask.model.interfaces.customInterfaceController.Event>();
            }
            this.events.add(eventsItem);
            return this;
        }

        public EventsReceivedRequest build() {
            return new EventsReceivedRequest(this);
        }
    }
}

