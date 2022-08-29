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
 * Select a single command from an array of commands and data.
 */

@JsonDeserialize(builder = SelectCommand.Builder.class)
public final class SelectCommand extends com.amazon.ask.model.interfaces.alexa.presentation.apl.Command  {

    @JsonProperty("commands")
    private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command> commands = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command>();

    @JsonProperty("data")
    private List<Object> data = new ArrayList<Object>();

    @JsonProperty("otherwise")
    private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command> otherwise = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command>();

    private SelectCommand() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SelectCommand(Builder builder) {
        String discriminatorValue = "Select";

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
        if (builder.commands != null) {
            this.commands = builder.commands;
        }
        if (builder.data != null) {
            this.data = builder.data;
        }
        if (builder.otherwise != null) {
            this.otherwise = builder.otherwise;
        }
    }

    /**
     * An ordered list of commands to select from.
     * @return commands
    **/
    @JsonProperty("commands")
    public List<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command> getCommands() {
        return commands;
    }


    /**
     * A list of data to map against the commands.
     * @return data
    **/
    @JsonProperty("data")
    public List<Object> getData() {
        return data;
    }


    /**
     * Commands to execute if nothing else runs.
     * @return otherwise
    **/
    @JsonProperty("otherwise")
    public List<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command> getOtherwise() {
        return otherwise;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SelectCommand interfacesAlexaPresentationAplSelectCommand = (SelectCommand) o;
        return Objects.equals(this.commands, interfacesAlexaPresentationAplSelectCommand.commands) &&
            Objects.equals(this.data, interfacesAlexaPresentationAplSelectCommand.data) &&
            Objects.equals(this.otherwise, interfacesAlexaPresentationAplSelectCommand.otherwise) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commands, data, otherwise, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SelectCommand {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    otherwise: ").append(toIndentedString(otherwise)).append("\n");
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
        private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command> commands;
        private List<Object> data;
        private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command> otherwise;

        private Builder() {}

        @JsonProperty("delay")

        public Builder withDelay(Integer delay) {
            this.delay = String.valueOf(delay);
            return this;
        }

        @JsonProperty("delay")

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


        @JsonProperty("commands")

        public Builder withCommands(List<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command> commands) {
            this.commands = commands;
            return this;
        }

        public Builder addCommandsItem(com.amazon.ask.model.interfaces.alexa.presentation.apl.Command commandsItem) {
            if (this.commands == null) {
                this.commands = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command>();
            }
            this.commands.add(commandsItem);
            return this;
        }

        @JsonProperty("data")

        public Builder withData(List<Object> data) {
            this.data = data;
            return this;
        }

        public Builder addDataItem(Object dataItem) {
            if (this.data == null) {
                this.data = new ArrayList<Object>();
            }
            this.data.add(dataItem);
            return this;
        }

        @JsonProperty("otherwise")

        public Builder withOtherwise(List<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command> otherwise) {
            this.otherwise = otherwise;
            return this;
        }

        public Builder addOtherwiseItem(com.amazon.ask.model.interfaces.alexa.presentation.apl.Command otherwiseItem) {
            if (this.otherwise == null) {
                this.otherwise = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command>();
            }
            this.otherwise.add(otherwiseItem);
            return this;
        }

        public SelectCommand build() {
            return new SelectCommand(this);
        }
    }
}

