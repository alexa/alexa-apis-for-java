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
 * SubscriptionSummary
 */

@JsonDeserialize(builder = SubscriptionSummary.Builder.class)
public final class SubscriptionSummary {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("subscriptionId")
    private String subscriptionId = null;

    @JsonProperty("subscriberId")
    private String subscriberId = null;

    @JsonProperty("vendorId")
    private String vendorId = null;

    @JsonProperty("events")
    private List<com.amazon.ask.smapi.model.v0.developmentEvents.subscription.Event> events = new ArrayList<com.amazon.ask.smapi.model.v0.developmentEvents.subscription.Event>();

    private SubscriptionSummary() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SubscriptionSummary(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.subscriptionId != null) {
            this.subscriptionId = builder.subscriptionId;
        }
        if (builder.subscriberId != null) {
            this.subscriberId = builder.subscriberId;
        }
        if (builder.vendorId != null) {
            this.vendorId = builder.vendorId;
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
     * Unique identifier of the subscription resource.
     * @return subscriptionId
    **/
    @JsonProperty("subscriptionId")
    public String getSubscriptionId() {
        return subscriptionId;
    }


    /**
     * Subscriber Id of the event-reciever.
     * @return subscriberId
    **/
    @JsonProperty("subscriberId")
    public String getSubscriberId() {
        return subscriberId;
    }


    /**
     * VendorId of the event-publisher.
     * @return vendorId
    **/
    @JsonProperty("vendorId")
    public String getVendorId() {
        return vendorId;
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
        SubscriptionSummary v0DevelopmentEventsSubscriptionSubscriptionSummary = (SubscriptionSummary) o;
        return Objects.equals(this.name, v0DevelopmentEventsSubscriptionSubscriptionSummary.name) &&
            Objects.equals(this.subscriptionId, v0DevelopmentEventsSubscriptionSubscriptionSummary.subscriptionId) &&
            Objects.equals(this.subscriberId, v0DevelopmentEventsSubscriptionSubscriptionSummary.subscriberId) &&
            Objects.equals(this.vendorId, v0DevelopmentEventsSubscriptionSubscriptionSummary.vendorId) &&
            Objects.equals(this.events, v0DevelopmentEventsSubscriptionSubscriptionSummary.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscriptionId, subscriberId, vendorId, events);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionSummary {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    subscriberId: ").append(toIndentedString(subscriberId)).append("\n");
        sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
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
        private String subscriptionId;
        private String subscriberId;
        private String vendorId;
        private List<com.amazon.ask.smapi.model.v0.developmentEvents.subscription.Event> events;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("subscriptionId")

        public Builder withSubscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }


        @JsonProperty("subscriberId")

        public Builder withSubscriberId(String subscriberId) {
            this.subscriberId = subscriberId;
            return this;
        }


        @JsonProperty("vendorId")

        public Builder withVendorId(String vendorId) {
            this.vendorId = vendorId;
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

        public SubscriptionSummary build() {
            return new SubscriptionSummary(this);
        }
    }
}

