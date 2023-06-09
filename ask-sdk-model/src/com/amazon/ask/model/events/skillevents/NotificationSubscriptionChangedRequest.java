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
 * When a customer changes his topic subscriptions Alexa will send an event back to the skill endpoint notifying the skill owner with the most recent state of the customer&#39;s subscriptions. This is to notify skill owners of customers&#39; interest in receiving events from one or more schemas. This event indicates a customer permission to receive notifications from your skill and contains information for that user. You need this information to know the userId in order to send notifications to individual users. Note that these events can arrive out of order, so ensure that your skill service uses the timestamp in the event to correctly record the latest topic subscription state for a customer. 
 */

@JsonDeserialize(builder = NotificationSubscriptionChangedRequest.Builder.class)
public final class NotificationSubscriptionChangedRequest extends com.amazon.ask.model.Request  {

    @JsonProperty("body")
    private com.amazon.ask.model.events.skillevents.NotificationSubscriptionChangedBody body = null;

    private NotificationSubscriptionChangedRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private NotificationSubscriptionChangedRequest(Builder builder) {
        String discriminatorValue = "AlexaSkillEvent.NotificationSubscriptionChanged";

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
        if (builder.body != null) {
            this.body = builder.body;
        }
    }

    /**
     * Get body
     * @return body
    **/
    @JsonProperty("body")
    public com.amazon.ask.model.events.skillevents.NotificationSubscriptionChangedBody getBody() {
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
        NotificationSubscriptionChangedRequest eventsSkilleventsNotificationSubscriptionChangedRequest = (NotificationSubscriptionChangedRequest) o;
        return Objects.equals(this.body, eventsSkilleventsNotificationSubscriptionChangedRequest.body) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationSubscriptionChangedRequest {\n");
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
        private com.amazon.ask.model.events.skillevents.NotificationSubscriptionChangedBody body;

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


        @JsonProperty("body")

        public Builder withBody(com.amazon.ask.model.events.skillevents.NotificationSubscriptionChangedBody body) {
            this.body = body;
            return this;
        }


        public NotificationSubscriptionChangedRequest build() {
            return new NotificationSubscriptionChangedRequest(this);
        }
    }
}

