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
 * defines the request body to create a rollback request
 */

@JsonDeserialize(builder = CreateRollbackRequest.Builder.class)
public final class CreateRollbackRequest {

    @JsonProperty("targetVersion")
    private String targetVersion = null;

    public static Builder builder() {
        return new Builder();
    }

    private CreateRollbackRequest(Builder builder) {
        if (builder.targetVersion != null) {
            this.targetVersion = builder.targetVersion;
        }
    }

    /**
     * The target skill version to rollback to.
     * @return targetVersion
    **/
    @JsonProperty("targetVersion")
    public String getTargetVersion() {
        return targetVersion;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRollbackRequest v1SkillCreateRollbackRequest = (CreateRollbackRequest) o;
        return Objects.equals(this.targetVersion, v1SkillCreateRollbackRequest.targetVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRollbackRequest {\n");
        
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
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
        private String targetVersion;

        private Builder() {}

        @JsonProperty("targetVersion")

        public Builder withTargetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }


        public CreateRollbackRequest build() {
            return new CreateRollbackRequest(this);
        }
    }
}

