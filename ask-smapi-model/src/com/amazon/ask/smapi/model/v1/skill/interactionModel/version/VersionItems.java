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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Version metadata about the entity.
 */

@JsonDeserialize(builder = VersionItems.Builder.class)
public final class VersionItems {

    @JsonProperty("version")
    private String version = null;

    @JsonProperty("creationTime")
    private String creationTime = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.version.Links links = null;

    public static Builder builder() {
        return new Builder();
    }

    private VersionItems(Builder builder) {
        if (builder.version != null) {
            this.version = builder.version;
        }
        if (builder.creationTime != null) {
            this.creationTime = builder.creationTime;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
        if (builder.links != null) {
            this.links = builder.links;
        }
    }

    /**
     * Get version
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * Get creationTime
     * @return creationTime
    **/
    @JsonProperty("creationTime")
    public String getCreationTime() {
        return creationTime;
    }

    /**
     * Get description
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
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.version.Links getLinks() {
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
        VersionItems v1SkillInteractionModelVersionVersionItems = (VersionItems) o;
        return Objects.equals(this.version, v1SkillInteractionModelVersionVersionItems.version) &&
            Objects.equals(this.creationTime, v1SkillInteractionModelVersionVersionItems.creationTime) &&
            Objects.equals(this.description, v1SkillInteractionModelVersionVersionItems.description) &&
            Objects.equals(this.links, v1SkillInteractionModelVersionVersionItems.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, creationTime, description, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionItems {\n");
        
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
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
        private String creationTime;
        private String description;
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.version.Links links;

        private Builder() {}

        @JsonProperty("version")
        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        @JsonProperty("creationTime")
        public Builder withCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }


        @JsonProperty("description")
        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        @JsonProperty("_links")
        public Builder withLinks(com.amazon.ask.smapi.model.v1.skill.interactionModel.version.Links links) {
            this.links = links;
            return this;
        }


        public VersionItems build() {
            return new VersionItems(this);
        }
    }
}

