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
 * List of catalog versions of a catalog for the vendor in sortDirection order, descending as default.
 */

@JsonDeserialize(builder = ListCatalogEntityVersionsResponse.Builder.class)
public final class ListCatalogEntityVersionsResponse {

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.version.Links links = null;

    @JsonProperty("catalogVersions")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogEntityVersion> catalogVersions = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogEntityVersion>();

    @JsonProperty("isTruncated")
    private Boolean isTruncated = null;

    @JsonProperty("nextToken")
    private String nextToken = null;

    @JsonProperty("totalCount")
    private Integer totalCount = null;

    private ListCatalogEntityVersionsResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ListCatalogEntityVersionsResponse(Builder builder) {
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.catalogVersions != null) {
            this.catalogVersions = builder.catalogVersions;
        }
        if (builder.isTruncated != null) {
            this.isTruncated = builder.isTruncated;
        }
        if (builder.nextToken != null) {
            this.nextToken = builder.nextToken;
        }
        if (builder.totalCount != null) {
            this.totalCount = builder.totalCount;
        }
    }

    /**
     * Get links
     * @return links
    **/
    @JsonProperty("_links")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.version.Links getLinks() {
        return links;
    }


    /**
     * List of catalog entity versions. 
     * @return catalogVersions
    **/
    @JsonProperty("catalogVersions")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogEntityVersion> getCatalogVersions() {
        return catalogVersions;
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


    /**
     * Get totalCount
     * @return totalCount
    **/
    @JsonProperty("totalCount")
    public Integer getTotalCount() {
        return totalCount;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCatalogEntityVersionsResponse v1SkillInteractionModelVersionListCatalogEntityVersionsResponse = (ListCatalogEntityVersionsResponse) o;
        return Objects.equals(this.links, v1SkillInteractionModelVersionListCatalogEntityVersionsResponse.links) &&
            Objects.equals(this.catalogVersions, v1SkillInteractionModelVersionListCatalogEntityVersionsResponse.catalogVersions) &&
            Objects.equals(this.isTruncated, v1SkillInteractionModelVersionListCatalogEntityVersionsResponse.isTruncated) &&
            Objects.equals(this.nextToken, v1SkillInteractionModelVersionListCatalogEntityVersionsResponse.nextToken) &&
            Objects.equals(this.totalCount, v1SkillInteractionModelVersionListCatalogEntityVersionsResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, catalogVersions, isTruncated, nextToken, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCatalogEntityVersionsResponse {\n");
        
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    catalogVersions: ").append(toIndentedString(catalogVersions)).append("\n");
        sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.version.Links links;
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogEntityVersion> catalogVersions;
        private Boolean isTruncated;
        private String nextToken;
        private Integer totalCount;

        private Builder() {}

        @JsonProperty("_links")

        public Builder withLinks(com.amazon.ask.smapi.model.v1.skill.interactionModel.version.Links links) {
            this.links = links;
            return this;
        }


        @JsonProperty("catalogVersions")

        public Builder withCatalogVersions(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogEntityVersion> catalogVersions) {
            this.catalogVersions = catalogVersions;
            return this;
        }

        public Builder addCatalogVersionsItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogEntityVersion catalogVersionsItem) {
            if (this.catalogVersions == null) {
                this.catalogVersions = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogEntityVersion>();
            }
            this.catalogVersions.add(catalogVersionsItem);
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


        @JsonProperty("totalCount")

        public Builder withTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        public ListCatalogEntityVersionsResponse build() {
            return new ListCatalogEntityVersionsResponse(this);
        }
    }
}

