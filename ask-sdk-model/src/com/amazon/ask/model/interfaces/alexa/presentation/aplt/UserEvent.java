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


package com.amazon.ask.model.interfaces.alexa.presentation.aplt;

import java.util.Objects;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * UserEvent
 */

@JsonDeserialize(builder = UserEvent.Builder.class)
public final class UserEvent extends com.amazon.ask.model.Request  {

    @JsonProperty("token")
    private String token = null;

    @JsonProperty("arguments")
    private List<Object> arguments = new ArrayList<Object>();

    @JsonProperty("source")
    private Object source = null;

    public static Builder builder() {
        return new Builder();
    }

    private UserEvent(Builder builder) {
        String discriminatorValue = "Alexa.Presentation.APLT.UserEvent";

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
        if (builder.arguments != null) {
            this.arguments = builder.arguments;
        }
        if (builder.source != null) {
            this.source = builder.source;
        }
    }

    /**
     * A unique token for the active presentation.
     * @return token
    **/
    @JsonProperty("token")
    public String getToken() {
        return token;
    }


    /**
     * The array of argument data to pass to Alexa.
     * @return arguments
    **/
    @JsonProperty("arguments")
    public List<Object> getArguments() {
        return arguments;
    }


    /**
     * Meta-information about what caused the event to be generated.
     * @return source
    **/
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserEvent interfacesAlexaPresentationApltUserEvent = (UserEvent) o;
        return Objects.equals(this.token, interfacesAlexaPresentationApltUserEvent.token) &&
            Objects.equals(this.arguments, interfacesAlexaPresentationApltUserEvent.arguments) &&
            Objects.equals(this.source, interfacesAlexaPresentationApltUserEvent.source) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, arguments, source, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserEvent {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
        private List<Object> arguments;
        private Object source;

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


        @JsonProperty("arguments")

        public Builder withArguments(List<Object> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder addArgumentsItem(Object argumentsItem) {
            if (this.arguments == null) {
                this.arguments = new ArrayList<Object>();
            }
            this.arguments.add(argumentsItem);
            return this;
        }

        @JsonProperty("source")

        public Builder withSource(Object source) {
            this.source = source;
            return this;
        }


        public UserEvent build() {
            return new UserEvent(this);
        }
    }
}

