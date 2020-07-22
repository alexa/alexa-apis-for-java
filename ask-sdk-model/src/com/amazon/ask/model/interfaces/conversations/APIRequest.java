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


package com.amazon.ask.model.interfaces.conversations;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * API request object
 */

@JsonDeserialize(builder = APIRequest.Builder.class)
public final class APIRequest {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("arguments")
    private Map<String, Object> arguments = new HashMap<String, Object>();

    @JsonProperty("slots")
    private Map<String, com.amazon.ask.model.SlotValue> slots = new HashMap<String, com.amazon.ask.model.SlotValue>();

    public static Builder builder() {
        return new Builder();
    }

    private APIRequest(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.arguments != null) {
            this.arguments = builder.arguments;
        }
        if (builder.slots != null) {
            this.slots = builder.slots;
        }
    }

    /**
     * API name
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Object containing values for API arguments
     * @return arguments
    **/
    @JsonProperty("arguments")
    public Map<String, Object> getArguments() {
        return arguments;
    }


    /**
     * Get slots
     * @return slots
    **/
    @JsonProperty("slots")
    public Map<String, com.amazon.ask.model.SlotValue> getSlots() {
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
        APIRequest interfacesConversationsAPIRequest = (APIRequest) o;
        return Objects.equals(this.name, interfacesConversationsAPIRequest.name) &&
            Objects.equals(this.arguments, interfacesConversationsAPIRequest.arguments) &&
            Objects.equals(this.slots, interfacesConversationsAPIRequest.slots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, arguments, slots);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class APIRequest {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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
        private Map<String, Object> arguments;
        private Map<String, com.amazon.ask.model.SlotValue> slots;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("arguments")

        public Builder withArguments(Map<String, Object> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder putArgumentsItem(String key, Object argumentsItem) {
            if (this.arguments == null) {
                this.arguments = new HashMap<String, Object>();
            }
            this.arguments.put(key, argumentsItem);
            return this;
        }

        @JsonProperty("slots")

        public Builder withSlots(Map<String, com.amazon.ask.model.SlotValue> slots) {
            this.slots = slots;
            return this;
        }

        public Builder putSlotsItem(String key, com.amazon.ask.model.SlotValue slotsItem) {
            if (this.slots == null) {
                this.slots = new HashMap<String, com.amazon.ask.model.SlotValue>();
            }
            this.slots.put(key, slotsItem);
            return this;
        }

        public APIRequest build() {
            return new APIRequest(this);
        }
    }
}

