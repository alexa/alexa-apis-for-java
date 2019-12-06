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
 * Information about the skills.
 */

@JsonDeserialize(builder = SkillSummary.Builder.class)
public final class SkillSummary {

    @JsonProperty("skillId")
    private String skillId = null;

    @JsonProperty("apis")
    private List<com.amazon.ask.smapi.model.v1.skill.SkillSummaryApis> apis = new ArrayList<com.amazon.ask.smapi.model.v1.skill.SkillSummaryApis>();

    public static Builder builder() {
        return new Builder();
    }

    private SkillSummary(Builder builder) {
        if (builder.skillId != null) {
            this.skillId = builder.skillId;
        }
        if (builder.apis != null) {
            this.apis = builder.apis;
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
     * List of APIs currently implemented by the skill.
     * @return apis
    **/
    @JsonProperty("apis")
    public List<com.amazon.ask.smapi.model.v1.skill.SkillSummaryApis> getApis() {
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
        SkillSummary v1SkillSkillSummary = (SkillSummary) o;
        return Objects.equals(this.skillId, v1SkillSkillSummary.skillId) &&
            Objects.equals(this.apis, v1SkillSkillSummary.apis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillId, apis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillSummary {\n");
        
        sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
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
        private String skillId;
        private List<com.amazon.ask.smapi.model.v1.skill.SkillSummaryApis> apis;

        private Builder() {}

        @JsonProperty("skillId")
        public Builder withSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }


        @JsonProperty("apis")
        public Builder withApis(List<com.amazon.ask.smapi.model.v1.skill.SkillSummaryApis> apis) {
            this.apis = apis;
            return this;
        }

        public Builder addApisItem(com.amazon.ask.smapi.model.v1.skill.SkillSummaryApis apisItem) {
            if (this.apis == null) {
                this.apis = new ArrayList<com.amazon.ask.smapi.model.v1.skill.SkillSummaryApis>();
            }
            this.apis.add(apisItem);
            return this;
        }

        public SkillSummary build() {
            return new SkillSummary(this);
        }
    }
}

