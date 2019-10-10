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


package com.amazon.ask.model.services.endpointEnumeration;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Contains the list of connected endpoints and their declared capabilities.
 */

@JsonDeserialize(builder = EndpointInfo.Builder.class)
public final class EndpointInfo {

    @JsonProperty("endpointId")
    private String endpointId = null;

    @JsonProperty("friendlyName")
    private String friendlyName = null;

    @JsonProperty("capabilities")
    private List<com.amazon.ask.model.services.endpointEnumeration.EndpointCapability> capabilities = new ArrayList<com.amazon.ask.model.services.endpointEnumeration.EndpointCapability>();

    public static Builder builder() {
        return new Builder();
    }

    private EndpointInfo(Builder builder) {
        if (builder.endpointId != null) {
            this.endpointId = builder.endpointId;
        }
        if (builder.friendlyName != null) {
            this.friendlyName = builder.friendlyName;
        }
        if (builder.capabilities != null) {
            this.capabilities = builder.capabilities;
        }
    }

    /**
     * A unique identifier for the endpoint.
     * @return endpointId
    **/
    @JsonProperty("endpointId")
    public String getEndpointId() {
        return endpointId;
    }

    /**
     * The name of the endpoint. Because this name might be changed by the user or the platform, it might be different than the Bluetooth friendly name.
     * @return friendlyName
    **/
    @JsonProperty("friendlyName")
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * The list of endpoint capabilities.
     * @return capabilities
    **/
    @JsonProperty("capabilities")
    public List<com.amazon.ask.model.services.endpointEnumeration.EndpointCapability> getCapabilities() {
        return capabilities;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EndpointInfo servicesEndpointEnumerationEndpointInfo = (EndpointInfo) o;
        return Objects.equals(this.endpointId, servicesEndpointEnumerationEndpointInfo.endpointId) &&
            Objects.equals(this.friendlyName, servicesEndpointEnumerationEndpointInfo.friendlyName) &&
            Objects.equals(this.capabilities, servicesEndpointEnumerationEndpointInfo.capabilities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointId, friendlyName, capabilities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndpointInfo {\n");
        
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
        sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
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
        private String endpointId;
        private String friendlyName;
        private List<com.amazon.ask.model.services.endpointEnumeration.EndpointCapability> capabilities;

        private Builder() {}

        @JsonProperty("endpointId")
        public Builder withEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }


        @JsonProperty("friendlyName")
        public Builder withFriendlyName(String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }


        @JsonProperty("capabilities")
        public Builder withCapabilities(List<com.amazon.ask.model.services.endpointEnumeration.EndpointCapability> capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        public Builder addCapabilitiesItem(com.amazon.ask.model.services.endpointEnumeration.EndpointCapability capabilitiesItem) {
            if (this.capabilities == null) {
                this.capabilities = new ArrayList<com.amazon.ask.model.services.endpointEnumeration.EndpointCapability>();
            }
            this.capabilities.add(capabilitiesItem);
            return this;
        }

        public EndpointInfo build() {
            return new EndpointInfo(this);
        }
    }
}

