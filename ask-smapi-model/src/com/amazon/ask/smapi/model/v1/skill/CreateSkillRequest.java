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
 * CreateSkillRequest
 */

@JsonDeserialize(builder = CreateSkillRequest.Builder.class)
public final class CreateSkillRequest {

    @JsonProperty("vendorId")
    private String vendorId = null;

    @JsonProperty("manifest")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifest manifest = null;

    public static Builder builder() {
        return new Builder();
    }

    private CreateSkillRequest(Builder builder) {
        if (builder.vendorId != null) {
            this.vendorId = builder.vendorId;
        }
        if (builder.manifest != null) {
            this.manifest = builder.manifest;
        }
    }

    /**
     * ID of the vendor owning the skill.
     * @return vendorId
    **/
    @JsonProperty("vendorId")
    public String getVendorId() {
        return vendorId;
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
        CreateSkillRequest v1SkillCreateSkillRequest = (CreateSkillRequest) o;
        return Objects.equals(this.vendorId, v1SkillCreateSkillRequest.vendorId) &&
            Objects.equals(this.manifest, v1SkillCreateSkillRequest.manifest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorId, manifest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSkillRequest {\n");
        
        sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
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
        private String vendorId;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifest manifest;

        private Builder() {}

        @JsonProperty("vendorId")

        public Builder withVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }


        @JsonProperty("manifest")

        public Builder withManifest(com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifest manifest) {
            this.manifest = manifest;
            return this;
        }


        public CreateSkillRequest build() {
            return new CreateSkillRequest(this);
        }
    }
}

