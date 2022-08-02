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
 * ConflictIntentSlot
 */

@JsonDeserialize(builder = ConflictIntentSlot.Builder.class)
public final class ConflictIntentSlot {

    @JsonProperty("value")
    private String value = null;

    @JsonProperty("type")
    private String type = null;

    private ConflictIntentSlot() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ConflictIntentSlot(Builder builder) {
        if (builder.value != null) {
            this.value = builder.value;
        }
        if (builder.type != null) {
            this.type = builder.type;
        }
    }

    /**
     * Get value
     * @return value
    **/
    @JsonProperty("value")
    public String getValue() {
        return value;
    }


    /**
     * Get type
     * @return type
    **/
    @JsonProperty("type")
    public String getType() {
        return type;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConflictIntentSlot v1SkillInteractionModelConflictDetectionConflictIntentSlot = (ConflictIntentSlot) o;
        return Objects.equals(this.value, v1SkillInteractionModelConflictDetectionConflictIntentSlot.value) &&
            Objects.equals(this.type, v1SkillInteractionModelConflictDetectionConflictIntentSlot.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConflictIntentSlot {\n");
        
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
        private String value;
        private String type;

        private Builder() {}

        @JsonProperty("value")

        public Builder withValue(String value) {
            this.value = value;
            return this;
        }


        @JsonProperty("type")

        public Builder withType(String type) {
            this.type = type;
            return this;
        }


        public ConflictIntentSlot build() {
            return new ConflictIntentSlot(this);
        }
    }
}

