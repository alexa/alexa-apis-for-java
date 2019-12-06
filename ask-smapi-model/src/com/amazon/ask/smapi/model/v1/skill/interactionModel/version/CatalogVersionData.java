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
 * Catalog version data with metadata.
 */

@JsonDeserialize(builder = CatalogVersionData.Builder.class)
public final class CatalogVersionData {

    @JsonProperty("source")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.version.InputSource source = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("version")
    private String version = null;

    public static Builder builder() {
        return new Builder();
    }

    private CatalogVersionData(Builder builder) {
        if (builder.source != null) {
            this.source = builder.source;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
        if (builder.version != null) {
            this.version = builder.version;
        }
    }

    /**
     * Get source
     * @return source
    **/
    @JsonProperty("source")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.version.InputSource getSource() {
        return source;
    }

    /**
     * Description string for specific catalog version.
     * @return description
    **/
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Specific catalog version.
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogVersionData v1SkillInteractionModelVersionCatalogVersionData = (CatalogVersionData) o;
        return Objects.equals(this.source, v1SkillInteractionModelVersionCatalogVersionData.source) &&
            Objects.equals(this.description, v1SkillInteractionModelVersionCatalogVersionData.description) &&
            Objects.equals(this.version, v1SkillInteractionModelVersionCatalogVersionData.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, description, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogVersionData {\n");
        
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.version.InputSource source;
        private String description;
        private String version;

        private Builder() {}

        @JsonProperty("source")
        public Builder withSource(com.amazon.ask.smapi.model.v1.skill.interactionModel.version.InputSource source) {
            this.source = source;
            return this;
        }


        @JsonProperty("description")
        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        @JsonProperty("version")
        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        public CatalogVersionData build() {
            return new CatalogVersionData(this);
        }
    }
}

