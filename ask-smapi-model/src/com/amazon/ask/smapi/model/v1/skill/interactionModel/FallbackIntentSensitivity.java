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
 * Denotes skill&#39;s sensitivity for out-of-domain utterances.
 */

@JsonDeserialize(builder = FallbackIntentSensitivity.Builder.class)
public final class FallbackIntentSensitivity {

    @JsonProperty("level")
    private String level = null;

    public static Builder builder() {
        return new Builder();
    }

    private FallbackIntentSensitivity(Builder builder) {
        if (builder.level != null) {
            this.level = builder.level;
        }
    }

    /**
     * Get level
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getLevelAsString().
     *
     * @return level
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.FallbackIntentSensitivityLevel getLevel() {
        return com.amazon.ask.smapi.model.v1.skill.interactionModel.FallbackIntentSensitivityLevel.fromValue(level);
    }

    /**
     * Get the underlying String value for level.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return level as a String value
    **/
    @JsonProperty("level")
    public String getLevelAsString() {
      return level;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FallbackIntentSensitivity v1SkillInteractionModelFallbackIntentSensitivity = (FallbackIntentSensitivity) o;
        return Objects.equals(this.level, v1SkillInteractionModelFallbackIntentSensitivity.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FallbackIntentSensitivity {\n");
        
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
        private String level;

        private Builder() {}

        @JsonProperty("level")

        public Builder withLevel(String level) {
          this.level = level;
          return this;
        }

        public Builder withLevel(com.amazon.ask.smapi.model.v1.skill.interactionModel.FallbackIntentSensitivityLevel level) {
            this.level = level != null ? level.toString() : null;
            return this;
        }


        public FallbackIntentSensitivity build() {
            return new FallbackIntentSensitivity(this);
        }
    }
}

