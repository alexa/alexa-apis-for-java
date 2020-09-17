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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Execution data.
 */

@JsonDeserialize(builder = Execution.Builder.class)
public final class Execution {

    @JsonProperty("executionId")
    private String executionId = null;

    @JsonProperty("timestamp")
    private OffsetDateTime timestamp = null;

    @JsonProperty("errorCode")
    private String errorCode = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("errorDetails")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobErrorDetails errorDetails = null;

    public static Builder builder() {
        return new Builder();
    }

    private Execution(Builder builder) {
        if (builder.executionId != null) {
            this.executionId = builder.executionId;
        }
        if (builder.timestamp != null) {
            this.timestamp = builder.timestamp;
        }
        if (builder.errorCode != null) {
            this.errorCode = builder.errorCode;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.errorDetails != null) {
            this.errorDetails = builder.errorDetails;
        }
    }

    /**
     * Identifier of the execution.
     * @return executionId
    **/
    @JsonProperty("executionId")
    public String getExecutionId() {
        return executionId;
    }


    /**
     * ISO date-time timestamp when the execution starts.
     * @return timestamp
    **/
    @JsonProperty("timestamp")
    public OffsetDateTime getTimestamp() {
        return timestamp;
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


    /**
     * Get errorDetails
     * @return errorDetails
    **/
    @JsonProperty("errorDetails")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobErrorDetails getErrorDetails() {
        return errorDetails;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Execution v1SkillInteractionModelJobsExecution = (Execution) o;
        return Objects.equals(this.executionId, v1SkillInteractionModelJobsExecution.executionId) &&
            Objects.equals(this.timestamp, v1SkillInteractionModelJobsExecution.timestamp) &&
            Objects.equals(this.errorCode, v1SkillInteractionModelJobsExecution.errorCode) &&
            Objects.equals(this.status, v1SkillInteractionModelJobsExecution.status) &&
            Objects.equals(this.errorDetails, v1SkillInteractionModelJobsExecution.errorDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionId, timestamp, errorCode, status, errorDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Execution {\n");
        
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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
        private String executionId;
        private OffsetDateTime timestamp;
        private String errorCode;
        private String status;
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobErrorDetails errorDetails;

        private Builder() {}

        @JsonProperty("executionId")

        public Builder withExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }


        @JsonProperty("timestamp")

        public Builder withTimestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
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


        @JsonProperty("errorDetails")

        public Builder withErrorDetails(com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobErrorDetails errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }


        public Execution build() {
            return new Execution(this);
        }
    }
}

