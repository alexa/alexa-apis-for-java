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
 * optional. Used by developer to opt in to Automatic Skill Distribution, a feature where a skill will automatically be published in new eligible locales from the same language (e.g. from \&quot;en-US\&quot; to \&quot;en-CA\&quot; and \&quot;en-GB\&quot;). Locales that the developer has already created will not be overwritten.
 */

@JsonDeserialize(builder = AutomaticDistribution.Builder.class)
public final class AutomaticDistribution {

    @JsonProperty("isActive")
    private Boolean isActive = null;

    @JsonProperty("sourceLocaleForLanguages")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.SourceLanguageForLocales> sourceLocaleForLanguages = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.SourceLanguageForLocales>();

    public static Builder builder() {
        return new Builder();
    }

    private AutomaticDistribution(Builder builder) {
        if (builder.isActive != null) {
            this.isActive = builder.isActive;
        }
        if (builder.sourceLocaleForLanguages != null) {
            this.sourceLocaleForLanguages = builder.sourceLocaleForLanguages;
        }
    }

    /**
     * set to true to opt in to Automatic Skill Distribution. If false, then the skill will not be considered for Automatic Skill Distribution. Note that once a skill has gone through the automatic distribution process and this value is later set to false, any locales that were published through this feature will not be reverted. Any published locales will need to be suppressed manually via contacting DAG.
     * @return isActive
    **/
    @JsonProperty("isActive")
    public Boolean getIsActive() {
        return isActive;
    }


    /**
     * list of items pairing a language with a source locale. Required if isActive is set to true. For each language there must be exactly one source locale.
     * @return sourceLocaleForLanguages
    **/
    @JsonProperty("sourceLocaleForLanguages")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.SourceLanguageForLocales> getSourceLocaleForLanguages() {
        return sourceLocaleForLanguages;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AutomaticDistribution v1SkillManifestAutomaticDistribution = (AutomaticDistribution) o;
        return Objects.equals(this.isActive, v1SkillManifestAutomaticDistribution.isActive) &&
            Objects.equals(this.sourceLocaleForLanguages, v1SkillManifestAutomaticDistribution.sourceLocaleForLanguages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isActive, sourceLocaleForLanguages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutomaticDistribution {\n");
        
        sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
        sb.append("    sourceLocaleForLanguages: ").append(toIndentedString(sourceLocaleForLanguages)).append("\n");
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
        private Boolean isActive;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.SourceLanguageForLocales> sourceLocaleForLanguages;

        private Builder() {}

        @JsonProperty("isActive")

        public Builder withIsActive(Boolean isActive) {
            this.isActive = isActive;
            return this;
        }


        @JsonProperty("sourceLocaleForLanguages")

        public Builder withSourceLocaleForLanguages(List<com.amazon.ask.smapi.model.v1.skill.Manifest.SourceLanguageForLocales> sourceLocaleForLanguages) {
            this.sourceLocaleForLanguages = sourceLocaleForLanguages;
            return this;
        }

        public Builder addSourceLocaleForLanguagesItem(com.amazon.ask.smapi.model.v1.skill.Manifest.SourceLanguageForLocales sourceLocaleForLanguagesItem) {
            if (this.sourceLocaleForLanguages == null) {
                this.sourceLocaleForLanguages = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.SourceLanguageForLocales>();
            }
            this.sourceLocaleForLanguages.add(sourceLocaleForLanguagesItem);
            return this;
        }

        public AutomaticDistribution build() {
            return new AutomaticDistribution(this);
        }
    }
}

