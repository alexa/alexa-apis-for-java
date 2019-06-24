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


package com.amazon.ask.model.interfaces.amazonpay.model.response;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Indicates the current status of an Authorization object, a Capture object, or a Refund object.
 */

@JsonDeserialize(builder = AuthorizationStatus.Builder.class)
public final class AuthorizationStatus{

  @JsonProperty("state")
  private com.amazon.ask.model.interfaces.amazonpay.model.response.State state = null;

  @JsonProperty("reasonCode")
  private String reasonCode = null;

  @JsonProperty("reasonDescription")
  private String reasonDescription = null;

  @JsonProperty("lastUpdateTimestamp")
  private OffsetDateTime lastUpdateTimestamp = null;

  public static Builder builder() {
    return new Builder();
  }

  private AuthorizationStatus(Builder builder) {
    this.state = builder.state;
    this.reasonCode = builder.reasonCode;
    this.reasonDescription = builder.reasonDescription;
    this.lastUpdateTimestamp = builder.lastUpdateTimestamp;
  }

  /**
    * Get state
  * @return state
  **/
  public com.amazon.ask.model.interfaces.amazonpay.model.response.State getState() {
    return state;
  }

  /**
    * The reason that the Authorization object, Capture object, or Refund object is in the current state. For more information, see - https://pay.amazon.com/us/developer/documentation/apireference/201752950
  * @return reasonCode
  **/
  public String getReasonCode() {
    return reasonCode;
  }

  /**
    * Reason desciption corresponding to the reason code
  * @return reasonDescription
  **/
  public String getReasonDescription() {
    return reasonDescription;
  }

  /**
    * A timestamp that indicates the time when the authorization, capture, or refund state was last updated. In ISO 8601 format
  * @return lastUpdateTimestamp
  **/
  public OffsetDateTime getLastUpdateTimestamp() {
    return lastUpdateTimestamp;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationStatus interfacesAmazonpayModelResponseAuthorizationStatus = (AuthorizationStatus) o;
    return Objects.equals(this.state, interfacesAmazonpayModelResponseAuthorizationStatus.state) &&
        Objects.equals(this.reasonCode, interfacesAmazonpayModelResponseAuthorizationStatus.reasonCode) &&
        Objects.equals(this.reasonDescription, interfacesAmazonpayModelResponseAuthorizationStatus.reasonDescription) &&
        Objects.equals(this.lastUpdateTimestamp, interfacesAmazonpayModelResponseAuthorizationStatus.lastUpdateTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, reasonCode, reasonDescription, lastUpdateTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationStatus {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    reasonDescription: ").append(toIndentedString(reasonDescription)).append("\n");
    sb.append("    lastUpdateTimestamp: ").append(toIndentedString(lastUpdateTimestamp)).append("\n");
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
    private com.amazon.ask.model.interfaces.amazonpay.model.response.State state;
    private String reasonCode;
    private String reasonDescription;
    private OffsetDateTime lastUpdateTimestamp;

    private Builder() { }

    @JsonProperty("state")
    public Builder withState(com.amazon.ask.model.interfaces.amazonpay.model.response.State state) {
        this.state = state;
        return this;
    }


    @JsonProperty("reasonCode")
    public Builder withReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }


    @JsonProperty("reasonDescription")
    public Builder withReasonDescription(String reasonDescription) {
        this.reasonDescription = reasonDescription;
        return this;
    }


    @JsonProperty("lastUpdateTimestamp")
    public Builder withLastUpdateTimestamp(OffsetDateTime lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
        return this;
    }


    public AuthorizationStatus build() {
      return new AuthorizationStatus(this);
    }
  }
}

