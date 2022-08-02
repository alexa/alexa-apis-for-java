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
 * Single upload part to perform a partitioned (multipart) file upload.
 */

@JsonDeserialize(builder = PresignedUploadPart.Builder.class)
public final class PresignedUploadPart {

    @JsonProperty("url")
    private String url = null;

    @JsonProperty("partNumber")
    private Integer partNumber = null;

    private PresignedUploadPart() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private PresignedUploadPart(Builder builder) {
        if (builder.url != null) {
            this.url = builder.url;
        }
        if (builder.partNumber != null) {
            this.partNumber = builder.partNumber;
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


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresignedUploadPart v0CatalogUploadPresignedUploadPart = (PresignedUploadPart) o;
        return Objects.equals(this.url, v0CatalogUploadPresignedUploadPart.url) &&
            Objects.equals(this.partNumber, v0CatalogUploadPresignedUploadPart.partNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, partNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresignedUploadPart {\n");
        
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
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


        public PresignedUploadPart build() {
            return new PresignedUploadPart(this);
        }
    }
}

