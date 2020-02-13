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
 * This object includes elements shown to buyers in emails and in their transaction history. See the “SellerOrderAttributes” section of the Amazon Pay API reference guide for details about this object.
 */

@JsonDeserialize(builder = SellerOrderAttributes.Builder.class)
public final class SellerOrderAttributes {

    @JsonProperty("sellerOrderId")
    private String sellerOrderId = null;

    @JsonProperty("storeName")
    private String storeName = null;

    @JsonProperty("customInformation")
    private String customInformation = null;

    @JsonProperty("sellerNote")
    private String sellerNote = null;

    public static Builder builder() {
        return new Builder();
    }

    private SellerOrderAttributes(Builder builder) {
        if (builder.sellerOrderId != null) {
            this.sellerOrderId = builder.sellerOrderId;
        }
        if (builder.storeName != null) {
            this.storeName = builder.storeName;
        }
        if (builder.customInformation != null) {
            this.customInformation = builder.customInformation;
        }
        if (builder.sellerNote != null) {
            this.sellerNote = builder.sellerNote;
        }
    }

    /**
     * The merchant-specified identifier of this order. This is shown to the buyer in their emails and transaction history on the Amazon Pay website.
     * @return sellerOrderId
    **/
    @JsonProperty("sellerOrderId")
    public String getSellerOrderId() {
        return sellerOrderId;
    }

    /**
     * The identifier of the store from which the order was placed. This overrides the default value in Seller Central under Settings &amp;gt; Account Settings. It is displayed to the buyer in their emails and transaction history on the Amazon Payments website.
     * @return storeName
    **/
    @JsonProperty("storeName")
    public String getStoreName() {
        return storeName;
    }

    /**
     * Any additional information that you want to include with this order reference.
     * @return customInformation
    **/
    @JsonProperty("customInformation")
    public String getCustomInformation() {
        return customInformation;
    }

    /**
     * This represents a description of the order that is displayed in emails to the buyer.
     * @return sellerNote
    **/
    @JsonProperty("sellerNote")
    public String getSellerNote() {
        return sellerNote;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SellerOrderAttributes interfacesAmazonpayModelV1SellerOrderAttributes = (SellerOrderAttributes) o;
        return Objects.equals(this.sellerOrderId, interfacesAmazonpayModelV1SellerOrderAttributes.sellerOrderId) &&
            Objects.equals(this.storeName, interfacesAmazonpayModelV1SellerOrderAttributes.storeName) &&
            Objects.equals(this.customInformation, interfacesAmazonpayModelV1SellerOrderAttributes.customInformation) &&
            Objects.equals(this.sellerNote, interfacesAmazonpayModelV1SellerOrderAttributes.sellerNote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerOrderId, storeName, customInformation, sellerNote);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SellerOrderAttributes {\n");
        
        sb.append("    sellerOrderId: ").append(toIndentedString(sellerOrderId)).append("\n");
        sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
        sb.append("    customInformation: ").append(toIndentedString(customInformation)).append("\n");
        sb.append("    sellerNote: ").append(toIndentedString(sellerNote)).append("\n");
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
        private String sellerOrderId;
        private String storeName;
        private String customInformation;
        private String sellerNote;

        private Builder() {}

        @JsonProperty("sellerOrderId")
        public Builder withSellerOrderId(String sellerOrderId) {
            this.sellerOrderId = sellerOrderId;
            return this;
        }


        @JsonProperty("storeName")
        public Builder withStoreName(String storeName) {
            this.storeName = storeName;
            return this;
        }


        @JsonProperty("customInformation")
        public Builder withCustomInformation(String customInformation) {
            this.customInformation = customInformation;
            return this;
        }


        @JsonProperty("sellerNote")
        public Builder withSellerNote(String sellerNote) {
            this.sellerNote = sellerNote;
            return this;
        }


        public SellerOrderAttributes build() {
            return new SellerOrderAttributes(this);
        }
    }
}

