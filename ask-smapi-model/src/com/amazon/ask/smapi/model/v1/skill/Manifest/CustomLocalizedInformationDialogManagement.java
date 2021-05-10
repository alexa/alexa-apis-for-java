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
 * Defines locale-specific dialog-management configuration for a skill.
 */

@JsonDeserialize(builder = CustomLocalizedInformationDialogManagement.Builder.class)
public final class CustomLocalizedInformationDialogManagement {

    @JsonProperty("sessionStartDelegationStrategy")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.CustomDialogManagement.SessionStartDelegationStrategy sessionStartDelegationStrategy = null;

    public static Builder builder() {
        return new Builder();
    }

    private CustomLocalizedInformationDialogManagement(Builder builder) {
        if (builder.sessionStartDelegationStrategy != null) {
            this.sessionStartDelegationStrategy = builder.sessionStartDelegationStrategy;
        }
    }

    /**
     * Get sessionStartDelegationStrategy
     * @return sessionStartDelegationStrategy
    **/
    @JsonProperty("sessionStartDelegationStrategy")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.CustomDialogManagement.SessionStartDelegationStrategy getSessionStartDelegationStrategy() {
        return sessionStartDelegationStrategy;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomLocalizedInformationDialogManagement v1SkillManifestCustomLocalizedInformationDialogManagement = (CustomLocalizedInformationDialogManagement) o;
        return Objects.equals(this.sessionStartDelegationStrategy, v1SkillManifestCustomLocalizedInformationDialogManagement.sessionStartDelegationStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionStartDelegationStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomLocalizedInformationDialogManagement {\n");
        
        sb.append("    sessionStartDelegationStrategy: ").append(toIndentedString(sessionStartDelegationStrategy)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.Manifest.CustomDialogManagement.SessionStartDelegationStrategy sessionStartDelegationStrategy;

        private Builder() {}

        @JsonProperty("sessionStartDelegationStrategy")

        public Builder withSessionStartDelegationStrategy(com.amazon.ask.smapi.model.v1.skill.Manifest.CustomDialogManagement.SessionStartDelegationStrategy sessionStartDelegationStrategy) {
            this.sessionStartDelegationStrategy = sessionStartDelegationStrategy;
            return this;
        }


        public CustomLocalizedInformationDialogManagement build() {
            return new CustomLocalizedInformationDialogManagement(this);
        }
    }
}

