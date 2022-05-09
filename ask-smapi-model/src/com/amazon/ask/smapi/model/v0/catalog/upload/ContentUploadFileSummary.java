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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContentUploadFileSummary
 */

@JsonDeserialize(builder = ContentUploadFileSummary.Builder.class)
public final class ContentUploadFileSummary {

    @JsonProperty("presignedDownloadUrl")
    private String presignedDownloadUrl = null;

    @JsonProperty("status")
    private String status = null;

    public static Builder builder() {
        return new Builder();
    }

    private ContentUploadFileSummary(Builder builder) {
        if (builder.presignedDownloadUrl != null) {
            this.presignedDownloadUrl = builder.presignedDownloadUrl;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
    }

    /**
     * If the file is available for download, presigned download URL can be used to download the file.
     * @return presignedDownloadUrl
    **/
    @JsonProperty("presignedDownloadUrl")
    public String getPresignedDownloadUrl() {
        return presignedDownloadUrl;
    }


    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v0.catalog.upload.FileUploadStatus getStatus() {
        return com.amazon.ask.smapi.model.v0.catalog.upload.FileUploadStatus.fromValue(status);
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentUploadFileSummary v0CatalogUploadContentUploadFileSummary = (ContentUploadFileSummary) o;
        return Objects.equals(this.presignedDownloadUrl, v0CatalogUploadContentUploadFileSummary.presignedDownloadUrl) &&
            Objects.equals(this.status, v0CatalogUploadContentUploadFileSummary.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(presignedDownloadUrl, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentUploadFileSummary {\n");
        
        sb.append("    presignedDownloadUrl: ").append(toIndentedString(presignedDownloadUrl)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
        private String presignedDownloadUrl;
        private String status;

        private Builder() {}

        @JsonProperty("presignedDownloadUrl")

        public Builder withPresignedDownloadUrl(String presignedDownloadUrl) {
            this.presignedDownloadUrl = presignedDownloadUrl;
            return this;
        }


        @JsonProperty("status")

        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v0.catalog.upload.FileUploadStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        public ContentUploadFileSummary build() {
            return new ContentUploadFileSummary(this);
        }
    }
}

