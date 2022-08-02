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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * GetConflictsResponseResult
 */

@JsonDeserialize(builder = GetConflictsResponseResult.Builder.class)
public final class GetConflictsResponseResult {

    @JsonProperty("conflictingUtterance")
    private String conflictingUtterance = null;

    @JsonProperty("conflicts")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.ConflictResult> conflicts = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.ConflictResult>();

    private GetConflictsResponseResult() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private GetConflictsResponseResult(Builder builder) {
        if (builder.conflictingUtterance != null) {
            this.conflictingUtterance = builder.conflictingUtterance;
        }
        if (builder.conflicts != null) {
            this.conflicts = builder.conflicts;
        }
    }

    /**
     * Utterance resolved from sample utterance that causes conflicts among different intents.
     * @return conflictingUtterance
    **/
    @JsonProperty("conflictingUtterance")
    public String getConflictingUtterance() {
        return conflictingUtterance;
    }


    /**
     * Get conflicts
     * @return conflicts
    **/
    @JsonProperty("conflicts")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.ConflictResult> getConflicts() {
        return conflicts;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetConflictsResponseResult v1SkillInteractionModelConflictDetectionGetConflictsResponseResult = (GetConflictsResponseResult) o;
        return Objects.equals(this.conflictingUtterance, v1SkillInteractionModelConflictDetectionGetConflictsResponseResult.conflictingUtterance) &&
            Objects.equals(this.conflicts, v1SkillInteractionModelConflictDetectionGetConflictsResponseResult.conflicts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conflictingUtterance, conflicts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetConflictsResponseResult {\n");
        
        sb.append("    conflictingUtterance: ").append(toIndentedString(conflictingUtterance)).append("\n");
        sb.append("    conflicts: ").append(toIndentedString(conflicts)).append("\n");
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
        private String conflictingUtterance;
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.ConflictResult> conflicts;

        private Builder() {}

        @JsonProperty("conflictingUtterance")

        public Builder withConflictingUtterance(String conflictingUtterance) {
            this.conflictingUtterance = conflictingUtterance;
            return this;
        }


        @JsonProperty("conflicts")

        public Builder withConflicts(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.ConflictResult> conflicts) {
            this.conflicts = conflicts;
            return this;
        }

        public Builder addConflictsItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.ConflictResult conflictsItem) {
            if (this.conflicts == null) {
                this.conflicts = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.ConflictResult>();
            }
            this.conflicts.add(conflictsItem);
            return this;
        }

        public GetConflictsResponseResult build() {
            return new GetConflictsResponseResult(this);
        }
    }
}

