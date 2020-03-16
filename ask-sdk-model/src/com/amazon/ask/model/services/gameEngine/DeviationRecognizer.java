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


package com.amazon.ask.model.services.gameEngine;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The deviation recognizer returns true when another specified recognizer reports that the player has deviated from its expected pattern.
 */

@JsonDeserialize(builder = DeviationRecognizer.Builder.class)
public final class DeviationRecognizer extends com.amazon.ask.model.services.gameEngine.Recognizer  {

    @JsonProperty("recognizer")
    private String recognizer = null;

    public static Builder builder() {
        return new Builder();
    }

    private DeviationRecognizer(Builder builder) {
        String discriminatorValue = "deviation";

        this.type = discriminatorValue;
        if (builder.recognizer != null) {
            this.recognizer = builder.recognizer;
        }
    }

    /**
     * The name of the recognizer that defines a pattern that must not be deviated from.
     * @return recognizer
    **/
    @JsonProperty("recognizer")
    public String getRecognizer() {
        return recognizer;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviationRecognizer servicesGameEngineDeviationRecognizer = (DeviationRecognizer) o;
        return Objects.equals(this.recognizer, servicesGameEngineDeviationRecognizer.recognizer) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recognizer, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviationRecognizer {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    recognizer: ").append(toIndentedString(recognizer)).append("\n");
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
        private String recognizer;

        private Builder() {}

        @JsonProperty("recognizer")

        public Builder withRecognizer(String recognizer) {
            this.recognizer = recognizer;
            return this;
        }


        public DeviationRecognizer build() {
            return new DeviationRecognizer(this);
        }
    }
}

