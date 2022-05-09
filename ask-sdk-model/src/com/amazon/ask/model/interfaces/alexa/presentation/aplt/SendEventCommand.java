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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * The SendEvent command allows the APL author to generate and send an event to Alexa.
 */

@JsonDeserialize(builder = SendEventCommand.Builder.class)
public final class SendEventCommand extends com.amazon.ask.model.interfaces.alexa.presentation.aplt.Command  {

    @JsonProperty("arguments")
    private List<String> arguments = new ArrayList<String>();

    @JsonProperty("components")
    private List<String> components = new ArrayList<String>();

    public static Builder builder() {
        return new Builder();
    }

    private SendEventCommand(Builder builder) {
        String discriminatorValue = "SendEvent";

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
        if (builder.arguments != null) {
            this.arguments = builder.arguments;
        }
        if (builder.components != null) {
            this.components = builder.components;
        }
    }

    /**
     * An array of argument data to pass to Alexa.
     * @return arguments
    **/
    @JsonProperty("arguments")
    public List<String> getArguments() {
        return arguments;
    }


    /**
     * An array of components to extract value data from and provide to Alexa.
     * @return components
    **/
    @JsonProperty("components")
    public List<String> getComponents() {
        return components;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SendEventCommand interfacesAlexaPresentationApltSendEventCommand = (SendEventCommand) o;
        return Objects.equals(this.arguments, interfacesAlexaPresentationApltSendEventCommand.arguments) &&
            Objects.equals(this.components, interfacesAlexaPresentationApltSendEventCommand.components) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arguments, components, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendEventCommand {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
        sb.append("    components: ").append(toIndentedString(components)).append("\n");
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
        private List<String> arguments;
        private List<String> components;

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

        @JsonProperty("when")

        public Builder withWhen(String whenExpression) {
            this.when = whenExpression;
            return this;
        }

        @JsonProperty("arguments")

        public Builder withArguments(List<String> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder addArgumentsItem(String argumentsItem) {
            if (this.arguments == null) {
                this.arguments = new ArrayList<String>();
            }
            this.arguments.add(argumentsItem);
            return this;
        }

        @JsonProperty("components")

        public Builder withComponents(List<String> components) {
            this.components = components;
            return this;
        }

        public Builder addComponentsItem(String componentsItem) {
            if (this.components == null) {
                this.components = new ArrayList<String>();
            }
            this.components.add(componentsItem);
            return this;
        }

        public SendEventCommand build() {
            return new SendEventCommand(this);
        }
    }
}

