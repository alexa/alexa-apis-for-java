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
public final class InSkillProduct{

  @JsonProperty("productId")
  private String productId = null;

  @JsonProperty("referenceName")
  private String referenceName = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private com.amazon.ask.model.services.monetization.ProductType type = null;

  @JsonProperty("summary")
  private String summary = null;

  @JsonProperty("purchasable")
  private com.amazon.ask.model.services.monetization.PurchasableState purchasable = null;

  @JsonProperty("entitled")
  private com.amazon.ask.model.services.monetization.EntitledState entitled = null;

  @JsonProperty("activeEntitlementCount")
  private Integer activeEntitlementCount = null;

  @JsonProperty("purchaseMode")
  private com.amazon.ask.model.services.monetization.PurchaseMode purchaseMode = null;

  public static Builder builder() {
    return new Builder();
  }

  private InSkillProduct(Builder builder) {
    this.productId = builder.productId;
    this.referenceName = builder.referenceName;
    this.name = builder.name;
    this.type = builder.type;
    this.summary = builder.summary;
    this.purchasable = builder.purchasable;
    this.entitled = builder.entitled;
    this.activeEntitlementCount = builder.activeEntitlementCount;
    this.purchaseMode = builder.purchaseMode;
  }

  /**
    * Product Id
  * @return productId
  **/
  public String getProductId() {
    return productId;
  }

  /**
    * Developer selected in-skill product name. This is for developer reference only.
  * @return referenceName
  **/
  public String getReferenceName() {
    return referenceName;
  }

  /**
    * Name of the product in the language from the \"Accept-Language\" header
  * @return name
  **/
  public String getName() {
    return name;
  }

  /**
    * Get type
  * @return type
  **/
  public com.amazon.ask.model.services.monetization.ProductType getType() {
    return type;
  }

  /**
    * Product summary in the language from the \"Accept-Language\" header
  * @return summary
  **/
  public String getSummary() {
    return summary;
  }

  /**
    * Get purchasable
  * @return purchasable
  **/
  public com.amazon.ask.model.services.monetization.PurchasableState getPurchasable() {
    return purchasable;
  }

  /**
    * Get entitled
  * @return entitled
  **/
  public com.amazon.ask.model.services.monetization.EntitledState getEntitled() {
    return entitled;
  }

  /**
    * Total active purchases of the product made by the user. Note - For ENTITLEMENT and SUBSCRIPTION product types, the value is either zero(NOT_ENTITLED) or one(ENTITLED). For CONSUMABLE product type the value is zero or more, as CONSUMABLE can be re-purchased.
  * @return activeEntitlementCount
  **/
  public Integer getActiveEntitlementCount() {
    return activeEntitlementCount;
  }

  /**
    * Get purchaseMode
  * @return purchaseMode
  **/
  public com.amazon.ask.model.services.monetization.PurchaseMode getPurchaseMode() {
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
        Objects.equals(this.activeEntitlementCount, servicesMonetizationInSkillProduct.activeEntitlementCount) &&
        Objects.equals(this.purchaseMode, servicesMonetizationInSkillProduct.purchaseMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, referenceName, name, type, summary, purchasable, entitled, activeEntitlementCount, purchaseMode);
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
    private com.amazon.ask.model.services.monetization.ProductType type;
    private String summary;
    private com.amazon.ask.model.services.monetization.PurchasableState purchasable;
    private com.amazon.ask.model.services.monetization.EntitledState entitled;
    private Integer activeEntitlementCount;
    private com.amazon.ask.model.services.monetization.PurchaseMode purchaseMode;

    private Builder() { }

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
    public Builder withType(com.amazon.ask.model.services.monetization.ProductType type) {
      this.type = type;
      return this;
    }
      

    @JsonProperty("summary")
    public Builder withSummary(String summary) {
      this.summary = summary;
      return this;
    }
      

    @JsonProperty("purchasable")
    public Builder withPurchasable(com.amazon.ask.model.services.monetization.PurchasableState purchasable) {
      this.purchasable = purchasable;
      return this;
    }
      

    @JsonProperty("entitled")
    public Builder withEntitled(com.amazon.ask.model.services.monetization.EntitledState entitled) {
      this.entitled = entitled;
      return this;
    }
      

    @JsonProperty("activeEntitlementCount")
    public Builder withActiveEntitlementCount(Integer activeEntitlementCount) {
      this.activeEntitlementCount = activeEntitlementCount;
      return this;
    }
      

    @JsonProperty("purchaseMode")
    public Builder withPurchaseMode(com.amazon.ask.model.services.monetization.PurchaseMode purchaseMode) {
      this.purchaseMode = purchaseMode;
      return this;
    }
      

    public InSkillProduct build() {
      return new InSkillProduct(this);
    }
  }
}

