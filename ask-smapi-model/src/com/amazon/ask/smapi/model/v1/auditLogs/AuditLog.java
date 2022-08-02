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
 * AuditLog
 */

@JsonDeserialize(builder = AuditLog.Builder.class)
public final class AuditLog {

    @JsonProperty("xAmznRequestId")
    private String xAmznRequestId = null;

    @JsonProperty("timestamp")
    private OffsetDateTime timestamp = null;

    @JsonProperty("client")
    private com.amazon.ask.smapi.model.v1.auditLogs.Client client = null;

    @JsonProperty("operation")
    private com.amazon.ask.smapi.model.v1.auditLogs.Operation operation = null;

    @JsonProperty("resources")
    private List<com.amazon.ask.smapi.model.v1.auditLogs.Resource> resources = new ArrayList<com.amazon.ask.smapi.model.v1.auditLogs.Resource>();

    @JsonProperty("requester")
    private com.amazon.ask.smapi.model.v1.auditLogs.Requester requester = null;

    @JsonProperty("httpResponseCode")
    private Integer httpResponseCode = null;

    private AuditLog() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private AuditLog(Builder builder) {
        if (builder.xAmznRequestId != null) {
            this.xAmznRequestId = builder.xAmznRequestId;
        }
        if (builder.timestamp != null) {
            this.timestamp = builder.timestamp;
        }
        if (builder.client != null) {
            this.client = builder.client;
        }
        if (builder.operation != null) {
            this.operation = builder.operation;
        }
        if (builder.resources != null) {
            this.resources = builder.resources;
        }
        if (builder.requester != null) {
            this.requester = builder.requester;
        }
        if (builder.httpResponseCode != null) {
            this.httpResponseCode = builder.httpResponseCode;
        }
    }

    /**
     * UUID that identifies a specific request.
     * @return xAmznRequestId
    **/
    @JsonProperty("xAmznRequestId")
    public String getXAmznRequestId() {
        return xAmznRequestId;
    }


    /**
     * Date-Time when the request was made.
     * @return timestamp
    **/
    @JsonProperty("timestamp")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }


    /**
     * Get client
     * @return client
    **/
    @JsonProperty("client")
    public com.amazon.ask.smapi.model.v1.auditLogs.Client getClient() {
        return client;
    }


    /**
     * Get operation
     * @return operation
    **/
    @JsonProperty("operation")
    public com.amazon.ask.smapi.model.v1.auditLogs.Operation getOperation() {
        return operation;
    }


    /**
     * Contains information about the resources affected in this request.
     * @return resources
    **/
    @JsonProperty("resources")
    public List<com.amazon.ask.smapi.model.v1.auditLogs.Resource> getResources() {
        return resources;
    }


    /**
     * Get requester
     * @return requester
    **/
    @JsonProperty("requester")
    public com.amazon.ask.smapi.model.v1.auditLogs.Requester getRequester() {
        return requester;
    }


    /**
     * HTTP Status Code returned by this request.
     * @return httpResponseCode
    **/
    @JsonProperty("httpResponseCode")
    public Integer getHttpResponseCode() {
        return httpResponseCode;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuditLog v1AuditLogsAuditLog = (AuditLog) o;
        return Objects.equals(this.xAmznRequestId, v1AuditLogsAuditLog.xAmznRequestId) &&
            Objects.equals(this.timestamp, v1AuditLogsAuditLog.timestamp) &&
            Objects.equals(this.client, v1AuditLogsAuditLog.client) &&
            Objects.equals(this.operation, v1AuditLogsAuditLog.operation) &&
            Objects.equals(this.resources, v1AuditLogsAuditLog.resources) &&
            Objects.equals(this.requester, v1AuditLogsAuditLog.requester) &&
            Objects.equals(this.httpResponseCode, v1AuditLogsAuditLog.httpResponseCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xAmznRequestId, timestamp, client, operation, resources, requester, httpResponseCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLog {\n");
        
        sb.append("    xAmznRequestId: ").append(toIndentedString(xAmznRequestId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    requester: ").append(toIndentedString(requester)).append("\n");
        sb.append("    httpResponseCode: ").append(toIndentedString(httpResponseCode)).append("\n");
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
        private String xAmznRequestId;
        private OffsetDateTime timestamp;
        private com.amazon.ask.smapi.model.v1.auditLogs.Client client;
        private com.amazon.ask.smapi.model.v1.auditLogs.Operation operation;
        private List<com.amazon.ask.smapi.model.v1.auditLogs.Resource> resources;
        private com.amazon.ask.smapi.model.v1.auditLogs.Requester requester;
        private Integer httpResponseCode;

        private Builder() {}

        @JsonProperty("xAmznRequestId")

        public Builder withXAmznRequestId(String xAmznRequestId) {
            this.xAmznRequestId = xAmznRequestId;
            return this;
        }


        @JsonProperty("timestamp")

        public Builder withTimestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }


        @JsonProperty("client")

        public Builder withClient(com.amazon.ask.smapi.model.v1.auditLogs.Client client) {
            this.client = client;
            return this;
        }


        @JsonProperty("operation")

        public Builder withOperation(com.amazon.ask.smapi.model.v1.auditLogs.Operation operation) {
            this.operation = operation;
            return this;
        }


        @JsonProperty("resources")

        public Builder withResources(List<com.amazon.ask.smapi.model.v1.auditLogs.Resource> resources) {
            this.resources = resources;
            return this;
        }

        public Builder addResourcesItem(com.amazon.ask.smapi.model.v1.auditLogs.Resource resourcesItem) {
            if (this.resources == null) {
                this.resources = new ArrayList<com.amazon.ask.smapi.model.v1.auditLogs.Resource>();
            }
            this.resources.add(resourcesItem);
            return this;
        }

        @JsonProperty("requester")

        public Builder withRequester(com.amazon.ask.smapi.model.v1.auditLogs.Requester requester) {
            this.requester = requester;
            return this;
        }


        @JsonProperty("httpResponseCode")

        public Builder withHttpResponseCode(Integer httpResponseCode) {
            this.httpResponseCode = httpResponseCode;
            return this;
        }


        public AuditLog build() {
            return new AuditLog(this);
        }
    }
}

