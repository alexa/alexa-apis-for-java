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
 * Defines the structure for regional information.
 */

@JsonDeserialize(builder = Region.Builder.class)
public final class Region {

    @JsonProperty("endpoint")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint endpoint = null;

    private Region() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Region(Builder builder) {
        if (builder.endpoint != null) {
            this.endpoint = builder.endpoint;
        }
    }

    /**
     * Get endpoint
     * @return endpoint
    **/
    @JsonProperty("endpoint")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint getEndpoint() {
        return endpoint;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Region v1SkillManifestRegion = (Region) o;
        return Objects.equals(this.endpoint, v1SkillManifestRegion.endpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Region {\n");
        
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint endpoint;

        private Builder() {}

        @JsonProperty("endpoint")

        public Builder withEndpoint(com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }


        public Region build() {
            return new Region(this);
        }
    }
}

