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
 * maps a language to a locale. During Automatic Skill Distribution, skill metadata and model of the source locale will be copied to other eligible locales of the same language. Eligible destination locales will be determined by the system.
 */

@JsonDeserialize(builder = SourceLanguageForLocales.Builder.class)
public final class SourceLanguageForLocales {

    @JsonProperty("language")
    private String language = null;

    @JsonProperty("sourceLocale")
    private String sourceLocale = null;

    private SourceLanguageForLocales() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SourceLanguageForLocales(Builder builder) {
        if (builder.language != null) {
            this.language = builder.language;
        }
        if (builder.sourceLocale != null) {
            this.sourceLocale = builder.sourceLocale;
        }
    }

    /**
     * two-letter string representing the language to distribute to. There must be at least one locale in publishingInformation.locales which has this language as the prefix.
     * @return language
    **/
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }


    /**
     * locale where the metadata and model will be copied from. This locale must already exist in the skill.
     * @return sourceLocale
    **/
    @JsonProperty("sourceLocale")
    public String getSourceLocale() {
        return sourceLocale;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceLanguageForLocales v1SkillManifestSourceLanguageForLocales = (SourceLanguageForLocales) o;
        return Objects.equals(this.language, v1SkillManifestSourceLanguageForLocales.language) &&
            Objects.equals(this.sourceLocale, v1SkillManifestSourceLanguageForLocales.sourceLocale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, sourceLocale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceLanguageForLocales {\n");
        
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    sourceLocale: ").append(toIndentedString(sourceLocale)).append("\n");
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
        private String language;
        private String sourceLocale;

        private Builder() {}

        @JsonProperty("language")

        public Builder withLanguage(String language) {
            this.language = language;
            return this;
        }


        @JsonProperty("sourceLocale")

        public Builder withSourceLocale(String sourceLocale) {
            this.sourceLocale = sourceLocale;
            return this;
        }


        public SourceLanguageForLocales build() {
            return new SourceLanguageForLocales(this);
        }
    }
}

