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


package com.amazon.ask.smapi.model.v0.eventSchema.AlexaDevelopmentEvent;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * &#39;AlexaDevelopmentEvent.InteractionModelUpdate&#39; event represents the status of set/update interaction model request. The update request may complete either with &#x60;SUCCEEDED&#x60; or &#x60;FAILED&#x60; status. 
 */

@JsonDeserialize(builder = InteractionModelUpdate.Builder.class)
public final class InteractionModelUpdate extends com.amazon.ask.smapi.model.v0.eventSchema.BaseSchema  {

    @JsonProperty("requestId")
    private String requestId = null;

    @JsonProperty("payload")
    private com.amazon.ask.smapi.model.v0.eventSchema.InteractionModelEventAttributes payload = null;

    public static Builder builder() {
        return new Builder();
    }

    private InteractionModelUpdate(Builder builder) {
        String discriminatorValue = "AlexaDevelopmentEvent.InteractionModelUpdate";

        if (builder.timestamp != null) {
            this.timestamp = builder.timestamp;
        }
        this.eventName = discriminatorValue;
        if (builder.requestId != null) {
            this.requestId = builder.requestId;
        }
        if (builder.payload != null) {
            this.payload = builder.payload;
        }
    }

    /**
     * A development notification includes a unique identifier that identifies the original request that resulted in the development notification. The requestId for original request is returned by Amazon APIs in response's 'X-Amzn-RequestId' header. 
     * @return requestId
    **/
    @JsonProperty("requestId")
    public String getRequestId() {
        return requestId;
    }


    /**
     * Get payload
     * @return payload
    **/
    @JsonProperty("payload")
    public com.amazon.ask.smapi.model.v0.eventSchema.InteractionModelEventAttributes getPayload() {
        return payload;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InteractionModelUpdate v0EventSchemaAlexaDevelopmentEventInteractionModelUpdate = (InteractionModelUpdate) o;
        return Objects.equals(this.requestId, v0EventSchemaAlexaDevelopmentEventInteractionModelUpdate.requestId) &&
            Objects.equals(this.payload, v0EventSchemaAlexaDevelopmentEventInteractionModelUpdate.payload) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, payload, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InteractionModelUpdate {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
        private OffsetDateTime timestamp;
        private String requestId;
        private com.amazon.ask.smapi.model.v0.eventSchema.InteractionModelEventAttributes payload;

        private Builder() {}

        @JsonProperty("timestamp")

        public Builder withTimestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }


        @JsonProperty("requestId")

        public Builder withRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }


        @JsonProperty("payload")

        public Builder withPayload(com.amazon.ask.smapi.model.v0.eventSchema.InteractionModelEventAttributes payload) {
            this.payload = payload;
            return this;
        }


        public InteractionModelUpdate build() {
            return new InteractionModelUpdate(this);
        }
    }
}

