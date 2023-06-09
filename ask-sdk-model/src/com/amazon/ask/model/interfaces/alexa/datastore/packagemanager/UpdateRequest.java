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
 * This event is request sent by device DataStore Package Manager asking the skill developer them to update the version of the package on device.
 */

@JsonDeserialize(builder = UpdateRequest.Builder.class)
public final class UpdateRequest extends com.amazon.ask.model.Request  {

    @JsonProperty("packageId")
    private String packageId = null;

    @JsonProperty("fromVersion")
    private String fromVersion = null;

    @JsonProperty("toVersion")
    private String toVersion = null;

    private UpdateRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private UpdateRequest(Builder builder) {
        String discriminatorValue = "Alexa.DataStore.PackageManager.UpdateRequest";

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
        if (builder.fromVersion != null) {
            this.fromVersion = builder.fromVersion;
        }
        if (builder.toVersion != null) {
            this.toVersion = builder.toVersion;
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
     * Current version of a package installed on the device.
     * @return fromVersion
    **/
    @JsonProperty("fromVersion")
    public String getFromVersion() {
        return fromVersion;
    }


    /**
     * Latest version of a package being installed on the device.
     * @return toVersion
    **/
    @JsonProperty("toVersion")
    public String getToVersion() {
        return toVersion;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRequest interfacesAlexaDatastorePackagemanagerUpdateRequest = (UpdateRequest) o;
        return Objects.equals(this.packageId, interfacesAlexaDatastorePackagemanagerUpdateRequest.packageId) &&
            Objects.equals(this.fromVersion, interfacesAlexaDatastorePackagemanagerUpdateRequest.fromVersion) &&
            Objects.equals(this.toVersion, interfacesAlexaDatastorePackagemanagerUpdateRequest.toVersion) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageId, fromVersion, toVersion, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRequest {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    fromVersion: ").append(toIndentedString(fromVersion)).append("\n");
        sb.append("    toVersion: ").append(toIndentedString(toVersion)).append("\n");
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
        private String fromVersion;
        private String toVersion;

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


        @JsonProperty("fromVersion")

        public Builder withFromVersion(String fromVersion) {
            this.fromVersion = fromVersion;
            return this;
        }


        @JsonProperty("toVersion")

        public Builder withToVersion(String toVersion) {
            this.toVersion = toVersion;
            return this;
        }


        public UpdateRequest build() {
            return new UpdateRequest(this);
        }
    }
}

