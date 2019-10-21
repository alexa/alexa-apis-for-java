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
 * Alexa.Presentation.APLT.ExecuteCommands directive used to send APL-T commands to a device.
 */

@JsonDeserialize(builder = ExecuteCommandsDirective.Builder.class)
public final class ExecuteCommandsDirective extends com.amazon.ask.model.Directive  {

    @JsonProperty("commands")
    private List<com.amazon.ask.model.interfaces.alexa.presentation.aplt.Command> commands = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.aplt.Command>();

    @JsonProperty("token")
    private String token = null;

    public static Builder builder() {
        return new Builder();
    }

    private ExecuteCommandsDirective(Builder builder) {
        String discriminatorValue = "Alexa.Presentation.APLT.ExecuteCommands";

        this.type = discriminatorValue;
        if (builder.commands != null) {
            this.commands = builder.commands;
        }
        if (builder.token != null) {
            this.token = builder.token;
        }
    }

    /**
     * List of Command instances
     * @return commands
    **/
    @JsonProperty("commands")
    public List<com.amazon.ask.model.interfaces.alexa.presentation.aplt.Command> getCommands() {
        return commands;
    }

    /**
     * A skill defined token, unique for each presentation. Must match the token provided by the skill in the RenderDocument directive used to render the original APL document.
     * @return token
    **/
    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteCommandsDirective interfacesAlexaPresentationApltExecuteCommandsDirective = (ExecuteCommandsDirective) o;
        return Objects.equals(this.commands, interfacesAlexaPresentationApltExecuteCommandsDirective.commands) &&
            Objects.equals(this.token, interfacesAlexaPresentationApltExecuteCommandsDirective.token) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commands, token, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteCommandsDirective {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
        private List<com.amazon.ask.model.interfaces.alexa.presentation.aplt.Command> commands;
        private String token;

        private Builder() {}

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

        @JsonProperty("token")
        public Builder withToken(String token) {
            this.token = token;
            return this;
        }


        public ExecuteCommandsDirective build() {
            return new ExecuteCommandsDirective(this);
        }
    }
}

