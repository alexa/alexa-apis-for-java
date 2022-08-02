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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Slot Type version data with metadata.
 */

@JsonDeserialize(builder = SlotTypeVersionData.Builder.class)
public final class SlotTypeVersionData {

    @JsonProperty("slotType")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.SlotTypeVersionDataObject slotType = null;

    private SlotTypeVersionData() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SlotTypeVersionData(Builder builder) {
        if (builder.slotType != null) {
            this.slotType = builder.slotType;
        }
    }

    /**
     * Get slotType
     * @return slotType
    **/
    @JsonProperty("slotType")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.SlotTypeVersionDataObject getSlotType() {
        return slotType;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlotTypeVersionData v1SkillInteractionModelTypeVersionSlotTypeVersionData = (SlotTypeVersionData) o;
        return Objects.equals(this.slotType, v1SkillInteractionModelTypeVersionSlotTypeVersionData.slotType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slotType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlotTypeVersionData {\n");
        
        sb.append("    slotType: ").append(toIndentedString(slotType)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.SlotTypeVersionDataObject slotType;

        private Builder() {}

        @JsonProperty("slotType")

        public Builder withSlotType(com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.SlotTypeVersionDataObject slotType) {
            this.slotType = slotType;
            return this;
        }


        public SlotTypeVersionData build() {
            return new SlotTypeVersionData(this);
        }
    }
}

