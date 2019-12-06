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


package com.amazon.ask.smapi.model.v1.skill.history;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IntentRequest
 */

@JsonDeserialize(builder = IntentRequest.Builder.class)
public final class IntentRequest {

    @JsonProperty("dialogAct")
    private com.amazon.ask.smapi.model.v1.skill.history.DialogAct dialogAct = null;

    @JsonProperty("intent")
    private com.amazon.ask.smapi.model.v1.skill.history.Intent intent = null;

    @JsonProperty("interactionType")
    private com.amazon.ask.smapi.model.v1.skill.history.InteractionType interactionType = null;

    @JsonProperty("locale")
    private com.amazon.ask.smapi.model.v1.skill.history.IntentRequestLocales locale = null;

    @JsonProperty("publicationStatus")
    private com.amazon.ask.smapi.model.v1.skill.history.PublicationStatus publicationStatus = null;

    @JsonProperty("stage")
    private com.amazon.ask.smapi.model.v1.StageType stage = null;

    @JsonProperty("utteranceText")
    private String utteranceText = null;

    public static Builder builder() {
        return new Builder();
    }

    private IntentRequest(Builder builder) {
        if (builder.dialogAct != null) {
            this.dialogAct = builder.dialogAct;
        }
        if (builder.intent != null) {
            this.intent = builder.intent;
        }
        if (builder.interactionType != null) {
            this.interactionType = builder.interactionType;
        }
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
        if (builder.publicationStatus != null) {
            this.publicationStatus = builder.publicationStatus;
        }
        if (builder.stage != null) {
            this.stage = builder.stage;
        }
        if (builder.utteranceText != null) {
            this.utteranceText = builder.utteranceText;
        }
    }

    /**
     * Get dialogAct
     * @return dialogAct
    **/
    @JsonProperty("dialogAct")
    public com.amazon.ask.smapi.model.v1.skill.history.DialogAct getDialogAct() {
        return dialogAct;
    }

    /**
     * Get intent
     * @return intent
    **/
    @JsonProperty("intent")
    public com.amazon.ask.smapi.model.v1.skill.history.Intent getIntent() {
        return intent;
    }

    /**
     * Get interactionType
     * @return interactionType
    **/
    @JsonProperty("interactionType")
    public com.amazon.ask.smapi.model.v1.skill.history.InteractionType getInteractionType() {
        return interactionType;
    }

    /**
     * Get locale
     * @return locale
    **/
    @JsonProperty("locale")
    public com.amazon.ask.smapi.model.v1.skill.history.IntentRequestLocales getLocale() {
        return locale;
    }

    /**
     * Get publicationStatus
     * @return publicationStatus
    **/
    @JsonProperty("publicationStatus")
    public com.amazon.ask.smapi.model.v1.skill.history.PublicationStatus getPublicationStatus() {
        return publicationStatus;
    }

    /**
     * Get stage
     * @return stage
    **/
    @JsonProperty("stage")
    public com.amazon.ask.smapi.model.v1.StageType getStage() {
        return stage;
    }

    /**
     * The transcribed user speech.
     * @return utteranceText
    **/
    @JsonProperty("utteranceText")
    public String getUtteranceText() {
        return utteranceText;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntentRequest v1SkillHistoryIntentRequest = (IntentRequest) o;
        return Objects.equals(this.dialogAct, v1SkillHistoryIntentRequest.dialogAct) &&
            Objects.equals(this.intent, v1SkillHistoryIntentRequest.intent) &&
            Objects.equals(this.interactionType, v1SkillHistoryIntentRequest.interactionType) &&
            Objects.equals(this.locale, v1SkillHistoryIntentRequest.locale) &&
            Objects.equals(this.publicationStatus, v1SkillHistoryIntentRequest.publicationStatus) &&
            Objects.equals(this.stage, v1SkillHistoryIntentRequest.stage) &&
            Objects.equals(this.utteranceText, v1SkillHistoryIntentRequest.utteranceText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dialogAct, intent, interactionType, locale, publicationStatus, stage, utteranceText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntentRequest {\n");
        
        sb.append("    dialogAct: ").append(toIndentedString(dialogAct)).append("\n");
        sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
        sb.append("    interactionType: ").append(toIndentedString(interactionType)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    publicationStatus: ").append(toIndentedString(publicationStatus)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    utteranceText: ").append(toIndentedString(utteranceText)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.history.DialogAct dialogAct;
        private com.amazon.ask.smapi.model.v1.skill.history.Intent intent;
        private com.amazon.ask.smapi.model.v1.skill.history.InteractionType interactionType;
        private com.amazon.ask.smapi.model.v1.skill.history.IntentRequestLocales locale;
        private com.amazon.ask.smapi.model.v1.skill.history.PublicationStatus publicationStatus;
        private com.amazon.ask.smapi.model.v1.StageType stage;
        private String utteranceText;

        private Builder() {}

        @JsonProperty("dialogAct")
        public Builder withDialogAct(com.amazon.ask.smapi.model.v1.skill.history.DialogAct dialogAct) {
            this.dialogAct = dialogAct;
            return this;
        }


        @JsonProperty("intent")
        public Builder withIntent(com.amazon.ask.smapi.model.v1.skill.history.Intent intent) {
            this.intent = intent;
            return this;
        }


        @JsonProperty("interactionType")
        public Builder withInteractionType(com.amazon.ask.smapi.model.v1.skill.history.InteractionType interactionType) {
            this.interactionType = interactionType;
            return this;
        }


        @JsonProperty("locale")
        public Builder withLocale(com.amazon.ask.smapi.model.v1.skill.history.IntentRequestLocales locale) {
            this.locale = locale;
            return this;
        }


        @JsonProperty("publicationStatus")
        public Builder withPublicationStatus(com.amazon.ask.smapi.model.v1.skill.history.PublicationStatus publicationStatus) {
            this.publicationStatus = publicationStatus;
            return this;
        }


        @JsonProperty("stage")
        public Builder withStage(com.amazon.ask.smapi.model.v1.StageType stage) {
            this.stage = stage;
            return this;
        }


        @JsonProperty("utteranceText")
        public Builder withUtteranceText(String utteranceText) {
            this.utteranceText = utteranceText;
            return this;
        }


        public IntentRequest build() {
            return new IntentRequest(this);
        }
    }
}

