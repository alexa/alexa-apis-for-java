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


package com.amazon.ask.smapi.model.v0.developmentEvents.subscriber;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * ListSubscribersResponse
 */

@JsonDeserialize(builder = ListSubscribersResponse.Builder.class)
public final class ListSubscribersResponse {

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v0.Links links = null;

    @JsonProperty("nextToken")
    private String nextToken = null;

    @JsonProperty("subscribers")
    private List<com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.SubscriberSummary> subscribers = new ArrayList<com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.SubscriberSummary>();

    public static Builder builder() {
        return new Builder();
    }

    private ListSubscribersResponse(Builder builder) {
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.nextToken != null) {
            this.nextToken = builder.nextToken;
        }
        if (builder.subscribers != null) {
            this.subscribers = builder.subscribers;
        }
    }

    /**
     * Get links
     * @return links
    **/
    @JsonProperty("_links")
    public com.amazon.ask.smapi.model.v0.Links getLinks() {
        return links;
    }


    /**
     * Get nextToken
     * @return nextToken
    **/
    @JsonProperty("nextToken")
    public String getNextToken() {
        return nextToken;
    }


    /**
     * List containing subscriber summary.
     * @return subscribers
    **/
    @JsonProperty("subscribers")
    public List<com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.SubscriberSummary> getSubscribers() {
        return subscribers;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSubscribersResponse v0DevelopmentEventsSubscriberListSubscribersResponse = (ListSubscribersResponse) o;
        return Objects.equals(this.links, v0DevelopmentEventsSubscriberListSubscribersResponse.links) &&
            Objects.equals(this.nextToken, v0DevelopmentEventsSubscriberListSubscribersResponse.nextToken) &&
            Objects.equals(this.subscribers, v0DevelopmentEventsSubscriberListSubscribersResponse.subscribers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, nextToken, subscribers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubscribersResponse {\n");
        
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
        sb.append("    subscribers: ").append(toIndentedString(subscribers)).append("\n");
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
        private com.amazon.ask.smapi.model.v0.Links links;
        private String nextToken;
        private List<com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.SubscriberSummary> subscribers;

        private Builder() {}

        @JsonProperty("_links")

        public Builder withLinks(com.amazon.ask.smapi.model.v0.Links links) {
            this.links = links;
            return this;
        }


        @JsonProperty("nextToken")

        public Builder withNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }


        @JsonProperty("subscribers")

        public Builder withSubscribers(List<com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.SubscriberSummary> subscribers) {
            this.subscribers = subscribers;
            return this;
        }

        public Builder addSubscribersItem(com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.SubscriberSummary subscribersItem) {
            if (this.subscribers == null) {
                this.subscribers = new ArrayList<com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.SubscriberSummary>();
            }
            this.subscribers.add(subscribersItem);
            return this;
        }

        public ListSubscribersResponse build() {
            return new ListSubscribersResponse(this);
        }
    }
}

