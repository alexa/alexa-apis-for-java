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


package com.amazon.ask.model.services.gameEngine;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InputEvent
 */

@JsonDeserialize(builder = InputEvent.Builder.class)
public final class InputEvent {

    @JsonProperty("gadgetId")
    private String gadgetId = null;

    @JsonProperty("timestamp")
    private String timestamp = null;

    @JsonProperty("action")
    private String action = null;

    @JsonProperty("color")
    private String color = null;

    @JsonProperty("feature")
    private String feature = null;

    public static Builder builder() {
        return new Builder();
    }

    private InputEvent(Builder builder) {
        if (builder.gadgetId != null) {
            this.gadgetId = builder.gadgetId;
        }
        if (builder.timestamp != null) {
            this.timestamp = builder.timestamp;
        }
        if (builder.action != null) {
            this.action = builder.action;
        }
        if (builder.color != null) {
            this.color = builder.color;
        }
        if (builder.feature != null) {
            this.feature = builder.feature;
        }
    }

    /**
     * The identifier of the Echo Button in question. It matches the gadgetId that you will have discovered in roll call.
     * @return gadgetId
    **/
    @JsonProperty("gadgetId")
    public String getGadgetId() {
        return gadgetId;
    }


    /**
     * The event's original moment of occurrence, in ISO format.
     * @return timestamp
    **/
    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }


    /**
     * Get action
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getActionAsString().
     *
     * @return action
    **/
    
    public com.amazon.ask.model.services.gameEngine.InputEventActionType getAction() {
        return com.amazon.ask.model.services.gameEngine.InputEventActionType.fromValue(action);
    }

    /**
     * Get the underlying String value for action.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return action as a String value
    **/
    @JsonProperty("action")
    public String getActionAsString() {
      return action;
    }

    /**
     * The hexadecimal RGB values of the button LED at the time of the event.
     * @return color
    **/
    @JsonProperty("color")
    public String getColor() {
        return color;
    }


    /**
     * For gadgets with multiple features, this is the feature that the event represents. Echo Buttons have one feature only, so this is always `press`.
     * @return feature
    **/
    @JsonProperty("feature")
    public String getFeature() {
        return feature;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InputEvent servicesGameEngineInputEvent = (InputEvent) o;
        return Objects.equals(this.gadgetId, servicesGameEngineInputEvent.gadgetId) &&
            Objects.equals(this.timestamp, servicesGameEngineInputEvent.timestamp) &&
            Objects.equals(this.action, servicesGameEngineInputEvent.action) &&
            Objects.equals(this.color, servicesGameEngineInputEvent.color) &&
            Objects.equals(this.feature, servicesGameEngineInputEvent.feature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gadgetId, timestamp, action, color, feature);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InputEvent {\n");
        
        sb.append("    gadgetId: ").append(toIndentedString(gadgetId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
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
        private String gadgetId;
        private String timestamp;
        private String action;
        private String color;
        private String feature;

        private Builder() {}

        @JsonProperty("gadgetId")

        public Builder withGadgetId(String gadgetId) {
            this.gadgetId = gadgetId;
            return this;
        }


        @JsonProperty("timestamp")

        public Builder withTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }


        @JsonProperty("action")

        public Builder withAction(String action) {
          this.action = action;
          return this;
        }

        public Builder withAction(com.amazon.ask.model.services.gameEngine.InputEventActionType action) {
            this.action = action != null ? action.toString() : null;
            return this;
        }


        @JsonProperty("color")

        public Builder withColor(String color) {
            this.color = color;
            return this;
        }


        @JsonProperty("feature")

        public Builder withFeature(String feature) {
            this.feature = feature;
            return this;
        }


        public InputEvent build() {
            return new InputEvent(this);
        }
    }
}

