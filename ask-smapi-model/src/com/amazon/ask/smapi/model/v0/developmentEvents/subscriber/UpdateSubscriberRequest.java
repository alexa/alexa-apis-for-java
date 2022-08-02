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
 * UpdateSubscriberRequest
 */

@JsonDeserialize(builder = UpdateSubscriberRequest.Builder.class)
public final class UpdateSubscriberRequest {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("endpoint")
    private com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.Endpoint endpoint = null;

    private UpdateSubscriberRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private UpdateSubscriberRequest(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.endpoint != null) {
            this.endpoint = builder.endpoint;
        }
    }

    /**
     * Name of the subscriber.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Get endpoint
     * @return endpoint
    **/
    @JsonProperty("endpoint")
    public com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.Endpoint getEndpoint() {
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
        UpdateSubscriberRequest v0DevelopmentEventsSubscriberUpdateSubscriberRequest = (UpdateSubscriberRequest) o;
        return Objects.equals(this.name, v0DevelopmentEventsSubscriberUpdateSubscriberRequest.name) &&
            Objects.equals(this.endpoint, v0DevelopmentEventsSubscriberUpdateSubscriberRequest.endpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, endpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSubscriberRequest {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
        private String name;
        private com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.Endpoint endpoint;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("endpoint")

        public Builder withEndpoint(com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.Endpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }


        public UpdateSubscriberRequest build() {
            return new UpdateSubscriberRequest(this);
        }
    }
}

