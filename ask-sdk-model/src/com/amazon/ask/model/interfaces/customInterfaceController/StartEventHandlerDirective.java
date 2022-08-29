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


package com.amazon.ask.model.interfaces.customInterfaceController;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This directive configures and starts an event handler. This will enable the skill to receive Custom Events. A skill can only have one active Event Handler at a time.
 */

@JsonDeserialize(builder = StartEventHandlerDirective.Builder.class)
public final class StartEventHandlerDirective extends com.amazon.ask.model.Directive  {

    @JsonProperty("token")
    private String token = null;

    @JsonProperty("eventFilter")
    private com.amazon.ask.model.interfaces.customInterfaceController.EventFilter eventFilter = null;

    @JsonProperty("expiration")
    private com.amazon.ask.model.interfaces.customInterfaceController.Expiration expiration = null;

    private StartEventHandlerDirective() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private StartEventHandlerDirective(Builder builder) {
        String discriminatorValue = "CustomInterfaceController.StartEventHandler";

        this.type = discriminatorValue;
        if (builder.token != null) {
            this.token = builder.token;
        }
        if (builder.eventFilter != null) {
            this.eventFilter = builder.eventFilter;
        }
        if (builder.expiration != null) {
            this.expiration = builder.expiration;
        }
    }

    /**
     * A unique string to identify the Event Handler. This identifier is associated with all events dispatched by the Event Handler while it is active.
     * @return token
    **/
    @JsonProperty("token")
    public String getToken() {
        return token;
    }


    /**
     * Get eventFilter
     * @return eventFilter
    **/
    @JsonProperty("eventFilter")
    public com.amazon.ask.model.interfaces.customInterfaceController.EventFilter getEventFilter() {
        return eventFilter;
    }


    /**
     * Get expiration
     * @return expiration
    **/
    @JsonProperty("expiration")
    public com.amazon.ask.model.interfaces.customInterfaceController.Expiration getExpiration() {
        return expiration;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartEventHandlerDirective interfacesCustomInterfaceControllerStartEventHandlerDirective = (StartEventHandlerDirective) o;
        return Objects.equals(this.token, interfacesCustomInterfaceControllerStartEventHandlerDirective.token) &&
            Objects.equals(this.eventFilter, interfacesCustomInterfaceControllerStartEventHandlerDirective.eventFilter) &&
            Objects.equals(this.expiration, interfacesCustomInterfaceControllerStartEventHandlerDirective.expiration) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, eventFilter, expiration, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartEventHandlerDirective {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
        sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
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
        private String token;
        private com.amazon.ask.model.interfaces.customInterfaceController.EventFilter eventFilter;
        private com.amazon.ask.model.interfaces.customInterfaceController.Expiration expiration;

        private Builder() {}

        @JsonProperty("token")

        public Builder withToken(String token) {
            this.token = token;
            return this;
        }


        @JsonProperty("eventFilter")

        public Builder withEventFilter(com.amazon.ask.model.interfaces.customInterfaceController.EventFilter eventFilter) {
            this.eventFilter = eventFilter;
            return this;
        }


        @JsonProperty("expiration")

        public Builder withExpiration(com.amazon.ask.model.interfaces.customInterfaceController.Expiration expiration) {
            this.expiration = expiration;
            return this;
        }


        public StartEventHandlerDirective build() {
            return new StartEventHandlerDirective(this);
        }
    }
}

