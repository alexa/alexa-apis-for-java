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
    private String alexaHosted = null;

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
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getAlexaHostedAsString().
     *
     * @return alexaHosted
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRuntime getAlexaHosted() {
        return com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRuntime.fromValue(alexaHosted);
    }

    /**
     * Get the underlying String value for alexaHosted.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return alexaHosted as a String value
    **/
    @JsonProperty("alexaHosted")
    public String getAlexaHostedAsString() {
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
        private String alexaHosted;

        private Builder() {}

        @JsonProperty("alexaHosted")
        public Builder withAlexaHosted(String alexaHosted) {
          this.alexaHosted = alexaHosted;
          return this;
        }

        public Builder withAlexaHosted(com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRuntime alexaHosted) {
            this.alexaHosted = alexaHosted != null ? alexaHosted.toString() : null;
            return this;
        }


        public HostingConfiguration build() {
            return new HostingConfiguration(this);
        }
    }
}

