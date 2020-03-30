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
 * Defines the structure for health skill locale specific publishing information in the skill manifest.
 */

@JsonDeserialize(builder = LocalizedHealthInfo.Builder.class)
public final class LocalizedHealthInfo {

    @JsonProperty("promptName")
    private String promptName = null;

    @JsonProperty("aliases")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.HealthAlias> aliases = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.HealthAlias>();

    public static Builder builder() {
        return new Builder();
    }

    private LocalizedHealthInfo(Builder builder) {
        if (builder.promptName != null) {
            this.promptName = builder.promptName;
        }
        if (builder.aliases != null) {
            this.aliases = builder.aliases;
        }
    }

    /**
     * SSML supported name to use when Alexa renders the health skill name in a prompt to the user.
     * @return promptName
    **/
    @JsonProperty("promptName")
    public String getPromptName() {
        return promptName;
    }


    /**
     * Defines the names to use when a user tries to invoke the health skill.
     * @return aliases
    **/
    @JsonProperty("aliases")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.HealthAlias> getAliases() {
        return aliases;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LocalizedHealthInfo v1SkillManifestLocalizedHealthInfo = (LocalizedHealthInfo) o;
        return Objects.equals(this.promptName, v1SkillManifestLocalizedHealthInfo.promptName) &&
            Objects.equals(this.aliases, v1SkillManifestLocalizedHealthInfo.aliases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promptName, aliases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalizedHealthInfo {\n");
        
        sb.append("    promptName: ").append(toIndentedString(promptName)).append("\n");
        sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.HealthAlias> aliases;

        private Builder() {}

        @JsonProperty("promptName")

        public Builder withPromptName(String promptName) {
            this.promptName = promptName;
            return this;
        }


        @JsonProperty("aliases")

        public Builder withAliases(List<com.amazon.ask.smapi.model.v1.skill.Manifest.HealthAlias> aliases) {
            this.aliases = aliases;
            return this;
        }

        public Builder addAliasesItem(com.amazon.ask.smapi.model.v1.skill.Manifest.HealthAlias aliasesItem) {
            if (this.aliases == null) {
                this.aliases = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.HealthAlias>();
            }
            this.aliases.add(aliasesItem);
            return this;
        }

        public LocalizedHealthInfo build() {
            return new LocalizedHealthInfo(this);
        }
    }
}

