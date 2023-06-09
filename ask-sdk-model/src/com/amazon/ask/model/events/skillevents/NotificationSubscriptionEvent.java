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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NotificationSubscriptionEvent
 */

@JsonDeserialize(builder = NotificationSubscriptionEvent.Builder.class)
public final class NotificationSubscriptionEvent {

    @JsonProperty("topicId")
    private String topicId = null;

    private NotificationSubscriptionEvent() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private NotificationSubscriptionEvent(Builder builder) {
        if (builder.topicId != null) {
            this.topicId = builder.topicId;
        }
    }

    /**
     * The topicId will be one of the Topics specified in your Skill's manifest file.
     * @return topicId
    **/
    @JsonProperty("topicId")
    public String getTopicId() {
        return topicId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NotificationSubscriptionEvent eventsSkilleventsNotificationSubscriptionEvent = (NotificationSubscriptionEvent) o;
        return Objects.equals(this.topicId, eventsSkilleventsNotificationSubscriptionEvent.topicId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationSubscriptionEvent {\n");
        
        sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
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
        private String topicId;

        private Builder() {}

        @JsonProperty("topicId")

        public Builder withTopicId(String topicId) {
            this.topicId = topicId;
            return this;
        }


        public NotificationSubscriptionEvent build() {
            return new NotificationSubscriptionEvent(this);
        }
    }
}

