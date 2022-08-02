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
 * Defines dialog rules e.g. slot elicitation and validation, intent chaining etc.
 */

@JsonDeserialize(builder = Dialog.Builder.class)
public final class Dialog {

    @JsonProperty("delegationStrategy")
    private String delegationStrategy = null;

    @JsonProperty("intents")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogIntents> intents = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogIntents>();

    private Dialog() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Dialog(Builder builder) {
        if (builder.delegationStrategy != null) {
            this.delegationStrategy = builder.delegationStrategy;
        }
        if (builder.intents != null) {
            this.intents = builder.intents;
        }
    }

    /**
     * Defines a delegation strategy for the dialogs in this dialog model.
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getDelegationStrategyAsString().
     *
     * @return delegationStrategy
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.DelegationStrategyType getDelegationStrategy() {
        return com.amazon.ask.smapi.model.v1.skill.interactionModel.DelegationStrategyType.fromValue(delegationStrategy);
    }

    /**
     * Get the underlying String value for delegationStrategy.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return delegationStrategy as a String value
    **/
    @JsonProperty("delegationStrategy")
    public String getDelegationStrategyAsString() {
      return delegationStrategy;
    }

    /**
     * List of intents that have dialog rules associated with them. Dialogs can also span multiple intents.
     * @return intents
    **/
    @JsonProperty("intents")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogIntents> getIntents() {
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
        Dialog v1SkillInteractionModelDialog = (Dialog) o;
        return Objects.equals(this.delegationStrategy, v1SkillInteractionModelDialog.delegationStrategy) &&
            Objects.equals(this.intents, v1SkillInteractionModelDialog.intents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delegationStrategy, intents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dialog {\n");
        
        sb.append("    delegationStrategy: ").append(toIndentedString(delegationStrategy)).append("\n");
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
        private String delegationStrategy;
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogIntents> intents;

        private Builder() {}

        @JsonProperty("delegationStrategy")

        public Builder withDelegationStrategy(String delegationStrategy) {
          this.delegationStrategy = delegationStrategy;
          return this;
        }

        public Builder withDelegationStrategy(com.amazon.ask.smapi.model.v1.skill.interactionModel.DelegationStrategyType delegationStrategy) {
            this.delegationStrategy = delegationStrategy != null ? delegationStrategy.toString() : null;
            return this;
        }


        @JsonProperty("intents")

        public Builder withIntents(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogIntents> intents) {
            this.intents = intents;
            return this;
        }

        public Builder addIntentsItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogIntents intentsItem) {
            if (this.intents == null) {
                this.intents = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.DialogIntents>();
            }
            this.intents.add(intentsItem);
            return this;
        }

        public Dialog build() {
            return new Dialog(this);
        }
    }
}

