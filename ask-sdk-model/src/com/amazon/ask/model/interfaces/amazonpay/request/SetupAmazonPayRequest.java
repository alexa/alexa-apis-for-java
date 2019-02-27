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


package com.amazon.ask.model.interfaces.amazonpay.request;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Setup Amazon Pay Request Object.
 */

@JsonDeserialize(builder = SetupAmazonPayRequest.Builder.class)
public final class SetupAmazonPayRequest extends com.amazon.ask.model.interfaces.amazonpay.model.request.BaseAmazonPayEntity {

  @JsonProperty("sellerId")
  private String sellerId = null;

  @JsonProperty("countryOfEstablishment")
  private String countryOfEstablishment = null;

  @JsonProperty("ledgerCurrency")
  private String ledgerCurrency = null;

  @JsonProperty("checkoutLanguage")
  private String checkoutLanguage = null;

  @JsonProperty("billingAgreementAttributes")
  private com.amazon.ask.model.interfaces.amazonpay.model.request.BillingAgreementAttributes billingAgreementAttributes = null;

  @JsonProperty("needAmazonShippingAddress")
  private Boolean needAmazonShippingAddress = false;

  @JsonProperty("sandboxMode")
  private Boolean sandboxMode = false;

  @JsonProperty("sandboxCustomerEmailId")
  private String sandboxCustomerEmailId = null;

  public static Builder builder() {
    return new Builder();
  }

  private SetupAmazonPayRequest(Builder builder) {
    String discriminatorValue = "SetupAmazonPayRequest";

    this.type = discriminatorValue;
    this.version = builder.version;
    this.sellerId = builder.sellerId;
    this.countryOfEstablishment = builder.countryOfEstablishment;
    this.ledgerCurrency = builder.ledgerCurrency;
    this.checkoutLanguage = builder.checkoutLanguage;
    this.billingAgreementAttributes = builder.billingAgreementAttributes;
    this.needAmazonShippingAddress = builder.needAmazonShippingAddress;
    this.sandboxMode = builder.sandboxMode;
    this.sandboxCustomerEmailId = builder.sandboxCustomerEmailId;
  }

  /**
    * The seller ID (also known as merchant ID). If you are an Ecommerce Provider (Solution Provider), please specify the ID of the merchant, not your provider ID.
  * @return sellerId
  **/
  public String getSellerId() {
    return sellerId;
  }

  /**
    * The country in which the merchant has registered, as an Amazon Payments legal entity.
  * @return countryOfEstablishment
  **/
  public String getCountryOfEstablishment() {
    return countryOfEstablishment;
  }

  /**
    * The currency of the merchant’s ledger account.
  * @return ledgerCurrency
  **/
  public String getLedgerCurrency() {
    return ledgerCurrency;
  }

  /**
    * The merchant's preferred language for checkout.
  * @return checkoutLanguage
  **/
  public String getCheckoutLanguage() {
    return checkoutLanguage;
  }

  /**
    * Get billingAgreementAttributes
  * @return billingAgreementAttributes
  **/
  public com.amazon.ask.model.interfaces.amazonpay.model.request.BillingAgreementAttributes getBillingAgreementAttributes() {
    return billingAgreementAttributes;
  }

  /**
    * To receive the default user shipping address in the response, set this parameter to true. Not required if a user shipping address is not required.
  * @return needAmazonShippingAddress
  **/
  public Boolean getNeedAmazonShippingAddress() {
    return needAmazonShippingAddress;
  }

  /**
    * To test in Sandbox mode, set this parameter to true.
  * @return sandboxMode
  **/
  public Boolean getSandboxMode() {
    return sandboxMode;
  }

