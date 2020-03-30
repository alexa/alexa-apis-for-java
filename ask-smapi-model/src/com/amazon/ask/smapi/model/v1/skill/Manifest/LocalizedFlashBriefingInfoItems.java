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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LocalizedFlashBriefingInfoItems
 */

@JsonDeserialize(builder = LocalizedFlashBriefingInfoItems.Builder.class)
public final class LocalizedFlashBriefingInfoItems {

    @JsonProperty("logicalName")
    private String logicalName = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("url")
    private String url = null;

    @JsonProperty("imageUri")
    private String imageUri = null;

    @JsonProperty("contentType")
    private String contentType = null;

    @JsonProperty("genre")
    private String genre = null;

    @JsonProperty("updateFrequency")
    private String updateFrequency = null;

    @JsonProperty("vuiPreamble")
    private String vuiPreamble = null;

    @JsonProperty("isDefault")
    private Boolean isDefault = null;

    public static Builder builder() {
        return new Builder();
    }

    private LocalizedFlashBriefingInfoItems(Builder builder) {
        if (builder.logicalName != null) {
            this.logicalName = builder.logicalName;
        }
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.url != null) {
            this.url = builder.url;
        }
        if (builder.imageUri != null) {
            this.imageUri = builder.imageUri;
        }
        if (builder.contentType != null) {
            this.contentType = builder.contentType;
        }
        if (builder.genre != null) {
            this.genre = builder.genre;
        }
        if (builder.updateFrequency != null) {
            this.updateFrequency = builder.updateFrequency;
        }
        if (builder.vuiPreamble != null) {
            this.vuiPreamble = builder.vuiPreamble;
        }
        if (builder.isDefault != null) {
            this.isDefault = builder.isDefault;
        }
    }

    /**
     * Logical name of the feed. This is used to signify relation among feeds across different locales. Example If you have \"weather\" feed in multiple locale then consider naming it \"weather_update\" and we will make sure to play the right feed if customer changes the language on device.
     * @return logicalName
    **/
    @JsonProperty("logicalName")
    public String getLogicalName() {
        return logicalName;
    }


    /**
     * Name that identifies this feed.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Url for the feed
     * @return url
    **/
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }


    /**
     * Uri for the feed image
     * @return imageUri
    **/
    @JsonProperty("imageUri")
    public String getImageUri() {
        return imageUri;
    }


    /**
     * Get contentType
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getContentTypeAsString().
     *
     * @return contentType
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Manifest.FlashBriefingContentType getContentType() {
        return com.amazon.ask.smapi.model.v1.skill.Manifest.FlashBriefingContentType.fromValue(contentType);
    }

    /**
     * Get the underlying String value for contentType.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return contentType as a String value
    **/
    @JsonProperty("contentType")
    public String getContentTypeAsString() {
      return contentType;
    }

    /**
     * Get genre
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getGenreAsString().
     *
     * @return genre
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Manifest.FlashBriefingGenre getGenre() {
        return com.amazon.ask.smapi.model.v1.skill.Manifest.FlashBriefingGenre.fromValue(genre);
    }

    /**
     * Get the underlying String value for genre.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return genre as a String value
    **/
    @JsonProperty("genre")
    public String getGenreAsString() {
      return genre;
    }

    /**
     * Get updateFrequency
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getUpdateFrequencyAsString().
     *
     * @return updateFrequency
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Manifest.FlashBriefingUpdateFrequency getUpdateFrequency() {
        return com.amazon.ask.smapi.model.v1.skill.Manifest.FlashBriefingUpdateFrequency.fromValue(updateFrequency);
    }

    /**
     * Get the underlying String value for updateFrequency.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return updateFrequency as a String value
    **/
    @JsonProperty("updateFrequency")
    public String getUpdateFrequencyAsString() {
      return updateFrequency;
    }

    /**
     * A short introduction for the feed that Alexa reads to the customer before the feed contents. Should start with \"In\" or \"From\".
     * @return vuiPreamble
    **/
    @JsonProperty("vuiPreamble")
    public String getVuiPreamble() {
        return vuiPreamble;
    }


    /**
     * True if this should be the default feed to be enabled when customer enables the skill false otherwise.
     * @return isDefault
    **/
    @JsonProperty("isDefault")
    public Boolean getIsDefault() {
        return isDefault;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LocalizedFlashBriefingInfoItems v1SkillManifestLocalizedFlashBriefingInfoItems = (LocalizedFlashBriefingInfoItems) o;
        return Objects.equals(this.logicalName, v1SkillManifestLocalizedFlashBriefingInfoItems.logicalName) &&
            Objects.equals(this.name, v1SkillManifestLocalizedFlashBriefingInfoItems.name) &&
            Objects.equals(this.url, v1SkillManifestLocalizedFlashBriefingInfoItems.url) &&
            Objects.equals(this.imageUri, v1SkillManifestLocalizedFlashBriefingInfoItems.imageUri) &&
            Objects.equals(this.contentType, v1SkillManifestLocalizedFlashBriefingInfoItems.contentType) &&
            Objects.equals(this.genre, v1SkillManifestLocalizedFlashBriefingInfoItems.genre) &&
            Objects.equals(this.updateFrequency, v1SkillManifestLocalizedFlashBriefingInfoItems.updateFrequency) &&
            Objects.equals(this.vuiPreamble, v1SkillManifestLocalizedFlashBriefingInfoItems.vuiPreamble) &&
            Objects.equals(this.isDefault, v1SkillManifestLocalizedFlashBriefingInfoItems.isDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logicalName, name, url, imageUri, contentType, genre, updateFrequency, vuiPreamble, isDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalizedFlashBriefingInfoItems {\n");
        
        sb.append("    logicalName: ").append(toIndentedString(logicalName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    imageUri: ").append(toIndentedString(imageUri)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    genre: ").append(toIndentedString(genre)).append("\n");
        sb.append("    updateFrequency: ").append(toIndentedString(updateFrequency)).append("\n");
        sb.append("    vuiPreamble: ").append(toIndentedString(vuiPreamble)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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
        private String logicalName;
        private String name;
        private String url;
        private String imageUri;
        private String contentType;
        private String genre;
        private String updateFrequency;
        private String vuiPreamble;
        private Boolean isDefault;

        private Builder() {}

        @JsonProperty("logicalName")

        public Builder withLogicalName(String logicalName) {
            this.logicalName = logicalName;
            return this;
        }


        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("url")

        public Builder withUrl(String url) {
            this.url = url;
            return this;
        }


        @JsonProperty("imageUri")

        public Builder withImageUri(String imageUri) {
            this.imageUri = imageUri;
            return this;
        }


        @JsonProperty("contentType")
        public Builder withContentType(String contentType) {
          this.contentType = contentType;
          return this;
        }

        public Builder withContentType(com.amazon.ask.smapi.model.v1.skill.Manifest.FlashBriefingContentType contentType) {
            this.contentType = contentType != null ? contentType.toString() : null;
            return this;
        }


        @JsonProperty("genre")
        public Builder withGenre(String genre) {
          this.genre = genre;
          return this;
        }

        public Builder withGenre(com.amazon.ask.smapi.model.v1.skill.Manifest.FlashBriefingGenre genre) {
            this.genre = genre != null ? genre.toString() : null;
            return this;
        }


        @JsonProperty("updateFrequency")
        public Builder withUpdateFrequency(String updateFrequency) {
          this.updateFrequency = updateFrequency;
          return this;
        }

        public Builder withUpdateFrequency(com.amazon.ask.smapi.model.v1.skill.Manifest.FlashBriefingUpdateFrequency updateFrequency) {
            this.updateFrequency = updateFrequency != null ? updateFrequency.toString() : null;
            return this;
        }


        @JsonProperty("vuiPreamble")

        public Builder withVuiPreamble(String vuiPreamble) {
            this.vuiPreamble = vuiPreamble;
            return this;
        }


        @JsonProperty("isDefault")

        public Builder withIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }


        public LocalizedFlashBriefingInfoItems build() {
            return new LocalizedFlashBriefingInfoItems(this);
        }
    }
}

