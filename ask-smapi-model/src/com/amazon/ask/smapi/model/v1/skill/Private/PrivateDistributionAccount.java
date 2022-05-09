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


package com.amazon.ask.smapi.model.v1.skill.Private;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains information of the private distribution account with given id.
 */

@JsonDeserialize(builder = PrivateDistributionAccount.Builder.class)
public final class PrivateDistributionAccount {

    @JsonProperty("principal")
    private String principal = null;

    @JsonProperty("acceptStatus")
    private String acceptStatus = null;

    public static Builder builder() {
        return new Builder();
    }

    private PrivateDistributionAccount(Builder builder) {
        if (builder.principal != null) {
            this.principal = builder.principal;
        }
        if (builder.acceptStatus != null) {
            this.acceptStatus = builder.acceptStatus;
        }
    }

    /**
     * 12-digit numerical account ID for AWS account holders.
     * @return principal
    **/
    @JsonProperty("principal")
    public String getPrincipal() {
        return principal;
    }


    /**
     * Get acceptStatus
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getAcceptStatusAsString().
     *
     * @return acceptStatus
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Private.AcceptStatus getAcceptStatus() {
        return com.amazon.ask.smapi.model.v1.skill.Private.AcceptStatus.fromValue(acceptStatus);
    }

    /**
     * Get the underlying String value for acceptStatus.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return acceptStatus as a String value
    **/
    @JsonProperty("acceptStatus")
    public String getAcceptStatusAsString() {
      return acceptStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrivateDistributionAccount v1SkillPrivatePrivateDistributionAccount = (PrivateDistributionAccount) o;
        return Objects.equals(this.principal, v1SkillPrivatePrivateDistributionAccount.principal) &&
            Objects.equals(this.acceptStatus, v1SkillPrivatePrivateDistributionAccount.acceptStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principal, acceptStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateDistributionAccount {\n");
        
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
        sb.append("    acceptStatus: ").append(toIndentedString(acceptStatus)).append("\n");
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
        private String principal;
        private String acceptStatus;

        private Builder() {}

        @JsonProperty("principal")

        public Builder withPrincipal(String principal) {
            this.principal = principal;
            return this;
        }


        @JsonProperty("acceptStatus")

        public Builder withAcceptStatus(String acceptStatus) {
          this.acceptStatus = acceptStatus;
          return this;
        }

        public Builder withAcceptStatus(com.amazon.ask.smapi.model.v1.skill.Private.AcceptStatus acceptStatus) {
            this.acceptStatus = acceptStatus != null ? acceptStatus.toString() : null;
            return this;
        }


        public PrivateDistributionAccount build() {
            return new PrivateDistributionAccount(this);
        }
    }
}

