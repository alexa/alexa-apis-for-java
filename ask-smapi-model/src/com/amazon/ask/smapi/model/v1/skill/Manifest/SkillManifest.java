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

    @JsonProperty("authorizedClients")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.AuthorizedClient> authorizedClients = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.AuthorizedClient>();

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
        if (builder.authorizedClients != null) {
            this.authorizedClients = builder.authorizedClients;
        }
        if (builder.apis != null) {
            this.apis = builder.apis;
        }
    }

    /**
     * Get manifestVersion
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getManifestVersionAsString().
     *
     * @return manifestVersion
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Manifest.ManifestVersion getManifestVersion() {
        return com.amazon.ask.smapi.model.v1.skill.Manifest.ManifestVersion.fromValue(manifestVersion);
    }

    /**
     * Get the underlying String value for manifestVersion.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return manifestVersion as a String value
    **/
    @JsonProperty("manifestVersion")
    public String getManifestVersionAsString() {
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
     * Defines a list of clients authorized for a skill.
     * @return authorizedClients
    **/
    @JsonProperty("authorizedClients")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.AuthorizedClient> getAuthorizedClients() {
        return authorizedClients;
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
            Objects.equals(this.authorizedClients, v1SkillManifestSkillManifest.authorizedClients) &&
            Objects.equals(this.apis, v1SkillManifestSkillManifest.apis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manifestVersion, publishingInformation, privacyAndCompliance, events, permissions, authorizedClients, apis);
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
        sb.append("    authorizedClients: ").append(toIndentedString(authorizedClients)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.AuthorizedClient> authorizedClients;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestApis apis;

        private Builder() {}

        @JsonProperty("manifestVersion")

        public Builder withManifestVersion(String manifestVersion) {
          this.manifestVersion = manifestVersion;
          return this;
        }

        public Builder withManifestVersion(com.amazon.ask.smapi.model.v1.skill.Manifest.ManifestVersion manifestVersion) {
            this.manifestVersion = manifestVersion != null ? manifestVersion.toString() : null;
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

        @JsonProperty("authorizedClients")

        public Builder withAuthorizedClients(List<com.amazon.ask.smapi.model.v1.skill.Manifest.AuthorizedClient> authorizedClients) {
            this.authorizedClients = authorizedClients;
            return this;
        }

        public Builder addAuthorizedClientsItem(com.amazon.ask.smapi.model.v1.skill.Manifest.AuthorizedClient authorizedClientsItem) {
            if (this.authorizedClients == null) {
                this.authorizedClients = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.AuthorizedClient>();
            }
            this.authorizedClients.add(authorizedClientsItem);
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

