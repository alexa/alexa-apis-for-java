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
 * Structure for summarised view of review tracking information of the skill. This does not have the estimationUpdates array field.
 */

@JsonDeserialize(builder = ReviewTrackingInfoSummary.Builder.class)
public final class ReviewTrackingInfoSummary {

    @JsonProperty("estimatedCompletionTimestamp")
    private OffsetDateTime estimatedCompletionTimestamp = null;

    @JsonProperty("actualCompletionTimestamp")
    private OffsetDateTime actualCompletionTimestamp = null;

    @JsonProperty("lastUpdated")
    private OffsetDateTime lastUpdated = null;

    private ReviewTrackingInfoSummary() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ReviewTrackingInfoSummary(Builder builder) {
        if (builder.estimatedCompletionTimestamp != null) {
            this.estimatedCompletionTimestamp = builder.estimatedCompletionTimestamp;
        }
        if (builder.actualCompletionTimestamp != null) {
            this.actualCompletionTimestamp = builder.actualCompletionTimestamp;
        }
        if (builder.lastUpdated != null) {
            this.lastUpdated = builder.lastUpdated;
        }
    }

    /**
     * Timestamp for estimated completion of certification review for the skill.
     * @return estimatedCompletionTimestamp
    **/
    @JsonProperty("estimatedCompletionTimestamp")
    public OffsetDateTime getEstimatedCompletionTimestamp() {
        return estimatedCompletionTimestamp;
    }


    /**
     * Timestamp for actual completion of certification review workflow for the skill.
     * @return actualCompletionTimestamp
    **/
    @JsonProperty("actualCompletionTimestamp")
    public OffsetDateTime getActualCompletionTimestamp() {
        return actualCompletionTimestamp;
    }


    /**
     * Timestamp for when the last update was made to review tracking info.
     * @return lastUpdated
    **/
    @JsonProperty("lastUpdated")
    public OffsetDateTime getLastUpdated() {
        return lastUpdated;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReviewTrackingInfoSummary v1SkillCertificationReviewTrackingInfoSummary = (ReviewTrackingInfoSummary) o;
        return Objects.equals(this.estimatedCompletionTimestamp, v1SkillCertificationReviewTrackingInfoSummary.estimatedCompletionTimestamp) &&
            Objects.equals(this.actualCompletionTimestamp, v1SkillCertificationReviewTrackingInfoSummary.actualCompletionTimestamp) &&
            Objects.equals(this.lastUpdated, v1SkillCertificationReviewTrackingInfoSummary.lastUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estimatedCompletionTimestamp, actualCompletionTimestamp, lastUpdated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReviewTrackingInfoSummary {\n");
        
        sb.append("    estimatedCompletionTimestamp: ").append(toIndentedString(estimatedCompletionTimestamp)).append("\n");
        sb.append("    actualCompletionTimestamp: ").append(toIndentedString(actualCompletionTimestamp)).append("\n");
        sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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
        private OffsetDateTime estimatedCompletionTimestamp;
        private OffsetDateTime actualCompletionTimestamp;
        private OffsetDateTime lastUpdated;

        private Builder() {}

        @JsonProperty("estimatedCompletionTimestamp")

        public Builder withEstimatedCompletionTimestamp(OffsetDateTime estimatedCompletionTimestamp) {
            this.estimatedCompletionTimestamp = estimatedCompletionTimestamp;
            return this;
        }


        @JsonProperty("actualCompletionTimestamp")

        public Builder withActualCompletionTimestamp(OffsetDateTime actualCompletionTimestamp) {
            this.actualCompletionTimestamp = actualCompletionTimestamp;
            return this;
        }


        @JsonProperty("lastUpdated")

        public Builder withLastUpdated(OffsetDateTime lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }


        public ReviewTrackingInfoSummary build() {
            return new ReviewTrackingInfoSummary(this);
        }
    }
}

