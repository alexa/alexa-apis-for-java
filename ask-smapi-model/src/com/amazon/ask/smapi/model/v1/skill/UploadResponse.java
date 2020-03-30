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


package com.amazon.ask.smapi.model.v1.skill;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the structure for skill upload response.
 */

@JsonDeserialize(builder = UploadResponse.Builder.class)
public final class UploadResponse {

    @JsonProperty("uploadUrl")
    private String uploadUrl = null;

    @JsonProperty("expiresAt")
    private OffsetDateTime expiresAt = null;

    public static Builder builder() {
        return new Builder();
    }

    private UploadResponse(Builder builder) {
        if (builder.uploadUrl != null) {
            this.uploadUrl = builder.uploadUrl;
        }
        if (builder.expiresAt != null) {
            this.expiresAt = builder.expiresAt;
        }
    }

    /**
     * The upload URL to upload a skill package.
     * @return uploadUrl
    **/
    @JsonProperty("uploadUrl")
    public String getUploadUrl() {
        return uploadUrl;
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
        UploadResponse v1SkillUploadResponse = (UploadResponse) o;
        return Objects.equals(this.uploadUrl, v1SkillUploadResponse.uploadUrl) &&
            Objects.equals(this.expiresAt, v1SkillUploadResponse.expiresAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadUrl, expiresAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadResponse {\n");
        
        sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
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
        private String uploadUrl;
        private OffsetDateTime expiresAt;

        private Builder() {}

        @JsonProperty("uploadUrl")

        public Builder withUploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }


        @JsonProperty("expiresAt")

        public Builder withExpiresAt(OffsetDateTime expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }


        public UploadResponse build() {
            return new UploadResponse(this);
        }
    }
}

