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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PromptItems
 */

@JsonDeserialize(builder = PromptItems.Builder.class)
public final class PromptItems {

    @JsonProperty("type")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.PromptItemsType type = null;

    @JsonProperty("value")
    private String value = null;

    public static Builder builder() {
        return new Builder();
    }

    private PromptItems(Builder builder) {
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.value != null) {
            this.value = builder.value;
        }
    }

    /**
     * Get type
     * @return type
    **/
    @JsonProperty("type")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.PromptItemsType getType() {
        return type;
    }

    /**
     * Specifies the prompt.
     * @return value
    **/
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PromptItems v1SkillInteractionModelPromptItems = (PromptItems) o;
        return Objects.equals(this.type, v1SkillInteractionModelPromptItems.type) &&
            Objects.equals(this.value, v1SkillInteractionModelPromptItems.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PromptItems {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.PromptItemsType type;
        private String value;

        private Builder() {}

        @JsonProperty("type")
        public Builder withType(com.amazon.ask.smapi.model.v1.skill.interactionModel.PromptItemsType type) {
            this.type = type;
            return this;
        }


        @JsonProperty("value")
        public Builder withValue(String value) {
            this.value = value;
            return this;
        }


        public PromptItems build() {
            return new PromptItems(this);
        }
    }
}

