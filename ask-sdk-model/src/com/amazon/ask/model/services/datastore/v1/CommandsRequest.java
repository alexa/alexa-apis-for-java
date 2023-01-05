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


package com.amazon.ask.model.services.datastore.v1;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * CommandsRequest
 */

@JsonDeserialize(builder = CommandsRequest.Builder.class)
public final class CommandsRequest {

    @JsonProperty("commands")
    private List<com.amazon.ask.model.services.datastore.v1.Command> commands = new ArrayList<com.amazon.ask.model.services.datastore.v1.Command>();

    @JsonProperty("target")
    private com.amazon.ask.model.services.datastore.v1.Target target = null;

    @JsonProperty("attemptDeliveryUntil")
    private String attemptDeliveryUntil = null;

    private CommandsRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private CommandsRequest(Builder builder) {
        if (builder.commands != null) {
            this.commands = builder.commands;
        }
        if (builder.target != null) {
            this.target = builder.target;
        }
        if (builder.attemptDeliveryUntil != null) {
            this.attemptDeliveryUntil = builder.attemptDeliveryUntil;
        }
    }

    /**
     * Collection of ordered commands which needs to be executed in DataStore.
     * @return commands
    **/
    @JsonProperty("commands")
    public List<com.amazon.ask.model.services.datastore.v1.Command> getCommands() {
        return commands;
    }


    /**
     * Target where update needs to be published.
     * @return target
    **/
    @JsonProperty("target")
    public com.amazon.ask.model.services.datastore.v1.Target getTarget() {
        return target;
    }


    /**
     * Date and time, in ISO-8601 representation, when to halt the attempt to deliver the commands.
     * @return attemptDeliveryUntil
    **/
    @JsonProperty("attemptDeliveryUntil")
    public String getAttemptDeliveryUntil() {
        return attemptDeliveryUntil;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommandsRequest servicesDatastoreV1CommandsRequest = (CommandsRequest) o;
        return Objects.equals(this.commands, servicesDatastoreV1CommandsRequest.commands) &&
            Objects.equals(this.target, servicesDatastoreV1CommandsRequest.target) &&
            Objects.equals(this.attemptDeliveryUntil, servicesDatastoreV1CommandsRequest.attemptDeliveryUntil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commands, target, attemptDeliveryUntil);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommandsRequest {\n");
        
        sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    attemptDeliveryUntil: ").append(toIndentedString(attemptDeliveryUntil)).append("\n");
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
        private List<com.amazon.ask.model.services.datastore.v1.Command> commands;
        private com.amazon.ask.model.services.datastore.v1.Target target;
        private String attemptDeliveryUntil;

        private Builder() {}

        @JsonProperty("commands")

        public Builder withCommands(List<com.amazon.ask.model.services.datastore.v1.Command> commands) {
            this.commands = commands;
            return this;
        }

        public Builder addCommandsItem(com.amazon.ask.model.services.datastore.v1.Command commandsItem) {
            if (this.commands == null) {
                this.commands = new ArrayList<com.amazon.ask.model.services.datastore.v1.Command>();
            }
            this.commands.add(commandsItem);
            return this;
        }

        @JsonProperty("target")

        public Builder withTarget(com.amazon.ask.model.services.datastore.v1.Target target) {
            this.target = target;
            return this;
        }


        @JsonProperty("attemptDeliveryUntil")

        public Builder withAttemptDeliveryUntil(String attemptDeliveryUntil) {
            this.attemptDeliveryUntil = attemptDeliveryUntil;
            return this;
        }


        public CommandsRequest build() {
            return new CommandsRequest(this);
        }
    }
}

