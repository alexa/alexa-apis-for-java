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


package com.amazon.ask.model.interfaces.alexa.presentation.apl;

import java.util.Objects;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Notifies the skill of any errors in APL functionality.
 */

@JsonDeserialize(builder = RuntimeErrorEvent.Builder.class)
public final class RuntimeErrorEvent extends com.amazon.ask.model.Request  {

    @JsonProperty("token")
    private String token = null;

    @JsonProperty("errors")
    private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.RuntimeError> errors = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.RuntimeError>();

    private RuntimeErrorEvent() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private RuntimeErrorEvent(Builder builder) {
        String discriminatorValue = "Alexa.Presentation.APL.RuntimeError";

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
        if (builder.token != null) {
            this.token = builder.token;
        }
        if (builder.errors != null) {
            this.errors = builder.errors;
        }
    }

    /**
     * The unique identifier of the presentation in which the error occurred.
     * @return token
    **/
    @JsonProperty("token")
    public String getToken() {
        return token;
    }


    /**
     * An array of errors encountered while running the APL presentation.
     * @return errors
    **/
    @JsonProperty("errors")
    public List<com.amazon.ask.model.interfaces.alexa.presentation.apl.RuntimeError> getErrors() {
        return errors;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuntimeErrorEvent interfacesAlexaPresentationAplRuntimeErrorEvent = (RuntimeErrorEvent) o;
        return Objects.equals(this.token, interfacesAlexaPresentationAplRuntimeErrorEvent.token) &&
            Objects.equals(this.errors, interfacesAlexaPresentationAplRuntimeErrorEvent.errors) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, errors, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuntimeErrorEvent {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
        private String token;
        private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.RuntimeError> errors;

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


        @JsonProperty("token")

        public Builder withToken(String token) {
            this.token = token;
            return this;
        }


        @JsonProperty("errors")

        public Builder withErrors(List<com.amazon.ask.model.interfaces.alexa.presentation.apl.RuntimeError> errors) {
            this.errors = errors;
            return this;
        }

        public Builder addErrorsItem(com.amazon.ask.model.interfaces.alexa.presentation.apl.RuntimeError errorsItem) {
            if (this.errors == null) {
                this.errors = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.RuntimeError>();
            }
            this.errors.add(errorsItem);
            return this;
        }

        public RuntimeErrorEvent build() {
            return new RuntimeErrorEvent(this);
        }
    }
}

