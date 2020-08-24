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


package com.amazon.ask.smapi.model.v1.skill.asr.annotationSets;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AnnotationSetMetadata
 */

@JsonDeserialize(builder = AnnotationSetMetadata.Builder.class)
public final class AnnotationSetMetadata {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("annotationCount")
    private Integer annotationCount = null;

    @JsonProperty("lastUpdatedTimestamp")
    private OffsetDateTime lastUpdatedTimestamp = null;

    @JsonProperty("eligibleForEvaluation")
    private Boolean eligibleForEvaluation = null;

    public static Builder builder() {
        return new Builder();
    }

    private AnnotationSetMetadata(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.annotationCount != null) {
            this.annotationCount = builder.annotationCount;
        }
        if (builder.lastUpdatedTimestamp != null) {
            this.lastUpdatedTimestamp = builder.lastUpdatedTimestamp;
        }
        if (builder.eligibleForEvaluation != null) {
            this.eligibleForEvaluation = builder.eligibleForEvaluation;
        }
    }

    /**
     * Name of the ASR annotation set
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Number of annotations within an annotation set
     * @return annotationCount
    **/
    @JsonProperty("annotationCount")
    public Integer getAnnotationCount() {
        return annotationCount;
    }


    /**
     * The timestamp for the most recent update of ASR annotation set
     * @return lastUpdatedTimestamp
    **/
    @JsonProperty("lastUpdatedTimestamp")
    public OffsetDateTime getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }


    /**
     * Indicates if the annotation set is eligible for evaluation. A set is not eligible for evaluation if any annotation within the set has a missing uploadId, filePathInUpload, expectedTranscription, or evaluationWeight.
     * @return eligibleForEvaluation
    **/
    @JsonProperty("eligibleForEvaluation")
    public Boolean getEligibleForEvaluation() {
        return eligibleForEvaluation;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnnotationSetMetadata v1SkillAsrAnnotationSetsAnnotationSetMetadata = (AnnotationSetMetadata) o;
        return Objects.equals(this.name, v1SkillAsrAnnotationSetsAnnotationSetMetadata.name) &&
            Objects.equals(this.annotationCount, v1SkillAsrAnnotationSetsAnnotationSetMetadata.annotationCount) &&
            Objects.equals(this.lastUpdatedTimestamp, v1SkillAsrAnnotationSetsAnnotationSetMetadata.lastUpdatedTimestamp) &&
            Objects.equals(this.eligibleForEvaluation, v1SkillAsrAnnotationSetsAnnotationSetMetadata.eligibleForEvaluation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, annotationCount, lastUpdatedTimestamp, eligibleForEvaluation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnnotationSetMetadata {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    annotationCount: ").append(toIndentedString(annotationCount)).append("\n");
        sb.append("    lastUpdatedTimestamp: ").append(toIndentedString(lastUpdatedTimestamp)).append("\n");
        sb.append("    eligibleForEvaluation: ").append(toIndentedString(eligibleForEvaluation)).append("\n");
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
        private String name;
        private Integer annotationCount;
        private OffsetDateTime lastUpdatedTimestamp;
        private Boolean eligibleForEvaluation;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("annotationCount")

        public Builder withAnnotationCount(Integer annotationCount) {
            this.annotationCount = annotationCount;
            return this;
        }


        @JsonProperty("lastUpdatedTimestamp")

        public Builder withLastUpdatedTimestamp(OffsetDateTime lastUpdatedTimestamp) {
            this.lastUpdatedTimestamp = lastUpdatedTimestamp;
            return this;
        }


        @JsonProperty("eligibleForEvaluation")

        public Builder withEligibleForEvaluation(Boolean eligibleForEvaluation) {
            this.eligibleForEvaluation = eligibleForEvaluation;
            return this;
        }


        public AnnotationSetMetadata build() {
            return new AnnotationSetMetadata(this);
        }
    }
}

