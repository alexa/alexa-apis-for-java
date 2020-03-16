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


package com.amazon.ask.model.interfaces.system;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExceptionEncounteredRequest
 */

@JsonDeserialize(builder = ExceptionEncounteredRequest.Builder.class)
public final class ExceptionEncounteredRequest extends com.amazon.ask.model.Request  {

    @JsonProperty("error")
    private com.amazon.ask.model.interfaces.system.Error error = null;

    @JsonProperty("cause")
    private com.amazon.ask.model.interfaces.system.ErrorCause cause = null;

    public static Builder builder() {
        return new Builder();
    }

    private ExceptionEncounteredRequest(Builder builder) {
        String discriminatorValue = "System.ExceptionEncountered";

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
        if (builder.error != null) {
            this.error = builder.error;
        }
        if (builder.cause != null) {
            this.cause = builder.cause;
        }
    }

    /**
     * Get error
     * @return error
    **/
    @JsonProperty("error")
    public com.amazon.ask.model.interfaces.system.Error getError() {
        return error;
    }


    /**
     * Get cause
     * @return cause
    **/
    @JsonProperty("cause")
    public com.amazon.ask.model.interfaces.system.ErrorCause getCause() {
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
        ExceptionEncounteredRequest interfacesSystemExceptionEncounteredRequest = (ExceptionEncounteredRequest) o;
        return Objects.equals(this.error, interfacesSystemExceptionEncounteredRequest.error) &&
            Objects.equals(this.cause, interfacesSystemExceptionEncounteredRequest.cause) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(error, cause, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExceptionEncounteredRequest {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
        private com.amazon.ask.model.interfaces.system.Error error;
        private com.amazon.ask.model.interfaces.system.ErrorCause cause;

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


        @JsonProperty("error")

        public Builder withError(com.amazon.ask.model.interfaces.system.Error error) {
            this.error = error;
            return this;
        }


        @JsonProperty("cause")

        public Builder withCause(com.amazon.ask.model.interfaces.system.ErrorCause cause) {
            this.cause = cause;
            return this;
        }


        public ExceptionEncounteredRequest build() {
            return new ExceptionEncounteredRequest(this);
        }
    }
}

