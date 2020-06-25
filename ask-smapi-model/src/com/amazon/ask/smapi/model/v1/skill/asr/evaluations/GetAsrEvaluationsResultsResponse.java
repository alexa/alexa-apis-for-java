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


package com.amazon.ask.smapi.model.v1.skill.asr.evaluations;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * response for GetAsrEvaluationsResults
 */

@JsonDeserialize(builder = GetAsrEvaluationsResultsResponse.Builder.class)
public final class GetAsrEvaluationsResultsResponse {

    @JsonProperty("results")
    private List<com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationResult> results = new ArrayList<com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationResult>();

    @JsonProperty("paginationContext")
    private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.PaginationContext paginationContext = null;

    public static Builder builder() {
        return new Builder();
    }

    private GetAsrEvaluationsResultsResponse(Builder builder) {
        if (builder.results != null) {
            this.results = builder.results;
        }
        if (builder.paginationContext != null) {
            this.paginationContext = builder.paginationContext;
        }
    }

    /**
     * array containing all evaluation results.
     * @return results
    **/
    @JsonProperty("results")
    public List<com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationResult> getResults() {
        return results;
    }


    /**
     * Get paginationContext
     * @return paginationContext
    **/
    @JsonProperty("paginationContext")
    public com.amazon.ask.smapi.model.v1.skill.asr.evaluations.PaginationContext getPaginationContext() {
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
        GetAsrEvaluationsResultsResponse v1SkillAsrEvaluationsGetAsrEvaluationsResultsResponse = (GetAsrEvaluationsResultsResponse) o;
        return Objects.equals(this.results, v1SkillAsrEvaluationsGetAsrEvaluationsResultsResponse.results) &&
            Objects.equals(this.paginationContext, v1SkillAsrEvaluationsGetAsrEvaluationsResultsResponse.paginationContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, paginationContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAsrEvaluationsResultsResponse {\n");
        
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationResult> results;
        private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.PaginationContext paginationContext;

        private Builder() {}

        @JsonProperty("results")

        public Builder withResults(List<com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationResult> results) {
            this.results = results;
            return this;
        }

        public Builder addResultsItem(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationResult resultsItem) {
            if (this.results == null) {
                this.results = new ArrayList<com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationResult>();
            }
            this.results.add(resultsItem);
            return this;
        }

        @JsonProperty("paginationContext")

        public Builder withPaginationContext(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.PaginationContext paginationContext) {
            this.paginationContext = paginationContext;
            return this;
        }


        public GetAsrEvaluationsResultsResponse build() {
            return new GetAsrEvaluationsResultsResponse(this);
        }
    }
}

