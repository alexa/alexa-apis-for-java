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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Defines the structure of per-country video info in the skill manifest.
 */

@JsonDeserialize(builder = VideoCountryInfo.Builder.class)
public final class VideoCountryInfo {

    @JsonProperty("catalogInformation")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCatalogInfo> catalogInformation = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCatalogInfo>();

    private VideoCountryInfo() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private VideoCountryInfo(Builder builder) {
        if (builder.catalogInformation != null) {
            this.catalogInformation = builder.catalogInformation;
        }
    }

    /**
     * Get catalogInformation
     * @return catalogInformation
    **/
    @JsonProperty("catalogInformation")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCatalogInfo> getCatalogInformation() {
        return catalogInformation;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoCountryInfo v1SkillManifestVideoCountryInfo = (VideoCountryInfo) o;
        return Objects.equals(this.catalogInformation, v1SkillManifestVideoCountryInfo.catalogInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogInformation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoCountryInfo {\n");
        
        sb.append("    catalogInformation: ").append(toIndentedString(catalogInformation)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCatalogInfo> catalogInformation;

        private Builder() {}

        @JsonProperty("catalogInformation")

        public Builder withCatalogInformation(List<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCatalogInfo> catalogInformation) {
            this.catalogInformation = catalogInformation;
            return this;
        }

        public Builder addCatalogInformationItem(com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCatalogInfo catalogInformationItem) {
            if (this.catalogInformation == null) {
                this.catalogInformation = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCatalogInfo>();
            }
            this.catalogInformation.add(catalogInformationItem);
            return this;
        }

        public VideoCountryInfo build() {
            return new VideoCountryInfo(this);
        }
    }
}

