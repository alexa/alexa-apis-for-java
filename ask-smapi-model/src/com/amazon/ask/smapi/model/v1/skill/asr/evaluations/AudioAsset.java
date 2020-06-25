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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object containing information about downloading audio file
 */

@JsonDeserialize(builder = AudioAsset.Builder.class)
public final class AudioAsset {

    @JsonProperty("downloadUrl")
    private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.AudioAssetDownloadUrl downloadUrl = null;

    @JsonProperty("expiryTime")
    private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.AudioAssetDownloadUrlExpiryTime expiryTime = null;

    public static Builder builder() {
        return new Builder();
    }

    private AudioAsset(Builder builder) {
        if (builder.downloadUrl != null) {
            this.downloadUrl = builder.downloadUrl;
        }
        if (builder.expiryTime != null) {
            this.expiryTime = builder.expiryTime;
        }
    }

    /**
     * Get downloadUrl
     * @return downloadUrl
    **/
    @JsonProperty("downloadUrl")
    public com.amazon.ask.smapi.model.v1.skill.asr.evaluations.AudioAssetDownloadUrl getDownloadUrl() {
        return downloadUrl;
    }


    /**
     * Get expiryTime
     * @return expiryTime
    **/
    @JsonProperty("expiryTime")
    public com.amazon.ask.smapi.model.v1.skill.asr.evaluations.AudioAssetDownloadUrlExpiryTime getExpiryTime() {
        return expiryTime;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AudioAsset v1SkillAsrEvaluationsAudioAsset = (AudioAsset) o;
        return Objects.equals(this.downloadUrl, v1SkillAsrEvaluationsAudioAsset.downloadUrl) &&
            Objects.equals(this.expiryTime, v1SkillAsrEvaluationsAudioAsset.expiryTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(downloadUrl, expiryTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioAsset {\n");
        
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
        sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.AudioAssetDownloadUrl downloadUrl;
        private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.AudioAssetDownloadUrlExpiryTime expiryTime;

        private Builder() {}

        @JsonProperty("downloadUrl")

        public Builder withDownloadUrl(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.AudioAssetDownloadUrl downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }


        @JsonProperty("expiryTime")

        public Builder withExpiryTime(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.AudioAssetDownloadUrlExpiryTime expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }


        public AudioAsset build() {
            return new AudioAsset(this);
        }
    }
}

