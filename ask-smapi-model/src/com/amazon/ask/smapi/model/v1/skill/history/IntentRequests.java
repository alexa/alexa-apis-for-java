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


package com.amazon.ask.smapi.model.v1.skill.history;

import java.util.Objects;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Response to the GET Intent Request History API. It contains the collection of utterances for the skill, nextToken and other metadata related to the search query.
 */

@JsonDeserialize(builder = IntentRequests.Builder.class)
public final class IntentRequests {

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.Links links = null;

    @JsonProperty("nextToken")
    private String nextToken = null;

    @JsonProperty("isTruncated")
    private Boolean isTruncated = null;

    @JsonProperty("totalCount")
    private BigDecimal totalCount = null;

    @JsonProperty("startIndex")
    private BigDecimal startIndex = null;

    @JsonProperty("skillId")
    private String skillId = null;

    @JsonProperty("items")
    private List<com.amazon.ask.smapi.model.v1.skill.history.IntentRequest> items = new ArrayList<com.amazon.ask.smapi.model.v1.skill.history.IntentRequest>();

    public static Builder builder() {
        return new Builder();
    }

    private IntentRequests(Builder builder) {
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.nextToken != null) {
            this.nextToken = builder.nextToken;
        }
        if (builder.isTruncated != null) {
            this.isTruncated = builder.isTruncated;
        }
        if (builder.totalCount != null) {
            this.totalCount = builder.totalCount;
        }
        if (builder.startIndex != null) {
            this.startIndex = builder.startIndex;
        }
        if (builder.skillId != null) {
            this.skillId = builder.skillId;
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
     * This token can be used to load the next page of the result.
     * @return nextToken
    **/
    @JsonProperty("nextToken")
    public String getNextToken() {
        return nextToken;
    }

    /**
     * This property is true when all the results matching the search request haven't been returned, false otherwise.
     * @return isTruncated
    **/
    @JsonProperty("isTruncated")
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * Total number of records that matched the given search query.
     * @return totalCount
    **/
    @JsonProperty("totalCount")
    public BigDecimal getTotalCount() {
        return totalCount;
    }

    /**
     * Position of the current page in the result set.
     * @return startIndex
    **/
    @JsonProperty("startIndex")
    public BigDecimal getStartIndex() {
        return startIndex;
    }

    /**
     * The Skill Id.
     * @return skillId
    **/
    @JsonProperty("skillId")
    public String getSkillId() {
        return skillId;
    }

    /**
     * List of intent requests for the skill
     * @return items
    **/
    @JsonProperty("items")
    public List<com.amazon.ask.smapi.model.v1.skill.history.IntentRequest> getItems() {
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
        IntentRequests v1SkillHistoryIntentRequests = (IntentRequests) o;
        return Objects.equals(this.links, v1SkillHistoryIntentRequests.links) &&
            Objects.equals(this.nextToken, v1SkillHistoryIntentRequests.nextToken) &&
            Objects.equals(this.isTruncated, v1SkillHistoryIntentRequests.isTruncated) &&
            Objects.equals(this.totalCount, v1SkillHistoryIntentRequests.totalCount) &&
            Objects.equals(this.startIndex, v1SkillHistoryIntentRequests.startIndex) &&
            Objects.equals(this.skillId, v1SkillHistoryIntentRequests.skillId) &&
            Objects.equals(this.items, v1SkillHistoryIntentRequests.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, nextToken, isTruncated, totalCount, startIndex, skillId, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntentRequests {\n");
        
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
        sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
        sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
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
        private String nextToken;
        private Boolean isTruncated;
        private BigDecimal totalCount;
        private BigDecimal startIndex;
        private String skillId;
        private List<com.amazon.ask.smapi.model.v1.skill.history.IntentRequest> items;

        private Builder() {}

        @JsonProperty("_links")
        public Builder withLinks(com.amazon.ask.smapi.model.v1.Links links) {
            this.links = links;
            return this;
        }


        @JsonProperty("nextToken")
        public Builder withNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }


        @JsonProperty("isTruncated")
        public Builder withIsTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }


        @JsonProperty("totalCount")
        public Builder withTotalCount(BigDecimal totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        @JsonProperty("startIndex")
        public Builder withStartIndex(BigDecimal startIndex) {
            this.startIndex = startIndex;
            return this;
        }


        @JsonProperty("skillId")
        public Builder withSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }


        @JsonProperty("items")
        public Builder withItems(List<com.amazon.ask.smapi.model.v1.skill.history.IntentRequest> items) {
            this.items = items;
            return this;
        }

        public Builder addItemsItem(com.amazon.ask.smapi.model.v1.skill.history.IntentRequest itemsItem) {
            if (this.items == null) {
                this.items = new ArrayList<com.amazon.ask.smapi.model.v1.skill.history.IntentRequest>();
            }
            this.items.add(itemsItem);
            return this;
        }

        public IntentRequests build() {
            return new IntentRequests(this);
        }
    }
}

