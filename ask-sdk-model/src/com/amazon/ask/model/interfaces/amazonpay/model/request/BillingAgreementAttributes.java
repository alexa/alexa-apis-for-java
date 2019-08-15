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


package com.amazon.ask.model.interfaces.amazonpay.model.request;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The merchant can choose to set the attributes specified in the BillingAgreementAttributes.
 */

@JsonDeserialize(builder = BillingAgreementAttributes.Builder.class)
public final class BillingAgreementAttributes extends com.amazon.ask.model.interfaces.amazonpay.model.request.BaseAmazonPayEntity {

  @JsonProperty("platformId")
  private String platformId = null;

  @JsonProperty("sellerNote")
  private String sellerNote = null;

  @JsonProperty("sellerBillingAgreementAttributes")
  private com.amazon.ask.model.interfaces.amazonpay.model.request.SellerBillingAgreementAttributes sellerBillingAgreementAttributes = null;

  @JsonProperty("billingAgreementType")
  private com.amazon.ask.model.interfaces.amazonpay.model.request.BillingAgreementType billingAgreementType = null;

  @JsonProperty("subscriptionAmount")
  private com.amazon.ask.model.interfaces.amazonpay.model.request.Price subscriptionAmount = null;

  public static Builder builder() {
    return new Builder();
  }

  private BillingAgreementAttributes(Builder builder) {
    String discriminatorValue = "BillingAgreementAttributes";

    this.platformId = builder.platformId;
    this.sellerNote = builder.sellerNote;
    this.sellerBillingAgreementAttributes = builder.sellerBillingAgreementAttributes;
    this.billingAgreementType = builder.billingAgreementType;
    this.subscriptionAmount = builder.subscriptionAmount;
    this.type = discriminatorValue;
    this.version = builder.version;
  }

  /**
    * Represents the SellerId of the Solution Provider that developed the eCommerce platform. This value is only used by Solution Providers, for whom it is required. It should not be provided by merchants creating their own custom integration. Do not specify the SellerId of the merchant for this request parameter. If you are a merchant, do not enter a PlatformId.
  * @return platformId
  **/
  @JsonProperty("platformId")
  public String getPlatformId() {
    return platformId;
  }

  /**
    * Represents a description of the billing agreement that is displayed in emails to the buyer.
  * @return sellerNote
  **/
  @JsonProperty("sellerNote")
  public String getSellerNote() {
    return sellerNote;
  }

  /**
    * Get sellerBillingAgreementAttributes
  * @return sellerBillingAgreementAttributes
  **/
  @JsonProperty("sellerBillingAgreementAttributes")
  public com.amazon.ask.model.interfaces.amazonpay.model.request.SellerBillingAgreementAttributes getSellerBillingAgreementAttributes() {
    return sellerBillingAgreementAttributes;
  }

  /**
    * Get billingAgreementType
  * @return billingAgreementType
  **/
  @JsonProperty("billingAgreementType")
  public com.amazon.ask.model.interfaces.amazonpay.model.request.BillingAgreementType getBillingAgreementType() {
    return billingAgreementType;
  }

  /**
    * Get subscriptionAmount
  * @return subscriptionAmount
  **/
  @JsonProperty("subscriptionAmount")
  public com.amazon.ask.model.interfaces.amazonpay.model.request.Price getSubscriptionAmount() {
    return subscriptionAmount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingAgreementAttributes interfacesAmazonpayModelRequestBillingAgreementAttributes = (BillingAgreementAttributes) o;
    return Objects.equals(this.platformId, interfacesAmazonpayModelRequestBillingAgreementAttributes.platformId) &&
        Objects.equals(this.sellerNote, interfacesAmazonpayModelRequestBillingAgreementAttributes.sellerNote) &&
        Objects.equals(this.sellerBillingAgreementAttributes, interfacesAmazonpayModelRequestBillingAgreementAttributes.sellerBillingAgreementAttributes) &&
        Objects.equals(this.billingAgreementType, interfacesAmazonpayModelRequestBillingAgreementAttributes.billingAgreementType) &&
        Objects.equals(this.subscriptionAmount, interfacesAmazonpayModelRequestBillingAgreementAttributes.subscriptionAmount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platformId, sellerNote, sellerBillingAgreementAttributes, billingAgreementType, subscriptionAmount, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingAgreementAttributes {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    platformId: ").append(toIndentedString(platformId)).append("\n");
    sb.append("    sellerNote: ").append(toIndentedString(sellerNote)).append("\n");
    sb.append("    sellerBillingAgreementAttributes: ").append(toIndentedString(sellerBillingAgreementAttributes)).append("\n");
    sb.append("    billingAgreementType: ").append(toIndentedString(billingAgreementType)).append("\n");
    sb.append("    subscriptionAmount: ").append(toIndentedString(subscriptionAmount)).append("\n");
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
    private String platformId;
    private String sellerNote;
    private com.amazon.ask.model.interfaces.amazonpay.model.request.SellerBillingAgreementAttributes sellerBillingAgreementAttributes;
    private com.amazon.ask.model.interfaces.amazonpay.model.request.BillingAgreementType billingAgreementType;
    private com.amazon.ask.model.interfaces.amazonpay.model.request.Price subscriptionAmount;
    private String version;

    private Builder() { }

    @JsonProperty("platformId")
    public Builder withPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }


    @JsonProperty("sellerNote")
    public Builder withSellerNote(String sellerNote) {
        this.sellerNote = sellerNote;
        return this;
    }


    @JsonProperty("sellerBillingAgreementAttributes")
    public Builder withSellerBillingAgreementAttributes(com.amazon.ask.model.interfaces.amazonpay.model.request.SellerBillingAgreementAttributes sellerBillingAgreementAttributes) {
        this.sellerBillingAgreementAttributes = sellerBillingAgreementAttributes;
        return this;
    }


    @JsonProperty("billingAgreementType")
    public Builder withBillingAgreementType(com.amazon.ask.model.interfaces.amazonpay.model.request.BillingAgreementType billingAgreementType) {
        this.billingAgreementType = billingAgreementType;
        return this;
    }


    @JsonProperty("subscriptionAmount")
    public Builder withSubscriptionAmount(com.amazon.ask.model.interfaces.amazonpay.model.request.Price subscriptionAmount) {
        this.subscriptionAmount = subscriptionAmount;
        return this;
    }


    @JsonProperty("@version")
    public Builder withVersion(String version) {
        this.version = version;
        return this;
    }


    public BillingAgreementAttributes build() {
      return new BillingAgreementAttributes(this);
    }
  }
}

