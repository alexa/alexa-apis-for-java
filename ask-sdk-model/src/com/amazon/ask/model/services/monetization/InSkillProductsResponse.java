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


package com.amazon.ask.model.services.monetization;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InSkillProductsResponse
 */

@JsonDeserialize(builder = InSkillProductsResponse.Builder.class)
public final class InSkillProductsResponse{

  @JsonProperty("inSkillProducts")
  private List<com.amazon.ask.model.services.monetization.InSkillProduct> inSkillProducts = new ArrayList<com.amazon.ask.model.services.monetization.InSkillProduct>();

  @JsonProperty("isTruncated")
  private Boolean isTruncated = null;

  @JsonProperty("nextToken")
  private String nextToken = null;

  public static Builder builder() {
    return new Builder();
  }

  private InSkillProductsResponse(Builder builder) {
    this.inSkillProducts = builder.inSkillProducts;
    this.isTruncated = builder.isTruncated;
    this.nextToken = builder.nextToken;
  }

  /**
    * List of In-Skill Products
  * @return inSkillProducts
  **/
  public List<com.amazon.ask.model.services.monetization.InSkillProduct> getInSkillProducts() {
    return inSkillProducts;
  }

  /**
    * Get isTruncated
  * @return isTruncated
  **/
  public Boolean getIsTruncated() {
    return isTruncated;
  }

  /**
    * Get nextToken
  * @return nextToken
  **/
  public String getNextToken() {
    return nextToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InSkillProductsResponse servicesMonetizationInSkillProductsResponse = (InSkillProductsResponse) o;
    return Objects.equals(this.inSkillProducts, servicesMonetizationInSkillProductsResponse.inSkillProducts) &&
        Objects.equals(this.isTruncated, servicesMonetizationInSkillProductsResponse.isTruncated) &&
        Objects.equals(this.nextToken, servicesMonetizationInSkillProductsResponse.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inSkillProducts, isTruncated, nextToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InSkillProductsResponse {\n");
    
    sb.append("    inSkillProducts: ").append(toIndentedString(inSkillProducts)).append("\n");
    sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
    private List<com.amazon.ask.model.services.monetization.InSkillProduct> inSkillProducts;
    private Boolean isTruncated;
    private String nextToken;

    private Builder() { }

    @JsonProperty("inSkillProducts")
    public Builder withInSkillProducts(List<com.amazon.ask.model.services.monetization.InSkillProduct> inSkillProducts) {
      this.inSkillProducts = inSkillProducts;
      return this;
    }
      
    public Builder addInSkillProductsItem(com.amazon.ask.model.services.monetization.InSkillProduct inSkillProductsItem) {
      if (this.inSkillProducts == null) {
        this.inSkillProducts = new ArrayList<com.amazon.ask.model.services.monetization.InSkillProduct>();
      }
      this.inSkillProducts.add(inSkillProductsItem);
      return this;
    }

    @JsonProperty("isTruncated")
    public Builder withIsTruncated(Boolean isTruncated) {
      this.isTruncated = isTruncated;
      return this;
    }
      

    @JsonProperty("nextToken")
    public Builder withNextToken(String nextToken) {
      this.nextToken = nextToken;
      return this;
    }
      

    public InSkillProductsResponse build() {
      return new InSkillProductsResponse(this);
    }
  }
}

