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
    private com.amazon.ask.smapi.model.v1.skill.Reason reason = null;

    @JsonProperty("message")
    private String message = null;

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
     * @return reason
    **/
    @JsonProperty("reason")
    public com.amazon.ask.smapi.model.v1.skill.Reason getReason() {
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
        private com.amazon.ask.smapi.model.v1.skill.Reason reason;
        private String message;

        private Builder() {}

        @JsonProperty("reason")
        public Builder withReason(com.amazon.ask.smapi.model.v1.skill.Reason reason) {
            this.reason = reason;
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

