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
 * CertificationResponse
 */

@JsonDeserialize(builder = CertificationResponse.Builder.class)
public final class CertificationResponse {

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("status")
    private com.amazon.ask.smapi.model.v1.skill.certification.CertificationStatus status = null;

    @JsonProperty("skillSubmissionTimestamp")
    private OffsetDateTime skillSubmissionTimestamp = null;

    @JsonProperty("reviewTrackingInfo")
    private com.amazon.ask.smapi.model.v1.skill.certification.ReviewTrackingInfo reviewTrackingInfo = null;

    @JsonProperty("result")
    private com.amazon.ask.smapi.model.v1.skill.certification.CertificationResult result = null;

    public static Builder builder() {
        return new Builder();
    }

    private CertificationResponse(Builder builder) {
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
        if (builder.result != null) {
            this.result = builder.result;
        }
    }

    /**
     * Certification Id for the skill
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
    public com.amazon.ask.smapi.model.v1.skill.certification.ReviewTrackingInfo getReviewTrackingInfo() {
        return reviewTrackingInfo;
    }

    /**
     * Get result
     * @return result
    **/
    @JsonProperty("result")
    public com.amazon.ask.smapi.model.v1.skill.certification.CertificationResult getResult() {
        return result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CertificationResponse v1SkillCertificationCertificationResponse = (CertificationResponse) o;
        return Objects.equals(this.id, v1SkillCertificationCertificationResponse.id) &&
            Objects.equals(this.status, v1SkillCertificationCertificationResponse.status) &&
            Objects.equals(this.skillSubmissionTimestamp, v1SkillCertificationCertificationResponse.skillSubmissionTimestamp) &&
            Objects.equals(this.reviewTrackingInfo, v1SkillCertificationCertificationResponse.reviewTrackingInfo) &&
            Objects.equals(this.result, v1SkillCertificationCertificationResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, skillSubmissionTimestamp, reviewTrackingInfo, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificationResponse {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    skillSubmissionTimestamp: ").append(toIndentedString(skillSubmissionTimestamp)).append("\n");
        sb.append("    reviewTrackingInfo: ").append(toIndentedString(reviewTrackingInfo)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.certification.ReviewTrackingInfo reviewTrackingInfo;
        private com.amazon.ask.smapi.model.v1.skill.certification.CertificationResult result;

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
        public Builder withReviewTrackingInfo(com.amazon.ask.smapi.model.v1.skill.certification.ReviewTrackingInfo reviewTrackingInfo) {
            this.reviewTrackingInfo = reviewTrackingInfo;
            return this;
        }


        @JsonProperty("result")
        public Builder withResult(com.amazon.ask.smapi.model.v1.skill.certification.CertificationResult result) {
            this.result = result;
            return this;
        }


        public CertificationResponse build() {
            return new CertificationResponse(this);
        }
    }
}

