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
 * Input
 */

@JsonDeserialize(builder = Input.Builder.class)
public final class Input {

    @JsonProperty("content")
    private String content = null;

    private Input() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Input(Builder builder) {
        if (builder.content != null) {
            this.content = builder.content;
        }
    }

    /**
     * A string corresponding to the utterance text of what a customer would say to Alexa. 
     * @return content
    **/
    @JsonProperty("content")
    public String getContent() {
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
        Input v1SkillSimulationsInput = (Input) o;
        return Objects.equals(this.content, v1SkillSimulationsInput.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Input {\n");
        
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
        private String content;

        private Builder() {}

        @JsonProperty("content")

        public Builder withContent(String content) {
            this.content = content;
            return this;
        }


        public Input build() {
            return new Input(this);
        }
    }
}

