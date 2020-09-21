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


package com.amazon.ask.smapi.model.v1.skill.accountLinking;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The request body of AccountLinkingRequest.
 */

@JsonDeserialize(builder = AccountLinkingRequest.Builder.class)
public final class AccountLinkingRequest {

    @JsonProperty("accountLinkingRequest")
    private com.amazon.ask.smapi.model.v1.skill.accountLinking.AccountLinkingRequestPayload accountLinkingRequest = null;

    public static Builder builder() {
        return new Builder();
    }

    private AccountLinkingRequest(Builder builder) {
        if (builder.accountLinkingRequest != null) {
            this.accountLinkingRequest = builder.accountLinkingRequest;
        }
    }

    /**
     * Get accountLinkingRequest
     * @return accountLinkingRequest
    **/
    @JsonProperty("accountLinkingRequest")
    public com.amazon.ask.smapi.model.v1.skill.accountLinking.AccountLinkingRequestPayload getAccountLinkingRequest() {
        return accountLinkingRequest;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountLinkingRequest v1SkillAccountLinkingAccountLinkingRequest = (AccountLinkingRequest) o;
        return Objects.equals(this.accountLinkingRequest, v1SkillAccountLinkingAccountLinkingRequest.accountLinkingRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountLinkingRequest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountLinkingRequest {\n");
        
        sb.append("    accountLinkingRequest: ").append(toIndentedString(accountLinkingRequest)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.accountLinking.AccountLinkingRequestPayload accountLinkingRequest;

        private Builder() {}

        @JsonProperty("accountLinkingRequest")

        public Builder withAccountLinkingRequest(com.amazon.ask.smapi.model.v1.skill.accountLinking.AccountLinkingRequestPayload accountLinkingRequest) {
            this.accountLinkingRequest = accountLinkingRequest;
            return this;
        }


        public AccountLinkingRequest build() {
            return new AccountLinkingRequest(this);
        }
    }
}

