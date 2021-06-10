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
 * Defines an android application for LWA authentication provider.
 */

@JsonDeserialize(builder = AuthorizedClientLwaApplicationAndroid.Builder.class)
public final class AuthorizedClientLwaApplicationAndroid {

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("appStoreAppId")
    private String appStoreAppId = null;

    @JsonProperty("clientId")
    private String clientId = null;

    public static Builder builder() {
        return new Builder();
    }

    private AuthorizedClientLwaApplicationAndroid(Builder builder) {
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.appStoreAppId != null) {
            this.appStoreAppId = builder.appStoreAppId;
        }
        if (builder.clientId != null) {
            this.clientId = builder.clientId;
        }
    }

    /**
     * Get type
     * @return type
    **/
    @JsonProperty("type")
    public String getType() {
        return type;
    }


    /**
     * Get appStoreAppId
     * @return appStoreAppId
    **/
    @JsonProperty("appStoreAppId")
    public String getAppStoreAppId() {
        return appStoreAppId;
    }


    /**
     * Get clientId
     * @return clientId
    **/
    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthorizedClientLwaApplicationAndroid v1SkillManifestAuthorizedClientLwaApplicationAndroid = (AuthorizedClientLwaApplicationAndroid) o;
        return Objects.equals(this.type, v1SkillManifestAuthorizedClientLwaApplicationAndroid.type) &&
            Objects.equals(this.appStoreAppId, v1SkillManifestAuthorizedClientLwaApplicationAndroid.appStoreAppId) &&
            Objects.equals(this.clientId, v1SkillManifestAuthorizedClientLwaApplicationAndroid.clientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, appStoreAppId, clientId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizedClientLwaApplicationAndroid {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    appStoreAppId: ").append(toIndentedString(appStoreAppId)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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
        private String type;
        private String appStoreAppId;
        private String clientId;

        private Builder() {}

        @JsonProperty("type")

        public Builder withType(String type) {
            this.type = type;
            return this;
        }


        @JsonProperty("appStoreAppId")

        public Builder withAppStoreAppId(String appStoreAppId) {
            this.appStoreAppId = appStoreAppId;
            return this;
        }


        @JsonProperty("clientId")

        public Builder withClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }


        public AuthorizedClientLwaApplicationAndroid build() {
            return new AuthorizedClientLwaApplicationAndroid(this);
        }
    }
}

