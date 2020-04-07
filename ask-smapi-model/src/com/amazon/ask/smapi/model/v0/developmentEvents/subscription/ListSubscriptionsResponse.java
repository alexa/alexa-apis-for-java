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
 * ListSubscriptionsResponse
 */

@JsonDeserialize(builder = ListSubscriptionsResponse.Builder.class)
public final class ListSubscriptionsResponse {

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v0.Links links = null;

    @JsonProperty("nextToken")
    private String nextToken = null;

    @JsonProperty("subscriptions")
    private List<com.amazon.ask.smapi.model.v0.developmentEvents.subscription.SubscriptionSummary> subscriptions = new ArrayList<com.amazon.ask.smapi.model.v0.developmentEvents.subscription.SubscriptionSummary>();

    public static Builder builder() {
        return new Builder();
    }

    private ListSubscriptionsResponse(Builder builder) {
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.nextToken != null) {
            this.nextToken = builder.nextToken;
        }
        if (builder.subscriptions != null) {
            this.subscriptions = builder.subscriptions;
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
     * List of subscription summaries.
     * @return subscriptions
    **/
    @JsonProperty("subscriptions")
    public List<com.amazon.ask.smapi.model.v0.developmentEvents.subscription.SubscriptionSummary> getSubscriptions() {
        return subscriptions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSubscriptionsResponse v0DevelopmentEventsSubscriptionListSubscriptionsResponse = (ListSubscriptionsResponse) o;
        return Objects.equals(this.links, v0DevelopmentEventsSubscriptionListSubscriptionsResponse.links) &&
            Objects.equals(this.nextToken, v0DevelopmentEventsSubscriptionListSubscriptionsResponse.nextToken) &&
            Objects.equals(this.subscriptions, v0DevelopmentEventsSubscriptionListSubscriptionsResponse.subscriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, nextToken, subscriptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubscriptionsResponse {\n");
        
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
        sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v0.developmentEvents.subscription.SubscriptionSummary> subscriptions;

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


        @JsonProperty("subscriptions")

        public Builder withSubscriptions(List<com.amazon.ask.smapi.model.v0.developmentEvents.subscription.SubscriptionSummary> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }

        public Builder addSubscriptionsItem(com.amazon.ask.smapi.model.v0.developmentEvents.subscription.SubscriptionSummary subscriptionsItem) {
            if (this.subscriptions == null) {
                this.subscriptions = new ArrayList<com.amazon.ask.smapi.model.v0.developmentEvents.subscription.SubscriptionSummary>();
            }
            this.subscriptions.add(subscriptionsItem);
            return this;
        }

        public ListSubscriptionsResponse build() {
            return new ListSubscriptionsResponse(this);
        }
    }
}

