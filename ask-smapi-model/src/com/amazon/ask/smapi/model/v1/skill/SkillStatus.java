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
 * Defines the structure for skill status response.
 */

@JsonDeserialize(builder = SkillStatus.Builder.class)
public final class SkillStatus {

    @JsonProperty("manifest")
    private com.amazon.ask.smapi.model.v1.skill.ManifestStatus manifest = null;

    @JsonProperty("interactionModel")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.SkillInteractionModelStatus> interactionModel = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.SkillInteractionModelStatus>();

    @JsonProperty("hostedSkillDeployment")
    private com.amazon.ask.smapi.model.v1.skill.HostedSkillDeploymentStatus hostedSkillDeployment = null;

    @JsonProperty("hostedSkillProvisioning")
    private com.amazon.ask.smapi.model.v1.skill.HostedSkillProvisioningStatus hostedSkillProvisioning = null;

    public static Builder builder() {
        return new Builder();
    }

    private SkillStatus(Builder builder) {
        if (builder.manifest != null) {
            this.manifest = builder.manifest;
        }
        if (builder.interactionModel != null) {
            this.interactionModel = builder.interactionModel;
        }
        if (builder.hostedSkillDeployment != null) {
            this.hostedSkillDeployment = builder.hostedSkillDeployment;
        }
        if (builder.hostedSkillProvisioning != null) {
            this.hostedSkillProvisioning = builder.hostedSkillProvisioning;
        }
    }

    /**
     * Get manifest
     * @return manifest
    **/
    @JsonProperty("manifest")
    public com.amazon.ask.smapi.model.v1.skill.ManifestStatus getManifest() {
        return manifest;
    }


    /**
     * Status for available interaction models, keyed by locale.
     * @return interactionModel
    **/
    @JsonProperty("interactionModel")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.SkillInteractionModelStatus> getInteractionModel() {
        return interactionModel;
    }


    /**
     * Get hostedSkillDeployment
     * @return hostedSkillDeployment
    **/
    @JsonProperty("hostedSkillDeployment")
    public com.amazon.ask.smapi.model.v1.skill.HostedSkillDeploymentStatus getHostedSkillDeployment() {
        return hostedSkillDeployment;
    }


    /**
     * Get hostedSkillProvisioning
     * @return hostedSkillProvisioning
    **/
    @JsonProperty("hostedSkillProvisioning")
    public com.amazon.ask.smapi.model.v1.skill.HostedSkillProvisioningStatus getHostedSkillProvisioning() {
        return hostedSkillProvisioning;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillStatus v1SkillSkillStatus = (SkillStatus) o;
        return Objects.equals(this.manifest, v1SkillSkillStatus.manifest) &&
            Objects.equals(this.interactionModel, v1SkillSkillStatus.interactionModel) &&
            Objects.equals(this.hostedSkillDeployment, v1SkillSkillStatus.hostedSkillDeployment) &&
            Objects.equals(this.hostedSkillProvisioning, v1SkillSkillStatus.hostedSkillProvisioning);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manifest, interactionModel, hostedSkillDeployment, hostedSkillProvisioning);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillStatus {\n");
        
        sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
        sb.append("    interactionModel: ").append(toIndentedString(interactionModel)).append("\n");
        sb.append("    hostedSkillDeployment: ").append(toIndentedString(hostedSkillDeployment)).append("\n");
        sb.append("    hostedSkillProvisioning: ").append(toIndentedString(hostedSkillProvisioning)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.ManifestStatus manifest;
        private Map<String, com.amazon.ask.smapi.model.v1.skill.SkillInteractionModelStatus> interactionModel;
        private com.amazon.ask.smapi.model.v1.skill.HostedSkillDeploymentStatus hostedSkillDeployment;
        private com.amazon.ask.smapi.model.v1.skill.HostedSkillProvisioningStatus hostedSkillProvisioning;

        private Builder() {}

        @JsonProperty("manifest")

        public Builder withManifest(com.amazon.ask.smapi.model.v1.skill.ManifestStatus manifest) {
            this.manifest = manifest;
            return this;
        }


        @JsonProperty("interactionModel")

        public Builder withInteractionModel(Map<String, com.amazon.ask.smapi.model.v1.skill.SkillInteractionModelStatus> interactionModel) {
            this.interactionModel = interactionModel;
            return this;
        }

        public Builder putInteractionModelItem(String key, com.amazon.ask.smapi.model.v1.skill.SkillInteractionModelStatus interactionModelItem) {
            if (this.interactionModel == null) {
                this.interactionModel = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.SkillInteractionModelStatus>();
            }
            this.interactionModel.put(key, interactionModelItem);
            return this;
        }

        @JsonProperty("hostedSkillDeployment")

        public Builder withHostedSkillDeployment(com.amazon.ask.smapi.model.v1.skill.HostedSkillDeploymentStatus hostedSkillDeployment) {
            this.hostedSkillDeployment = hostedSkillDeployment;
            return this;
        }


        @JsonProperty("hostedSkillProvisioning")

        public Builder withHostedSkillProvisioning(com.amazon.ask.smapi.model.v1.skill.HostedSkillProvisioningStatus hostedSkillProvisioning) {
            this.hostedSkillProvisioning = hostedSkillProvisioning;
            return this;
        }


        public SkillStatus build() {
            return new SkillStatus(this);
        }
    }
}

