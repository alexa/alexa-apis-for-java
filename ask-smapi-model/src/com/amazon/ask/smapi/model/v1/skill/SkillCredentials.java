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
 * Structure for skill credentials response.
 */

@JsonDeserialize(builder = SkillCredentials.Builder.class)
public final class SkillCredentials {

    @JsonProperty("skillMessagingCredentials")
    private com.amazon.ask.smapi.model.v1.skill.SkillMessagingCredentials skillMessagingCredentials = null;

    private SkillCredentials() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SkillCredentials(Builder builder) {
        if (builder.skillMessagingCredentials != null) {
            this.skillMessagingCredentials = builder.skillMessagingCredentials;
        }
    }

    /**
     * Get skillMessagingCredentials
     * @return skillMessagingCredentials
    **/
    @JsonProperty("skillMessagingCredentials")
    public com.amazon.ask.smapi.model.v1.skill.SkillMessagingCredentials getSkillMessagingCredentials() {
        return skillMessagingCredentials;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillCredentials v1SkillSkillCredentials = (SkillCredentials) o;
        return Objects.equals(this.skillMessagingCredentials, v1SkillSkillCredentials.skillMessagingCredentials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillMessagingCredentials);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillCredentials {\n");
        
        sb.append("    skillMessagingCredentials: ").append(toIndentedString(skillMessagingCredentials)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.SkillMessagingCredentials skillMessagingCredentials;

        private Builder() {}

        @JsonProperty("skillMessagingCredentials")

        public Builder withSkillMessagingCredentials(com.amazon.ask.smapi.model.v1.skill.SkillMessagingCredentials skillMessagingCredentials) {
            this.skillMessagingCredentials = skillMessagingCredentials;
            return this;
        }


        public SkillCredentials build() {
            return new SkillCredentials(this);
        }
    }
}

