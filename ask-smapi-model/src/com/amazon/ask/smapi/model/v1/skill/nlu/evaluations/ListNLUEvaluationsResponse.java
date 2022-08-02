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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * response body for a list evaluation API
 */

@JsonDeserialize(builder = ListNLUEvaluationsResponse.Builder.class)
public final class ListNLUEvaluationsResponse {

    @JsonProperty("paginationContext")
    private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.PaginationContext paginationContext = null;

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Links links = null;

    @JsonProperty("evaluations")
    private List<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Evaluation> evaluations = new ArrayList<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Evaluation>();

    private ListNLUEvaluationsResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ListNLUEvaluationsResponse(Builder builder) {
        if (builder.paginationContext != null) {
            this.paginationContext = builder.paginationContext;
        }
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.evaluations != null) {
            this.evaluations = builder.evaluations;
        }
    }

    /**
     * Get paginationContext
     * @return paginationContext
    **/
    @JsonProperty("paginationContext")
    public com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.PaginationContext getPaginationContext() {
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
     * Get evaluations
     * @return evaluations
    **/
    @JsonProperty("evaluations")
    public List<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Evaluation> getEvaluations() {
        return evaluations;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNLUEvaluationsResponse v1SkillNluEvaluationsListNLUEvaluationsResponse = (ListNLUEvaluationsResponse) o;
        return Objects.equals(this.paginationContext, v1SkillNluEvaluationsListNLUEvaluationsResponse.paginationContext) &&
            Objects.equals(this.links, v1SkillNluEvaluationsListNLUEvaluationsResponse.links) &&
            Objects.equals(this.evaluations, v1SkillNluEvaluationsListNLUEvaluationsResponse.evaluations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paginationContext, links, evaluations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNLUEvaluationsResponse {\n");
        
        sb.append("    paginationContext: ").append(toIndentedString(paginationContext)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    evaluations: ").append(toIndentedString(evaluations)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.PaginationContext paginationContext;
        private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Links links;
        private List<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Evaluation> evaluations;

        private Builder() {}

        @JsonProperty("paginationContext")

        public Builder withPaginationContext(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.PaginationContext paginationContext) {
            this.paginationContext = paginationContext;
            return this;
        }


        @JsonProperty("_links")

        public Builder withLinks(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Links links) {
            this.links = links;
            return this;
        }


        @JsonProperty("evaluations")

        public Builder withEvaluations(List<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Evaluation> evaluations) {
            this.evaluations = evaluations;
            return this;
        }

        public Builder addEvaluationsItem(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Evaluation evaluationsItem) {
            if (this.evaluations == null) {
                this.evaluations = new ArrayList<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Evaluation>();
            }
            this.evaluations.add(evaluationsItem);
            return this;
        }

        public ListNLUEvaluationsResponse build() {
            return new ListNLUEvaluationsResponse(this);
        }
    }
}

