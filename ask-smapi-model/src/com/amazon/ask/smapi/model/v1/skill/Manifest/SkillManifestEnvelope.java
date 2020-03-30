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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SkillManifestEnvelope
 */

@JsonDeserialize(builder = SkillManifestEnvelope.Builder.class)
public final class SkillManifestEnvelope {

    @JsonProperty("manifest")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifest manifest = null;

    public static Builder builder() {
        return new Builder();
    }

    private SkillManifestEnvelope(Builder builder) {
        if (builder.manifest != null) {
            this.manifest = builder.manifest;
        }
    }

    /**
     * Get manifest
     * @return manifest
    **/
    @JsonProperty("manifest")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifest getManifest() {
        return manifest;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillManifestEnvelope v1SkillManifestSkillManifestEnvelope = (SkillManifestEnvelope) o;
        return Objects.equals(this.manifest, v1SkillManifestSkillManifestEnvelope.manifest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manifest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillManifestEnvelope {\n");
        
        sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifest manifest;

        private Builder() {}

        @JsonProperty("manifest")

        public Builder withManifest(com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifest manifest) {
            this.manifest = manifest;
            return this;
        }


        public SkillManifestEnvelope build() {
            return new SkillManifestEnvelope(this);
        }
    }
}

