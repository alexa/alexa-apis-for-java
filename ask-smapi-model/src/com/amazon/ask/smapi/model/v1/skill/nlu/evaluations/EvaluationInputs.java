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


package com.amazon.ask.smapi.model.v1.skill.nlu.evaluations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EvaluationInputs
 */

@JsonDeserialize(builder = EvaluationInputs.Builder.class)
public final class EvaluationInputs {

    @JsonProperty("locale")
    private String locale = null;

    @JsonProperty("stage")
    private Object stage = null;

    @JsonProperty("source")
    private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Source source = null;

    public static Builder builder() {
        return new Builder();
    }

    private EvaluationInputs(Builder builder) {
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
        if (builder.stage != null) {
            this.stage = builder.stage;
        }
        if (builder.source != null) {
            this.source = builder.source;
        }
    }

    /**
     * Get locale
     * @return locale
    **/
    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }


    /**
     * Get stage
     * @return stage
    **/
    @JsonProperty("stage")
    public Object getStage() {
        return stage;
    }


    /**
     * Get source
     * @return source
    **/
    @JsonProperty("source")
    public com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Source getSource() {
        return source;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EvaluationInputs v1SkillNluEvaluationsEvaluationInputs = (EvaluationInputs) o;
        return Objects.equals(this.locale, v1SkillNluEvaluationsEvaluationInputs.locale) &&
            Objects.equals(this.stage, v1SkillNluEvaluationsEvaluationInputs.stage) &&
            Objects.equals(this.source, v1SkillNluEvaluationsEvaluationInputs.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locale, stage, source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationInputs {\n");
        
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
        private String locale;
        private Object stage;
        private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Source source;

        private Builder() {}

        @JsonProperty("locale")

        public Builder withLocale(String locale) {
            this.locale = locale;
            return this;
        }


        @JsonProperty("stage")

        public Builder withStage(Object stage) {
            this.stage = stage;
            return this;
        }


        @JsonProperty("source")

        public Builder withSource(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Source source) {
            this.source = source;
            return this;
        }


        public EvaluationInputs build() {
            return new EvaluationInputs(this);
        }
    }
}

