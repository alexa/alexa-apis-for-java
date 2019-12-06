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
 * VideoCatalogInfo
 */

@JsonDeserialize(builder = VideoCatalogInfo.Builder.class)
public final class VideoCatalogInfo {

    @JsonProperty("sourceId")
    private String sourceId = null;

    public static Builder builder() {
        return new Builder();
    }

    private VideoCatalogInfo(Builder builder) {
        if (builder.sourceId != null) {
            this.sourceId = builder.sourceId;
        }
    }

    /**
     * Get sourceId
     * @return sourceId
    **/
    @JsonProperty("sourceId")
    public String getSourceId() {
        return sourceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoCatalogInfo v1SkillManifestVideoCatalogInfo = (VideoCatalogInfo) o;
        return Objects.equals(this.sourceId, v1SkillManifestVideoCatalogInfo.sourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoCatalogInfo {\n");
        
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
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
        private String sourceId;

        private Builder() {}

        @JsonProperty("sourceId")
        public Builder withSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }


        public VideoCatalogInfo build() {
            return new VideoCatalogInfo(this);
        }
    }
}

