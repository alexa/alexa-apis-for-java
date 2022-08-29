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


package com.amazon.ask.model.interfaces.connections;

import java.util.Objects;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the request object that a skill will receive as a result of Connections.SendResponse directive from referrer skill.
 */

@JsonDeserialize(builder = ConnectionsResponse.Builder.class)
public final class ConnectionsResponse extends com.amazon.ask.model.Request  {

    @JsonProperty("status")
    private com.amazon.ask.model.interfaces.connections.ConnectionsStatus status = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("payload")
    private Map<String, Object> payload = new HashMap<String, Object>();

    @JsonProperty("token")
    private String token = null;

    private ConnectionsResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ConnectionsResponse(Builder builder) {
        String discriminatorValue = "Connections.Response";

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
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.payload != null) {
            this.payload = builder.payload;
        }
        if (builder.token != null) {
            this.token = builder.token;
        }
    }

    /**
     * Get status
     * @return status
    **/
    @JsonProperty("status")
    public com.amazon.ask.model.interfaces.connections.ConnectionsStatus getStatus() {
        return status;
    }


    /**
     * Name of the action for which response is received.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * This is an object sent from referrer skill as is.
     * @return payload
    **/
    @JsonProperty("payload")
    public Map<String, Object> getPayload() {
        return payload;
    }


    /**
     * This is the token that the skill originally sent with the ConnectionsSendRequest directive.
     * @return token
    **/
    @JsonProperty("token")
    public String getToken() {
        return token;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectionsResponse interfacesConnectionsConnectionsResponse = (ConnectionsResponse) o;
        return Objects.equals(this.status, interfacesConnectionsConnectionsResponse.status) &&
            Objects.equals(this.name, interfacesConnectionsConnectionsResponse.name) &&
            Objects.equals(this.payload, interfacesConnectionsConnectionsResponse.payload) &&
            Objects.equals(this.token, interfacesConnectionsConnectionsResponse.token) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, name, payload, token, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionsResponse {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
        private com.amazon.ask.model.interfaces.connections.ConnectionsStatus status;
        private String name;
        private Map<String, Object> payload;
        private String token;

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


        @JsonProperty("status")

        public Builder withStatus(com.amazon.ask.model.interfaces.connections.ConnectionsStatus status) {
            this.status = status;
            return this;
        }


        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("payload")

        public Builder withPayload(Map<String, Object> payload) {
            this.payload = payload;
            return this;
        }

        public Builder putPayloadItem(String key, Object payloadItem) {
            if (this.payload == null) {
                this.payload = new HashMap<String, Object>();
            }
            this.payload.put(key, payloadItem);
            return this;
        }

        @JsonProperty("token")

        public Builder withToken(String token) {
            this.token = token;
            return this;
        }


        public ConnectionsResponse build() {
            return new ConnectionsResponse(this);
        }
    }
}

