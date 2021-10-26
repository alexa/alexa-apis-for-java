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


package com.amazon.ask.model.interfaces.applink;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * AppLinkState
 */

@JsonDeserialize(builder = AppLinkState.Builder.class)
public final class AppLinkState {

    @JsonProperty("supportedCatalogTypes")
    private List<com.amazon.ask.model.interfaces.applink.CatalogTypes> supportedCatalogTypes = new ArrayList<com.amazon.ask.model.interfaces.applink.CatalogTypes>();

    @JsonProperty("directLaunch")
    private com.amazon.ask.model.interfaces.applink.DirectLaunch directLaunch = null;

    @JsonProperty("sendToDevice")
    private com.amazon.ask.model.interfaces.applink.SendToDevice sendToDevice = null;

    public static Builder builder() {
        return new Builder();
    }

    private AppLinkState(Builder builder) {
        if (builder.supportedCatalogTypes != null) {
            this.supportedCatalogTypes = builder.supportedCatalogTypes;
        }
        if (builder.directLaunch != null) {
            this.directLaunch = builder.directLaunch;
        }
        if (builder.sendToDevice != null) {
            this.sendToDevice = builder.sendToDevice;
        }
    }

    /**
     * Get supportedCatalogTypes
     * @return supportedCatalogTypes
    **/
    @JsonProperty("supportedCatalogTypes")
    public List<com.amazon.ask.model.interfaces.applink.CatalogTypes> getSupportedCatalogTypes() {
        return supportedCatalogTypes;
    }


    /**
     * Get directLaunch
     * @return directLaunch
    **/
    @JsonProperty("directLaunch")
    public com.amazon.ask.model.interfaces.applink.DirectLaunch getDirectLaunch() {
        return directLaunch;
    }


    /**
     * Get sendToDevice
     * @return sendToDevice
    **/
    @JsonProperty("sendToDevice")
    public com.amazon.ask.model.interfaces.applink.SendToDevice getSendToDevice() {
        return sendToDevice;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppLinkState interfacesApplinkAppLinkState = (AppLinkState) o;
        return Objects.equals(this.supportedCatalogTypes, interfacesApplinkAppLinkState.supportedCatalogTypes) &&
            Objects.equals(this.directLaunch, interfacesApplinkAppLinkState.directLaunch) &&
            Objects.equals(this.sendToDevice, interfacesApplinkAppLinkState.sendToDevice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportedCatalogTypes, directLaunch, sendToDevice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppLinkState {\n");
        
        sb.append("    supportedCatalogTypes: ").append(toIndentedString(supportedCatalogTypes)).append("\n");
        sb.append("    directLaunch: ").append(toIndentedString(directLaunch)).append("\n");
        sb.append("    sendToDevice: ").append(toIndentedString(sendToDevice)).append("\n");
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
        private List<com.amazon.ask.model.interfaces.applink.CatalogTypes> supportedCatalogTypes;
        private com.amazon.ask.model.interfaces.applink.DirectLaunch directLaunch;
        private com.amazon.ask.model.interfaces.applink.SendToDevice sendToDevice;

        private Builder() {}

        @JsonProperty("supportedCatalogTypes")

        public Builder withSupportedCatalogTypes(List<com.amazon.ask.model.interfaces.applink.CatalogTypes> supportedCatalogTypes) {
            this.supportedCatalogTypes = supportedCatalogTypes;
            return this;
        }

        public Builder addSupportedCatalogTypesItem(com.amazon.ask.model.interfaces.applink.CatalogTypes supportedCatalogTypesItem) {
            if (this.supportedCatalogTypes == null) {
                this.supportedCatalogTypes = new ArrayList<com.amazon.ask.model.interfaces.applink.CatalogTypes>();
            }
            this.supportedCatalogTypes.add(supportedCatalogTypesItem);
            return this;
        }

        @JsonProperty("directLaunch")

        public Builder withDirectLaunch(com.amazon.ask.model.interfaces.applink.DirectLaunch directLaunch) {
            this.directLaunch = directLaunch;
            return this;
        }


        @JsonProperty("sendToDevice")

        public Builder withSendToDevice(com.amazon.ask.model.interfaces.applink.SendToDevice sendToDevice) {
            this.sendToDevice = sendToDevice;
            return this;
        }


        public AppLinkState build() {
            return new AppLinkState(this);
        }
    }
}

