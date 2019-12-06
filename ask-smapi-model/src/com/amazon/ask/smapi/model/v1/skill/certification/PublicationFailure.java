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
 * Information about why the skill was not published in certain countries.
 */

@JsonDeserialize(builder = PublicationFailure.Builder.class)
public final class PublicationFailure {

    @JsonProperty("reason")
    private String reason = null;

    @JsonProperty("countries")
    private List<String> countries = new ArrayList<String>();

    public static Builder builder() {
        return new Builder();
    }

    private PublicationFailure(Builder builder) {
        if (builder.reason != null) {
            this.reason = builder.reason;
        }
        if (builder.countries != null) {
            this.countries = builder.countries;
        }
    }

    /**
     * Reason why Amazon did not publish the skill in certain countries.
     * @return reason
    **/
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * List of countries where Amazon did not publish the skill for a specific reason
     * @return countries
    **/
    @JsonProperty("countries")
    public List<String> getCountries() {
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
        PublicationFailure v1SkillCertificationPublicationFailure = (PublicationFailure) o;
        return Objects.equals(this.reason, v1SkillCertificationPublicationFailure.reason) &&
            Objects.equals(this.countries, v1SkillCertificationPublicationFailure.countries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, countries);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicationFailure {\n");
        
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
        private String reason;
        private List<String> countries;

        private Builder() {}

        @JsonProperty("reason")
        public Builder withReason(String reason) {
            this.reason = reason;
            return this;
        }


        @JsonProperty("countries")
        public Builder withCountries(List<String> countries) {
            this.countries = countries;
            return this;
        }

        public Builder addCountriesItem(String countriesItem) {
            if (this.countries == null) {
                this.countries = new ArrayList<String>();
            }
            this.countries.add(countriesItem);
            return this;
        }

        public PublicationFailure build() {
            return new PublicationFailure(this);
        }
    }
}

