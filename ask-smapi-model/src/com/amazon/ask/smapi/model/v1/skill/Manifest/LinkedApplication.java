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
 * Applications associated with the skill.
 */

@JsonDeserialize(builder = LinkedApplication.Builder.class)
public final class LinkedApplication {

    @JsonProperty("catalogInfo")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.CatalogInfo catalogInfo = null;

    @JsonProperty("customSchemes")
    private List<String> customSchemes = new ArrayList<String>();

    @JsonProperty("domains")
    private List<String> domains = new ArrayList<String>();

    @JsonProperty("friendlyName")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.FriendlyName friendlyName = null;

    public static Builder builder() {
        return new Builder();
    }

    private LinkedApplication(Builder builder) {
        if (builder.catalogInfo != null) {
            this.catalogInfo = builder.catalogInfo;
        }
        if (builder.customSchemes != null) {
            this.customSchemes = builder.customSchemes;
        }
        if (builder.domains != null) {
            this.domains = builder.domains;
        }
        if (builder.friendlyName != null) {
            this.friendlyName = builder.friendlyName;
        }
    }

    /**
     * Get catalogInfo
     * @return catalogInfo
    **/
    @JsonProperty("catalogInfo")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.CatalogInfo getCatalogInfo() {
        return catalogInfo;
    }


    /**
     * Supported schemes
     * @return customSchemes
    **/
    @JsonProperty("customSchemes")
    public List<String> getCustomSchemes() {
        return customSchemes;
    }


    /**
     * Supported domains
     * @return domains
    **/
    @JsonProperty("domains")
    public List<String> getDomains() {
        return domains;
    }


    /**
     * Get friendlyName
     * @return friendlyName
    **/
    @JsonProperty("friendlyName")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.FriendlyName getFriendlyName() {
        return friendlyName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinkedApplication v1SkillManifestLinkedApplication = (LinkedApplication) o;
        return Objects.equals(this.catalogInfo, v1SkillManifestLinkedApplication.catalogInfo) &&
            Objects.equals(this.customSchemes, v1SkillManifestLinkedApplication.customSchemes) &&
            Objects.equals(this.domains, v1SkillManifestLinkedApplication.domains) &&
            Objects.equals(this.friendlyName, v1SkillManifestLinkedApplication.friendlyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogInfo, customSchemes, domains, friendlyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkedApplication {\n");
        
        sb.append("    catalogInfo: ").append(toIndentedString(catalogInfo)).append("\n");
        sb.append("    customSchemes: ").append(toIndentedString(customSchemes)).append("\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
        sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.Manifest.CatalogInfo catalogInfo;
        private List<String> customSchemes;
        private List<String> domains;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.FriendlyName friendlyName;

        private Builder() {}

        @JsonProperty("catalogInfo")

        public Builder withCatalogInfo(com.amazon.ask.smapi.model.v1.skill.Manifest.CatalogInfo catalogInfo) {
            this.catalogInfo = catalogInfo;
            return this;
        }


        @JsonProperty("customSchemes")

        public Builder withCustomSchemes(List<String> customSchemes) {
            this.customSchemes = customSchemes;
            return this;
        }

        public Builder addCustomSchemesItem(String customSchemesItem) {
            if (this.customSchemes == null) {
                this.customSchemes = new ArrayList<String>();
            }
            this.customSchemes.add(customSchemesItem);
            return this;
        }

        @JsonProperty("domains")

        public Builder withDomains(List<String> domains) {
            this.domains = domains;
            return this;
        }

        public Builder addDomainsItem(String domainsItem) {
            if (this.domains == null) {
                this.domains = new ArrayList<String>();
            }
            this.domains.add(domainsItem);
            return this;
        }

        @JsonProperty("friendlyName")

        public Builder withFriendlyName(com.amazon.ask.smapi.model.v1.skill.Manifest.FriendlyName friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }


        public LinkedApplication build() {
            return new LinkedApplication(this);
        }
    }
}

