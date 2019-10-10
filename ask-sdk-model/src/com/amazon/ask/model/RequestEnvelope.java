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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request wrapper for all requests sent to your Skill.
 */

@JsonDeserialize(builder = RequestEnvelope.Builder.class)
public final class RequestEnvelope {

    @JsonProperty("version")
    private String version = null;

    @JsonProperty("session")
    private com.amazon.ask.model.Session session = null;

    @JsonProperty("context")
    private com.amazon.ask.model.Context context = null;

    @JsonProperty("request")
    private com.amazon.ask.model.Request request = null;

    public static Builder builder() {
        return new Builder();
    }

    private RequestEnvelope(Builder builder) {
        if (builder.version != null) {
            this.version = builder.version;
        }
        if (builder.session != null) {
            this.session = builder.session;
        }
        if (builder.context != null) {
            this.context = builder.context;
        }
        if (builder.request != null) {
            this.request = builder.request;
        }
    }

    /**
     * The version specifier for the request.
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * The session object provides additional context associated with the request.
     * @return session
    **/
    @JsonProperty("session")
    public com.amazon.ask.model.Session getSession() {
        return session;
    }

    /**
     * The context object provides your skill with information about the current state of the Alexa service and device at the time the request is sent to your service. This is included on all requests. For requests sent in the context of a session (LaunchRequest and IntentRequest), the context object duplicates the user and application information that is also available in the session.
     * @return context
    **/
    @JsonProperty("context")
    public com.amazon.ask.model.Context getContext() {
        return context;
    }

    /**
     * A request object that provides the details of the user’s request.
     * @return request
    **/
    @JsonProperty("request")
    public com.amazon.ask.model.Request getRequest() {
        return request;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RequestEnvelope requestEnvelope = (RequestEnvelope) o;
        return Objects.equals(this.version, requestEnvelope.version) &&
            Objects.equals(this.session, requestEnvelope.session) &&
            Objects.equals(this.context, requestEnvelope.context) &&
            Objects.equals(this.request, requestEnvelope.request);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, session, context, request);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequestEnvelope {\n");
        
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    session: ").append(toIndentedString(session)).append("\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
        sb.append("    request: ").append(toIndentedString(request)).append("\n");
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
        private com.amazon.ask.model.Session session;
        private com.amazon.ask.model.Context context;
        private com.amazon.ask.model.Request request;

        private Builder() {}

        @JsonProperty("version")
        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        @JsonProperty("session")
        public Builder withSession(com.amazon.ask.model.Session session) {
            this.session = session;
            return this;
        }


        @JsonProperty("context")
        public Builder withContext(com.amazon.ask.model.Context context) {
            this.context = context;
            return this;
        }


        @JsonProperty("request")
        public Builder withRequest(com.amazon.ask.model.Request request) {
            this.request = request;
            return this;
        }


        public RequestEnvelope build() {
            return new RequestEnvelope(this);
        }
    }
}

