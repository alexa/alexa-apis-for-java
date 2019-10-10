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


package com.amazon.ask.model;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object that describes the Amazon account for which the skill is enabled.
 */

@JsonDeserialize(builder = User.Builder.class)
public final class User {

    @JsonProperty("userId")
    private String userId = null;

    @JsonProperty("accessToken")
    private String accessToken = null;

    @JsonProperty("permissions")
    private com.amazon.ask.model.Permissions permissions = null;

    public static Builder builder() {
        return new Builder();
    }

    private User(Builder builder) {
        if (builder.userId != null) {
            this.userId = builder.userId;
        }
        if (builder.accessToken != null) {
            this.accessToken = builder.accessToken;
        }
        if (builder.permissions != null) {
            this.permissions = builder.permissions;
        }
    }

    /**
     * A string that represents a unique identifier for the user who made the request. The length of this identifier can vary, but is never more than 255 characters. The userId is automatically generated when a user enables the skill in the Alexa app. Note: Disabling and re-enabling a skill generates a new identifier.
     * @return userId
    **/
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * A token identifying the user in another system. This is only provided if the user has successfully linked their skill account with their Amazon account.
     * @return accessToken
    **/
    @JsonProperty("accessToken")
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Get permissions
     * @return permissions
    **/
    @JsonProperty("permissions")
    public com.amazon.ask.model.Permissions getPermissions() {
        return permissions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(this.userId, user.userId) &&
            Objects.equals(this.accessToken, user.accessToken) &&
            Objects.equals(this.permissions, user.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, accessToken, permissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");
        
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
        private String userId;
        private String accessToken;
        private com.amazon.ask.model.Permissions permissions;

        private Builder() {}

        @JsonProperty("userId")
        public Builder withUserId(String userId) {
            this.userId = userId;
            return this;
        }


        @JsonProperty("accessToken")
        public Builder withAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }


        @JsonProperty("permissions")
        public Builder withPermissions(com.amazon.ask.model.Permissions permissions) {
            this.permissions = permissions;
            return this;
        }


        public User build() {
            return new User(this);
        }
    }
}

