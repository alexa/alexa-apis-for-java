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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Customer&#39;s permission about Hosted skill features.
 */

@JsonDeserialize(builder = HostedSkillPermission.Builder.class)
public final class HostedSkillPermission {

    @JsonProperty("permission")
    private com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillPermissionType permission = null;

    @JsonProperty("status")
    private com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillPermissionStatus status = null;

    @JsonProperty("actionUrl")
    private String actionUrl = null;

    public static Builder builder() {
        return new Builder();
    }

    private HostedSkillPermission(Builder builder) {
        if (builder.permission != null) {
            this.permission = builder.permission;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.actionUrl != null) {
            this.actionUrl = builder.actionUrl;
        }
    }

    /**
     * Get permission
     * @return permission
    **/
    @JsonProperty("permission")
    public com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillPermissionType getPermission() {
        return permission;
    }

    /**
     * Get status
     * @return status
    **/
    @JsonProperty("status")
    public com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillPermissionStatus getStatus() {
        return status;
    }

    /**
     * Get actionUrl
     * @return actionUrl
    **/
    @JsonProperty("actionUrl")
    public String getActionUrl() {
        return actionUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostedSkillPermission v1SkillAlexaHostedHostedSkillPermission = (HostedSkillPermission) o;
        return Objects.equals(this.permission, v1SkillAlexaHostedHostedSkillPermission.permission) &&
            Objects.equals(this.status, v1SkillAlexaHostedHostedSkillPermission.status) &&
            Objects.equals(this.actionUrl, v1SkillAlexaHostedHostedSkillPermission.actionUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permission, status, actionUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostedSkillPermission {\n");
        
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    actionUrl: ").append(toIndentedString(actionUrl)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillPermissionType permission;
        private com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillPermissionStatus status;
        private String actionUrl;

        private Builder() {}

        @JsonProperty("permission")
        public Builder withPermission(com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillPermissionType permission) {
            this.permission = permission;
            return this;
        }


        @JsonProperty("status")
        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillPermissionStatus status) {
            this.status = status;
            return this;
        }


        @JsonProperty("actionUrl")
        public Builder withActionUrl(String actionUrl) {
            this.actionUrl = actionUrl;
            return this;
        }


        public HostedSkillPermission build() {
            return new HostedSkillPermission(this);
        }
    }
}

