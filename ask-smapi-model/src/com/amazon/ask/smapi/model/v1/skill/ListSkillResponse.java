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
 * List of skills for the vendor.
 */

@JsonDeserialize(builder = ListSkillResponse.Builder.class)
public final class ListSkillResponse {

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.Links links = null;

    @JsonProperty("skills")
    private List<com.amazon.ask.smapi.model.v1.skill.SkillSummary> skills = new ArrayList<com.amazon.ask.smapi.model.v1.skill.SkillSummary>();

    @JsonProperty("isTruncated")
    private Boolean isTruncated = null;

    @JsonProperty("nextToken")
    private String nextToken = null;

    public static Builder builder() {
        return new Builder();
    }

    private ListSkillResponse(Builder builder) {
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.skills != null) {
            this.skills = builder.skills;
        }
        if (builder.isTruncated != null) {
            this.isTruncated = builder.isTruncated;
        }
        if (builder.nextToken != null) {
            this.nextToken = builder.nextToken;
        }
    }

    /**
     * Get links
     * @return links
    **/
    @JsonProperty("_links")
    public com.amazon.ask.smapi.model.v1.Links getLinks() {
        return links;
    }


    /**
     * List of skill summaries. List might contain either one, two or three entries for a given skillId depending on the skill's publication history and the publication method. `Skill containing certified stage` * If a skill was never published to live, this list will contain two entries `:` one with stage 'development' and another with stage 'certified'. Both of these summaries will have same skillId. * For any skill that has been published to 'live', this list will contain three entries `:` one with stage 'development', one with stage `certified` and one with stage 'live'. All of these summaries will have same skillId. `Skill without certified stage` * If a skill was never published to live, this list will contain only one entry for the skill with stage as 'development'. * For any skill that has been published to 'live', this list will contain two entries `:` one with stage 'development' and another with stage 'live'. Both of these summaries will have same skillId. 
     * @return skills
    **/
    @JsonProperty("skills")
    public List<com.amazon.ask.smapi.model.v1.skill.SkillSummary> getSkills() {
        return skills;
    }


    /**
     * Get isTruncated
     * @return isTruncated
    **/
    @JsonProperty("isTruncated")
    public Boolean getIsTruncated() {
        return isTruncated;
    }


    /**
     * Get nextToken
     * @return nextToken
    **/
    @JsonProperty("nextToken")
    public String getNextToken() {
        return nextToken;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSkillResponse v1SkillListSkillResponse = (ListSkillResponse) o;
        return Objects.equals(this.links, v1SkillListSkillResponse.links) &&
            Objects.equals(this.skills, v1SkillListSkillResponse.skills) &&
            Objects.equals(this.isTruncated, v1SkillListSkillResponse.isTruncated) &&
            Objects.equals(this.nextToken, v1SkillListSkillResponse.nextToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, skills, isTruncated, nextToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSkillResponse {\n");
        
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
        sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.Links links;
        private List<com.amazon.ask.smapi.model.v1.skill.SkillSummary> skills;
        private Boolean isTruncated;
        private String nextToken;

        private Builder() {}

        @JsonProperty("_links")

        public Builder withLinks(com.amazon.ask.smapi.model.v1.Links links) {
            this.links = links;
            return this;
        }


        @JsonProperty("skills")

        public Builder withSkills(List<com.amazon.ask.smapi.model.v1.skill.SkillSummary> skills) {
            this.skills = skills;
            return this;
        }

        public Builder addSkillsItem(com.amazon.ask.smapi.model.v1.skill.SkillSummary skillsItem) {
            if (this.skills == null) {
                this.skills = new ArrayList<com.amazon.ask.smapi.model.v1.skill.SkillSummary>();
            }
            this.skills.add(skillsItem);
            return this;
        }

        @JsonProperty("isTruncated")

        public Builder withIsTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }


        @JsonProperty("nextToken")

        public Builder withNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }


        public ListSkillResponse build() {
            return new ListSkillResponse(this);
        }
    }
}

