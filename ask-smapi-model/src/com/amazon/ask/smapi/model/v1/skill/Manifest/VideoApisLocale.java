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

    @JsonProperty("catalogInformation")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCatalogInfo> catalogInformation = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCatalogInfo>();

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
        if (builder.catalogInformation != null) {
            this.catalogInformation = builder.catalogInformation;
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
     * Get catalogInformation
     * @return catalogInformation
    **/
    @JsonProperty("catalogInformation")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCatalogInfo> getCatalogInformation() {
        return catalogInformation;
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
            Objects.equals(this.catalogInformation, v1SkillManifestVideoApisLocale.catalogInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoProviderTargetingNames, videoProviderLogoUri, catalogInformation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoApisLocale {\n");
        
        sb.append("    videoProviderTargetingNames: ").append(toIndentedString(videoProviderTargetingNames)).append("\n");
        sb.append("    videoProviderLogoUri: ").append(toIndentedString(videoProviderLogoUri)).append("\n");
        sb.append("    catalogInformation: ").append(toIndentedString(catalogInformation)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCatalogInfo> catalogInformation;

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


        @JsonProperty("catalogInformation")

        public Builder withCatalogInformation(List<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCatalogInfo> catalogInformation) {
            this.catalogInformation = catalogInformation;
            return this;
        }

        public Builder addCatalogInformationItem(com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCatalogInfo catalogInformationItem) {
            if (this.catalogInformation == null) {
                this.catalogInformation = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCatalogInfo>();
            }
            this.catalogInformation.add(catalogInformationItem);
            return this;
        }

        public VideoApisLocale build() {
            return new VideoApisLocale(this);
        }
    }
}

