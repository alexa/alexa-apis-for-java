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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the structure of the GetExport response.
 */

@JsonDeserialize(builder = ExportResponseSkill.Builder.class)
public final class ExportResponseSkill {

    @JsonProperty("eTag")
    private String eTag = null;

    @JsonProperty("location")
    private String location = null;

    @JsonProperty("expiresAt")
    private String expiresAt = null;

    private ExportResponseSkill() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ExportResponseSkill(Builder builder) {
        if (builder.eTag != null) {
            this.eTag = builder.eTag;
        }
        if (builder.location != null) {
            this.location = builder.location;
        }
        if (builder.expiresAt != null) {
            this.expiresAt = builder.expiresAt;
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
     * Get location
     * @return location
    **/
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }


    /**
     * ExpiresAt timestamp in milliseconds.
     * @return expiresAt
    **/
    @JsonProperty("expiresAt")
    public String getExpiresAt() {
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
        ExportResponseSkill v1SkillExportResponseSkill = (ExportResponseSkill) o;
        return Objects.equals(this.eTag, v1SkillExportResponseSkill.eTag) &&
            Objects.equals(this.location, v1SkillExportResponseSkill.location) &&
            Objects.equals(this.expiresAt, v1SkillExportResponseSkill.expiresAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eTag, location, expiresAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportResponseSkill {\n");
        
        sb.append("    eTag: ").append(toIndentedString(eTag)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
        private String eTag;
        private String location;
        private String expiresAt;

        private Builder() {}

        @JsonProperty("eTag")

        public Builder withETag(String eTag) {
            this.eTag = eTag;
            return this;
        }


        @JsonProperty("location")

        public Builder withLocation(String location) {
            this.location = location;
            return this;
        }


        @JsonProperty("expiresAt")

        public Builder withExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }


        public ExportResponseSkill build() {
            return new ExportResponseSkill(this);
        }
    }
}

