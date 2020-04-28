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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Request body for self-hosted catalog uploads.
 */

@JsonDeserialize(builder = CreateContentUploadResponse.Builder.class)
public final class CreateContentUploadResponse {

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

    @JsonProperty("ingestionSteps")
    private List<com.amazon.ask.smapi.model.v0.catalog.upload.UploadIngestionStep> ingestionSteps = new ArrayList<com.amazon.ask.smapi.model.v0.catalog.upload.UploadIngestionStep>();

    @JsonProperty("presignedUploadParts")
    private List<com.amazon.ask.smapi.model.v0.catalog.upload.PresignedUploadPart> presignedUploadParts = new ArrayList<com.amazon.ask.smapi.model.v0.catalog.upload.PresignedUploadPart>();

    public static Builder builder() {
        return new Builder();
    }

    private CreateContentUploadResponse(Builder builder) {
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
        if (builder.ingestionSteps != null) {
            this.ingestionSteps = builder.ingestionSteps;
        }
        if (builder.presignedUploadParts != null) {
            this.presignedUploadParts = builder.presignedUploadParts;
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
     * Provides a unique identifier of the catalog.
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


    /**
     * Get ingestionSteps
     * @return ingestionSteps
    **/
    @JsonProperty("ingestionSteps")
    public List<com.amazon.ask.smapi.model.v0.catalog.upload.UploadIngestionStep> getIngestionSteps() {
        return ingestionSteps;
    }


    /**
     * Ordered list of presigned upload parts to perform a partitioned (multipart) file upload.
     * @return presignedUploadParts
    **/
    @JsonProperty("presignedUploadParts")
    public List<com.amazon.ask.smapi.model.v0.catalog.upload.PresignedUploadPart> getPresignedUploadParts() {
        return presignedUploadParts;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateContentUploadResponse v0CatalogUploadCreateContentUploadResponse = (CreateContentUploadResponse) o;
        return Objects.equals(this.id, v0CatalogUploadCreateContentUploadResponse.id) &&
            Objects.equals(this.catalogId, v0CatalogUploadCreateContentUploadResponse.catalogId) &&
            Objects.equals(this.status, v0CatalogUploadCreateContentUploadResponse.status) &&
            Objects.equals(this.createdDate, v0CatalogUploadCreateContentUploadResponse.createdDate) &&
            Objects.equals(this.lastUpdatedDate, v0CatalogUploadCreateContentUploadResponse.lastUpdatedDate) &&
            Objects.equals(this.ingestionSteps, v0CatalogUploadCreateContentUploadResponse.ingestionSteps) &&
            Objects.equals(this.presignedUploadParts, v0CatalogUploadCreateContentUploadResponse.presignedUploadParts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, catalogId, status, createdDate, lastUpdatedDate, ingestionSteps, presignedUploadParts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateContentUploadResponse {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
        sb.append("    ingestionSteps: ").append(toIndentedString(ingestionSteps)).append("\n");
        sb.append("    presignedUploadParts: ").append(toIndentedString(presignedUploadParts)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v0.catalog.upload.UploadIngestionStep> ingestionSteps;
        private List<com.amazon.ask.smapi.model.v0.catalog.upload.PresignedUploadPart> presignedUploadParts;

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


        @JsonProperty("ingestionSteps")

        public Builder withIngestionSteps(List<com.amazon.ask.smapi.model.v0.catalog.upload.UploadIngestionStep> ingestionSteps) {
            this.ingestionSteps = ingestionSteps;
            return this;
        }

        public Builder addIngestionStepsItem(com.amazon.ask.smapi.model.v0.catalog.upload.UploadIngestionStep ingestionStepsItem) {
            if (this.ingestionSteps == null) {
                this.ingestionSteps = new ArrayList<com.amazon.ask.smapi.model.v0.catalog.upload.UploadIngestionStep>();
            }
            this.ingestionSteps.add(ingestionStepsItem);
            return this;
        }

        @JsonProperty("presignedUploadParts")

        public Builder withPresignedUploadParts(List<com.amazon.ask.smapi.model.v0.catalog.upload.PresignedUploadPart> presignedUploadParts) {
            this.presignedUploadParts = presignedUploadParts;
            return this;
        }

        public Builder addPresignedUploadPartsItem(com.amazon.ask.smapi.model.v0.catalog.upload.PresignedUploadPart presignedUploadPartsItem) {
            if (this.presignedUploadParts == null) {
                this.presignedUploadParts = new ArrayList<com.amazon.ask.smapi.model.v0.catalog.upload.PresignedUploadPart>();
            }
            this.presignedUploadParts.add(presignedUploadPartsItem);
            return this;
        }

        public CreateContentUploadResponse build() {
            return new CreateContentUploadResponse(this);
        }
    }
}

