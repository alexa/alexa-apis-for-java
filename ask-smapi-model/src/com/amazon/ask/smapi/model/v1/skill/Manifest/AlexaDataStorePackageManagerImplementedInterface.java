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


package com.amazon.ask.smapi.model.v1.skill.Manifest;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * AlexaDataStorePackageManagerImplementedInterface
 */

@JsonDeserialize(builder = AlexaDataStorePackageManagerImplementedInterface.Builder.class)
public final class AlexaDataStorePackageManagerImplementedInterface {

    @JsonProperty("packages")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.DataStorePackage> packages = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.DataStorePackage>();

    private AlexaDataStorePackageManagerImplementedInterface() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private AlexaDataStorePackageManagerImplementedInterface(Builder builder) {
        if (builder.packages != null) {
            this.packages = builder.packages;
        }
    }

    /**
     * The list of data store packages that are authored by skill developer.
     * @return packages
    **/
    @JsonProperty("packages")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.DataStorePackage> getPackages() {
        return packages;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlexaDataStorePackageManagerImplementedInterface v1SkillManifestAlexaDataStorePackageManagerImplementedInterface = (AlexaDataStorePackageManagerImplementedInterface) o;
        return Objects.equals(this.packages, v1SkillManifestAlexaDataStorePackageManagerImplementedInterface.packages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlexaDataStorePackageManagerImplementedInterface {\n");
        
        sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.DataStorePackage> packages;

        private Builder() {}

        @JsonProperty("packages")

        public Builder withPackages(List<com.amazon.ask.smapi.model.v1.skill.Manifest.DataStorePackage> packages) {
            this.packages = packages;
            return this;
        }

        public Builder addPackagesItem(com.amazon.ask.smapi.model.v1.skill.Manifest.DataStorePackage packagesItem) {
            if (this.packages == null) {
                this.packages = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.DataStorePackage>();
            }
            this.packages.add(packagesItem);
            return this;
        }

        public AlexaDataStorePackageManagerImplementedInterface build() {
            return new AlexaDataStorePackageManagerImplementedInterface(this);
        }
    }
}

