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
 * CatalogId information.
 */

@JsonDeserialize(builder = CatalogResponse.Builder.class)
public final class CatalogResponse {

    @JsonProperty("catalogId")
    private String catalogId = null;

    public static Builder builder() {
        return new Builder();
    }

    private CatalogResponse(Builder builder) {
        if (builder.catalogId != null) {
            this.catalogId = builder.catalogId;
        }
    }

    /**
     * ID of the catalog created.
     * @return catalogId
    **/
    @JsonProperty("catalogId")
    public String getCatalogId() {
        return catalogId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogResponse v1SkillInteractionModelCatalogCatalogResponse = (CatalogResponse) o;
        return Objects.equals(this.catalogId, v1SkillInteractionModelCatalogCatalogResponse.catalogId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogResponse {\n");
        
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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
        private String catalogId;

        private Builder() {}

        @JsonProperty("catalogId")

        public Builder withCatalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }


        public CatalogResponse build() {
            return new CatalogResponse(this);
        }
    }
}

