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
 * Defines the structure for privacy &amp;amp; compliance information in the skill manifest.
 */

@JsonDeserialize(builder = SkillManifestPrivacyAndCompliance.Builder.class)
public final class SkillManifestPrivacyAndCompliance {

    @JsonProperty("locales")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestLocalizedPrivacyAndCompliance> locales = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestLocalizedPrivacyAndCompliance>();

    @JsonProperty("allowsPurchases")
    private Boolean allowsPurchases = null;

    @JsonProperty("usesPersonalInfo")
    private Boolean usesPersonalInfo = null;

    @JsonProperty("isChildDirected")
    private Boolean isChildDirected = null;

    @JsonProperty("isExportCompliant")
    private Boolean isExportCompliant = null;

    @JsonProperty("containsAds")
    private Boolean containsAds = null;

    @JsonProperty("usesHealthInfo")
    private Boolean usesHealthInfo = null;

    public static Builder builder() {
        return new Builder();
    }

    private SkillManifestPrivacyAndCompliance(Builder builder) {
        if (builder.locales != null) {
            this.locales = builder.locales;
        }
        if (builder.allowsPurchases != null) {
            this.allowsPurchases = builder.allowsPurchases;
        }
        if (builder.usesPersonalInfo != null) {
            this.usesPersonalInfo = builder.usesPersonalInfo;
        }
        if (builder.isChildDirected != null) {
            this.isChildDirected = builder.isChildDirected;
        }
        if (builder.isExportCompliant != null) {
            this.isExportCompliant = builder.isExportCompliant;
        }
        if (builder.containsAds != null) {
            this.containsAds = builder.containsAds;
        }
        if (builder.usesHealthInfo != null) {
            this.usesHealthInfo = builder.usesHealthInfo;
        }
    }

    /**
     * Defines the structure for locale specific privacy &amp; compliance information in the skill manifest.
     * @return locales
    **/
    @JsonProperty("locales")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestLocalizedPrivacyAndCompliance> getLocales() {
        return locales;
    }


    /**
     * True if the skill allows users to make purchases or spend real money false otherwise.
     * @return allowsPurchases
    **/
    @JsonProperty("allowsPurchases")
    public Boolean getAllowsPurchases() {
        return allowsPurchases;
    }


    /**
     * True if the skill collects users' personal information false otherwise.
     * @return usesPersonalInfo
    **/
    @JsonProperty("usesPersonalInfo")
    public Boolean getUsesPersonalInfo() {
        return usesPersonalInfo;
    }


    /**
     * True if the skill is directed to or targets children under the age of 13/16 false otherwise.
     * @return isChildDirected
    **/
    @JsonProperty("isChildDirected")
    public Boolean getIsChildDirected() {
        return isChildDirected;
    }


    /**
     * True if it is certified that the skill may be imported to and exported from the United States and all other countries and regions in which Amazon operate its program or in which skill owner have authorized sales to end users (without the need for Amazon to obtain any license or clearance or take any other action) and is in full compliance with all applicable laws and regulations governing imports and export including those applicable to software that makes use of encryption technology.
     * @return isExportCompliant
    **/
    @JsonProperty("isExportCompliant")
    public Boolean getIsExportCompliant() {
        return isExportCompliant;
    }


    /**
     * True if the skill contains advertising false otherwise.
     * @return containsAds
    **/
    @JsonProperty("containsAds")
    public Boolean getContainsAds() {
        return containsAds;
    }


