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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition for slot type entity.
 */

@JsonDeserialize(builder = SlotTypeVersionItem.Builder.class)
public final class SlotTypeVersionItem {

    @JsonProperty("version")
    private String version = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.Links links = null;

    public static Builder builder() {
        return new Builder();
    }

    private SlotTypeVersionItem(Builder builder) {
        if (builder.version != null) {
            this.version = builder.version;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
        if (builder.links != null) {
            this.links = builder.links;
        }
    }

    /**
     * Version number of slot type.
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * Description string about the slot type version.
     * @return description
    **/
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Get links
     * @return links
    **/
    @JsonProperty("_links")
    public com.amazon.ask.smapi.model.v1.Links getLinks() {
        return links;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlotTypeVersionItem v1SkillInteractionModelTypeVersionSlotTypeVersionItem = (SlotTypeVersionItem) o;
        return Objects.equals(this.version, v1SkillInteractionModelTypeVersionSlotTypeVersionItem.version) &&
            Objects.equals(this.description, v1SkillInteractionModelTypeVersionSlotTypeVersionItem.description) &&
            Objects.equals(this.links, v1SkillInteractionModelTypeVersionSlotTypeVersionItem.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, description, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlotTypeVersionItem {\n");
        
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
        private String version;
        private String description;
        private com.amazon.ask.smapi.model.v1.Links links;

        private Builder() {}

        @JsonProperty("version")
        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        @JsonProperty("description")
        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        @JsonProperty("_links")
        public Builder withLinks(com.amazon.ask.smapi.model.v1.Links links) {
            this.links = links;
            return this;
        }


        public SlotTypeVersionItem build() {
            return new SlotTypeVersionItem(this);
        }
    }
}

