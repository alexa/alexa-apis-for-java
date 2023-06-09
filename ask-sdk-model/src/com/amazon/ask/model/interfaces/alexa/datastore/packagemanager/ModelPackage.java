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
 * Information of the package that is being installed on the device.
 */

@JsonDeserialize(builder = ModelPackage.Builder.class)
public final class ModelPackage {

    @JsonProperty("packageVersion")
    private String packageVersion = null;

    private ModelPackage() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ModelPackage(Builder builder) {
        if (builder.packageVersion != null) {
            this.packageVersion = builder.packageVersion;
        }
    }

    /**
     * Version of a package manifest schema. Currently supported schema version is 1.0.
     * @return packageVersion
    **/
    @JsonProperty("packageVersion")
    public String getPackageVersion() {
        return packageVersion;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelPackage interfacesAlexaDatastorePackagemanagerPackage = (ModelPackage) o;
        return Objects.equals(this.packageVersion, interfacesAlexaDatastorePackagemanagerPackage.packageVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelPackage {\n");
        
        sb.append("    packageVersion: ").append(toIndentedString(packageVersion)).append("\n");
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
        private String packageVersion;

        private Builder() {}

        @JsonProperty("packageVersion")

        public Builder withPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }


        public ModelPackage build() {
            return new ModelPackage(this);
        }
    }
}

