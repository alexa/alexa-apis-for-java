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


package com.amazon.ask.smapi.model.v1.skill.certification;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Summary of the certification resource. This is a leaner view of the certification resource for the collections API.
 */

@JsonDeserialize(builder = CertificationSummary.Builder.class)
public final class CertificationSummary {

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("status")
    private com.amazon.ask.smapi.model.v1.skill.certification.CertificationStatus status = null;

    @JsonProperty("skillSubmissionTimestamp")
    private OffsetDateTime skillSubmissionTimestamp = null;

    @JsonProperty("reviewTrackingInfo")
    private com.amazon.ask.smapi.model.v1.skill.certification.ReviewTrackingInfoSummary reviewTrackingInfo = null;

    public static Builder builder() {
        return new Builder();
    }

    private CertificationSummary(Builder builder) {
        if (builder.id != null) {
            this.id = builder.id;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.skillSubmissionTimestamp != null) {
            this.skillSubmissionTimestamp = builder.skillSubmissionTimestamp;
        }
        if (builder.reviewTrackingInfo != null) {
            this.reviewTrackingInfo = builder.reviewTrackingInfo;
        }
    }

    /**
     * Certification Id for the skill.
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Get status
     * @return status
    **/
    @JsonProperty("status")
    public com.amazon.ask.smapi.model.v1.skill.certification.CertificationStatus getStatus() {
        return status;
    }

    /**
     * Timestamp for when the skill was submitted for certification.
     * @return skillSubmissionTimestamp
    **/
    @JsonProperty("skillSubmissionTimestamp")
    public OffsetDateTime getSkillSubmissionTimestamp() {
        return skillSubmissionTimestamp;
    }

    /**
     * Get reviewTrackingInfo
     * @return reviewTrackingInfo
    **/
    @JsonProperty("reviewTrackingInfo")
    public com.amazon.ask.smapi.model.v1.skill.certification.ReviewTrackingInfoSummary getReviewTrackingInfo() {
        return reviewTrackingInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CertificationSummary v1SkillCertificationCertificationSummary = (CertificationSummary) o;
        return Objects.equals(this.id, v1SkillCertificationCertificationSummary.id) &&
            Objects.equals(this.status, v1SkillCertificationCertificationSummary.status) &&
            Objects.equals(this.skillSubmissionTimestamp, v1SkillCertificationCertificationSummary.skillSubmissionTimestamp) &&
            Objects.equals(this.reviewTrackingInfo, v1SkillCertificationCertificationSummary.reviewTrackingInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, skillSubmissionTimestamp, reviewTrackingInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificationSummary {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    skillSubmissionTimestamp: ").append(toIndentedString(skillSubmissionTimestamp)).append("\n");
        sb.append("    reviewTrackingInfo: ").append(toIndentedString(reviewTrackingInfo)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.certification.CertificationStatus status;
        private OffsetDateTime skillSubmissionTimestamp;
        private com.amazon.ask.smapi.model.v1.skill.certification.ReviewTrackingInfoSummary reviewTrackingInfo;

        private Builder() {}

        @JsonProperty("id")
        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        @JsonProperty("status")
        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.certification.CertificationStatus status) {
            this.status = status;
            return this;
        }


        @JsonProperty("skillSubmissionTimestamp")
        public Builder withSkillSubmissionTimestamp(OffsetDateTime skillSubmissionTimestamp) {
            this.skillSubmissionTimestamp = skillSubmissionTimestamp;
            return this;
        }


        @JsonProperty("reviewTrackingInfo")
        public Builder withReviewTrackingInfo(com.amazon.ask.smapi.model.v1.skill.certification.ReviewTrackingInfoSummary reviewTrackingInfo) {
            this.reviewTrackingInfo = reviewTrackingInfo;
            return this;
        }


        public CertificationSummary build() {
            return new CertificationSummary(this);
        }
    }
}

