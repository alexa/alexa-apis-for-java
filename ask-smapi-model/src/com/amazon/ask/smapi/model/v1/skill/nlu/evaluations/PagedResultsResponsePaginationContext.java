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


package com.amazon.ask.smapi.model.v1.skill.nlu.evaluations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PagedResultsResponsePaginationContext
 */

@JsonDeserialize(builder = PagedResultsResponsePaginationContext.Builder.class)
public final class PagedResultsResponsePaginationContext {

    @JsonProperty("nextToken")
    private String nextToken = null;

    @JsonProperty("totalCount")
    private String totalCount = null;

    private PagedResultsResponsePaginationContext() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private PagedResultsResponsePaginationContext(Builder builder) {
        if (builder.nextToken != null) {
            this.nextToken = builder.nextToken;
        }
        if (builder.totalCount != null) {
            this.totalCount = builder.totalCount;
        }
    }

    /**
     * opaque token returned if there are more results for the given inputs than `maxResults` from the request.
     * @return nextToken
    **/
    @JsonProperty("nextToken")
    public String getNextToken() {
        return nextToken;
    }


    /**
     * Total available results for the given query.
     * @return totalCount
    **/
    @JsonProperty("totalCount")
    public String getTotalCount() {
        return totalCount;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PagedResultsResponsePaginationContext v1SkillNluEvaluationsPagedResultsResponsePaginationContext = (PagedResultsResponsePaginationContext) o;
        return Objects.equals(this.nextToken, v1SkillNluEvaluationsPagedResultsResponsePaginationContext.nextToken) &&
            Objects.equals(this.totalCount, v1SkillNluEvaluationsPagedResultsResponsePaginationContext.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextToken, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PagedResultsResponsePaginationContext {\n");
        
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
        private String totalCount;

        private Builder() {}

        @JsonProperty("nextToken")

        public Builder withNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }


        @JsonProperty("totalCount")

        public Builder withTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        public PagedResultsResponsePaginationContext build() {
            return new PagedResultsResponsePaginationContext(this);
        }
    }
}

