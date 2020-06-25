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


package com.amazon.ask.smapi.model.v1.skill.asr.evaluations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Skill
 */

@JsonDeserialize(builder = Skill.Builder.class)
public final class Skill {

    @JsonProperty("stage")
    private String stage = null;

    @JsonProperty("locale")
    private String locale = null;

    public static Builder builder() {
        return new Builder();
    }

    private Skill(Builder builder) {
        if (builder.stage != null) {
            this.stage = builder.stage;
        }
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
    }

    /**
     * Get stage
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStageAsString().
     *
     * @return stage
    **/
    
    public com.amazon.ask.smapi.model.v1.StageType getStage() {
        return com.amazon.ask.smapi.model.v1.StageType.fromValue(stage);
    }

    /**
     * Get the underlying String value for stage.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return stage as a String value
    **/
    @JsonProperty("stage")
    public String getStageAsString() {
      return stage;
    }

    /**
     * skill locale in bcp 47 format
     * @return locale
    **/
    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Skill v1SkillAsrEvaluationsSkill = (Skill) o;
        return Objects.equals(this.stage, v1SkillAsrEvaluationsSkill.stage) &&
            Objects.equals(this.locale, v1SkillAsrEvaluationsSkill.locale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stage, locale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Skill {\n");
        
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
        private String stage;
        private String locale;

        private Builder() {}

        @JsonProperty("stage")
        public Builder withStage(String stage) {
          this.stage = stage;
          return this;
        }

        public Builder withStage(com.amazon.ask.smapi.model.v1.StageType stage) {
            this.stage = stage != null ? stage.toString() : null;
            return this;
        }


        @JsonProperty("locale")

        public Builder withLocale(String locale) {
            this.locale = locale;
            return this;
        }


        public Skill build() {
            return new Skill(this);
        }
    }
}

