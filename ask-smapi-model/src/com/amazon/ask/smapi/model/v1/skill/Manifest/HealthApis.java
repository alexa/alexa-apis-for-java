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
 * Defines the structure of health api in the skill manifest.
 */

@JsonDeserialize(builder = HealthApis.Builder.class)
public final class HealthApis {

    @JsonProperty("regions")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.Region> regions = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.Region>();

    @JsonProperty("endpoint")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint endpoint = null;

    @JsonProperty("protocolVersion")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.HealthProtocolVersion protocolVersion = null;

    @JsonProperty("interfaces")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.HealthInterface interfaces = null;

    public static Builder builder() {
        return new Builder();
    }

    private HealthApis(Builder builder) {
        if (builder.regions != null) {
            this.regions = builder.regions;
        }
        if (builder.endpoint != null) {
            this.endpoint = builder.endpoint;
        }
        if (builder.protocolVersion != null) {
            this.protocolVersion = builder.protocolVersion;
        }
        if (builder.interfaces != null) {
            this.interfaces = builder.interfaces;
        }
    }

    /**
     * Contains an array of the supported &amp;lt;region&amp;gt; Objects.
     * @return regions
    **/
    @JsonProperty("regions")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.Region> getRegions() {
        return regions;
    }

    /**
     * Get endpoint
     * @return endpoint
    **/
    @JsonProperty("endpoint")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint getEndpoint() {
        return endpoint;
    }

    /**
     * Get protocolVersion
     * @return protocolVersion
    **/
    @JsonProperty("protocolVersion")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.HealthProtocolVersion getProtocolVersion() {
        return protocolVersion;
    }

    /**
     * Get interfaces
     * @return interfaces
    **/
    @JsonProperty("interfaces")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.HealthInterface getInterfaces() {
        return interfaces;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HealthApis v1SkillManifestHealthApis = (HealthApis) o;
        return Objects.equals(this.regions, v1SkillManifestHealthApis.regions) &&
            Objects.equals(this.endpoint, v1SkillManifestHealthApis.endpoint) &&
            Objects.equals(this.protocolVersion, v1SkillManifestHealthApis.protocolVersion) &&
            Objects.equals(this.interfaces, v1SkillManifestHealthApis.interfaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regions, endpoint, protocolVersion, interfaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthApis {\n");
        
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    protocolVersion: ").append(toIndentedString(protocolVersion)).append("\n");
        sb.append("    interfaces: ").append(toIndentedString(interfaces)).append("\n");
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
        private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.Region> regions;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint endpoint;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.HealthProtocolVersion protocolVersion;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.HealthInterface interfaces;

        private Builder() {}

        @JsonProperty("regions")
        public Builder withRegions(Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.Region> regions) {
            this.regions = regions;
            return this;
        }

        public Builder putRegionsItem(String key, com.amazon.ask.smapi.model.v1.skill.Manifest.Region regionsItem) {
            if (this.regions == null) {
                this.regions = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.Region>();
            }
            this.regions.put(key, regionsItem);
            return this;
        }

        @JsonProperty("endpoint")
        public Builder withEndpoint(com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }


        @JsonProperty("protocolVersion")
        public Builder withProtocolVersion(com.amazon.ask.smapi.model.v1.skill.Manifest.HealthProtocolVersion protocolVersion) {
            this.protocolVersion = protocolVersion;
            return this;
        }


        @JsonProperty("interfaces")
        public Builder withInterfaces(com.amazon.ask.smapi.model.v1.skill.Manifest.HealthInterface interfaces) {
            this.interfaces = interfaces;
            return this;
        }


        public HealthApis build() {
            return new HealthApis(this);
        }
    }
}

