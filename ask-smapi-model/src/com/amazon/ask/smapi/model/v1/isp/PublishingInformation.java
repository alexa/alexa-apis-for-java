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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Defines the structure for in-skill product publishing information.
 */

@JsonDeserialize(builder = PublishingInformation.Builder.class)
public final class PublishingInformation {

    @JsonProperty("locales")
    private Map<String, com.amazon.ask.smapi.model.v1.isp.LocalizedPublishingInformation> locales = new HashMap<String, com.amazon.ask.smapi.model.v1.isp.LocalizedPublishingInformation>();

    @JsonProperty("distributionCountries")
    private List<com.amazon.ask.smapi.model.v1.isp.DistributionCountries> distributionCountries = new ArrayList<com.amazon.ask.smapi.model.v1.isp.DistributionCountries>();

    @JsonProperty("pricing")
    private Map<String, com.amazon.ask.smapi.model.v1.isp.MarketplacePricing> pricing = new HashMap<String, com.amazon.ask.smapi.model.v1.isp.MarketplacePricing>();

    @JsonProperty("taxInformation")
    private com.amazon.ask.smapi.model.v1.isp.TaxInformation taxInformation = null;

    public static Builder builder() {
        return new Builder();
    }

    private PublishingInformation(Builder builder) {
        if (builder.locales != null) {
            this.locales = builder.locales;
        }
        if (builder.distributionCountries != null) {
            this.distributionCountries = builder.distributionCountries;
        }
        if (builder.pricing != null) {
            this.pricing = builder.pricing;
        }
        if (builder.taxInformation != null) {
            this.taxInformation = builder.taxInformation;
        }
    }

    /**
     * Defines the structure for locale specific publishing information for an in-skill product.
     * @return locales
    **/
    @JsonProperty("locales")
    public Map<String, com.amazon.ask.smapi.model.v1.isp.LocalizedPublishingInformation> getLocales() {
        return locales;
    }


    /**
     * List of countries where the in-skill product is available.
     * @return distributionCountries
    **/
    @JsonProperty("distributionCountries")
    public List<com.amazon.ask.smapi.model.v1.isp.DistributionCountries> getDistributionCountries() {
        return distributionCountries;
    }


    /**
     * Defines the structure for in-skill product pricing.
     * @return pricing
    **/
    @JsonProperty("pricing")
    public Map<String, com.amazon.ask.smapi.model.v1.isp.MarketplacePricing> getPricing() {
        return pricing;
    }


    /**
     * Get taxInformation
     * @return taxInformation
    **/
    @JsonProperty("taxInformation")
    public com.amazon.ask.smapi.model.v1.isp.TaxInformation getTaxInformation() {
        return taxInformation;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublishingInformation v1IspPublishingInformation = (PublishingInformation) o;
        return Objects.equals(this.locales, v1IspPublishingInformation.locales) &&
            Objects.equals(this.distributionCountries, v1IspPublishingInformation.distributionCountries) &&
            Objects.equals(this.pricing, v1IspPublishingInformation.pricing) &&
            Objects.equals(this.taxInformation, v1IspPublishingInformation.taxInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locales, distributionCountries, pricing, taxInformation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishingInformation {\n");
        
        sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
        sb.append("    distributionCountries: ").append(toIndentedString(distributionCountries)).append("\n");
        sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
        sb.append("    taxInformation: ").append(toIndentedString(taxInformation)).append("\n");
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
        private Map<String, com.amazon.ask.smapi.model.v1.isp.LocalizedPublishingInformation> locales;
        private List<com.amazon.ask.smapi.model.v1.isp.DistributionCountries> distributionCountries;
        private Map<String, com.amazon.ask.smapi.model.v1.isp.MarketplacePricing> pricing;
        private com.amazon.ask.smapi.model.v1.isp.TaxInformation taxInformation;

        private Builder() {}

        @JsonProperty("locales")

        public Builder withLocales(Map<String, com.amazon.ask.smapi.model.v1.isp.LocalizedPublishingInformation> locales) {
            this.locales = locales;
            return this;
        }

        public Builder putLocalesItem(String key, com.amazon.ask.smapi.model.v1.isp.LocalizedPublishingInformation localesItem) {
            if (this.locales == null) {
                this.locales = new HashMap<String, com.amazon.ask.smapi.model.v1.isp.LocalizedPublishingInformation>();
            }
            this.locales.put(key, localesItem);
            return this;
        }

        @JsonProperty("distributionCountries")

        public Builder withDistributionCountries(List<com.amazon.ask.smapi.model.v1.isp.DistributionCountries> distributionCountries) {
            this.distributionCountries = distributionCountries;
            return this;
        }

        public Builder addDistributionCountriesItem(com.amazon.ask.smapi.model.v1.isp.DistributionCountries distributionCountriesItem) {
            if (this.distributionCountries == null) {
                this.distributionCountries = new ArrayList<com.amazon.ask.smapi.model.v1.isp.DistributionCountries>();
            }
            this.distributionCountries.add(distributionCountriesItem);
            return this;
        }

        @JsonProperty("pricing")

        public Builder withPricing(Map<String, com.amazon.ask.smapi.model.v1.isp.MarketplacePricing> pricing) {
            this.pricing = pricing;
            return this;
        }

        public Builder putPricingItem(String key, com.amazon.ask.smapi.model.v1.isp.MarketplacePricing pricingItem) {
            if (this.pricing == null) {
                this.pricing = new HashMap<String, com.amazon.ask.smapi.model.v1.isp.MarketplacePricing>();
            }
            this.pricing.put(key, pricingItem);
            return this;
        }

        @JsonProperty("taxInformation")

        public Builder withTaxInformation(com.amazon.ask.smapi.model.v1.isp.TaxInformation taxInformation) {
            this.taxInformation = taxInformation;
            return this;
        }


        public PublishingInformation build() {
            return new PublishingInformation(this);
        }
    }
}

