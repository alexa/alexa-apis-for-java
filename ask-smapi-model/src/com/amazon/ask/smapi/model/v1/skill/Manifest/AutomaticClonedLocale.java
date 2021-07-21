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
 * Defines the structure for Sync Locales in the skill manifest. This is an optional property and Sync Locales will be disabled if not set.
 */

@JsonDeserialize(builder = AutomaticClonedLocale.Builder.class)
public final class AutomaticClonedLocale {

    @JsonProperty("locales")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.LocalesByAutomaticClonedLocale> locales = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.LocalesByAutomaticClonedLocale>();

    public static Builder builder() {
        return new Builder();
    }

    private AutomaticClonedLocale(Builder builder) {
        if (builder.locales != null) {
            this.locales = builder.locales;
        }
    }

    /**
     * List of language specific source locale to target locales mapping.
     * @return locales
    **/
    @JsonProperty("locales")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.LocalesByAutomaticClonedLocale> getLocales() {
        return locales;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AutomaticClonedLocale v1SkillManifestAutomaticClonedLocale = (AutomaticClonedLocale) o;
        return Objects.equals(this.locales, v1SkillManifestAutomaticClonedLocale.locales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locales);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutomaticClonedLocale {\n");
        
        sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.LocalesByAutomaticClonedLocale> locales;

        private Builder() {}

        @JsonProperty("locales")

        public Builder withLocales(List<com.amazon.ask.smapi.model.v1.skill.Manifest.LocalesByAutomaticClonedLocale> locales) {
            this.locales = locales;
            return this;
        }

        public Builder addLocalesItem(com.amazon.ask.smapi.model.v1.skill.Manifest.LocalesByAutomaticClonedLocale localesItem) {
            if (this.locales == null) {
                this.locales = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.LocalesByAutomaticClonedLocale>();
            }
            this.locales.add(localesItem);
            return this;
        }

        public AutomaticClonedLocale build() {
            return new AutomaticClonedLocale(this);
        }
    }
}

