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
 * EventName
 */

@JsonDeserialize(builder = EventName.Builder.class)
public final class EventName {

    @JsonProperty("eventName")
    private String eventName = null;

    public static Builder builder() {
        return new Builder();
    }

    private EventName(Builder builder) {
        if (builder.eventName != null) {
            this.eventName = builder.eventName;
        }
    }

    /**
     * Get eventName
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getEventNameAsString().
     *
     * @return eventName
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Manifest.EventNameType getEventName() {
        return com.amazon.ask.smapi.model.v1.skill.Manifest.EventNameType.fromValue(eventName);
    }

    /**
     * Get the underlying String value for eventName.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return eventName as a String value
    **/
    @JsonProperty("eventName")
    public String getEventNameAsString() {
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
        EventName v1SkillManifestEventName = (EventName) o;
        return Objects.equals(this.eventName, v1SkillManifestEventName.eventName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventName {\n");
        
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

        public Builder withEventName(com.amazon.ask.smapi.model.v1.skill.Manifest.EventNameType eventName) {
            this.eventName = eventName != null ? eventName.toString() : null;
            return this;
        }


        public EventName build() {
            return new EventName(this);
        }
    }
}

