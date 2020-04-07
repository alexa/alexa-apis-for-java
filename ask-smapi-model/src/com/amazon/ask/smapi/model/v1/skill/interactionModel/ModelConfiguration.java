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


package com.amazon.ask.smapi.model.v1.skill.interactionModel;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Global configurations applicable to a skill&#39;s model.
 */

@JsonDeserialize(builder = ModelConfiguration.Builder.class)
public final class ModelConfiguration {

    @JsonProperty("fallbackIntentSensitivity")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.FallbackIntentSensitivity fallbackIntentSensitivity = null;

    public static Builder builder() {
        return new Builder();
    }

    private ModelConfiguration(Builder builder) {
        if (builder.fallbackIntentSensitivity != null) {
            this.fallbackIntentSensitivity = builder.fallbackIntentSensitivity;
        }
    }

    /**
     * Get fallbackIntentSensitivity
     * @return fallbackIntentSensitivity
    **/
    @JsonProperty("fallbackIntentSensitivity")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.FallbackIntentSensitivity getFallbackIntentSensitivity() {
        return fallbackIntentSensitivity;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelConfiguration v1SkillInteractionModelModelConfiguration = (ModelConfiguration) o;
        return Objects.equals(this.fallbackIntentSensitivity, v1SkillInteractionModelModelConfiguration.fallbackIntentSensitivity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fallbackIntentSensitivity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelConfiguration {\n");
        
        sb.append("    fallbackIntentSensitivity: ").append(toIndentedString(fallbackIntentSensitivity)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.FallbackIntentSensitivity fallbackIntentSensitivity;

        private Builder() {}

        @JsonProperty("fallbackIntentSensitivity")

        public Builder withFallbackIntentSensitivity(com.amazon.ask.smapi.model.v1.skill.interactionModel.FallbackIntentSensitivity fallbackIntentSensitivity) {
            this.fallbackIntentSensitivity = fallbackIntentSensitivity;
            return this;
        }


        public ModelConfiguration build() {
            return new ModelConfiguration(this);
        }
    }
}

