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
 * Defines the structure of localized music information in the skill manifest.
 */

@JsonDeserialize(builder = LocalizedMusicInfo.Builder.class)
public final class LocalizedMusicInfo {

    @JsonProperty("promptName")
    private String promptName = null;

    @JsonProperty("aliases")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicAlias> aliases = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicAlias>();

    @JsonProperty("features")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicFeature> features = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicFeature>();

    @JsonProperty("wordmarkLogos")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicWordmark> wordmarkLogos = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicWordmark>();

    public static Builder builder() {
        return new Builder();
    }

    private LocalizedMusicInfo(Builder builder) {
        if (builder.promptName != null) {
            this.promptName = builder.promptName;
        }
        if (builder.aliases != null) {
            this.aliases = builder.aliases;
        }
        if (builder.features != null) {
            this.features = builder.features;
        }
        if (builder.wordmarkLogos != null) {
            this.wordmarkLogos = builder.wordmarkLogos;
        }
    }

    /**
     * Name to be used when Alexa renders the music skill name.
     * @return promptName
    **/
    @JsonProperty("promptName")
    public String getPromptName() {
        return promptName;
    }


    /**
     * Get aliases
     * @return aliases
    **/
    @JsonProperty("aliases")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicAlias> getAliases() {
        return aliases;
    }


    /**
     * Get features
     * @return features
    **/
    @JsonProperty("features")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicFeature> getFeatures() {
        return features;
    }


    /**
     * Get wordmarkLogos
     * @return wordmarkLogos
    **/
    @JsonProperty("wordmarkLogos")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicWordmark> getWordmarkLogos() {
        return wordmarkLogos;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LocalizedMusicInfo v1SkillManifestLocalizedMusicInfo = (LocalizedMusicInfo) o;
        return Objects.equals(this.promptName, v1SkillManifestLocalizedMusicInfo.promptName) &&
            Objects.equals(this.aliases, v1SkillManifestLocalizedMusicInfo.aliases) &&
            Objects.equals(this.features, v1SkillManifestLocalizedMusicInfo.features) &&
            Objects.equals(this.wordmarkLogos, v1SkillManifestLocalizedMusicInfo.wordmarkLogos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promptName, aliases, features, wordmarkLogos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalizedMusicInfo {\n");
        
        sb.append("    promptName: ").append(toIndentedString(promptName)).append("\n");
        sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
        sb.append("    features: ").append(toIndentedString(features)).append("\n");
        sb.append("    wordmarkLogos: ").append(toIndentedString(wordmarkLogos)).append("\n");
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
        private String promptName;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicAlias> aliases;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicFeature> features;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicWordmark> wordmarkLogos;

        private Builder() {}

        @JsonProperty("promptName")

        public Builder withPromptName(String promptName) {
            this.promptName = promptName;
            return this;
        }


        @JsonProperty("aliases")

        public Builder withAliases(List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicAlias> aliases) {
            this.aliases = aliases;
            return this;
        }

        public Builder addAliasesItem(com.amazon.ask.smapi.model.v1.skill.Manifest.MusicAlias aliasesItem) {
            if (this.aliases == null) {
                this.aliases = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicAlias>();
            }
            this.aliases.add(aliasesItem);
            return this;
        }

        @JsonProperty("features")

        public Builder withFeatures(List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicFeature> features) {
            this.features = features;
            return this;
        }

        public Builder addFeaturesItem(com.amazon.ask.smapi.model.v1.skill.Manifest.MusicFeature featuresItem) {
            if (this.features == null) {
                this.features = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicFeature>();
            }
            this.features.add(featuresItem);
            return this;
        }

        @JsonProperty("wordmarkLogos")

        public Builder withWordmarkLogos(List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicWordmark> wordmarkLogos) {
            this.wordmarkLogos = wordmarkLogos;
            return this;
        }

        public Builder addWordmarkLogosItem(com.amazon.ask.smapi.model.v1.skill.Manifest.MusicWordmark wordmarkLogosItem) {
            if (this.wordmarkLogos == null) {
                this.wordmarkLogos = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicWordmark>();
            }
            this.wordmarkLogos.add(wordmarkLogosItem);
            return this;
        }

        public LocalizedMusicInfo build() {
            return new LocalizedMusicInfo(this);
        }
    }
}

