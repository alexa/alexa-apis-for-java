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


package com.amazon.ask.model.services.ups;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PhoneNumber
 */

@JsonDeserialize(builder = PhoneNumber.Builder.class)
public final class PhoneNumber{

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  public static Builder builder() {
    return new Builder();
  }

  private PhoneNumber(Builder builder) {
    this.countryCode = builder.countryCode;
    this.phoneNumber = builder.phoneNumber;
  }

  /**
    * Get countryCode
  * @return countryCode
  **/
  public String getCountryCode() {
    return countryCode;
  }

  /**
    * Get phoneNumber
  * @return phoneNumber
  **/
  public String getPhoneNumber() {
    return phoneNumber;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumber servicesUpsPhoneNumber = (PhoneNumber) o;
    return Objects.equals(this.countryCode, servicesUpsPhoneNumber.countryCode) &&
        Objects.equals(this.phoneNumber, servicesUpsPhoneNumber.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumber {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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
    private String countryCode;
    private String phoneNumber;

    private Builder() { }

    @JsonProperty("countryCode")
    public Builder withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }


    @JsonProperty("phoneNumber")
    public Builder withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }


    public PhoneNumber build() {
      return new PhoneNumber(this);
    }
  }
}

