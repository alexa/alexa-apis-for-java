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
 * Charge Amazon Pay Request Object.
 */

@JsonDeserialize(builder = ChargeAmazonPayRequest.Builder.class)
public final class ChargeAmazonPayRequest extends com.amazon.ask.model.interfaces.amazonpay.model.request.BaseAmazonPayEntity  {

    @JsonProperty("sellerId")
    private String sellerId = null;

    @JsonProperty("billingAgreementId")
    private String billingAgreementId = null;

    @JsonProperty("paymentAction")
    private com.amazon.ask.model.interfaces.amazonpay.model.request.PaymentAction paymentAction = null;

    @JsonProperty("authorizeAttributes")
    private com.amazon.ask.model.interfaces.amazonpay.model.request.AuthorizeAttributes authorizeAttributes = null;

    @JsonProperty("sellerOrderAttributes")
    private com.amazon.ask.model.interfaces.amazonpay.model.request.SellerOrderAttributes sellerOrderAttributes = null;

    @JsonProperty("providerAttributes")
    private com.amazon.ask.model.interfaces.amazonpay.model.request.ProviderAttributes providerAttributes = null;

    private ChargeAmazonPayRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ChargeAmazonPayRequest(Builder builder) {
        String discriminatorValue = "ChargeAmazonPayRequest";

        this.type = discriminatorValue;
        if (builder.version != null) {
            this.version = builder.version;
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
     * @return paymentAction
    **/
    @JsonProperty("paymentAction")
    public com.amazon.ask.model.interfaces.amazonpay.model.request.PaymentAction getPaymentAction() {
        return paymentAction;
    }


    /**
     * Get authorizeAttributes
     * @return authorizeAttributes
    **/
    @JsonProperty("authorizeAttributes")
    public com.amazon.ask.model.interfaces.amazonpay.model.request.AuthorizeAttributes getAuthorizeAttributes() {
        return authorizeAttributes;
    }


    /**
     * Get sellerOrderAttributes
     * @return sellerOrderAttributes
    **/
    @JsonProperty("sellerOrderAttributes")
    public com.amazon.ask.model.interfaces.amazonpay.model.request.SellerOrderAttributes getSellerOrderAttributes() {
        return sellerOrderAttributes;
    }


    /**
     * Get providerAttributes
     * @return providerAttributes
    **/
    @JsonProperty("providerAttributes")
    public com.amazon.ask.model.interfaces.amazonpay.model.request.ProviderAttributes getProviderAttributes() {
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
        ChargeAmazonPayRequest interfacesAmazonpayRequestChargeAmazonPayRequest = (ChargeAmazonPayRequest) o;
        return Objects.equals(this.sellerId, interfacesAmazonpayRequestChargeAmazonPayRequest.sellerId) &&
            Objects.equals(this.billingAgreementId, interfacesAmazonpayRequestChargeAmazonPayRequest.billingAgreementId) &&
            Objects.equals(this.paymentAction, interfacesAmazonpayRequestChargeAmazonPayRequest.paymentAction) &&
            Objects.equals(this.authorizeAttributes, interfacesAmazonpayRequestChargeAmazonPayRequest.authorizeAttributes) &&
            Objects.equals(this.sellerOrderAttributes, interfacesAmazonpayRequestChargeAmazonPayRequest.sellerOrderAttributes) &&
            Objects.equals(this.providerAttributes, interfacesAmazonpayRequestChargeAmazonPayRequest.providerAttributes) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerId, billingAgreementId, paymentAction, authorizeAttributes, sellerOrderAttributes, providerAttributes, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChargeAmazonPayRequest {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
        private String version;
        private String sellerId;
        private String billingAgreementId;
        private com.amazon.ask.model.interfaces.amazonpay.model.request.PaymentAction paymentAction;
        private com.amazon.ask.model.interfaces.amazonpay.model.request.AuthorizeAttributes authorizeAttributes;
        private com.amazon.ask.model.interfaces.amazonpay.model.request.SellerOrderAttributes sellerOrderAttributes;
        private com.amazon.ask.model.interfaces.amazonpay.model.request.ProviderAttributes providerAttributes;

        private Builder() {}

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


        @JsonProperty("billingAgreementId")

        public Builder withBillingAgreementId(String billingAgreementId) {
            this.billingAgreementId = billingAgreementId;
            return this;
        }


        @JsonProperty("paymentAction")

        public Builder withPaymentAction(com.amazon.ask.model.interfaces.amazonpay.model.request.PaymentAction paymentAction) {
            this.paymentAction = paymentAction;
            return this;
        }


        @JsonProperty("authorizeAttributes")

        public Builder withAuthorizeAttributes(com.amazon.ask.model.interfaces.amazonpay.model.request.AuthorizeAttributes authorizeAttributes) {
            this.authorizeAttributes = authorizeAttributes;
            return this;
        }


        @JsonProperty("sellerOrderAttributes")

        public Builder withSellerOrderAttributes(com.amazon.ask.model.interfaces.amazonpay.model.request.SellerOrderAttributes sellerOrderAttributes) {
            this.sellerOrderAttributes = sellerOrderAttributes;
            return this;
        }


        @JsonProperty("providerAttributes")

        public Builder withProviderAttributes(com.amazon.ask.model.interfaces.amazonpay.model.request.ProviderAttributes providerAttributes) {
            this.providerAttributes = providerAttributes;
            return this;
        }


        public ChargeAmazonPayRequest build() {
            return new ChargeAmazonPayRequest(this);
        }
    }
}

