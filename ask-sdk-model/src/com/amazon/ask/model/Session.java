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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a single execution of the alexa service
 */

@JsonDeserialize(builder = Session.Builder.class)
public final class Session {

    @JsonProperty("new")
    private Boolean _new = null;

    @JsonProperty("sessionId")
    private String sessionId = null;

    @JsonProperty("user")
    private com.amazon.ask.model.User user = null;

    @JsonProperty("attributes")
    private Map<String, Object> attributes = new HashMap<String, Object>();

    @JsonProperty("application")
    private com.amazon.ask.model.Application application = null;

    public static Builder builder() {
        return new Builder();
    }

    private Session(Builder builder) {
        if (builder._new != null) {
            this._new = builder._new;
        }
        if (builder.sessionId != null) {
            this.sessionId = builder.sessionId;
        }
        if (builder.user != null) {
            this.user = builder.user;
        }
        if (builder.attributes != null) {
            this.attributes = builder.attributes;
        }
        if (builder.application != null) {
            this.application = builder.application;
        }
    }

    /**
     * A boolean value indicating whether this is a new session. Returns true for a new session or false for an existing session.
     * @return _new
    **/
    @JsonProperty("new")
    public Boolean getNew() {
        return _new;
    }

    /**
     * A string that represents a unique identifier per a user’s active session.
     * @return sessionId
    **/
    @JsonProperty("sessionId")
    public String getSessionId() {
        return sessionId;
    }

    /**
     * An object that describes the user making the request.
     * @return user
    **/
    @JsonProperty("user")
    public com.amazon.ask.model.User getUser() {
        return user;
    }

    /**
     * A map of key-value pairs. The attributes map is empty for requests where a new session has started with the property new set to true. When returning your response, you can include data you need to persist during the session in the sessionAttributes property. The attributes you provide are then passed back to your skill on the next request.
     * @return attributes
    **/
    @JsonProperty("attributes")
    public Map<String, Object> getAttributes() {
        return attributes;
    }

    /**
     * Get application
     * @return application
    **/
    @JsonProperty("application")
    public com.amazon.ask.model.Application getApplication() {
        return application;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Session session = (Session) o;
        return Objects.equals(this._new, session._new) &&
            Objects.equals(this.sessionId, session.sessionId) &&
            Objects.equals(this.user, session.user) &&
            Objects.equals(this.attributes, session.attributes) &&
            Objects.equals(this.application, session.application);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_new, sessionId, user, attributes, application);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Session {\n");
        
        sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
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
        private Boolean _new;
        private String sessionId;
        private com.amazon.ask.model.User user;
        private Map<String, Object> attributes;
        private com.amazon.ask.model.Application application;

        private Builder() {}

        @JsonProperty("new")
        public Builder withNew(Boolean _new) {
            this._new = _new;
            return this;
        }


        @JsonProperty("sessionId")
        public Builder withSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }


        @JsonProperty("user")
        public Builder withUser(com.amazon.ask.model.User user) {
            this.user = user;
            return this;
        }


        @JsonProperty("attributes")
        public Builder withAttributes(Map<String, Object> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder putAttributesItem(String key, Object attributesItem) {
            if (this.attributes == null) {
                this.attributes = new HashMap<String, Object>();
            }
            this.attributes.put(key, attributesItem);
            return this;
        }

        @JsonProperty("application")
        public Builder withApplication(com.amazon.ask.model.Application application) {
            this.application = application;
            return this;
        }


        public Session build() {
            return new Session(this);
        }
    }
}

