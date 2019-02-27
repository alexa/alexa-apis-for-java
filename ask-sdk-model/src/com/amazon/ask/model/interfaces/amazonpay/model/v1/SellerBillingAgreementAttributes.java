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
 * Provides more context about the billing agreement that is represented by this Billing Agreement object.
 */

@JsonDeserialize(builder = SellerBillingAgreementAttributes.Builder.class)
public final class SellerBillingAgreementAttributes{

  @JsonProperty("sellerBillingAgreementId")
  private String sellerBillingAgreementId = null;

  @JsonProperty("storeName")
  private String storeName = null;

  @JsonProperty("customInformation")
  private String customInformation = null;

  public static Builder builder() {
    return new Builder();
  }

  private SellerBillingAgreementAttributes(Builder builder) {
    this.sellerBillingAgreementId = builder.sellerBillingAgreementId;
    this.storeName = builder.storeName;
    this.customInformation = builder.customInformation;
  }

  /**
    * The merchant-specified identifier of this billing agreement. At least one request parameter must be specified. Amazon recommends that you use only the following characters:- lowercase a-z, uppercase A-Z, numbers 0-9, dash (-), underscore (_).
  * @return sellerBillingAgreementId
  **/
  public String getSellerBillingAgreementId() {
    return sellerBillingAgreementId;
  }

  /**
    * The identifier of the store from which the order was placed. This overrides the default value in Seller Central under Settings &gt; Account Settings. It is displayed to the buyer in their emails and transaction history on the Amazon Payments website.
  * @return storeName
  **/
  public String getStoreName() {
    return storeName;
  }

  /**
    * Any additional information that you wish to include with this billing agreement. At least one request parameter must be specified.
  * @return customInformation
  **/
  public String getCustomInformation() {
    return customInformation;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SellerBillingAgreementAttributes interfacesAmazonpayModelV1SellerBillingAgreementAttributes = (SellerBillingAgreementAttributes) o;
    return Objects.equals(this.sellerBillingAgreementId, interfacesAmazonpayModelV1SellerBillingAgreementAttributes.sellerBillingAgreementId) &&
        Objects.equals(this.storeName, interfacesAmazonpayModelV1SellerBillingAgreementAttributes.storeName) &&
        Objects.equals(this.customInformation, interfacesAmazonpayModelV1SellerBillingAgreementAttributes.customInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerBillingAgreementId, storeName, customInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerBillingAgreementAttributes {\n");
    
    sb.append("    sellerBillingAgreementId: ").append(toIndentedString(sellerBillingAgreementId)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    customInformation: ").append(toIndentedString(customInformation)).append("\n");
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
    private String sellerBillingAgreementId;
    private String storeName;
    private String customInformation;

    private Builder() { }

    @JsonProperty("sellerBillingAgreementId")
    public Builder withSellerBillingAgreementId(String sellerBillingAgreementId) {
      this.sellerBillingAgreementId = sellerBillingAgreementId;
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
      

    public SellerBillingAgreementAttributes build() {
      return new SellerBillingAgreementAttributes(this);
    }
  }
}

