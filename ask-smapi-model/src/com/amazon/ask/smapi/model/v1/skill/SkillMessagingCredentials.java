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
 * Defines the structure for skill messaging credentials.
 */

@JsonDeserialize(builder = SkillMessagingCredentials.Builder.class)
public final class SkillMessagingCredentials {

    @JsonProperty("clientId")
    private String clientId = null;

    @JsonProperty("clientSecret")
    private String clientSecret = null;

    private SkillMessagingCredentials() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SkillMessagingCredentials(Builder builder) {
        if (builder.clientId != null) {
            this.clientId = builder.clientId;
        }
        if (builder.clientSecret != null) {
            this.clientSecret = builder.clientSecret;
        }
    }

    /**
     * The client id for the security profile.
     * @return clientId
    **/
    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }


    /**
     * The client secret for the security profile.
     * @return clientSecret
    **/
    @JsonProperty("clientSecret")
    public String getClientSecret() {
        return clientSecret;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillMessagingCredentials v1SkillSkillMessagingCredentials = (SkillMessagingCredentials) o;
        return Objects.equals(this.clientId, v1SkillSkillMessagingCredentials.clientId) &&
            Objects.equals(this.clientSecret, v1SkillSkillMessagingCredentials.clientSecret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, clientSecret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillMessagingCredentials {\n");
        
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
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
        private String clientId;
        private String clientSecret;

        private Builder() {}

        @JsonProperty("clientId")

        public Builder withClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }


        @JsonProperty("clientSecret")

        public Builder withClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }


        public SkillMessagingCredentials build() {
            return new SkillMessagingCredentials(this);
        }
    }
}

