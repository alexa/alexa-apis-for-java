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


package com.amazon.ask.smapi.model.v1.skill.AlexaHosted;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HostedSkillRepositoryCredentials
 */

@JsonDeserialize(builder = HostedSkillRepositoryCredentials.Builder.class)
public final class HostedSkillRepositoryCredentials {

    @JsonProperty("username")
    private String username = null;

    @JsonProperty("password")
    private String password = null;

    @JsonProperty("expiresAt")
    private OffsetDateTime expiresAt = null;

    public static Builder builder() {
        return new Builder();
    }

    private HostedSkillRepositoryCredentials(Builder builder) {
        if (builder.username != null) {
            this.username = builder.username;
        }
        if (builder.password != null) {
            this.password = builder.password;
        }
        if (builder.expiresAt != null) {
            this.expiresAt = builder.expiresAt;
        }
    }

    /**
     * AWS Access Key ID used to access hosted skill repository
     * @return username
    **/
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }


    /**
     * signed AWS Credentials used to access hosted skill repository
     * @return password
    **/
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }


    /**
     * expiration time for the credentials
     * @return expiresAt
    **/
    @JsonProperty("expiresAt")
    public OffsetDateTime getExpiresAt() {
        return expiresAt;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostedSkillRepositoryCredentials v1SkillAlexaHostedHostedSkillRepositoryCredentials = (HostedSkillRepositoryCredentials) o;
        return Objects.equals(this.username, v1SkillAlexaHostedHostedSkillRepositoryCredentials.username) &&
            Objects.equals(this.password, v1SkillAlexaHostedHostedSkillRepositoryCredentials.password) &&
            Objects.equals(this.expiresAt, v1SkillAlexaHostedHostedSkillRepositoryCredentials.expiresAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, expiresAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostedSkillRepositoryCredentials {\n");
        
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
        private String username;
        private String password;
        private OffsetDateTime expiresAt;

        private Builder() {}

        @JsonProperty("username")

        public Builder withUsername(String username) {
            this.username = username;
            return this;
        }


        @JsonProperty("password")

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }


        @JsonProperty("expiresAt")

        public Builder withExpiresAt(OffsetDateTime expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }


        public HostedSkillRepositoryCredentials build() {
            return new HostedSkillRepositoryCredentials(this);
        }
    }
}

