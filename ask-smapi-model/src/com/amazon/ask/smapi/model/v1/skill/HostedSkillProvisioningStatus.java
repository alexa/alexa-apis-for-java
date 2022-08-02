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
 * Defines the provisioning status for hosted skill.
 */

@JsonDeserialize(builder = HostedSkillProvisioningStatus.Builder.class)
public final class HostedSkillProvisioningStatus {

    @JsonProperty("lastUpdateRequest")
    private com.amazon.ask.smapi.model.v1.skill.HostedSkillProvisioningLastUpdateRequest lastUpdateRequest = null;

    private HostedSkillProvisioningStatus() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private HostedSkillProvisioningStatus(Builder builder) {
        if (builder.lastUpdateRequest != null) {
            this.lastUpdateRequest = builder.lastUpdateRequest;
        }
    }

    /**
     * Get lastUpdateRequest
     * @return lastUpdateRequest
    **/
    @JsonProperty("lastUpdateRequest")
    public com.amazon.ask.smapi.model.v1.skill.HostedSkillProvisioningLastUpdateRequest getLastUpdateRequest() {
        return lastUpdateRequest;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostedSkillProvisioningStatus v1SkillHostedSkillProvisioningStatus = (HostedSkillProvisioningStatus) o;
        return Objects.equals(this.lastUpdateRequest, v1SkillHostedSkillProvisioningStatus.lastUpdateRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastUpdateRequest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostedSkillProvisioningStatus {\n");
        
        sb.append("    lastUpdateRequest: ").append(toIndentedString(lastUpdateRequest)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.HostedSkillProvisioningLastUpdateRequest lastUpdateRequest;

        private Builder() {}

        @JsonProperty("lastUpdateRequest")

        public Builder withLastUpdateRequest(com.amazon.ask.smapi.model.v1.skill.HostedSkillProvisioningLastUpdateRequest lastUpdateRequest) {
            this.lastUpdateRequest = lastUpdateRequest;
            return this;
        }


        public HostedSkillProvisioningStatus build() {
            return new HostedSkillProvisioningStatus(this);
        }
    }
}

