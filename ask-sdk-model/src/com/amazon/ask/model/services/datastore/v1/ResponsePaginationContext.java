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


package com.amazon.ask.model.services.datastore.v1;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ResponsePaginationContext
 */

@JsonDeserialize(builder = ResponsePaginationContext.Builder.class)
public final class ResponsePaginationContext {

    @JsonProperty("totalCount")
    private Integer totalCount = null;

    @JsonProperty("previousToken")
    private String previousToken = null;

    @JsonProperty("nextToken")
    private String nextToken = null;

    private ResponsePaginationContext() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ResponsePaginationContext(Builder builder) {
        if (builder.totalCount != null) {
            this.totalCount = builder.totalCount;
        }
        if (builder.previousToken != null) {
            this.previousToken = builder.previousToken;
        }
        if (builder.nextToken != null) {
            this.nextToken = builder.nextToken;
        }
    }

    /**
     * The total number of results at the time of current response.
     * @return totalCount
    **/
    @JsonProperty("totalCount")
    public Integer getTotalCount() {
        return totalCount;
    }


    /**
     * The token of previous page - Not specified for the response of first page.
     * @return previousToken
    **/
    @JsonProperty("previousToken")
    public String getPreviousToken() {
        return previousToken;
    }


    /**
     * The token of next page - Not specified for the response of last page.
     * @return nextToken
    **/
    @JsonProperty("nextToken")
    public String getNextToken() {
        return nextToken;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponsePaginationContext servicesDatastoreV1ResponsePaginationContext = (ResponsePaginationContext) o;
        return Objects.equals(this.totalCount, servicesDatastoreV1ResponsePaginationContext.totalCount) &&
            Objects.equals(this.previousToken, servicesDatastoreV1ResponsePaginationContext.previousToken) &&
            Objects.equals(this.nextToken, servicesDatastoreV1ResponsePaginationContext.nextToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, previousToken, nextToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponsePaginationContext {\n");
        
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    previousToken: ").append(toIndentedString(previousToken)).append("\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
        private Integer totalCount;
        private String previousToken;
        private String nextToken;

        private Builder() {}

        @JsonProperty("totalCount")

        public Builder withTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        @JsonProperty("previousToken")

        public Builder withPreviousToken(String previousToken) {
            this.previousToken = previousToken;
            return this;
        }


        @JsonProperty("nextToken")

        public Builder withNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }


        public ResponsePaginationContext build() {
            return new ResponsePaginationContext(this);
        }
    }
}

