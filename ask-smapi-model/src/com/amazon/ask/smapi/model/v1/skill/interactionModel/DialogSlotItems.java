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
 * DialogSlotItems
 */

@JsonDeserialize(builder = DialogSlotItems.Builder.class)
public final class DialogSlotItems {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("elicitationRequired")
    private Boolean elicitationRequired = null;

    @JsonProperty("confirmationRequired")
    private Boolean confirmationRequired = null;

    @JsonProperty("prompts")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogPrompts prompts = null;

    @JsonProperty("validations")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotValidation> validations = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotValidation>();

    private DialogSlotItems() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private DialogSlotItems(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.elicitationRequired != null) {
            this.elicitationRequired = builder.elicitationRequired;
        }
        if (builder.confirmationRequired != null) {
            this.confirmationRequired = builder.confirmationRequired;
        }
        if (builder.prompts != null) {
            this.prompts = builder.prompts;
        }
        if (builder.validations != null) {
            this.validations = builder.validations;
        }
    }

    /**
     * The name of the slot that has dialog rules associated with it.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Type of the slot in the dialog intent.
     * @return type
    **/
    @JsonProperty("type")
    public String getType() {
        return type;
    }


    /**
     * Describes whether elicitation of the slot is required.
     * @return elicitationRequired
    **/
    @JsonProperty("elicitationRequired")
    public Boolean getElicitationRequired() {
        return elicitationRequired;
    }


    /**
     * Describes whether confirmation of the slot is required.
     * @return confirmationRequired
    **/
    @JsonProperty("confirmationRequired")
    public Boolean getConfirmationRequired() {
        return confirmationRequired;
    }


    /**
     * Get prompts
     * @return prompts
    **/
    @JsonProperty("prompts")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogPrompts getPrompts() {
        return prompts;
    }


    /**
     * List of validations for the slot. if validation fails, user will be prompted with the provided prompt.
     * @return validations
    **/
    @JsonProperty("validations")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotValidation> getValidations() {
        return validations;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DialogSlotItems v1SkillInteractionModelDialogSlotItems = (DialogSlotItems) o;
        return Objects.equals(this.name, v1SkillInteractionModelDialogSlotItems.name) &&
            Objects.equals(this.type, v1SkillInteractionModelDialogSlotItems.type) &&
            Objects.equals(this.elicitationRequired, v1SkillInteractionModelDialogSlotItems.elicitationRequired) &&
            Objects.equals(this.confirmationRequired, v1SkillInteractionModelDialogSlotItems.confirmationRequired) &&
            Objects.equals(this.prompts, v1SkillInteractionModelDialogSlotItems.prompts) &&
            Objects.equals(this.validations, v1SkillInteractionModelDialogSlotItems.validations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, elicitationRequired, confirmationRequired, prompts, validations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DialogSlotItems {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    elicitationRequired: ").append(toIndentedString(elicitationRequired)).append("\n");
        sb.append("    confirmationRequired: ").append(toIndentedString(confirmationRequired)).append("\n");
        sb.append("    prompts: ").append(toIndentedString(prompts)).append("\n");
        sb.append("    validations: ").append(toIndentedString(validations)).append("\n");
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
        private Boolean elicitationRequired;
        private Boolean confirmationRequired;
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogPrompts prompts;
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotValidation> validations;

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


        @JsonProperty("elicitationRequired")

        public Builder withElicitationRequired(Boolean elicitationRequired) {
            this.elicitationRequired = elicitationRequired;
            return this;
        }


        @JsonProperty("confirmationRequired")

        public Builder withConfirmationRequired(Boolean confirmationRequired) {
            this.confirmationRequired = confirmationRequired;
            return this;
        }


        @JsonProperty("prompts")

        public Builder withPrompts(com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogPrompts prompts) {
            this.prompts = prompts;
            return this;
        }


        @JsonProperty("validations")

        public Builder withValidations(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotValidation> validations) {
            this.validations = validations;
            return this;
        }

        public Builder addValidationsItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotValidation validationsItem) {
            if (this.validations == null) {
                this.validations = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotValidation>();
            }
            this.validations.add(validationsItem);
            return this;
        }

        public DialogSlotItems build() {
            return new DialogSlotItems(this);
        }
    }
}

