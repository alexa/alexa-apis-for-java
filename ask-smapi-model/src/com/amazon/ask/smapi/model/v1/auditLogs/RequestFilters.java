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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Request Filters for filtering audit logs.
 */

@JsonDeserialize(builder = RequestFilters.Builder.class)
public final class RequestFilters {

    @JsonProperty("clients")
    private List<com.amazon.ask.smapi.model.v1.auditLogs.ClientFilter> clients = new ArrayList<com.amazon.ask.smapi.model.v1.auditLogs.ClientFilter>();

    @JsonProperty("operations")
    private List<com.amazon.ask.smapi.model.v1.auditLogs.OperationFilter> operations = new ArrayList<com.amazon.ask.smapi.model.v1.auditLogs.OperationFilter>();

    @JsonProperty("resources")
    private List<com.amazon.ask.smapi.model.v1.auditLogs.ResourceFilter> resources = new ArrayList<com.amazon.ask.smapi.model.v1.auditLogs.ResourceFilter>();

    @JsonProperty("requesters")
    private List<com.amazon.ask.smapi.model.v1.auditLogs.RequesterFilter> requesters = new ArrayList<com.amazon.ask.smapi.model.v1.auditLogs.RequesterFilter>();

    @JsonProperty("startTime")
    private OffsetDateTime startTime = null;

    @JsonProperty("endTime")
    private OffsetDateTime endTime = null;

    @JsonProperty("httpResponseCodes")
    private List<String> httpResponseCodes = new ArrayList<String>();

    private RequestFilters() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private RequestFilters(Builder builder) {
        if (builder.clients != null) {
            this.clients = builder.clients;
        }
        if (builder.operations != null) {
            this.operations = builder.operations;
        }
        if (builder.resources != null) {
            this.resources = builder.resources;
        }
        if (builder.requesters != null) {
            this.requesters = builder.requesters;
        }
        if (builder.startTime != null) {
            this.startTime = builder.startTime;
        }
        if (builder.endTime != null) {
            this.endTime = builder.endTime;
        }
        if (builder.httpResponseCodes != null) {
            this.httpResponseCodes = builder.httpResponseCodes;
        }
    }

    /**
     * List of Client IDs for filtering.
     * @return clients
    **/
    @JsonProperty("clients")
    public List<com.amazon.ask.smapi.model.v1.auditLogs.ClientFilter> getClients() {
        return clients;
    }


    /**
     * Filters for a list of operation names and versions.
     * @return operations
    **/
    @JsonProperty("operations")
    public List<com.amazon.ask.smapi.model.v1.auditLogs.OperationFilter> getOperations() {
        return operations;
    }


    /**
     * Filters for a list of resources and/or their types. See documentation for allowed types.
     * @return resources
    **/
    @JsonProperty("resources")
    public List<com.amazon.ask.smapi.model.v1.auditLogs.ResourceFilter> getResources() {
        return resources;
    }


    /**
     * Get requesters
     * @return requesters
    **/
    @JsonProperty("requesters")
    public List<com.amazon.ask.smapi.model.v1.auditLogs.RequesterFilter> getRequesters() {
        return requesters;
    }


    /**
     * Sets the start time for this search. Any audit logs with timestamps after this time (inclusive) will be included in the response.
     * @return startTime
    **/
    @JsonProperty("startTime")
    public OffsetDateTime getStartTime() {
        return startTime;
    }


    /**
     * Sets the end time for this search. Any audit logs with timestamps before this time (exclusive) will be included in the result.
     * @return endTime
    **/
    @JsonProperty("endTime")
    public OffsetDateTime getEndTime() {
        return endTime;
    }


