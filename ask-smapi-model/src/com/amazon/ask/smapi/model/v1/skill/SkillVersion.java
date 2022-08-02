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
 * Information about the skill version
 */

@JsonDeserialize(builder = SkillVersion.Builder.class)
public final class SkillVersion {

    @JsonProperty("version")
    private String version = null;

    @JsonProperty("message")
    private String message = null;

    @JsonProperty("creationTime")
    private OffsetDateTime creationTime = null;

    @JsonProperty("submissions")
    private List<com.amazon.ask.smapi.model.v1.skill.VersionSubmission> submissions = new ArrayList<com.amazon.ask.smapi.model.v1.skill.VersionSubmission>();

    private SkillVersion() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SkillVersion(Builder builder) {
        if (builder.version != null) {
            this.version = builder.version;
        }
        if (builder.message != null) {
            this.message = builder.message;
        }
        if (builder.creationTime != null) {
            this.creationTime = builder.creationTime;
        }
        if (builder.submissions != null) {
            this.submissions = builder.submissions;
        }
    }

    /**
     * Get version
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }


    /**
     * Description of the version (limited to 300 characters). 
     * @return message
    **/
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }


    /**
     * Get creationTime
     * @return creationTime
    **/
    @JsonProperty("creationTime")
    public OffsetDateTime getCreationTime() {
        return creationTime;
    }


    /**
     * List of submissions for the skill version 
     * @return submissions
    **/
    @JsonProperty("submissions")
    public List<com.amazon.ask.smapi.model.v1.skill.VersionSubmission> getSubmissions() {
        return submissions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillVersion v1SkillSkillVersion = (SkillVersion) o;
        return Objects.equals(this.version, v1SkillSkillVersion.version) &&
            Objects.equals(this.message, v1SkillSkillVersion.message) &&
            Objects.equals(this.creationTime, v1SkillSkillVersion.creationTime) &&
            Objects.equals(this.submissions, v1SkillSkillVersion.submissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, message, creationTime, submissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillVersion {\n");
        
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    submissions: ").append(toIndentedString(submissions)).append("\n");
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
        private String version;
        private String message;
        private OffsetDateTime creationTime;
        private List<com.amazon.ask.smapi.model.v1.skill.VersionSubmission> submissions;

        private Builder() {}

        @JsonProperty("version")

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        @JsonProperty("message")

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }


        @JsonProperty("creationTime")

        public Builder withCreationTime(OffsetDateTime creationTime) {
            this.creationTime = creationTime;
            return this;
        }


        @JsonProperty("submissions")

        public Builder withSubmissions(List<com.amazon.ask.smapi.model.v1.skill.VersionSubmission> submissions) {
            this.submissions = submissions;
            return this;
        }

        public Builder addSubmissionsItem(com.amazon.ask.smapi.model.v1.skill.VersionSubmission submissionsItem) {
            if (this.submissions == null) {
                this.submissions = new ArrayList<com.amazon.ask.smapi.model.v1.skill.VersionSubmission>();
            }
            this.submissions.add(submissionsItem);
            return this;
        }

        public SkillVersion build() {
            return new SkillVersion(this);
        }
    }
}

