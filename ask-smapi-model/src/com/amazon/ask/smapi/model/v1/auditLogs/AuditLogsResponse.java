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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Response to the Query Audit Logs API. It contains the collection of audit logs for the vendor, nextToken and other metadata related to the search query.
 */

@JsonDeserialize(builder = AuditLogsResponse.Builder.class)
public final class AuditLogsResponse {

    @JsonProperty("paginationContext")
    private com.amazon.ask.smapi.model.v1.auditLogs.ResponsePaginationContext paginationContext = null;

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.Links links = null;

    @JsonProperty("auditLogs")
    private List<com.amazon.ask.smapi.model.v1.auditLogs.AuditLog> auditLogs = new ArrayList<com.amazon.ask.smapi.model.v1.auditLogs.AuditLog>();

    private AuditLogsResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private AuditLogsResponse(Builder builder) {
        if (builder.paginationContext != null) {
            this.paginationContext = builder.paginationContext;
        }
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.auditLogs != null) {
            this.auditLogs = builder.auditLogs;
        }
    }

    /**
     * Get paginationContext
     * @return paginationContext
    **/
    @JsonProperty("paginationContext")
    public com.amazon.ask.smapi.model.v1.auditLogs.ResponsePaginationContext getPaginationContext() {
        return paginationContext;
    }


    /**
     * Get links
     * @return links
    **/
    @JsonProperty("_links")
    public com.amazon.ask.smapi.model.v1.Links getLinks() {
        return links;
    }


    /**
     * List of audit logs for the vendor.
     * @return auditLogs
    **/
    @JsonProperty("auditLogs")
    public List<com.amazon.ask.smapi.model.v1.auditLogs.AuditLog> getAuditLogs() {
        return auditLogs;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuditLogsResponse v1AuditLogsAuditLogsResponse = (AuditLogsResponse) o;
        return Objects.equals(this.paginationContext, v1AuditLogsAuditLogsResponse.paginationContext) &&
            Objects.equals(this.links, v1AuditLogsAuditLogsResponse.links) &&
            Objects.equals(this.auditLogs, v1AuditLogsAuditLogsResponse.auditLogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paginationContext, links, auditLogs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogsResponse {\n");
        
        sb.append("    paginationContext: ").append(toIndentedString(paginationContext)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    auditLogs: ").append(toIndentedString(auditLogs)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.auditLogs.ResponsePaginationContext paginationContext;
        private com.amazon.ask.smapi.model.v1.Links links;
        private List<com.amazon.ask.smapi.model.v1.auditLogs.AuditLog> auditLogs;

        private Builder() {}

        @JsonProperty("paginationContext")

        public Builder withPaginationContext(com.amazon.ask.smapi.model.v1.auditLogs.ResponsePaginationContext paginationContext) {
            this.paginationContext = paginationContext;
            return this;
        }


        @JsonProperty("_links")

        public Builder withLinks(com.amazon.ask.smapi.model.v1.Links links) {
            this.links = links;
            return this;
        }


        @JsonProperty("auditLogs")

        public Builder withAuditLogs(List<com.amazon.ask.smapi.model.v1.auditLogs.AuditLog> auditLogs) {
            this.auditLogs = auditLogs;
            return this;
        }

        public Builder addAuditLogsItem(com.amazon.ask.smapi.model.v1.auditLogs.AuditLog auditLogsItem) {
            if (this.auditLogs == null) {
                this.auditLogs = new ArrayList<com.amazon.ask.smapi.model.v1.auditLogs.AuditLog>();
            }
            this.auditLogs.add(auditLogsItem);
            return this;
        }

        public AuditLogsResponse build() {
            return new AuditLogsResponse(this);
        }
    }
}

