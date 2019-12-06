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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the structure for skill status response.
 */

@JsonDeserialize(builder = SkillStatus.Builder.class)
public final class SkillStatus {

    @JsonProperty("manifest")
    private com.amazon.ask.smapi.model.v1.skill.ResourceStatus manifest = null;

    @JsonProperty("interactionModel")
    private com.amazon.ask.smapi.model.v1.skill.SkillInteractionModel interactionModel = null;

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
    }

    /**
     * Get manifest
     * @return manifest
    **/
    @JsonProperty("manifest")
    public com.amazon.ask.smapi.model.v1.skill.ResourceStatus getManifest() {
        return manifest;
    }

    /**
     * Get interactionModel
     * @return interactionModel
    **/
    @JsonProperty("interactionModel")
    public com.amazon.ask.smapi.model.v1.skill.SkillInteractionModel getInteractionModel() {
        return interactionModel;
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
            Objects.equals(this.interactionModel, v1SkillSkillStatus.interactionModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manifest, interactionModel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillStatus {\n");
        
        sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
        sb.append("    interactionModel: ").append(toIndentedString(interactionModel)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.ResourceStatus manifest;
        private com.amazon.ask.smapi.model.v1.skill.SkillInteractionModel interactionModel;

        private Builder() {}

        @JsonProperty("manifest")
        public Builder withManifest(com.amazon.ask.smapi.model.v1.skill.ResourceStatus manifest) {
            this.manifest = manifest;
            return this;
        }


        @JsonProperty("interactionModel")
        public Builder withInteractionModel(com.amazon.ask.smapi.model.v1.skill.SkillInteractionModel interactionModel) {
            this.interactionModel = interactionModel;
            return this;
        }


        public SkillStatus build() {
            return new SkillStatus(this);
        }
    }
}

