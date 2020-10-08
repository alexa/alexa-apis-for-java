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
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ResponseEnvelope
 */

@JsonDeserialize(builder = ResponseEnvelope.Builder.class)
public final class ResponseEnvelope {

    @JsonProperty("version")
    private String version = null;

    @JsonProperty("sessionAttributes")
    @JsonInclude(JsonInclude.Include.ALWAYS)
    private Map<String, Object> sessionAttributes = new HashMap<String, Object>();

    @JsonProperty("userAgent")
    private String userAgent = null;

    @JsonProperty("response")
    private com.amazon.ask.model.Response response = null;

    public static Builder builder() {
        return new Builder();
    }

    private ResponseEnvelope(Builder builder) {
        if (builder.version != null) {
            this.version = builder.version;
        }
        if (builder.sessionAttributes != null) {
            this.sessionAttributes = builder.sessionAttributes;
        }
        if (builder.userAgent != null) {
            this.userAgent = builder.userAgent;
        }
        if (builder.response != null) {
            this.response = builder.response;
        }
    }

    /**
     * Get version
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }


    /**
     * Get sessionAttributes
     * @return sessionAttributes
    **/
    @JsonProperty("sessionAttributes")
    public Map<String, Object> getSessionAttributes() {
        return sessionAttributes;
    }


    /**
     * Get userAgent
     * @return userAgent
    **/
    @JsonProperty("userAgent")
    public String getUserAgent() {
        return userAgent;
    }


    /**
     * Get response
     * @return response
    **/
    @JsonProperty("response")
    public com.amazon.ask.model.Response getResponse() {
        return response;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseEnvelope responseEnvelope = (ResponseEnvelope) o;
        return Objects.equals(this.version, responseEnvelope.version) &&
            Objects.equals(this.sessionAttributes, responseEnvelope.sessionAttributes) &&
            Objects.equals(this.userAgent, responseEnvelope.userAgent) &&
            Objects.equals(this.response, responseEnvelope.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, sessionAttributes, userAgent, response);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseEnvelope {\n");
        
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    sessionAttributes: ").append(toIndentedString(sessionAttributes)).append("\n");
        sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
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
        private Map<String, Object> sessionAttributes;
        private String userAgent;
        private com.amazon.ask.model.Response response;

        private Builder() {}

        @JsonProperty("version")

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        @JsonProperty("sessionAttributes")

        public Builder withSessionAttributes(Map<String, Object> sessionAttributes) {
            this.sessionAttributes = sessionAttributes;
            return this;
        }

        public Builder putSessionAttributesItem(String key, Object sessionAttributesItem) {
            if (this.sessionAttributes == null) {
                this.sessionAttributes = new HashMap<String, Object>();
            }
            this.sessionAttributes.put(key, sessionAttributesItem);
            return this;
        }

        @JsonProperty("userAgent")

        public Builder withUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }


        @JsonProperty("response")

        public Builder withResponse(com.amazon.ask.model.Response response) {
            this.response = response;
            return this;
        }


        public ResponseEnvelope build() {
            return new ResponseEnvelope(this);
        }
    }
}

