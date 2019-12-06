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


package com.amazon.ask.smapi.model.v1.skill.simulations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AlexaResponse
 */

@JsonDeserialize(builder = AlexaResponse.Builder.class)
public final class AlexaResponse {

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("content")
    private com.amazon.ask.smapi.model.v1.skill.simulations.AlexaResponseContent content = null;

    public static Builder builder() {
        return new Builder();
    }

    private AlexaResponse(Builder builder) {
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.content != null) {
            this.content = builder.content;
        }
    }

    /**
     * The type of Alexa response
     * @return type
    **/
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The detail information needs to exposed in this type of Alexa response. 
     * @return content
    **/
    @JsonProperty("content")
    public com.amazon.ask.smapi.model.v1.skill.simulations.AlexaResponseContent getContent() {
        return content;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlexaResponse v1SkillSimulationsAlexaResponse = (AlexaResponse) o;
        return Objects.equals(this.type, v1SkillSimulationsAlexaResponse.type) &&
            Objects.equals(this.content, v1SkillSimulationsAlexaResponse.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlexaResponse {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
        private String type;
        private com.amazon.ask.smapi.model.v1.skill.simulations.AlexaResponseContent content;

        private Builder() {}

        @JsonProperty("type")
        public Builder withType(String type) {
            this.type = type;
            return this;
        }


        @JsonProperty("content")
        public Builder withContent(com.amazon.ask.smapi.model.v1.skill.simulations.AlexaResponseContent content) {
            this.content = content;
            return this;
        }


        public AlexaResponse build() {
            return new AlexaResponse(this);
        }
    }
}

