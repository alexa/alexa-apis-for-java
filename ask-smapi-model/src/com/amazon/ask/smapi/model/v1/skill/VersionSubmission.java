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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Submission for a skill version 
 */

@JsonDeserialize(builder = VersionSubmission.Builder.class)
public final class VersionSubmission {

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("submissionTime")
    private OffsetDateTime submissionTime = null;

    public static Builder builder() {
        return new Builder();
    }

    private VersionSubmission(Builder builder) {
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.submissionTime != null) {
            this.submissionTime = builder.submissionTime;
        }
    }

    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.VersionSubmissionStatus getStatus() {
        return com.amazon.ask.smapi.model.v1.skill.VersionSubmissionStatus.fromValue(status);
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
     * Get submissionTime
     * @return submissionTime
    **/
    @JsonProperty("submissionTime")
    public OffsetDateTime getSubmissionTime() {
        return submissionTime;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VersionSubmission v1SkillVersionSubmission = (VersionSubmission) o;
        return Objects.equals(this.status, v1SkillVersionSubmission.status) &&
            Objects.equals(this.submissionTime, v1SkillVersionSubmission.submissionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, submissionTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionSubmission {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    submissionTime: ").append(toIndentedString(submissionTime)).append("\n");
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
        private String status;
        private OffsetDateTime submissionTime;

        private Builder() {}

        @JsonProperty("status")
        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.VersionSubmissionStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("submissionTime")

        public Builder withSubmissionTime(OffsetDateTime submissionTime) {
            this.submissionTime = submissionTime;
            return this;
        }


        public VersionSubmission build() {
            return new VersionSubmission(this);
        }
    }
}

