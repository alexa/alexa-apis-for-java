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


package com.amazon.ask.model.events.skillevents;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SkillEnabledRequest
 */

@JsonDeserialize(builder = SkillEnabledRequest.Builder.class)
public final class SkillEnabledRequest extends com.amazon.ask.model.Request  {

    @JsonProperty("eventCreationTime")
    private OffsetDateTime eventCreationTime = null;

    @JsonProperty("eventPublishingTime")
    private OffsetDateTime eventPublishingTime = null;

    private SkillEnabledRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SkillEnabledRequest(Builder builder) {
        String discriminatorValue = "AlexaSkillEvent.SkillEnabled";

        this.type = discriminatorValue;
        if (builder.requestId != null) {
            this.requestId = builder.requestId;
        }
        if (builder.timestamp != null) {
            this.timestamp = builder.timestamp;
        }
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
        if (builder.eventCreationTime != null) {
            this.eventCreationTime = builder.eventCreationTime;
        }
        if (builder.eventPublishingTime != null) {
            this.eventPublishingTime = builder.eventPublishingTime;
        }
    }

    /**
     * Get eventCreationTime
     * @return eventCreationTime
    **/
    @JsonProperty("eventCreationTime")
    public OffsetDateTime getEventCreationTime() {
        return eventCreationTime;
    }


    /**
     * Get eventPublishingTime
     * @return eventPublishingTime
    **/
    @JsonProperty("eventPublishingTime")
    public OffsetDateTime getEventPublishingTime() {
        return eventPublishingTime;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillEnabledRequest eventsSkilleventsSkillEnabledRequest = (SkillEnabledRequest) o;
        return Objects.equals(this.eventCreationTime, eventsSkilleventsSkillEnabledRequest.eventCreationTime) &&
            Objects.equals(this.eventPublishingTime, eventsSkilleventsSkillEnabledRequest.eventPublishingTime) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventCreationTime, eventPublishingTime, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillEnabledRequest {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    eventCreationTime: ").append(toIndentedString(eventCreationTime)).append("\n");
        sb.append("    eventPublishingTime: ").append(toIndentedString(eventPublishingTime)).append("\n");
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
        private String requestId;
        private OffsetDateTime timestamp;
        private String locale;
        private OffsetDateTime eventCreationTime;
        private OffsetDateTime eventPublishingTime;

        private Builder() {}

        @JsonProperty("requestId")

        public Builder withRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }


        @JsonProperty("timestamp")

        public Builder withTimestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }


        @JsonProperty("locale")

        public Builder withLocale(String locale) {
            this.locale = locale;
            return this;
        }


        @JsonProperty("eventCreationTime")

        public Builder withEventCreationTime(OffsetDateTime eventCreationTime) {
            this.eventCreationTime = eventCreationTime;
            return this;
        }


        @JsonProperty("eventPublishingTime")

        public Builder withEventPublishingTime(OffsetDateTime eventPublishingTime) {
            this.eventPublishingTime = eventPublishingTime;
            return this;
        }


        public SkillEnabledRequest build() {
            return new SkillEnabledRequest(this);
        }
    }
}

