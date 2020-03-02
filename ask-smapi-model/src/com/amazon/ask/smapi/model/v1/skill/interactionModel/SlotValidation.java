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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Validation on a slot with support for prompt and confirmation.
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.interactionModel.HasEntityResolutionMatch.class, name = "hasEntityResolutionMatch"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.interactionModel.IsLessThanOrEqualTo.class, name = "isLessThanOrEqualTo"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.interactionModel.IsInDuration.class, name = "isInDuration"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.interactionModel.IsLessThan.class, name = "isLessThan"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.interactionModel.IsGreaterThan.class, name = "isGreaterThan"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.interactionModel.IsNotInSet.class, name = "isNotInSet"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.interactionModel.IsNotInDuration.class, name = "isNotInDuration"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.interactionModel.IsGreaterThanOrEqualTo.class, name = "isGreaterThanOrEqualTo"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.interactionModel.IsInSet.class, name = "isInSet"),
})
public abstract class SlotValidation {

    protected String type = null;

    @JsonProperty("prompt")
    protected String prompt = null;

    protected SlotValidation() {
    }

    /**
     * The exact type of validation e.g. isLessThan,isGreaterThan etc.
     * @return type
    **/
    @JsonIgnore
    public String getType() {
        return type;
    }

    /**
     * The prompt id that should be used if validation fails.
     * @return prompt
    **/
    @JsonProperty("prompt")
    public String getPrompt() {
        return prompt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlotValidation v1SkillInteractionModelSlotValidation = (SlotValidation) o;
        return Objects.equals(this.type, v1SkillInteractionModelSlotValidation.type) &&
            Objects.equals(this.prompt, v1SkillInteractionModelSlotValidation.prompt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, prompt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlotValidation {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
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
  
}

