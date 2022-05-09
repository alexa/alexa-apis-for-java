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


package com.amazon.ask.smapi.model.v1.auditLogs;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuditLogsRequest
 */

@JsonDeserialize(builder = AuditLogsRequest.Builder.class)
public final class AuditLogsRequest {

    @JsonProperty("vendorId")
    private String vendorId = null;

    @JsonProperty("requestFilters")
    private com.amazon.ask.smapi.model.v1.auditLogs.RequestFilters requestFilters = null;

    @JsonProperty("sortDirection")
    private String sortDirection = null;

    @JsonProperty("sortField")
    private String sortField = null;

    @JsonProperty("paginationContext")
    private com.amazon.ask.smapi.model.v1.auditLogs.RequestPaginationContext paginationContext = null;

    public static Builder builder() {
        return new Builder();
    }

    private AuditLogsRequest(Builder builder) {
        if (builder.vendorId != null) {
            this.vendorId = builder.vendorId;
        }
        if (builder.requestFilters != null) {
            this.requestFilters = builder.requestFilters;
        }
        if (builder.sortDirection != null) {
            this.sortDirection = builder.sortDirection;
        }
        if (builder.sortField != null) {
            this.sortField = builder.sortField;
        }
        if (builder.paginationContext != null) {
            this.paginationContext = builder.paginationContext;
        }
    }

    /**
     * Vendor Id. See developer.amazon.com/mycid.html.
     * @return vendorId
    **/
    @JsonProperty("vendorId")
    public String getVendorId() {
        return vendorId;
    }


    /**
     * Get requestFilters
     * @return requestFilters
    **/
    @JsonProperty("requestFilters")
    public com.amazon.ask.smapi.model.v1.auditLogs.RequestFilters getRequestFilters() {
        return requestFilters;
    }


    /**
     * Get sortDirection
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getSortDirectionAsString().
     *
     * @return sortDirection
    **/
    
    public com.amazon.ask.smapi.model.v1.auditLogs.SortDirection getSortDirection() {
        return com.amazon.ask.smapi.model.v1.auditLogs.SortDirection.fromValue(sortDirection);
    }

    /**
     * Get the underlying String value for sortDirection.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return sortDirection as a String value
    **/
    @JsonProperty("sortDirection")
    public String getSortDirectionAsString() {
      return sortDirection;
    }

    /**
     * Get sortField
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getSortFieldAsString().
     *
     * @return sortField
    **/
    
    public com.amazon.ask.smapi.model.v1.auditLogs.SortField getSortField() {
        return com.amazon.ask.smapi.model.v1.auditLogs.SortField.fromValue(sortField);
    }

    /**
     * Get the underlying String value for sortField.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return sortField as a String value
    **/
    @JsonProperty("sortField")
    public String getSortFieldAsString() {
      return sortField;
    }

    /**
     * Get paginationContext
     * @return paginationContext
    **/
    @JsonProperty("paginationContext")
    public com.amazon.ask.smapi.model.v1.auditLogs.RequestPaginationContext getPaginationContext() {
        return paginationContext;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuditLogsRequest v1AuditLogsAuditLogsRequest = (AuditLogsRequest) o;
        return Objects.equals(this.vendorId, v1AuditLogsAuditLogsRequest.vendorId) &&
            Objects.equals(this.requestFilters, v1AuditLogsAuditLogsRequest.requestFilters) &&
            Objects.equals(this.sortDirection, v1AuditLogsAuditLogsRequest.sortDirection) &&
            Objects.equals(this.sortField, v1AuditLogsAuditLogsRequest.sortField) &&
            Objects.equals(this.paginationContext, v1AuditLogsAuditLogsRequest.paginationContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorId, requestFilters, sortDirection, sortField, paginationContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogsRequest {\n");
        
        sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
        sb.append("    requestFilters: ").append(toIndentedString(requestFilters)).append("\n");
        sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    paginationContext: ").append(toIndentedString(paginationContext)).append("\n");
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
        private String vendorId;
        private com.amazon.ask.smapi.model.v1.auditLogs.RequestFilters requestFilters;
        private String sortDirection;
        private String sortField;
        private com.amazon.ask.smapi.model.v1.auditLogs.RequestPaginationContext paginationContext;

        private Builder() {}

        @JsonProperty("vendorId")

        public Builder withVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }


        @JsonProperty("requestFilters")

        public Builder withRequestFilters(com.amazon.ask.smapi.model.v1.auditLogs.RequestFilters requestFilters) {
            this.requestFilters = requestFilters;
            return this;
        }


        @JsonProperty("sortDirection")

        public Builder withSortDirection(String sortDirection) {
          this.sortDirection = sortDirection;
          return this;
        }

        public Builder withSortDirection(com.amazon.ask.smapi.model.v1.auditLogs.SortDirection sortDirection) {
            this.sortDirection = sortDirection != null ? sortDirection.toString() : null;
            return this;
        }


        @JsonProperty("sortField")

        public Builder withSortField(String sortField) {
          this.sortField = sortField;
          return this;
        }

        public Builder withSortField(com.amazon.ask.smapi.model.v1.auditLogs.SortField sortField) {
            this.sortField = sortField != null ? sortField.toString() : null;
            return this;
        }


        @JsonProperty("paginationContext")

        public Builder withPaginationContext(com.amazon.ask.smapi.model.v1.auditLogs.RequestPaginationContext paginationContext) {
            this.paginationContext = paginationContext;
            return this;
        }


        public AuditLogsRequest build() {
            return new AuditLogsRequest(this);
        }
    }
}

