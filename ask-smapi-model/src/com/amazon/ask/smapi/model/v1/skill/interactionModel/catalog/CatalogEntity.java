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
 * Definition for catalog entity.
 */

@JsonDeserialize(builder = CatalogEntity.Builder.class)
public final class CatalogEntity {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("description")
    private String description = null;

    public static Builder builder() {
        return new Builder();
    }

    private CatalogEntity(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
    }

    /**
     * Name of the catalog.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Description string about the catalog.
     * @return description
    **/
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogEntity v1SkillInteractionModelCatalogCatalogEntity = (CatalogEntity) o;
        return Objects.equals(this.name, v1SkillInteractionModelCatalogCatalogEntity.name) &&
            Objects.equals(this.description, v1SkillInteractionModelCatalogCatalogEntity.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogEntity {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
        private String name;
        private String description;

        private Builder() {}

        @JsonProperty("name")
        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("description")
        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        public CatalogEntity build() {
            return new CatalogEntity(this);
        }
    }
}

