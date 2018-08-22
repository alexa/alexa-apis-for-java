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


package com.amazon.ask.model;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains a consentToken allowing the skill access to information that the customer has consented to provide, such as address information. Note that the consentToken is deprecated. Use the apiAccessToken available in the context object to determine the user’s permissions.
 */

@JsonDeserialize(builder = Permissions.Builder.class)
public final class Permissions{

  @JsonProperty("consentToken")
  private String consentToken = null;

  public static Builder builder() {
    return new Builder();
  }

  private Permissions(Builder builder) {
    this.consentToken = builder.consentToken;
  }

  /**
    * A token listing all the permissions granted for this user
  * @return consentToken
  **/
  public String getConsentToken() {
    return consentToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permissions permissions = (Permissions) o;
    return Objects.equals(this.consentToken, permissions.consentToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permissions {\n");
    
    sb.append("    consentToken: ").append(toIndentedString(consentToken)).append("\n");
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
    private String consentToken;

    private Builder() { }

    @JsonProperty("consentToken")
    public Builder withConsentToken(String consentToken) {
      this.consentToken = consentToken;
      return this;
    }
      

    public Permissions build() {
      return new Permissions(this);
    }
  }
}

