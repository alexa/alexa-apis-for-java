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
    private String interactionType = null;

    @JsonProperty("locale")
    private String locale = null;

    @JsonProperty("publicationStatus")
    private String publicationStatus = null;

    @JsonProperty("stage")
    private String stage = null;

    @JsonProperty("utteranceText")
    private String utteranceText = null;

    private IntentRequest() {
    }

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
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getInteractionTypeAsString().
     *
     * @return interactionType
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.history.InteractionType getInteractionType() {
        return com.amazon.ask.smapi.model.v1.skill.history.InteractionType.fromValue(interactionType);
    }

    /**
     * Get the underlying String value for interactionType.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return interactionType as a String value
    **/
    @JsonProperty("interactionType")
    public String getInteractionTypeAsString() {
      return interactionType;
    }

    /**
     * Get locale
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getLocaleAsString().
     *
     * @return locale
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.history.IntentRequestLocales getLocale() {
        return com.amazon.ask.smapi.model.v1.skill.history.IntentRequestLocales.fromValue(locale);
    }

    /**
     * Get the underlying String value for locale.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return locale as a String value
    **/
    @JsonProperty("locale")
    public String getLocaleAsString() {
      return locale;
    }

    /**
     * Get publicationStatus
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getPublicationStatusAsString().
     *
     * @return publicationStatus
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.history.PublicationStatus getPublicationStatus() {
        return com.amazon.ask.smapi.model.v1.skill.history.PublicationStatus.fromValue(publicationStatus);
    }

    /**
     * Get the underlying String value for publicationStatus.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return publicationStatus as a String value
    **/
    @JsonProperty("publicationStatus")
    public String getPublicationStatusAsString() {
      return publicationStatus;
    }

    /**
     * Get stage
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStageAsString().
     *
     * @return stage
    **/
    
    public com.amazon.ask.smapi.model.v1.StageType getStage() {
        return com.amazon.ask.smapi.model.v1.StageType.fromValue(stage);
    }

    /**
     * Get the underlying String value for stage.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return stage as a String value
    **/
    @JsonProperty("stage")
    public String getStageAsString() {
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
        private String interactionType;
        private String locale;
        private String publicationStatus;
        private String stage;
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

        public Builder withInteractionType(String interactionType) {
          this.interactionType = interactionType;
          return this;
        }

        public Builder withInteractionType(com.amazon.ask.smapi.model.v1.skill.history.InteractionType interactionType) {
            this.interactionType = interactionType != null ? interactionType.toString() : null;
            return this;
        }


        @JsonProperty("locale")

        public Builder withLocale(String locale) {
          this.locale = locale;
          return this;
        }

        public Builder withLocale(com.amazon.ask.smapi.model.v1.skill.history.IntentRequestLocales locale) {
            this.locale = locale != null ? locale.toString() : null;
            return this;
        }


        @JsonProperty("publicationStatus")

        public Builder withPublicationStatus(String publicationStatus) {
          this.publicationStatus = publicationStatus;
          return this;
        }

        public Builder withPublicationStatus(com.amazon.ask.smapi.model.v1.skill.history.PublicationStatus publicationStatus) {
            this.publicationStatus = publicationStatus != null ? publicationStatus.toString() : null;
            return this;
        }


        @JsonProperty("stage")

        public Builder withStage(String stage) {
          this.stage = stage;
          return this;
        }

        public Builder withStage(com.amazon.ask.smapi.model.v1.StageType stage) {
            this.stage = stage != null ? stage.toString() : null;
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

