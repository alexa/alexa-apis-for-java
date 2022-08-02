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
 * Slot Type version fields with metadata.
 */

@JsonDeserialize(builder = SlotTypeVersionDataObject.Builder.class)
public final class SlotTypeVersionDataObject {

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("definition")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.ValueSupplierObject definition = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("version")
    private String version = null;

    private SlotTypeVersionDataObject() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SlotTypeVersionDataObject(Builder builder) {
        if (builder.id != null) {
            this.id = builder.id;
        }
        if (builder.definition != null) {
            this.definition = builder.definition;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
        if (builder.version != null) {
            this.version = builder.version;
        }
    }

    /**
     * Slot type id associated with the slot type version.
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }


    /**
     * Get definition
     * @return definition
    **/
    @JsonProperty("definition")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.ValueSupplierObject getDefinition() {
        return definition;
    }


    /**
     * Description string for specific slot type version.
     * @return description
    **/
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }


    /**
     * Specific slot type version.
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlotTypeVersionDataObject v1SkillInteractionModelTypeVersionSlotTypeVersionDataObject = (SlotTypeVersionDataObject) o;
        return Objects.equals(this.id, v1SkillInteractionModelTypeVersionSlotTypeVersionDataObject.id) &&
            Objects.equals(this.definition, v1SkillInteractionModelTypeVersionSlotTypeVersionDataObject.definition) &&
            Objects.equals(this.description, v1SkillInteractionModelTypeVersionSlotTypeVersionDataObject.description) &&
            Objects.equals(this.version, v1SkillInteractionModelTypeVersionSlotTypeVersionDataObject.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, definition, description, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlotTypeVersionDataObject {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
        private String id;
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.ValueSupplierObject definition;
        private String description;
        private String version;

        private Builder() {}

        @JsonProperty("id")

        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        @JsonProperty("definition")

        public Builder withDefinition(com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.ValueSupplierObject definition) {
            this.definition = definition;
            return this;
        }


        @JsonProperty("description")

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        @JsonProperty("version")

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        public SlotTypeVersionDataObject build() {
            return new SlotTypeVersionDataObject(this);
        }
    }
}

