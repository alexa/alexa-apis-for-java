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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.type;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * List of slot types of a skill for the vendor.
 */

@JsonDeserialize(builder = ListSlotTypeResponse.Builder.class)
public final class ListSlotTypeResponse {

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.Links links = null;

    @JsonProperty("slotTypes")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeItem> slotTypes = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeItem>();

    @JsonProperty("nextToken")
    private String nextToken = null;

    private ListSlotTypeResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ListSlotTypeResponse(Builder builder) {
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.slotTypes != null) {
            this.slotTypes = builder.slotTypes;
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
     * @return slotTypes
    **/
    @JsonProperty("slotTypes")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeItem> getSlotTypes() {
        return slotTypes;
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
        ListSlotTypeResponse v1SkillInteractionModelTypeListSlotTypeResponse = (ListSlotTypeResponse) o;
        return Objects.equals(this.links, v1SkillInteractionModelTypeListSlotTypeResponse.links) &&
            Objects.equals(this.slotTypes, v1SkillInteractionModelTypeListSlotTypeResponse.slotTypes) &&
            Objects.equals(this.nextToken, v1SkillInteractionModelTypeListSlotTypeResponse.nextToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, slotTypes, nextToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSlotTypeResponse {\n");
        
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    slotTypes: ").append(toIndentedString(slotTypes)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeItem> slotTypes;
        private String nextToken;

        private Builder() {}

        @JsonProperty("_links")

        public Builder withLinks(com.amazon.ask.smapi.model.v1.Links links) {
            this.links = links;
            return this;
        }


        @JsonProperty("slotTypes")

        public Builder withSlotTypes(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeItem> slotTypes) {
            this.slotTypes = slotTypes;
            return this;
        }

        public Builder addSlotTypesItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeItem slotTypesItem) {
            if (this.slotTypes == null) {
                this.slotTypes = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeItem>();
            }
            this.slotTypes.add(slotTypesItem);
            return this;
        }

        @JsonProperty("nextToken")

        public Builder withNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }


        public ListSlotTypeResponse build() {
            return new ListSlotTypeResponse(this);
        }
    }
}

