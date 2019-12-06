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
 * Slot definition.
 */

@JsonDeserialize(builder = SlotDefinition.Builder.class)
public final class SlotDefinition {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("samples")
    private List<String> samples = new ArrayList<String>();

    public static Builder builder() {
        return new Builder();
    }

    private SlotDefinition(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.samples != null) {
            this.samples = builder.samples;
        }
    }

    /**
     * The name of the slot.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The type of the slot. It can be a built-in or custom type.
     * @return type
    **/
    @JsonProperty("type")
    public String getType() {
        return type;
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
        SlotDefinition v1SkillInteractionModelSlotDefinition = (SlotDefinition) o;
        return Objects.equals(this.name, v1SkillInteractionModelSlotDefinition.name) &&
            Objects.equals(this.type, v1SkillInteractionModelSlotDefinition.type) &&
            Objects.equals(this.samples, v1SkillInteractionModelSlotDefinition.samples);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, samples);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlotDefinition {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
        private String type;
        private List<String> samples;

        private Builder() {}

        @JsonProperty("name")
        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("type")
        public Builder withType(String type) {
            this.type = type;
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

        public SlotDefinition build() {
            return new SlotDefinition(this);
        }
    }
}

