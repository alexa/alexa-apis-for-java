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


package com.amazon.ask.model.services.monetization;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InSkillProduct
 */

@JsonDeserialize(builder = InSkillProduct.Builder.class)
public final class InSkillProduct {

    @JsonProperty("productId")
    private String productId = null;

    @JsonProperty("referenceName")
    private String referenceName = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("summary")
    private String summary = null;

    @JsonProperty("purchasable")
    private String purchasable = null;

    @JsonProperty("entitled")
    private String entitled = null;

    @JsonProperty("entitlementReason")
    private String entitlementReason = null;

    @JsonProperty("activeEntitlementCount")
    private Integer activeEntitlementCount = null;

    @JsonProperty("purchaseMode")
    private String purchaseMode = null;

    public static Builder builder() {
        return new Builder();
    }

    private InSkillProduct(Builder builder) {
        if (builder.productId != null) {
            this.productId = builder.productId;
        }
        if (builder.referenceName != null) {
            this.referenceName = builder.referenceName;
        }
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.summary != null) {
            this.summary = builder.summary;
        }
        if (builder.purchasable != null) {
            this.purchasable = builder.purchasable;
        }
        if (builder.entitled != null) {
            this.entitled = builder.entitled;
        }
        if (builder.entitlementReason != null) {
            this.entitlementReason = builder.entitlementReason;
        }
        if (builder.activeEntitlementCount != null) {
            this.activeEntitlementCount = builder.activeEntitlementCount;
        }
        if (builder.purchaseMode != null) {
            this.purchaseMode = builder.purchaseMode;
        }
    }

    /**
     * Product Id
     * @return productId
    **/
    @JsonProperty("productId")
    public String getProductId() {
        return productId;
    }


    /**
     * Developer selected in-skill product name. This is for developer reference only.
     * @return referenceName
    **/
    @JsonProperty("referenceName")
    public String getReferenceName() {
        return referenceName;
    }


    /**
     * Name of the product in the language from the \"Accept-Language\" header
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Get type
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getTypeAsString().
     *
     * @return type
    **/
    
    public com.amazon.ask.model.services.monetization.ProductType getType() {
        return com.amazon.ask.model.services.monetization.ProductType.fromValue(type);
    }

    /**
     * Get the underlying String value for type.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return type as a String value
    **/
    @JsonProperty("type")
    public String getTypeAsString() {
      return type;
    }

    /**
     * Product summary in the language from the \"Accept-Language\" header
     * @return summary
    **/
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }


    /**
     * Get purchasable
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getPurchasableAsString().
     *
     * @return purchasable
    **/
    
    public com.amazon.ask.model.services.monetization.PurchasableState getPurchasable() {
        return com.amazon.ask.model.services.monetization.PurchasableState.fromValue(purchasable);
    }

    /**
     * Get the underlying String value for purchasable.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return purchasable as a String value
    **/
    @JsonProperty("purchasable")
    public String getPurchasableAsString() {
      return purchasable;
    }

    /**
     * Get entitled
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getEntitledAsString().
     *
     * @return entitled
    **/
    
    public com.amazon.ask.model.services.monetization.EntitledState getEntitled() {
        return com.amazon.ask.model.services.monetization.EntitledState.fromValue(entitled);
    }

    /**
     * Get the underlying String value for entitled.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return entitled as a String value
    **/
    @JsonProperty("entitled")
    public String getEntitledAsString() {
      return entitled;
    }

    /**
     * Get entitlementReason
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getEntitlementReasonAsString().
     *
     * @return entitlementReason
    **/
    
    public com.amazon.ask.model.services.monetization.EntitlementReason getEntitlementReason() {
        return com.amazon.ask.model.services.monetization.EntitlementReason.fromValue(entitlementReason);
    }

    /**
     * Get the underlying String value for entitlementReason.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return entitlementReason as a String value
    **/
    @JsonProperty("entitlementReason")
    public String getEntitlementReasonAsString() {
      return entitlementReason;
    }

    /**
     * Total active purchases of the product made by the user. Note - For ENTITLEMENT and SUBSCRIPTION product types, the value is either zero(NOT_ENTITLED) or one(ENTITLED). For CONSUMABLE product type the value is zero or more, as CONSUMABLE can be re-purchased.
     * @return activeEntitlementCount
    **/
    @JsonProperty("activeEntitlementCount")
    public Integer getActiveEntitlementCount() {
        return activeEntitlementCount;
    }


    /**
     * Get purchaseMode
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getPurchaseModeAsString().
     *
     * @return purchaseMode
    **/
    
    public com.amazon.ask.model.services.monetization.PurchaseMode getPurchaseMode() {
        return com.amazon.ask.model.services.monetization.PurchaseMode.fromValue(purchaseMode);
    }

    /**
     * Get the underlying String value for purchaseMode.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return purchaseMode as a String value
    **/
    @JsonProperty("purchaseMode")
    public String getPurchaseModeAsString() {
      return purchaseMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InSkillProduct servicesMonetizationInSkillProduct = (InSkillProduct) o;
        return Objects.equals(this.productId, servicesMonetizationInSkillProduct.productId) &&
            Objects.equals(this.referenceName, servicesMonetizationInSkillProduct.referenceName) &&
            Objects.equals(this.name, servicesMonetizationInSkillProduct.name) &&
            Objects.equals(this.type, servicesMonetizationInSkillProduct.type) &&
            Objects.equals(this.summary, servicesMonetizationInSkillProduct.summary) &&
            Objects.equals(this.purchasable, servicesMonetizationInSkillProduct.purchasable) &&
            Objects.equals(this.entitled, servicesMonetizationInSkillProduct.entitled) &&
            Objects.equals(this.entitlementReason, servicesMonetizationInSkillProduct.entitlementReason) &&
            Objects.equals(this.activeEntitlementCount, servicesMonetizationInSkillProduct.activeEntitlementCount) &&
            Objects.equals(this.purchaseMode, servicesMonetizationInSkillProduct.purchaseMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, referenceName, name, type, summary, purchasable, entitled, entitlementReason, activeEntitlementCount, purchaseMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InSkillProduct {\n");
        
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    referenceName: ").append(toIndentedString(referenceName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    purchasable: ").append(toIndentedString(purchasable)).append("\n");
        sb.append("    entitled: ").append(toIndentedString(entitled)).append("\n");
        sb.append("    entitlementReason: ").append(toIndentedString(entitlementReason)).append("\n");
        sb.append("    activeEntitlementCount: ").append(toIndentedString(activeEntitlementCount)).append("\n");
        sb.append("    purchaseMode: ").append(toIndentedString(purchaseMode)).append("\n");
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
        private String productId;
        private String referenceName;
        private String name;
        private String type;
        private String summary;
        private String purchasable;
        private String entitled;
        private String entitlementReason;
        private Integer activeEntitlementCount;
        private String purchaseMode;

        private Builder() {}

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


        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("type")

        public Builder withType(String type) {
          this.type = type;
          return this;
        }

        public Builder withType(com.amazon.ask.model.services.monetization.ProductType type) {
            this.type = type != null ? type.toString() : null;
            return this;
        }


        @JsonProperty("summary")

        public Builder withSummary(String summary) {
            this.summary = summary;
            return this;
        }


        @JsonProperty("purchasable")

        public Builder withPurchasable(String purchasable) {
          this.purchasable = purchasable;
          return this;
        }

        public Builder withPurchasable(com.amazon.ask.model.services.monetization.PurchasableState purchasable) {
            this.purchasable = purchasable != null ? purchasable.toString() : null;
            return this;
        }


        @JsonProperty("entitled")

        public Builder withEntitled(String entitled) {
          this.entitled = entitled;
          return this;
        }

        public Builder withEntitled(com.amazon.ask.model.services.monetization.EntitledState entitled) {
            this.entitled = entitled != null ? entitled.toString() : null;
            return this;
        }


        @JsonProperty("entitlementReason")

        public Builder withEntitlementReason(String entitlementReason) {
          this.entitlementReason = entitlementReason;
          return this;
        }

        public Builder withEntitlementReason(com.amazon.ask.model.services.monetization.EntitlementReason entitlementReason) {
            this.entitlementReason = entitlementReason != null ? entitlementReason.toString() : null;
            return this;
        }


        @JsonProperty("activeEntitlementCount")

        public Builder withActiveEntitlementCount(Integer activeEntitlementCount) {
            this.activeEntitlementCount = activeEntitlementCount;
            return this;
        }


        @JsonProperty("purchaseMode")

        public Builder withPurchaseMode(String purchaseMode) {
          this.purchaseMode = purchaseMode;
          return this;
        }

        public Builder withPurchaseMode(com.amazon.ask.model.services.monetization.PurchaseMode purchaseMode) {
            this.purchaseMode = purchaseMode != null ? purchaseMode.toString() : null;
            return this;
        }


        public InSkillProduct build() {
            return new InSkillProduct(this);
        }
    }
}

