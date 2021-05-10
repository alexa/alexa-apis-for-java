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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the structure of flash briefing api in the skill manifest.
 */

@JsonDeserialize(builder = FlashBriefingApis.Builder.class)
public final class FlashBriefingApis {

    @JsonProperty("locales")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedFlashBriefingInfo> locales = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedFlashBriefingInfo>();

    public static Builder builder() {
        return new Builder();
    }

    private FlashBriefingApis(Builder builder) {
        if (builder.locales != null) {
            this.locales = builder.locales;
        }
    }

    /**
     * Object that contains &amp;lt;locale&amp;gt; objects for each supported locale.
     * @return locales
    **/
    @JsonProperty("locales")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedFlashBriefingInfo> getLocales() {
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
        FlashBriefingApis v1SkillManifestFlashBriefingApis = (FlashBriefingApis) o;
        return Objects.equals(this.locales, v1SkillManifestFlashBriefingApis.locales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locales);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlashBriefingApis {\n");
        
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
        private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedFlashBriefingInfo> locales;

        private Builder() {}

        @JsonProperty("locales")

        public Builder withLocales(Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedFlashBriefingInfo> locales) {
            this.locales = locales;
            return this;
        }

        public Builder putLocalesItem(String key, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedFlashBriefingInfo localesItem) {
            if (this.locales == null) {
                this.locales = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedFlashBriefingInfo>();
            }
            this.locales.put(key, localesItem);
            return this;
        }

        public FlashBriefingApis build() {
            return new FlashBriefingApis(this);
        }
    }
}

