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
 * DialogIntents
 */

@JsonDeserialize(builder = DialogIntents.Builder.class)
public final class DialogIntents {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("delegationStrategy")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.DelegationStrategyType delegationStrategy = null;

    @JsonProperty("slots")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogSlotItems> slots = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogSlotItems>();

    @JsonProperty("confirmationRequired")
    private Boolean confirmationRequired = null;

    @JsonProperty("prompts")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogIntentsPrompts prompts = null;

    public static Builder builder() {
        return new Builder();
    }

    private DialogIntents(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.delegationStrategy != null) {
            this.delegationStrategy = builder.delegationStrategy;
        }
        if (builder.slots != null) {
            this.slots = builder.slots;
        }
        if (builder.confirmationRequired != null) {
            this.confirmationRequired = builder.confirmationRequired;
        }
        if (builder.prompts != null) {
            this.prompts = builder.prompts;
        }
    }

    /**
     * Name of the intent that has a dialog specification.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Defines an intent-specific delegation strategy for this dialog intent. Overrides dialog-level setting.
     * @return delegationStrategy
    **/
    @JsonProperty("delegationStrategy")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.DelegationStrategyType getDelegationStrategy() {
        return delegationStrategy;
    }

    /**
     * List of slots that have dialog rules.
     * @return slots
    **/
    @JsonProperty("slots")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogSlotItems> getSlots() {
        return slots;
    }

    /**
     * Describes whether confirmation of the intent is required.
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
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogIntentsPrompts getPrompts() {
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
        DialogIntents v1SkillInteractionModelDialogIntents = (DialogIntents) o;
        return Objects.equals(this.name, v1SkillInteractionModelDialogIntents.name) &&
            Objects.equals(this.delegationStrategy, v1SkillInteractionModelDialogIntents.delegationStrategy) &&
            Objects.equals(this.slots, v1SkillInteractionModelDialogIntents.slots) &&
            Objects.equals(this.confirmationRequired, v1SkillInteractionModelDialogIntents.confirmationRequired) &&
            Objects.equals(this.prompts, v1SkillInteractionModelDialogIntents.prompts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, delegationStrategy, slots, confirmationRequired, prompts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DialogIntents {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    delegationStrategy: ").append(toIndentedString(delegationStrategy)).append("\n");
        sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
        sb.append("    confirmationRequired: ").append(toIndentedString(confirmationRequired)).append("\n");
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
        private String name;
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.DelegationStrategyType delegationStrategy;
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogSlotItems> slots;
        private Boolean confirmationRequired;
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogIntentsPrompts prompts;

        private Builder() {}

        @JsonProperty("name")
        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("delegationStrategy")
        public Builder withDelegationStrategy(com.amazon.ask.smapi.model.v1.skill.interactionModel.DelegationStrategyType delegationStrategy) {
            this.delegationStrategy = delegationStrategy;
            return this;
        }


        @JsonProperty("slots")
        public Builder withSlots(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogSlotItems> slots) {
            this.slots = slots;
            return this;
        }

        public Builder addSlotsItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogSlotItems slotsItem) {
            if (this.slots == null) {
                this.slots = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogSlotItems>();
            }
            this.slots.add(slotsItem);
            return this;
        }

        @JsonProperty("confirmationRequired")
        public Builder withConfirmationRequired(Boolean confirmationRequired) {
            this.confirmationRequired = confirmationRequired;
            return this;
        }


        @JsonProperty("prompts")
        public Builder withPrompts(com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogIntentsPrompts prompts) {
            this.prompts = prompts;
            return this;
        }


        public DialogIntents build() {
            return new DialogIntents(this);
        }
    }
}

