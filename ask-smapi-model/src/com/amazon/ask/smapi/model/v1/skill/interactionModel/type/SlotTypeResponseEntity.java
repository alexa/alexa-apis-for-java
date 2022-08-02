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
 * SlotTypeId information.
 */

@JsonDeserialize(builder = SlotTypeResponseEntity.Builder.class)
public final class SlotTypeResponseEntity {

    @JsonProperty("id")
    private String id = null;

    private SlotTypeResponseEntity() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SlotTypeResponseEntity(Builder builder) {
        if (builder.id != null) {
            this.id = builder.id;
        }
    }

    /**
     * ID of the slot type created.
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlotTypeResponseEntity v1SkillInteractionModelTypeSlotTypeResponseEntity = (SlotTypeResponseEntity) o;
        return Objects.equals(this.id, v1SkillInteractionModelTypeSlotTypeResponseEntity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlotTypeResponseEntity {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

        private Builder() {}

        @JsonProperty("id")

        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        public SlotTypeResponseEntity build() {
            return new SlotTypeResponseEntity(this);
        }
    }
}

