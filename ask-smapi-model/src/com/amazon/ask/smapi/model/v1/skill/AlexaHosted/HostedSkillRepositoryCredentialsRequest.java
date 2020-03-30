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
 * HostedSkillRepositoryCredentialsRequest
 */

@JsonDeserialize(builder = HostedSkillRepositoryCredentialsRequest.Builder.class)
public final class HostedSkillRepositoryCredentialsRequest {

    @JsonProperty("repository")
    private com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryInfo repository = null;

    public static Builder builder() {
        return new Builder();
    }

    private HostedSkillRepositoryCredentialsRequest(Builder builder) {
        if (builder.repository != null) {
            this.repository = builder.repository;
        }
    }

    /**
     * Get repository
     * @return repository
    **/
    @JsonProperty("repository")
    public com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryInfo getRepository() {
        return repository;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostedSkillRepositoryCredentialsRequest v1SkillAlexaHostedHostedSkillRepositoryCredentialsRequest = (HostedSkillRepositoryCredentialsRequest) o;
        return Objects.equals(this.repository, v1SkillAlexaHostedHostedSkillRepositoryCredentialsRequest.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repository);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostedSkillRepositoryCredentialsRequest {\n");
        
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryInfo repository;

        private Builder() {}

        @JsonProperty("repository")

        public Builder withRepository(com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryInfo repository) {
            this.repository = repository;
            return this;
        }


        public HostedSkillRepositoryCredentialsRequest build() {
            return new HostedSkillRepositoryCredentialsRequest(this);
        }
    }
}

