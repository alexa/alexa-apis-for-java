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


package com.amazon.ask.smapi.model.v1.skill.history;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The hypothesized confidence for this interaction.
 */

@JsonDeserialize(builder = Confidence.Builder.class)
public final class Confidence {

    @JsonProperty("bin")
    private com.amazon.ask.smapi.model.v1.skill.history.ConfidenceBin bin = null;

    public static Builder builder() {
        return new Builder();
    }

    private Confidence(Builder builder) {
        if (builder.bin != null) {
            this.bin = builder.bin;
        }
    }

    /**
     * Get bin
     * @return bin
    **/
    @JsonProperty("bin")
    public com.amazon.ask.smapi.model.v1.skill.history.ConfidenceBin getBin() {
        return bin;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Confidence v1SkillHistoryConfidence = (Confidence) o;
        return Objects.equals(this.bin, v1SkillHistoryConfidence.bin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Confidence {\n");
        
        sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.history.ConfidenceBin bin;

        private Builder() {}

        @JsonProperty("bin")
        public Builder withBin(com.amazon.ask.smapi.model.v1.skill.history.ConfidenceBin bin) {
            this.bin = bin;
            return this;
        }


        public Confidence build() {
            return new Confidence(this);
        }
    }
}

