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


package com.amazon.ask.smapi.model.v0.catalog;

import java.util.Objects;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * CatalogSummary
 */

@JsonDeserialize(builder = CatalogSummary.Builder.class)
public final class CatalogSummary {

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("title")
    private String title = null;

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("usage")
    private String usage = null;

    @JsonProperty("lastUpdatedDate")
    private OffsetDateTime lastUpdatedDate = null;

    @JsonProperty("createdDate")
    private OffsetDateTime createdDate = null;

    @JsonProperty("associatedSkillIds")
    private List<String> associatedSkillIds = new ArrayList<String>();

    private CatalogSummary() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private CatalogSummary(Builder builder) {
        if (builder.id != null) {
            this.id = builder.id;
        }
        if (builder.title != null) {
            this.title = builder.title;
        }
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.usage != null) {
            this.usage = builder.usage;
        }
        if (builder.lastUpdatedDate != null) {
            this.lastUpdatedDate = builder.lastUpdatedDate;
        }
        if (builder.createdDate != null) {
            this.createdDate = builder.createdDate;
        }
        if (builder.associatedSkillIds != null) {
            this.associatedSkillIds = builder.associatedSkillIds;
        }
    }

    /**
     * Unique identifier of the added catalog object.
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }


    /**
     * Title of the catalog.
     * @return title
    **/
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }


    /**
     * Get type
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getTypeAsString().
     *
     * @return type
    **/
    
    public com.amazon.ask.smapi.model.v0.catalog.CatalogType getType() {
        return com.amazon.ask.smapi.model.v0.catalog.CatalogType.fromValue(type);
    }

    /**
     * Get the underlying String value for type.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return type as a String value
    **/
    @JsonProperty("type")
    public String getTypeAsString() {
      return type;
    }

    /**
     * Get usage
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getUsageAsString().
     *
     * @return usage
    **/
    
    public com.amazon.ask.smapi.model.v0.catalog.CatalogUsage getUsage() {
        return com.amazon.ask.smapi.model.v0.catalog.CatalogUsage.fromValue(usage);
    }

    /**
     * Get the underlying String value for usage.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return usage as a String value
    **/
    @JsonProperty("usage")
    public String getUsageAsString() {
      return usage;
    }

    /**
     * The date time when the catalog was last updated.
     * @return lastUpdatedDate
    **/
    @JsonProperty("lastUpdatedDate")
    public OffsetDateTime getLastUpdatedDate() {
        return lastUpdatedDate;
    }


    /**
     * The date time when the catalog was created.
     * @return createdDate
    **/
    @JsonProperty("createdDate")
    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }


    /**
     * The list of skill Ids associated with the catalog.
     * @return associatedSkillIds
    **/
    @JsonProperty("associatedSkillIds")
    public List<String> getAssociatedSkillIds() {
        return associatedSkillIds;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogSummary v0CatalogCatalogSummary = (CatalogSummary) o;
        return Objects.equals(this.id, v0CatalogCatalogSummary.id) &&
            Objects.equals(this.title, v0CatalogCatalogSummary.title) &&
            Objects.equals(this.type, v0CatalogCatalogSummary.type) &&
            Objects.equals(this.usage, v0CatalogCatalogSummary.usage) &&
            Objects.equals(this.lastUpdatedDate, v0CatalogCatalogSummary.lastUpdatedDate) &&
            Objects.equals(this.createdDate, v0CatalogCatalogSummary.createdDate) &&
            Objects.equals(this.associatedSkillIds, v0CatalogCatalogSummary.associatedSkillIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, type, usage, lastUpdatedDate, createdDate, associatedSkillIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogSummary {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    associatedSkillIds: ").append(toIndentedString(associatedSkillIds)).append("\n");
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
        private String id;
        private String title;
        private String type;
        private String usage;
        private OffsetDateTime lastUpdatedDate;
        private OffsetDateTime createdDate;
        private List<String> associatedSkillIds;

        private Builder() {}

        @JsonProperty("id")

        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        @JsonProperty("title")

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }


        @JsonProperty("type")

        public Builder withType(String type) {
          this.type = type;
          return this;
        }

        public Builder withType(com.amazon.ask.smapi.model.v0.catalog.CatalogType type) {
            this.type = type != null ? type.toString() : null;
            return this;
        }


        @JsonProperty("usage")

        public Builder withUsage(String usage) {
          this.usage = usage;
          return this;
        }

        public Builder withUsage(com.amazon.ask.smapi.model.v0.catalog.CatalogUsage usage) {
            this.usage = usage != null ? usage.toString() : null;
            return this;
        }


        @JsonProperty("lastUpdatedDate")

        public Builder withLastUpdatedDate(OffsetDateTime lastUpdatedDate) {
            this.lastUpdatedDate = lastUpdatedDate;
            return this;
        }


        @JsonProperty("createdDate")

        public Builder withCreatedDate(OffsetDateTime createdDate) {
            this.createdDate = createdDate;
            return this;
        }


        @JsonProperty("associatedSkillIds")

        public Builder withAssociatedSkillIds(List<String> associatedSkillIds) {
            this.associatedSkillIds = associatedSkillIds;
            return this;
        }

        public Builder addAssociatedSkillIdsItem(String associatedSkillIdsItem) {
            if (this.associatedSkillIds == null) {
                this.associatedSkillIds = new ArrayList<String>();
            }
            this.associatedSkillIds.add(associatedSkillIdsItem);
            return this;
        }

        public CatalogSummary build() {
            return new CatalogSummary(this);
        }
    }
}

