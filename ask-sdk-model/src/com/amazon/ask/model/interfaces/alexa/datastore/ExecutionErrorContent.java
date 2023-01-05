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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Content of an execution error.
 */

@JsonDeserialize(builder = ExecutionErrorContent.Builder.class)
public final class ExecutionErrorContent {

    @JsonProperty("deviceId")
    private String deviceId = null;

    @JsonProperty("failedCommand")
    private com.amazon.ask.model.services.datastore.v1.Command failedCommand = null;

    @JsonProperty("message")
    private String message = null;

    private ExecutionErrorContent() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ExecutionErrorContent(Builder builder) {
        if (builder.deviceId != null) {
            this.deviceId = builder.deviceId;
        }
        if (builder.failedCommand != null) {
            this.failedCommand = builder.failedCommand;
        }
        if (builder.message != null) {
            this.message = builder.message;
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
     * the command that was not executed successfully because of the error.
     * @return failedCommand
    **/
    @JsonProperty("failedCommand")
    public com.amazon.ask.model.services.datastore.v1.Command getFailedCommand() {
        return failedCommand;
    }


    /**
     * Opaque message describing the error.
     * @return message
    **/
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecutionErrorContent interfacesAlexaDatastoreExecutionErrorContent = (ExecutionErrorContent) o;
        return Objects.equals(this.deviceId, interfacesAlexaDatastoreExecutionErrorContent.deviceId) &&
            Objects.equals(this.failedCommand, interfacesAlexaDatastoreExecutionErrorContent.failedCommand) &&
            Objects.equals(this.message, interfacesAlexaDatastoreExecutionErrorContent.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, failedCommand, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionErrorContent {\n");
        
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    failedCommand: ").append(toIndentedString(failedCommand)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
        private com.amazon.ask.model.services.datastore.v1.Command failedCommand;
        private String message;

        private Builder() {}

        @JsonProperty("deviceId")

        public Builder withDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }


        @JsonProperty("failedCommand")

        public Builder withFailedCommand(com.amazon.ask.model.services.datastore.v1.Command failedCommand) {
            this.failedCommand = failedCommand;
            return this;
        }


        @JsonProperty("message")

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }


        public ExecutionErrorContent build() {
            return new ExecutionErrorContent(this);
        }
    }
}

