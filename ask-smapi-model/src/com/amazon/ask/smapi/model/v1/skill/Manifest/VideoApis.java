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
 * Defines the structure for video api of the skill.
 */

@JsonDeserialize(builder = VideoApis.Builder.class)
public final class VideoApis {

    @JsonProperty("regions")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoRegion> regions = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoRegion>();

    @JsonProperty("locales")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoApisLocale> locales = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoApisLocale>();

    @JsonProperty("endpoint")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaEndpoint endpoint = null;

    @JsonProperty("countries")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCountryInfo> countries = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCountryInfo>();

    private VideoApis() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private VideoApis(Builder builder) {
        if (builder.regions != null) {
            this.regions = builder.regions;
        }
        if (builder.locales != null) {
            this.locales = builder.locales;
        }
        if (builder.endpoint != null) {
            this.endpoint = builder.endpoint;
        }
        if (builder.countries != null) {
            this.countries = builder.countries;
        }
    }

    /**
     * Defines the structure for region information.
     * @return regions
    **/
    @JsonProperty("regions")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoRegion> getRegions() {
        return regions;
    }


    /**
     * Defines the structure for the locale specific video api information.
     * @return locales
    **/
    @JsonProperty("locales")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoApisLocale> getLocales() {
        return locales;
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
     * Object that contains &amp;lt;country&amp;gt; Objects for each supported country.
     * @return countries
    **/
    @JsonProperty("countries")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCountryInfo> getCountries() {
        return countries;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoApis v1SkillManifestVideoApis = (VideoApis) o;
        return Objects.equals(this.regions, v1SkillManifestVideoApis.regions) &&
            Objects.equals(this.locales, v1SkillManifestVideoApis.locales) &&
            Objects.equals(this.endpoint, v1SkillManifestVideoApis.endpoint) &&
            Objects.equals(this.countries, v1SkillManifestVideoApis.countries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regions, locales, endpoint, countries);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoApis {\n");
        
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
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
        private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoRegion> regions;
        private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoApisLocale> locales;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaEndpoint endpoint;
        private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCountryInfo> countries;

        private Builder() {}

        @JsonProperty("regions")

        public Builder withRegions(Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoRegion> regions) {
            this.regions = regions;
            return this;
        }

        public Builder putRegionsItem(String key, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoRegion regionsItem) {
            if (this.regions == null) {
                this.regions = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoRegion>();
            }
            this.regions.put(key, regionsItem);
            return this;
        }

        @JsonProperty("locales")

        public Builder withLocales(Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoApisLocale> locales) {
            this.locales = locales;
            return this;
        }

        public Builder putLocalesItem(String key, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoApisLocale localesItem) {
            if (this.locales == null) {
                this.locales = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoApisLocale>();
            }
            this.locales.put(key, localesItem);
            return this;
        }

        @JsonProperty("endpoint")

        public Builder withEndpoint(com.amazon.ask.smapi.model.v1.skill.Manifest.LambdaEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }


        @JsonProperty("countries")

        public Builder withCountries(Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCountryInfo> countries) {
            this.countries = countries;
            return this;
        }

        public Builder putCountriesItem(String key, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCountryInfo countriesItem) {
            if (this.countries == null) {
                this.countries = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.VideoCountryInfo>();
            }
            this.countries.put(key, countriesItem);
            return this;
        }

        public VideoApis build() {
            return new VideoApis(this);
        }
    }
}

