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


package com.amazon.ask.smapi.model.v1.skill;

import java.util.Objects;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Rollback request for a skill
 */

@JsonDeserialize(builder = RollbackRequestStatus.Builder.class)
public final class RollbackRequestStatus {

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("targetVersion")
    private String targetVersion = null;

    @JsonProperty("submissionTime")
    private OffsetDateTime submissionTime = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("errors")
    private List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> errors = new ArrayList<com.amazon.ask.smapi.model.v1.skill.StandardizedError>();

    private RollbackRequestStatus() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private RollbackRequestStatus(Builder builder) {
        if (builder.id != null) {
            this.id = builder.id;
        }
        if (builder.targetVersion != null) {
            this.targetVersion = builder.targetVersion;
        }
        if (builder.submissionTime != null) {
            this.submissionTime = builder.submissionTime;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.errors != null) {
            this.errors = builder.errors;
        }
    }

    /**
     * rollback request id
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }


    /**
     * The target skill version to rollback to.
     * @return targetVersion
    **/
    @JsonProperty("targetVersion")
    public String getTargetVersion() {
        return targetVersion;
    }


    /**
     * Get submissionTime
     * @return submissionTime
    **/
    @JsonProperty("submissionTime")
    public OffsetDateTime getSubmissionTime() {
        return submissionTime;
    }


    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.RollbackRequestStatusTypes getStatus() {
        return com.amazon.ask.smapi.model.v1.skill.RollbackRequestStatusTypes.fromValue(status);
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

    /**
     * Get errors
     * @return errors
    **/
    @JsonProperty("errors")
    public List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> getErrors() {
        return errors;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RollbackRequestStatus v1SkillRollbackRequestStatus = (RollbackRequestStatus) o;
        return Objects.equals(this.id, v1SkillRollbackRequestStatus.id) &&
            Objects.equals(this.targetVersion, v1SkillRollbackRequestStatus.targetVersion) &&
            Objects.equals(this.submissionTime, v1SkillRollbackRequestStatus.submissionTime) &&
            Objects.equals(this.status, v1SkillRollbackRequestStatus.status) &&
            Objects.equals(this.errors, v1SkillRollbackRequestStatus.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, targetVersion, submissionTime, status, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RollbackRequestStatus {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    submissionTime: ").append(toIndentedString(submissionTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
        private String targetVersion;
        private OffsetDateTime submissionTime;
        private String status;
        private List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> errors;

        private Builder() {}

        @JsonProperty("id")

        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        @JsonProperty("targetVersion")

        public Builder withTargetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }


        @JsonProperty("submissionTime")

        public Builder withSubmissionTime(OffsetDateTime submissionTime) {
            this.submissionTime = submissionTime;
            return this;
        }


        @JsonProperty("status")

        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.RollbackRequestStatusTypes status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("errors")

        public Builder withErrors(List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> errors) {
            this.errors = errors;
            return this;
        }

        public Builder addErrorsItem(com.amazon.ask.smapi.model.v1.skill.StandardizedError errorsItem) {
            if (this.errors == null) {
                this.errors = new ArrayList<com.amazon.ask.smapi.model.v1.skill.StandardizedError>();
            }
            this.errors.add(errorsItem);
            return this;
        }

        public RollbackRequestStatus build() {
            return new RollbackRequestStatus(this);
        }
    }
}

