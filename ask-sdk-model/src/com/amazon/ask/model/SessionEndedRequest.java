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


package com.amazon.ask.model;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A SessionEndedRequest is an object that represents a request made to an Alexa skill to notify that a session was ended. Your service receives a SessionEndedRequest when a currently open session is closed for one of the following reasons: &amp;lt;ol&amp;gt;&amp;lt;li&amp;gt;The user says “exit”&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;the user does not respond or says something that does not match an intent defined in your voice interface while the device is listening for the user’s response&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;an error occurs&amp;lt;/li&amp;gt;&amp;lt;/ol&amp;gt;
 */

@JsonDeserialize(builder = SessionEndedRequest.Builder.class)
public final class SessionEndedRequest extends com.amazon.ask.model.Request  {

    @JsonProperty("reason")
    private com.amazon.ask.model.SessionEndedReason reason = null;

    @JsonProperty("error")
    private com.amazon.ask.model.SessionEndedError error = null;

    public static Builder builder() {
        return new Builder();
    }

    private SessionEndedRequest(Builder builder) {
        String discriminatorValue = "SessionEndedRequest";

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
        if (builder.reason != null) {
            this.reason = builder.reason;
        }
        if (builder.error != null) {
            this.error = builder.error;
        }
    }

    /**
     * Describes why the session ended.
     * @return reason
    **/
    @JsonProperty("reason")
    public com.amazon.ask.model.SessionEndedReason getReason() {
        return reason;
    }

    /**
     * An error object providing more information about the error that occurred.
     * @return error
    **/
    @JsonProperty("error")
    public com.amazon.ask.model.SessionEndedError getError() {
        return error;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SessionEndedRequest sessionEndedRequest = (SessionEndedRequest) o;
        return Objects.equals(this.reason, sessionEndedRequest.reason) &&
            Objects.equals(this.error, sessionEndedRequest.error) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, error, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SessionEndedRequest {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
        private com.amazon.ask.model.SessionEndedReason reason;
        private com.amazon.ask.model.SessionEndedError error;

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


        @JsonProperty("reason")
        public Builder withReason(com.amazon.ask.model.SessionEndedReason reason) {
            this.reason = reason;
            return this;
        }


        @JsonProperty("error")
        public Builder withError(com.amazon.ask.model.SessionEndedError error) {
            this.error = error;
            return this;
        }


        public SessionEndedRequest build() {
            return new SessionEndedRequest(this);
        }
    }
}

