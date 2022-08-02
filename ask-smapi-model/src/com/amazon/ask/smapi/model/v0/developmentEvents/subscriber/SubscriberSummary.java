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
 * SubscriberSummary
 */

@JsonDeserialize(builder = SubscriberSummary.Builder.class)
public final class SubscriberSummary {

    @JsonProperty("subscriberId")
    private String subscriberId = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("clientId")
    private String clientId = null;

    @JsonProperty("endpoint")
    private com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.Endpoint endpoint = null;

    private SubscriberSummary() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SubscriberSummary(Builder builder) {
        if (builder.subscriberId != null) {
            this.subscriberId = builder.subscriberId;
        }
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.clientId != null) {
            this.clientId = builder.clientId;
        }
        if (builder.endpoint != null) {
            this.endpoint = builder.endpoint;
        }
    }

    /**
     * Unique identifier of the subscriber resource.
     * @return subscriberId
    **/
    @JsonProperty("subscriberId")
    public String getSubscriberId() {
        return subscriberId;
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
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.SubscriberStatus getStatus() {
        return com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.SubscriberStatus.fromValue(status);
    }

    /**
     * Get the underlying String value for status.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return status as a String value
    **/
    @JsonProperty("status")
    public String getStatusAsString() {
      return status;
    }

    /**
     * Client Id of the subscriber resource.
     * @return clientId
    **/
    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
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
        SubscriberSummary v0DevelopmentEventsSubscriberSubscriberSummary = (SubscriberSummary) o;
        return Objects.equals(this.subscriberId, v0DevelopmentEventsSubscriberSubscriberSummary.subscriberId) &&
            Objects.equals(this.name, v0DevelopmentEventsSubscriberSubscriberSummary.name) &&
            Objects.equals(this.status, v0DevelopmentEventsSubscriberSubscriberSummary.status) &&
            Objects.equals(this.clientId, v0DevelopmentEventsSubscriberSubscriberSummary.clientId) &&
            Objects.equals(this.endpoint, v0DevelopmentEventsSubscriberSubscriberSummary.endpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriberId, name, status, clientId, endpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriberSummary {\n");
        
        sb.append("    subscriberId: ").append(toIndentedString(subscriberId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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
        private String subscriberId;
        private String name;
        private String status;
        private String clientId;
        private com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.Endpoint endpoint;

        private Builder() {}

        @JsonProperty("subscriberId")

        public Builder withSubscriberId(String subscriberId) {
            this.subscriberId = subscriberId;
            return this;
        }


        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("status")

        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.SubscriberStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("clientId")

        public Builder withClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }


        @JsonProperty("endpoint")

        public Builder withEndpoint(com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.Endpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }


        public SubscriberSummary build() {
            return new SubscriberSummary(this);
        }
    }
}

