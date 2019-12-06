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
 * Defines the structure for a skill&#39;s metadata.
 */

@JsonDeserialize(builder = SkillManifest.Builder.class)
public final class SkillManifest {

    @JsonProperty("manifestVersion")
    private String manifestVersion = null;

    @JsonProperty("publishingInformation")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestPublishingInformation publishingInformation = null;

    @JsonProperty("privacyAndCompliance")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestPrivacyAndCompliance privacyAndCompliance = null;

    @JsonProperty("events")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEvents events = null;

    @JsonProperty("permissions")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.PermissionItems> permissions = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.PermissionItems>();

    @JsonProperty("apis")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestApis apis = null;

    public static Builder builder() {
        return new Builder();
    }

    private SkillManifest(Builder builder) {
        if (builder.manifestVersion != null) {
            this.manifestVersion = builder.manifestVersion;
        }
        if (builder.publishingInformation != null) {
            this.publishingInformation = builder.publishingInformation;
        }
        if (builder.privacyAndCompliance != null) {
            this.privacyAndCompliance = builder.privacyAndCompliance;
        }
        if (builder.events != null) {
            this.events = builder.events;
        }
        if (builder.permissions != null) {
            this.permissions = builder.permissions;
        }
        if (builder.apis != null) {
            this.apis = builder.apis;
        }
    }

    /**
     * Version of the skill manifest.
     * @return manifestVersion
    **/
    @JsonProperty("manifestVersion")
    public String getManifestVersion() {
        return manifestVersion;
    }

    /**
     * Get publishingInformation
     * @return publishingInformation
    **/
    @JsonProperty("publishingInformation")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestPublishingInformation getPublishingInformation() {
        return publishingInformation;
    }

    /**
     * Get privacyAndCompliance
     * @return privacyAndCompliance
    **/
    @JsonProperty("privacyAndCompliance")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestPrivacyAndCompliance getPrivacyAndCompliance() {
        return privacyAndCompliance;
    }

    /**
     * Get events
     * @return events
    **/
    @JsonProperty("events")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEvents getEvents() {
        return events;
    }

    /**
     * Defines the structure for required permissions information in the skill manifest.
     * @return permissions
    **/
    @JsonProperty("permissions")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.PermissionItems> getPermissions() {
        return permissions;
    }

    /**
     * Get apis
     * @return apis
    **/
    @JsonProperty("apis")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestApis getApis() {
        return apis;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillManifest v1SkillManifestSkillManifest = (SkillManifest) o;
        return Objects.equals(this.manifestVersion, v1SkillManifestSkillManifest.manifestVersion) &&
            Objects.equals(this.publishingInformation, v1SkillManifestSkillManifest.publishingInformation) &&
            Objects.equals(this.privacyAndCompliance, v1SkillManifestSkillManifest.privacyAndCompliance) &&
            Objects.equals(this.events, v1SkillManifestSkillManifest.events) &&
            Objects.equals(this.permissions, v1SkillManifestSkillManifest.permissions) &&
            Objects.equals(this.apis, v1SkillManifestSkillManifest.apis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manifestVersion, publishingInformation, privacyAndCompliance, events, permissions, apis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillManifest {\n");
        
        sb.append("    manifestVersion: ").append(toIndentedString(manifestVersion)).append("\n");
        sb.append("    publishingInformation: ").append(toIndentedString(publishingInformation)).append("\n");
        sb.append("    privacyAndCompliance: ").append(toIndentedString(privacyAndCompliance)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    apis: ").append(toIndentedString(apis)).append("\n");
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
        private String manifestVersion;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestPublishingInformation publishingInformation;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestPrivacyAndCompliance privacyAndCompliance;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEvents events;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.PermissionItems> permissions;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestApis apis;

        private Builder() {}

        @JsonProperty("manifestVersion")
        public Builder withManifestVersion(String manifestVersion) {
            this.manifestVersion = manifestVersion;
            return this;
        }


        @JsonProperty("publishingInformation")
        public Builder withPublishingInformation(com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestPublishingInformation publishingInformation) {
            this.publishingInformation = publishingInformation;
            return this;
        }


        @JsonProperty("privacyAndCompliance")
        public Builder withPrivacyAndCompliance(com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestPrivacyAndCompliance privacyAndCompliance) {
            this.privacyAndCompliance = privacyAndCompliance;
            return this;
        }


        @JsonProperty("events")
        public Builder withEvents(com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEvents events) {
            this.events = events;
            return this;
        }


        @JsonProperty("permissions")
        public Builder withPermissions(List<com.amazon.ask.smapi.model.v1.skill.Manifest.PermissionItems> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder addPermissionsItem(com.amazon.ask.smapi.model.v1.skill.Manifest.PermissionItems permissionsItem) {
            if (this.permissions == null) {
                this.permissions = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.PermissionItems>();
            }
            this.permissions.add(permissionsItem);
            return this;
        }

        @JsonProperty("apis")
        public Builder withApis(com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestApis apis) {
            this.apis = apis;
            return this;
        }


        public SkillManifest build() {
            return new SkillManifest(this);
        }
    }
}

