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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.type;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Slot Type request definitions.
 */

@JsonDeserialize(builder = SlotTypeDefinitionOutput.Builder.class)
public final class SlotTypeDefinitionOutput {

    @JsonProperty("slotType")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeInput slotType = null;

    @JsonProperty("totalVersions")
    private String totalVersions = null;

    public static Builder builder() {
        return new Builder();
    }

    private SlotTypeDefinitionOutput(Builder builder) {
        if (builder.slotType != null) {
            this.slotType = builder.slotType;
        }
        if (builder.totalVersions != null) {
            this.totalVersions = builder.totalVersions;
        }
    }

    /**
     * Get slotType
     * @return slotType
    **/
    @JsonProperty("slotType")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeInput getSlotType() {
        return slotType;
    }


    /**
     * Total number of versions.
     * @return totalVersions
    **/
    @JsonProperty("totalVersions")
    public String getTotalVersions() {
        return totalVersions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlotTypeDefinitionOutput v1SkillInteractionModelTypeSlotTypeDefinitionOutput = (SlotTypeDefinitionOutput) o;
        return Objects.equals(this.slotType, v1SkillInteractionModelTypeSlotTypeDefinitionOutput.slotType) &&
            Objects.equals(this.totalVersions, v1SkillInteractionModelTypeSlotTypeDefinitionOutput.totalVersions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slotType, totalVersions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlotTypeDefinitionOutput {\n");
        
        sb.append("    slotType: ").append(toIndentedString(slotType)).append("\n");
        sb.append("    totalVersions: ").append(toIndentedString(totalVersions)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeInput slotType;
        private String totalVersions;

        private Builder() {}

        @JsonProperty("slotType")

        public Builder withSlotType(com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeInput slotType) {
            this.slotType = slotType;
            return this;
        }


        @JsonProperty("totalVersions")

        public Builder withTotalVersions(String totalVersions) {
            this.totalVersions = totalVersions;
            return this;
        }


        public SlotTypeDefinitionOutput build() {
            return new SlotTypeDefinitionOutput(this);
        }
    }
}

