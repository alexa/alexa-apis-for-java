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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Defines the structure of music api in the skill manifest.
 */

@JsonDeserialize(builder = MusicApis.Builder.class)
public final class MusicApis {

    @JsonProperty("regions")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion> regions = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion>();

    @JsonProperty("endpoint")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaEndpoint endpoint = null;

    @JsonProperty("capabilities")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicCapability> capabilities = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicCapability>();

    @JsonProperty("interfaces")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.MusicInterfaces interfaces = null;

    @JsonProperty("locales")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedMusicInfo> locales = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedMusicInfo>();

    @JsonProperty("contentTypes")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicContentType> contentTypes = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicContentType>();

    public static Builder builder() {
        return new Builder();
    }

    private MusicApis(Builder builder) {
        if (builder.regions != null) {
            this.regions = builder.regions;
        }
        if (builder.endpoint != null) {
            this.endpoint = builder.endpoint;
        }
        if (builder.capabilities != null) {
            this.capabilities = builder.capabilities;
        }
        if (builder.interfaces != null) {
            this.interfaces = builder.interfaces;
        }
        if (builder.locales != null) {
            this.locales = builder.locales;
        }
        if (builder.contentTypes != null) {
            this.contentTypes = builder.contentTypes;
        }
    }

    /**
     * Contains an array of the supported &amp;lt;region&amp;gt; Objects.
     * @return regions
    **/
    @JsonProperty("regions")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion> getRegions() {
        return regions;
    }

    /**
     * Get endpoint
     * @return endpoint
    **/
    @JsonProperty("endpoint")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaEndpoint getEndpoint() {
        return endpoint;
    }

    /**
     * Defines the structure of music capabilities information in the skill manifest.
     * @return capabilities
    **/
    @JsonProperty("capabilities")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicCapability> getCapabilities() {
        return capabilities;
    }

    /**
     * Get interfaces
     * @return interfaces
    **/
    @JsonProperty("interfaces")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.MusicInterfaces getInterfaces() {
        return interfaces;
    }

    /**
     * Defines the structure of locale specific music information in the skill manifest.
     * @return locales
    **/
    @JsonProperty("locales")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedMusicInfo> getLocales() {
        return locales;
    }

    /**
     * List of the type of content to be provided by the music skill.
     * @return contentTypes
    **/
    @JsonProperty("contentTypes")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicContentType> getContentTypes() {
        return contentTypes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MusicApis v1SkillManifestMusicApis = (MusicApis) o;
        return Objects.equals(this.regions, v1SkillManifestMusicApis.regions) &&
            Objects.equals(this.endpoint, v1SkillManifestMusicApis.endpoint) &&
            Objects.equals(this.capabilities, v1SkillManifestMusicApis.capabilities) &&
            Objects.equals(this.interfaces, v1SkillManifestMusicApis.interfaces) &&
            Objects.equals(this.locales, v1SkillManifestMusicApis.locales) &&
            Objects.equals(this.contentTypes, v1SkillManifestMusicApis.contentTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regions, endpoint, capabilities, interfaces, locales, contentTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MusicApis {\n");
        
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
        sb.append("    interfaces: ").append(toIndentedString(interfaces)).append("\n");
        sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
        sb.append("    contentTypes: ").append(toIndentedString(contentTypes)).append("\n");
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
        private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion> regions;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaEndpoint endpoint;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicCapability> capabilities;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.MusicInterfaces interfaces;
        private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedMusicInfo> locales;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicContentType> contentTypes;

        private Builder() {}

        @JsonProperty("regions")
        public Builder withRegions(Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion> regions) {
            this.regions = regions;
            return this;
        }

        public Builder putRegionsItem(String key, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion regionsItem) {
            if (this.regions == null) {
                this.regions = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion>();
            }
            this.regions.put(key, regionsItem);
            return this;
        }

        @JsonProperty("endpoint")
        public Builder withEndpoint(com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }


        @JsonProperty("capabilities")
        public Builder withCapabilities(List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicCapability> capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        public Builder addCapabilitiesItem(com.amazon.ask.smapi.model.v1.skill.Manifest.MusicCapability capabilitiesItem) {
            if (this.capabilities == null) {
                this.capabilities = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicCapability>();
            }
            this.capabilities.add(capabilitiesItem);
            return this;
        }

        @JsonProperty("interfaces")
        public Builder withInterfaces(com.amazon.ask.smapi.model.v1.skill.Manifest.MusicInterfaces interfaces) {
            this.interfaces = interfaces;
            return this;
        }


        @JsonProperty("locales")
        public Builder withLocales(Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedMusicInfo> locales) {
            this.locales = locales;
            return this;
        }

        public Builder putLocalesItem(String key, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedMusicInfo localesItem) {
            if (this.locales == null) {
                this.locales = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedMusicInfo>();
            }
            this.locales.put(key, localesItem);
            return this;
        }

        @JsonProperty("contentTypes")
        public Builder withContentTypes(List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicContentType> contentTypes) {
            this.contentTypes = contentTypes;
            return this;
        }

        public Builder addContentTypesItem(com.amazon.ask.smapi.model.v1.skill.Manifest.MusicContentType contentTypesItem) {
            if (this.contentTypes == null) {
                this.contentTypes = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicContentType>();
            }
            this.contentTypes.add(contentTypesItem);
            return this;
        }

        public MusicApis build() {
            return new MusicApis(this);
        }
    }
}

