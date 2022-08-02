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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request to create job definitions.
 */

@JsonDeserialize(builder = CreateJobDefinitionRequest.Builder.class)
public final class CreateJobDefinitionRequest {

    @JsonProperty("vendorId")
    private String vendorId = null;

    @JsonProperty("jobDefinition")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobDefinition jobDefinition = null;

    private CreateJobDefinitionRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private CreateJobDefinitionRequest(Builder builder) {
        if (builder.vendorId != null) {
            this.vendorId = builder.vendorId;
        }
        if (builder.jobDefinition != null) {
            this.jobDefinition = builder.jobDefinition;
        }
    }

    /**
     * ID of the vendor owning the skill.
     * @return vendorId
    **/
    @JsonProperty("vendorId")
    public String getVendorId() {
        return vendorId;
    }


    /**
     * Get jobDefinition
     * @return jobDefinition
    **/
    @JsonProperty("jobDefinition")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobDefinition getJobDefinition() {
        return jobDefinition;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateJobDefinitionRequest v1SkillInteractionModelJobsCreateJobDefinitionRequest = (CreateJobDefinitionRequest) o;
        return Objects.equals(this.vendorId, v1SkillInteractionModelJobsCreateJobDefinitionRequest.vendorId) &&
            Objects.equals(this.jobDefinition, v1SkillInteractionModelJobsCreateJobDefinitionRequest.jobDefinition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorId, jobDefinition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateJobDefinitionRequest {\n");
        
        sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
        sb.append("    jobDefinition: ").append(toIndentedString(jobDefinition)).append("\n");
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
        private String vendorId;
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobDefinition jobDefinition;

        private Builder() {}

        @JsonProperty("vendorId")

        public Builder withVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }


        @JsonProperty("jobDefinition")

        public Builder withJobDefinition(com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobDefinition jobDefinition) {
            this.jobDefinition = jobDefinition;
            return this;
        }


        public CreateJobDefinitionRequest build() {
            return new CreateJobDefinitionRequest(this);
        }
    }
}

