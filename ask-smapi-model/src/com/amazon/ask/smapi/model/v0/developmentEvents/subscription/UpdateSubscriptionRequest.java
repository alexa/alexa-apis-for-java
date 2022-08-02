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


package com.amazon.ask.smapi.model.v0.developmentEvents.subscription;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * UpdateSubscriptionRequest
 */

@JsonDeserialize(builder = UpdateSubscriptionRequest.Builder.class)
public final class UpdateSubscriptionRequest {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("events")
    private List<com.amazon.ask.smapi.model.v0.developmentEvents.subscription.Event> events = new ArrayList<com.amazon.ask.smapi.model.v0.developmentEvents.subscription.Event>();

    private UpdateSubscriptionRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private UpdateSubscriptionRequest(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.events != null) {
            this.events = builder.events;
        }
    }

    /**
     * Name of the subscription.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * The list of events that the subscriber should be notified for.
     * @return events
    **/
    @JsonProperty("events")
    public List<com.amazon.ask.smapi.model.v0.developmentEvents.subscription.Event> getEvents() {
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
        UpdateSubscriptionRequest v0DevelopmentEventsSubscriptionUpdateSubscriptionRequest = (UpdateSubscriptionRequest) o;
        return Objects.equals(this.name, v0DevelopmentEventsSubscriptionUpdateSubscriptionRequest.name) &&
            Objects.equals(this.events, v0DevelopmentEventsSubscriptionUpdateSubscriptionRequest.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, events);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSubscriptionRequest {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
        private String name;
        private List<com.amazon.ask.smapi.model.v0.developmentEvents.subscription.Event> events;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("events")

        public Builder withEvents(List<com.amazon.ask.smapi.model.v0.developmentEvents.subscription.Event> events) {
            this.events = events;
            return this;
        }

        public Builder addEventsItem(com.amazon.ask.smapi.model.v0.developmentEvents.subscription.Event eventsItem) {
            if (this.events == null) {
                this.events = new ArrayList<com.amazon.ask.smapi.model.v0.developmentEvents.subscription.Event>();
            }
            this.events.add(eventsItem);
            return this;
        }

        public UpdateSubscriptionRequest build() {
            return new UpdateSubscriptionRequest(this);
        }
    }
}

