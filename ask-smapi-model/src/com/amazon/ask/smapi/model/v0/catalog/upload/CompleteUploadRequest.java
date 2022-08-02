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
 * CompleteUploadRequest
 */

@JsonDeserialize(builder = CompleteUploadRequest.Builder.class)
public final class CompleteUploadRequest {

    @JsonProperty("partETags")
    private List<com.amazon.ask.smapi.model.v0.catalog.upload.PreSignedUrlItem> partETags = new ArrayList<com.amazon.ask.smapi.model.v0.catalog.upload.PreSignedUrlItem>();

    private CompleteUploadRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private CompleteUploadRequest(Builder builder) {
        if (builder.partETags != null) {
            this.partETags = builder.partETags;
        }
    }

    /**
     * List of (eTag, part number) pairs for each part of the file uploaded.
     * @return partETags
    **/
    @JsonProperty("partETags")
    public List<com.amazon.ask.smapi.model.v0.catalog.upload.PreSignedUrlItem> getPartETags() {
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
        CompleteUploadRequest v0CatalogUploadCompleteUploadRequest = (CompleteUploadRequest) o;
        return Objects.equals(this.partETags, v0CatalogUploadCompleteUploadRequest.partETags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partETags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompleteUploadRequest {\n");
        
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
  
    public static class Builder {
        private List<com.amazon.ask.smapi.model.v0.catalog.upload.PreSignedUrlItem> partETags;

        private Builder() {}

        @JsonProperty("partETags")

        public Builder withPartETags(List<com.amazon.ask.smapi.model.v0.catalog.upload.PreSignedUrlItem> partETags) {
            this.partETags = partETags;
            return this;
        }

        public Builder addPartETagsItem(com.amazon.ask.smapi.model.v0.catalog.upload.PreSignedUrlItem partETagsItem) {
            if (this.partETags == null) {
                this.partETags = new ArrayList<com.amazon.ask.smapi.model.v0.catalog.upload.PreSignedUrlItem>();
            }
            this.partETags.add(partETagsItem);
            return this;
        }

        public CompleteUploadRequest build() {
            return new CompleteUploadRequest(this);
        }
    }
}

