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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * The response of list job definitions.
 */

@JsonDeserialize(builder = ListJobDefinitionsResponse.Builder.class)
public final class ListJobDefinitionsResponse {

    @JsonProperty("paginationContext")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobAPIPaginationContext paginationContext = null;

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.Links links = null;

    @JsonProperty("jobs")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobDefinitionMetadata> jobs = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobDefinitionMetadata>();

    public static Builder builder() {
        return new Builder();
    }

    private ListJobDefinitionsResponse(Builder builder) {
        if (builder.paginationContext != null) {
            this.paginationContext = builder.paginationContext;
        }
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.jobs != null) {
            this.jobs = builder.jobs;
        }
    }

    /**
     * Get paginationContext
     * @return paginationContext
    **/
    @JsonProperty("paginationContext")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobAPIPaginationContext getPaginationContext() {
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
     * Get jobs
     * @return jobs
    **/
    @JsonProperty("jobs")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobDefinitionMetadata> getJobs() {
        return jobs;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListJobDefinitionsResponse v1SkillInteractionModelJobsListJobDefinitionsResponse = (ListJobDefinitionsResponse) o;
        return Objects.equals(this.paginationContext, v1SkillInteractionModelJobsListJobDefinitionsResponse.paginationContext) &&
            Objects.equals(this.links, v1SkillInteractionModelJobsListJobDefinitionsResponse.links) &&
            Objects.equals(this.jobs, v1SkillInteractionModelJobsListJobDefinitionsResponse.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paginationContext, links, jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobDefinitionsResponse {\n");
        
        sb.append("    paginationContext: ").append(toIndentedString(paginationContext)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobAPIPaginationContext paginationContext;
        private com.amazon.ask.smapi.model.v1.Links links;
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobDefinitionMetadata> jobs;

        private Builder() {}

        @JsonProperty("paginationContext")

        public Builder withPaginationContext(com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobAPIPaginationContext paginationContext) {
            this.paginationContext = paginationContext;
            return this;
        }


        @JsonProperty("_links")

        public Builder withLinks(com.amazon.ask.smapi.model.v1.Links links) {
            this.links = links;
            return this;
        }


        @JsonProperty("jobs")

        public Builder withJobs(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobDefinitionMetadata> jobs) {
            this.jobs = jobs;
            return this;
        }

        public Builder addJobsItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobDefinitionMetadata jobsItem) {
            if (this.jobs == null) {
                this.jobs = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobDefinitionMetadata>();
            }
            this.jobs.add(jobsItem);
            return this;
        }

        public ListJobDefinitionsResponse build() {
            return new ListJobDefinitionsResponse(this);
        }
    }
}

