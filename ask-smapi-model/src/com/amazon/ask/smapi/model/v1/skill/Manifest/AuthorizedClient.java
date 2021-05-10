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


package com.amazon.ask.smapi.model.v1.skill.Manifest;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines a client authorized for a skill.
 */

@JsonDeserialize(builder = AuthorizedClient.Builder.class)
public final class AuthorizedClient {

    @JsonProperty("authenticationProvider")
    private String authenticationProvider = null;

    public static Builder builder() {
        return new Builder();
    }

    private AuthorizedClient(Builder builder) {
        if (builder.authenticationProvider != null) {
            this.authenticationProvider = builder.authenticationProvider;
        }
    }

    /**
     * Get authenticationProvider
     * @return authenticationProvider
    **/
    @JsonProperty("authenticationProvider")
    public String getAuthenticationProvider() {
        return authenticationProvider;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthorizedClient v1SkillManifestAuthorizedClient = (AuthorizedClient) o;
        return Objects.equals(this.authenticationProvider, v1SkillManifestAuthorizedClient.authenticationProvider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authenticationProvider);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizedClient {\n");
        
        sb.append("    authenticationProvider: ").append(toIndentedString(authenticationProvider)).append("\n");
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
        private String authenticationProvider;

        private Builder() {}

        @JsonProperty("authenticationProvider")

        public Builder withAuthenticationProvider(String authenticationProvider) {
            this.authenticationProvider = authenticationProvider;
            return this;
        }


        public AuthorizedClient build() {
            return new AuthorizedClient(this);
        }
    }
}

