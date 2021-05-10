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


package com.amazon.ask.smapi.model.v0.eventSchema;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents attributes common to all development notifications. 
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "eventName", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v0.eventSchema.AlexaDevelopmentEvent.InteractionModelUpdate.class, name = "AlexaDevelopmentEvent.InteractionModelUpdate"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v0.eventSchema.AlexaCustomerFeedbackEvent.SkillReviewPublish.class, name = "AlexaCustomerFeedbackEvent.SkillReviewPublish"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v0.eventSchema.AlexaDevelopmentEvent.SkillPublish.class, name = "AlexaDevelopmentEvent.SkillPublish"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v0.eventSchema.AlexaDevelopmentEvent.ManifestUpdate.class, name = "AlexaDevelopmentEvent.ManifestUpdate"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v0.eventSchema.AlexaDevelopmentEvent.SkillCertification.class, name = "AlexaDevelopmentEvent.SkillCertification"),
})
public abstract class BaseSchema {

    @JsonProperty("timestamp")
    protected OffsetDateTime timestamp = null;

    protected String eventName = null;

    protected BaseSchema() {
    }

    /**
     * ISO 8601 timestamp for the instant when event was created. 
     * @return timestamp
    **/
    @JsonProperty("timestamp")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }


    /**
     * Get eventName
     * @return eventName
    **/
    @JsonIgnore
    public String getEventName() {
        return eventName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseSchema v0EventSchemaBaseSchema = (BaseSchema) o;
        return Objects.equals(this.timestamp, v0EventSchemaBaseSchema.timestamp) &&
            Objects.equals(this.eventName, v0EventSchemaBaseSchema.eventName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, eventName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseSchema {\n");
        
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
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
  
}

