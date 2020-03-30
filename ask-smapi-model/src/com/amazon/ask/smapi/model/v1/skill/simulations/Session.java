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
    private String mode = null;

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
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getModeAsString().
     *
     * @return mode
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.simulations.SessionMode getMode() {
        return com.amazon.ask.smapi.model.v1.skill.simulations.SessionMode.fromValue(mode);
    }

    /**
     * Get the underlying String value for mode.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return mode as a String value
    **/
    @JsonProperty("mode")
    public String getModeAsString() {
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
        private String mode;

        private Builder() {}

        @JsonProperty("mode")
        public Builder withMode(String mode) {
          this.mode = mode;
          return this;
        }

        public Builder withMode(com.amazon.ask.smapi.model.v1.skill.simulations.SessionMode mode) {
            this.mode = mode != null ? mode.toString() : null;
            return this;
        }


        public Session build() {
            return new Session(this);
        }
    }
}