  /**
    * Use this parameter to create a Sandbox payment object. In order to use this parameter, you first create a Sandbox user account in Seller Central. Then, pass the email address associated with that Sandbox user account.
  * @return sandboxCustomerEmailId
  **/
  public String getSandboxCustomerEmailId() {
    return sandboxCustomerEmailId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetupAmazonPayRequest interfacesAmazonpayRequestSetupAmazonPayRequest = (SetupAmazonPayRequest) o;
    return Objects.equals(this.sellerId, interfacesAmazonpayRequestSetupAmazonPayRequest.sellerId) &&
        Objects.equals(this.countryOfEstablishment, interfacesAmazonpayRequestSetupAmazonPayRequest.countryOfEstablishment) &&
        Objects.equals(this.ledgerCurrency, interfacesAmazonpayRequestSetupAmazonPayRequest.ledgerCurrency) &&
        Objects.equals(this.checkoutLanguage, interfacesAmazonpayRequestSetupAmazonPayRequest.checkoutLanguage) &&
        Objects.equals(this.billingAgreementAttributes, interfacesAmazonpayRequestSetupAmazonPayRequest.billingAgreementAttributes) &&
        Objects.equals(this.needAmazonShippingAddress, interfacesAmazonpayRequestSetupAmazonPayRequest.needAmazonShippingAddress) &&
        Objects.equals(this.sandboxMode, interfacesAmazonpayRequestSetupAmazonPayRequest.sandboxMode) &&
        Objects.equals(this.sandboxCustomerEmailId, interfacesAmazonpayRequestSetupAmazonPayRequest.sandboxCustomerEmailId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerId, countryOfEstablishment, ledgerCurrency, checkoutLanguage, billingAgreementAttributes, needAmazonShippingAddress, sandboxMode, sandboxCustomerEmailId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetupAmazonPayRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    countryOfEstablishment: ").append(toIndentedString(countryOfEstablishment)).append("\n");
    sb.append("    ledgerCurrency: ").append(toIndentedString(ledgerCurrency)).append("\n");
    sb.append("    checkoutLanguage: ").append(toIndentedString(checkoutLanguage)).append("\n");
    sb.append("    billingAgreementAttributes: ").append(toIndentedString(billingAgreementAttributes)).append("\n");
    sb.append("    needAmazonShippingAddress: ").append(toIndentedString(needAmazonShippingAddress)).append("\n");
    sb.append("    sandboxMode: ").append(toIndentedString(sandboxMode)).append("\n");
    sb.append("    sandboxCustomerEmailId: ").append(toIndentedString(sandboxCustomerEmailId)).append("\n");
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
    private String version;
    private String sellerId;
    private String countryOfEstablishment;
    private String ledgerCurrency;
    private String checkoutLanguage;
    private com.amazon.ask.model.interfaces.amazonpay.model.request.BillingAgreementAttributes billingAgreementAttributes;
    private Boolean needAmazonShippingAddress;
    private Boolean sandboxMode;
    private String sandboxCustomerEmailId;

    private Builder() { }
      

    @JsonProperty("@version")
    public Builder withVersion(String version) {
      this.version = version;
      return this;
    }
      

    @JsonProperty("sellerId")
    public Builder withSellerId(String sellerId) {
      this.sellerId = sellerId;
      return this;
    }
      

    @JsonProperty("countryOfEstablishment")
    public Builder withCountryOfEstablishment(String countryOfEstablishment) {
      this.countryOfEstablishment = countryOfEstablishment;
      return this;
    }
      

    @JsonProperty("ledgerCurrency")
    public Builder withLedgerCurrency(String ledgerCurrency) {
      this.ledgerCurrency = ledgerCurrency;
      return this;
    }
      

    @JsonProperty("checkoutLanguage")
    public Builder withCheckoutLanguage(String checkoutLanguage) {
      this.checkoutLanguage = checkoutLanguage;
      return this;
    }
      

    @JsonProperty("billingAgreementAttributes")
    public Builder withBillingAgreementAttributes(com.amazon.ask.model.interfaces.amazonpay.model.request.BillingAgreementAttributes billingAgreementAttributes) {
      this.billingAgreementAttributes = billingAgreementAttributes;
      return this;
    }
      

    @JsonProperty("needAmazonShippingAddress")
    public Builder withNeedAmazonShippingAddress(Boolean needAmazonShippingAddress) {
      this.needAmazonShippingAddress = needAmazonShippingAddress;
      return this;
    }
      

    @JsonProperty("sandboxMode")
    public Builder withSandboxMode(Boolean sandboxMode) {
      this.sandboxMode = sandboxMode;
      return this;
    }
      

    @JsonProperty("sandboxCustomerEmailId")
    public Builder withSandboxCustomerEmailId(String sandboxCustomerEmailId) {
      this.sandboxCustomerEmailId = sandboxCustomerEmailId;
      return this;
    }
      

    public SetupAmazonPayRequest build() {
      return new SetupAmazonPayRequest(this);
    }
  }
}

