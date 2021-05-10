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


package com.amazon.ask.smapi.model.v1.skill.Manifest;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Defines the structure for localized video api information.
 */

@JsonDeserialize(builder = VideoApisLocale.Builder.class)
public final class VideoApisLocale {

    @JsonProperty("videoProviderTargetingNames")
    private List<String> videoProviderTargetingNames = new ArrayList<String>();

    @JsonProperty("videoProviderLogoUri")
    private String videoProviderLogoUri = null;

    @JsonProperty("fireTvCatalogIngestion")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.VideoFireTvCatalogIngestion fireTvCatalogIngestion = null;

    @JsonProperty("features")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoFeature> features = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoFeature>();

    @JsonProperty("promptNames")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoPromptName> promptNames = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoPromptName>();

    public static Builder builder() {
        return new Builder();
    }

    private VideoApisLocale(Builder builder) {
        if (builder.videoProviderTargetingNames != null) {
            this.videoProviderTargetingNames = builder.videoProviderTargetingNames;
        }
        if (builder.videoProviderLogoUri != null) {
            this.videoProviderLogoUri = builder.videoProviderLogoUri;
        }
        if (builder.fireTvCatalogIngestion != null) {
            this.fireTvCatalogIngestion = builder.fireTvCatalogIngestion;
        }
        if (builder.features != null) {
            this.features = builder.features;
        }
        if (builder.promptNames != null) {
            this.promptNames = builder.promptNames;
        }
    }

    /**
     * Defines the video provider's targeting name.
     * @return videoProviderTargetingNames
    **/
    @JsonProperty("videoProviderTargetingNames")
    public List<String> getVideoProviderTargetingNames() {
        return videoProviderTargetingNames;
    }


    /**
     * Get videoProviderLogoUri
     * @return videoProviderLogoUri
    **/
    @JsonProperty("videoProviderLogoUri")
    public String getVideoProviderLogoUri() {
        return videoProviderLogoUri;
    }


    /**
     * Get fireTvCatalogIngestion
     * @return fireTvCatalogIngestion
    **/
    @JsonProperty("fireTvCatalogIngestion")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.VideoFireTvCatalogIngestion getFireTvCatalogIngestion() {
        return fireTvCatalogIngestion;
    }


    /**
     * Defines the array of video features for this skill.
     * @return features
    **/
    @JsonProperty("features")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoFeature> getFeatures() {
        return features;
    }


    /**
     * Name to use when Alexa renders the video skill name in a prompt to the user
     * @return promptNames
    **/
    @JsonProperty("promptNames")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoPromptName> getPromptNames() {
        return promptNames;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoApisLocale v1SkillManifestVideoApisLocale = (VideoApisLocale) o;
        return Objects.equals(this.videoProviderTargetingNames, v1SkillManifestVideoApisLocale.videoProviderTargetingNames) &&
            Objects.equals(this.videoProviderLogoUri, v1SkillManifestVideoApisLocale.videoProviderLogoUri) &&
            Objects.equals(this.fireTvCatalogIngestion, v1SkillManifestVideoApisLocale.fireTvCatalogIngestion) &&
            Objects.equals(this.features, v1SkillManifestVideoApisLocale.features) &&
            Objects.equals(this.promptNames, v1SkillManifestVideoApisLocale.promptNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoProviderTargetingNames, videoProviderLogoUri, fireTvCatalogIngestion, features, promptNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoApisLocale {\n");
        
        sb.append("    videoProviderTargetingNames: ").append(toIndentedString(videoProviderTargetingNames)).append("\n");
        sb.append("    videoProviderLogoUri: ").append(toIndentedString(videoProviderLogoUri)).append("\n");
        sb.append("    fireTvCatalogIngestion: ").append(toIndentedString(fireTvCatalogIngestion)).append("\n");
        sb.append("    features: ").append(toIndentedString(features)).append("\n");
        sb.append("    promptNames: ").append(toIndentedString(promptNames)).append("\n");
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
        private List<String> videoProviderTargetingNames;
        private String videoProviderLogoUri;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.VideoFireTvCatalogIngestion fireTvCatalogIngestion;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoFeature> features;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoPromptName> promptNames;

        private Builder() {}

        @JsonProperty("videoProviderTargetingNames")

        public Builder withVideoProviderTargetingNames(List<String> videoProviderTargetingNames) {
            this.videoProviderTargetingNames = videoProviderTargetingNames;
            return this;
        }

        public Builder addVideoProviderTargetingNamesItem(String videoProviderTargetingNamesItem) {
            if (this.videoProviderTargetingNames == null) {
                this.videoProviderTargetingNames = new ArrayList<String>();
            }
            this.videoProviderTargetingNames.add(videoProviderTargetingNamesItem);
            return this;
        }

        @JsonProperty("videoProviderLogoUri")

        public Builder withVideoProviderLogoUri(String videoProviderLogoUri) {
            this.videoProviderLogoUri = videoProviderLogoUri;
            return this;
        }


        @JsonProperty("fireTvCatalogIngestion")

        public Builder withFireTvCatalogIngestion(com.amazon.ask.smapi.model.v1.skill.Manifest.VideoFireTvCatalogIngestion fireTvCatalogIngestion) {
            this.fireTvCatalogIngestion = fireTvCatalogIngestion;
            return this;
        }


        @JsonProperty("features")

        public Builder withFeatures(List<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoFeature> features) {
            this.features = features;
            return this;
        }

        public Builder addFeaturesItem(com.amazon.ask.smapi.model.v1.skill.Manifest.VideoFeature featuresItem) {
            if (this.features == null) {
                this.features = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoFeature>();
            }
            this.features.add(featuresItem);
            return this;
        }

        @JsonProperty("promptNames")

        public Builder withPromptNames(List<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoPromptName> promptNames) {
            this.promptNames = promptNames;
            return this;
        }

        public Builder addPromptNamesItem(com.amazon.ask.smapi.model.v1.skill.Manifest.VideoPromptName promptNamesItem) {
            if (this.promptNames == null) {
                this.promptNames = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoPromptName>();
            }
            this.promptNames.add(promptNamesItem);
            return this;
        }

        public VideoApisLocale build() {
            return new VideoApisLocale(this);
        }
    }
}

