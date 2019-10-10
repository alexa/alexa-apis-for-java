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
 * The SetState command changes one of the component’s state settings. The SetState command can be used to change the checked, disabled, and focused states. The karaoke and pressed states may not be directly set; use the Select command or SpeakItem commands to change those states. Also, note that the focused state may only be set - it can’t be cleared.
 */

@JsonDeserialize(builder = SetStateCommand.Builder.class)
public final class SetStateCommand extends com.amazon.ask.model.interfaces.alexa.presentation.apl.Command  {

    @JsonProperty("componentId")
    private String componentId = null;

    @JsonProperty("state")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentState state = null;

    @JsonProperty("value")
    private String value = null;

    public static Builder builder() {
        return new Builder();
    }

    private SetStateCommand(Builder builder) {
        String discriminatorValue = "SetState";

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
        if (builder.state != null) {
            this.state = builder.state;
        }
        if (builder.value != null) {
            this.value = builder.value;
        }
    }

    /**
     * The id of the component whose value should be set.
     * @return componentId
    **/
    @JsonProperty("componentId")
    public String getComponentId() {
        return componentId;
    }

    /**
     * The name of the state to set. Must be one of “checked”, “disabled”, and “focused”.
     * @return state
    **/
    @JsonProperty("state")
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentState getState() {
        return state;
    }

    /**
     * The value to set on the property
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
        SetStateCommand interfacesAlexaPresentationAplSetStateCommand = (SetStateCommand) o;
        return Objects.equals(this.componentId, interfacesAlexaPresentationAplSetStateCommand.componentId) &&
            Objects.equals(this.state, interfacesAlexaPresentationAplSetStateCommand.state) &&
            Objects.equals(this.value, interfacesAlexaPresentationAplSetStateCommand.value) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId, state, value, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetStateCommand {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentState state;
        private String value;

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


        @JsonProperty("state")
        public Builder withState(com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentState state) {
            this.state = state;
            return this;
        }


        @JsonProperty("value")
        public Builder withValue(Boolean value) {
            this.value = String.valueOf(value);
            return this;
        }

        public Builder withValue(String valueExpression) {
            this.value = valueExpression;
            return this;
        }

        public SetStateCommand build() {
            return new SetStateCommand(this);
        }
    }
}

