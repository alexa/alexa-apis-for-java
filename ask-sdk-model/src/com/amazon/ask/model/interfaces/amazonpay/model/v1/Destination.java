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


package com.amazon.ask.model.interfaces.amazonpay.model.v1;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Destination object containing the details of an Address.
 */

@JsonDeserialize(builder = Destination.Builder.class)
public final class Destination {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("companyName")
    private String companyName = null;

    @JsonProperty("addressLine1")
    private String addressLine1 = null;

    @JsonProperty("addressLine2")
    private String addressLine2 = null;

    @JsonProperty("addressLine3")
    private String addressLine3 = null;

    @JsonProperty("city")
    private String city = null;

    @JsonProperty("districtOrCounty")
    private String districtOrCounty = null;

    @JsonProperty("stateOrRegion")
    private String stateOrRegion = null;

    @JsonProperty("postalCode")
    private String postalCode = null;

    @JsonProperty("countryCode")
    private String countryCode = null;

    @JsonProperty("phone")
    private String phone = null;

    private Destination() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Destination(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.companyName != null) {
            this.companyName = builder.companyName;
        }
        if (builder.addressLine1 != null) {
            this.addressLine1 = builder.addressLine1;
        }
        if (builder.addressLine2 != null) {
            this.addressLine2 = builder.addressLine2;
        }
        if (builder.addressLine3 != null) {
            this.addressLine3 = builder.addressLine3;
        }
        if (builder.city != null) {
            this.city = builder.city;
        }
        if (builder.districtOrCounty != null) {
            this.districtOrCounty = builder.districtOrCounty;
        }
        if (builder.stateOrRegion != null) {
            this.stateOrRegion = builder.stateOrRegion;
        }
        if (builder.postalCode != null) {
            this.postalCode = builder.postalCode;
        }
        if (builder.countryCode != null) {
            this.countryCode = builder.countryCode;
        }
        if (builder.phone != null) {
            this.phone = builder.phone;
        }
    }

    /**
     * The name or business name
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * The company name
     * @return companyName
    **/
    @JsonProperty("companyName")
    public String getCompanyName() {
        return companyName;
    }


    /**
     * The first line of the address. At least one AddressLine (AddressLine1, AddressLine2, or AddressLine3) is required.
     * @return addressLine1
    **/
    @JsonProperty("addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }


    /**
     * The second line of the address. At least one AddressLine (AddressLine1, AddressLine2, or AddressLine3) is required.
     * @return addressLine2
    **/
    @JsonProperty("addressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }


    /**
     * The third line of the address. At least one AddressLine (AddressLine1, AddressLine2, or AddressLine3) is required.
     * @return addressLine3
    **/
    @JsonProperty("addressLine3")
    public String getAddressLine3() {
        return addressLine3;
    }


    /**
     * The city
     * @return city
    **/
    @JsonProperty("city")
    public String getCity() {
        return city;
    }


    /**
     * The district or County
     * @return districtOrCounty
    **/
    @JsonProperty("districtOrCounty")
    public String getDistrictOrCounty() {
        return districtOrCounty;
    }


    /**
     * The state or region. This element is free text and can be either a 2-character code, fully spelled out, or abbreviated. Required. Note :- This response element is returned only in the U.S.
     * @return stateOrRegion
    **/
    @JsonProperty("stateOrRegion")
    public String getStateOrRegion() {
        return stateOrRegion;
    }


    /**
     * The postal code.
     * @return postalCode
    **/
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }


    /**
     * The country code, in ISO 3166 format
     * @return countryCode
    **/
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }


    /**
     * The phone number
     * @return phone
    **/
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Destination interfacesAmazonpayModelV1Destination = (Destination) o;
        return Objects.equals(this.name, interfacesAmazonpayModelV1Destination.name) &&
            Objects.equals(this.companyName, interfacesAmazonpayModelV1Destination.companyName) &&
            Objects.equals(this.addressLine1, interfacesAmazonpayModelV1Destination.addressLine1) &&
            Objects.equals(this.addressLine2, interfacesAmazonpayModelV1Destination.addressLine2) &&
            Objects.equals(this.addressLine3, interfacesAmazonpayModelV1Destination.addressLine3) &&
            Objects.equals(this.city, interfacesAmazonpayModelV1Destination.city) &&
            Objects.equals(this.districtOrCounty, interfacesAmazonpayModelV1Destination.districtOrCounty) &&
            Objects.equals(this.stateOrRegion, interfacesAmazonpayModelV1Destination.stateOrRegion) &&
            Objects.equals(this.postalCode, interfacesAmazonpayModelV1Destination.postalCode) &&
            Objects.equals(this.countryCode, interfacesAmazonpayModelV1Destination.countryCode) &&
            Objects.equals(this.phone, interfacesAmazonpayModelV1Destination.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, companyName, addressLine1, addressLine2, addressLine3, city, districtOrCounty, stateOrRegion, postalCode, countryCode, phone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Destination {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
        sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
        sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    districtOrCounty: ").append(toIndentedString(districtOrCounty)).append("\n");
        sb.append("    stateOrRegion: ").append(toIndentedString(stateOrRegion)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
        private String name;
        private String companyName;
        private String addressLine1;
        private String addressLine2;
        private String addressLine3;
        private String city;
        private String districtOrCounty;
        private String stateOrRegion;
        private String postalCode;
        private String countryCode;
        private String phone;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("companyName")

        public Builder withCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }


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


        @JsonProperty("stateOrRegion")

        public Builder withStateOrRegion(String stateOrRegion) {
            this.stateOrRegion = stateOrRegion;
            return this;
        }


        @JsonProperty("postalCode")

        public Builder withPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }


        @JsonProperty("countryCode")

        public Builder withCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }


        @JsonProperty("phone")

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }


        public Destination build() {
            return new Destination(this);
        }
    }
}

