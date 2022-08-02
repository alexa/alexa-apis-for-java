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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * ProfileNluResponse
 */

@JsonDeserialize(builder = ProfileNluResponse.Builder.class)
public final class ProfileNluResponse {

    @JsonProperty("sessionEnded")
    private Boolean sessionEnded = null;

    @JsonProperty("selectedIntent")
    private com.amazon.ask.smapi.model.v1.skill.evaluations.ProfileNluSelectedIntent selectedIntent = null;

    @JsonProperty("consideredIntents")
    private List<com.amazon.ask.smapi.model.v1.skill.evaluations.Intent> consideredIntents = new ArrayList<com.amazon.ask.smapi.model.v1.skill.evaluations.Intent>();

    @JsonProperty("multiTurn")
    private com.amazon.ask.smapi.model.v1.skill.evaluations.MultiTurn multiTurn = null;

    private ProfileNluResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ProfileNluResponse(Builder builder) {
        if (builder.sessionEnded != null) {
            this.sessionEnded = builder.sessionEnded;
        }
        if (builder.selectedIntent != null) {
            this.selectedIntent = builder.selectedIntent;
        }
        if (builder.consideredIntents != null) {
            this.consideredIntents = builder.consideredIntents;
        }
        if (builder.multiTurn != null) {
            this.multiTurn = builder.multiTurn;
        }
    }

    /**
     * Represents when an utterance results in the skill exiting. It would be true when NLU selects 1P ExitAppIntent or GoHomeIntent, and false otherwise. 
     * @return sessionEnded
    **/
    @JsonProperty("sessionEnded")
    public Boolean getSessionEnded() {
        return sessionEnded;
    }


    /**
     * Get selectedIntent
     * @return selectedIntent
    **/
    @JsonProperty("selectedIntent")
    public com.amazon.ask.smapi.model.v1.skill.evaluations.ProfileNluSelectedIntent getSelectedIntent() {
        return selectedIntent;
    }


    /**
     * All intents that Alexa considered for the utterance in the request, but did not select.
     * @return consideredIntents
    **/
    @JsonProperty("consideredIntents")
    public List<com.amazon.ask.smapi.model.v1.skill.evaluations.Intent> getConsideredIntents() {
        return consideredIntents;
    }


    /**
     * Get multiTurn
     * @return multiTurn
    **/
    @JsonProperty("multiTurn")
    public com.amazon.ask.smapi.model.v1.skill.evaluations.MultiTurn getMultiTurn() {
        return multiTurn;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProfileNluResponse v1SkillEvaluationsProfileNluResponse = (ProfileNluResponse) o;
        return Objects.equals(this.sessionEnded, v1SkillEvaluationsProfileNluResponse.sessionEnded) &&
            Objects.equals(this.selectedIntent, v1SkillEvaluationsProfileNluResponse.selectedIntent) &&
            Objects.equals(this.consideredIntents, v1SkillEvaluationsProfileNluResponse.consideredIntents) &&
            Objects.equals(this.multiTurn, v1SkillEvaluationsProfileNluResponse.multiTurn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionEnded, selectedIntent, consideredIntents, multiTurn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProfileNluResponse {\n");
        
        sb.append("    sessionEnded: ").append(toIndentedString(sessionEnded)).append("\n");
        sb.append("    selectedIntent: ").append(toIndentedString(selectedIntent)).append("\n");
        sb.append("    consideredIntents: ").append(toIndentedString(consideredIntents)).append("\n");
        sb.append("    multiTurn: ").append(toIndentedString(multiTurn)).append("\n");
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
        private Boolean sessionEnded;
        private com.amazon.ask.smapi.model.v1.skill.evaluations.ProfileNluSelectedIntent selectedIntent;
        private List<com.amazon.ask.smapi.model.v1.skill.evaluations.Intent> consideredIntents;
        private com.amazon.ask.smapi.model.v1.skill.evaluations.MultiTurn multiTurn;

        private Builder() {}

        @JsonProperty("sessionEnded")

        public Builder withSessionEnded(Boolean sessionEnded) {
            this.sessionEnded = sessionEnded;
            return this;
        }


        @JsonProperty("selectedIntent")

        public Builder withSelectedIntent(com.amazon.ask.smapi.model.v1.skill.evaluations.ProfileNluSelectedIntent selectedIntent) {
            this.selectedIntent = selectedIntent;
            return this;
        }


        @JsonProperty("consideredIntents")

        public Builder withConsideredIntents(List<com.amazon.ask.smapi.model.v1.skill.evaluations.Intent> consideredIntents) {
            this.consideredIntents = consideredIntents;
            return this;
        }

        public Builder addConsideredIntentsItem(com.amazon.ask.smapi.model.v1.skill.evaluations.Intent consideredIntentsItem) {
            if (this.consideredIntents == null) {
                this.consideredIntents = new ArrayList<com.amazon.ask.smapi.model.v1.skill.evaluations.Intent>();
            }
            this.consideredIntents.add(consideredIntentsItem);
            return this;
        }

        @JsonProperty("multiTurn")

        public Builder withMultiTurn(com.amazon.ask.smapi.model.v1.skill.evaluations.MultiTurn multiTurn) {
            this.multiTurn = multiTurn;
            return this;
        }


        public ProfileNluResponse build() {
            return new ProfileNluResponse(this);
        }
    }
}

