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
 * CreateContentUploadRequest
 */

@JsonDeserialize(builder = CreateContentUploadRequest.Builder.class)
public final class CreateContentUploadRequest {

    @JsonProperty("numberOfUploadParts")
    private Integer numberOfUploadParts = null;

    private CreateContentUploadRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private CreateContentUploadRequest(Builder builder) {
        if (builder.numberOfUploadParts != null) {
            this.numberOfUploadParts = builder.numberOfUploadParts;
        }
    }

    /**
     * Provides the number of parts the file will be split into. An equal number of presigned upload urls are generated in response to facilitate each part's upload.
     * @return numberOfUploadParts
    **/
    @JsonProperty("numberOfUploadParts")
    public Integer getNumberOfUploadParts() {
        return numberOfUploadParts;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateContentUploadRequest v0CatalogUploadCreateContentUploadRequest = (CreateContentUploadRequest) o;
        return Objects.equals(this.numberOfUploadParts, v0CatalogUploadCreateContentUploadRequest.numberOfUploadParts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfUploadParts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateContentUploadRequest {\n");
        
        sb.append("    numberOfUploadParts: ").append(toIndentedString(numberOfUploadParts)).append("\n");
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
        private Integer numberOfUploadParts;

        private Builder() {}

        @JsonProperty("numberOfUploadParts")

        public Builder withNumberOfUploadParts(Integer numberOfUploadParts) {
            this.numberOfUploadParts = numberOfUploadParts;
            return this;
        }


        public CreateContentUploadRequest build() {
            return new CreateContentUploadRequest(this);
        }
    }
}

