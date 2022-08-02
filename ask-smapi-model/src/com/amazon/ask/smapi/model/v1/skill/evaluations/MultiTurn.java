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


package com.amazon.ask.smapi.model.v1.skill.evaluations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Included when the selected intent has dialog defined and the dialog is not completed.  To continue the dialog, provide the value of the token in the multiTurnToken field in the next request. 
 */

@JsonDeserialize(builder = MultiTurn.Builder.class)
public final class MultiTurn {

    @JsonProperty("dialogAct")
    private com.amazon.ask.smapi.model.v1.skill.evaluations.DialogAct dialogAct = null;

    @JsonProperty("token")
    private String token = null;

    @JsonProperty("prompt")
    private String prompt = null;

    private MultiTurn() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private MultiTurn(Builder builder) {
        if (builder.dialogAct != null) {
            this.dialogAct = builder.dialogAct;
        }
        if (builder.token != null) {
            this.token = builder.token;
        }
        if (builder.prompt != null) {
            this.prompt = builder.prompt;
        }
    }

    /**
     * Get dialogAct
     * @return dialogAct
    **/
    @JsonProperty("dialogAct")
    public com.amazon.ask.smapi.model.v1.skill.evaluations.DialogAct getDialogAct() {
        return dialogAct;
    }


    /**
     * Opaque string which contains multi-turn related context.
     * @return token
    **/
    @JsonProperty("token")
    public String getToken() {
        return token;
    }


    /**
     * A sample prompt defined in the dialog model for each DialogAct.
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
        MultiTurn v1SkillEvaluationsMultiTurn = (MultiTurn) o;
        return Objects.equals(this.dialogAct, v1SkillEvaluationsMultiTurn.dialogAct) &&
            Objects.equals(this.token, v1SkillEvaluationsMultiTurn.token) &&
            Objects.equals(this.prompt, v1SkillEvaluationsMultiTurn.prompt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dialogAct, token, prompt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiTurn {\n");
        
        sb.append("    dialogAct: ").append(toIndentedString(dialogAct)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
  
    public static class Builder {
        private com.amazon.ask.smapi.model.v1.skill.evaluations.DialogAct dialogAct;
        private String token;
        private String prompt;

        private Builder() {}

        @JsonProperty("dialogAct")

        public Builder withDialogAct(com.amazon.ask.smapi.model.v1.skill.evaluations.DialogAct dialogAct) {
            this.dialogAct = dialogAct;
            return this;
        }


        @JsonProperty("token")

        public Builder withToken(String token) {
            this.token = token;
            return this;
        }


        @JsonProperty("prompt")

        public Builder withPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }


        public MultiTurn build() {
            return new MultiTurn(this);
        }
    }
}

