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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the directive that a skill can send as part of their response to a session based request to execute a predefined Connections. This will also return a result to the referring skill. (No Guarantee response will be returned)
 */

@JsonDeserialize(builder = SendRequestDirective.Builder.class)
public final class SendRequestDirective extends com.amazon.ask.model.Directive  {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("payload")
    private Map<String, Object> payload = new HashMap<String, Object>();

    @JsonProperty("token")
    private String token = null;

    private SendRequestDirective() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SendRequestDirective(Builder builder) {
        String discriminatorValue = "Connections.SendRequest";

        this.type = discriminatorValue;
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
     * This defines the name of the Connection skill is trying to execute. It must be a valid and supported Connection name.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * This is an object sent between the two skills for processing a ConnectionsRequest or ConnectionsResponse. The contract for the object is based on the schema of the Action used in the SendRequestDirective. Invalid payloads will result in errors sent back to the referrer.
     * @return payload
    **/
    @JsonProperty("payload")
    public Map<String, Object> getPayload() {
        return payload;
    }


    /**
     * This is an echo back string that skills send when during Connections.SendRequest directive. They will receive it when they get the ConnectionsResponse. It is never sent to the skill handling the request.
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
        SendRequestDirective interfacesConnectionsSendRequestDirective = (SendRequestDirective) o;
        return Objects.equals(this.name, interfacesConnectionsSendRequestDirective.name) &&
            Objects.equals(this.payload, interfacesConnectionsSendRequestDirective.payload) &&
            Objects.equals(this.token, interfacesConnectionsSendRequestDirective.token) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, payload, token, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendRequestDirective {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
        private String name;
        private Map<String, Object> payload;
        private String token;

        private Builder() {}

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


        public SendRequestDirective build() {
            return new SendRequestDirective(this);
        }
    }
}

