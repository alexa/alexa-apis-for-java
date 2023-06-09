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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Information about the package that is going to be installed on the device and also where its going to be used on the device.
 */

@JsonDeserialize(builder = UsagesInstallRequest.Builder.class)
public final class UsagesInstallRequest {

    @JsonProperty("packageId")
    private String packageId = null;

    @JsonProperty("packageVersion")
    private String packageVersion = null;

    @JsonProperty("usages")
    private List<com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageInstallUsage> usages = new ArrayList<com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageInstallUsage>();

    private UsagesInstallRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private UsagesInstallRequest(Builder builder) {
        if (builder.packageId != null) {
            this.packageId = builder.packageId;
        }
        if (builder.packageVersion != null) {
            this.packageVersion = builder.packageVersion;
        }
        if (builder.usages != null) {
            this.usages = builder.usages;
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
     * Version of a package being installed on the device.
     * @return packageVersion
    **/
    @JsonProperty("packageVersion")
    public String getPackageVersion() {
        return packageVersion;
    }


    /**
     * Areas where package is going to be used on the device.
     * @return usages
    **/
    @JsonProperty("usages")
    public List<com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageInstallUsage> getUsages() {
        return usages;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsagesInstallRequest interfacesAlexaDatastorePackagemanagerUsagesInstallRequest = (UsagesInstallRequest) o;
        return Objects.equals(this.packageId, interfacesAlexaDatastorePackagemanagerUsagesInstallRequest.packageId) &&
            Objects.equals(this.packageVersion, interfacesAlexaDatastorePackagemanagerUsagesInstallRequest.packageVersion) &&
            Objects.equals(this.usages, interfacesAlexaDatastorePackagemanagerUsagesInstallRequest.usages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageId, packageVersion, usages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsagesInstallRequest {\n");
        
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    packageVersion: ").append(toIndentedString(packageVersion)).append("\n");
        sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
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
        private String packageVersion;
        private List<com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageInstallUsage> usages;

        private Builder() {}

        @JsonProperty("packageId")

        public Builder withPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }


        @JsonProperty("packageVersion")

        public Builder withPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }


        @JsonProperty("usages")

        public Builder withUsages(List<com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageInstallUsage> usages) {
            this.usages = usages;
            return this;
        }

        public Builder addUsagesItem(com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageInstallUsage usagesItem) {
            if (this.usages == null) {
                this.usages = new ArrayList<com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageInstallUsage>();
            }
            this.usages.add(usagesItem);
            return this;
        }

        public UsagesInstallRequest build() {
            return new UsagesInstallRequest(this);
        }
    }
}

