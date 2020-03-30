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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateContentUploadUrlRequest
 */

@JsonDeserialize(builder = CreateContentUploadUrlRequest.Builder.class)
public final class CreateContentUploadUrlRequest {

    @JsonProperty("numberOfUploadParts")
    private Integer numberOfUploadParts = null;

    public static Builder builder() {
        return new Builder();
    }

    private CreateContentUploadUrlRequest(Builder builder) {
        if (builder.numberOfUploadParts != null) {
            this.numberOfUploadParts = builder.numberOfUploadParts;
        }
    }

    /**
     * The number of parts the file will be split into. An equal number of presigned upload urls will be generated in response to facilitate each part's upload.
     * minimum: 1
     * maximum: 10000
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
        CreateContentUploadUrlRequest v1CatalogCreateContentUploadUrlRequest = (CreateContentUploadUrlRequest) o;
        return Objects.equals(this.numberOfUploadParts, v1CatalogCreateContentUploadUrlRequest.numberOfUploadParts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfUploadParts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateContentUploadUrlRequest {\n");
        
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


        public CreateContentUploadUrlRequest build() {
            return new CreateContentUploadUrlRequest(this);
        }
    }
}

