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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.version;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * List of interactionModel versions of a skill for the vendor
 */

@JsonDeserialize(builder = ListResponse.Builder.class)
public final class ListResponse {

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.Links links = null;

    @JsonProperty("skillModelVersions")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.VersionItems> skillModelVersions = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.VersionItems>();

    @JsonProperty("isTruncated")
    private Boolean isTruncated = null;

    @JsonProperty("nextToken")
    private String nextToken = null;

    public static Builder builder() {
        return new Builder();
    }

    private ListResponse(Builder builder) {
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.skillModelVersions != null) {
            this.skillModelVersions = builder.skillModelVersions;
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
     * List of interaction model versions. 
     * @return skillModelVersions
    **/
    @JsonProperty("skillModelVersions")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.VersionItems> getSkillModelVersions() {
        return skillModelVersions;
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
        ListResponse v1SkillInteractionModelVersionListResponse = (ListResponse) o;
        return Objects.equals(this.links, v1SkillInteractionModelVersionListResponse.links) &&
            Objects.equals(this.skillModelVersions, v1SkillInteractionModelVersionListResponse.skillModelVersions) &&
            Objects.equals(this.isTruncated, v1SkillInteractionModelVersionListResponse.isTruncated) &&
            Objects.equals(this.nextToken, v1SkillInteractionModelVersionListResponse.nextToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, skillModelVersions, isTruncated, nextToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResponse {\n");
        
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    skillModelVersions: ").append(toIndentedString(skillModelVersions)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.VersionItems> skillModelVersions;
        private Boolean isTruncated;
        private String nextToken;

        private Builder() {}

        @JsonProperty("_links")
        public Builder withLinks(com.amazon.ask.smapi.model.v1.Links links) {
            this.links = links;
            return this;
        }


        @JsonProperty("skillModelVersions")
        public Builder withSkillModelVersions(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.VersionItems> skillModelVersions) {
            this.skillModelVersions = skillModelVersions;
            return this;
        }

        public Builder addSkillModelVersionsItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.version.VersionItems skillModelVersionsItem) {
            if (this.skillModelVersions == null) {
                this.skillModelVersions = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.VersionItems>();
            }
            this.skillModelVersions.add(skillModelVersionsItem);
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


        public ListResponse build() {
            return new ListResponse(this);
        }
    }
}

