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


package com.amazon.ask.model.services.gadgetController;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Arguments that pertain to animating the buttons.
 */

@JsonDeserialize(builder = SetLightParameters.Builder.class)
public final class SetLightParameters {

    @JsonProperty("triggerEvent")
    private String triggerEvent = null;

    @JsonProperty("triggerEventTimeMs")
    private Integer triggerEventTimeMs = null;

    @JsonProperty("animations")
    private List<com.amazon.ask.model.services.gadgetController.LightAnimation> animations = new ArrayList<com.amazon.ask.model.services.gadgetController.LightAnimation>();

    private SetLightParameters() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SetLightParameters(Builder builder) {
        if (builder.triggerEvent != null) {
            this.triggerEvent = builder.triggerEvent;
        }
        if (builder.triggerEventTimeMs != null) {
            this.triggerEventTimeMs = builder.triggerEventTimeMs;
        }
        if (builder.animations != null) {
            this.animations = builder.animations;
        }
    }

    /**
     * Get triggerEvent
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getTriggerEventAsString().
     *
     * @return triggerEvent
    **/
    
    public com.amazon.ask.model.services.gadgetController.TriggerEventType getTriggerEvent() {
        return com.amazon.ask.model.services.gadgetController.TriggerEventType.fromValue(triggerEvent);
    }

    /**
     * Get the underlying String value for triggerEvent.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return triggerEvent as a String value
    **/
    @JsonProperty("triggerEvent")
    public String getTriggerEventAsString() {
      return triggerEvent;
    }

    /**
     * Get triggerEventTimeMs
     * @return triggerEventTimeMs
    **/
    @JsonProperty("triggerEventTimeMs")
    public Integer getTriggerEventTimeMs() {
        return triggerEventTimeMs;
    }


    /**
     * Get animations
     * @return animations
    **/
    @JsonProperty("animations")
    public List<com.amazon.ask.model.services.gadgetController.LightAnimation> getAnimations() {
        return animations;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetLightParameters servicesGadgetControllerSetLightParameters = (SetLightParameters) o;
        return Objects.equals(this.triggerEvent, servicesGadgetControllerSetLightParameters.triggerEvent) &&
            Objects.equals(this.triggerEventTimeMs, servicesGadgetControllerSetLightParameters.triggerEventTimeMs) &&
            Objects.equals(this.animations, servicesGadgetControllerSetLightParameters.animations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(triggerEvent, triggerEventTimeMs, animations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetLightParameters {\n");
        
        sb.append("    triggerEvent: ").append(toIndentedString(triggerEvent)).append("\n");
        sb.append("    triggerEventTimeMs: ").append(toIndentedString(triggerEventTimeMs)).append("\n");
        sb.append("    animations: ").append(toIndentedString(animations)).append("\n");
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
        private String triggerEvent;
        private Integer triggerEventTimeMs;
        private List<com.amazon.ask.model.services.gadgetController.LightAnimation> animations;

        private Builder() {}

        @JsonProperty("triggerEvent")

        public Builder withTriggerEvent(String triggerEvent) {
          this.triggerEvent = triggerEvent;
          return this;
        }

        public Builder withTriggerEvent(com.amazon.ask.model.services.gadgetController.TriggerEventType triggerEvent) {
            this.triggerEvent = triggerEvent != null ? triggerEvent.toString() : null;
            return this;
        }


        @JsonProperty("triggerEventTimeMs")

        public Builder withTriggerEventTimeMs(Integer triggerEventTimeMs) {
            this.triggerEventTimeMs = triggerEventTimeMs;
            return this;
        }


        @JsonProperty("animations")

        public Builder withAnimations(List<com.amazon.ask.model.services.gadgetController.LightAnimation> animations) {
            this.animations = animations;
            return this;
        }

        public Builder addAnimationsItem(com.amazon.ask.model.services.gadgetController.LightAnimation animationsItem) {
            if (this.animations == null) {
                this.animations = new ArrayList<com.amazon.ask.model.services.gadgetController.LightAnimation>();
            }
            this.animations.add(animationsItem);
            return this;
        }

        public SetLightParameters build() {
            return new SetLightParameters(this);
        }
    }
}

