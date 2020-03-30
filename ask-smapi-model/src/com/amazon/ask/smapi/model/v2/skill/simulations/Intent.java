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


package com.amazon.ask.smapi.model.v2.skill.simulations;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Intent
 */

@JsonDeserialize(builder = Intent.Builder.class)
public final class Intent {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("confirmationStatus")
    private String confirmationStatus = null;

    @JsonProperty("slots")
    private Map<String, com.amazon.ask.smapi.model.v2.skill.simulations.Slot> slots = new HashMap<String, com.amazon.ask.smapi.model.v2.skill.simulations.Slot>();

    public static Builder builder() {
        return new Builder();
    }

    private Intent(Builder builder) {
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
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getConfirmationStatusAsString().
     *
     * @return confirmationStatus
    **/
    
    public com.amazon.ask.smapi.model.v2.skill.simulations.ConfirmationStatusType getConfirmationStatus() {
        return com.amazon.ask.smapi.model.v2.skill.simulations.ConfirmationStatusType.fromValue(confirmationStatus);
    }

    /**
     * Get the underlying String value for confirmationStatus.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return confirmationStatus as a String value
    **/
    @JsonProperty("confirmationStatus")
    public String getConfirmationStatusAsString() {
      return confirmationStatus;
    }

    /**
     * A map of key-value pairs that further describes what the user meant based on a predefined intent schema. The map can be empty. 
     * @return slots
    **/
    @JsonProperty("slots")
    public Map<String, com.amazon.ask.smapi.model.v2.skill.simulations.Slot> getSlots() {
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
        Intent v2SkillSimulationsIntent = (Intent) o;
        return Objects.equals(this.name, v2SkillSimulationsIntent.name) &&
            Objects.equals(this.confirmationStatus, v2SkillSimulationsIntent.confirmationStatus) &&
            Objects.equals(this.slots, v2SkillSimulationsIntent.slots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, confirmationStatus, slots);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Intent {\n");
        
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
        private String confirmationStatus;
        private Map<String, com.amazon.ask.smapi.model.v2.skill.simulations.Slot> slots;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("confirmationStatus")
        public Builder withConfirmationStatus(String confirmationStatus) {
          this.confirmationStatus = confirmationStatus;
          return this;
        }

        public Builder withConfirmationStatus(com.amazon.ask.smapi.model.v2.skill.simulations.ConfirmationStatusType confirmationStatus) {
            this.confirmationStatus = confirmationStatus != null ? confirmationStatus.toString() : null;
            return this;
        }


        @JsonProperty("slots")

        public Builder withSlots(Map<String, com.amazon.ask.smapi.model.v2.skill.simulations.Slot> slots) {
            this.slots = slots;
            return this;
        }

        public Builder putSlotsItem(String key, com.amazon.ask.smapi.model.v2.skill.simulations.Slot slotsItem) {
            if (this.slots == null) {
                this.slots = new HashMap<String, com.amazon.ask.smapi.model.v2.skill.simulations.Slot>();
            }
            this.slots.put(key, slotsItem);
            return this;
        }

        public Intent build() {
            return new Intent(this);
        }
    }
}

