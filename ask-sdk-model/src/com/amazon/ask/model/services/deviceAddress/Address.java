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


package com.amazon.ask.model.services.deviceAddress;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the full address response from the service.
 */

@JsonDeserialize(builder = Address.Builder.class)
public final class Address {

    @JsonProperty("addressLine1")
    private String addressLine1 = null;

    @JsonProperty("addressLine2")
    private String addressLine2 = null;

    @JsonProperty("addressLine3")
    private String addressLine3 = null;

    @JsonProperty("countryCode")
    private String countryCode = null;

    @JsonProperty("stateOrRegion")
    private String stateOrRegion = null;

    @JsonProperty("city")
    private String city = null;

    @JsonProperty("districtOrCounty")
    private String districtOrCounty = null;

    @JsonProperty("postalCode")
    private String postalCode = null;

    private Address() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Address(Builder builder) {
        if (builder.addressLine1 != null) {
            this.addressLine1 = builder.addressLine1;
        }
        if (builder.addressLine2 != null) {
            this.addressLine2 = builder.addressLine2;
        }
        if (builder.addressLine3 != null) {
            this.addressLine3 = builder.addressLine3;
        }
        if (builder.countryCode != null) {
            this.countryCode = builder.countryCode;
        }
        if (builder.stateOrRegion != null) {
            this.stateOrRegion = builder.stateOrRegion;
        }
        if (builder.city != null) {
            this.city = builder.city;
        }
        if (builder.districtOrCounty != null) {
            this.districtOrCounty = builder.districtOrCounty;
        }
        if (builder.postalCode != null) {
            this.postalCode = builder.postalCode;
        }
    }

    /**
     * Get addressLine1
     * @return addressLine1
    **/
    @JsonProperty("addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }


    /**
     * Get addressLine2
     * @return addressLine2
    **/
    @JsonProperty("addressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }


    /**
     * Get addressLine3
     * @return addressLine3
    **/
    @JsonProperty("addressLine3")
    public String getAddressLine3() {
        return addressLine3;
    }


    /**
     * Get countryCode
     * @return countryCode
    **/
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }


    /**
     * Get stateOrRegion
     * @return stateOrRegion
    **/
    @JsonProperty("stateOrRegion")
    public String getStateOrRegion() {
        return stateOrRegion;
    }


    /**
     * Get city
     * @return city
    **/
    @JsonProperty("city")
    public String getCity() {
        return city;
    }


    /**
     * Get districtOrCounty
     * @return districtOrCounty
    **/
    @JsonProperty("districtOrCounty")
    public String getDistrictOrCounty() {
        return districtOrCounty;
    }


    /**
     * Get postalCode
     * @return postalCode
    **/
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address servicesDeviceAddressAddress = (Address) o;
        return Objects.equals(this.addressLine1, servicesDeviceAddressAddress.addressLine1) &&
            Objects.equals(this.addressLine2, servicesDeviceAddressAddress.addressLine2) &&
            Objects.equals(this.addressLine3, servicesDeviceAddressAddress.addressLine3) &&
            Objects.equals(this.countryCode, servicesDeviceAddressAddress.countryCode) &&
            Objects.equals(this.stateOrRegion, servicesDeviceAddressAddress.stateOrRegion) &&
            Objects.equals(this.city, servicesDeviceAddressAddress.city) &&
            Objects.equals(this.districtOrCounty, servicesDeviceAddressAddress.districtOrCounty) &&
            Objects.equals(this.postalCode, servicesDeviceAddressAddress.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressLine1, addressLine2, addressLine3, countryCode, stateOrRegion, city, districtOrCounty, postalCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Address {\n");
        
        sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
        sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
        sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    stateOrRegion: ").append(toIndentedString(stateOrRegion)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    districtOrCounty: ").append(toIndentedString(districtOrCounty)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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
        private String addressLine1;
        private String addressLine2;
        private String addressLine3;
        private String countryCode;
        private String stateOrRegion;
        private String city;
        private String districtOrCounty;
        private String postalCode;

        private Builder() {}

        @JsonProperty("addressLine1")

        public Builder withAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }


        @JsonProperty("addressLine2")

        public Builder withAddressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }


        @JsonProperty("addressLine3")

        public Builder withAddressLine3(String addressLine3) {
            this.addressLine3 = addressLine3;
            return this;
        }


        @JsonProperty("countryCode")

        public Builder withCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }


        @JsonProperty("stateOrRegion")

        public Builder withStateOrRegion(String stateOrRegion) {
            this.stateOrRegion = stateOrRegion;
            return this;
        }


        @JsonProperty("city")

        public Builder withCity(String city) {
            this.city = city;
            return this;
        }


        @JsonProperty("districtOrCounty")

        public Builder withDistrictOrCounty(String districtOrCounty) {
            this.districtOrCounty = districtOrCounty;
            return this;
        }


        @JsonProperty("postalCode")

        public Builder withPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }


        public Address build() {
            return new Address(this);
        }
    }
}

