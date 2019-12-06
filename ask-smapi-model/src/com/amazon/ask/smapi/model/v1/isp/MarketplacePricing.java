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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * In-skill product pricing information for a marketplace.
 */

@JsonDeserialize(builder = MarketplacePricing.Builder.class)
public final class MarketplacePricing {

    @JsonProperty("releaseDate")
    private OffsetDateTime releaseDate = null;

    @JsonProperty("defaultPriceListing")
    private com.amazon.ask.smapi.model.v1.isp.PriceListing defaultPriceListing = null;

    public static Builder builder() {
        return new Builder();
    }

    private MarketplacePricing(Builder builder) {
        if (builder.releaseDate != null) {
            this.releaseDate = builder.releaseDate;
        }
        if (builder.defaultPriceListing != null) {
            this.defaultPriceListing = builder.defaultPriceListing;
        }
    }

    /**
     * Date when in-skill product is available to customers for both purchase and use. Prior to this date the in-skill product will appear unavailable to customers and will not be purchasable.
     * @return releaseDate
    **/
    @JsonProperty("releaseDate")
    public OffsetDateTime getReleaseDate() {
        return releaseDate;
    }

    /**
     * Get defaultPriceListing
     * @return defaultPriceListing
    **/
    @JsonProperty("defaultPriceListing")
    public com.amazon.ask.smapi.model.v1.isp.PriceListing getDefaultPriceListing() {
        return defaultPriceListing;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarketplacePricing v1IspMarketplacePricing = (MarketplacePricing) o;
        return Objects.equals(this.releaseDate, v1IspMarketplacePricing.releaseDate) &&
            Objects.equals(this.defaultPriceListing, v1IspMarketplacePricing.defaultPriceListing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(releaseDate, defaultPriceListing);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarketplacePricing {\n");
        
        sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
        sb.append("    defaultPriceListing: ").append(toIndentedString(defaultPriceListing)).append("\n");
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
        private OffsetDateTime releaseDate;
        private com.amazon.ask.smapi.model.v1.isp.PriceListing defaultPriceListing;

        private Builder() {}

        @JsonProperty("releaseDate")
        public Builder withReleaseDate(OffsetDateTime releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }


        @JsonProperty("defaultPriceListing")
        public Builder withDefaultPriceListing(com.amazon.ask.smapi.model.v1.isp.PriceListing defaultPriceListing) {
            this.defaultPriceListing = defaultPriceListing;
            return this;
        }


        public MarketplacePricing build() {
            return new MarketplacePricing(this);
        }
    }
}

