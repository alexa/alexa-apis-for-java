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
 * Change a dynamic property of a component without redrawing the screen.
 */

@JsonDeserialize(builder = SetValueCommand.Builder.class)
public final class SetValueCommand extends com.amazon.ask.model.interfaces.alexa.presentation.aplt.Command  {

    @JsonProperty("componentId")
    private String componentId = null;

    @JsonProperty("property")
    private String property = null;

    @JsonProperty("value")
    private String value = null;

    public static Builder builder() {
        return new Builder();
    }

    private SetValueCommand(Builder builder) {
        String discriminatorValue = "SetValue";

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
        if (builder.property != null) {
            this.property = builder.property;
        }
        if (builder.value != null) {
            this.value = builder.value;
        }
    }

    /**
     * The id of the component whose value to set.
     * @return componentId
    **/
    @JsonProperty("componentId")
    public String getComponentId() {
        return componentId;
    }

    /**
     * The name of the property to set.
     * @return property
    **/
    @JsonProperty("property")
    public String getProperty() {
        return property;
    }

    /**
     * The property value to set.
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
        SetValueCommand interfacesAlexaPresentationApltSetValueCommand = (SetValueCommand) o;
        return Objects.equals(this.componentId, interfacesAlexaPresentationApltSetValueCommand.componentId) &&
            Objects.equals(this.property, interfacesAlexaPresentationApltSetValueCommand.property) &&
            Objects.equals(this.value, interfacesAlexaPresentationApltSetValueCommand.value) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId, property, value, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetValueCommand {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
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
        private String property;
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


        @JsonProperty("property")
        public Builder withProperty(String property) {
            this.property = property;
            return this;
        }


        @JsonProperty("value")
        public Builder withValue(String value) {
            this.value = value;
            return this;
        }


        public SetValueCommand build() {
            return new SetValueCommand(this);
        }
    }
}

