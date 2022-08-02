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


package com.amazon.ask.smapi.model.v1.smartHomeEvaluation;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * GetSHCapabilityEvaluationResultsResponse
 */

@JsonDeserialize(builder = GetSHCapabilityEvaluationResultsResponse.Builder.class)
public final class GetSHCapabilityEvaluationResultsResponse {

    @JsonProperty("paginationContext")
    private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.PaginationContext paginationContext = null;

    @JsonProperty("testCaseResults")
    private List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.TestCaseResult> testCaseResults = new ArrayList<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.TestCaseResult>();

    private GetSHCapabilityEvaluationResultsResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private GetSHCapabilityEvaluationResultsResponse(Builder builder) {
        if (builder.paginationContext != null) {
            this.paginationContext = builder.paginationContext;
        }
        if (builder.testCaseResults != null) {
            this.testCaseResults = builder.testCaseResults;
        }
    }

    /**
     * Get paginationContext
     * @return paginationContext
    **/
    @JsonProperty("paginationContext")
    public com.amazon.ask.smapi.model.v1.smartHomeEvaluation.PaginationContext getPaginationContext() {
        return paginationContext;
    }


    /**
     * Get testCaseResults
     * @return testCaseResults
    **/
    @JsonProperty("testCaseResults")
    public List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.TestCaseResult> getTestCaseResults() {
        return testCaseResults;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetSHCapabilityEvaluationResultsResponse v1SmartHomeEvaluationGetSHCapabilityEvaluationResultsResponse = (GetSHCapabilityEvaluationResultsResponse) o;
        return Objects.equals(this.paginationContext, v1SmartHomeEvaluationGetSHCapabilityEvaluationResultsResponse.paginationContext) &&
            Objects.equals(this.testCaseResults, v1SmartHomeEvaluationGetSHCapabilityEvaluationResultsResponse.testCaseResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paginationContext, testCaseResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSHCapabilityEvaluationResultsResponse {\n");
        
        sb.append("    paginationContext: ").append(toIndentedString(paginationContext)).append("\n");
        sb.append("    testCaseResults: ").append(toIndentedString(testCaseResults)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.PaginationContext paginationContext;
        private List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.TestCaseResult> testCaseResults;

        private Builder() {}

        @JsonProperty("paginationContext")

        public Builder withPaginationContext(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.PaginationContext paginationContext) {
            this.paginationContext = paginationContext;
            return this;
        }


        @JsonProperty("testCaseResults")

        public Builder withTestCaseResults(List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.TestCaseResult> testCaseResults) {
            this.testCaseResults = testCaseResults;
            return this;
        }

        public Builder addTestCaseResultsItem(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.TestCaseResult testCaseResultsItem) {
            if (this.testCaseResults == null) {
                this.testCaseResults = new ArrayList<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.TestCaseResult>();
            }
            this.testCaseResults.add(testCaseResultsItem);
            return this;
        }

        public GetSHCapabilityEvaluationResultsResponse build() {
            return new GetSHCapabilityEvaluationResultsResponse(this);
        }
    }
}

