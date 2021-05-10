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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * CreateContentUploadUrlResponse
 */

@JsonDeserialize(builder = CreateContentUploadUrlResponse.Builder.class)
public final class CreateContentUploadUrlResponse {

    @JsonProperty("urlId")
    private String urlId = null;

    @JsonProperty("presignedUploadParts")
    private List<com.amazon.ask.smapi.model.v1.catalog.PresignedUploadPartItems> presignedUploadParts = new ArrayList<com.amazon.ask.smapi.model.v1.catalog.PresignedUploadPartItems>();

    public static Builder builder() {
        return new Builder();
    }

    private CreateContentUploadUrlResponse(Builder builder) {
        if (builder.urlId != null) {
            this.urlId = builder.urlId;
        }
        if (builder.presignedUploadParts != null) {
            this.presignedUploadParts = builder.presignedUploadParts;
        }
    }

    /**
     * Unique identifier for collection of generated urls.
     * @return urlId
    **/
    @JsonProperty("urlId")
    public String getUrlId() {
        return urlId;
    }


    /**
     * Ordered list of presigned upload parts to perform a partitioned (multipart) file upload
     * @return presignedUploadParts
    **/
    @JsonProperty("presignedUploadParts")
    public List<com.amazon.ask.smapi.model.v1.catalog.PresignedUploadPartItems> getPresignedUploadParts() {
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
        CreateContentUploadUrlResponse v1CatalogCreateContentUploadUrlResponse = (CreateContentUploadUrlResponse) o;
        return Objects.equals(this.urlId, v1CatalogCreateContentUploadUrlResponse.urlId) &&
            Objects.equals(this.presignedUploadParts, v1CatalogCreateContentUploadUrlResponse.presignedUploadParts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urlId, presignedUploadParts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateContentUploadUrlResponse {\n");
        
        sb.append("    urlId: ").append(toIndentedString(urlId)).append("\n");
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
        private String urlId;
        private List<com.amazon.ask.smapi.model.v1.catalog.PresignedUploadPartItems> presignedUploadParts;

        private Builder() {}

        @JsonProperty("urlId")

        public Builder withUrlId(String urlId) {
            this.urlId = urlId;
            return this;
        }


        @JsonProperty("presignedUploadParts")

        public Builder withPresignedUploadParts(List<com.amazon.ask.smapi.model.v1.catalog.PresignedUploadPartItems> presignedUploadParts) {
            this.presignedUploadParts = presignedUploadParts;
            return this;
        }

        public Builder addPresignedUploadPartsItem(com.amazon.ask.smapi.model.v1.catalog.PresignedUploadPartItems presignedUploadPartsItem) {
            if (this.presignedUploadParts == null) {
                this.presignedUploadParts = new ArrayList<com.amazon.ask.smapi.model.v1.catalog.PresignedUploadPartItems>();
            }
            this.presignedUploadParts.add(presignedUploadPartsItem);
            return this;
        }

        public CreateContentUploadUrlResponse build() {
            return new CreateContentUploadUrlResponse(this);
        }
    }
}

