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


package com.amazon.ask.model.interfaces.alexa.presentation.apl;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Runs a fixed-duration animation sequence on one or more properties of a single component.
 */

@JsonDeserialize(builder = AnimateItemCommand.Builder.class)
public final class AnimateItemCommand extends com.amazon.ask.model.interfaces.alexa.presentation.apl.Command  {

    @JsonProperty("componentId")
    private String componentId = null;

    @JsonProperty("duration")
    private String duration = null;

    @JsonProperty("easing")
    private String easing = "linear";

    @JsonProperty("repeatCount")
    private String repeatCount = null;

    @JsonProperty("repeatMode")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimateItemRepeatMode repeatMode = null;

    @JsonProperty("value")
    private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimatedProperty> value = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimatedProperty>();

    public static Builder builder() {
        return new Builder();
    }

    private AnimateItemCommand(Builder builder) {
        String discriminatorValue = "AnimateItem";

        this.type = discriminatorValue;
        if (builder.delay != null) {
            this.delay = builder.delay;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
        if (builder.when != null) {
            this.when = builder.when;
        }
        if (builder.componentId != null) {
            this.componentId = builder.componentId;
        }
        if (builder.duration != null) {
            this.duration = builder.duration;
        }
        if (builder.easing != null) {
            this.easing = builder.easing;
        }
        if (builder.repeatCount != null) {
            this.repeatCount = builder.repeatCount;
        }
        if (builder.repeatMode != null) {
            this.repeatMode = builder.repeatMode;
        }
        if (builder.value != null) {
            this.value = builder.value;
        }
    }

    /**
     * The ID of the animated component.
     * @return componentId
    **/
    @JsonProperty("componentId")
    public String getComponentId() {
        return componentId;
    }

    /**
     * The duration of the animation (in milliseconds).
     * @return duration
    **/
    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    /**
     * The easing curve.
     * @return easing
    **/
    @JsonProperty("easing")
    public String getEasing() {
        return easing;
    }

    /**
     * Number of times to repeat.
     * @return repeatCount
    **/
    @JsonProperty("repeatCount")
    public String getRepeatCount() {
        return repeatCount;
    }

    /**
     * Get repeatMode
     * @return repeatMode
    **/
    @JsonProperty("repeatMode")
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimateItemRepeatMode getRepeatMode() {
        return repeatMode;
    }

    /**
     * An array of animated properties.
     * @return value
    **/
    @JsonProperty("value")
    public List<com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimatedProperty> getValue() {
        return value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnimateItemCommand interfacesAlexaPresentationAplAnimateItemCommand = (AnimateItemCommand) o;
        return Objects.equals(this.componentId, interfacesAlexaPresentationAplAnimateItemCommand.componentId) &&
            Objects.equals(this.duration, interfacesAlexaPresentationAplAnimateItemCommand.duration) &&
            Objects.equals(this.easing, interfacesAlexaPresentationAplAnimateItemCommand.easing) &&
            Objects.equals(this.repeatCount, interfacesAlexaPresentationAplAnimateItemCommand.repeatCount) &&
            Objects.equals(this.repeatMode, interfacesAlexaPresentationAplAnimateItemCommand.repeatMode) &&
            Objects.equals(this.value, interfacesAlexaPresentationAplAnimateItemCommand.value) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId, duration, easing, repeatCount, repeatMode, value, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnimateItemCommand {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    easing: ").append(toIndentedString(easing)).append("\n");
        sb.append("    repeatCount: ").append(toIndentedString(repeatCount)).append("\n");
        sb.append("    repeatMode: ").append(toIndentedString(repeatMode)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
        private String delay;
        private String description;
        private Boolean when;
        private String componentId;
        private String duration;
        private String easing;
        private String repeatCount;
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimateItemRepeatMode repeatMode;
        private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimatedProperty> value;

        private Builder() {}

        @JsonProperty("delay")
        public Builder withDelay(Integer delay) {
            this.delay = String.valueOf(delay);
            return this;
        }

        public Builder withDelay(String delayExpression) {
            this.delay = delayExpression;
            return this;
        }

        @JsonProperty("description")
        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        @JsonProperty("when")
        public Builder withWhen(Boolean when) {
            this.when = when;
            return this;
        }


        @JsonProperty("componentId")
        public Builder withComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }


        @JsonProperty("duration")
        public Builder withDuration(Integer duration) {
            this.duration = String.valueOf(duration);
            return this;
        }

        public Builder withDuration(String durationExpression) {
            this.duration = durationExpression;
            return this;
        }

        @JsonProperty("easing")
        public Builder withEasing(String easing) {
            this.easing = easing;
            return this;
        }


        @JsonProperty("repeatCount")
        public Builder withRepeatCount(Integer repeatCount) {
            this.repeatCount = String.valueOf(repeatCount);
            return this;
        }

        public Builder withRepeatCount(String repeatCountExpression) {
            this.repeatCount = repeatCountExpression;
            return this;
        }

        @JsonProperty("repeatMode")
        public Builder withRepeatMode(com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimateItemRepeatMode repeatMode) {
            this.repeatMode = repeatMode;
            return this;
        }


        @JsonProperty("value")
        public Builder withValue(List<com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimatedProperty> value) {
            this.value = value;
            return this;
        }

        public Builder addValueItem(com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimatedProperty valueItem) {
            if (this.value == null) {
                this.value = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimatedProperty>();
            }
            this.value.add(valueItem);
            return this;
        }

        public AnimateItemCommand build() {
            return new AnimateItemCommand(this);
        }
    }
}

