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


package com.amazon.ask.model;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object that represents what the user wants.
 */

@JsonDeserialize(builder = Intent.Builder.class)
public final class Intent {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("slots")
    private Map<String, com.amazon.ask.model.Slot> slots = new HashMap<String, com.amazon.ask.model.Slot>();

    @JsonProperty("confirmationStatus")
    private com.amazon.ask.model.IntentConfirmationStatus confirmationStatus = null;

    public static Builder builder() {
        return new Builder();
    }

    private Intent(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.slots != null) {
            this.slots = builder.slots;
        }
        if (builder.confirmationStatus != null) {
            this.confirmationStatus = builder.confirmationStatus;
        }
    }

    /**
     * A string representing the name of the intent.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * A map of key-value pairs that further describes what the user meant based on a predefined intent schema. The map can be empty.
     * @return slots
    **/
    @JsonProperty("slots")
    public Map<String, com.amazon.ask.model.Slot> getSlots() {
        return slots;
    }

    /**
     * Get confirmationStatus
     * @return confirmationStatus
    **/
    @JsonProperty("confirmationStatus")
    public com.amazon.ask.model.IntentConfirmationStatus getConfirmationStatus() {
        return confirmationStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Intent intent = (Intent) o;
        return Objects.equals(this.name, intent.name) &&
            Objects.equals(this.slots, intent.slots) &&
            Objects.equals(this.confirmationStatus, intent.confirmationStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, slots, confirmationStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Intent {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
        sb.append("    confirmationStatus: ").append(toIndentedString(confirmationStatus)).append("\n");
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
        private Map<String, com.amazon.ask.model.Slot> slots;
        private com.amazon.ask.model.IntentConfirmationStatus confirmationStatus;

        private Builder() {}

        @JsonProperty("name")
        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("slots")
        public Builder withSlots(Map<String, com.amazon.ask.model.Slot> slots) {
            this.slots = slots;
            return this;
        }

        public Builder putSlotsItem(String key, com.amazon.ask.model.Slot slotsItem) {
            if (this.slots == null) {
                this.slots = new HashMap<String, com.amazon.ask.model.Slot>();
            }
            this.slots.put(key, slotsItem);
            return this;
        }

        @JsonProperty("confirmationStatus")
        public Builder withConfirmationStatus(com.amazon.ask.model.IntentConfirmationStatus confirmationStatus) {
            this.confirmationStatus = confirmationStatus;
            return this;
        }


        public Intent build() {
            return new Intent(this);
        }
    }
}

