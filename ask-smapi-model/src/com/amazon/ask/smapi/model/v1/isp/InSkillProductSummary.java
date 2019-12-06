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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about the in-skill product that is not editable.
 */

@JsonDeserialize(builder = InSkillProductSummary.Builder.class)
public final class InSkillProductSummary {

    @JsonProperty("type")
    private com.amazon.ask.smapi.model.v1.isp.ProductType type = null;

    @JsonProperty("productId")
    private String productId = null;

    @JsonProperty("referenceName")
    private String referenceName = null;

    @JsonProperty("lastUpdated")
    private OffsetDateTime lastUpdated = null;

    @JsonProperty("nameByLocale")
    private Map<String, String> nameByLocale = new HashMap<String, String>();

    @JsonProperty("status")
    private com.amazon.ask.smapi.model.v1.isp.Status status = null;

    @JsonProperty("stage")
    private com.amazon.ask.smapi.model.v1.isp.Stage stage = null;

    @JsonProperty("editableState")
    private com.amazon.ask.smapi.model.v1.isp.EditableState editableState = null;

    @JsonProperty("purchasableState")
    private com.amazon.ask.smapi.model.v1.isp.PurchasableState purchasableState = null;

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.isp.IspSummaryLinks links = null;

    @JsonProperty("pricing")
    private Map<String, com.amazon.ask.smapi.model.v1.isp.SummaryMarketplacePricing> pricing = new HashMap<String, com.amazon.ask.smapi.model.v1.isp.SummaryMarketplacePricing>();

    public static Builder builder() {
        return new Builder();
    }

