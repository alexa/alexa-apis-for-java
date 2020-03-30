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


package com.amazon.ask.smapi.model.v1.skill.history;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Provides the intent name, slots and confidence of the intent used in this interaction.
 */

@JsonDeserialize(builder = Intent.Builder.class)
public final class Intent {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("confidence")
    private com.amazon.ask.smapi.model.v1.skill.history.Confidence confidence = null;

    @JsonProperty("slots")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.history.Slot> slots = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.history.Slot>();

    public static Builder builder() {
        return new Builder();
    }

    private Intent(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.confidence != null) {
            this.confidence = builder.confidence;
        }
        if (builder.slots != null) {
            this.slots = builder.slots;
        }
    }

    /**
     * The hypothesized intent for this utterance.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Get confidence
     * @return confidence
    **/
    @JsonProperty("confidence")
    public com.amazon.ask.smapi.model.v1.skill.history.Confidence getConfidence() {
        return confidence;
    }


    /**
     * The hypothesized slot(s) for this interaction.
     * @return slots
    **/
    @JsonProperty("slots")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.history.Slot> getSlots() {
        return slots;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Intent v1SkillHistoryIntent = (Intent) o;
        return Objects.equals(this.name, v1SkillHistoryIntent.name) &&
            Objects.equals(this.confidence, v1SkillHistoryIntent.confidence) &&
            Objects.equals(this.slots, v1SkillHistoryIntent.slots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, confidence, slots);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Intent {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.history.Confidence confidence;
        private Map<String, com.amazon.ask.smapi.model.v1.skill.history.Slot> slots;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("confidence")

        public Builder withConfidence(com.amazon.ask.smapi.model.v1.skill.history.Confidence confidence) {
            this.confidence = confidence;
            return this;
        }


        @JsonProperty("slots")

        public Builder withSlots(Map<String, com.amazon.ask.smapi.model.v1.skill.history.Slot> slots) {
            this.slots = slots;
            return this;
        }

        public Builder putSlotsItem(String key, com.amazon.ask.smapi.model.v1.skill.history.Slot slotsItem) {
            if (this.slots == null) {
                this.slots = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.history.Slot>();
            }
            this.slots.put(key, slotsItem);
            return this;
        }

        public Intent build() {
            return new Intent(this);
        }
    }
}

