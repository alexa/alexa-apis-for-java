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
 * Charge Amazon Pay Request Object
 */

@JsonDeserialize(builder = ChargeAmazonPay.Builder.class)
public final class ChargeAmazonPay {

    @JsonProperty("consentToken")
    private String consentToken = null;

    @JsonProperty("sellerId")
    private String sellerId = null;

    @JsonProperty("billingAgreementId")
    private String billingAgreementId = null;

    @JsonProperty("paymentAction")
    private String paymentAction = null;

    @JsonProperty("authorizeAttributes")
    private com.amazon.ask.model.interfaces.amazonpay.model.v1.AuthorizeAttributes authorizeAttributes = null;

    @JsonProperty("sellerOrderAttributes")
    private com.amazon.ask.model.interfaces.amazonpay.model.v1.SellerOrderAttributes sellerOrderAttributes = null;

    @JsonProperty("providerAttributes")
    private com.amazon.ask.model.interfaces.amazonpay.model.v1.ProviderAttributes providerAttributes = null;

    public static Builder builder() {
        return new Builder();
    }

    private ChargeAmazonPay(Builder builder) {
        if (builder.consentToken != null) {
            this.consentToken = builder.consentToken;
        }
        if (builder.sellerId != null) {
            this.sellerId = builder.sellerId;
        }
        if (builder.billingAgreementId != null) {
            this.billingAgreementId = builder.billingAgreementId;
        }
        if (builder.paymentAction != null) {
            this.paymentAction = builder.paymentAction;
        }
        if (builder.authorizeAttributes != null) {
            this.authorizeAttributes = builder.authorizeAttributes;
        }
        if (builder.sellerOrderAttributes != null) {
            this.sellerOrderAttributes = builder.sellerOrderAttributes;
        }
        if (builder.providerAttributes != null) {
            this.providerAttributes = builder.providerAttributes;
        }
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
     * The payment contract i.e. billing agreement created for the user.
     * @return billingAgreementId
    **/
    @JsonProperty("billingAgreementId")
    public String getBillingAgreementId() {
        return billingAgreementId;
    }


    /**
     * Get paymentAction
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getPaymentActionAsString().
     *
     * @return paymentAction
    **/
    
    public com.amazon.ask.model.interfaces.amazonpay.model.v1.PaymentAction getPaymentAction() {
        return com.amazon.ask.model.interfaces.amazonpay.model.v1.PaymentAction.fromValue(paymentAction);
    }

    /**
     * Get the underlying String value for paymentAction.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return paymentAction as a String value
    **/
    @JsonProperty("paymentAction")
    public String getPaymentActionAsString() {
      return paymentAction;
    }

    /**
     * Get authorizeAttributes
     * @return authorizeAttributes
    **/
    @JsonProperty("authorizeAttributes")
    public com.amazon.ask.model.interfaces.amazonpay.model.v1.AuthorizeAttributes getAuthorizeAttributes() {
        return authorizeAttributes;
    }


    /**
     * Get sellerOrderAttributes
     * @return sellerOrderAttributes
    **/
    @JsonProperty("sellerOrderAttributes")
    public com.amazon.ask.model.interfaces.amazonpay.model.v1.SellerOrderAttributes getSellerOrderAttributes() {
        return sellerOrderAttributes;
    }


    /**
     * Get providerAttributes
     * @return providerAttributes
    **/
    @JsonProperty("providerAttributes")
    public com.amazon.ask.model.interfaces.amazonpay.model.v1.ProviderAttributes getProviderAttributes() {
        return providerAttributes;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChargeAmazonPay interfacesAmazonpayV1ChargeAmazonPay = (ChargeAmazonPay) o;
        return Objects.equals(this.consentToken, interfacesAmazonpayV1ChargeAmazonPay.consentToken) &&
            Objects.equals(this.sellerId, interfacesAmazonpayV1ChargeAmazonPay.sellerId) &&
            Objects.equals(this.billingAgreementId, interfacesAmazonpayV1ChargeAmazonPay.billingAgreementId) &&
            Objects.equals(this.paymentAction, interfacesAmazonpayV1ChargeAmazonPay.paymentAction) &&
            Objects.equals(this.authorizeAttributes, interfacesAmazonpayV1ChargeAmazonPay.authorizeAttributes) &&
            Objects.equals(this.sellerOrderAttributes, interfacesAmazonpayV1ChargeAmazonPay.sellerOrderAttributes) &&
            Objects.equals(this.providerAttributes, interfacesAmazonpayV1ChargeAmazonPay.providerAttributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consentToken, sellerId, billingAgreementId, paymentAction, authorizeAttributes, sellerOrderAttributes, providerAttributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChargeAmazonPay {\n");
        
        sb.append("    consentToken: ").append(toIndentedString(consentToken)).append("\n");
        sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
        sb.append("    billingAgreementId: ").append(toIndentedString(billingAgreementId)).append("\n");
        sb.append("    paymentAction: ").append(toIndentedString(paymentAction)).append("\n");
        sb.append("    authorizeAttributes: ").append(toIndentedString(authorizeAttributes)).append("\n");
        sb.append("    sellerOrderAttributes: ").append(toIndentedString(sellerOrderAttributes)).append("\n");
        sb.append("    providerAttributes: ").append(toIndentedString(providerAttributes)).append("\n");
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
        private String billingAgreementId;
        private String paymentAction;
        private com.amazon.ask.model.interfaces.amazonpay.model.v1.AuthorizeAttributes authorizeAttributes;
        private com.amazon.ask.model.interfaces.amazonpay.model.v1.SellerOrderAttributes sellerOrderAttributes;
        private com.amazon.ask.model.interfaces.amazonpay.model.v1.ProviderAttributes providerAttributes;

        private Builder() {}

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


        @JsonProperty("billingAgreementId")

        public Builder withBillingAgreementId(String billingAgreementId) {
            this.billingAgreementId = billingAgreementId;
            return this;
        }


        @JsonProperty("paymentAction")

        public Builder withPaymentAction(String paymentAction) {
          this.paymentAction = paymentAction;
          return this;
        }

        public Builder withPaymentAction(com.amazon.ask.model.interfaces.amazonpay.model.v1.PaymentAction paymentAction) {
            this.paymentAction = paymentAction != null ? paymentAction.toString() : null;
            return this;
        }


        @JsonProperty("authorizeAttributes")

        public Builder withAuthorizeAttributes(com.amazon.ask.model.interfaces.amazonpay.model.v1.AuthorizeAttributes authorizeAttributes) {
            this.authorizeAttributes = authorizeAttributes;
            return this;
        }


        @JsonProperty("sellerOrderAttributes")

        public Builder withSellerOrderAttributes(com.amazon.ask.model.interfaces.amazonpay.model.v1.SellerOrderAttributes sellerOrderAttributes) {
            this.sellerOrderAttributes = sellerOrderAttributes;
            return this;
        }


        @JsonProperty("providerAttributes")

        public Builder withProviderAttributes(com.amazon.ask.model.interfaces.amazonpay.model.v1.ProviderAttributes providerAttributes) {
            this.providerAttributes = providerAttributes;
            return this;
        }


        public ChargeAmazonPay build() {
            return new ChargeAmazonPay(this);
        }
    }
}

