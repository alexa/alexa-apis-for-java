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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * The set of intents your service can accept and process.
 */

@JsonDeserialize(builder = Intent.Builder.class)
public final class Intent {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("slots")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotDefinition> slots = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotDefinition>();

    @JsonProperty("samples")
    private List<String> samples = new ArrayList<String>();

    public static Builder builder() {
        return new Builder();
    }

    private Intent(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.slots != null) {
            this.slots = builder.slots;
        }
        if (builder.samples != null) {
            this.samples = builder.samples;
        }
    }

    /**
     * Name to identify the intent.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * List of slots within the intent.
     * @return slots
    **/
    @JsonProperty("slots")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotDefinition> getSlots() {
        return slots;
    }

    /**
     * Phrases the user can speak e.g. to trigger an intent or provide value for a slot elicitation.
     * @return samples
    **/
    @JsonProperty("samples")
    public List<String> getSamples() {
        return samples;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Intent v1SkillInteractionModelIntent = (Intent) o;
        return Objects.equals(this.name, v1SkillInteractionModelIntent.name) &&
            Objects.equals(this.slots, v1SkillInteractionModelIntent.slots) &&
            Objects.equals(this.samples, v1SkillInteractionModelIntent.samples);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, slots, samples);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Intent {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
        sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotDefinition> slots;
        private List<String> samples;

        private Builder() {}

        @JsonProperty("name")
        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("slots")
        public Builder withSlots(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotDefinition> slots) {
            this.slots = slots;
            return this;
        }

        public Builder addSlotsItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotDefinition slotsItem) {
            if (this.slots == null) {
                this.slots = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotDefinition>();
            }
            this.slots.add(slotsItem);
            return this;
        }

        @JsonProperty("samples")
        public Builder withSamples(List<String> samples) {
            this.samples = samples;
            return this;
        }

        public Builder addSamplesItem(String samplesItem) {
            if (this.samples == null) {
                this.samples = new ArrayList<String>();
            }
            this.samples.add(samplesItem);
            return this;
        }

        public Intent build() {
            return new Intent(this);
        }
    }
}