    /**
     * Filters for HTTP response codes. For example, '200' or '503'
     * @return httpResponseCodes
    **/
    @JsonProperty("httpResponseCodes")
    public List<String> getHttpResponseCodes() {
        return httpResponseCodes;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RequestFilters v1AuditLogsRequestFilters = (RequestFilters) o;
        return Objects.equals(this.clients, v1AuditLogsRequestFilters.clients) &&
            Objects.equals(this.operations, v1AuditLogsRequestFilters.operations) &&
            Objects.equals(this.resources, v1AuditLogsRequestFilters.resources) &&
            Objects.equals(this.requesters, v1AuditLogsRequestFilters.requesters) &&
            Objects.equals(this.startTime, v1AuditLogsRequestFilters.startTime) &&
            Objects.equals(this.endTime, v1AuditLogsRequestFilters.endTime) &&
            Objects.equals(this.httpResponseCodes, v1AuditLogsRequestFilters.httpResponseCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clients, operations, resources, requesters, startTime, endTime, httpResponseCodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequestFilters {\n");
        
        sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
        sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    requesters: ").append(toIndentedString(requesters)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    httpResponseCodes: ").append(toIndentedString(httpResponseCodes)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.auditLogs.ClientFilter> clients;
        private List<com.amazon.ask.smapi.model.v1.auditLogs.OperationFilter> operations;
        private List<com.amazon.ask.smapi.model.v1.auditLogs.ResourceFilter> resources;
        private List<com.amazon.ask.smapi.model.v1.auditLogs.RequesterFilter> requesters;
        private OffsetDateTime startTime;
        private OffsetDateTime endTime;
        private List<String> httpResponseCodes;

        private Builder() {}

        @JsonProperty("clients")

        public Builder withClients(List<com.amazon.ask.smapi.model.v1.auditLogs.ClientFilter> clients) {
            this.clients = clients;
            return this;
        }

        public Builder addClientsItem(com.amazon.ask.smapi.model.v1.auditLogs.ClientFilter clientsItem) {
            if (this.clients == null) {
                this.clients = new ArrayList<com.amazon.ask.smapi.model.v1.auditLogs.ClientFilter>();
            }
            this.clients.add(clientsItem);
            return this;
        }

        @JsonProperty("operations")

        public Builder withOperations(List<com.amazon.ask.smapi.model.v1.auditLogs.OperationFilter> operations) {
            this.operations = operations;
            return this;
        }

        public Builder addOperationsItem(com.amazon.ask.smapi.model.v1.auditLogs.OperationFilter operationsItem) {
            if (this.operations == null) {
                this.operations = new ArrayList<com.amazon.ask.smapi.model.v1.auditLogs.OperationFilter>();
            }
            this.operations.add(operationsItem);
            return this;
        }

        @JsonProperty("resources")

        public Builder withResources(List<com.amazon.ask.smapi.model.v1.auditLogs.ResourceFilter> resources) {
            this.resources = resources;
            return this;
        }

        public Builder addResourcesItem(com.amazon.ask.smapi.model.v1.auditLogs.ResourceFilter resourcesItem) {
            if (this.resources == null) {
                this.resources = new ArrayList<com.amazon.ask.smapi.model.v1.auditLogs.ResourceFilter>();
            }
            this.resources.add(resourcesItem);
            return this;
        }

        @JsonProperty("requesters")

        public Builder withRequesters(List<com.amazon.ask.smapi.model.v1.auditLogs.RequesterFilter> requesters) {
            this.requesters = requesters;
            return this;
        }

        public Builder addRequestersItem(com.amazon.ask.smapi.model.v1.auditLogs.RequesterFilter requestersItem) {
            if (this.requesters == null) {
                this.requesters = new ArrayList<com.amazon.ask.smapi.model.v1.auditLogs.RequesterFilter>();
            }
            this.requesters.add(requestersItem);
            return this;
        }

        @JsonProperty("startTime")

        public Builder withStartTime(OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }


        @JsonProperty("endTime")

        public Builder withEndTime(OffsetDateTime endTime) {
            this.endTime = endTime;
            return this;
        }


        @JsonProperty("httpResponseCodes")

        public Builder withHttpResponseCodes(List<String> httpResponseCodes) {
            this.httpResponseCodes = httpResponseCodes;
            return this;
        }

        public Builder addHttpResponseCodesItem(String httpResponseCodesItem) {
            if (this.httpResponseCodes == null) {
                this.httpResponseCodes = new ArrayList<String>();
            }
            this.httpResponseCodes.add(httpResponseCodesItem);
            return this;
        }

        public RequestFilters build() {
            return new RequestFilters(this);
        }
    }
}

