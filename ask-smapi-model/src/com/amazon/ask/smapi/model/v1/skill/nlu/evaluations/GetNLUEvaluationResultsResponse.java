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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * GetNLUEvaluationResultsResponse
 */

@JsonDeserialize(builder = GetNLUEvaluationResultsResponse.Builder.class)
public final class GetNLUEvaluationResultsResponse {

    @JsonProperty("paginationContext")
    private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.PagedResultsResponsePaginationContext paginationContext = null;

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Links links = null;

    @JsonProperty("totalFailed")
    private BigDecimal totalFailed = null;

    @JsonProperty("testCases")
    private List<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.TestCase> testCases = new ArrayList<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.TestCase>();

    private GetNLUEvaluationResultsResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private GetNLUEvaluationResultsResponse(Builder builder) {
        if (builder.paginationContext != null) {
            this.paginationContext = builder.paginationContext;
        }
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.totalFailed != null) {
            this.totalFailed = builder.totalFailed;
        }
        if (builder.testCases != null) {
            this.testCases = builder.testCases;
        }
    }

    /**
     * Get paginationContext
     * @return paginationContext
    **/
    @JsonProperty("paginationContext")
    public com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.PagedResultsResponsePaginationContext getPaginationContext() {
        return paginationContext;
    }


    /**
     * Get links
     * @return links
    **/
    @JsonProperty("_links")
    public com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Links getLinks() {
        return links;
    }


    /**
     * count of tests failed. A test fails when the expected intent and expected slots are not identical. 
     * @return totalFailed
    **/
    @JsonProperty("totalFailed")
    public BigDecimal getTotalFailed() {
        return totalFailed;
    }


    /**
     * Get testCases
     * @return testCases
    **/
    @JsonProperty("testCases")
    public List<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.TestCase> getTestCases() {
        return testCases;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetNLUEvaluationResultsResponse v1SkillNluEvaluationsGetNLUEvaluationResultsResponse = (GetNLUEvaluationResultsResponse) o;
        return Objects.equals(this.paginationContext, v1SkillNluEvaluationsGetNLUEvaluationResultsResponse.paginationContext) &&
            Objects.equals(this.links, v1SkillNluEvaluationsGetNLUEvaluationResultsResponse.links) &&
            Objects.equals(this.totalFailed, v1SkillNluEvaluationsGetNLUEvaluationResultsResponse.totalFailed) &&
            Objects.equals(this.testCases, v1SkillNluEvaluationsGetNLUEvaluationResultsResponse.testCases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paginationContext, links, totalFailed, testCases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetNLUEvaluationResultsResponse {\n");
        
        sb.append("    paginationContext: ").append(toIndentedString(paginationContext)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    totalFailed: ").append(toIndentedString(totalFailed)).append("\n");
        sb.append("    testCases: ").append(toIndentedString(testCases)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.PagedResultsResponsePaginationContext paginationContext;
        private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Links links;
        private BigDecimal totalFailed;
        private List<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.TestCase> testCases;

        private Builder() {}

        @JsonProperty("paginationContext")

        public Builder withPaginationContext(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.PagedResultsResponsePaginationContext paginationContext) {
            this.paginationContext = paginationContext;
            return this;
        }


        @JsonProperty("_links")

        public Builder withLinks(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Links links) {
            this.links = links;
            return this;
        }


        @JsonProperty("totalFailed")

        public Builder withTotalFailed(BigDecimal totalFailed) {
            this.totalFailed = totalFailed;
            return this;
        }


        @JsonProperty("testCases")

        public Builder withTestCases(List<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.TestCase> testCases) {
            this.testCases = testCases;
            return this;
        }

        public Builder addTestCasesItem(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.TestCase testCasesItem) {
            if (this.testCases == null) {
                this.testCases = new ArrayList<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.TestCase>();
            }
            this.testCases.add(testCasesItem);
            return this;
        }

        public GetNLUEvaluationResultsResponse build() {
            return new GetNLUEvaluationResultsResponse(this);
        }
    }
}

