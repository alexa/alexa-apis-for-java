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


package com.amazon.ask.smapi.model.v1.skill.simulations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Session settings for running current simulation. 
 */

@JsonDeserialize(builder = Session.Builder.class)
public final class Session {

    @JsonProperty("mode")
    private com.amazon.ask.smapi.model.v1.skill.simulations.SessionMode mode = null;

    public static Builder builder() {
        return new Builder();
    }

    private Session(Builder builder) {
        if (builder.mode != null) {
            this.mode = builder.mode;
        }
    }

    /**
     * Get mode
     * @return mode
    **/
    @JsonProperty("mode")
    public com.amazon.ask.smapi.model.v1.skill.simulations.SessionMode getMode() {
        return mode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Session v1SkillSimulationsSession = (Session) o;
        return Objects.equals(this.mode, v1SkillSimulationsSession.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Session {\n");
        
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.simulations.SessionMode mode;

        private Builder() {}

        @JsonProperty("mode")
        public Builder withMode(com.amazon.ask.smapi.model.v1.skill.simulations.SessionMode mode) {
            this.mode = mode;
            return this;
        }


        public Session build() {
            return new Session(this);
        }
    }
}

