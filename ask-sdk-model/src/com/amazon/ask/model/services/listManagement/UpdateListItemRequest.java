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


package com.amazon.ask.model.services.listManagement;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateListItemRequest
 */

@JsonDeserialize(builder = UpdateListItemRequest.Builder.class)
public final class UpdateListItemRequest {

    @JsonProperty("value")
    private String value = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("version")
    private Long version = null;

    public static Builder builder() {
        return new Builder();
    }

    private UpdateListItemRequest(Builder builder) {
        if (builder.value != null) {
            this.value = builder.value;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.version != null) {
            this.version = builder.version;
        }
    }

    /**
     * New item value
     * @return value
    **/
    @JsonProperty("value")
    public String getValue() {
        return value;
    }


    /**
     * Item Status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.model.services.listManagement.ListItemState getStatus() {
        return com.amazon.ask.model.services.listManagement.ListItemState.fromValue(status);
    }

    /**
     * Get the underlying String value for status.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return status as a String value
    **/
    @JsonProperty("status")
    public String getStatusAsString() {
      return status;
    }

    /**
     * Item version when it was read.
     * @return version
    **/
    @JsonProperty("version")
    public Long getVersion() {
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
        UpdateListItemRequest servicesListManagementUpdateListItemRequest = (UpdateListItemRequest) o;
        return Objects.equals(this.value, servicesListManagementUpdateListItemRequest.value) &&
            Objects.equals(this.status, servicesListManagementUpdateListItemRequest.status) &&
            Objects.equals(this.version, servicesListManagementUpdateListItemRequest.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, status, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateListItemRequest {\n");
        
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
        private String value;
        private String status;
        private Long version;

        private Builder() {}

        @JsonProperty("value")

        public Builder withValue(String value) {
            this.value = value;
            return this;
        }


        @JsonProperty("status")

        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.model.services.listManagement.ListItemState status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("version")

        public Builder withVersion(Long version) {
            this.version = version;
            return this;
        }


        public UpdateListItemRequest build() {
            return new UpdateListItemRequest(this);
        }
    }
}

