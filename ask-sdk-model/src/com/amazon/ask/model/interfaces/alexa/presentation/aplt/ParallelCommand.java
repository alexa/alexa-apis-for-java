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
 * Execute a series of commands in parallel. The parallel command starts executing all child command simultaneously. The parallel command is considered finished when all of its child commands have finished. When the parallel command is terminated early, all currently executing commands are terminated.
 */

@JsonDeserialize(builder = ParallelCommand.Builder.class)
public final class ParallelCommand extends com.amazon.ask.model.interfaces.alexa.presentation.aplt.Command  {

    @JsonProperty("commands")
    private List<com.amazon.ask.model.interfaces.alexa.presentation.aplt.Command> commands = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.aplt.Command>();

    public static Builder builder() {
        return new Builder();
    }

    private ParallelCommand(Builder builder) {
        String discriminatorValue = "Parallel";

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
        if (builder.commands != null) {
            this.commands = builder.commands;
        }
    }

    /**
     * An un-ordered array of commands to execute in parallel. Once all commands have finished executing the parallel command finishes. Please note that the delay of parallel command and the delay of each command are additive.
     * @return commands
    **/
    @JsonProperty("commands")
    public List<com.amazon.ask.model.interfaces.alexa.presentation.aplt.Command> getCommands() {
        return commands;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParallelCommand interfacesAlexaPresentationApltParallelCommand = (ParallelCommand) o;
        return Objects.equals(this.commands, interfacesAlexaPresentationApltParallelCommand.commands) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commands, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParallelCommand {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
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
        private List<com.amazon.ask.model.interfaces.alexa.presentation.aplt.Command> commands;

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

        @JsonProperty("commands")
        public Builder withCommands(List<com.amazon.ask.model.interfaces.alexa.presentation.aplt.Command> commands) {
            this.commands = commands;
            return this;
        }

        public Builder addCommandsItem(com.amazon.ask.model.interfaces.alexa.presentation.aplt.Command commandsItem) {
            if (this.commands == null) {
                this.commands = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.aplt.Command>();
            }
            this.commands.add(commandsItem);
            return this;
        }

        public ParallelCommand build() {
            return new ParallelCommand(this);
        }
    }
}

