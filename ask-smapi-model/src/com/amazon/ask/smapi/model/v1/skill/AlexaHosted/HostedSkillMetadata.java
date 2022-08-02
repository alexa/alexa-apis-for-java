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
 * Alexa Hosted skill&#39;s metadata
 */

@JsonDeserialize(builder = HostedSkillMetadata.Builder.class)
public final class HostedSkillMetadata {

    @JsonProperty("alexaHosted")
    private com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillInfo alexaHosted = null;

    private HostedSkillMetadata() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private HostedSkillMetadata(Builder builder) {
        if (builder.alexaHosted != null) {
            this.alexaHosted = builder.alexaHosted;
        }
    }

    /**
     * Get alexaHosted
     * @return alexaHosted
    **/
    @JsonProperty("alexaHosted")
    public com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillInfo getAlexaHosted() {
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
        HostedSkillMetadata v1SkillAlexaHostedHostedSkillMetadata = (HostedSkillMetadata) o;
        return Objects.equals(this.alexaHosted, v1SkillAlexaHostedHostedSkillMetadata.alexaHosted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alexaHosted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostedSkillMetadata {\n");
        
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
        private com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillInfo alexaHosted;

        private Builder() {}

        @JsonProperty("alexaHosted")

        public Builder withAlexaHosted(com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillInfo alexaHosted) {
            this.alexaHosted = alexaHosted;
            return this;
        }


        public HostedSkillMetadata build() {
            return new HostedSkillMetadata(this);
        }
    }
}

