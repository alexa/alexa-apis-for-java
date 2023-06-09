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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This event is sent by device DataStore Package Manager to let the skill developer know that there was a problem installing/updating the package.
 */

@JsonDeserialize(builder = InstallationError.Builder.class)
public final class InstallationError extends com.amazon.ask.model.Request  {

    @JsonProperty("packageId")
    private String packageId = null;

    @JsonProperty("version")
    private String version = null;

    @JsonProperty("error")
    private com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageError error = null;

    private InstallationError() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private InstallationError(Builder builder) {
        String discriminatorValue = "Alexa.DataStore.PackageManager.InstallationError";

        this.type = discriminatorValue;
        if (builder.requestId != null) {
            this.requestId = builder.requestId;
        }
        if (builder.timestamp != null) {
            this.timestamp = builder.timestamp;
        }
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
        if (builder.packageId != null) {
            this.packageId = builder.packageId;
        }
        if (builder.version != null) {
            this.version = builder.version;
        }
        if (builder.error != null) {
            this.error = builder.error;
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
     * Current version of the package trying to be installed/updated on the device.
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }


    /**
     * Get error
     * @return error
    **/
    @JsonProperty("error")
    public com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageError getError() {
        return error;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstallationError interfacesAlexaDatastorePackagemanagerInstallationError = (InstallationError) o;
        return Objects.equals(this.packageId, interfacesAlexaDatastorePackagemanagerInstallationError.packageId) &&
            Objects.equals(this.version, interfacesAlexaDatastorePackagemanagerInstallationError.version) &&
            Objects.equals(this.error, interfacesAlexaDatastorePackagemanagerInstallationError.error) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageId, version, error, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstallationError {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
        private String requestId;
        private OffsetDateTime timestamp;
        private String locale;
        private String packageId;
        private String version;
        private com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageError error;

        private Builder() {}

        @JsonProperty("requestId")

        public Builder withRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }


        @JsonProperty("timestamp")

        public Builder withTimestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }


        @JsonProperty("locale")

        public Builder withLocale(String locale) {
            this.locale = locale;
            return this;
        }


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


        @JsonProperty("error")

        public Builder withError(com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.PackageError error) {
            this.error = error;
            return this;
        }


        public InstallationError build() {
            return new InstallationError(this);
        }
    }
}

