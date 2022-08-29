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


package com.amazon.ask.model.interfaces.amazonpay.model.v1;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Indicates the current status of an Authorization object, a Capture object, or a Refund object.
 */

@JsonDeserialize(builder = AuthorizationStatus.Builder.class)
public final class AuthorizationStatus {

    @JsonProperty("state")
    private String state = null;

    @JsonProperty("reasonCode")
    private String reasonCode = null;

    @JsonProperty("reasonDescription")
    private String reasonDescription = null;

    @JsonProperty("lastUpdateTimestamp")
    private OffsetDateTime lastUpdateTimestamp = null;

    private AuthorizationStatus() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private AuthorizationStatus(Builder builder) {
        if (builder.state != null) {
            this.state = builder.state;
        }
        if (builder.reasonCode != null) {
            this.reasonCode = builder.reasonCode;
        }
        if (builder.reasonDescription != null) {
            this.reasonDescription = builder.reasonDescription;
        }
        if (builder.lastUpdateTimestamp != null) {
            this.lastUpdateTimestamp = builder.lastUpdateTimestamp;
        }
    }

    /**
     * Get state
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStateAsString().
     *
     * @return state
    **/
    
    public com.amazon.ask.model.interfaces.amazonpay.model.v1.State getState() {
        return com.amazon.ask.model.interfaces.amazonpay.model.v1.State.fromValue(state);
    }

    /**
     * Get the underlying String value for state.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return state as a String value
    **/
    @JsonProperty("state")
    public String getStateAsString() {
      return state;
    }

    /**
     * The reason that the Authorization object, Capture object, or Refund object is in the current state. For more information, see - https://pay.amazon.com/us/developer/documentation/apireference/201752950
     * @return reasonCode
    **/
    @JsonProperty("reasonCode")
    public String getReasonCode() {
        return reasonCode;
    }


    /**
     * Reason desciption corresponding to the reason code
     * @return reasonDescription
    **/
    @JsonProperty("reasonDescription")
    public String getReasonDescription() {
        return reasonDescription;
    }


    /**
     * A timestamp that indicates the time when the authorization, capture, or refund state was last updated. In ISO 8601 format
     * @return lastUpdateTimestamp
    **/
    @JsonProperty("lastUpdateTimestamp")
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
        AuthorizationStatus interfacesAmazonpayModelV1AuthorizationStatus = (AuthorizationStatus) o;
        return Objects.equals(this.state, interfacesAmazonpayModelV1AuthorizationStatus.state) &&
            Objects.equals(this.reasonCode, interfacesAmazonpayModelV1AuthorizationStatus.reasonCode) &&
            Objects.equals(this.reasonDescription, interfacesAmazonpayModelV1AuthorizationStatus.reasonDescription) &&
            Objects.equals(this.lastUpdateTimestamp, interfacesAmazonpayModelV1AuthorizationStatus.lastUpdateTimestamp);
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
        private String state;
        private String reasonCode;
        private String reasonDescription;
        private OffsetDateTime lastUpdateTimestamp;

        private Builder() {}

        @JsonProperty("state")

        public Builder withState(String state) {
          this.state = state;
          return this;
        }

        public Builder withState(com.amazon.ask.model.interfaces.amazonpay.model.v1.State state) {
            this.state = state != null ? state.toString() : null;
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

