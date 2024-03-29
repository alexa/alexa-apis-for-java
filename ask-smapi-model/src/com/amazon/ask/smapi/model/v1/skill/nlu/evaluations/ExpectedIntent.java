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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExpectedIntent
 */

@JsonDeserialize(builder = ExpectedIntent.Builder.class)
public final class ExpectedIntent {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("slots")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ExpectedIntentSlotsProps> slots = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ExpectedIntentSlotsProps>();

    private ExpectedIntent() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ExpectedIntent(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.slots != null) {
            this.slots = builder.slots;
        }
    }

    /**
     * Get name
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Get slots
     * @return slots
    **/
    @JsonProperty("slots")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ExpectedIntentSlotsProps> getSlots() {
        return slots;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExpectedIntent v1SkillNluEvaluationsExpectedIntent = (ExpectedIntent) o;
        return Objects.equals(this.name, v1SkillNluEvaluationsExpectedIntent.name) &&
            Objects.equals(this.slots, v1SkillNluEvaluationsExpectedIntent.slots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, slots);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpectedIntent {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
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
        private String name;
        private Map<String, com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ExpectedIntentSlotsProps> slots;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("slots")

        public Builder withSlots(Map<String, com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ExpectedIntentSlotsProps> slots) {
            this.slots = slots;
            return this;
        }

        public Builder putSlotsItem(String key, com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ExpectedIntentSlotsProps slotsItem) {
            if (this.slots == null) {
                this.slots = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ExpectedIntentSlotsProps>();
            }
            this.slots.put(key, slotsItem);
            return this;
        }

        public ExpectedIntent build() {
            return new ExpectedIntent(this);
        }
    }
}

