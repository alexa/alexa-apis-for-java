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
 * response body for a list evaluation API
 */

@JsonDeserialize(builder = ListAsrEvaluationsResponse.Builder.class)
public final class ListAsrEvaluationsResponse {

    @JsonProperty("evaluations")
    private List<com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationItems> evaluations = new ArrayList<com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationItems>();

    @JsonProperty("paginationContext")
    private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.PaginationContext paginationContext = null;

    private ListAsrEvaluationsResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ListAsrEvaluationsResponse(Builder builder) {
        if (builder.evaluations != null) {
            this.evaluations = builder.evaluations;
        }
        if (builder.paginationContext != null) {
            this.paginationContext = builder.paginationContext;
        }
    }

    /**
     * an array containing all evaluations that have ever run by developers based on the filter criteria defined in the request
     * @return evaluations
    **/
    @JsonProperty("evaluations")
    public List<com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationItems> getEvaluations() {
        return evaluations;
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
        ListAsrEvaluationsResponse v1SkillAsrEvaluationsListAsrEvaluationsResponse = (ListAsrEvaluationsResponse) o;
        return Objects.equals(this.evaluations, v1SkillAsrEvaluationsListAsrEvaluationsResponse.evaluations) &&
            Objects.equals(this.paginationContext, v1SkillAsrEvaluationsListAsrEvaluationsResponse.paginationContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluations, paginationContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAsrEvaluationsResponse {\n");
        
        sb.append("    evaluations: ").append(toIndentedString(evaluations)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationItems> evaluations;
        private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.PaginationContext paginationContext;

        private Builder() {}

        @JsonProperty("evaluations")

        public Builder withEvaluations(List<com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationItems> evaluations) {
            this.evaluations = evaluations;
            return this;
        }

        public Builder addEvaluationsItem(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationItems evaluationsItem) {
            if (this.evaluations == null) {
                this.evaluations = new ArrayList<com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationItems>();
            }
            this.evaluations.add(evaluationsItem);
            return this;
        }

        @JsonProperty("paginationContext")

        public Builder withPaginationContext(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.PaginationContext paginationContext) {
            this.paginationContext = paginationContext;
            return this;
        }


        public ListAsrEvaluationsResponse build() {
            return new ListAsrEvaluationsResponse(this);
        }
    }
}

