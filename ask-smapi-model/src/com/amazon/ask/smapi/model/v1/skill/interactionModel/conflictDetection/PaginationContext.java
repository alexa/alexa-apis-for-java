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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PaginationContext
 */

@JsonDeserialize(builder = PaginationContext.Builder.class)
public final class PaginationContext {

    @JsonProperty("nextToken")
    private String nextToken = null;

    @JsonProperty("totalCount")
    private Long totalCount = null;

    public static Builder builder() {
        return new Builder();
    }

    private PaginationContext(Builder builder) {
        if (builder.nextToken != null) {
            this.nextToken = builder.nextToken;
        }
        if (builder.totalCount != null) {
            this.totalCount = builder.totalCount;
        }
    }

    /**
     * A token returned if there are more results for the given inputs than `maxResults` from the request. It should also be used in the next request to retrieve more results.
     * @return nextToken
    **/
    @JsonProperty("nextToken")
    public String getNextToken() {
        return nextToken;
    }


    /**
     * Total avaliable results for the given query.
     * @return totalCount
    **/
    @JsonProperty("totalCount")
    public Long getTotalCount() {
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
        PaginationContext v1SkillInteractionModelConflictDetectionPaginationContext = (PaginationContext) o;
        return Objects.equals(this.nextToken, v1SkillInteractionModelConflictDetectionPaginationContext.nextToken) &&
            Objects.equals(this.totalCount, v1SkillInteractionModelConflictDetectionPaginationContext.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextToken, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaginationContext {\n");
        
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
        private Long totalCount;

        private Builder() {}

        @JsonProperty("nextToken")

        public Builder withNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }


        @JsonProperty("totalCount")

        public Builder withTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        public PaginationContext build() {
            return new PaginationContext(this);
        }
    }
}

