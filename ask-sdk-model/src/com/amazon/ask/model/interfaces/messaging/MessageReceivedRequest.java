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


package com.amazon.ask.model.interfaces.messaging;

import java.util.Objects;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MessageReceivedRequest
 */

@JsonDeserialize(builder = MessageReceivedRequest.Builder.class)
public final class MessageReceivedRequest extends com.amazon.ask.model.Request  {

    @JsonProperty("message")
    private Map<String, Object> message = new HashMap<String, Object>();

    public static Builder builder() {
        return new Builder();
    }

    private MessageReceivedRequest(Builder builder) {
        String discriminatorValue = "Messaging.MessageReceived";

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
        if (builder.message != null) {
            this.message = builder.message;
        }
    }

    /**
     * Get message
     * @return message
    **/
    @JsonProperty("message")
    public Map<String, Object> getMessage() {
        return message;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessageReceivedRequest interfacesMessagingMessageReceivedRequest = (MessageReceivedRequest) o;
        return Objects.equals(this.message, interfacesMessagingMessageReceivedRequest.message) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageReceivedRequest {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
        private Map<String, Object> message;

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


        @JsonProperty("message")
        public Builder withMessage(Map<String, Object> message) {
            this.message = message;
            return this;
        }

        public Builder putMessageItem(String key, Object messageItem) {
            if (this.message == null) {
                this.message = new HashMap<String, Object>();
            }
            this.message.put(key, messageItem);
            return this;
        }

        public MessageReceivedRequest build() {
            return new MessageReceivedRequest(this);
        }
    }
}

