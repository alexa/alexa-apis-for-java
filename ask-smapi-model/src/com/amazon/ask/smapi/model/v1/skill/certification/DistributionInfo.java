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


package com.amazon.ask.smapi.model.v1.skill.certification;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * The distribution information for skill where Amazon distributed the skill
 */

@JsonDeserialize(builder = DistributionInfo.Builder.class)
public final class DistributionInfo {

    @JsonProperty("publishedCountries")
    private List<String> publishedCountries = new ArrayList<String>();

    @JsonProperty("publicationFailures")
    private List<com.amazon.ask.smapi.model.v1.skill.certification.PublicationFailure> publicationFailures = new ArrayList<com.amazon.ask.smapi.model.v1.skill.certification.PublicationFailure>();

    public static Builder builder() {
        return new Builder();
    }

    private DistributionInfo(Builder builder) {
        if (builder.publishedCountries != null) {
            this.publishedCountries = builder.publishedCountries;
        }
        if (builder.publicationFailures != null) {
            this.publicationFailures = builder.publicationFailures;
        }
    }

    /**
     * All countries where the skill was published in by Amazon.
     * @return publishedCountries
    **/
    @JsonProperty("publishedCountries")
    public List<String> getPublishedCountries() {
        return publishedCountries;
    }

    /**
     * Get publicationFailures
     * @return publicationFailures
    **/
    @JsonProperty("publicationFailures")
    public List<com.amazon.ask.smapi.model.v1.skill.certification.PublicationFailure> getPublicationFailures() {
        return publicationFailures;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DistributionInfo v1SkillCertificationDistributionInfo = (DistributionInfo) o;
        return Objects.equals(this.publishedCountries, v1SkillCertificationDistributionInfo.publishedCountries) &&
            Objects.equals(this.publicationFailures, v1SkillCertificationDistributionInfo.publicationFailures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishedCountries, publicationFailures);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DistributionInfo {\n");
        
        sb.append("    publishedCountries: ").append(toIndentedString(publishedCountries)).append("\n");
        sb.append("    publicationFailures: ").append(toIndentedString(publicationFailures)).append("\n");
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
        private List<String> publishedCountries;
        private List<com.amazon.ask.smapi.model.v1.skill.certification.PublicationFailure> publicationFailures;

        private Builder() {}

        @JsonProperty("publishedCountries")
        public Builder withPublishedCountries(List<String> publishedCountries) {
            this.publishedCountries = publishedCountries;
            return this;
        }

        public Builder addPublishedCountriesItem(String publishedCountriesItem) {
            if (this.publishedCountries == null) {
                this.publishedCountries = new ArrayList<String>();
            }
            this.publishedCountries.add(publishedCountriesItem);
            return this;
        }

        @JsonProperty("publicationFailures")
        public Builder withPublicationFailures(List<com.amazon.ask.smapi.model.v1.skill.certification.PublicationFailure> publicationFailures) {
            this.publicationFailures = publicationFailures;
            return this;
        }

        public Builder addPublicationFailuresItem(com.amazon.ask.smapi.model.v1.skill.certification.PublicationFailure publicationFailuresItem) {
            if (this.publicationFailures == null) {
                this.publicationFailures = new ArrayList<com.amazon.ask.smapi.model.v1.skill.certification.PublicationFailure>();
            }
            this.publicationFailures.add(publicationFailuresItem);
            return this;
        }

        public DistributionInfo build() {
            return new DistributionInfo(this);
        }
    }
}

