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
 * State information of the DataStore package version installed on the device.
 */

@JsonDeserialize(builder = PackageStateInformation.Builder.class)
public final class PackageStateInformation {

    @JsonProperty("packageId")
    private String packageId = null;

    @JsonProperty("version")
    private String version = null;

    private PackageStateInformation() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private PackageStateInformation(Builder builder) {
        if (builder.packageId != null) {
            this.packageId = builder.packageId;
        }
        if (builder.version != null) {
            this.version = builder.version;
        }
    }

    /**
     * Unique package identifier for a client.
     * @return packageId
    **/
    @JsonProperty("packageId")
    public String getPackageId() {
        return packageId;
    }


    /**
     * Unique version of a package.
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PackageStateInformation interfacesAlexaDatastorePackagemanagerPackageStateInformation = (PackageStateInformation) o;
        return Objects.equals(this.packageId, interfacesAlexaDatastorePackagemanagerPackageStateInformation.packageId) &&
            Objects.equals(this.version, interfacesAlexaDatastorePackagemanagerPackageStateInformation.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageId, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageStateInformation {\n");
        
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
        private String packageId;
        private String version;

        private Builder() {}

        @JsonProperty("packageId")

        public Builder withPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }


        @JsonProperty("version")

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        public PackageStateInformation build() {
            return new PackageStateInformation(this);
        }
    }
}

