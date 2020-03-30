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


package com.amazon.ask.smapi.model.v1.skill;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Status for available interaction models, keyed by locale. 
 */

@JsonDeserialize(builder = SkillInteractionModel.Builder.class)
public final class SkillInteractionModel {

    @JsonProperty("locale")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.SkillInteractionModelStatus> locale = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.SkillInteractionModelStatus>();

    public static Builder builder() {
        return new Builder();
    }

    private SkillInteractionModel(Builder builder) {
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
    }

    /**
     * Get locale
     * @return locale
    **/
    @JsonProperty("locale")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.SkillInteractionModelStatus> getLocale() {
        return locale;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillInteractionModel v1SkillSkillInteractionModel = (SkillInteractionModel) o;
        return Objects.equals(this.locale, v1SkillSkillInteractionModel.locale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillInteractionModel {\n");
        
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
        private Map<String, com.amazon.ask.smapi.model.v1.skill.SkillInteractionModelStatus> locale;

        private Builder() {}

        @JsonProperty("locale")

        public Builder withLocale(Map<String, com.amazon.ask.smapi.model.v1.skill.SkillInteractionModelStatus> locale) {
            this.locale = locale;
            return this;
        }

        public Builder putLocaleItem(String key, com.amazon.ask.smapi.model.v1.skill.SkillInteractionModelStatus localeItem) {
            if (this.locale == null) {
                this.locale = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.SkillInteractionModelStatus>();
            }
            this.locale.put(key, localeItem);
            return this;
        }

        public SkillInteractionModel build() {
            return new SkillInteractionModel(this);
        }
    }
}

