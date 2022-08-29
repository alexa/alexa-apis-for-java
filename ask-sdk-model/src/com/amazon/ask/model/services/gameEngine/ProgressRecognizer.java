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
 * This recognizer consults another recognizer for the degree of completion, and is true if that degree is above the specified threshold. The completion parameter is specified as a decimal percentage.
 */

@JsonDeserialize(builder = ProgressRecognizer.Builder.class)
public final class ProgressRecognizer extends com.amazon.ask.model.services.gameEngine.Recognizer  {

    @JsonProperty("recognizer")
    private String recognizer = null;

    @JsonProperty("completion")
    private Double completion = null;

    private ProgressRecognizer() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ProgressRecognizer(Builder builder) {
        String discriminatorValue = "progress";

        this.type = discriminatorValue;
        if (builder.recognizer != null) {
            this.recognizer = builder.recognizer;
        }
        if (builder.completion != null) {
            this.completion = builder.completion;
        }
    }

    /**
     * The name of a recognizer for which to track the progress.
     * @return recognizer
    **/
    @JsonProperty("recognizer")
    public String getRecognizer() {
        return recognizer;
    }


    /**
     * The completion threshold, as a decimal percentage, of the specified recognizer before which this recognizer becomes true.
     * @return completion
    **/
    @JsonProperty("completion")
    public Double getCompletion() {
        return completion;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProgressRecognizer servicesGameEngineProgressRecognizer = (ProgressRecognizer) o;
        return Objects.equals(this.recognizer, servicesGameEngineProgressRecognizer.recognizer) &&
            Objects.equals(this.completion, servicesGameEngineProgressRecognizer.completion) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recognizer, completion, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProgressRecognizer {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    recognizer: ").append(toIndentedString(recognizer)).append("\n");
        sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
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
        private Double completion;

        private Builder() {}

        @JsonProperty("recognizer")

        public Builder withRecognizer(String recognizer) {
            this.recognizer = recognizer;
            return this;
        }


        @JsonProperty("completion")

        public Builder withCompletion(Double completion) {
            this.completion = completion;
            return this;
        }


        public ProgressRecognizer build() {
            return new ProgressRecognizer(this);
        }
    }
}

