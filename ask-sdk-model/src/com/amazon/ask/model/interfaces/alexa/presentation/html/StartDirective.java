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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * The Start directive provides the data necessary to load an HTML page on the target device. 
 */

@JsonDeserialize(builder = StartDirective.Builder.class)
public final class StartDirective extends com.amazon.ask.model.Directive  {

    @JsonProperty("data")
    private Object data = null;

    @JsonProperty("transformers")
    private List<com.amazon.ask.model.interfaces.alexa.presentation.html.Transformer> transformers = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.html.Transformer>();

    @JsonProperty("request")
    private com.amazon.ask.model.interfaces.alexa.presentation.html.StartRequest request = null;

    @JsonProperty("configuration")
    private com.amazon.ask.model.interfaces.alexa.presentation.html.ModelConfiguration _configuration = null;

    public static Builder builder() {
        return new Builder();
    }

    private StartDirective(Builder builder) {
        String discriminatorValue = "Alexa.Presentation.HTML.Start";

        this.type = discriminatorValue;
        if (builder.data != null) {
            this.data = builder.data;
        }
        if (builder.transformers != null) {
            this.transformers = builder.transformers;
        }
        if (builder.request != null) {
            this.request = builder.request;
        }
        if (builder._configuration != null) {
            this._configuration = builder._configuration;
        }
    }

    /**
     * Optional startup data which will be made available to the runtime for skill startup. Maximum size: 18 KB
     * @return data
    **/
    @JsonProperty("data")
    public Object getData() {
        return data;
    }


    /**
     * An array of objects for performing text-to-speech transformations with message data
     * @return transformers
    **/
    @JsonProperty("transformers")
    public List<com.amazon.ask.model.interfaces.alexa.presentation.html.Transformer> getTransformers() {
        return transformers;
    }


    /**
     * Get request
     * @return request
    **/
    @JsonProperty("request")
    public com.amazon.ask.model.interfaces.alexa.presentation.html.StartRequest getRequest() {
        return request;
    }


    /**
     * Get _configuration
     * @return _configuration
    **/
    @JsonProperty("configuration")
    public com.amazon.ask.model.interfaces.alexa.presentation.html.ModelConfiguration getConfiguration() {
        return _configuration;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartDirective interfacesAlexaPresentationHtmlStartDirective = (StartDirective) o;
        return Objects.equals(this.data, interfacesAlexaPresentationHtmlStartDirective.data) &&
            Objects.equals(this.transformers, interfacesAlexaPresentationHtmlStartDirective.transformers) &&
            Objects.equals(this.request, interfacesAlexaPresentationHtmlStartDirective.request) &&
            Objects.equals(this._configuration, interfacesAlexaPresentationHtmlStartDirective._configuration) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, transformers, request, _configuration, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartDirective {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    transformers: ").append(toIndentedString(transformers)).append("\n");
        sb.append("    request: ").append(toIndentedString(request)).append("\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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
        private Object data;
        private List<com.amazon.ask.model.interfaces.alexa.presentation.html.Transformer> transformers;
        private com.amazon.ask.model.interfaces.alexa.presentation.html.StartRequest request;
        private com.amazon.ask.model.interfaces.alexa.presentation.html.ModelConfiguration _configuration;

        private Builder() {}

        @JsonProperty("data")

        public Builder withData(Object data) {
            this.data = data;
            return this;
        }


        @JsonProperty("transformers")

        public Builder withTransformers(List<com.amazon.ask.model.interfaces.alexa.presentation.html.Transformer> transformers) {
            this.transformers = transformers;
            return this;
        }

        public Builder addTransformersItem(com.amazon.ask.model.interfaces.alexa.presentation.html.Transformer transformersItem) {
            if (this.transformers == null) {
                this.transformers = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.html.Transformer>();
            }
            this.transformers.add(transformersItem);
            return this;
        }

        @JsonProperty("request")

        public Builder withRequest(com.amazon.ask.model.interfaces.alexa.presentation.html.StartRequest request) {
            this.request = request;
            return this;
        }


        @JsonProperty("configuration")

        public Builder withConfiguration(com.amazon.ask.model.interfaces.alexa.presentation.html.ModelConfiguration _configuration) {
            this._configuration = _configuration;
            return this;
        }


        public StartDirective build() {
            return new StartDirective(this);
        }
    }
}

