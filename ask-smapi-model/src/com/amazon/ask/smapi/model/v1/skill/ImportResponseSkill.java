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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * ImportResponseSkill
 */

@JsonDeserialize(builder = ImportResponseSkill.Builder.class)
public final class ImportResponseSkill {

    @JsonProperty("skillId")
    private String skillId = null;

    @JsonProperty("eTag")
    private String eTag = null;

    @JsonProperty("resources")
    private List<com.amazon.ask.smapi.model.v1.skill.ResourceImportStatus> resources = new ArrayList<com.amazon.ask.smapi.model.v1.skill.ResourceImportStatus>();

    private ImportResponseSkill() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ImportResponseSkill(Builder builder) {
        if (builder.skillId != null) {
            this.skillId = builder.skillId;
        }
        if (builder.eTag != null) {
            this.eTag = builder.eTag;
        }
        if (builder.resources != null) {
            this.resources = builder.resources;
        }
    }

    /**
     * Get skillId
     * @return skillId
    **/
    @JsonProperty("skillId")
    public String getSkillId() {
        return skillId;
    }


    /**
     * Get eTag
     * @return eTag
    **/
    @JsonProperty("eTag")
    public String getETag() {
        return eTag;
    }


    /**
     * Get resources
     * @return resources
    **/
    @JsonProperty("resources")
    public List<com.amazon.ask.smapi.model.v1.skill.ResourceImportStatus> getResources() {
        return resources;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportResponseSkill v1SkillImportResponseSkill = (ImportResponseSkill) o;
        return Objects.equals(this.skillId, v1SkillImportResponseSkill.skillId) &&
            Objects.equals(this.eTag, v1SkillImportResponseSkill.eTag) &&
            Objects.equals(this.resources, v1SkillImportResponseSkill.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillId, eTag, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportResponseSkill {\n");
        
        sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
        sb.append("    eTag: ").append(toIndentedString(eTag)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
        private String skillId;
        private String eTag;
        private List<com.amazon.ask.smapi.model.v1.skill.ResourceImportStatus> resources;

        private Builder() {}

        @JsonProperty("skillId")

        public Builder withSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }


        @JsonProperty("eTag")

        public Builder withETag(String eTag) {
            this.eTag = eTag;
            return this;
        }


        @JsonProperty("resources")

        public Builder withResources(List<com.amazon.ask.smapi.model.v1.skill.ResourceImportStatus> resources) {
            this.resources = resources;
            return this;
        }

        public Builder addResourcesItem(com.amazon.ask.smapi.model.v1.skill.ResourceImportStatus resourcesItem) {
            if (this.resources == null) {
                this.resources = new ArrayList<com.amazon.ask.smapi.model.v1.skill.ResourceImportStatus>();
            }
            this.resources.add(resourcesItem);
            return this;
        }

        public ImportResponseSkill build() {
            return new ImportResponseSkill(this);
        }
    }
}

