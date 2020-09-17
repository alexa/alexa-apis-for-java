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
 * The response of get execution history.
 */

@JsonDeserialize(builder = GetExecutionsResponse.Builder.class)
public final class GetExecutionsResponse {

    @JsonProperty("paginationContext")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobAPIPaginationContext paginationContext = null;

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.Links links = null;

    @JsonProperty("executions")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.Execution> executions = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.Execution>();

    public static Builder builder() {
        return new Builder();
    }

    private GetExecutionsResponse(Builder builder) {
        if (builder.paginationContext != null) {
            this.paginationContext = builder.paginationContext;
        }
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.executions != null) {
            this.executions = builder.executions;
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
     * Get executions
     * @return executions
    **/
    @JsonProperty("executions")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.Execution> getExecutions() {
        return executions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetExecutionsResponse v1SkillInteractionModelJobsGetExecutionsResponse = (GetExecutionsResponse) o;
        return Objects.equals(this.paginationContext, v1SkillInteractionModelJobsGetExecutionsResponse.paginationContext) &&
            Objects.equals(this.links, v1SkillInteractionModelJobsGetExecutionsResponse.links) &&
            Objects.equals(this.executions, v1SkillInteractionModelJobsGetExecutionsResponse.executions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paginationContext, links, executions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetExecutionsResponse {\n");
        
        sb.append("    paginationContext: ").append(toIndentedString(paginationContext)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    executions: ").append(toIndentedString(executions)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.Execution> executions;

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


        @JsonProperty("executions")

        public Builder withExecutions(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.Execution> executions) {
            this.executions = executions;
            return this;
        }

        public Builder addExecutionsItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.Execution executionsItem) {
            if (this.executions == null) {
                this.executions = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.Execution>();
            }
            this.executions.add(executionsItem);
            return this;
        }

        public GetExecutionsResponse build() {
            return new GetExecutionsResponse(this);
        }
    }
}

