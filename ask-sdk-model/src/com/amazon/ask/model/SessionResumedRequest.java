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
 * The request to resume a skill&#39;s session and tells the skill why it is resumed.
 */

@JsonDeserialize(builder = SessionResumedRequest.Builder.class)
public final class SessionResumedRequest extends com.amazon.ask.model.Request  {

    @JsonProperty("cause")
    private com.amazon.ask.model.Cause cause = null;

    public static Builder builder() {
        return new Builder();
    }

    private SessionResumedRequest(Builder builder) {
        String discriminatorValue = "SessionResumedRequest";

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
        if (builder.cause != null) {
            this.cause = builder.cause;
        }
    }

    /**
     * Get cause
     * @return cause
    **/
    @JsonProperty("cause")
    public com.amazon.ask.model.Cause getCause() {
        return cause;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SessionResumedRequest sessionResumedRequest = (SessionResumedRequest) o;
        return Objects.equals(this.cause, sessionResumedRequest.cause) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cause, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SessionResumedRequest {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
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
        private com.amazon.ask.model.Cause cause;

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


        @JsonProperty("cause")

        public Builder withCause(com.amazon.ask.model.Cause cause) {
            this.cause = cause;
            return this;
        }


        public SessionResumedRequest build() {
            return new SessionResumedRequest(this);
        }
    }
}

