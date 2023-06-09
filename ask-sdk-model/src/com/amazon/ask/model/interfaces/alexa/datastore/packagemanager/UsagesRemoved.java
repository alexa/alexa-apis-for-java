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
 * This event is sent by device DataStore Package Manager to let the skill developer know about the usages of packages removed from the device.
 */

@JsonDeserialize(builder = UsagesRemoved.Builder.class)
public final class UsagesRemoved extends com.amazon.ask.model.Request  {

    @JsonProperty("payload")
    private com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.UsagesRemovedRequest payload = null;

    private UsagesRemoved() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private UsagesRemoved(Builder builder) {
        String discriminatorValue = "Alexa.DataStore.PackageManager.UsagesRemoved";

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
        if (builder.payload != null) {
            this.payload = builder.payload;
        }
    }

    /**
     * Get payload
     * @return payload
    **/
    @JsonProperty("payload")
    public com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.UsagesRemovedRequest getPayload() {
        return payload;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsagesRemoved interfacesAlexaDatastorePackagemanagerUsagesRemoved = (UsagesRemoved) o;
        return Objects.equals(this.payload, interfacesAlexaDatastorePackagemanagerUsagesRemoved.payload) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsagesRemoved {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
        private com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.UsagesRemovedRequest payload;

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


        @JsonProperty("payload")

        public Builder withPayload(com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.UsagesRemovedRequest payload) {
            this.payload = payload;
            return this;
        }


        public UsagesRemoved build() {
            return new UsagesRemoved(this);
        }
    }
}

