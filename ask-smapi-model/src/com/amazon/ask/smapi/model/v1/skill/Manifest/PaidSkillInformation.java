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
 * Defines the structure of the paid skill information of the skill.
 */

@JsonDeserialize(builder = PaidSkillInformation.Builder.class)
public final class PaidSkillInformation {

    @JsonProperty("pricing")
    private Map<String, List<com.amazon.ask.smapi.model.v1.skill.Manifest.MarketplacePricing>> pricing = new HashMap<String, List<com.amazon.ask.smapi.model.v1.skill.Manifest.MarketplacePricing>>();

    @JsonProperty("taxInformation")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.TaxInformation taxInformation = null;

    private PaidSkillInformation() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private PaidSkillInformation(Builder builder) {
        if (builder.pricing != null) {
            this.pricing = builder.pricing;
        }
        if (builder.taxInformation != null) {
            this.taxInformation = builder.taxInformation;
        }
    }

    /**
     * Defines the structure for marketplace specific pricing information in the skill manifest
     * @return pricing
    **/
    @JsonProperty("pricing")
    public Map<String, List<com.amazon.ask.smapi.model.v1.skill.Manifest.MarketplacePricing>> getPricing() {
        return pricing;
    }


    /**
     * Get taxInformation
     * @return taxInformation
    **/
    @JsonProperty("taxInformation")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.TaxInformation getTaxInformation() {
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
        PaidSkillInformation v1SkillManifestPaidSkillInformation = (PaidSkillInformation) o;
        return Objects.equals(this.pricing, v1SkillManifestPaidSkillInformation.pricing) &&
            Objects.equals(this.taxInformation, v1SkillManifestPaidSkillInformation.taxInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pricing, taxInformation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaidSkillInformation {\n");
        
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
        private Map<String, List<com.amazon.ask.smapi.model.v1.skill.Manifest.MarketplacePricing>> pricing;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.TaxInformation taxInformation;

        private Builder() {}

        @JsonProperty("pricing")

        public Builder withPricing(Map<String, List<com.amazon.ask.smapi.model.v1.skill.Manifest.MarketplacePricing>> pricing) {
            this.pricing = pricing;
            return this;
        }

        public Builder putPricingItem(String key, List<com.amazon.ask.smapi.model.v1.skill.Manifest.MarketplacePricing> pricingItem) {
            if (this.pricing == null) {
                this.pricing = new HashMap<String, List<com.amazon.ask.smapi.model.v1.skill.Manifest.MarketplacePricing>>();
            }
            this.pricing.put(key, pricingItem);
            return this;
        }

        @JsonProperty("taxInformation")

        public Builder withTaxInformation(com.amazon.ask.smapi.model.v1.skill.Manifest.TaxInformation taxInformation) {
            this.taxInformation = taxInformation;
            return this;
        }


        public PaidSkillInformation build() {
            return new PaidSkillInformation(this);
        }
    }
}

