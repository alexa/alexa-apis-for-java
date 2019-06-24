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
 * Setup Amazon Pay Result Object. It is sent as part of the reponse to SetupAmazonPay request.
 */

@JsonDeserialize(builder = SetupAmazonPayResult.Builder.class)
public final class SetupAmazonPayResult{

  @JsonProperty("billingAgreementDetails")
  private com.amazon.ask.model.interfaces.amazonpay.model.v1.BillingAgreementDetails billingAgreementDetails = null;

  public static Builder builder() {
    return new Builder();
  }

  private SetupAmazonPayResult(Builder builder) {
    this.billingAgreementDetails = builder.billingAgreementDetails;
  }

  /**
    * Get billingAgreementDetails
  * @return billingAgreementDetails
  **/
  public com.amazon.ask.model.interfaces.amazonpay.model.v1.BillingAgreementDetails getBillingAgreementDetails() {
    return billingAgreementDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetupAmazonPayResult interfacesAmazonpayV1SetupAmazonPayResult = (SetupAmazonPayResult) o;
    return Objects.equals(this.billingAgreementDetails, interfacesAmazonpayV1SetupAmazonPayResult.billingAgreementDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAgreementDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetupAmazonPayResult {\n");
    
    sb.append("    billingAgreementDetails: ").append(toIndentedString(billingAgreementDetails)).append("\n");
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
    private com.amazon.ask.model.interfaces.amazonpay.model.v1.BillingAgreementDetails billingAgreementDetails;

    private Builder() { }

    @JsonProperty("billingAgreementDetails")
    public Builder withBillingAgreementDetails(com.amazon.ask.model.interfaces.amazonpay.model.v1.BillingAgreementDetails billingAgreementDetails) {
        this.billingAgreementDetails = billingAgreementDetails;
        return this;
    }


    public SetupAmazonPayResult build() {
      return new SetupAmazonPayResult(this);
    }
  }
}

