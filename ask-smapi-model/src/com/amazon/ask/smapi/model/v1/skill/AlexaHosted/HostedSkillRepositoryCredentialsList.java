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
 * defines the structure for the hosted skill repository credentials response
 */

@JsonDeserialize(builder = HostedSkillRepositoryCredentialsList.Builder.class)
public final class HostedSkillRepositoryCredentialsList {

    @JsonProperty("repositoryCredentials")
    private com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryCredentials repositoryCredentials = null;

    private HostedSkillRepositoryCredentialsList() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private HostedSkillRepositoryCredentialsList(Builder builder) {
        if (builder.repositoryCredentials != null) {
            this.repositoryCredentials = builder.repositoryCredentials;
        }
    }

    /**
     * Get repositoryCredentials
     * @return repositoryCredentials
    **/
    @JsonProperty("repositoryCredentials")
    public com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryCredentials getRepositoryCredentials() {
        return repositoryCredentials;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostedSkillRepositoryCredentialsList v1SkillAlexaHostedHostedSkillRepositoryCredentialsList = (HostedSkillRepositoryCredentialsList) o;
        return Objects.equals(this.repositoryCredentials, v1SkillAlexaHostedHostedSkillRepositoryCredentialsList.repositoryCredentials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryCredentials);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostedSkillRepositoryCredentialsList {\n");
        
        sb.append("    repositoryCredentials: ").append(toIndentedString(repositoryCredentials)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryCredentials repositoryCredentials;

        private Builder() {}

        @JsonProperty("repositoryCredentials")

        public Builder withRepositoryCredentials(com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryCredentials repositoryCredentials) {
            this.repositoryCredentials = repositoryCredentials;
            return this;
        }


        public HostedSkillRepositoryCredentialsList build() {
            return new HostedSkillRepositoryCredentialsList(this);
        }
    }
}

