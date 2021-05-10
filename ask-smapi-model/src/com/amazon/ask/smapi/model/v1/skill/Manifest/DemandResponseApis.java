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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the structure for demand response api of the skill.
 */

@JsonDeserialize(builder = DemandResponseApis.Builder.class)
public final class DemandResponseApis {

    @JsonProperty("regions")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion> regions = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion>();

    @JsonProperty("endpoint")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaEndpoint endpoint = null;

    @JsonProperty("enrollmentUrl")
    private String enrollmentUrl = null;

    public static Builder builder() {
        return new Builder();
    }

    private DemandResponseApis(Builder builder) {
        if (builder.regions != null) {
            this.regions = builder.regions;
        }
        if (builder.endpoint != null) {
            this.endpoint = builder.endpoint;
        }
        if (builder.enrollmentUrl != null) {
            this.enrollmentUrl = builder.enrollmentUrl;
        }
    }

    /**
     * Contains an array of the supported &amp;lt;region&amp;gt; Objects.
     * @return regions
    **/
    @JsonProperty("regions")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion> getRegions() {
        return regions;
    }


    /**
     * Get endpoint
     * @return endpoint
    **/
    @JsonProperty("endpoint")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaEndpoint getEndpoint() {
        return endpoint;
    }


    /**
     * Defines the url for enrolling into a demand response program.
     * @return enrollmentUrl
    **/
    @JsonProperty("enrollmentUrl")
    public String getEnrollmentUrl() {
        return enrollmentUrl;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DemandResponseApis v1SkillManifestDemandResponseApis = (DemandResponseApis) o;
        return Objects.equals(this.regions, v1SkillManifestDemandResponseApis.regions) &&
            Objects.equals(this.endpoint, v1SkillManifestDemandResponseApis.endpoint) &&
            Objects.equals(this.enrollmentUrl, v1SkillManifestDemandResponseApis.enrollmentUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regions, endpoint, enrollmentUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DemandResponseApis {\n");
        
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    enrollmentUrl: ").append(toIndentedString(enrollmentUrl)).append("\n");
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
        private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion> regions;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaEndpoint endpoint;
        private String enrollmentUrl;

        private Builder() {}

        @JsonProperty("regions")

        public Builder withRegions(Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion> regions) {
            this.regions = regions;
            return this;
        }

        public Builder putRegionsItem(String key, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion regionsItem) {
            if (this.regions == null) {
                this.regions = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaRegion>();
            }
            this.regions.put(key, regionsItem);
            return this;
        }

        @JsonProperty("endpoint")

        public Builder withEndpoint(com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }


        @JsonProperty("enrollmentUrl")

        public Builder withEnrollmentUrl(String enrollmentUrl) {
            this.enrollmentUrl = enrollmentUrl;
            return this;
        }


        public DemandResponseApis build() {
            return new DemandResponseApis(this);
        }
    }
}

