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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * ListUploadsResponse
 */

@JsonDeserialize(builder = ListUploadsResponse.Builder.class)
public final class ListUploadsResponse {

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.Links links = null;

    @JsonProperty("isTruncated")
    private Boolean isTruncated = null;

    @JsonProperty("nextToken")
    private String nextToken = null;

    @JsonProperty("uploads")
    private List<com.amazon.ask.smapi.model.v0.catalog.upload.ContentUploadSummary> uploads = new ArrayList<com.amazon.ask.smapi.model.v0.catalog.upload.ContentUploadSummary>();

    public static Builder builder() {
        return new Builder();
    }

    private ListUploadsResponse(Builder builder) {
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.isTruncated != null) {
            this.isTruncated = builder.isTruncated;
        }
        if (builder.nextToken != null) {
            this.nextToken = builder.nextToken;
        }
        if (builder.uploads != null) {
            this.uploads = builder.uploads;
        }
    }

    /**
     * Get links
     * @return links
    **/
    @JsonProperty("_links")
    public com.amazon.ask.smapi.model.v1.Links getLinks() {
        return links;
    }


    /**
     * Get isTruncated
     * @return isTruncated
    **/
    @JsonProperty("isTruncated")
    public Boolean getIsTruncated() {
        return isTruncated;
    }


    /**
     * Get nextToken
     * @return nextToken
    **/
    @JsonProperty("nextToken")
    public String getNextToken() {
        return nextToken;
    }


    /**
     * List of upload summaries.
     * @return uploads
    **/
    @JsonProperty("uploads")
    public List<com.amazon.ask.smapi.model.v0.catalog.upload.ContentUploadSummary> getUploads() {
        return uploads;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListUploadsResponse v0CatalogUploadListUploadsResponse = (ListUploadsResponse) o;
        return Objects.equals(this.links, v0CatalogUploadListUploadsResponse.links) &&
            Objects.equals(this.isTruncated, v0CatalogUploadListUploadsResponse.isTruncated) &&
            Objects.equals(this.nextToken, v0CatalogUploadListUploadsResponse.nextToken) &&
            Objects.equals(this.uploads, v0CatalogUploadListUploadsResponse.uploads);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, isTruncated, nextToken, uploads);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUploadsResponse {\n");
        
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
        sb.append("    uploads: ").append(toIndentedString(uploads)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.Links links;
        private Boolean isTruncated;
        private String nextToken;
        private List<com.amazon.ask.smapi.model.v0.catalog.upload.ContentUploadSummary> uploads;

        private Builder() {}

        @JsonProperty("_links")

        public Builder withLinks(com.amazon.ask.smapi.model.v1.Links links) {
            this.links = links;
            return this;
        }


        @JsonProperty("isTruncated")

        public Builder withIsTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }


        @JsonProperty("nextToken")

        public Builder withNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }


        @JsonProperty("uploads")

        public Builder withUploads(List<com.amazon.ask.smapi.model.v0.catalog.upload.ContentUploadSummary> uploads) {
            this.uploads = uploads;
            return this;
        }

        public Builder addUploadsItem(com.amazon.ask.smapi.model.v0.catalog.upload.ContentUploadSummary uploadsItem) {
            if (this.uploads == null) {
                this.uploads = new ArrayList<com.amazon.ask.smapi.model.v0.catalog.upload.ContentUploadSummary>();
            }
            this.uploads.add(uploadsItem);
            return this;
        }

        public ListUploadsResponse build() {
            return new ListUploadsResponse(this);
        }
    }
}

