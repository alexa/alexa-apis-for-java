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


package com.amazon.ask.smapi.model.v0.eventSchema.AlexaCustomerFeedbackEvent;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * &#39;AlexaCustomerFeedbackEvent.SkillReviewPublish&#39; event represents the publishing of a new/updated customer review for a skill. 
 */

@JsonDeserialize(builder = SkillReviewPublish.Builder.class)
public final class SkillReviewPublish extends com.amazon.ask.smapi.model.v0.eventSchema.BaseSchema  {

    @JsonProperty("payload")
    private com.amazon.ask.smapi.model.v0.eventSchema.SkillReviewEventAttributes payload = null;

    public static Builder builder() {
        return new Builder();
    }

    private SkillReviewPublish(Builder builder) {
        String discriminatorValue = "AlexaCustomerFeedbackEvent.SkillReviewPublish";

        if (builder.timestamp != null) {
            this.timestamp = builder.timestamp;
        }
        this.eventName = discriminatorValue;
        if (builder.payload != null) {
            this.payload = builder.payload;
        }
    }

    /**
     * Get payload
     * @return payload
    **/
    @JsonProperty("payload")
    public com.amazon.ask.smapi.model.v0.eventSchema.SkillReviewEventAttributes getPayload() {
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
        SkillReviewPublish v0EventSchemaAlexaCustomerFeedbackEventSkillReviewPublish = (SkillReviewPublish) o;
        return Objects.equals(this.payload, v0EventSchemaAlexaCustomerFeedbackEventSkillReviewPublish.payload) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillReviewPublish {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
        private com.amazon.ask.smapi.model.v0.eventSchema.SkillReviewEventAttributes payload;

        private Builder() {}

        @JsonProperty("timestamp")

        public Builder withTimestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }


        @JsonProperty("payload")

        public Builder withPayload(com.amazon.ask.smapi.model.v0.eventSchema.SkillReviewEventAttributes payload) {
            this.payload = payload;
            return this;
        }


        public SkillReviewPublish build() {
            return new SkillReviewPublish(this);
        }
    }
}

