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
 * HostedSkillInfo
 */

@JsonDeserialize(builder = HostedSkillInfo.Builder.class)
public final class HostedSkillInfo {

    @JsonProperty("repository")
    private com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryInfo repository = null;

    @JsonProperty("runtime")
    private com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRuntime runtime = null;

    public static Builder builder() {
        return new Builder();
    }

    private HostedSkillInfo(Builder builder) {
        if (builder.repository != null) {
            this.repository = builder.repository;
        }
        if (builder.runtime != null) {
            this.runtime = builder.runtime;
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

    /**
     * Get runtime
     * @return runtime
    **/
    @JsonProperty("runtime")
    public com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRuntime getRuntime() {
        return runtime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostedSkillInfo v1SkillAlexaHostedHostedSkillInfo = (HostedSkillInfo) o;
        return Objects.equals(this.repository, v1SkillAlexaHostedHostedSkillInfo.repository) &&
            Objects.equals(this.runtime, v1SkillAlexaHostedHostedSkillInfo.runtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repository, runtime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostedSkillInfo {\n");
        
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRuntime runtime;

        private Builder() {}

        @JsonProperty("repository")
        public Builder withRepository(com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryInfo repository) {
            this.repository = repository;
            return this;
        }


        @JsonProperty("runtime")
        public Builder withRuntime(com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRuntime runtime) {
            this.runtime = runtime;
            return this;
        }


        public HostedSkillInfo build() {
            return new HostedSkillInfo(this);
        }
    }
}

