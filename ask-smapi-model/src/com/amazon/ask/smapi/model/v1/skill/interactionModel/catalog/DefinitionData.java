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

@JsonDeserialize(builder = DefinitionData.Builder.class)
public final class DefinitionData {

    @JsonProperty("catalog")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogInput catalog = null;

    @JsonProperty("vendorId")
    private String vendorId = null;

    public static Builder builder() {
        return new Builder();
    }

    private DefinitionData(Builder builder) {
        if (builder.catalog != null) {
            this.catalog = builder.catalog;
        }
        if (builder.vendorId != null) {
            this.vendorId = builder.vendorId;
        }
    }

    /**
     * Get catalog
     * @return catalog
    **/
    @JsonProperty("catalog")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogInput getCatalog() {
        return catalog;
    }


    /**
     * The vendorId that the catalog should belong to.
     * @return vendorId
    **/
    @JsonProperty("vendorId")
    public String getVendorId() {
        return vendorId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DefinitionData v1SkillInteractionModelCatalogDefinitionData = (DefinitionData) o;
        return Objects.equals(this.catalog, v1SkillInteractionModelCatalogDefinitionData.catalog) &&
            Objects.equals(this.vendorId, v1SkillInteractionModelCatalogDefinitionData.vendorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalog, vendorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DefinitionData {\n");
        
        sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
        sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogInput catalog;
        private String vendorId;

        private Builder() {}

        @JsonProperty("catalog")

        public Builder withCatalog(com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogInput catalog) {
            this.catalog = catalog;
            return this;
        }


        @JsonProperty("vendorId")

        public Builder withVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }


        public DefinitionData build() {
            return new DefinitionData(this);
        }
    }
}

