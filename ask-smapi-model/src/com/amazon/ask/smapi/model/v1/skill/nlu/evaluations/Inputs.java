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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Inputs
 */

@JsonDeserialize(builder = Inputs.Builder.class)
public final class Inputs {

    @JsonProperty("utterance")
    private String utterance = null;

    @JsonProperty("referenceTimestamp")
    private OffsetDateTime referenceTimestamp = null;

    private Inputs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Inputs(Builder builder) {
        if (builder.utterance != null) {
            this.utterance = builder.utterance;
        }
        if (builder.referenceTimestamp != null) {
            this.referenceTimestamp = builder.referenceTimestamp;
        }
    }

    /**
     * Get utterance
     * @return utterance
    **/
    @JsonProperty("utterance")
    public String getUtterance() {
        return utterance;
    }


    /**
     * Datetime to use to base date operations on.
     * @return referenceTimestamp
    **/
    @JsonProperty("referenceTimestamp")
    public OffsetDateTime getReferenceTimestamp() {
        return referenceTimestamp;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Inputs v1SkillNluEvaluationsInputs = (Inputs) o;
        return Objects.equals(this.utterance, v1SkillNluEvaluationsInputs.utterance) &&
            Objects.equals(this.referenceTimestamp, v1SkillNluEvaluationsInputs.referenceTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(utterance, referenceTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Inputs {\n");
        
        sb.append("    utterance: ").append(toIndentedString(utterance)).append("\n");
        sb.append("    referenceTimestamp: ").append(toIndentedString(referenceTimestamp)).append("\n");
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
        private String utterance;
        private OffsetDateTime referenceTimestamp;

        private Builder() {}

        @JsonProperty("utterance")

        public Builder withUtterance(String utterance) {
            this.utterance = utterance;
            return this;
        }


        @JsonProperty("referenceTimestamp")

        public Builder withReferenceTimestamp(OffsetDateTime referenceTimestamp) {
            this.referenceTimestamp = referenceTimestamp;
            return this;
        }


        public Inputs build() {
            return new Inputs(this);
        }
    }
}

