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


package com.amazon.ask.smapi.model.v1.catalog.upload;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Request body for self-hosted catalog uploads
 */

@JsonDeserialize(builder = PreSignedUrl.Builder.class)
public final class PreSignedUrl extends com.amazon.ask.smapi.model.v1.catalog.upload.CatalogUploadBase {

    @JsonProperty("urlId")
    private String urlId = null;

    @JsonProperty("partETags")
    private List<com.amazon.ask.smapi.model.v1.catalog.upload.PreSignedUrlItem> partETags = new ArrayList<com.amazon.ask.smapi.model.v1.catalog.upload.PreSignedUrlItem>();

    private PreSignedUrl() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private PreSignedUrl(Builder builder) {
        super(builder);
        if (builder.urlId != null) {
            this.urlId = builder.urlId;
        }
        if (builder.partETags != null) {
            this.partETags = builder.partETags;
        }
    }

    /**
     * Unique identifier for urls
     * @return urlId
    **/
    @JsonProperty("urlId")
    public String getUrlId() {
        return urlId;
    }


    /**
     * List of (eTag, part number) pairs for each part of the file uploaded
     * @return partETags
    **/
    @JsonProperty("partETags")
    public List<com.amazon.ask.smapi.model.v1.catalog.upload.PreSignedUrlItem> getPartETags() {
        return partETags;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PreSignedUrl v1CatalogUploadPreSignedUrl = (PreSignedUrl) o;
        return Objects.equals(this.urlId, v1CatalogUploadPreSignedUrl.urlId) &&
            Objects.equals(this.partETags, v1CatalogUploadPreSignedUrl.partETags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urlId, partETags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreSignedUrl {\n");
        
        sb.append("    urlId: ").append(toIndentedString(urlId)).append("\n");
        sb.append("    partETags: ").append(toIndentedString(partETags)).append("\n");
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
  
    public static class Builder extends com.amazon.ask.smapi.model.v1.catalog.upload.CatalogUploadBase.Builder<Builder> {
        private String urlId;
        private List<com.amazon.ask.smapi.model.v1.catalog.upload.PreSignedUrlItem> partETags;

        private Builder() {}

        @JsonProperty("urlId")

        public Builder withUrlId(String urlId) {
            this.urlId = urlId;
            return this;
        }


        @JsonProperty("partETags")

        public Builder withPartETags(List<com.amazon.ask.smapi.model.v1.catalog.upload.PreSignedUrlItem> partETags) {
            this.partETags = partETags;
            return this;
        }

        public Builder addPartETagsItem(com.amazon.ask.smapi.model.v1.catalog.upload.PreSignedUrlItem partETagsItem) {
            if (this.partETags == null) {
                this.partETags = new ArrayList<com.amazon.ask.smapi.model.v1.catalog.upload.PreSignedUrlItem>();
            }
            this.partETags.add(partETagsItem);
            return this;
        }

        public PreSignedUrl build() {
            return new PreSignedUrl(this);
        }
    }
}

