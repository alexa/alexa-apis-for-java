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


package com.amazon.ask.model.interfaces.amazonpay.model.v1;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The merchant can choose to set the attributes specified in the BillingAgreementAttributes.
 */

@JsonDeserialize(builder = BillingAgreementAttributes.Builder.class)
public final class BillingAgreementAttributes {

    @JsonProperty("platformId")
    private String platformId = null;

    @JsonProperty("sellerNote")
    private String sellerNote = null;

    @JsonProperty("sellerBillingAgreementAttributes")
    private com.amazon.ask.model.interfaces.amazonpay.model.v1.SellerBillingAgreementAttributes sellerBillingAgreementAttributes = null;

    @JsonProperty("billingAgreementType")
    private String billingAgreementType = null;

    @JsonProperty("subscriptionAmount")
    private com.amazon.ask.model.interfaces.amazonpay.model.v1.Price subscriptionAmount = null;

    private BillingAgreementAttributes() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private BillingAgreementAttributes(Builder builder) {
        if (builder.platformId != null) {
            this.platformId = builder.platformId;
        }
        if (builder.sellerNote != null) {
            this.sellerNote = builder.sellerNote;
        }
        if (builder.sellerBillingAgreementAttributes != null) {
            this.sellerBillingAgreementAttributes = builder.sellerBillingAgreementAttributes;
        }
        if (builder.billingAgreementType != null) {
            this.billingAgreementType = builder.billingAgreementType;
        }
        if (builder.subscriptionAmount != null) {
            this.subscriptionAmount = builder.subscriptionAmount;
        }
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
    public com.amazon.ask.model.interfaces.amazonpay.model.v1.SellerBillingAgreementAttributes getSellerBillingAgreementAttributes() {
        return sellerBillingAgreementAttributes;
    }


    /**
     * Get billingAgreementType
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getBillingAgreementTypeAsString().
     *
     * @return billingAgreementType
    **/
    
    public com.amazon.ask.model.interfaces.amazonpay.model.v1.BillingAgreementType getBillingAgreementType() {
        return com.amazon.ask.model.interfaces.amazonpay.model.v1.BillingAgreementType.fromValue(billingAgreementType);
    }

    /**
     * Get the underlying String value for billingAgreementType.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return billingAgreementType as a String value
    **/
    @JsonProperty("billingAgreementType")
    public String getBillingAgreementTypeAsString() {
      return billingAgreementType;
    }

    /**
     * Get subscriptionAmount
     * @return subscriptionAmount
    **/
    @JsonProperty("subscriptionAmount")
    public com.amazon.ask.model.interfaces.amazonpay.model.v1.Price getSubscriptionAmount() {
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
        BillingAgreementAttributes interfacesAmazonpayModelV1BillingAgreementAttributes = (BillingAgreementAttributes) o;
        return Objects.equals(this.platformId, interfacesAmazonpayModelV1BillingAgreementAttributes.platformId) &&
            Objects.equals(this.sellerNote, interfacesAmazonpayModelV1BillingAgreementAttributes.sellerNote) &&
            Objects.equals(this.sellerBillingAgreementAttributes, interfacesAmazonpayModelV1BillingAgreementAttributes.sellerBillingAgreementAttributes) &&
            Objects.equals(this.billingAgreementType, interfacesAmazonpayModelV1BillingAgreementAttributes.billingAgreementType) &&
            Objects.equals(this.subscriptionAmount, interfacesAmazonpayModelV1BillingAgreementAttributes.subscriptionAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platformId, sellerNote, sellerBillingAgreementAttributes, billingAgreementType, subscriptionAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingAgreementAttributes {\n");
        
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
        private com.amazon.ask.model.interfaces.amazonpay.model.v1.SellerBillingAgreementAttributes sellerBillingAgreementAttributes;
        private String billingAgreementType;
        private com.amazon.ask.model.interfaces.amazonpay.model.v1.Price subscriptionAmount;

        private Builder() {}

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

        public Builder withSellerBillingAgreementAttributes(com.amazon.ask.model.interfaces.amazonpay.model.v1.SellerBillingAgreementAttributes sellerBillingAgreementAttributes) {
            this.sellerBillingAgreementAttributes = sellerBillingAgreementAttributes;
            return this;
        }


        @JsonProperty("billingAgreementType")

        public Builder withBillingAgreementType(String billingAgreementType) {
          this.billingAgreementType = billingAgreementType;
          return this;
        }

        public Builder withBillingAgreementType(com.amazon.ask.model.interfaces.amazonpay.model.v1.BillingAgreementType billingAgreementType) {
            this.billingAgreementType = billingAgreementType != null ? billingAgreementType.toString() : null;
            return this;
        }


        @JsonProperty("subscriptionAmount")

        public Builder withSubscriptionAmount(com.amazon.ask.model.interfaces.amazonpay.model.v1.Price subscriptionAmount) {
            this.subscriptionAmount = subscriptionAmount;
            return this;
        }


        public BillingAgreementAttributes build() {
            return new BillingAgreementAttributes(this);
        }
    }
}

