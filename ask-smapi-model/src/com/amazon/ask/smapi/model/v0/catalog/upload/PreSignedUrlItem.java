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
 * PreSignedUrlItem
 */

@JsonDeserialize(builder = PreSignedUrlItem.Builder.class)
public final class PreSignedUrlItem {

    @JsonProperty("eTag")
    private String eTag = null;

    @JsonProperty("partNumber")
    private Integer partNumber = null;

    public static Builder builder() {
        return new Builder();
    }

    private PreSignedUrlItem(Builder builder) {
        if (builder.eTag != null) {
            this.eTag = builder.eTag;
        }
        if (builder.partNumber != null) {
            this.partNumber = builder.partNumber;
        }
    }

    /**
     * Get eTag
     * @return eTag
    **/
    @JsonProperty("eTag")
    public String getETag() {
        return eTag;
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
        PreSignedUrlItem v0CatalogUploadPreSignedUrlItem = (PreSignedUrlItem) o;
        return Objects.equals(this.eTag, v0CatalogUploadPreSignedUrlItem.eTag) &&
            Objects.equals(this.partNumber, v0CatalogUploadPreSignedUrlItem.partNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eTag, partNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreSignedUrlItem {\n");
        
        sb.append("    eTag: ").append(toIndentedString(eTag)).append("\n");
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
        private String eTag;
        private Integer partNumber;

        private Builder() {}

        @JsonProperty("eTag")

        public Builder withETag(String eTag) {
            this.eTag = eTag;
            return this;
        }


        @JsonProperty("partNumber")

        public Builder withPartNumber(Integer partNumber) {
            this.partNumber = partNumber;
            return this;
        }


        public PreSignedUrlItem build() {
            return new PreSignedUrlItem(this);
        }
    }
}

