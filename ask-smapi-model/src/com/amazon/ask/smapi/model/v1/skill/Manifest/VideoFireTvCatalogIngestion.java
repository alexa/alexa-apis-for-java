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


package com.amazon.ask.smapi.model.v1.skill.Manifest;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VideoFireTvCatalogIngestion
 */

@JsonDeserialize(builder = VideoFireTvCatalogIngestion.Builder.class)
public final class VideoFireTvCatalogIngestion {

    @JsonProperty("fireTvCatalogIngestionSourceId")
    private String fireTvCatalogIngestionSourceId = null;

    @JsonProperty("isFireTvCatalogIngestionEnabled")
    private Boolean isFireTvCatalogIngestionEnabled = null;

    public static Builder builder() {
        return new Builder();
    }

    private VideoFireTvCatalogIngestion(Builder builder) {
        if (builder.fireTvCatalogIngestionSourceId != null) {
            this.fireTvCatalogIngestionSourceId = builder.fireTvCatalogIngestionSourceId;
        }
        if (builder.isFireTvCatalogIngestionEnabled != null) {
            this.isFireTvCatalogIngestionEnabled = builder.isFireTvCatalogIngestionEnabled;
        }
    }

    /**
     * Get fireTvCatalogIngestionSourceId
     * @return fireTvCatalogIngestionSourceId
    **/
    @JsonProperty("fireTvCatalogIngestionSourceId")
    public String getFireTvCatalogIngestionSourceId() {
        return fireTvCatalogIngestionSourceId;
    }


    /**
     * Get isFireTvCatalogIngestionEnabled
     * @return isFireTvCatalogIngestionEnabled
    **/
    @JsonProperty("isFireTvCatalogIngestionEnabled")
    public Boolean getIsFireTvCatalogIngestionEnabled() {
        return isFireTvCatalogIngestionEnabled;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoFireTvCatalogIngestion v1SkillManifestVideoFireTvCatalogIngestion = (VideoFireTvCatalogIngestion) o;
        return Objects.equals(this.fireTvCatalogIngestionSourceId, v1SkillManifestVideoFireTvCatalogIngestion.fireTvCatalogIngestionSourceId) &&
            Objects.equals(this.isFireTvCatalogIngestionEnabled, v1SkillManifestVideoFireTvCatalogIngestion.isFireTvCatalogIngestionEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fireTvCatalogIngestionSourceId, isFireTvCatalogIngestionEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoFireTvCatalogIngestion {\n");
        
        sb.append("    fireTvCatalogIngestionSourceId: ").append(toIndentedString(fireTvCatalogIngestionSourceId)).append("\n");
        sb.append("    isFireTvCatalogIngestionEnabled: ").append(toIndentedString(isFireTvCatalogIngestionEnabled)).append("\n");
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
        private String fireTvCatalogIngestionSourceId;
        private Boolean isFireTvCatalogIngestionEnabled;

        private Builder() {}

        @JsonProperty("fireTvCatalogIngestionSourceId")

        public Builder withFireTvCatalogIngestionSourceId(String fireTvCatalogIngestionSourceId) {
            this.fireTvCatalogIngestionSourceId = fireTvCatalogIngestionSourceId;
            return this;
        }


        @JsonProperty("isFireTvCatalogIngestionEnabled")

        public Builder withIsFireTvCatalogIngestionEnabled(Boolean isFireTvCatalogIngestionEnabled) {
            this.isFireTvCatalogIngestionEnabled = isFireTvCatalogIngestionEnabled;
            return this;
        }


        public VideoFireTvCatalogIngestion build() {
            return new VideoFireTvCatalogIngestion(this);
        }
    }
}

