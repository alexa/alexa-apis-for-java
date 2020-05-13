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
 * Actual
 */

@JsonDeserialize(builder = Actual.Builder.class)
public final class Actual {

    @JsonProperty("domain")
    private String domain = null;

    @JsonProperty("intent")
    private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Intent intent = null;

    public static Builder builder() {
        return new Builder();
    }

    private Actual(Builder builder) {
        if (builder.domain != null) {
            this.domain = builder.domain;
        }
        if (builder.intent != null) {
            this.intent = builder.intent;
        }
    }

    /**
     * Get domain
     * @return domain
    **/
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }


    /**
     * Get intent
     * @return intent
    **/
    @JsonProperty("intent")
    public com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Intent getIntent() {
        return intent;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Actual v1SkillNluEvaluationsActual = (Actual) o;
        return Objects.equals(this.domain, v1SkillNluEvaluationsActual.domain) &&
            Objects.equals(this.intent, v1SkillNluEvaluationsActual.intent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, intent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Actual {\n");
        
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
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
        private String domain;
        private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Intent intent;

        private Builder() {}

        @JsonProperty("domain")

        public Builder withDomain(String domain) {
            this.domain = domain;
            return this;
        }


        @JsonProperty("intent")

        public Builder withIntent(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Intent intent) {
            this.intent = intent;
            return this;
        }


        public Actual build() {
            return new Actual(this);
        }
    }
}

