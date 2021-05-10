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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Defines the dialog management configuration for the skill.
 */

@JsonDeserialize(builder = DialogManagement.Builder.class)
public final class DialogManagement {

    @JsonProperty("dialogManagers")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.DialogManager> dialogManagers = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.DialogManager>();

    @JsonProperty("sessionStartDelegationStrategy")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.DialogDelegationStrategy sessionStartDelegationStrategy = null;

    public static Builder builder() {
        return new Builder();
    }

    private DialogManagement(Builder builder) {
        if (builder.dialogManagers != null) {
            this.dialogManagers = builder.dialogManagers;
        }
        if (builder.sessionStartDelegationStrategy != null) {
            this.sessionStartDelegationStrategy = builder.sessionStartDelegationStrategy;
        }
    }

    /**
     * List of dialog managers configured by the skill
     * @return dialogManagers
    **/
    @JsonProperty("dialogManagers")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.DialogManager> getDialogManagers() {
        return dialogManagers;
    }


    /**
     * Get sessionStartDelegationStrategy
     * @return sessionStartDelegationStrategy
    **/
    @JsonProperty("sessionStartDelegationStrategy")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.DialogDelegationStrategy getSessionStartDelegationStrategy() {
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
        DialogManagement v1SkillManifestDialogManagement = (DialogManagement) o;
        return Objects.equals(this.dialogManagers, v1SkillManifestDialogManagement.dialogManagers) &&
            Objects.equals(this.sessionStartDelegationStrategy, v1SkillManifestDialogManagement.sessionStartDelegationStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dialogManagers, sessionStartDelegationStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DialogManagement {\n");
        
        sb.append("    dialogManagers: ").append(toIndentedString(dialogManagers)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.DialogManager> dialogManagers;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.DialogDelegationStrategy sessionStartDelegationStrategy;

        private Builder() {}

        @JsonProperty("dialogManagers")

        public Builder withDialogManagers(List<com.amazon.ask.smapi.model.v1.skill.Manifest.DialogManager> dialogManagers) {
            this.dialogManagers = dialogManagers;
            return this;
        }

        public Builder addDialogManagersItem(com.amazon.ask.smapi.model.v1.skill.Manifest.DialogManager dialogManagersItem) {
            if (this.dialogManagers == null) {
                this.dialogManagers = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.DialogManager>();
            }
            this.dialogManagers.add(dialogManagersItem);
            return this;
        }

        @JsonProperty("sessionStartDelegationStrategy")

        public Builder withSessionStartDelegationStrategy(com.amazon.ask.smapi.model.v1.skill.Manifest.DialogDelegationStrategy sessionStartDelegationStrategy) {
            this.sessionStartDelegationStrategy = sessionStartDelegationStrategy;
            return this;
        }


        public DialogManagement build() {
            return new DialogManagement(this);
        }
    }
}

