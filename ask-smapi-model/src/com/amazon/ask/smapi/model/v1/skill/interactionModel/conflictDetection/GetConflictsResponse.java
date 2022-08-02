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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * GetConflictsResponse
 */

@JsonDeserialize(builder = GetConflictsResponse.Builder.class)
public final class GetConflictsResponse {

    @JsonProperty("paginationContext")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.PaginationContext paginationContext = null;

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.Links links = null;

    @JsonProperty("results")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.GetConflictsResponseResult> results = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.GetConflictsResponseResult>();

    private GetConflictsResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private GetConflictsResponse(Builder builder) {
        if (builder.paginationContext != null) {
            this.paginationContext = builder.paginationContext;
        }
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.results != null) {
            this.results = builder.results;
        }
    }

    /**
     * Get paginationContext
     * @return paginationContext
    **/
    @JsonProperty("paginationContext")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.PaginationContext getPaginationContext() {
        return paginationContext;
    }


    /**
     * Get links
     * @return links
    **/
    @JsonProperty("_links")
    public com.amazon.ask.smapi.model.v1.Links getLinks() {
        return links;
    }


    /**
     * Get results
     * @return results
    **/
    @JsonProperty("results")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.GetConflictsResponseResult> getResults() {
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
        GetConflictsResponse v1SkillInteractionModelConflictDetectionGetConflictsResponse = (GetConflictsResponse) o;
        return Objects.equals(this.paginationContext, v1SkillInteractionModelConflictDetectionGetConflictsResponse.paginationContext) &&
            Objects.equals(this.links, v1SkillInteractionModelConflictDetectionGetConflictsResponse.links) &&
            Objects.equals(this.results, v1SkillInteractionModelConflictDetectionGetConflictsResponse.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paginationContext, links, results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetConflictsResponse {\n");
        
        sb.append("    paginationContext: ").append(toIndentedString(paginationContext)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.PaginationContext paginationContext;
        private com.amazon.ask.smapi.model.v1.Links links;
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.GetConflictsResponseResult> results;

        private Builder() {}

        @JsonProperty("paginationContext")

        public Builder withPaginationContext(com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.PaginationContext paginationContext) {
            this.paginationContext = paginationContext;
            return this;
        }


        @JsonProperty("_links")

        public Builder withLinks(com.amazon.ask.smapi.model.v1.Links links) {
            this.links = links;
            return this;
        }


        @JsonProperty("results")

        public Builder withResults(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.GetConflictsResponseResult> results) {
            this.results = results;
            return this;
        }

        public Builder addResultsItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.GetConflictsResponseResult resultsItem) {
            if (this.results == null) {
                this.results = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.GetConflictsResponseResult>();
            }
            this.results.add(resultsItem);
            return this;
        }

        public GetConflictsResponse build() {
            return new GetConflictsResponse(this);
        }
    }
}

