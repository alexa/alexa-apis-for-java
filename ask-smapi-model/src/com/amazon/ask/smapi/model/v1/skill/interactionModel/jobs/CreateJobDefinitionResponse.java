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
 * The response of create job definition.
 */

@JsonDeserialize(builder = CreateJobDefinitionResponse.Builder.class)
public final class CreateJobDefinitionResponse {

    @JsonProperty("jobId")
    private String jobId = null;

    public static Builder builder() {
        return new Builder();
    }

    private CreateJobDefinitionResponse(Builder builder) {
        if (builder.jobId != null) {
            this.jobId = builder.jobId;
        }
    }

    /**
     * Idenitifier of the job definition.
     * @return jobId
    **/
    @JsonProperty("jobId")
    public String getJobId() {
        return jobId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateJobDefinitionResponse v1SkillInteractionModelJobsCreateJobDefinitionResponse = (CreateJobDefinitionResponse) o;
        return Objects.equals(this.jobId, v1SkillInteractionModelJobsCreateJobDefinitionResponse.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateJobDefinitionResponse {\n");
        
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
        private String jobId;

        private Builder() {}

        @JsonProperty("jobId")

        public Builder withJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }


        public CreateJobDefinitionResponse build() {
            return new CreateJobDefinitionResponse(this);
        }
    }
}

