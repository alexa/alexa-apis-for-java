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


package com.amazon.ask.smapi.model.v1.skill.Manifest.CustomDialogManagement;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the initial dialog manager to field requests when a new skill session starts. If absent, this is assumed to be the default \&quot;skill\&quot; target
 */

@JsonDeserialize(builder = SessionStartDelegationStrategy.Builder.class)
public final class SessionStartDelegationStrategy {

    @JsonProperty("target")
    private String target = null;

    private SessionStartDelegationStrategy() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SessionStartDelegationStrategy(Builder builder) {
        if (builder.target != null) {
            this.target = builder.target;
        }
    }

    /**
     * Get target
     * @return target
    **/
    @JsonProperty("target")
    public String getTarget() {
        return target;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SessionStartDelegationStrategy v1SkillManifestCustomDialogManagementSessionStartDelegationStrategy = (SessionStartDelegationStrategy) o;
        return Objects.equals(this.target, v1SkillManifestCustomDialogManagementSessionStartDelegationStrategy.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(target);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SessionStartDelegationStrategy {\n");
        
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
        private String target;

        private Builder() {}

        @JsonProperty("target")

        public Builder withTarget(String target) {
            this.target = target;
            return this;
        }


        public SessionStartDelegationStrategy build() {
            return new SessionStartDelegationStrategy(this);
        }
    }
}

