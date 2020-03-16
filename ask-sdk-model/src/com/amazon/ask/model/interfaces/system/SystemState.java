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


package com.amazon.ask.model.interfaces.system;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SystemState
 */

@JsonDeserialize(builder = SystemState.Builder.class)
public final class SystemState {

    @JsonProperty("application")
    private com.amazon.ask.model.Application application = null;

    @JsonProperty("user")
    private com.amazon.ask.model.User user = null;

    @JsonProperty("device")
    private com.amazon.ask.model.Device device = null;

    @JsonProperty("person")
    private com.amazon.ask.model.Person person = null;

    @JsonProperty("apiEndpoint")
    private String apiEndpoint = null;

    @JsonProperty("apiAccessToken")
    private String apiAccessToken = null;

    public static Builder builder() {
        return new Builder();
    }

    private SystemState(Builder builder) {
        if (builder.application != null) {
            this.application = builder.application;
        }
        if (builder.user != null) {
            this.user = builder.user;
        }
        if (builder.device != null) {
            this.device = builder.device;
        }
        if (builder.person != null) {
            this.person = builder.person;
        }
        if (builder.apiEndpoint != null) {
            this.apiEndpoint = builder.apiEndpoint;
        }
        if (builder.apiAccessToken != null) {
            this.apiAccessToken = builder.apiAccessToken;
        }
    }

    /**
     * Get application
     * @return application
    **/
    @JsonProperty("application")
    public com.amazon.ask.model.Application getApplication() {
        return application;
    }


    /**
     * Get user
     * @return user
    **/
    @JsonProperty("user")
    public com.amazon.ask.model.User getUser() {
        return user;
    }


    /**
     * Get device
     * @return device
    **/
    @JsonProperty("device")
    public com.amazon.ask.model.Device getDevice() {
        return device;
    }


    /**
     * Get person
     * @return person
    **/
    @JsonProperty("person")
    public com.amazon.ask.model.Person getPerson() {
        return person;
    }


    /**
     * A string that references the correct base URI to refer to by region, for use with APIs such as the Device Location API and Progressive Response API.
     * @return apiEndpoint
    **/
    @JsonProperty("apiEndpoint")
    public String getApiEndpoint() {
        return apiEndpoint;
    }


    /**
     * A bearer token string that can be used by the skill (during the skill session) to access Alexa APIs resources of the registered Alexa customer and/or person who is making the request. This token encapsulates the permissions authorized under the registered Alexa account and device, and (optionally) the recognized person. Some resources, such as name or email, require explicit customer consent.\" 
     * @return apiAccessToken
    **/
    @JsonProperty("apiAccessToken")
    public String getApiAccessToken() {
        return apiAccessToken;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SystemState interfacesSystemSystemState = (SystemState) o;
        return Objects.equals(this.application, interfacesSystemSystemState.application) &&
            Objects.equals(this.user, interfacesSystemSystemState.user) &&
            Objects.equals(this.device, interfacesSystemSystemState.device) &&
            Objects.equals(this.person, interfacesSystemSystemState.person) &&
            Objects.equals(this.apiEndpoint, interfacesSystemSystemState.apiEndpoint) &&
            Objects.equals(this.apiAccessToken, interfacesSystemSystemState.apiAccessToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(application, user, device, person, apiEndpoint, apiAccessToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemState {\n");
        
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    person: ").append(toIndentedString(person)).append("\n");
        sb.append("    apiEndpoint: ").append(toIndentedString(apiEndpoint)).append("\n");
        sb.append("    apiAccessToken: ").append(toIndentedString(apiAccessToken)).append("\n");
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
        private com.amazon.ask.model.Application application;
        private com.amazon.ask.model.User user;
        private com.amazon.ask.model.Device device;
        private com.amazon.ask.model.Person person;
        private String apiEndpoint;
        private String apiAccessToken;

        private Builder() {}

        @JsonProperty("application")

        public Builder withApplication(com.amazon.ask.model.Application application) {
            this.application = application;
            return this;
        }


        @JsonProperty("user")

        public Builder withUser(com.amazon.ask.model.User user) {
            this.user = user;
            return this;
        }


        @JsonProperty("device")

        public Builder withDevice(com.amazon.ask.model.Device device) {
            this.device = device;
            return this;
        }


        @JsonProperty("person")

        public Builder withPerson(com.amazon.ask.model.Person person) {
            this.person = person;
            return this;
        }


        @JsonProperty("apiEndpoint")

        public Builder withApiEndpoint(String apiEndpoint) {
            this.apiEndpoint = apiEndpoint;
            return this;
        }


        @JsonProperty("apiAccessToken")

        public Builder withApiAccessToken(String apiAccessToken) {
            this.apiAccessToken = apiAccessToken;
            return this;
        }


        public SystemState build() {
            return new SystemState(this);
        }
    }
}

