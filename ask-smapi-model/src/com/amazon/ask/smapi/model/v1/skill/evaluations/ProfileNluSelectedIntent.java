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


package com.amazon.ask.smapi.model.v1.skill.evaluations;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The intent that Alexa selected for the utterance in the request.
 */

@JsonDeserialize(builder = ProfileNluSelectedIntent.Builder.class)
public final class ProfileNluSelectedIntent {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("confirmationStatus")
    private com.amazon.ask.smapi.model.v1.skill.evaluations.ConfirmationStatusType confirmationStatus = null;

    @JsonProperty("slots")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.evaluations.Slot> slots = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.evaluations.Slot>();

    public static Builder builder() {
        return new Builder();
    }

    private ProfileNluSelectedIntent(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.confirmationStatus != null) {
            this.confirmationStatus = builder.confirmationStatus;
        }
        if (builder.slots != null) {
            this.slots = builder.slots;
        }
    }

    /**
     * Get name
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Get confirmationStatus
     * @return confirmationStatus
    **/
    @JsonProperty("confirmationStatus")
    public com.amazon.ask.smapi.model.v1.skill.evaluations.ConfirmationStatusType getConfirmationStatus() {
        return confirmationStatus;
    }

    /**
     * A map of key-value pairs that further describes what the user meant based on a predefined intent schema. The map can be empty. 
     * @return slots
    **/
    @JsonProperty("slots")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.evaluations.Slot> getSlots() {
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
        ProfileNluSelectedIntent v1SkillEvaluationsProfileNluSelectedIntent = (ProfileNluSelectedIntent) o;
        return Objects.equals(this.name, v1SkillEvaluationsProfileNluSelectedIntent.name) &&
            Objects.equals(this.confirmationStatus, v1SkillEvaluationsProfileNluSelectedIntent.confirmationStatus) &&
            Objects.equals(this.slots, v1SkillEvaluationsProfileNluSelectedIntent.slots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, confirmationStatus, slots);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProfileNluSelectedIntent {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    confirmationStatus: ").append(toIndentedString(confirmationStatus)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.evaluations.ConfirmationStatusType confirmationStatus;
        private Map<String, com.amazon.ask.smapi.model.v1.skill.evaluations.Slot> slots;

        private Builder() {}

        @JsonProperty("name")
        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("confirmationStatus")
        public Builder withConfirmationStatus(com.amazon.ask.smapi.model.v1.skill.evaluations.ConfirmationStatusType confirmationStatus) {
            this.confirmationStatus = confirmationStatus;
            return this;
        }


        @JsonProperty("slots")
        public Builder withSlots(Map<String, com.amazon.ask.smapi.model.v1.skill.evaluations.Slot> slots) {
            this.slots = slots;
            return this;
        }

        public Builder putSlotsItem(String key, com.amazon.ask.smapi.model.v1.skill.evaluations.Slot slotsItem) {
            if (this.slots == null) {
                this.slots = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.evaluations.Slot>();
            }
            this.slots.put(key, slotsItem);
            return this;
        }

        public ProfileNluSelectedIntent build() {
            return new ProfileNluSelectedIntent(this);
        }
    }
}

