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


package com.amazon.ask.model.interfaces.monetization.v1;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Entity to define In Skill Product over which actions will be performed.
 */

@JsonDeserialize(builder = InSkillProduct.Builder.class)
public final class InSkillProduct{

  @JsonProperty("productId")
  private String productId = null;

  public static Builder builder() {
    return new Builder();
  }

  private InSkillProduct(Builder builder) {
    this.productId = builder.productId;
  }

  /**
    * The product ID of In Skill Product.
  * @return productId
  **/
  public String getProductId() {
    return productId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InSkillProduct interfacesMonetizationV1InSkillProduct = (InSkillProduct) o;
    return Objects.equals(this.productId, interfacesMonetizationV1InSkillProduct.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InSkillProduct {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
    private String productId;

    private Builder() { }

    @JsonProperty("productId")
    public Builder withProductId(String productId) {
      this.productId = productId;
      return this;
    }
      

    public InSkillProduct build() {
      return new InSkillProduct(this);
    }
  }
}

