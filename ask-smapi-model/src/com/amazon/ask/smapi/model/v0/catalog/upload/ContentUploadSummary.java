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


package com.amazon.ask.smapi.model.v0.catalog.upload;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContentUploadSummary
 */

@JsonDeserialize(builder = ContentUploadSummary.Builder.class)
public final class ContentUploadSummary {

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("catalogId")
    private String catalogId = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("createdDate")
    private OffsetDateTime createdDate = null;

    @JsonProperty("lastUpdatedDate")
    private OffsetDateTime lastUpdatedDate = null;

    public static Builder builder() {
        return new Builder();
    }

    private ContentUploadSummary(Builder builder) {
        if (builder.id != null) {
            this.id = builder.id;
        }
        if (builder.catalogId != null) {
            this.catalogId = builder.catalogId;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.createdDate != null) {
            this.createdDate = builder.createdDate;
        }
        if (builder.lastUpdatedDate != null) {
            this.lastUpdatedDate = builder.lastUpdatedDate;
        }
    }

    /**
     * Unique identifier of the upload.
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }


    /**
     * Unique identifier of the catalog.
     * @return catalogId
    **/
    @JsonProperty("catalogId")
    public String getCatalogId() {
        return catalogId;
    }


    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v0.catalog.upload.UploadStatus getStatus() {
        return com.amazon.ask.smapi.model.v0.catalog.upload.UploadStatus.fromValue(status);
    }

    /**
     * Get the underlying String value for status.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return status as a String value
    **/
    @JsonProperty("status")
    public String getStatusAsString() {
      return status;
    }

    /**
     * Get createdDate
     * @return createdDate
    **/
    @JsonProperty("createdDate")
    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }


    /**
     * Get lastUpdatedDate
     * @return lastUpdatedDate
    **/
    @JsonProperty("lastUpdatedDate")
    public OffsetDateTime getLastUpdatedDate() {
        return lastUpdatedDate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentUploadSummary v0CatalogUploadContentUploadSummary = (ContentUploadSummary) o;
        return Objects.equals(this.id, v0CatalogUploadContentUploadSummary.id) &&
            Objects.equals(this.catalogId, v0CatalogUploadContentUploadSummary.catalogId) &&
            Objects.equals(this.status, v0CatalogUploadContentUploadSummary.status) &&
            Objects.equals(this.createdDate, v0CatalogUploadContentUploadSummary.createdDate) &&
            Objects.equals(this.lastUpdatedDate, v0CatalogUploadContentUploadSummary.lastUpdatedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, catalogId, status, createdDate, lastUpdatedDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentUploadSummary {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
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
        private String catalogId;
        private String status;
        private OffsetDateTime createdDate;
        private OffsetDateTime lastUpdatedDate;

        private Builder() {}

        @JsonProperty("id")

        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        @JsonProperty("catalogId")

        public Builder withCatalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }


        @JsonProperty("status")
        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v0.catalog.upload.UploadStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("createdDate")

        public Builder withCreatedDate(OffsetDateTime createdDate) {
            this.createdDate = createdDate;
            return this;
        }


        @JsonProperty("lastUpdatedDate")

        public Builder withLastUpdatedDate(OffsetDateTime lastUpdatedDate) {
            this.lastUpdatedDate = lastUpdatedDate;
            return this;
        }


        public ContentUploadSummary build() {
            return new ContentUploadSummary(this);
        }
    }
}

