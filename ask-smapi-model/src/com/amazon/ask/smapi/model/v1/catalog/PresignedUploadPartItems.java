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


package com.amazon.ask.smapi.model.v1.catalog;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PresignedUploadPartItems
 */

@JsonDeserialize(builder = PresignedUploadPartItems.Builder.class)
public final class PresignedUploadPartItems {

    @JsonProperty("url")
    private String url = null;

    @JsonProperty("partNumber")
    private Integer partNumber = null;

    @JsonProperty("expiresAt")
    private OffsetDateTime expiresAt = null;

    public static Builder builder() {
        return new Builder();
    }

    private PresignedUploadPartItems(Builder builder) {
        if (builder.url != null) {
            this.url = builder.url;
        }
        if (builder.partNumber != null) {
            this.partNumber = builder.partNumber;
        }
        if (builder.expiresAt != null) {
            this.expiresAt = builder.expiresAt;
        }
    }

    /**
     * Get url
     * @return url
    **/
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }


    /**
     * Get partNumber
     * @return partNumber
    **/
    @JsonProperty("partNumber")
    public Integer getPartNumber() {
        return partNumber;
    }


    /**
     * Get expiresAt
     * @return expiresAt
    **/
    @JsonProperty("expiresAt")
    public OffsetDateTime getExpiresAt() {
        return expiresAt;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresignedUploadPartItems v1CatalogPresignedUploadPartItems = (PresignedUploadPartItems) o;
        return Objects.equals(this.url, v1CatalogPresignedUploadPartItems.url) &&
            Objects.equals(this.partNumber, v1CatalogPresignedUploadPartItems.partNumber) &&
            Objects.equals(this.expiresAt, v1CatalogPresignedUploadPartItems.expiresAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, partNumber, expiresAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresignedUploadPartItems {\n");
        
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
        private String url;
        private Integer partNumber;
        private OffsetDateTime expiresAt;

        private Builder() {}

        @JsonProperty("url")

        public Builder withUrl(String url) {
            this.url = url;
            return this;
        }


        @JsonProperty("partNumber")

        public Builder withPartNumber(Integer partNumber) {
            this.partNumber = partNumber;
            return this;
        }


        @JsonProperty("expiresAt")

        public Builder withExpiresAt(OffsetDateTime expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }


        public PresignedUploadPartItems build() {
            return new PresignedUploadPartItems(this);
        }
    }
}

