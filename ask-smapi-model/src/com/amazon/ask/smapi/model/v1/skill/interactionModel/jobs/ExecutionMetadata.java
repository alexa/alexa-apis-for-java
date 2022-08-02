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
 * ExecutionMetadata for executions.
 */

@JsonDeserialize(builder = ExecutionMetadata.Builder.class)
public final class ExecutionMetadata {

    @JsonProperty("jobId")
    private String jobId = null;

    @JsonProperty("errorCode")
    private String errorCode = null;

    @JsonProperty("status")
    private String status = null;

    private ExecutionMetadata() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ExecutionMetadata(Builder builder) {
        if (builder.jobId != null) {
            this.jobId = builder.jobId;
        }
        if (builder.errorCode != null) {
            this.errorCode = builder.errorCode;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
    }

    /**
     * Identifier of the job.
     * @return jobId
    **/
    @JsonProperty("jobId")
    public String getJobId() {
        return jobId;
    }


    /**
     * ErrorCode to explain what went wrong in case of FAILUREs.
     * @return errorCode
    **/
    @JsonProperty("errorCode")
    public String getErrorCode() {
        return errorCode;
    }


    /**
     * Current status of the job execution.
     * @return status
    **/
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecutionMetadata v1SkillInteractionModelJobsExecutionMetadata = (ExecutionMetadata) o;
        return Objects.equals(this.jobId, v1SkillInteractionModelJobsExecutionMetadata.jobId) &&
            Objects.equals(this.errorCode, v1SkillInteractionModelJobsExecutionMetadata.errorCode) &&
            Objects.equals(this.status, v1SkillInteractionModelJobsExecutionMetadata.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, errorCode, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionMetadata {\n");
        
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
        private String errorCode;
        private String status;

        private Builder() {}

        @JsonProperty("jobId")

        public Builder withJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }


        @JsonProperty("errorCode")

        public Builder withErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }


        @JsonProperty("status")

        public Builder withStatus(String status) {
            this.status = status;
            return this;
        }


        public ExecutionMetadata build() {
            return new ExecutionMetadata(this);
        }
    }
}

