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

    @JsonProperty("preSignedUploadParts")
    private List<com.amazon.ask.smapi.model.v1.catalog.PresignedUploadPartItems> preSignedUploadParts = new ArrayList<com.amazon.ask.smapi.model.v1.catalog.PresignedUploadPartItems>();

    public static Builder builder() {
        return new Builder();
    }

    private CreateContentUploadUrlResponse(Builder builder) {
        if (builder.urlId != null) {
            this.urlId = builder.urlId;
        }
        if (builder.preSignedUploadParts != null) {
            this.preSignedUploadParts = builder.preSignedUploadParts;
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
     * @return preSignedUploadParts
    **/
    @JsonProperty("preSignedUploadParts")
    public List<com.amazon.ask.smapi.model.v1.catalog.PresignedUploadPartItems> getPreSignedUploadParts() {
        return preSignedUploadParts;
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
            Objects.equals(this.preSignedUploadParts, v1CatalogCreateContentUploadUrlResponse.preSignedUploadParts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urlId, preSignedUploadParts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateContentUploadUrlResponse {\n");
        
        sb.append("    urlId: ").append(toIndentedString(urlId)).append("\n");
        sb.append("    preSignedUploadParts: ").append(toIndentedString(preSignedUploadParts)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.catalog.PresignedUploadPartItems> preSignedUploadParts;

        private Builder() {}

        @JsonProperty("urlId")

        public Builder withUrlId(String urlId) {
            this.urlId = urlId;
            return this;
        }


        @JsonProperty("preSignedUploadParts")

        public Builder withPreSignedUploadParts(List<com.amazon.ask.smapi.model.v1.catalog.PresignedUploadPartItems> preSignedUploadParts) {
            this.preSignedUploadParts = preSignedUploadParts;
            return this;
        }

        public Builder addPreSignedUploadPartsItem(com.amazon.ask.smapi.model.v1.catalog.PresignedUploadPartItems preSignedUploadPartsItem) {
            if (this.preSignedUploadParts == null) {
                this.preSignedUploadParts = new ArrayList<com.amazon.ask.smapi.model.v1.catalog.PresignedUploadPartItems>();
            }
            this.preSignedUploadParts.add(preSignedUploadPartsItem);
            return this;
        }

        public CreateContentUploadUrlResponse build() {
            return new CreateContentUploadUrlResponse(this);
        }
    }
}

