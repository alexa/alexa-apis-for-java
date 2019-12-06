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
 * Prompt
 */

@JsonDeserialize(builder = Prompt.Builder.class)
public final class Prompt {

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("variations")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.PromptItems> variations = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.PromptItems>();

    public static Builder builder() {
        return new Builder();
    }

    private Prompt(Builder builder) {
        if (builder.id != null) {
            this.id = builder.id;
        }
        if (builder.variations != null) {
            this.variations = builder.variations;
        }
    }

    /**
     * The prompt id, this id can be used from dialog definitions.
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * List of variations of the prompt, each variation can be either a text string or a well defined ssml string depending on the type defined.
     * @return variations
    **/
    @JsonProperty("variations")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.PromptItems> getVariations() {
        return variations;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Prompt v1SkillInteractionModelPrompt = (Prompt) o;
        return Objects.equals(this.id, v1SkillInteractionModelPrompt.id) &&
            Objects.equals(this.variations, v1SkillInteractionModelPrompt.variations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, variations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Prompt {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.PromptItems> variations;

        private Builder() {}

        @JsonProperty("id")
        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        @JsonProperty("variations")
        public Builder withVariations(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.PromptItems> variations) {
            this.variations = variations;
            return this;
        }

        public Builder addVariationsItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.PromptItems variationsItem) {
            if (this.variations == null) {
                this.variations = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.PromptItems>();
            }
            this.variations.add(variationsItem);
            return this;
        }

        public Prompt build() {
            return new Prompt(this);
        }
    }
}

