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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConflictResult
 */

@JsonDeserialize(builder = ConflictResult.Builder.class)
public final class ConflictResult {

    @JsonProperty("sampleUtterance")
    private String sampleUtterance = null;

    @JsonProperty("intent")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.ConflictIntent intent = null;

    public static Builder builder() {
        return new Builder();
    }

    private ConflictResult(Builder builder) {
        if (builder.sampleUtterance != null) {
            this.sampleUtterance = builder.sampleUtterance;
        }
        if (builder.intent != null) {
            this.intent = builder.intent;
        }
    }

    /**
     * Sample utterance provided by 3P developers for intents.
     * @return sampleUtterance
    **/
    @JsonProperty("sampleUtterance")
    public String getSampleUtterance() {
        return sampleUtterance;
    }


    /**
     * Get intent
     * @return intent
    **/
    @JsonProperty("intent")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.ConflictIntent getIntent() {
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
        ConflictResult v1SkillInteractionModelConflictDetectionConflictResult = (ConflictResult) o;
        return Objects.equals(this.sampleUtterance, v1SkillInteractionModelConflictDetectionConflictResult.sampleUtterance) &&
            Objects.equals(this.intent, v1SkillInteractionModelConflictDetectionConflictResult.intent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sampleUtterance, intent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConflictResult {\n");
        
        sb.append("    sampleUtterance: ").append(toIndentedString(sampleUtterance)).append("\n");
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
        private String sampleUtterance;
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.ConflictIntent intent;

        private Builder() {}

        @JsonProperty("sampleUtterance")

        public Builder withSampleUtterance(String sampleUtterance) {
            this.sampleUtterance = sampleUtterance;
            return this;
        }


        @JsonProperty("intent")

        public Builder withIntent(com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.ConflictIntent intent) {
            this.intent = intent;
            return this;
        }


        public ConflictResult build() {
            return new ConflictResult(this);
        }
    }
}

