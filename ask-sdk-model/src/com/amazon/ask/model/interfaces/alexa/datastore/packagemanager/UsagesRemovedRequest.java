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
 * Information about where the package has been removed and where its not being used anymore.
 */

@JsonDeserialize(builder = UsagesRemovedRequest.Builder.class)
public final class UsagesRemovedRequest {

    @JsonProperty("packageId")
    private String packageId = null;

    @JsonProperty("packageVersion")
    private String packageVersion = null;

    @JsonProperty("usages")
    private List<com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageRemoveUsage> usages = new ArrayList<com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageRemoveUsage>();

    private UsagesRemovedRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private UsagesRemovedRequest(Builder builder) {
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
     * Version of a package being removed from the device.
     * @return packageVersion
    **/
    @JsonProperty("packageVersion")
    public String getPackageVersion() {
        return packageVersion;
    }


    /**
     * Areas where package is going to be not used on the device.
     * @return usages
    **/
    @JsonProperty("usages")
    public List<com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageRemoveUsage> getUsages() {
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
        UsagesRemovedRequest interfacesAlexaDatastorePackagemanagerUsagesRemovedRequest = (UsagesRemovedRequest) o;
        return Objects.equals(this.packageId, interfacesAlexaDatastorePackagemanagerUsagesRemovedRequest.packageId) &&
            Objects.equals(this.packageVersion, interfacesAlexaDatastorePackagemanagerUsagesRemovedRequest.packageVersion) &&
            Objects.equals(this.usages, interfacesAlexaDatastorePackagemanagerUsagesRemovedRequest.usages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageId, packageVersion, usages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsagesRemovedRequest {\n");
        
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
        private List<com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageRemoveUsage> usages;

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

        public Builder withUsages(List<com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageRemoveUsage> usages) {
            this.usages = usages;
            return this;
        }

        public Builder addUsagesItem(com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageRemoveUsage usagesItem) {
            if (this.usages == null) {
                this.usages = new ArrayList<com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageRemoveUsage>();
            }
            this.usages.add(usagesItem);
            return this;
        }

        public UsagesRemovedRequest build() {
            return new UsagesRemovedRequest(this);
        }
    }
}

