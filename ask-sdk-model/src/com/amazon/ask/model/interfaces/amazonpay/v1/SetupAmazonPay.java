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


package com.amazon.ask.model.interfaces.amazonpay.v1;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Setup Amazon Pay Request Object
 */

@JsonDeserialize(builder = SetupAmazonPay.Builder.class)
public final class SetupAmazonPay{

  @JsonProperty("consentToken")
  private String consentToken = null;

  @JsonProperty("sellerId")
  private String sellerId = null;

  @JsonProperty("countryOfEstablishment")
  private String countryOfEstablishment = null;

  @JsonProperty("ledgerCurrency")
  private String ledgerCurrency = null;

  @JsonProperty("checkoutLanguage")
  private String checkoutLanguage = null;

  @JsonProperty("billingAgreementAttributes")
  private com.amazon.ask.model.interfaces.amazonpay.model.v1.BillingAgreementAttributes billingAgreementAttributes = null;

  @JsonProperty("needAmazonShippingAddress")
  private Boolean needAmazonShippingAddress = false;

  @JsonProperty("sandboxMode")
  private Boolean sandboxMode = false;

  @JsonProperty("sandboxCustomerEmailId")
  private String sandboxCustomerEmailId = null;

  public static Builder builder() {
    return new Builder();
  }

  private SetupAmazonPay(Builder builder) {
    this.consentToken = builder.consentToken;
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
    * Authorization token that contains the permissions consented to by the user.
  * @return consentToken
  **/
  @JsonProperty("consentToken")
  public String getConsentToken() {
    return consentToken;
  }

  /**
    * The seller ID (also known as merchant ID). If you are an Ecommerce Provider (Solution Provider), please specify the ID of the merchant, not your provider ID.
  * @return sellerId
  **/
  @JsonProperty("sellerId")
  public String getSellerId() {
    return sellerId;
  }

  /**
    * The country in which the merchant has registered, as an Amazon Payments legal entity.
  * @return countryOfEstablishment
  **/
  @JsonProperty("countryOfEstablishment")
  public String getCountryOfEstablishment() {
    return countryOfEstablishment;
  }

  /**
    * The currency of the merchant’s ledger account.
  * @return ledgerCurrency
  **/
  @JsonProperty("ledgerCurrency")
  public String getLedgerCurrency() {
    return ledgerCurrency;
  }

  /**
    * The merchant's preferred language for checkout.
  * @return checkoutLanguage
  **/
  @JsonProperty("checkoutLanguage")
  public String getCheckoutLanguage() {
    return checkoutLanguage;
  }

  /**
    * Get billingAgreementAttributes
  * @return billingAgreementAttributes
  **/
  @JsonProperty("billingAgreementAttributes")
  public com.amazon.ask.model.interfaces.amazonpay.model.v1.BillingAgreementAttributes getBillingAgreementAttributes() {
    return billingAgreementAttributes;
  }

  /**
    * To receive the default user shipping address in the response, set this parameter to true. Not required if a user shipping address is not required.
  * @return needAmazonShippingAddress
  **/
  @JsonProperty("needAmazonShippingAddress")
  public Boolean getNeedAmazonShippingAddress() {
    return needAmazonShippingAddress;
  }

  /**
    * To test in Sandbox mode, set this parameter to true.
  * @return sandboxMode
  **/
  @JsonProperty("sandboxMode")
  public Boolean getSandboxMode() {
    return sandboxMode;
  }

  /**
    * Use this parameter to create a Sandbox payment object. In order to use this parameter, you first create a Sandbox user account in Seller Central. Then, pass the email address associated with that Sandbox user account.
  * @return sandboxCustomerEmailId
  **/
  @JsonProperty("sandboxCustomerEmailId")
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
    SetupAmazonPay interfacesAmazonpayV1SetupAmazonPay = (SetupAmazonPay) o;
    return Objects.equals(this.consentToken, interfacesAmazonpayV1SetupAmazonPay.consentToken) &&
        Objects.equals(this.sellerId, interfacesAmazonpayV1SetupAmazonPay.sellerId) &&
        Objects.equals(this.countryOfEstablishment, interfacesAmazonpayV1SetupAmazonPay.countryOfEstablishment) &&
        Objects.equals(this.ledgerCurrency, interfacesAmazonpayV1SetupAmazonPay.ledgerCurrency) &&
        Objects.equals(this.checkoutLanguage, interfacesAmazonpayV1SetupAmazonPay.checkoutLanguage) &&
        Objects.equals(this.billingAgreementAttributes, interfacesAmazonpayV1SetupAmazonPay.billingAgreementAttributes) &&
        Objects.equals(this.needAmazonShippingAddress, interfacesAmazonpayV1SetupAmazonPay.needAmazonShippingAddress) &&
        Objects.equals(this.sandboxMode, interfacesAmazonpayV1SetupAmazonPay.sandboxMode) &&
        Objects.equals(this.sandboxCustomerEmailId, interfacesAmazonpayV1SetupAmazonPay.sandboxCustomerEmailId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentToken, sellerId, countryOfEstablishment, ledgerCurrency, checkoutLanguage, billingAgreementAttributes, needAmazonShippingAddress, sandboxMode, sandboxCustomerEmailId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetupAmazonPay {\n");
    
    sb.append("    consentToken: ").append(toIndentedString(consentToken)).append("\n");
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
    private String consentToken;
    private String sellerId;
    private String countryOfEstablishment;
    private String ledgerCurrency;
    private String checkoutLanguage;
    private com.amazon.ask.model.interfaces.amazonpay.model.v1.BillingAgreementAttributes billingAgreementAttributes;
    private Boolean needAmazonShippingAddress;
    private Boolean sandboxMode;
    private String sandboxCustomerEmailId;

    private Builder() { }

    @JsonProperty("consentToken")
    public Builder withConsentToken(String consentToken) {
        this.consentToken = consentToken;
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
    public Builder withBillingAgreementAttributes(com.amazon.ask.model.interfaces.amazonpay.model.v1.BillingAgreementAttributes billingAgreementAttributes) {
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


    public SetupAmazonPay build() {
      return new SetupAmazonPay(this);
    }
  }
}

