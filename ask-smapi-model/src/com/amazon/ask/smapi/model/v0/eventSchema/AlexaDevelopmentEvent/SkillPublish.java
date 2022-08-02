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
 * &#39;AlexaDevelopmentEvent.SkillPublish&#39; event represents the status of publish to live operation. When a developer submits a skill for certification, it goes through &#x60;certification workflow&#x60; followed by publish to live workflow. This event is generated in publish workflow and may complete either with &#x60;SUCCEEDED&#x60; or &#x60;FAILED&#x60; status. If &#39;SUCCEEDED&#39;, users can see and enable latest version of the skill via Alexa Skill Store.
 */

@JsonDeserialize(builder = SkillPublish.Builder.class)
public final class SkillPublish extends com.amazon.ask.smapi.model.v0.eventSchema.BaseSchema  {

    @JsonProperty("requestId")
    private String requestId = null;

    @JsonProperty("payload")
    private com.amazon.ask.smapi.model.v0.eventSchema.SkillEventAttributes payload = null;

    private SkillPublish() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SkillPublish(Builder builder) {
        String discriminatorValue = "AlexaDevelopmentEvent.SkillPublish";

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
    public com.amazon.ask.smapi.model.v0.eventSchema.SkillEventAttributes getPayload() {
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
        SkillPublish v0EventSchemaAlexaDevelopmentEventSkillPublish = (SkillPublish) o;
        return Objects.equals(this.requestId, v0EventSchemaAlexaDevelopmentEventSkillPublish.requestId) &&
            Objects.equals(this.payload, v0EventSchemaAlexaDevelopmentEventSkillPublish.payload) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, payload, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillPublish {\n");
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
        private com.amazon.ask.smapi.model.v0.eventSchema.SkillEventAttributes payload;

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

        public Builder withPayload(com.amazon.ask.smapi.model.v0.eventSchema.SkillEventAttributes payload) {
            this.payload = payload;
            return this;
        }


        public SkillPublish build() {
            return new SkillPublish(this);
        }
    }
}

