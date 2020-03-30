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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Catalog request definitions.
 */

@JsonDeserialize(builder = CatalogDefinitionOutput.Builder.class)
public final class CatalogDefinitionOutput {

    @JsonProperty("catalog")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogEntity catalog = null;

    @JsonProperty("creationTime")
    private String creationTime = null;

    @JsonProperty("totalVersions")
    private String totalVersions = null;

    public static Builder builder() {
        return new Builder();
    }

    private CatalogDefinitionOutput(Builder builder) {
        if (builder.catalog != null) {
            this.catalog = builder.catalog;
        }
        if (builder.creationTime != null) {
            this.creationTime = builder.creationTime;
        }
        if (builder.totalVersions != null) {
            this.totalVersions = builder.totalVersions;
        }
    }

    /**
     * Get catalog
     * @return catalog
    **/
    @JsonProperty("catalog")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogEntity getCatalog() {
        return catalog;
    }


    /**
     * Time of the catalog definition creation.
     * @return creationTime
    **/
    @JsonProperty("creationTime")
    public String getCreationTime() {
        return creationTime;
    }


    /**
     * Total number of versions.
     * @return totalVersions
    **/
    @JsonProperty("totalVersions")
    public String getTotalVersions() {
        return totalVersions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogDefinitionOutput v1SkillInteractionModelCatalogCatalogDefinitionOutput = (CatalogDefinitionOutput) o;
        return Objects.equals(this.catalog, v1SkillInteractionModelCatalogCatalogDefinitionOutput.catalog) &&
            Objects.equals(this.creationTime, v1SkillInteractionModelCatalogCatalogDefinitionOutput.creationTime) &&
            Objects.equals(this.totalVersions, v1SkillInteractionModelCatalogCatalogDefinitionOutput.totalVersions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalog, creationTime, totalVersions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogDefinitionOutput {\n");
        
        sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    totalVersions: ").append(toIndentedString(totalVersions)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogEntity catalog;
        private String creationTime;
        private String totalVersions;

        private Builder() {}

        @JsonProperty("catalog")

        public Builder withCatalog(com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogEntity catalog) {
            this.catalog = catalog;
            return this;
        }


        @JsonProperty("creationTime")

        public Builder withCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }


        @JsonProperty("totalVersions")

        public Builder withTotalVersions(String totalVersions) {
            this.totalVersions = totalVersions;
            return this;
        }


        public CatalogDefinitionOutput build() {
            return new CatalogDefinitionOutput(this);
        }
    }
}

