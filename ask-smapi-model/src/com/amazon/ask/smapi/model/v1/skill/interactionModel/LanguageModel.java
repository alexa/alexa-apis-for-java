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
 * Define the language model.
 */

@JsonDeserialize(builder = LanguageModel.Builder.class)
public final class LanguageModel {

    @JsonProperty("invocationName")
    private String invocationName = null;

    @JsonProperty("types")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotType> types = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotType>();

    @JsonProperty("intents")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.Intent> intents = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.Intent>();

    public static Builder builder() {
        return new Builder();
    }

    private LanguageModel(Builder builder) {
        if (builder.invocationName != null) {
            this.invocationName = builder.invocationName;
        }
        if (builder.types != null) {
            this.types = builder.types;
        }
        if (builder.intents != null) {
            this.intents = builder.intents;
        }
    }

    /**
     * Invocation name of the skill.
     * @return invocationName
    **/
    @JsonProperty("invocationName")
    public String getInvocationName() {
        return invocationName;
    }

    /**
     * Get types
     * @return types
    **/
    @JsonProperty("types")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotType> getTypes() {
        return types;
    }

    /**
     * Get intents
     * @return intents
    **/
    @JsonProperty("intents")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.Intent> getIntents() {
        return intents;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LanguageModel v1SkillInteractionModelLanguageModel = (LanguageModel) o;
        return Objects.equals(this.invocationName, v1SkillInteractionModelLanguageModel.invocationName) &&
            Objects.equals(this.types, v1SkillInteractionModelLanguageModel.types) &&
            Objects.equals(this.intents, v1SkillInteractionModelLanguageModel.intents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invocationName, types, intents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LanguageModel {\n");
        
        sb.append("    invocationName: ").append(toIndentedString(invocationName)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
        sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
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
        private String invocationName;
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotType> types;
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.Intent> intents;

        private Builder() {}

        @JsonProperty("invocationName")
        public Builder withInvocationName(String invocationName) {
            this.invocationName = invocationName;
            return this;
        }


        @JsonProperty("types")
        public Builder withTypes(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotType> types) {
            this.types = types;
            return this;
        }

        public Builder addTypesItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotType typesItem) {
            if (this.types == null) {
                this.types = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotType>();
            }
            this.types.add(typesItem);
            return this;
        }

        @JsonProperty("intents")
        public Builder withIntents(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.Intent> intents) {
            this.intents = intents;
            return this;
        }

        public Builder addIntentsItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.Intent intentsItem) {
            if (this.intents == null) {
                this.intents = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.Intent>();
            }
            this.intents.add(intentsItem);
            return this;
        }

        public LanguageModel build() {
            return new LanguageModel(this);
        }
    }
}

