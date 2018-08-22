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


package com.amazon.ask.model.events.skillevents;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AccountLinkedBody
 */

@JsonDeserialize(builder = AccountLinkedBody.Builder.class)
public final class AccountLinkedBody{

  @JsonProperty("accessToken")
  private String accessToken = null;

  public static Builder builder() {
    return new Builder();
  }

  private AccountLinkedBody(Builder builder) {
    this.accessToken = builder.accessToken;
  }

  /**
    * Get accessToken
  * @return accessToken
  **/
  public String getAccessToken() {
    return accessToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountLinkedBody eventsSkilleventsAccountLinkedBody = (AccountLinkedBody) o;
    return Objects.equals(this.accessToken, eventsSkilleventsAccountLinkedBody.accessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountLinkedBody {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
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
    private String accessToken;

    private Builder() { }

    @JsonProperty("accessToken")
    public Builder withAccessToken(String accessToken) {
      this.accessToken = accessToken;
      return this;
    }
      

    public AccountLinkedBody build() {
      return new AccountLinkedBody(this);
    }
  }
}

