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


package com.amazon.ask.model.interfaces.amazonpay.model.request;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProviderCredit
 */

@JsonDeserialize(builder = ProviderCredit.Builder.class)
public final class ProviderCredit extends com.amazon.ask.model.interfaces.amazonpay.model.request.BaseAmazonPayEntity {

  @JsonProperty("providerId")
  private String providerId = null;

  @JsonProperty("credit")
  private com.amazon.ask.model.interfaces.amazonpay.model.request.Price credit = null;

  public static Builder builder() {
    return new Builder();
  }

  private ProviderCredit(Builder builder) {
    String discriminatorValue = "ProviderCredit";

    this.providerId = builder.providerId;
    this.credit = builder.credit;
    this.type = discriminatorValue;
    this.version = builder.version;
  }

  /**
    * This is required only for Ecommerce provider (Solution provider) use cases.
  * @return providerId
  **/
  public String getProviderId() {
    return providerId;
  }

  /**
    * Get credit
  * @return credit
  **/
  public com.amazon.ask.model.interfaces.amazonpay.model.request.Price getCredit() {
    return credit;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProviderCredit interfacesAmazonpayModelRequestProviderCredit = (ProviderCredit) o;
    return Objects.equals(this.providerId, interfacesAmazonpayModelRequestProviderCredit.providerId) &&
        Objects.equals(this.credit, interfacesAmazonpayModelRequestProviderCredit.credit) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerId, credit, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProviderCredit {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
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
    private com.amazon.ask.model.interfaces.amazonpay.model.request.Price credit;
    private String version;

    private Builder() { }

    @JsonProperty("providerId")
    public Builder withProviderId(String providerId) {
      this.providerId = providerId;
      return this;
    }
      

    @JsonProperty("credit")
    public Builder withCredit(com.amazon.ask.model.interfaces.amazonpay.model.request.Price credit) {
      this.credit = credit;
      return this;
    }
      
      

    @JsonProperty("@version")
    public Builder withVersion(String version) {
      this.version = version;
      return this;
    }
      

    public ProviderCredit build() {
      return new ProviderCredit(this);
    }
  }
}

