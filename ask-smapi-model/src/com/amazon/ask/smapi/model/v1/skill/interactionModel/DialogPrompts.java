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
 * Dialog prompts associated with this slot i.e. for elicitation and/or confirmation.
 */

@JsonDeserialize(builder = DialogPrompts.Builder.class)
public final class DialogPrompts {

    @JsonProperty("elicitation")
    private String elicitation = null;

    @JsonProperty("confirmation")
    private String confirmation = null;

    private DialogPrompts() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private DialogPrompts(Builder builder) {
        if (builder.elicitation != null) {
            this.elicitation = builder.elicitation;
        }
        if (builder.confirmation != null) {
            this.confirmation = builder.confirmation;
        }
    }

    /**
     * Reference to a prompt-id to use If this slot value is missing.
     * @return elicitation
    **/
    @JsonProperty("elicitation")
    public String getElicitation() {
        return elicitation;
    }


    /**
     * Reference to a prompt-id to use to confirm the slots value.
     * @return confirmation
    **/
    @JsonProperty("confirmation")
    public String getConfirmation() {
        return confirmation;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DialogPrompts v1SkillInteractionModelDialogPrompts = (DialogPrompts) o;
        return Objects.equals(this.elicitation, v1SkillInteractionModelDialogPrompts.elicitation) &&
            Objects.equals(this.confirmation, v1SkillInteractionModelDialogPrompts.confirmation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elicitation, confirmation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DialogPrompts {\n");
        
        sb.append("    elicitation: ").append(toIndentedString(elicitation)).append("\n");
        sb.append("    confirmation: ").append(toIndentedString(confirmation)).append("\n");
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
        private String elicitation;
        private String confirmation;

        private Builder() {}

        @JsonProperty("elicitation")

        public Builder withElicitation(String elicitation) {
            this.elicitation = elicitation;
            return this;
        }


        @JsonProperty("confirmation")

        public Builder withConfirmation(String confirmation) {
            this.confirmation = confirmation;
            return this;
        }


        public DialogPrompts build() {
            return new DialogPrompts(this);
        }
    }
}

