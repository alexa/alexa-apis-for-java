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
 * Details about hosted skill deployment.
 */

@JsonDeserialize(builder = HostedSkillDeploymentDetails.Builder.class)
public final class HostedSkillDeploymentDetails {

    @JsonProperty("commitId")
    private String commitId = null;

    @JsonProperty("logUrl")
    private String logUrl = null;

    public static Builder builder() {
        return new Builder();
    }

    private HostedSkillDeploymentDetails(Builder builder) {
        if (builder.commitId != null) {
            this.commitId = builder.commitId;
        }
        if (builder.logUrl != null) {
            this.logUrl = builder.logUrl;
        }
    }

    /**
     * Get commitId
     * @return commitId
    **/
    @JsonProperty("commitId")
    public String getCommitId() {
        return commitId;
    }


    /**
     * Get logUrl
     * @return logUrl
    **/
    @JsonProperty("logUrl")
    public String getLogUrl() {
        return logUrl;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostedSkillDeploymentDetails v1SkillHostedSkillDeploymentDetails = (HostedSkillDeploymentDetails) o;
        return Objects.equals(this.commitId, v1SkillHostedSkillDeploymentDetails.commitId) &&
            Objects.equals(this.logUrl, v1SkillHostedSkillDeploymentDetails.logUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commitId, logUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostedSkillDeploymentDetails {\n");
        
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    logUrl: ").append(toIndentedString(logUrl)).append("\n");
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
        private String commitId;
        private String logUrl;

        private Builder() {}

        @JsonProperty("commitId")

        public Builder withCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }


        @JsonProperty("logUrl")

        public Builder withLogUrl(String logUrl) {
            this.logUrl = logUrl;
            return this;
        }


        public HostedSkillDeploymentDetails build() {
            return new HostedSkillDeploymentDetails(this);
        }
    }
}

