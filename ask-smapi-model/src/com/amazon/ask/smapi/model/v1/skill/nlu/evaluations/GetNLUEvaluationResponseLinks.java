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
 * GetNLUEvaluationResponseLinks
 */

@JsonDeserialize(builder = GetNLUEvaluationResponseLinks.Builder.class)
public final class GetNLUEvaluationResponseLinks {

    @JsonProperty("results")
    private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Results results = null;

    private GetNLUEvaluationResponseLinks() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private GetNLUEvaluationResponseLinks(Builder builder) {
        if (builder.results != null) {
            this.results = builder.results;
        }
    }

    /**
     * Get results
     * @return results
    **/
    @JsonProperty("results")
    public com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Results getResults() {
        return results;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetNLUEvaluationResponseLinks v1SkillNluEvaluationsGetNLUEvaluationResponseLinks = (GetNLUEvaluationResponseLinks) o;
        return Objects.equals(this.results, v1SkillNluEvaluationsGetNLUEvaluationResponseLinks.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetNLUEvaluationResponseLinks {\n");
        
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Results results;

        private Builder() {}

        @JsonProperty("results")

        public Builder withResults(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Results results) {
            this.results = results;
            return this;
        }


        public GetNLUEvaluationResponseLinks build() {
            return new GetNLUEvaluationResponseLinks(this);
        }
    }
}

