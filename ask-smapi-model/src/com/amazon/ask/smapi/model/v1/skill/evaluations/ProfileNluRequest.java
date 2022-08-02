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
 * ProfileNluRequest
 */

@JsonDeserialize(builder = ProfileNluRequest.Builder.class)
public final class ProfileNluRequest {

    @JsonProperty("utterance")
    private String utterance = null;

    @JsonProperty("multiTurnToken")
    private String multiTurnToken = null;

    private ProfileNluRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ProfileNluRequest(Builder builder) {
        if (builder.utterance != null) {
            this.utterance = builder.utterance;
        }
        if (builder.multiTurnToken != null) {
            this.multiTurnToken = builder.multiTurnToken;
        }
    }

    /**
     * Actual representation of user input to Alexa.
     * @return utterance
    **/
    @JsonProperty("utterance")
    public String getUtterance() {
        return utterance;
    }


    /**
     * Opaque string which contains multi-turn related context.
     * @return multiTurnToken
    **/
    @JsonProperty("multiTurnToken")
    public String getMultiTurnToken() {
        return multiTurnToken;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProfileNluRequest v1SkillEvaluationsProfileNluRequest = (ProfileNluRequest) o;
        return Objects.equals(this.utterance, v1SkillEvaluationsProfileNluRequest.utterance) &&
            Objects.equals(this.multiTurnToken, v1SkillEvaluationsProfileNluRequest.multiTurnToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(utterance, multiTurnToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProfileNluRequest {\n");
        
        sb.append("    utterance: ").append(toIndentedString(utterance)).append("\n");
        sb.append("    multiTurnToken: ").append(toIndentedString(multiTurnToken)).append("\n");
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
        private String utterance;
        private String multiTurnToken;

        private Builder() {}

        @JsonProperty("utterance")

        public Builder withUtterance(String utterance) {
            this.utterance = utterance;
            return this;
        }


        @JsonProperty("multiTurnToken")

        public Builder withMultiTurnToken(String multiTurnToken) {
            this.multiTurnToken = multiTurnToken;
            return this;
        }


        public ProfileNluRequest build() {
            return new ProfileNluRequest(this);
        }
    }
}

