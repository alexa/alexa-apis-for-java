/*
* Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is required only for Ecommerce provider (Solution provider) use cases.
 */

@JsonDeserialize(builder = ProviderAttributes.Builder.class)
public final class ProviderAttributes{

  @JsonProperty("providerId")
  private String providerId = null;

  @JsonProperty("providerCreditList")
  private List<com.amazon.ask.model.interfaces.amazonpay.model.v1.ProviderCredit> providerCreditList = new ArrayList<com.amazon.ask.model.interfaces.amazonpay.model.v1.ProviderCredit>();

  public static Builder builder() {
    return new Builder();
  }

  private ProviderAttributes(Builder builder) {
    this.providerId = builder.providerId;
    this.providerCreditList = builder.providerCreditList;
  }

  /**
    * Solution provider ID.
  * @return providerId
  **/
  public String getProviderId() {
    return providerId;
  }

  /**
    * List of provider credit.
  * @return providerCreditList
  **/
  public List<com.amazon.ask.model.interfaces.amazonpay.model.v1.ProviderCredit> getProviderCreditList() {
    return providerCreditList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProviderAttributes interfacesAmazonpayModelV1ProviderAttributes = (ProviderAttributes) o;
    return Objects.equals(this.providerId, interfacesAmazonpayModelV1ProviderAttributes.providerId) &&
        Objects.equals(this.providerCreditList, interfacesAmazonpayModelV1ProviderAttributes.providerCreditList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerId, providerCreditList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProviderAttributes {\n");
    
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    providerCreditList: ").append(toIndentedString(providerCreditList)).append("\n");
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
    private String providerId;
    private List<com.amazon.ask.model.interfaces.amazonpay.model.v1.ProviderCredit> providerCreditList;

    private Builder() { }

    @JsonProperty("providerId")
    public Builder withProviderId(String providerId) {
      this.providerId = providerId;
      return this;
    }
      

    @JsonProperty("providerCreditList")
    public Builder withProviderCreditList(List<com.amazon.ask.model.interfaces.amazonpay.model.v1.ProviderCredit> providerCreditList) {
      this.providerCreditList = providerCreditList;
      return this;
    }
      
    public Builder addProviderCreditListItem(com.amazon.ask.model.interfaces.amazonpay.model.v1.ProviderCredit providerCreditListItem) {
      if (this.providerCreditList == null) {
        this.providerCreditList = new ArrayList<com.amazon.ask.model.interfaces.amazonpay.model.v1.ProviderCredit>();
      }
      this.providerCreditList.add(providerCreditListItem);
      return this;
    }

    public ProviderAttributes build() {
      return new ProviderAttributes(this);
    }
  }
}

