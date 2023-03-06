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
 * Provides context about the list of packages installed on the device.
 */

@JsonDeserialize(builder = PackageManagerState.Builder.class)
public final class PackageManagerState {

    @JsonProperty("installedPackages")
    private List<com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageStateInformation> installedPackages = new ArrayList<com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageStateInformation>();

    private PackageManagerState() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private PackageManagerState(Builder builder) {
        if (builder.installedPackages != null) {
            this.installedPackages = builder.installedPackages;
        }
    }

    /**
     * Includes all installed packages on the device.
     * @return installedPackages
    **/
    @JsonProperty("installedPackages")
    public List<com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageStateInformation> getInstalledPackages() {
        return installedPackages;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PackageManagerState interfacesAlexaDatastorePackagemanagerPackageManagerState = (PackageManagerState) o;
        return Objects.equals(this.installedPackages, interfacesAlexaDatastorePackagemanagerPackageManagerState.installedPackages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(installedPackages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageManagerState {\n");
        
        sb.append("    installedPackages: ").append(toIndentedString(installedPackages)).append("\n");
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
        private List<com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageStateInformation> installedPackages;

        private Builder() {}

        @JsonProperty("installedPackages")

        public Builder withInstalledPackages(List<com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageStateInformation> installedPackages) {
            this.installedPackages = installedPackages;
            return this;
        }

        public Builder addInstalledPackagesItem(com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageStateInformation installedPackagesItem) {
            if (this.installedPackages == null) {
                this.installedPackages = new ArrayList<com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageStateInformation>();
            }
            this.installedPackages.add(installedPackagesItem);
            return this;
        }

        public PackageManagerState build() {
            return new PackageManagerState(this);
        }
    }
}

