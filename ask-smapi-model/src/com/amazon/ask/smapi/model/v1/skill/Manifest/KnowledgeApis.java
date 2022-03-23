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
 * defines the structure for the knowledge api of the skill.
 */

@JsonDeserialize(builder = KnowledgeApis.Builder.class)
public final class KnowledgeApis {

    @JsonProperty("enablementChannel")
    private String enablementChannel = null;

    @JsonProperty("locales")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedKnowledgeInformation> locales = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedKnowledgeInformation>();

    public static Builder builder() {
        return new Builder();
    }

    private KnowledgeApis(Builder builder) {
        if (builder.enablementChannel != null) {
            this.enablementChannel = builder.enablementChannel;
        }
        if (builder.locales != null) {
            this.locales = builder.locales;
        }
    }

    /**
     * Get enablementChannel
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getEnablementChannelAsString().
     *
     * @return enablementChannel
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Manifest.KnowledgeApisEnablementChannel getEnablementChannel() {
        return com.amazon.ask.smapi.model.v1.skill.Manifest.KnowledgeApisEnablementChannel.fromValue(enablementChannel);
    }

    /**
     * Get the underlying String value for enablementChannel.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return enablementChannel as a String value
    **/
    @JsonProperty("enablementChannel")
    public String getEnablementChannelAsString() {
      return enablementChannel;
    }

    /**
     * Defines the structure of locale specific knowledge information in the skill manifest.
     * @return locales
    **/
    @JsonProperty("locales")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedKnowledgeInformation> getLocales() {
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
        KnowledgeApis v1SkillManifestKnowledgeApis = (KnowledgeApis) o;
        return Objects.equals(this.enablementChannel, v1SkillManifestKnowledgeApis.enablementChannel) &&
            Objects.equals(this.locales, v1SkillManifestKnowledgeApis.locales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enablementChannel, locales);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KnowledgeApis {\n");
        
        sb.append("    enablementChannel: ").append(toIndentedString(enablementChannel)).append("\n");
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
        private String enablementChannel;
        private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedKnowledgeInformation> locales;

        private Builder() {}

        @JsonProperty("enablementChannel")
        public Builder withEnablementChannel(String enablementChannel) {
          this.enablementChannel = enablementChannel;
          return this;
        }

        public Builder withEnablementChannel(com.amazon.ask.smapi.model.v1.skill.Manifest.KnowledgeApisEnablementChannel enablementChannel) {
            this.enablementChannel = enablementChannel != null ? enablementChannel.toString() : null;
            return this;
        }


        @JsonProperty("locales")

        public Builder withLocales(Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedKnowledgeInformation> locales) {
            this.locales = locales;
            return this;
        }

        public Builder putLocalesItem(String key, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedKnowledgeInformation localesItem) {
            if (this.locales == null) {
                this.locales = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedKnowledgeInformation>();
            }
            this.locales.put(key, localesItem);
            return this;
        }

        public KnowledgeApis build() {
            return new KnowledgeApis(this);
        }
    }
}

