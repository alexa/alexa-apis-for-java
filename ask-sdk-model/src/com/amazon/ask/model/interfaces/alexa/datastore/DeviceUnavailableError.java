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
 * Describes a dispatch error when device is not available.
 */

@JsonDeserialize(builder = DeviceUnavailableError.Builder.class)
public final class DeviceUnavailableError extends com.amazon.ask.model.interfaces.alexa.datastore.CommandsError  {

    @JsonProperty("content")
    private com.amazon.ask.model.interfaces.alexa.datastore.DispatchErrorContent content = null;

    private DeviceUnavailableError() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private DeviceUnavailableError(Builder builder) {
        String discriminatorValue = "DEVICE_UNAVAILABLE";

        this.type = discriminatorValue;
        if (builder.content != null) {
            this.content = builder.content;
        }
    }

    /**
     * Get content
     * @return content
    **/
    @JsonProperty("content")
    public com.amazon.ask.model.interfaces.alexa.datastore.DispatchErrorContent getContent() {
        return content;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceUnavailableError interfacesAlexaDatastoreDeviceUnavailableError = (DeviceUnavailableError) o;
        return Objects.equals(this.content, interfacesAlexaDatastoreDeviceUnavailableError.content) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceUnavailableError {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
        private com.amazon.ask.model.interfaces.alexa.datastore.DispatchErrorContent content;

        private Builder() {}

        @JsonProperty("content")

        public Builder withContent(com.amazon.ask.model.interfaces.alexa.datastore.DispatchErrorContent content) {
            this.content = content;
            return this;
        }


        public DeviceUnavailableError build() {
            return new DeviceUnavailableError(this);
        }
    }
}

