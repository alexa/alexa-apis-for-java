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


package com.amazon.ask.model.services.proactiveEvents;

import java.util.Objects;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * CreateProactiveEventRequest
 */

@JsonDeserialize(builder = CreateProactiveEventRequest.Builder.class)
public final class CreateProactiveEventRequest {

    @JsonProperty("timestamp")
    private OffsetDateTime timestamp = null;

    @JsonProperty("referenceId")
    private String referenceId = null;

    @JsonProperty("expiryTime")
    private OffsetDateTime expiryTime = null;

    @JsonProperty("event")
    private com.amazon.ask.model.services.proactiveEvents.Event event = null;

    @JsonProperty("localizedAttributes")
    private List<Object> localizedAttributes = new ArrayList<Object>();

    @JsonProperty("relevantAudience")
    private com.amazon.ask.model.services.proactiveEvents.RelevantAudience relevantAudience = null;

    public static Builder builder() {
        return new Builder();
    }

    private CreateProactiveEventRequest(Builder builder) {
        if (builder.timestamp != null) {
            this.timestamp = builder.timestamp;
        }
        if (builder.referenceId != null) {
            this.referenceId = builder.referenceId;
        }
        if (builder.expiryTime != null) {
            this.expiryTime = builder.expiryTime;
        }
        if (builder.event != null) {
            this.event = builder.event;
        }
        if (builder.localizedAttributes != null) {
            this.localizedAttributes = builder.localizedAttributes;
        }
        if (builder.relevantAudience != null) {
            this.relevantAudience = builder.relevantAudience;
        }
    }

    /**
     * The date and time of the event associated with this request, in ISO 8601 format.
     * @return timestamp
    **/
    @JsonProperty("timestamp")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Client-supplied ID for correlating the event with external entities. The allowed characters for the referenceId field are alphanumeric and ~, and the length of the referenceId field must be 1-100 characters. 
     * @return referenceId
    **/
    @JsonProperty("referenceId")
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * The date and time, in ISO 8601 format, when the service will automatically delete the notification if it is still in the pending state. 
     * @return expiryTime
    **/
    @JsonProperty("expiryTime")
    public OffsetDateTime getExpiryTime() {
        return expiryTime;
    }

    /**
     * Get event
     * @return event
    **/
    @JsonProperty("event")
    public com.amazon.ask.model.services.proactiveEvents.Event getEvent() {
        return event;
    }

    /**
     * A list of items, each of which contains the set of event attributes that requires localization support.
     * @return localizedAttributes
    **/
    @JsonProperty("localizedAttributes")
    public List<Object> getLocalizedAttributes() {
        return localizedAttributes;
    }

    /**
     * Get relevantAudience
     * @return relevantAudience
    **/
    @JsonProperty("relevantAudience")
    public com.amazon.ask.model.services.proactiveEvents.RelevantAudience getRelevantAudience() {
        return relevantAudience;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateProactiveEventRequest servicesProactiveEventsCreateProactiveEventRequest = (CreateProactiveEventRequest) o;
        return Objects.equals(this.timestamp, servicesProactiveEventsCreateProactiveEventRequest.timestamp) &&
            Objects.equals(this.referenceId, servicesProactiveEventsCreateProactiveEventRequest.referenceId) &&
            Objects.equals(this.expiryTime, servicesProactiveEventsCreateProactiveEventRequest.expiryTime) &&
            Objects.equals(this.event, servicesProactiveEventsCreateProactiveEventRequest.event) &&
            Objects.equals(this.localizedAttributes, servicesProactiveEventsCreateProactiveEventRequest.localizedAttributes) &&
            Objects.equals(this.relevantAudience, servicesProactiveEventsCreateProactiveEventRequest.relevantAudience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, referenceId, expiryTime, event, localizedAttributes, relevantAudience);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProactiveEventRequest {\n");
        
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
        sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    localizedAttributes: ").append(toIndentedString(localizedAttributes)).append("\n");
        sb.append("    relevantAudience: ").append(toIndentedString(relevantAudience)).append("\n");
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
        private String referenceId;
        private OffsetDateTime expiryTime;
        private com.amazon.ask.model.services.proactiveEvents.Event event;
        private List<Object> localizedAttributes;
        private com.amazon.ask.model.services.proactiveEvents.RelevantAudience relevantAudience;

        private Builder() {}

        @JsonProperty("timestamp")
        public Builder withTimestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }


        @JsonProperty("referenceId")
        public Builder withReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }


        @JsonProperty("expiryTime")
        public Builder withExpiryTime(OffsetDateTime expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }


        @JsonProperty("event")
        public Builder withEvent(com.amazon.ask.model.services.proactiveEvents.Event event) {
            this.event = event;
            return this;
        }


        @JsonProperty("localizedAttributes")
        public Builder withLocalizedAttributes(List<Object> localizedAttributes) {
            this.localizedAttributes = localizedAttributes;
            return this;
        }

        public Builder addLocalizedAttributesItem(Object localizedAttributesItem) {
            if (this.localizedAttributes == null) {
                this.localizedAttributes = new ArrayList<Object>();
            }
            this.localizedAttributes.add(localizedAttributesItem);
            return this;
        }

        @JsonProperty("relevantAudience")
        public Builder withRelevantAudience(com.amazon.ask.model.services.proactiveEvents.RelevantAudience relevantAudience) {
            this.relevantAudience = relevantAudience;
            return this;
        }


        public CreateProactiveEventRequest build() {
            return new CreateProactiveEventRequest(this);
        }
    }
}

