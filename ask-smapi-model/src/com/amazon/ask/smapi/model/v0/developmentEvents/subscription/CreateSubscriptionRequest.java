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
 * CreateSubscriptionRequest
 */

@JsonDeserialize(builder = CreateSubscriptionRequest.Builder.class)
public final class CreateSubscriptionRequest {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("events")
    private List<com.amazon.ask.smapi.model.v0.developmentEvents.subscription.Event> events = new ArrayList<com.amazon.ask.smapi.model.v0.developmentEvents.subscription.Event>();

    @JsonProperty("vendorId")
    private String vendorId = null;

    @JsonProperty("subscriberId")
    private String subscriberId = null;

    private CreateSubscriptionRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private CreateSubscriptionRequest(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.events != null) {
            this.events = builder.events;
        }
        if (builder.vendorId != null) {
            this.vendorId = builder.vendorId;
        }
        if (builder.subscriberId != null) {
            this.subscriberId = builder.subscriberId;
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


    /**
     * The vendorId of the event publisher.
     * @return vendorId
    **/
    @JsonProperty("vendorId")
    public String getVendorId() {
        return vendorId;
    }


    /**
     * The id of the subscriber that would receive the events.
     * @return subscriberId
    **/
    @JsonProperty("subscriberId")
    public String getSubscriberId() {
        return subscriberId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSubscriptionRequest v0DevelopmentEventsSubscriptionCreateSubscriptionRequest = (CreateSubscriptionRequest) o;
        return Objects.equals(this.name, v0DevelopmentEventsSubscriptionCreateSubscriptionRequest.name) &&
            Objects.equals(this.events, v0DevelopmentEventsSubscriptionCreateSubscriptionRequest.events) &&
            Objects.equals(this.vendorId, v0DevelopmentEventsSubscriptionCreateSubscriptionRequest.vendorId) &&
            Objects.equals(this.subscriberId, v0DevelopmentEventsSubscriptionCreateSubscriptionRequest.subscriberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, events, vendorId, subscriberId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubscriptionRequest {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
        sb.append("    subscriberId: ").append(toIndentedString(subscriberId)).append("\n");
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
        private String vendorId;
        private String subscriberId;

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

        @JsonProperty("vendorId")

        public Builder withVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }


        @JsonProperty("subscriberId")

        public Builder withSubscriberId(String subscriberId) {
            this.subscriberId = subscriberId;
            return this;
        }


        public CreateSubscriptionRequest build() {
            return new CreateSubscriptionRequest(this);
        }
    }
}

