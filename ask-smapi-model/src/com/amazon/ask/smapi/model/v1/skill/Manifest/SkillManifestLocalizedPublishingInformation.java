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
 * Defines the structure for locale specific publishing information in the skill manifest.
 */

@JsonDeserialize(builder = SkillManifestLocalizedPublishingInformation.Builder.class)
public final class SkillManifestLocalizedPublishingInformation {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("smallIconUri")
    private String smallIconUri = null;

    @JsonProperty("largeIconUri")
    private String largeIconUri = null;

    @JsonProperty("summary")
    private String summary = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("updatesDescription")
    private String updatesDescription = null;

    @JsonProperty("examplePhrases")
    private List<String> examplePhrases = new ArrayList<String>();

    @JsonProperty("keywords")
    private List<String> keywords = new ArrayList<String>();

    public static Builder builder() {
        return new Builder();
    }

    private SkillManifestLocalizedPublishingInformation(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.smallIconUri != null) {
            this.smallIconUri = builder.smallIconUri;
        }
        if (builder.largeIconUri != null) {
            this.largeIconUri = builder.largeIconUri;
        }
        if (builder.summary != null) {
            this.summary = builder.summary;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
        if (builder.updatesDescription != null) {
            this.updatesDescription = builder.updatesDescription;
        }
        if (builder.examplePhrases != null) {
            this.examplePhrases = builder.examplePhrases;
        }
        if (builder.keywords != null) {
            this.keywords = builder.keywords;
        }
    }

    /**
     * Name of the skill that is displayed to customers in the Alexa app.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * URL to a small icon for the skill, which is shown in the list of skills (108x108px).
     * @return smallIconUri
    **/
    @JsonProperty("smallIconUri")
    public String getSmallIconUri() {
        return smallIconUri;
    }


    /**
     * URL to a large icon that represents this skill (512x512px).
     * @return largeIconUri
    **/
    @JsonProperty("largeIconUri")
    public String getLargeIconUri() {
        return largeIconUri;
    }


    /**
     * Summary description of the skill, which is shown when viewing the list of skills.
     * @return summary
    **/
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }


    /**
     * A full description explaining the skill’s core functionality and any prerequisites to using it (such as additional hardware, software, or accounts). For a Flash Briefing skill, you must list the feeds for the skill.
     * @return description
    **/
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }


    /**
     * Updates description of the skill's new features and fixes in the version. Should describe changes in the revisions of the skill.
     * @return updatesDescription
    **/
    @JsonProperty("updatesDescription")
    public String getUpdatesDescription() {
        return updatesDescription;
    }


    /**
     * Three example phrases that illustrate how users can invoke your skill. For accuracy, these phrases must come directly from your sample utterances.
     * @return examplePhrases
    **/
    @JsonProperty("examplePhrases")
    public List<String> getExamplePhrases() {
        return examplePhrases;
    }


    /**
     * Sample keyword phrases that describe the skill.
     * @return keywords
    **/
    @JsonProperty("keywords")
    public List<String> getKeywords() {
        return keywords;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillManifestLocalizedPublishingInformation v1SkillManifestSkillManifestLocalizedPublishingInformation = (SkillManifestLocalizedPublishingInformation) o;
        return Objects.equals(this.name, v1SkillManifestSkillManifestLocalizedPublishingInformation.name) &&
            Objects.equals(this.smallIconUri, v1SkillManifestSkillManifestLocalizedPublishingInformation.smallIconUri) &&
            Objects.equals(this.largeIconUri, v1SkillManifestSkillManifestLocalizedPublishingInformation.largeIconUri) &&
            Objects.equals(this.summary, v1SkillManifestSkillManifestLocalizedPublishingInformation.summary) &&
            Objects.equals(this.description, v1SkillManifestSkillManifestLocalizedPublishingInformation.description) &&
            Objects.equals(this.updatesDescription, v1SkillManifestSkillManifestLocalizedPublishingInformation.updatesDescription) &&
            Objects.equals(this.examplePhrases, v1SkillManifestSkillManifestLocalizedPublishingInformation.examplePhrases) &&
            Objects.equals(this.keywords, v1SkillManifestSkillManifestLocalizedPublishingInformation.keywords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, smallIconUri, largeIconUri, summary, description, updatesDescription, examplePhrases, keywords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillManifestLocalizedPublishingInformation {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    smallIconUri: ").append(toIndentedString(smallIconUri)).append("\n");
        sb.append("    largeIconUri: ").append(toIndentedString(largeIconUri)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    updatesDescription: ").append(toIndentedString(updatesDescription)).append("\n");
        sb.append("    examplePhrases: ").append(toIndentedString(examplePhrases)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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
        private String smallIconUri;
        private String largeIconUri;
        private String summary;
        private String description;
        private String updatesDescription;
        private List<String> examplePhrases;
        private List<String> keywords;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("smallIconUri")

        public Builder withSmallIconUri(String smallIconUri) {
            this.smallIconUri = smallIconUri;
            return this;
        }


        @JsonProperty("largeIconUri")

        public Builder withLargeIconUri(String largeIconUri) {
            this.largeIconUri = largeIconUri;
            return this;
        }


        @JsonProperty("summary")

        public Builder withSummary(String summary) {
            this.summary = summary;
            return this;
        }


        @JsonProperty("description")

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        @JsonProperty("updatesDescription")

        public Builder withUpdatesDescription(String updatesDescription) {
            this.updatesDescription = updatesDescription;
            return this;
        }


        @JsonProperty("examplePhrases")

        public Builder withExamplePhrases(List<String> examplePhrases) {
            this.examplePhrases = examplePhrases;
            return this;
        }

        public Builder addExamplePhrasesItem(String examplePhrasesItem) {
            if (this.examplePhrases == null) {
                this.examplePhrases = new ArrayList<String>();
            }
            this.examplePhrases.add(examplePhrasesItem);
            return this;
        }

        @JsonProperty("keywords")

        public Builder withKeywords(List<String> keywords) {
            this.keywords = keywords;
            return this;
        }

        public Builder addKeywordsItem(String keywordsItem) {
            if (this.keywords == null) {
                this.keywords = new ArrayList<String>();
            }
            this.keywords.add(keywordsItem);
            return this;
        }

        public SkillManifestLocalizedPublishingInformation build() {
            return new SkillManifestLocalizedPublishingInformation(this);
        }
    }
}

