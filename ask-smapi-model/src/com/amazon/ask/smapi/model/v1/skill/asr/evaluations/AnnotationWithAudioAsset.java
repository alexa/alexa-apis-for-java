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


package com.amazon.ask.smapi.model.v1.skill.asr.evaluations;

import java.util.Objects;
import java.math.BigDecimal;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * object containing annotation content and audio file download information.
 */

@JsonDeserialize(builder = AnnotationWithAudioAsset.Builder.class)
public final class AnnotationWithAudioAsset {

    @JsonProperty("uploadId")
    private String uploadId = null;

    @JsonProperty("filePathInUpload")
    private String filePathInUpload = null;

    @JsonProperty("evaluationWeight")
    private BigDecimal evaluationWeight = null;

    @JsonProperty("expectedTranscription")
    private String expectedTranscription = null;

    @JsonProperty("audioAsset")
    private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.AudioAsset audioAsset = null;

    public static Builder builder() {
        return new Builder();
    }

    private AnnotationWithAudioAsset(Builder builder) {
        if (builder.uploadId != null) {
            this.uploadId = builder.uploadId;
        }
        if (builder.filePathInUpload != null) {
            this.filePathInUpload = builder.filePathInUpload;
        }
        if (builder.evaluationWeight != null) {
            this.evaluationWeight = builder.evaluationWeight;
        }
        if (builder.expectedTranscription != null) {
            this.expectedTranscription = builder.expectedTranscription;
        }
        if (builder.audioAsset != null) {
            this.audioAsset = builder.audioAsset;
        }
    }

    /**
     * upload id obtained when developer creates an upload using catalog API
     * @return uploadId
    **/
    @JsonProperty("uploadId")
    public String getUploadId() {
        return uploadId;
    }


    /**
     * file path in the uploaded zip file. For example, a zip containing a folder named 'a' and there is an audio b.mp3 in that folder. The file path is a/b.mp3. Notice that forward slash ('/') should be used to concatenate directories.
     * @return filePathInUpload
    **/
    @JsonProperty("filePathInUpload")
    public String getFilePathInUpload() {
        return filePathInUpload;
    }


    /**
     * weight of the test case in an evaluation, the value would be used for calculating metrics such as overall error rate.  The acceptable values are from 1 - 1000. 1 means least significant, 1000 means mot significant. Here is how weight  impact the `OVERALL_ERROR_RATE` calculation: For example, an annotation set consists of 3 annotations and they have weight of 8, 1, 1. The evaluation results  show that only the first annotation test case passed while the rest of the test cases failed. In this case,  the overall error rate is (8 / (8 + 1 + 1)) = 0.8 
     * minimum: 1
     * maximum: 1000
     * @return evaluationWeight
    **/
    @JsonProperty("evaluationWeight")
    public BigDecimal getEvaluationWeight() {
        return evaluationWeight;
    }


    /**
     * expected transcription text for the input audio. The acceptable length of the string is between 1 and 500 Unicode characters
     * @return expectedTranscription
    **/
    @JsonProperty("expectedTranscription")
    public String getExpectedTranscription() {
        return expectedTranscription;
    }


    /**
     * Get audioAsset
     * @return audioAsset
    **/
    @JsonProperty("audioAsset")
    public com.amazon.ask.smapi.model.v1.skill.asr.evaluations.AudioAsset getAudioAsset() {
        return audioAsset;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnnotationWithAudioAsset v1SkillAsrEvaluationsAnnotationWithAudioAsset = (AnnotationWithAudioAsset) o;
        return Objects.equals(this.uploadId, v1SkillAsrEvaluationsAnnotationWithAudioAsset.uploadId) &&
            Objects.equals(this.filePathInUpload, v1SkillAsrEvaluationsAnnotationWithAudioAsset.filePathInUpload) &&
            Objects.equals(this.evaluationWeight, v1SkillAsrEvaluationsAnnotationWithAudioAsset.evaluationWeight) &&
            Objects.equals(this.expectedTranscription, v1SkillAsrEvaluationsAnnotationWithAudioAsset.expectedTranscription) &&
            Objects.equals(this.audioAsset, v1SkillAsrEvaluationsAnnotationWithAudioAsset.audioAsset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadId, filePathInUpload, evaluationWeight, expectedTranscription, audioAsset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnnotationWithAudioAsset {\n");
        
        sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
        sb.append("    filePathInUpload: ").append(toIndentedString(filePathInUpload)).append("\n");
        sb.append("    evaluationWeight: ").append(toIndentedString(evaluationWeight)).append("\n");
        sb.append("    expectedTranscription: ").append(toIndentedString(expectedTranscription)).append("\n");
        sb.append("    audioAsset: ").append(toIndentedString(audioAsset)).append("\n");
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
        private String uploadId;
        private String filePathInUpload;
        private BigDecimal evaluationWeight;
        private String expectedTranscription;
        private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.AudioAsset audioAsset;

        private Builder() {}

        @JsonProperty("uploadId")

        public Builder withUploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }


        @JsonProperty("filePathInUpload")

        public Builder withFilePathInUpload(String filePathInUpload) {
            this.filePathInUpload = filePathInUpload;
            return this;
        }


        @JsonProperty("evaluationWeight")

        public Builder withEvaluationWeight(BigDecimal evaluationWeight) {
            this.evaluationWeight = evaluationWeight;
            return this;
        }


        @JsonProperty("expectedTranscription")

        public Builder withExpectedTranscription(String expectedTranscription) {
            this.expectedTranscription = expectedTranscription;
            return this;
        }


        @JsonProperty("audioAsset")

        public Builder withAudioAsset(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.AudioAsset audioAsset) {
            this.audioAsset = audioAsset;
            return this;
        }


        public AnnotationWithAudioAsset build() {
            return new AnnotationWithAudioAsset(this);
        }
    }
}

