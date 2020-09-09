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


package com.amazon.ask.model.authorization;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Authorization grant body.
 */

@JsonDeserialize(builder = AuthorizationGrantBody.Builder.class)
public final class AuthorizationGrantBody {

    @JsonProperty("grant")
    private com.amazon.ask.model.authorization.Grant grant = null;

    public static Builder builder() {
        return new Builder();
    }

    private AuthorizationGrantBody(Builder builder) {
        if (builder.grant != null) {
            this.grant = builder.grant;
        }
    }

    /**
     * Get grant
     * @return grant
    **/
    @JsonProperty("grant")
    public com.amazon.ask.model.authorization.Grant getGrant() {
        return grant;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthorizationGrantBody authorizationAuthorizationGrantBody = (AuthorizationGrantBody) o;
        return Objects.equals(this.grant, authorizationAuthorizationGrantBody.grant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grant);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizationGrantBody {\n");
        
        sb.append("    grant: ").append(toIndentedString(grant)).append("\n");
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
        private com.amazon.ask.model.authorization.Grant grant;

        private Builder() {}

        @JsonProperty("grant")

        public Builder withGrant(com.amazon.ask.model.authorization.Grant grant) {
            this.grant = grant;
            return this;
        }


        public AuthorizationGrantBody build() {
            return new AuthorizationGrantBody(this);
        }
    }
}

