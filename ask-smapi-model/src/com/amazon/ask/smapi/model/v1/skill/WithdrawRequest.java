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


package com.amazon.ask.smapi.model.v1.skill;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The payload for the withdraw operation.
 */

@JsonDeserialize(builder = WithdrawRequest.Builder.class)
public final class WithdrawRequest {

    @JsonProperty("reason")
    private String reason = null;

    @JsonProperty("message")
    private String message = null;

    private WithdrawRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private WithdrawRequest(Builder builder) {
        if (builder.reason != null) {
            this.reason = builder.reason;
        }
        if (builder.message != null) {
            this.message = builder.message;
        }
    }

    /**
     * Get reason
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getReasonAsString().
     *
     * @return reason
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Reason getReason() {
        return com.amazon.ask.smapi.model.v1.skill.Reason.fromValue(reason);
    }

    /**
     * Get the underlying String value for reason.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return reason as a String value
    **/
    @JsonProperty("reason")
    public String getReasonAsString() {
      return reason;
    }

    /**
     * The message only in case the reason in OTHER.
     * @return message
    **/
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WithdrawRequest v1SkillWithdrawRequest = (WithdrawRequest) o;
        return Objects.equals(this.reason, v1SkillWithdrawRequest.reason) &&
            Objects.equals(this.message, v1SkillWithdrawRequest.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WithdrawRequest {\n");
        
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
        private String reason;
        private String message;

        private Builder() {}

        @JsonProperty("reason")

        public Builder withReason(String reason) {
          this.reason = reason;
          return this;
        }

        public Builder withReason(com.amazon.ask.smapi.model.v1.skill.Reason reason) {
            this.reason = reason != null ? reason.toString() : null;
            return this;
        }


        @JsonProperty("message")

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }


        public WithdrawRequest build() {
            return new WithdrawRequest(this);
        }
    }
}

