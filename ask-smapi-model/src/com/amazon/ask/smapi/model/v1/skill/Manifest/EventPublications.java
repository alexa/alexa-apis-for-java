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


package com.amazon.ask.smapi.model.v1.skill.Manifest;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventPublications
 */

@JsonDeserialize(builder = EventPublications.Builder.class)
public final class EventPublications {

    @JsonProperty("eventName")
    private String eventName = null;

    public static Builder builder() {
        return new Builder();
    }

    private EventPublications(Builder builder) {
        if (builder.eventName != null) {
            this.eventName = builder.eventName;
        }
    }

    /**
     * Name of the event to publish.
     * @return eventName
    **/
    @JsonProperty("eventName")
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
        EventPublications v1SkillManifestEventPublications = (EventPublications) o;
        return Objects.equals(this.eventName, v1SkillManifestEventPublications.eventName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventPublications {\n");
        
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
  
    public static class Builder {
        private String eventName;

        private Builder() {}

        @JsonProperty("eventName")

        public Builder withEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }


        public EventPublications build() {
            return new EventPublications(this);
        }
    }
}

