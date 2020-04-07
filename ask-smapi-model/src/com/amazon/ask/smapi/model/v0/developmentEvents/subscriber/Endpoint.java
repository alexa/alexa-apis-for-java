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


package com.amazon.ask.smapi.model.v0.developmentEvents.subscriber;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Endpoint
 */

@JsonDeserialize(builder = Endpoint.Builder.class)
public final class Endpoint {

    @JsonProperty("uri")
    private String uri = null;

    @JsonProperty("authorization")
    private com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.EndpointAuthorization authorization = null;

    public static Builder builder() {
        return new Builder();
    }

    private Endpoint(Builder builder) {
        if (builder.uri != null) {
            this.uri = builder.uri;
        }
        if (builder.authorization != null) {
            this.authorization = builder.authorization;
        }
    }

    /**
     * Uri of the endpoint that receives the notification.
     * @return uri
    **/
    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }


    /**
     * Get authorization
     * @return authorization
    **/
    @JsonProperty("authorization")
    public com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.EndpointAuthorization getAuthorization() {
        return authorization;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Endpoint v0DevelopmentEventsSubscriberEndpoint = (Endpoint) o;
        return Objects.equals(this.uri, v0DevelopmentEventsSubscriberEndpoint.uri) &&
            Objects.equals(this.authorization, v0DevelopmentEventsSubscriberEndpoint.authorization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri, authorization);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Endpoint {\n");
        
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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
        private String uri;
        private com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.EndpointAuthorization authorization;

        private Builder() {}

        @JsonProperty("uri")

        public Builder withUri(String uri) {
            this.uri = uri;
            return this;
        }


        @JsonProperty("authorization")

        public Builder withAuthorization(com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.EndpointAuthorization authorization) {
            this.authorization = authorization;
            return this;
        }


        public Endpoint build() {
            return new Endpoint(this);
        }
    }
}

