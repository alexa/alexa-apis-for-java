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
import java.math.BigDecimal;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Paid skill product pricing information.
 */

@JsonDeserialize(builder = MarketplacePricing.Builder.class)
public final class MarketplacePricing {

    @JsonProperty("offerType")
    private String offerType = null;

    @JsonProperty("price")
    private BigDecimal price = null;

    @JsonProperty("currency")
    private String currency = null;

    @JsonProperty("freeTrialInformation")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.FreeTrialInformation freeTrialInformation = null;

    @JsonProperty("subscriptionInformation")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.SubscriptionInformation subscriptionInformation = null;

    public static Builder builder() {
        return new Builder();
    }

    private MarketplacePricing(Builder builder) {
        if (builder.offerType != null) {
            this.offerType = builder.offerType;
        }
        if (builder.price != null) {
            this.price = builder.price;
        }
        if (builder.currency != null) {
            this.currency = builder.currency;
        }
        if (builder.freeTrialInformation != null) {
            this.freeTrialInformation = builder.freeTrialInformation;
        }
        if (builder.subscriptionInformation != null) {
            this.subscriptionInformation = builder.subscriptionInformation;
        }
    }

    /**
     * Get offerType
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getOfferTypeAsString().
     *
     * @return offerType
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Manifest.OfferType getOfferType() {
        return com.amazon.ask.smapi.model.v1.skill.Manifest.OfferType.fromValue(offerType);
    }

    /**
     * Get the underlying String value for offerType.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return offerType as a String value
    **/
    @JsonProperty("offerType")
    public String getOfferTypeAsString() {
      return offerType;
    }

    /**
     * Defines the price of a paid skill product. The price should be your suggested price, not including any VAT or similar taxes. Taxes are included in the final price to end users.
     * @return price
    **/
    @JsonProperty("price")
    public BigDecimal getPrice() {
        return price;
    }


    /**
     * Get currency
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getCurrencyAsString().
     *
     * @return currency
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Manifest.Currency getCurrency() {
        return com.amazon.ask.smapi.model.v1.skill.Manifest.Currency.fromValue(currency);
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

    /**
     * Get freeTrialInformation
     * @return freeTrialInformation
    **/
    @JsonProperty("freeTrialInformation")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.FreeTrialInformation getFreeTrialInformation() {
        return freeTrialInformation;
    }


    /**
     * Get subscriptionInformation
     * @return subscriptionInformation
    **/
    @JsonProperty("subscriptionInformation")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.SubscriptionInformation getSubscriptionInformation() {
        return subscriptionInformation;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarketplacePricing v1SkillManifestMarketplacePricing = (MarketplacePricing) o;
        return Objects.equals(this.offerType, v1SkillManifestMarketplacePricing.offerType) &&
            Objects.equals(this.price, v1SkillManifestMarketplacePricing.price) &&
            Objects.equals(this.currency, v1SkillManifestMarketplacePricing.currency) &&
            Objects.equals(this.freeTrialInformation, v1SkillManifestMarketplacePricing.freeTrialInformation) &&
            Objects.equals(this.subscriptionInformation, v1SkillManifestMarketplacePricing.subscriptionInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offerType, price, currency, freeTrialInformation, subscriptionInformation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarketplacePricing {\n");
        
        sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    freeTrialInformation: ").append(toIndentedString(freeTrialInformation)).append("\n");
        sb.append("    subscriptionInformation: ").append(toIndentedString(subscriptionInformation)).append("\n");
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
        private String offerType;
        private BigDecimal price;
        private String currency;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.FreeTrialInformation freeTrialInformation;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.SubscriptionInformation subscriptionInformation;

        private Builder() {}

        @JsonProperty("offerType")
        public Builder withOfferType(String offerType) {
          this.offerType = offerType;
          return this;
        }

        public Builder withOfferType(com.amazon.ask.smapi.model.v1.skill.Manifest.OfferType offerType) {
            this.offerType = offerType != null ? offerType.toString() : null;
            return this;
        }


        @JsonProperty("price")

        public Builder withPrice(BigDecimal price) {
            this.price = price;
            return this;
        }


        @JsonProperty("currency")
        public Builder withCurrency(String currency) {
          this.currency = currency;
          return this;
        }

        public Builder withCurrency(com.amazon.ask.smapi.model.v1.skill.Manifest.Currency currency) {
            this.currency = currency != null ? currency.toString() : null;
            return this;
        }


        @JsonProperty("freeTrialInformation")

        public Builder withFreeTrialInformation(com.amazon.ask.smapi.model.v1.skill.Manifest.FreeTrialInformation freeTrialInformation) {
            this.freeTrialInformation = freeTrialInformation;
            return this;
        }


        @JsonProperty("subscriptionInformation")

        public Builder withSubscriptionInformation(com.amazon.ask.smapi.model.v1.skill.Manifest.SubscriptionInformation subscriptionInformation) {
            this.subscriptionInformation = subscriptionInformation;
            return this;
        }


        public MarketplacePricing build() {
            return new MarketplacePricing(this);
        }
    }
}

