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
 * List of catalog values.
 */

@JsonDeserialize(builder = CatalogValues.Builder.class)
public final class CatalogValues {

    @JsonProperty("isTruncated")
    private Boolean isTruncated = null;

    @JsonProperty("nextToken")
    private String nextToken = null;

    @JsonProperty("totalCount")
    private Integer totalCount = null;

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.Links links = null;

    @JsonProperty("values")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ValueSchema> values = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ValueSchema>();

    private CatalogValues() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private CatalogValues(Builder builder) {
        if (builder.isTruncated != null) {
            this.isTruncated = builder.isTruncated;
        }
        if (builder.nextToken != null) {
            this.nextToken = builder.nextToken;
        }
        if (builder.totalCount != null) {
            this.totalCount = builder.totalCount;
        }
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.values != null) {
            this.values = builder.values;
        }
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
     * Total number of catalog values.
     * @return totalCount
    **/
    @JsonProperty("totalCount")
    public Integer getTotalCount() {
        return totalCount;
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
     * Get values
     * @return values
    **/
    @JsonProperty("values")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ValueSchema> getValues() {
        return values;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogValues v1SkillInteractionModelVersionCatalogValues = (CatalogValues) o;
        return Objects.equals(this.isTruncated, v1SkillInteractionModelVersionCatalogValues.isTruncated) &&
            Objects.equals(this.nextToken, v1SkillInteractionModelVersionCatalogValues.nextToken) &&
            Objects.equals(this.totalCount, v1SkillInteractionModelVersionCatalogValues.totalCount) &&
            Objects.equals(this.links, v1SkillInteractionModelVersionCatalogValues.links) &&
            Objects.equals(this.values, v1SkillInteractionModelVersionCatalogValues.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isTruncated, nextToken, totalCount, links, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogValues {\n");
        
        sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
        private Boolean isTruncated;
        private String nextToken;
        private Integer totalCount;
        private com.amazon.ask.smapi.model.v1.Links links;
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ValueSchema> values;

        private Builder() {}

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


        @JsonProperty("_links")

        public Builder withLinks(com.amazon.ask.smapi.model.v1.Links links) {
            this.links = links;
            return this;
        }


        @JsonProperty("values")

        public Builder withValues(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ValueSchema> values) {
            this.values = values;
            return this;
        }

        public Builder addValuesItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ValueSchema valuesItem) {
            if (this.values == null) {
                this.values = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ValueSchema>();
            }
            this.values.add(valuesItem);
            return this;
        }

        public CatalogValues build() {
            return new CatalogValues(this);
        }
    }
}

