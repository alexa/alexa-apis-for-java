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


package com.amazon.ask.model.interfaces.alexa.presentation.html;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties for performing text to speech transformations. These are the same properties that [APL transformers](https://developer.amazon.com/docs/alexa-presentation-language/apl-data-source.html#transformer-properties-and-conversion-rules) use. 
 */

@JsonDeserialize(builder = Transformer.Builder.class)
public final class Transformer {

    @JsonProperty("transformer")
    private com.amazon.ask.model.interfaces.alexa.presentation.html.TransformerType transformer = null;

    @JsonProperty("inputPath")
    private String inputPath = null;

    @JsonProperty("outputName")
    private String outputName = null;

    public static Builder builder() {
        return new Builder();
    }

    private Transformer(Builder builder) {
        if (builder.transformer != null) {
            this.transformer = builder.transformer;
        }
        if (builder.inputPath != null) {
            this.inputPath = builder.inputPath;
        }
        if (builder.outputName != null) {
            this.outputName = builder.outputName;
        }
    }

    /**
     * Get transformer
     * @return transformer
    **/
    @JsonProperty("transformer")
    public com.amazon.ask.model.interfaces.alexa.presentation.html.TransformerType getTransformer() {
        return transformer;
    }

    /**
     * A JSON path that points to either a single entity in the message object, or a set of entities using wildcard or unresolved arrays. Examples 'family[*].name', 'address.street'. See [APL transformer properties](https://developer.amazon.com/docs/alexa-presentation-language/apl-data-source.html#transformer-properties-and-conversion-rules) for more details. 
     * @return inputPath
    **/
    @JsonProperty("inputPath")
    public String getInputPath() {
        return inputPath;
    }

    /**
     * Name of the output property to add to the message object. For example, if the inputPath is \"address.street\", the transformer output will be stored at \"address.outputName\". If no outputName is supplied, the transformer output will override the value at inputPath. 
     * @return outputName
    **/
    @JsonProperty("outputName")
    public String getOutputName() {
        return outputName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Transformer interfacesAlexaPresentationHtmlTransformer = (Transformer) o;
        return Objects.equals(this.transformer, interfacesAlexaPresentationHtmlTransformer.transformer) &&
            Objects.equals(this.inputPath, interfacesAlexaPresentationHtmlTransformer.inputPath) &&
            Objects.equals(this.outputName, interfacesAlexaPresentationHtmlTransformer.outputName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transformer, inputPath, outputName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Transformer {\n");
        
        sb.append("    transformer: ").append(toIndentedString(transformer)).append("\n");
        sb.append("    inputPath: ").append(toIndentedString(inputPath)).append("\n");
        sb.append("    outputName: ").append(toIndentedString(outputName)).append("\n");
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
        private com.amazon.ask.model.interfaces.alexa.presentation.html.TransformerType transformer;
        private String inputPath;
        private String outputName;

        private Builder() {}

        @JsonProperty("transformer")
        public Builder withTransformer(com.amazon.ask.model.interfaces.alexa.presentation.html.TransformerType transformer) {
            this.transformer = transformer;
            return this;
        }


        @JsonProperty("inputPath")
        public Builder withInputPath(String inputPath) {
            this.inputPath = inputPath;
            return this;
        }


        @JsonProperty("outputName")
        public Builder withOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }


        public Transformer build() {
            return new Transformer(this);
        }
    }
}

