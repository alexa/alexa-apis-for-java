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
 * Used to declare that the skill uses the Display interface. When a skill declares that it uses the Display interface the Display interface will be passed in the supportedInterfaces section of devices which meet any of the required minimum version attributes specified in the manifest. If the device does not meet any of the minimum versions specified in the manifest the Display interface will not be present in the supportedInterfaces section. If neither the minimumTemplateVersion nor the minimumApmlVersion attributes are specified in the manifes then the minimumTemplateVersion is defaulted to 1.0 and apmlVersion is omitted.
 */

@JsonDeserialize(builder = DisplayInterface.Builder.class)
public final class DisplayInterface extends com.amazon.ask.smapi.model.v1.skill.Manifest.ModelInterface  {

    @JsonProperty("minimumTemplateVersion")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.DisplayInterfaceTemplateVersion minimumTemplateVersion = null;

    @JsonProperty("minimumApmlVersion")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.DisplayInterfaceApmlVersion minimumApmlVersion = null;

    public static Builder builder() {
        return new Builder();
    }

    private DisplayInterface(Builder builder) {
        String discriminatorValue = "RENDER_TEMPLATE";

        this.type = discriminatorValue;
        if (builder.minimumTemplateVersion != null) {
            this.minimumTemplateVersion = builder.minimumTemplateVersion;
        }
        if (builder.minimumApmlVersion != null) {
            this.minimumApmlVersion = builder.minimumApmlVersion;
        }
    }

    /**
     * Get minimumTemplateVersion
     * @return minimumTemplateVersion
    **/
    @JsonProperty("minimumTemplateVersion")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.DisplayInterfaceTemplateVersion getMinimumTemplateVersion() {
        return minimumTemplateVersion;
    }


    /**
     * Get minimumApmlVersion
     * @return minimumApmlVersion
    **/
    @JsonProperty("minimumApmlVersion")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.DisplayInterfaceApmlVersion getMinimumApmlVersion() {
        return minimumApmlVersion;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisplayInterface v1SkillManifestDisplayInterface = (DisplayInterface) o;
        return Objects.equals(this.minimumTemplateVersion, v1SkillManifestDisplayInterface.minimumTemplateVersion) &&
            Objects.equals(this.minimumApmlVersion, v1SkillManifestDisplayInterface.minimumApmlVersion) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minimumTemplateVersion, minimumApmlVersion, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisplayInterface {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    minimumTemplateVersion: ").append(toIndentedString(minimumTemplateVersion)).append("\n");
        sb.append("    minimumApmlVersion: ").append(toIndentedString(minimumApmlVersion)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.Manifest.DisplayInterfaceTemplateVersion minimumTemplateVersion;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.DisplayInterfaceApmlVersion minimumApmlVersion;

        private Builder() {}

        @JsonProperty("minimumTemplateVersion")

        public Builder withMinimumTemplateVersion(com.amazon.ask.smapi.model.v1.skill.Manifest.DisplayInterfaceTemplateVersion minimumTemplateVersion) {
            this.minimumTemplateVersion = minimumTemplateVersion;
            return this;
        }


        @JsonProperty("minimumApmlVersion")

        public Builder withMinimumApmlVersion(com.amazon.ask.smapi.model.v1.skill.Manifest.DisplayInterfaceApmlVersion minimumApmlVersion) {
            this.minimumApmlVersion = minimumApmlVersion;
            return this;
        }


        public DisplayInterface build() {
            return new DisplayInterface(this);
        }
    }
}

