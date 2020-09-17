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
 * Metadata of the job definition.
 */

@JsonDeserialize(builder = JobDefinitionMetadata.Builder.class)
public final class JobDefinitionMetadata {

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("status")
    private String status = null;

    public static Builder builder() {
        return new Builder();
    }

    private JobDefinitionMetadata(Builder builder) {
        if (builder.id != null) {
            this.id = builder.id;
        }
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
    }

    /**
     * Job identifier.
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }


    /**
     * Polymorphic type of the job.
     * @return type
    **/
    @JsonProperty("type")
    public String getType() {
        return type;
    }


    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobDefinitionStatus getStatus() {
        return com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobDefinitionStatus.fromValue(status);
    }

    /**
     * Get the underlying String value for status.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return status as a String value
    **/
    @JsonProperty("status")
    public String getStatusAsString() {
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
        JobDefinitionMetadata v1SkillInteractionModelJobsJobDefinitionMetadata = (JobDefinitionMetadata) o;
        return Objects.equals(this.id, v1SkillInteractionModelJobsJobDefinitionMetadata.id) &&
            Objects.equals(this.type, v1SkillInteractionModelJobsJobDefinitionMetadata.type) &&
            Objects.equals(this.status, v1SkillInteractionModelJobsJobDefinitionMetadata.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobDefinitionMetadata {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
        private String id;
        private String type;
        private String status;

        private Builder() {}

        @JsonProperty("id")

        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        @JsonProperty("type")

        public Builder withType(String type) {
            this.type = type;
            return this;
        }


        @JsonProperty("status")
        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobDefinitionStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        public JobDefinitionMetadata build() {
            return new JobDefinitionMetadata(this);
        }
    }
}

