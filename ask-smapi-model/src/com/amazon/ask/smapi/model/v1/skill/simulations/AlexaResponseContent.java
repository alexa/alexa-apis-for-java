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
 * AlexaResponseContent
 */

@JsonDeserialize(builder = AlexaResponseContent.Builder.class)
public final class AlexaResponseContent {

    @JsonProperty("caption")
    private String caption = null;

    public static Builder builder() {
        return new Builder();
    }

    private AlexaResponseContent(Builder builder) {
        if (builder.caption != null) {
            this.caption = builder.caption;
        }
    }

    /**
     * The plain text get from Alexa speech response
     * @return caption
    **/
    @JsonProperty("caption")
    public String getCaption() {
        return caption;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlexaResponseContent v1SkillSimulationsAlexaResponseContent = (AlexaResponseContent) o;
        return Objects.equals(this.caption, v1SkillSimulationsAlexaResponseContent.caption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caption);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlexaResponseContent {\n");
        
        sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
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
        private String caption;

        private Builder() {}

        @JsonProperty("caption")
        public Builder withCaption(String caption) {
            this.caption = caption;
            return this;
        }


        public AlexaResponseContent build() {
            return new AlexaResponseContent(this);
        }
    }
}

