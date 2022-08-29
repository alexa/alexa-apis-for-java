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


package com.amazon.ask.model.services.proactiveEvents;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The event data to be sent to customers, conforming to the schema associated with this event.
 */

@JsonDeserialize(builder = Event.Builder.class)
public final class Event {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("payload")
    private Object payload = null;

    private Event() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Event(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.payload != null) {
            this.payload = builder.payload;
        }
    }

    /**
     * Get name
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Get payload
     * @return payload
    **/
    @JsonProperty("payload")
    public Object getPayload() {
        return payload;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Event servicesProactiveEventsEvent = (Event) o;
        return Objects.equals(this.name, servicesProactiveEventsEvent.name) &&
            Objects.equals(this.payload, servicesProactiveEventsEvent.payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, payload);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
        private String name;
        private Object payload;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("payload")

        public Builder withPayload(Object payload) {
            this.payload = payload;
            return this;
        }


        public Event build() {
            return new Event(this);
        }
    }
}

