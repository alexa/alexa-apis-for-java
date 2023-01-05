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


package com.amazon.ask.model.interfaces.alexa.datastore;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This event is sent by DSCS to forward ExecutionError from device or to inform about delivery error.
 */

@JsonDeserialize(builder = DataStoreError.Builder.class)
public final class DataStoreError extends com.amazon.ask.model.Request  {

    @JsonProperty("error")
    private com.amazon.ask.model.interfaces.alexa.datastore.CommandsError error = null;

    private DataStoreError() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private DataStoreError(Builder builder) {
        String discriminatorValue = "Alexa.DataStore.Error";

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
        if (builder.error != null) {
            this.error = builder.error;
        }
    }

    /**
     * Get error
     * @return error
    **/
    @JsonProperty("error")
    public com.amazon.ask.model.interfaces.alexa.datastore.CommandsError getError() {
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
        DataStoreError interfacesAlexaDatastoreDataStoreError = (DataStoreError) o;
        return Objects.equals(this.error, interfacesAlexaDatastoreDataStoreError.error) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(error, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataStoreError {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
        private com.amazon.ask.model.interfaces.alexa.datastore.CommandsError error;

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


        @JsonProperty("error")

        public Builder withError(com.amazon.ask.model.interfaces.alexa.datastore.CommandsError error) {
            this.error = error;
            return this;
        }


        public DataStoreError build() {
            return new DataStoreError(this);
        }
    }
}

