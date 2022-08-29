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


package com.amazon.ask.model.interfaces.alexa.presentation.html;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Message request sends a message to the skill lambda. 
 */

@JsonDeserialize(builder = MessageRequest.Builder.class)
public final class MessageRequest extends com.amazon.ask.model.Request  {

    @JsonProperty("message")
    private Object message = null;

    private MessageRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private MessageRequest(Builder builder) {
        String discriminatorValue = "Alexa.Presentation.HTML.Message";

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
     * A free-form object containing data from a skill's HTML application to deliver to the Alexa cloud. Maximum size 18 KB. 
     * @return message
    **/
    @JsonProperty("message")
    public Object getMessage() {
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
        MessageRequest interfacesAlexaPresentationHtmlMessageRequest = (MessageRequest) o;
        return Objects.equals(this.message, interfacesAlexaPresentationHtmlMessageRequest.message) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageRequest {\n");
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
        private Object message;

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

        public Builder withMessage(Object message) {
            this.message = message;
            return this;
        }


        public MessageRequest build() {
            return new MessageRequest(this);
        }
    }
}

