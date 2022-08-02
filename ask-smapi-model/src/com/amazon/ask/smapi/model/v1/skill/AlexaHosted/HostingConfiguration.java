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
 * Configurations for creating new hosted skill
 */

@JsonDeserialize(builder = HostingConfiguration.Builder.class)
public final class HostingConfiguration {

    @JsonProperty("alexaHosted")
    private com.amazon.ask.smapi.model.v1.skill.AlexaHosted.AlexaHostedConfig alexaHosted = null;

    private HostingConfiguration() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private HostingConfiguration(Builder builder) {
        if (builder.alexaHosted != null) {
            this.alexaHosted = builder.alexaHosted;
        }
    }

    /**
     * Get alexaHosted
     * @return alexaHosted
    **/
    @JsonProperty("alexaHosted")
    public com.amazon.ask.smapi.model.v1.skill.AlexaHosted.AlexaHostedConfig getAlexaHosted() {
        return alexaHosted;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostingConfiguration v1SkillAlexaHostedHostingConfiguration = (HostingConfiguration) o;
        return Objects.equals(this.alexaHosted, v1SkillAlexaHostedHostingConfiguration.alexaHosted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alexaHosted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostingConfiguration {\n");
        
        sb.append("    alexaHosted: ").append(toIndentedString(alexaHosted)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.AlexaHosted.AlexaHostedConfig alexaHosted;

        private Builder() {}

        @JsonProperty("alexaHosted")

        public Builder withAlexaHosted(com.amazon.ask.smapi.model.v1.skill.AlexaHosted.AlexaHostedConfig alexaHosted) {
            this.alexaHosted = alexaHosted;
            return this;
        }


        public HostingConfiguration build() {
            return new HostingConfiguration(this);
        }
    }
}

