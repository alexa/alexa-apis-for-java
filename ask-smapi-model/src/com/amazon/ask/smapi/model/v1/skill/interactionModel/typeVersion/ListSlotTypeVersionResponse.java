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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * List of slot type versions of a skill for the vendor.
 */

@JsonDeserialize(builder = ListSlotTypeVersionResponse.Builder.class)
public final class ListSlotTypeVersionResponse {

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.Links links = null;

    @JsonProperty("slotTypeVersions")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.SlotTypeVersionItem> slotTypeVersions = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.SlotTypeVersionItem>();

    @JsonProperty("nextToken")
    private String nextToken = null;

    public static Builder builder() {
        return new Builder();
    }

    private ListSlotTypeVersionResponse(Builder builder) {
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.slotTypeVersions != null) {
            this.slotTypeVersions = builder.slotTypeVersions;
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
     * List of slot types. 
     * @return slotTypeVersions
    **/
    @JsonProperty("slotTypeVersions")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.SlotTypeVersionItem> getSlotTypeVersions() {
        return slotTypeVersions;
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
        ListSlotTypeVersionResponse v1SkillInteractionModelTypeVersionListSlotTypeVersionResponse = (ListSlotTypeVersionResponse) o;
        return Objects.equals(this.links, v1SkillInteractionModelTypeVersionListSlotTypeVersionResponse.links) &&
            Objects.equals(this.slotTypeVersions, v1SkillInteractionModelTypeVersionListSlotTypeVersionResponse.slotTypeVersions) &&
            Objects.equals(this.nextToken, v1SkillInteractionModelTypeVersionListSlotTypeVersionResponse.nextToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, slotTypeVersions, nextToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSlotTypeVersionResponse {\n");
        
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    slotTypeVersions: ").append(toIndentedString(slotTypeVersions)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.SlotTypeVersionItem> slotTypeVersions;
        private String nextToken;

        private Builder() {}

        @JsonProperty("_links")

        public Builder withLinks(com.amazon.ask.smapi.model.v1.Links links) {
            this.links = links;
            return this;
        }


        @JsonProperty("slotTypeVersions")

        public Builder withSlotTypeVersions(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.SlotTypeVersionItem> slotTypeVersions) {
            this.slotTypeVersions = slotTypeVersions;
            return this;
        }

        public Builder addSlotTypeVersionsItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.SlotTypeVersionItem slotTypeVersionsItem) {
            if (this.slotTypeVersions == null) {
                this.slotTypeVersions = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.SlotTypeVersionItem>();
            }
            this.slotTypeVersions.add(slotTypeVersionsItem);
            return this;
        }

        @JsonProperty("nextToken")

        public Builder withNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }


        public ListSlotTypeVersionResponse build() {
            return new ListSlotTypeVersionResponse(this);
        }
    }
}

