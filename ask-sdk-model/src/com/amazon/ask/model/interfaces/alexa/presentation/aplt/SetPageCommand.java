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


package com.amazon.ask.model.interfaces.alexa.presentation.aplt;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Change the page displayed in a Pager component. The SetPage command finishes when the item is fully in view.
 */

@JsonDeserialize(builder = SetPageCommand.Builder.class)
public final class SetPageCommand extends com.amazon.ask.model.interfaces.alexa.presentation.aplt.Command  {

    @JsonProperty("componentId")
    private String componentId = null;

    @JsonProperty("position")
    private com.amazon.ask.model.interfaces.alexa.presentation.aplt.Position position = null;

    @JsonProperty("value")
    private String value = null;

    public static Builder builder() {
        return new Builder();
    }

    private SetPageCommand(Builder builder) {
        String discriminatorValue = "SetPage";

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
        if (builder.when != null) {
            this.when = builder.when;
        }
        if (builder.componentId != null) {
            this.componentId = builder.componentId;
        }
        if (builder.position != null) {
            this.position = builder.position;
        }
        if (builder.value != null) {
            this.value = builder.value;
        }
    }

    /**
     * The id of the Pager component.
     * @return componentId
    **/
    @JsonProperty("componentId")
    public String getComponentId() {
        return componentId;
    }

    /**
     * Get position
     * @return position
    **/
    @JsonProperty("position")
    public com.amazon.ask.model.interfaces.alexa.presentation.aplt.Position getPosition() {
        return position;
    }

    /**
     * The distance to move. May be an absolute value or a relative value.
     * @return value
    **/
    @JsonProperty("value")
    public String getValue() {
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
        SetPageCommand interfacesAlexaPresentationApltSetPageCommand = (SetPageCommand) o;
        return Objects.equals(this.componentId, interfacesAlexaPresentationApltSetPageCommand.componentId) &&
            Objects.equals(this.position, interfacesAlexaPresentationApltSetPageCommand.position) &&
            Objects.equals(this.value, interfacesAlexaPresentationApltSetPageCommand.value) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId, position, value, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetPageCommand {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
        private Integer delay;
        private String description;
        private Boolean screenLock;
        private String when;
        private String componentId;
        private com.amazon.ask.model.interfaces.alexa.presentation.aplt.Position position;
        private String value;

        private Builder() {}

        @JsonProperty("delay")
        public Builder withDelay(Integer delay) {
            this.delay = delay;
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


        @JsonProperty("when")
        public Builder withWhen(Boolean when) {
            this.when = String.valueOf(when);
            return this;
        }

        public Builder withWhen(String whenExpression) {
            this.when = whenExpression;
            return this;
        }

        @JsonProperty("componentId")
        public Builder withComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }


        @JsonProperty("position")
        public Builder withPosition(com.amazon.ask.model.interfaces.alexa.presentation.aplt.Position position) {
            this.position = position;
            return this;
        }


        @JsonProperty("value")
        public Builder withValue(Integer value) {
            this.value = String.valueOf(value);
            return this;
        }

        public Builder withValue(String valueExpression) {
            this.value = valueExpression;
            return this;
        }

        public SetPageCommand build() {
            return new SetPageCommand(this);
        }
    }
}

