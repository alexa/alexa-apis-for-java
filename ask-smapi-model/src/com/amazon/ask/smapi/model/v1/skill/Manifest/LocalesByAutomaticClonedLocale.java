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
 * maps source locale to list of target locales. Source and target locales should be with the same language.
 */

@JsonDeserialize(builder = LocalesByAutomaticClonedLocale.Builder.class)
public final class LocalesByAutomaticClonedLocale {

    @JsonProperty("source")
    private String source = null;

    @JsonProperty("targets")
    private List<String> targets = new ArrayList<String>();

    private LocalesByAutomaticClonedLocale() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private LocalesByAutomaticClonedLocale(Builder builder) {
        if (builder.source != null) {
            this.source = builder.source;
        }
        if (builder.targets != null) {
            this.targets = builder.targets;
        }
    }

    /**
     * Locale where the metadata and model will be copied from. For example: en-US. This locale must already exist in the skill.
     * @return source
    **/
    @JsonProperty("source")
    public String getSource() {
        return source;
    }


    /**
     * Optional. List of locales where the metadata and model will be copied to. All configuration of source locale will be copied, so target locales do not have to exist before. Defaults to all locales with the same language as the sourceLocale.
     * @return targets
    **/
    @JsonProperty("targets")
    public List<String> getTargets() {
        return targets;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LocalesByAutomaticClonedLocale v1SkillManifestLocalesByAutomaticClonedLocale = (LocalesByAutomaticClonedLocale) o;
        return Objects.equals(this.source, v1SkillManifestLocalesByAutomaticClonedLocale.source) &&
            Objects.equals(this.targets, v1SkillManifestLocalesByAutomaticClonedLocale.targets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, targets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalesByAutomaticClonedLocale {\n");
        
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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
        private String source;
        private List<String> targets;

        private Builder() {}

        @JsonProperty("source")

        public Builder withSource(String source) {
            this.source = source;
            return this;
        }


        @JsonProperty("targets")

        public Builder withTargets(List<String> targets) {
            this.targets = targets;
            return this;
        }

        public Builder addTargetsItem(String targetsItem) {
            if (this.targets == null) {
                this.targets = new ArrayList<String>();
            }
            this.targets.add(targetsItem);
            return this;
        }

        public LocalesByAutomaticClonedLocale build() {
            return new LocalesByAutomaticClonedLocale(this);
        }
    }
}

