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


package com.amazon.ask.smapi.model.v1.isp;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * In-skill product skill association details.
 */

@JsonDeserialize(builder = AssociatedSkillResponse.Builder.class)
public final class AssociatedSkillResponse {

    @JsonProperty("associatedSkillIds")
    private List<String> associatedSkillIds = new ArrayList<String>();

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.Links links = null;

    @JsonProperty("isTruncated")
    private Boolean isTruncated = null;

    @JsonProperty("nextToken")
    private String nextToken = null;

    public static Builder builder() {
        return new Builder();
    }

    private AssociatedSkillResponse(Builder builder) {
        if (builder.associatedSkillIds != null) {
            this.associatedSkillIds = builder.associatedSkillIds;
        }
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.isTruncated != null) {
            this.isTruncated = builder.isTruncated;
        }
        if (builder.nextToken != null) {
            this.nextToken = builder.nextToken;
        }
    }

    /**
     * List of skill IDs that correspond to the skills associated with the in-skill product. The associations are stage specific. A live association is created through successful skill certification.
     * @return associatedSkillIds
    **/
    @JsonProperty("associatedSkillIds")
    public List<String> getAssociatedSkillIds() {
        return associatedSkillIds;
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
        AssociatedSkillResponse v1IspAssociatedSkillResponse = (AssociatedSkillResponse) o;
        return Objects.equals(this.associatedSkillIds, v1IspAssociatedSkillResponse.associatedSkillIds) &&
            Objects.equals(this.links, v1IspAssociatedSkillResponse.links) &&
            Objects.equals(this.isTruncated, v1IspAssociatedSkillResponse.isTruncated) &&
            Objects.equals(this.nextToken, v1IspAssociatedSkillResponse.nextToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(associatedSkillIds, links, isTruncated, nextToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociatedSkillResponse {\n");
        
        sb.append("    associatedSkillIds: ").append(toIndentedString(associatedSkillIds)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
        private List<String> associatedSkillIds;
        private com.amazon.ask.smapi.model.v1.Links links;
        private Boolean isTruncated;
        private String nextToken;

        private Builder() {}

        @JsonProperty("associatedSkillIds")
        public Builder withAssociatedSkillIds(List<String> associatedSkillIds) {
            this.associatedSkillIds = associatedSkillIds;
            return this;
        }

        public Builder addAssociatedSkillIdsItem(String associatedSkillIdsItem) {
            if (this.associatedSkillIds == null) {
                this.associatedSkillIds = new ArrayList<String>();
            }
            this.associatedSkillIds.add(associatedSkillIdsItem);
            return this;
        }

        @JsonProperty("_links")
        public Builder withLinks(com.amazon.ask.smapi.model.v1.Links links) {
            this.links = links;
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


        public AssociatedSkillResponse build() {
            return new AssociatedSkillResponse(this);
        }
    }
}

