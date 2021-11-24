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


package com.amazon.ask.model;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object providing information about the device used to send the request. The device object contains both deviceId and supportedInterfaces properties. The deviceId property uniquely identifies the device. The supportedInterfaces property lists each interface that the device supports. For example, if supportedInterfaces includes AudioPlayer {}, then you know that the device supports streaming audio using the AudioPlayer interface.
 */

@JsonDeserialize(builder = Device.Builder.class)
public final class Device {

    @JsonProperty("deviceId")
    private String deviceId = null;

    @JsonProperty("persistentEndpointId")
    private String persistentEndpointId = null;

    @JsonProperty("supportedInterfaces")
    private com.amazon.ask.model.SupportedInterfaces supportedInterfaces = null;

    public static Builder builder() {
        return new Builder();
    }

    private Device(Builder builder) {
        if (builder.deviceId != null) {
            this.deviceId = builder.deviceId;
        }
        if (builder.persistentEndpointId != null) {
            this.persistentEndpointId = builder.persistentEndpointId;
        }
        if (builder.supportedInterfaces != null) {
            this.supportedInterfaces = builder.supportedInterfaces;
        }
    }

    /**
     * The deviceId property uniquely identifies the device. This identifier is scoped to a skill. Normally, disabling and re-enabling a skill generates a new identifier.
     * @return deviceId
    **/
    @JsonProperty("deviceId")
    public String getDeviceId() {
        return deviceId;
    }


    /**
     * A persistent identifier for the Endpoint ID where the skill request is issued from. An endpoint represents an Alexa-connected Endpoint (like an Echo device, or an application) with which an Alexa customer can interact rather than a physical device,  so it could represent applications on your fire TV or your Alexa phone app.  The persistentEndpointId is a string that represents a unique identifier for the endpoint in the context of a request.  It is in the Amazon Common Identifier format \"amzn1.alexa.endpoint.did.{id}\". This identifier space is scoped to a vendor, therefore it will stay the same regardless of skill enablement.
     * @return persistentEndpointId
    **/
    @JsonProperty("persistentEndpointId")
    public String getPersistentEndpointId() {
        return persistentEndpointId;
    }


    /**
     * Lists each interface that the device supports. For example, if supportedInterfaces includes AudioPlayer {}, then you know that the device supports streaming audio using the AudioPlayer interface
     * @return supportedInterfaces
    **/
    @JsonProperty("supportedInterfaces")
    public com.amazon.ask.model.SupportedInterfaces getSupportedInterfaces() {
        return supportedInterfaces;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Device device = (Device) o;
        return Objects.equals(this.deviceId, device.deviceId) &&
            Objects.equals(this.persistentEndpointId, device.persistentEndpointId) &&
            Objects.equals(this.supportedInterfaces, device.supportedInterfaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, persistentEndpointId, supportedInterfaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Device {\n");
        
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    persistentEndpointId: ").append(toIndentedString(persistentEndpointId)).append("\n");
        sb.append("    supportedInterfaces: ").append(toIndentedString(supportedInterfaces)).append("\n");
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
        private String persistentEndpointId;
        private com.amazon.ask.model.SupportedInterfaces supportedInterfaces;

        private Builder() {}

        @JsonProperty("deviceId")

        public Builder withDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }


        @JsonProperty("persistentEndpointId")

        public Builder withPersistentEndpointId(String persistentEndpointId) {
            this.persistentEndpointId = persistentEndpointId;
            return this;
        }


        @JsonProperty("supportedInterfaces")

        public Builder withSupportedInterfaces(com.amazon.ask.model.SupportedInterfaces supportedInterfaces) {
            this.supportedInterfaces = supportedInterfaces;
            return this;
        }


        public Device build() {
            return new Device(this);
        }
    }
}

