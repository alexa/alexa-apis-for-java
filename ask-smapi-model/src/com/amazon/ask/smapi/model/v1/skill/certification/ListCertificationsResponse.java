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


package com.amazon.ask.smapi.model.v1.skill.certification;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * List of certification summary for a skill.
 */

@JsonDeserialize(builder = ListCertificationsResponse.Builder.class)
public final class ListCertificationsResponse {

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.Links links = null;

    @JsonProperty("isTruncated")
    private Boolean isTruncated = null;

    @JsonProperty("nextToken")
    private String nextToken = null;

    @JsonProperty("totalCount")
    private Integer totalCount = null;

    @JsonProperty("items")
    private List<com.amazon.ask.smapi.model.v1.skill.certification.CertificationSummary> items = new ArrayList<com.amazon.ask.smapi.model.v1.skill.certification.CertificationSummary>();

    private ListCertificationsResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ListCertificationsResponse(Builder builder) {
        if (builder.links != null) {
            this.links = builder.links;
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
        if (builder.items != null) {
            this.items = builder.items;
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
     * boolean value for if the response is truncated. isTruncated = true if more than the assigned maxResults parameter value certification items are available for the skill. The results are then paginated and the remaining results can be retrieved in a similar paginated manner by using 'next' link in the _links or using the nextToken in a following request. 
     * @return isTruncated
    **/
    @JsonProperty("isTruncated")
    public Boolean getIsTruncated() {
        return isTruncated;
    }


    /**
     * Encrypted token present when isTruncated is true.
     * @return nextToken
    **/
    @JsonProperty("nextToken")
    public String getNextToken() {
        return nextToken;
    }


    /**
     * Total number of certification results available for the skill.
     * @return totalCount
    **/
    @JsonProperty("totalCount")
    public Integer getTotalCount() {
        return totalCount;
    }


    /**
     * List of certifications available for a skill. The list of certifications is sorted in a default descending sort order on id field. 
     * @return items
    **/
    @JsonProperty("items")
    public List<com.amazon.ask.smapi.model.v1.skill.certification.CertificationSummary> getItems() {
        return items;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCertificationsResponse v1SkillCertificationListCertificationsResponse = (ListCertificationsResponse) o;
        return Objects.equals(this.links, v1SkillCertificationListCertificationsResponse.links) &&
            Objects.equals(this.isTruncated, v1SkillCertificationListCertificationsResponse.isTruncated) &&
            Objects.equals(this.nextToken, v1SkillCertificationListCertificationsResponse.nextToken) &&
            Objects.equals(this.totalCount, v1SkillCertificationListCertificationsResponse.totalCount) &&
            Objects.equals(this.items, v1SkillCertificationListCertificationsResponse.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, isTruncated, nextToken, totalCount, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertificationsResponse {\n");
        
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
        private Boolean isTruncated;
        private String nextToken;
        private Integer totalCount;
        private List<com.amazon.ask.smapi.model.v1.skill.certification.CertificationSummary> items;

        private Builder() {}

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


        @JsonProperty("totalCount")

        public Builder withTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        @JsonProperty("items")

        public Builder withItems(List<com.amazon.ask.smapi.model.v1.skill.certification.CertificationSummary> items) {
            this.items = items;
            return this;
        }

        public Builder addItemsItem(com.amazon.ask.smapi.model.v1.skill.certification.CertificationSummary itemsItem) {
            if (this.items == null) {
                this.items = new ArrayList<com.amazon.ask.smapi.model.v1.skill.certification.CertificationSummary>();
            }
            this.items.add(itemsItem);
            return this;
        }

        public ListCertificationsResponse build() {
            return new ListCertificationsResponse(this);
        }
    }
}

