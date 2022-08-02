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
 * A key-value pair object that contains the OAuth2 authorization url to initiate the skill account linking process.
 */

@JsonDeserialize(builder = AccountLinkingPlatformAuthorizationUrl.Builder.class)
public final class AccountLinkingPlatformAuthorizationUrl {

    @JsonProperty("platformType")
    private String platformType = null;

    @JsonProperty("platformAuthorizationUrl")
    private String platformAuthorizationUrl = null;

    private AccountLinkingPlatformAuthorizationUrl() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private AccountLinkingPlatformAuthorizationUrl(Builder builder) {
        if (builder.platformType != null) {
            this.platformType = builder.platformType;
        }
        if (builder.platformAuthorizationUrl != null) {
            this.platformAuthorizationUrl = builder.platformAuthorizationUrl;
        }
    }

    /**
     * Get platformType
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getPlatformTypeAsString().
     *
     * @return platformType
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.accountLinking.PlatformType getPlatformType() {
        return com.amazon.ask.smapi.model.v1.skill.accountLinking.PlatformType.fromValue(platformType);
    }

    /**
     * Get the underlying String value for platformType.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return platformType as a String value
    **/
    @JsonProperty("platformType")
    public String getPlatformTypeAsString() {
      return platformType;
    }

    /**
     * Defines the OAuth2 Authorization URL that will be used in this platform to authenticate the customer / person.
     * @return platformAuthorizationUrl
    **/
    @JsonProperty("platformAuthorizationUrl")
    public String getPlatformAuthorizationUrl() {
        return platformAuthorizationUrl;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountLinkingPlatformAuthorizationUrl v1SkillAccountLinkingAccountLinkingPlatformAuthorizationUrl = (AccountLinkingPlatformAuthorizationUrl) o;
        return Objects.equals(this.platformType, v1SkillAccountLinkingAccountLinkingPlatformAuthorizationUrl.platformType) &&
            Objects.equals(this.platformAuthorizationUrl, v1SkillAccountLinkingAccountLinkingPlatformAuthorizationUrl.platformAuthorizationUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platformType, platformAuthorizationUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountLinkingPlatformAuthorizationUrl {\n");
        
        sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
        sb.append("    platformAuthorizationUrl: ").append(toIndentedString(platformAuthorizationUrl)).append("\n");
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
        private String platformType;
        private String platformAuthorizationUrl;

        private Builder() {}

        @JsonProperty("platformType")

        public Builder withPlatformType(String platformType) {
          this.platformType = platformType;
          return this;
        }

        public Builder withPlatformType(com.amazon.ask.smapi.model.v1.skill.accountLinking.PlatformType platformType) {
            this.platformType = platformType != null ? platformType.toString() : null;
            return this;
        }


        @JsonProperty("platformAuthorizationUrl")

        public Builder withPlatformAuthorizationUrl(String platformAuthorizationUrl) {
            this.platformAuthorizationUrl = platformAuthorizationUrl;
            return this;
        }


        public AccountLinkingPlatformAuthorizationUrl build() {
            return new AccountLinkingPlatformAuthorizationUrl(this);
        }
    }
}

