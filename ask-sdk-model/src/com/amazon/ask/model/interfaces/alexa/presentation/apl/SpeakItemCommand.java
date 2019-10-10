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
 * Reads the contents of a single item on the screen. By default the item will be scrolled into view if it is not currently visible.
 */

@JsonDeserialize(builder = SpeakItemCommand.Builder.class)
public final class SpeakItemCommand extends com.amazon.ask.model.interfaces.alexa.presentation.apl.Command  {

    @JsonProperty("align")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.Align align = null;

    @JsonProperty("componentId")
    private String componentId = null;

    @JsonProperty("highlightMode")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.HighlightMode highlightMode = null;

    @JsonProperty("minimumDwellTime")
    private String minimumDwellTime = null;

    public static Builder builder() {
        return new Builder();
    }

    private SpeakItemCommand(Builder builder) {
        String discriminatorValue = "SpeakItem";

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
        if (builder.align != null) {
            this.align = builder.align;
        }
        if (builder.componentId != null) {
            this.componentId = builder.componentId;
        }
        if (builder.highlightMode != null) {
            this.highlightMode = builder.highlightMode;
        }
        if (builder.minimumDwellTime != null) {
            this.minimumDwellTime = builder.minimumDwellTime;
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
     * The id of the component to speak.
     * @return componentId
    **/
    @JsonProperty("componentId")
    public String getComponentId() {
        return componentId;
    }

    /**
     * Get highlightMode
     * @return highlightMode
    **/
    @JsonProperty("highlightMode")
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.HighlightMode getHighlightMode() {
        return highlightMode;
    }

    /**
     * The minimum number of milliseconds that an item should be highlighted for. Defaults to 0.
     * @return minimumDwellTime
    **/
    @JsonProperty("minimumDwellTime")
    public String getMinimumDwellTime() {
        return minimumDwellTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SpeakItemCommand interfacesAlexaPresentationAplSpeakItemCommand = (SpeakItemCommand) o;
        return Objects.equals(this.align, interfacesAlexaPresentationAplSpeakItemCommand.align) &&
            Objects.equals(this.componentId, interfacesAlexaPresentationAplSpeakItemCommand.componentId) &&
            Objects.equals(this.highlightMode, interfacesAlexaPresentationAplSpeakItemCommand.highlightMode) &&
            Objects.equals(this.minimumDwellTime, interfacesAlexaPresentationAplSpeakItemCommand.minimumDwellTime) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(align, componentId, highlightMode, minimumDwellTime, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpeakItemCommand {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    align: ").append(toIndentedString(align)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    highlightMode: ").append(toIndentedString(highlightMode)).append("\n");
        sb.append("    minimumDwellTime: ").append(toIndentedString(minimumDwellTime)).append("\n");
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
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.Align align;
        private String componentId;
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.HighlightMode highlightMode;
        private String minimumDwellTime;

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


        @JsonProperty("highlightMode")
        public Builder withHighlightMode(com.amazon.ask.model.interfaces.alexa.presentation.apl.HighlightMode highlightMode) {
            this.highlightMode = highlightMode;
            return this;
        }


        @JsonProperty("minimumDwellTime")
        public Builder withMinimumDwellTime(Integer minimumDwellTime) {
            this.minimumDwellTime = String.valueOf(minimumDwellTime);
            return this;
        }

        public Builder withMinimumDwellTime(String minimumDwellTimeExpression) {
            this.minimumDwellTime = minimumDwellTimeExpression;
            return this;
        }

        public SpeakItemCommand build() {
            return new SpeakItemCommand(this);
        }
    }
}

