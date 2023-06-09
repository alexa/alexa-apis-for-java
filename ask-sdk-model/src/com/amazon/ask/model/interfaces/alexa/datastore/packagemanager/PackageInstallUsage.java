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


package com.amazon.ask.model.interfaces.alexa.datastore.packagemanager;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Places where the package is going to be used on the device. This object is passed as part of the InstallRequest to the skill.
 */

@JsonDeserialize(builder = PackageInstallUsage.Builder.class)
public final class PackageInstallUsage {

    @JsonProperty("location")
    private String location = null;

    @JsonProperty("instanceId")
    private String instanceId = null;

    private PackageInstallUsage() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private PackageInstallUsage(Builder builder) {
        if (builder.location != null) {
            this.location = builder.location;
        }
        if (builder.instanceId != null) {
            this.instanceId = builder.instanceId;
        }
    }

    /**
     * Get location
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getLocationAsString().
     *
     * @return location
    **/
    
    public com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.Locations getLocation() {
        return com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.Locations.fromValue(location);
    }

    /**
     * Get the underlying String value for location.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return location as a String value
    **/
    @JsonProperty("location")
    public String getLocationAsString() {
      return location;
    }

    /**
     * Identifier of the instance of the package.
     * @return instanceId
    **/
    @JsonProperty("instanceId")
    public String getInstanceId() {
        return instanceId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PackageInstallUsage interfacesAlexaDatastorePackagemanagerPackageInstallUsage = (PackageInstallUsage) o;
        return Objects.equals(this.location, interfacesAlexaDatastorePackagemanagerPackageInstallUsage.location) &&
            Objects.equals(this.instanceId, interfacesAlexaDatastorePackagemanagerPackageInstallUsage.instanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, instanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageInstallUsage {\n");
        
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
        private String location;
        private String instanceId;

        private Builder() {}

        @JsonProperty("location")

        public Builder withLocation(String location) {
          this.location = location;
          return this;
        }

        public Builder withLocation(com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.Locations location) {
            this.location = location != null ? location.toString() : null;
            return this;
        }


        @JsonProperty("instanceId")

        public Builder withInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }


        public PackageInstallUsage build() {
            return new PackageInstallUsage(this);
        }
    }
}

