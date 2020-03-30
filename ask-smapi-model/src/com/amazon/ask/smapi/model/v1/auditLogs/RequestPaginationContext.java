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
import java.math.BigDecimal;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object includes nextToken and maxResults.
 */

@JsonDeserialize(builder = RequestPaginationContext.Builder.class)
public final class RequestPaginationContext {

    @JsonProperty("nextToken")
    private String nextToken = null;

    @JsonProperty("maxResults")
    private BigDecimal maxResults = null;

    public static Builder builder() {
        return new Builder();
    }

    private RequestPaginationContext(Builder builder) {
        if (builder.nextToken != null) {
            this.nextToken = builder.nextToken;
        }
        if (builder.maxResults != null) {
            this.maxResults = builder.maxResults;
        }
    }

    /**
     * When the response to this API call is truncated, the response includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that this API understands. Token has expiry of 1 hour.
     * @return nextToken
    **/
    @JsonProperty("nextToken")
    public String getNextToken() {
        return nextToken;
    }


    /**
     * Sets the maximum number of results returned in the response body. If you want to retrieve more or less than the default of 50 results, you can add this parameter to your request. maxResults can exceed the upper limit of 250 but we will not return more items than that. The response might contain fewer results than maxResults for purpose of keeping SLA or because there are not enough items, but it will never contain more.
     * minimum: 1
     * maximum: 250
     * @return maxResults
    **/
    @JsonProperty("maxResults")
    public BigDecimal getMaxResults() {
        return maxResults;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RequestPaginationContext v1AuditLogsRequestPaginationContext = (RequestPaginationContext) o;
        return Objects.equals(this.nextToken, v1AuditLogsRequestPaginationContext.nextToken) &&
            Objects.equals(this.maxResults, v1AuditLogsRequestPaginationContext.maxResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextToken, maxResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequestPaginationContext {\n");
        
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
        sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
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
        private String nextToken;
        private BigDecimal maxResults;

        private Builder() {}

        @JsonProperty("nextToken")

        public Builder withNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }


        @JsonProperty("maxResults")

        public Builder withMaxResults(BigDecimal maxResults) {
            this.maxResults = maxResults;
            return this;
        }


        public RequestPaginationContext build() {
            return new RequestPaginationContext(this);
        }
    }
}

