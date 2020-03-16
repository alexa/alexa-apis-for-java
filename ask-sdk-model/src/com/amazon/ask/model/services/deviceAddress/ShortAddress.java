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
 * ShortAddress
 */

@JsonDeserialize(builder = ShortAddress.Builder.class)
public final class ShortAddress {

    @JsonProperty("countryCode")
    private String countryCode = null;

    @JsonProperty("postalCode")
    private String postalCode = null;

    public static Builder builder() {
        return new Builder();
    }

    private ShortAddress(Builder builder) {
        if (builder.countryCode != null) {
            this.countryCode = builder.countryCode;
        }
        if (builder.postalCode != null) {
            this.postalCode = builder.postalCode;
        }
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
        ShortAddress servicesDeviceAddressShortAddress = (ShortAddress) o;
        return Objects.equals(this.countryCode, servicesDeviceAddressShortAddress.countryCode) &&
            Objects.equals(this.postalCode, servicesDeviceAddressShortAddress.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode, postalCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShortAddress {\n");
        
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
        private String countryCode;
        private String postalCode;

        private Builder() {}

        @JsonProperty("countryCode")

        public Builder withCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }


        @JsonProperty("postalCode")

        public Builder withPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }


        public ShortAddress build() {
            return new ShortAddress(this);
        }
    }
}

