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


package com.amazon.ask.model.interfaces.alexa.datastore;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Content of a commands dispatch error.
 */

@JsonDeserialize(builder = DispatchErrorContent.Builder.class)
public final class DispatchErrorContent {

    @JsonProperty("deviceId")
    private String deviceId = null;

    @JsonProperty("commands")
    private List<com.amazon.ask.model.services.datastore.v1.Command> commands = new ArrayList<com.amazon.ask.model.services.datastore.v1.Command>();

    private DispatchErrorContent() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private DispatchErrorContent(Builder builder) {
        if (builder.deviceId != null) {
            this.deviceId = builder.deviceId;
        }
        if (builder.commands != null) {
            this.commands = builder.commands;
        }
    }

    /**
     * Identifier of the device where execution error happens.
     * @return deviceId
    **/
    @JsonProperty("deviceId")
    public String getDeviceId() {
        return deviceId;
    }


    /**
     * Commands in the same order of request time so that skill can extend deliver expiry.
     * @return commands
    **/
    @JsonProperty("commands")
    public List<com.amazon.ask.model.services.datastore.v1.Command> getCommands() {
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
        DispatchErrorContent interfacesAlexaDatastoreDispatchErrorContent = (DispatchErrorContent) o;
        return Objects.equals(this.deviceId, interfacesAlexaDatastoreDispatchErrorContent.deviceId) &&
            Objects.equals(this.commands, interfacesAlexaDatastoreDispatchErrorContent.commands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, commands);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DispatchErrorContent {\n");
        
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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
        private String deviceId;
        private List<com.amazon.ask.model.services.datastore.v1.Command> commands;

        private Builder() {}

        @JsonProperty("deviceId")

        public Builder withDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }


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

        public DispatchErrorContent build() {
            return new DispatchErrorContent(this);
        }
    }
}

