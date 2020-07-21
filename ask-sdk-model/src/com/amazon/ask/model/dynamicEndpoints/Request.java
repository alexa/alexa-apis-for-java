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


package com.amazon.ask.model.dynamicEndpoints;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request from a Dynamic endpoint connection.
 */

@JsonDeserialize(builder = Request.Builder.class)
public final class Request {

    @JsonProperty("version")
    private String version = null;

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("requestId")
    private String requestId = null;

    @JsonProperty("requestPayload")
    private String requestPayload = null;

    public static Builder builder() {
        return new Builder();
    }

    private Request(Builder builder) {
        if (builder.version != null) {
            this.version = builder.version;
        }
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.requestId != null) {
            this.requestId = builder.requestId;
        }
        if (builder.requestPayload != null) {
            this.requestPayload = builder.requestPayload;
        }
    }

    /**
     * The version of the request message schema used.
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }


    /**
     * Denotes type of request.
     * @return type
    **/
    @JsonProperty("type")
    public String getType() {
        return type;
    }


    /**
     * The requestId for the dynamic endpoint request.
     * @return requestId
    **/
    @JsonProperty("requestId")
    public String getRequestId() {
        return requestId;
    }


    /**
     * The request payload.
     * @return requestPayload
    **/
    @JsonProperty("requestPayload")
    public String getRequestPayload() {
        return requestPayload;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Request dynamicEndpointsRequest = (Request) o;
        return Objects.equals(this.version, dynamicEndpointsRequest.version) &&
            Objects.equals(this.type, dynamicEndpointsRequest.type) &&
            Objects.equals(this.requestId, dynamicEndpointsRequest.requestId) &&
            Objects.equals(this.requestPayload, dynamicEndpointsRequest.requestPayload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, type, requestId, requestPayload);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Request {\n");
        
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    requestPayload: ").append(toIndentedString(requestPayload)).append("\n");
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
        private String version;
        private String type;
        private String requestId;
        private String requestPayload;

        private Builder() {}

        @JsonProperty("version")

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        @JsonProperty("type")

        public Builder withType(String type) {
            this.type = type;
            return this;
        }


        @JsonProperty("requestId")

        public Builder withRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }


        @JsonProperty("requestPayload")

        public Builder withRequestPayload(String requestPayload) {
            this.requestPayload = requestPayload;
            return this;
        }


        public Request build() {
            return new Request(this);
        }
    }
}

