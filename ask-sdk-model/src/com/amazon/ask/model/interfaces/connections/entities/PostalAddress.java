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


package com.amazon.ask.model.interfaces.connections.entities;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Postal Address
 */

@JsonDeserialize(builder = PostalAddress.Builder.class)
public final class PostalAddress extends com.amazon.ask.model.interfaces.connections.entities.BaseEntity  {

    @JsonProperty("streetAddress")
    private String streetAddress = null;

    @JsonProperty("locality")
    private String locality = null;

    @JsonProperty("region")
    private String region = null;

    @JsonProperty("postalCode")
    private String postalCode = null;

    @JsonProperty("country")
    private String country = null;

    private PostalAddress() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private PostalAddress(Builder builder) {
        String discriminatorValue = "PostalAddress";

        this.type = discriminatorValue;
        if (builder.version != null) {
            this.version = builder.version;
        }
        if (builder.streetAddress != null) {
            this.streetAddress = builder.streetAddress;
        }
        if (builder.locality != null) {
            this.locality = builder.locality;
        }
        if (builder.region != null) {
            this.region = builder.region;
        }
        if (builder.postalCode != null) {
            this.postalCode = builder.postalCode;
        }
        if (builder.country != null) {
            this.country = builder.country;
        }
    }

    /**
     * street address
     * @return streetAddress
    **/
    @JsonProperty("streetAddress")
    public String getStreetAddress() {
        return streetAddress;
    }


    /**
     * locality/city
     * @return locality
    **/
    @JsonProperty("locality")
    public String getLocality() {
        return locality;
    }


    /**
     * state/region
     * @return region
    **/
    @JsonProperty("region")
    public String getRegion() {
        return region;
    }


    /**
     * postal/zip code
     * @return postalCode
    **/
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }


    /**
     * country
     * @return country
    **/
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostalAddress interfacesConnectionsEntitiesPostalAddress = (PostalAddress) o;
        return Objects.equals(this.streetAddress, interfacesConnectionsEntitiesPostalAddress.streetAddress) &&
            Objects.equals(this.locality, interfacesConnectionsEntitiesPostalAddress.locality) &&
            Objects.equals(this.region, interfacesConnectionsEntitiesPostalAddress.region) &&
            Objects.equals(this.postalCode, interfacesConnectionsEntitiesPostalAddress.postalCode) &&
            Objects.equals(this.country, interfacesConnectionsEntitiesPostalAddress.country) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetAddress, locality, region, postalCode, country, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostalAddress {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
        sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
        private String version;
        private String streetAddress;
        private String locality;
        private String region;
        private String postalCode;
        private String country;

        private Builder() {}

        @JsonProperty("@version")

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        @JsonProperty("streetAddress")

        public Builder withStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }


        @JsonProperty("locality")

        public Builder withLocality(String locality) {
            this.locality = locality;
            return this;
        }


        @JsonProperty("region")

        public Builder withRegion(String region) {
            this.region = region;
            return this;
        }


        @JsonProperty("postalCode")

        public Builder withPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }


        @JsonProperty("country")

        public Builder withCountry(String country) {
            this.country = country;
            return this;
        }


        public PostalAddress build() {
            return new PostalAddress(this);
        }
    }
}

