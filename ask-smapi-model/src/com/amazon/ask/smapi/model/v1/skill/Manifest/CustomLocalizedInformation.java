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
 * Defines the localized custom api information.
 */

@JsonDeserialize(builder = CustomLocalizedInformation.Builder.class)
public final class CustomLocalizedInformation {

    @JsonProperty("dialogManagement")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.CustomLocalizedInformationDialogManagement dialogManagement = null;

    private CustomLocalizedInformation() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private CustomLocalizedInformation(Builder builder) {
        if (builder.dialogManagement != null) {
            this.dialogManagement = builder.dialogManagement;
        }
    }

    /**
     * Get dialogManagement
     * @return dialogManagement
    **/
    @JsonProperty("dialogManagement")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.CustomLocalizedInformationDialogManagement getDialogManagement() {
        return dialogManagement;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomLocalizedInformation v1SkillManifestCustomLocalizedInformation = (CustomLocalizedInformation) o;
        return Objects.equals(this.dialogManagement, v1SkillManifestCustomLocalizedInformation.dialogManagement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dialogManagement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomLocalizedInformation {\n");
        
        sb.append("    dialogManagement: ").append(toIndentedString(dialogManagement)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.Manifest.CustomLocalizedInformationDialogManagement dialogManagement;

        private Builder() {}

        @JsonProperty("dialogManagement")

        public Builder withDialogManagement(com.amazon.ask.smapi.model.v1.skill.Manifest.CustomLocalizedInformationDialogManagement dialogManagement) {
            this.dialogManagement = dialogManagement;
            return this;
        }


        public CustomLocalizedInformation build() {
            return new CustomLocalizedInformation(this);
        }
    }
}

