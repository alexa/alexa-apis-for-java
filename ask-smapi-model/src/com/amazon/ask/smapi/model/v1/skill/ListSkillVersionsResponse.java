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
 * List of all skill versions
 */

@JsonDeserialize(builder = ListSkillVersionsResponse.Builder.class)
public final class ListSkillVersionsResponse {

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.Links links = null;

    @JsonProperty("skillVersions")
    private List<com.amazon.ask.smapi.model.v1.skill.SkillVersion> skillVersions = new ArrayList<com.amazon.ask.smapi.model.v1.skill.SkillVersion>();

    @JsonProperty("isTruncated")
    private Boolean isTruncated = null;

    @JsonProperty("nextToken")
    private String nextToken = null;

    public static Builder builder() {
        return new Builder();
    }

    private ListSkillVersionsResponse(Builder builder) {
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.skillVersions != null) {
            this.skillVersions = builder.skillVersions;
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
     * Skill version metadata
     * @return skillVersions
    **/
    @JsonProperty("skillVersions")
    public List<com.amazon.ask.smapi.model.v1.skill.SkillVersion> getSkillVersions() {
        return skillVersions;
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
        ListSkillVersionsResponse v1SkillListSkillVersionsResponse = (ListSkillVersionsResponse) o;
        return Objects.equals(this.links, v1SkillListSkillVersionsResponse.links) &&
            Objects.equals(this.skillVersions, v1SkillListSkillVersionsResponse.skillVersions) &&
            Objects.equals(this.isTruncated, v1SkillListSkillVersionsResponse.isTruncated) &&
            Objects.equals(this.nextToken, v1SkillListSkillVersionsResponse.nextToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, skillVersions, isTruncated, nextToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSkillVersionsResponse {\n");
        
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    skillVersions: ").append(toIndentedString(skillVersions)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.SkillVersion> skillVersions;
        private Boolean isTruncated;
        private String nextToken;

        private Builder() {}

        @JsonProperty("_links")

        public Builder withLinks(com.amazon.ask.smapi.model.v1.Links links) {
            this.links = links;
            return this;
        }


        @JsonProperty("skillVersions")

        public Builder withSkillVersions(List<com.amazon.ask.smapi.model.v1.skill.SkillVersion> skillVersions) {
            this.skillVersions = skillVersions;
            return this;
        }

        public Builder addSkillVersionsItem(com.amazon.ask.smapi.model.v1.skill.SkillVersion skillVersionsItem) {
            if (this.skillVersions == null) {
                this.skillVersions = new ArrayList<com.amazon.ask.smapi.model.v1.skill.SkillVersion>();
            }
            this.skillVersions.add(skillVersionsItem);
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


        public ListSkillVersionsResponse build() {
            return new ListSkillVersionsResponse(this);
        }
    }
}

