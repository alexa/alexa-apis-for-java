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


package com.amazon.ask.smapi.model.v1.skill.resourceSchema;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetResourceSchemaResponse
 */

@JsonDeserialize(builder = GetResourceSchemaResponse.Builder.class)
public final class GetResourceSchemaResponse {

    @JsonProperty("schemaLocationUrl")
    private String schemaLocationUrl = null;

    @JsonProperty("expiryTime")
    private OffsetDateTime expiryTime = null;

    public static Builder builder() {
        return new Builder();
    }

    private GetResourceSchemaResponse(Builder builder) {
        if (builder.schemaLocationUrl != null) {
            this.schemaLocationUrl = builder.schemaLocationUrl;
        }
        if (builder.expiryTime != null) {
            this.expiryTime = builder.expiryTime;
        }
    }

    /**
     * S3 presigned URL to schema location.
     * @return schemaLocationUrl
    **/
    @JsonProperty("schemaLocationUrl")
    public String getSchemaLocationUrl() {
        return schemaLocationUrl;
    }


    /**
     * Timestamp when the schema location url expires in ISO 8601 format.
     * @return expiryTime
    **/
    @JsonProperty("expiryTime")
    public OffsetDateTime getExpiryTime() {
        return expiryTime;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetResourceSchemaResponse v1SkillResourceSchemaGetResourceSchemaResponse = (GetResourceSchemaResponse) o;
        return Objects.equals(this.schemaLocationUrl, v1SkillResourceSchemaGetResourceSchemaResponse.schemaLocationUrl) &&
            Objects.equals(this.expiryTime, v1SkillResourceSchemaGetResourceSchemaResponse.expiryTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaLocationUrl, expiryTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetResourceSchemaResponse {\n");
        
        sb.append("    schemaLocationUrl: ").append(toIndentedString(schemaLocationUrl)).append("\n");
        sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
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
        private String schemaLocationUrl;
        private OffsetDateTime expiryTime;

        private Builder() {}

        @JsonProperty("schemaLocationUrl")

        public Builder withSchemaLocationUrl(String schemaLocationUrl) {
            this.schemaLocationUrl = schemaLocationUrl;
            return this;
        }


        @JsonProperty("expiryTime")

        public Builder withExpiryTime(OffsetDateTime expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }


        public GetResourceSchemaResponse build() {
            return new GetResourceSchemaResponse(this);
        }
    }
}

