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
 * Optional details if the execution is depending on other executions.
 */

@JsonDeserialize(builder = JobErrorDetails.Builder.class)
public final class JobErrorDetails {

    @JsonProperty("executionMetadata")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ExecutionMetadata> executionMetadata = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ExecutionMetadata>();

    private JobErrorDetails() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private JobErrorDetails(Builder builder) {
        if (builder.executionMetadata != null) {
            this.executionMetadata = builder.executionMetadata;
        }
    }

    /**
     * Get executionMetadata
     * @return executionMetadata
    **/
    @JsonProperty("executionMetadata")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ExecutionMetadata> getExecutionMetadata() {
        return executionMetadata;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobErrorDetails v1SkillInteractionModelJobsJobErrorDetails = (JobErrorDetails) o;
        return Objects.equals(this.executionMetadata, v1SkillInteractionModelJobsJobErrorDetails.executionMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionMetadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobErrorDetails {\n");
        
        sb.append("    executionMetadata: ").append(toIndentedString(executionMetadata)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ExecutionMetadata> executionMetadata;

        private Builder() {}

        @JsonProperty("executionMetadata")

        public Builder withExecutionMetadata(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ExecutionMetadata> executionMetadata) {
            this.executionMetadata = executionMetadata;
            return this;
        }

        public Builder addExecutionMetadataItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ExecutionMetadata executionMetadataItem) {
            if (this.executionMetadata == null) {
                this.executionMetadata = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ExecutionMetadata>();
            }
            this.executionMetadata.add(executionMetadataItem);
            return this;
        }

        public JobErrorDetails build() {
            return new JobErrorDetails(this);
        }
    }
}

