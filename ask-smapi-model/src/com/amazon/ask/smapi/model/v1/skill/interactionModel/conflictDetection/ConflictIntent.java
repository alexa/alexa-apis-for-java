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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConflictIntent
 */

@JsonDeserialize(builder = ConflictIntent.Builder.class)
public final class ConflictIntent {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("slots")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.ConflictIntentSlots slots = null;

    public static Builder builder() {
        return new Builder();
    }

    private ConflictIntent(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.slots != null) {
            this.slots = builder.slots;
        }
    }

    /**
     * Conflict intent name
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Get slots
     * @return slots
    **/
    @JsonProperty("slots")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.ConflictIntentSlots getSlots() {
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
        ConflictIntent v1SkillInteractionModelConflictDetectionConflictIntent = (ConflictIntent) o;
        return Objects.equals(this.name, v1SkillInteractionModelConflictDetectionConflictIntent.name) &&
            Objects.equals(this.slots, v1SkillInteractionModelConflictDetectionConflictIntent.slots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, slots);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConflictIntent {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.ConflictIntentSlots slots;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("slots")

        public Builder withSlots(com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.ConflictIntentSlots slots) {
            this.slots = slots;
            return this;
        }


        public ConflictIntent build() {
            return new ConflictIntent(this);
        }
    }
}

