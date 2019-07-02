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


package com.amazon.ask.model.interfaces.amazonpay.response;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Charge Amazon Pay Result Object. It is sent as part of the response to ChargeAmazonPayRequest.
 */

@JsonDeserialize(builder = ChargeAmazonPayResult.Builder.class)
public final class ChargeAmazonPayResult{

  @JsonProperty("amazonOrderReferenceId")
  private String amazonOrderReferenceId = null;

  @JsonProperty("authorizationDetails")
  private com.amazon.ask.model.interfaces.amazonpay.model.response.AuthorizationDetails authorizationDetails = null;

  public static Builder builder() {
    return new Builder();
  }

  private ChargeAmazonPayResult(Builder builder) {
    this.amazonOrderReferenceId = builder.amazonOrderReferenceId;
    this.authorizationDetails = builder.authorizationDetails;
  }

  /**
    * The order reference identifier.
  * @return amazonOrderReferenceId
  **/
  @JsonProperty("amazonOrderReferenceId")
  public String getAmazonOrderReferenceId() {
    return amazonOrderReferenceId;
  }

  /**
    * Get authorizationDetails
  * @return authorizationDetails
  **/
  @JsonProperty("authorizationDetails")
  public com.amazon.ask.model.interfaces.amazonpay.model.response.AuthorizationDetails getAuthorizationDetails() {
    return authorizationDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeAmazonPayResult interfacesAmazonpayResponseChargeAmazonPayResult = (ChargeAmazonPayResult) o;
    return Objects.equals(this.amazonOrderReferenceId, interfacesAmazonpayResponseChargeAmazonPayResult.amazonOrderReferenceId) &&
        Objects.equals(this.authorizationDetails, interfacesAmazonpayResponseChargeAmazonPayResult.authorizationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amazonOrderReferenceId, authorizationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeAmazonPayResult {\n");
    
    sb.append("    amazonOrderReferenceId: ").append(toIndentedString(amazonOrderReferenceId)).append("\n");
    sb.append("    authorizationDetails: ").append(toIndentedString(authorizationDetails)).append("\n");
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
    private String amazonOrderReferenceId;
    private com.amazon.ask.model.interfaces.amazonpay.model.response.AuthorizationDetails authorizationDetails;

    private Builder() { }

    @JsonProperty("amazonOrderReferenceId")
    public Builder withAmazonOrderReferenceId(String amazonOrderReferenceId) {
        this.amazonOrderReferenceId = amazonOrderReferenceId;
        return this;
    }


    @JsonProperty("authorizationDetails")
    public Builder withAuthorizationDetails(com.amazon.ask.model.interfaces.amazonpay.model.response.AuthorizationDetails authorizationDetails) {
        this.authorizationDetails = authorizationDetails;
        return this;
    }


    public ChargeAmazonPayResult build() {
      return new ChargeAmazonPayResult(this);
    }
  }
}

