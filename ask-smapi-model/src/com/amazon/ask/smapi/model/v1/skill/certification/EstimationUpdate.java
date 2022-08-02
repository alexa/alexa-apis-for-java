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
 * Structure for any updates to estimation completion time for certification review for the skill.
 */

@JsonDeserialize(builder = EstimationUpdate.Builder.class)
public final class EstimationUpdate {

    @JsonProperty("originalEstimatedCompletionTimestamp")
    private OffsetDateTime originalEstimatedCompletionTimestamp = null;

    @JsonProperty("revisedEstimatedCompletionTimestamp")
    private OffsetDateTime revisedEstimatedCompletionTimestamp = null;

    @JsonProperty("reason")
    private String reason = null;

    private EstimationUpdate() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private EstimationUpdate(Builder builder) {
        if (builder.originalEstimatedCompletionTimestamp != null) {
            this.originalEstimatedCompletionTimestamp = builder.originalEstimatedCompletionTimestamp;
        }
        if (builder.revisedEstimatedCompletionTimestamp != null) {
            this.revisedEstimatedCompletionTimestamp = builder.revisedEstimatedCompletionTimestamp;
        }
        if (builder.reason != null) {
            this.reason = builder.reason;
        }
    }

    /**
     * Timestamp for originally estimated completion of certification review for the skill.
     * @return originalEstimatedCompletionTimestamp
    **/
    @JsonProperty("originalEstimatedCompletionTimestamp")
    public OffsetDateTime getOriginalEstimatedCompletionTimestamp() {
        return originalEstimatedCompletionTimestamp;
    }


    /**
     * Timestamp for originally estimated completion of certification review for the skill.
     * @return revisedEstimatedCompletionTimestamp
    **/
    @JsonProperty("revisedEstimatedCompletionTimestamp")
    public OffsetDateTime getRevisedEstimatedCompletionTimestamp() {
        return revisedEstimatedCompletionTimestamp;
    }


    /**
     * Reason for updates to estimates for certification review
     * @return reason
    **/
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EstimationUpdate v1SkillCertificationEstimationUpdate = (EstimationUpdate) o;
        return Objects.equals(this.originalEstimatedCompletionTimestamp, v1SkillCertificationEstimationUpdate.originalEstimatedCompletionTimestamp) &&
            Objects.equals(this.revisedEstimatedCompletionTimestamp, v1SkillCertificationEstimationUpdate.revisedEstimatedCompletionTimestamp) &&
            Objects.equals(this.reason, v1SkillCertificationEstimationUpdate.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originalEstimatedCompletionTimestamp, revisedEstimatedCompletionTimestamp, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EstimationUpdate {\n");
        
        sb.append("    originalEstimatedCompletionTimestamp: ").append(toIndentedString(originalEstimatedCompletionTimestamp)).append("\n");
        sb.append("    revisedEstimatedCompletionTimestamp: ").append(toIndentedString(revisedEstimatedCompletionTimestamp)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
        private OffsetDateTime originalEstimatedCompletionTimestamp;
        private OffsetDateTime revisedEstimatedCompletionTimestamp;
        private String reason;

        private Builder() {}

        @JsonProperty("originalEstimatedCompletionTimestamp")

        public Builder withOriginalEstimatedCompletionTimestamp(OffsetDateTime originalEstimatedCompletionTimestamp) {
            this.originalEstimatedCompletionTimestamp = originalEstimatedCompletionTimestamp;
            return this;
        }


        @JsonProperty("revisedEstimatedCompletionTimestamp")

        public Builder withRevisedEstimatedCompletionTimestamp(OffsetDateTime revisedEstimatedCompletionTimestamp) {
            this.revisedEstimatedCompletionTimestamp = revisedEstimatedCompletionTimestamp;
            return this;
        }


        @JsonProperty("reason")

        public Builder withReason(String reason) {
            this.reason = reason;
            return this;
        }


        public EstimationUpdate build() {
            return new EstimationUpdate(this);
        }
    }
}