    /**
     * True if the skill developer is a Covered Entity (CE) or Business Associate (BA) as defined by the Health Insurance Portability And Accountability Act (HIPAA) and the skill requires Amazon to process PHI on their behalf, false otherwise. This is an optional property and treated as false if not set.
     * @return usesHealthInfo
    **/
    @JsonProperty("usesHealthInfo")
    public Boolean getUsesHealthInfo() {
        return usesHealthInfo;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillManifestPrivacyAndCompliance v1SkillManifestSkillManifestPrivacyAndCompliance = (SkillManifestPrivacyAndCompliance) o;
        return Objects.equals(this.locales, v1SkillManifestSkillManifestPrivacyAndCompliance.locales) &&
            Objects.equals(this.allowsPurchases, v1SkillManifestSkillManifestPrivacyAndCompliance.allowsPurchases) &&
            Objects.equals(this.usesPersonalInfo, v1SkillManifestSkillManifestPrivacyAndCompliance.usesPersonalInfo) &&
            Objects.equals(this.isChildDirected, v1SkillManifestSkillManifestPrivacyAndCompliance.isChildDirected) &&
            Objects.equals(this.isExportCompliant, v1SkillManifestSkillManifestPrivacyAndCompliance.isExportCompliant) &&
            Objects.equals(this.containsAds, v1SkillManifestSkillManifestPrivacyAndCompliance.containsAds) &&
            Objects.equals(this.usesHealthInfo, v1SkillManifestSkillManifestPrivacyAndCompliance.usesHealthInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locales, allowsPurchases, usesPersonalInfo, isChildDirected, isExportCompliant, containsAds, usesHealthInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillManifestPrivacyAndCompliance {\n");
        
        sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
        sb.append("    allowsPurchases: ").append(toIndentedString(allowsPurchases)).append("\n");
        sb.append("    usesPersonalInfo: ").append(toIndentedString(usesPersonalInfo)).append("\n");
        sb.append("    isChildDirected: ").append(toIndentedString(isChildDirected)).append("\n");
        sb.append("    isExportCompliant: ").append(toIndentedString(isExportCompliant)).append("\n");
        sb.append("    containsAds: ").append(toIndentedString(containsAds)).append("\n");
        sb.append("    usesHealthInfo: ").append(toIndentedString(usesHealthInfo)).append("\n");
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
        private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestLocalizedPrivacyAndCompliance> locales;
        private Boolean allowsPurchases;
        private Boolean usesPersonalInfo;
        private Boolean isChildDirected;
        private Boolean isExportCompliant;
        private Boolean containsAds;
        private Boolean usesHealthInfo;

        private Builder() {}

        @JsonProperty("locales")

        public Builder withLocales(Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestLocalizedPrivacyAndCompliance> locales) {
            this.locales = locales;
            return this;
        }

        public Builder putLocalesItem(String key, com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestLocalizedPrivacyAndCompliance localesItem) {
            if (this.locales == null) {
                this.locales = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestLocalizedPrivacyAndCompliance>();
            }
            this.locales.put(key, localesItem);
            return this;
        }

        @JsonProperty("allowsPurchases")

        public Builder withAllowsPurchases(Boolean allowsPurchases) {
            this.allowsPurchases = allowsPurchases;
            return this;
        }


        @JsonProperty("usesPersonalInfo")

        public Builder withUsesPersonalInfo(Boolean usesPersonalInfo) {
            this.usesPersonalInfo = usesPersonalInfo;
            return this;
        }


        @JsonProperty("isChildDirected")

        public Builder withIsChildDirected(Boolean isChildDirected) {
            this.isChildDirected = isChildDirected;
            return this;
        }


        @JsonProperty("isExportCompliant")

        public Builder withIsExportCompliant(Boolean isExportCompliant) {
            this.isExportCompliant = isExportCompliant;
            return this;
        }


        @JsonProperty("containsAds")

        public Builder withContainsAds(Boolean containsAds) {
            this.containsAds = containsAds;
            return this;
        }


        @JsonProperty("usesHealthInfo")

        public Builder withUsesHealthInfo(Boolean usesHealthInfo) {
            this.usesHealthInfo = usesHealthInfo;
            return this;
        }


        public SkillManifestPrivacyAndCompliance build() {
            return new SkillManifestPrivacyAndCompliance(this);
        }
    }
}

