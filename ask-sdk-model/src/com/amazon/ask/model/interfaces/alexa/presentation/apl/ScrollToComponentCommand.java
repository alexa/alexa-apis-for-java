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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Scroll forward or backward through a ScrollView or Sequence to ensure that a particular component is in view.
 */

@JsonDeserialize(builder = ScrollToComponentCommand.Builder.class)
public final class ScrollToComponentCommand extends com.amazon.ask.model.interfaces.alexa.presentation.apl.Command  {

    @JsonProperty("align")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.Align align = null;

    @JsonProperty("componentId")
    private String componentId = null;

    public static Builder builder() {
        return new Builder();
    }

    private ScrollToComponentCommand(Builder builder) {
        String discriminatorValue = "ScrollToComponent";

        this.type = discriminatorValue;
        if (builder.delay != null) {
            this.delay = builder.delay;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
        if (builder.screenLock != null) {
            this.screenLock = builder.screenLock;
        }
        if (builder.sequencer != null) {
            this.sequencer = builder.sequencer;
        }
        if (builder.when != null) {
            this.when = builder.when;
        }
        if (builder.align != null) {
            this.align = builder.align;
        }
        if (builder.componentId != null) {
            this.componentId = builder.componentId;
        }
    }

    /**
     * Get align
     * @return align
    **/
    @JsonProperty("align")
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.Align getAlign() {
        return align;
    }


    /**
     * The id of the component. If omitted, the component issuing the ScrollToComponent command is used.
     * @return componentId
    **/
    @JsonProperty("componentId")
    public String getComponentId() {
        return componentId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScrollToComponentCommand interfacesAlexaPresentationAplScrollToComponentCommand = (ScrollToComponentCommand) o;
        return Objects.equals(this.align, interfacesAlexaPresentationAplScrollToComponentCommand.align) &&
            Objects.equals(this.componentId, interfacesAlexaPresentationAplScrollToComponentCommand.componentId) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(align, componentId, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScrollToComponentCommand {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    align: ").append(toIndentedString(align)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
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
        private Boolean screenLock;
        private String sequencer;
        private Boolean when;
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.Align align;
        private String componentId;

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


        @JsonProperty("screenLock")

        public Builder withScreenLock(Boolean screenLock) {
            this.screenLock = screenLock;
            return this;
        }


        @JsonProperty("sequencer")

        public Builder withSequencer(String sequencer) {
            this.sequencer = sequencer;
            return this;
        }


        @JsonProperty("when")

        public Builder withWhen(Boolean when) {
            this.when = when;
            return this;
        }


        @JsonProperty("align")

        public Builder withAlign(com.amazon.ask.model.interfaces.alexa.presentation.apl.Align align) {
            this.align = align;
            return this;
        }


        @JsonProperty("componentId")

        public Builder withComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }


        public ScrollToComponentCommand build() {
            return new ScrollToComponentCommand(this);
        }
    }
}

