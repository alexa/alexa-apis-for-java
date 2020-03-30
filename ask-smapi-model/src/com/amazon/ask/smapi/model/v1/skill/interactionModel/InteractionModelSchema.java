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
 * InteractionModelSchema
 */

@JsonDeserialize(builder = InteractionModelSchema.Builder.class)
public final class InteractionModelSchema {

    @JsonProperty("languageModel")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.LanguageModel languageModel = null;

    @JsonProperty("dialog")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.Dialog dialog = null;

    @JsonProperty("prompts")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.Prompt> prompts = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.Prompt>();

    public static Builder builder() {
        return new Builder();
    }

    private InteractionModelSchema(Builder builder) {
        if (builder.languageModel != null) {
            this.languageModel = builder.languageModel;
        }
        if (builder.dialog != null) {
            this.dialog = builder.dialog;
        }
        if (builder.prompts != null) {
            this.prompts = builder.prompts;
        }
    }

    /**
     * Get languageModel
     * @return languageModel
    **/
    @JsonProperty("languageModel")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.LanguageModel getLanguageModel() {
        return languageModel;
    }


    /**
     * Get dialog
     * @return dialog
    **/
    @JsonProperty("dialog")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.Dialog getDialog() {
        return dialog;
    }


    /**
     * List of prompts.
     * @return prompts
    **/
    @JsonProperty("prompts")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.Prompt> getPrompts() {
        return prompts;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InteractionModelSchema v1SkillInteractionModelInteractionModelSchema = (InteractionModelSchema) o;
        return Objects.equals(this.languageModel, v1SkillInteractionModelInteractionModelSchema.languageModel) &&
            Objects.equals(this.dialog, v1SkillInteractionModelInteractionModelSchema.dialog) &&
            Objects.equals(this.prompts, v1SkillInteractionModelInteractionModelSchema.prompts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(languageModel, dialog, prompts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InteractionModelSchema {\n");
        
        sb.append("    languageModel: ").append(toIndentedString(languageModel)).append("\n");
        sb.append("    dialog: ").append(toIndentedString(dialog)).append("\n");
        sb.append("    prompts: ").append(toIndentedString(prompts)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.LanguageModel languageModel;
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.Dialog dialog;
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.Prompt> prompts;

        private Builder() {}

        @JsonProperty("languageModel")

        public Builder withLanguageModel(com.amazon.ask.smapi.model.v1.skill.interactionModel.LanguageModel languageModel) {
            this.languageModel = languageModel;
            return this;
        }


        @JsonProperty("dialog")

        public Builder withDialog(com.amazon.ask.smapi.model.v1.skill.interactionModel.Dialog dialog) {
            this.dialog = dialog;
            return this;
        }


        @JsonProperty("prompts")

        public Builder withPrompts(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.Prompt> prompts) {
            this.prompts = prompts;
            return this;
        }

        public Builder addPromptsItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.Prompt promptsItem) {
            if (this.prompts == null) {
                this.prompts = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.Prompt>();
            }
            this.prompts.add(promptsItem);
            return this;
        }

        public InteractionModelSchema build() {
            return new InteractionModelSchema(this);
        }
    }
}

