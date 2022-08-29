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
 * An Event object defining a single event sent by an endpoint
 */

@JsonDeserialize(builder = Event.Builder.class)
public final class Event {

    @JsonProperty("header")
    private com.amazon.ask.model.interfaces.customInterfaceController.Header header = null;

    @JsonProperty("payload")
    private Object payload = null;

    @JsonProperty("endpoint")
    private com.amazon.ask.model.interfaces.customInterfaceController.Endpoint endpoint = null;

    private Event() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Event(Builder builder) {
        if (builder.header != null) {
            this.header = builder.header;
        }
        if (builder.payload != null) {
            this.payload = builder.payload;
        }
        if (builder.endpoint != null) {
            this.endpoint = builder.endpoint;
        }
    }

    /**
     * The object that contains the header of the event.
     * @return header
    **/
    @JsonProperty("header")
    public com.amazon.ask.model.interfaces.customInterfaceController.Header getHeader() {
        return header;
    }


    /**
     * The free form JSON object.
     * @return payload
    **/
    @JsonProperty("payload")
    public Object getPayload() {
        return payload;
    }


    /**
     * Identifies where the event orginated from.
     * @return endpoint
    **/
    @JsonProperty("endpoint")
    public com.amazon.ask.model.interfaces.customInterfaceController.Endpoint getEndpoint() {
        return endpoint;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Event interfacesCustomInterfaceControllerEvent = (Event) o;
        return Objects.equals(this.header, interfacesCustomInterfaceControllerEvent.header) &&
            Objects.equals(this.payload, interfacesCustomInterfaceControllerEvent.payload) &&
            Objects.equals(this.endpoint, interfacesCustomInterfaceControllerEvent.endpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, payload, endpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event {\n");
        
        sb.append("    header: ").append(toIndentedString(header)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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
        private com.amazon.ask.model.interfaces.customInterfaceController.Header header;
        private Object payload;
        private com.amazon.ask.model.interfaces.customInterfaceController.Endpoint endpoint;

        private Builder() {}

        @JsonProperty("header")

        public Builder withHeader(com.amazon.ask.model.interfaces.customInterfaceController.Header header) {
            this.header = header;
            return this;
        }


        @JsonProperty("payload")

        public Builder withPayload(Object payload) {
            this.payload = payload;
            return this;
        }


        @JsonProperty("endpoint")

        public Builder withEndpoint(com.amazon.ask.model.interfaces.customInterfaceController.Endpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }


        public Event build() {
            return new Event(this);
        }
    }
}