    private InSkillProductSummary(Builder builder) {
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.productId != null) {
            this.productId = builder.productId;
        }
        if (builder.referenceName != null) {
            this.referenceName = builder.referenceName;
        }
        if (builder.lastUpdated != null) {
            this.lastUpdated = builder.lastUpdated;
        }
        if (builder.nameByLocale != null) {
            this.nameByLocale = builder.nameByLocale;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.stage != null) {
            this.stage = builder.stage;
        }
        if (builder.editableState != null) {
            this.editableState = builder.editableState;
        }
        if (builder.purchasableState != null) {
            this.purchasableState = builder.purchasableState;
        }
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.pricing != null) {
            this.pricing = builder.pricing;
        }
    }

    /**
     * Get type
     * @return type
    **/
    @JsonProperty("type")
    public com.amazon.ask.smapi.model.v1.isp.ProductType getType() {
        return type;
    }

    /**
     * primary identifier of in-skill product.
     * @return productId
    **/
    @JsonProperty("productId")
    public String getProductId() {
        return productId;
    }

    /**
     * Developer selected in-skill product name. This is for developer reference only, it can be used to filter query results to identify a matching in-skill product.
     * @return referenceName
    **/
    @JsonProperty("referenceName")
    public String getReferenceName() {
        return referenceName;
    }

    /**
     * Date of last update.
     * @return lastUpdated
    **/
    @JsonProperty("lastUpdated")
    public OffsetDateTime getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Get nameByLocale
     * @return nameByLocale
    **/
    @JsonProperty("nameByLocale")
    public Map<String, String> getNameByLocale() {
        return nameByLocale;
    }

    /**
     * Get status
     * @return status
    **/
    @JsonProperty("status")
    public com.amazon.ask.smapi.model.v1.isp.Status getStatus() {
        return status;
    }

    /**
     * Get stage
     * @return stage
    **/
    @JsonProperty("stage")
    public com.amazon.ask.smapi.model.v1.isp.Stage getStage() {
        return stage;
    }

    /**
     * Get editableState
     * @return editableState
    **/
    @JsonProperty("editableState")
    public com.amazon.ask.smapi.model.v1.isp.EditableState getEditableState() {
        return editableState;
    }

    /**
     * Get purchasableState
     * @return purchasableState
    **/
    @JsonProperty("purchasableState")
    public com.amazon.ask.smapi.model.v1.isp.PurchasableState getPurchasableState() {
        return purchasableState;
    }

    /**
     * Get links
     * @return links
    **/
    @JsonProperty("_links")
    public com.amazon.ask.smapi.model.v1.isp.IspSummaryLinks getLinks() {
        return links;
    }

    /**
     * In-skill product pricing information.
     * @return pricing
    **/
    @JsonProperty("pricing")
    public Map<String, com.amazon.ask.smapi.model.v1.isp.SummaryMarketplacePricing> getPricing() {
        return pricing;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InSkillProductSummary v1IspInSkillProductSummary = (InSkillProductSummary) o;
        return Objects.equals(this.type, v1IspInSkillProductSummary.type) &&
            Objects.equals(this.productId, v1IspInSkillProductSummary.productId) &&
            Objects.equals(this.referenceName, v1IspInSkillProductSummary.referenceName) &&
            Objects.equals(this.lastUpdated, v1IspInSkillProductSummary.lastUpdated) &&
            Objects.equals(this.nameByLocale, v1IspInSkillProductSummary.nameByLocale) &&
            Objects.equals(this.status, v1IspInSkillProductSummary.status) &&
            Objects.equals(this.stage, v1IspInSkillProductSummary.stage) &&
            Objects.equals(this.editableState, v1IspInSkillProductSummary.editableState) &&
            Objects.equals(this.purchasableState, v1IspInSkillProductSummary.purchasableState) &&
            Objects.equals(this.links, v1IspInSkillProductSummary.links) &&
            Objects.equals(this.pricing, v1IspInSkillProductSummary.pricing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, productId, referenceName, lastUpdated, nameByLocale, status, stage, editableState, purchasableState, links, pricing);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InSkillProductSummary {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    referenceName: ").append(toIndentedString(referenceName)).append("\n");
        sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
        sb.append("    nameByLocale: ").append(toIndentedString(nameByLocale)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    editableState: ").append(toIndentedString(editableState)).append("\n");
        sb.append("    purchasableState: ").append(toIndentedString(purchasableState)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.isp.ProductType type;
        private String productId;
        private String referenceName;
        private OffsetDateTime lastUpdated;
        private Map<String, String> nameByLocale;
        private com.amazon.ask.smapi.model.v1.isp.Status status;
        private com.amazon.ask.smapi.model.v1.isp.Stage stage;
        private com.amazon.ask.smapi.model.v1.isp.EditableState editableState;
        private com.amazon.ask.smapi.model.v1.isp.PurchasableState purchasableState;
        private com.amazon.ask.smapi.model.v1.isp.IspSummaryLinks links;
        private Map<String, com.amazon.ask.smapi.model.v1.isp.SummaryMarketplacePricing> pricing;

        private Builder() {}

        @JsonProperty("type")
        public Builder withType(com.amazon.ask.smapi.model.v1.isp.ProductType type) {
            this.type = type;
            return this;
        }


        @JsonProperty("productId")
        public Builder withProductId(String productId) {
            this.productId = productId;
            return this;
        }


        @JsonProperty("referenceName")
        public Builder withReferenceName(String referenceName) {
            this.referenceName = referenceName;
            return this;
        }


        @JsonProperty("lastUpdated")
        public Builder withLastUpdated(OffsetDateTime lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }


        @JsonProperty("nameByLocale")
        public Builder withNameByLocale(Map<String, String> nameByLocale) {
            this.nameByLocale = nameByLocale;
            return this;
        }

        public Builder putNameByLocaleItem(String key, String nameByLocaleItem) {
            if (this.nameByLocale == null) {
                this.nameByLocale = new HashMap<String, String>();
            }
            this.nameByLocale.put(key, nameByLocaleItem);
            return this;
        }

        @JsonProperty("status")
        public Builder withStatus(com.amazon.ask.smapi.model.v1.isp.Status status) {
            this.status = status;
            return this;
        }


        @JsonProperty("stage")
        public Builder withStage(com.amazon.ask.smapi.model.v1.isp.Stage stage) {
            this.stage = stage;
            return this;
        }


        @JsonProperty("editableState")
        public Builder withEditableState(com.amazon.ask.smapi.model.v1.isp.EditableState editableState) {
            this.editableState = editableState;
            return this;
        }


        @JsonProperty("purchasableState")
        public Builder withPurchasableState(com.amazon.ask.smapi.model.v1.isp.PurchasableState purchasableState) {
            this.purchasableState = purchasableState;
            return this;
        }


        @JsonProperty("_links")
        public Builder withLinks(com.amazon.ask.smapi.model.v1.isp.IspSummaryLinks links) {
            this.links = links;
            return this;
        }


        @JsonProperty("pricing")
        public Builder withPricing(Map<String, com.amazon.ask.smapi.model.v1.isp.SummaryMarketplacePricing> pricing) {
            this.pricing = pricing;
            return this;
        }

        public Builder putPricingItem(String key, com.amazon.ask.smapi.model.v1.isp.SummaryMarketplacePricing pricingItem) {
            if (this.pricing == null) {
                this.pricing = new HashMap<String, com.amazon.ask.smapi.model.v1.isp.SummaryMarketplacePricing>();
            }
            this.pricing.put(key, pricingItem);
            return this;
        }

        public InSkillProductSummary build() {
            return new InSkillProductSummary(this);
        }
    }
}

