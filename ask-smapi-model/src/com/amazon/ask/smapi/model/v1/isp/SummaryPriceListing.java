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


package com.amazon.ask.smapi.model.v1.isp;

import java.util.Objects;
import java.math.BigDecimal;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Price listing information for in-skill product.
 */

@JsonDeserialize(builder = SummaryPriceListing.Builder.class)
public final class SummaryPriceListing {

    @JsonProperty("price")
    private BigDecimal price = null;

    @JsonProperty("primeMemberPrice")
    private BigDecimal primeMemberPrice = null;

    @JsonProperty("currency")
    private String currency = null;

    private SummaryPriceListing() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SummaryPriceListing(Builder builder) {
        if (builder.price != null) {
            this.price = builder.price;
        }
        if (builder.primeMemberPrice != null) {
            this.primeMemberPrice = builder.primeMemberPrice;
        }
        if (builder.currency != null) {
            this.currency = builder.currency;
        }
    }

    /**
     * The price of an in-skill product.
     * @return price
    **/
    @JsonProperty("price")
    public BigDecimal getPrice() {
        return price;
    }


    /**
     * The prime price of an in-skill product.
     * @return primeMemberPrice
    **/
    @JsonProperty("primeMemberPrice")
    public BigDecimal getPrimeMemberPrice() {
        return primeMemberPrice;
    }


    /**
     * Get currency
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getCurrencyAsString().
     *
     * @return currency
    **/
    
    public com.amazon.ask.smapi.model.v1.isp.Currency getCurrency() {
        return com.amazon.ask.smapi.model.v1.isp.Currency.fromValue(currency);
    }

    /**
     * Get the underlying String value for currency.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return currency as a String value
    **/
    @JsonProperty("currency")
    public String getCurrencyAsString() {
      return currency;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SummaryPriceListing v1IspSummaryPriceListing = (SummaryPriceListing) o;
        return Objects.equals(this.price, v1IspSummaryPriceListing.price) &&
            Objects.equals(this.primeMemberPrice, v1IspSummaryPriceListing.primeMemberPrice) &&
            Objects.equals(this.currency, v1IspSummaryPriceListing.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, primeMemberPrice, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SummaryPriceListing {\n");
        
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    primeMemberPrice: ").append(toIndentedString(primeMemberPrice)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
        private BigDecimal price;
        private BigDecimal primeMemberPrice;
        private String currency;

        private Builder() {}

        @JsonProperty("price")

        public Builder withPrice(BigDecimal price) {
            this.price = price;
            return this;
        }


        @JsonProperty("primeMemberPrice")

        public Builder withPrimeMemberPrice(BigDecimal primeMemberPrice) {
            this.primeMemberPrice = primeMemberPrice;
            return this;
        }


        @JsonProperty("currency")

        public Builder withCurrency(String currency) {
          this.currency = currency;
          return this;
        }

        public Builder withCurrency(com.amazon.ask.smapi.model.v1.isp.Currency currency) {
            this.currency = currency != null ? currency.toString() : null;
            return this;
        }


        public SummaryPriceListing build() {
            return new SummaryPriceListing(this);
        }
    }
}

