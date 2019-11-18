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
 * The HandleMessage directive sends a message to a skill&#39;s web application that runs on the device browser. To use this directive, [apply to participate](https://build.amazonalexadev.com/AlexaWebAPIforGamesDeveloperPreview_AlexaWebAPIforGames.html) in the Alexa Web API for Games developer preview. 
 */

@JsonDeserialize(builder = HandleMessageDirective.Builder.class)
public final class HandleMessageDirective extends com.amazon.ask.model.Directive  {

    @JsonProperty("message")
    private Object message = null;

    @JsonProperty("transformers")
    private List<com.amazon.ask.model.interfaces.alexa.presentation.html.Transformer> transformers = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.html.Transformer>();

    public static Builder builder() {
        return new Builder();
    }

    private HandleMessageDirective(Builder builder) {
        String discriminatorValue = "Alexa.Presentation.HTML.HandleMessage";

        this.type = discriminatorValue;
        if (builder.message != null) {
            this.message = builder.message;
        }
        if (builder.transformers != null) {
            this.transformers = builder.transformers;
        }
    }

    /**
     * A free-form object containing data to deliver to a skill's HTML application running the device. Maximum size 18 KB.
     * @return message
    **/
    @JsonProperty("message")
    public Object getMessage() {
        return message;
    }

    /**
     * An array of objects for performing text-to-speech transformations with message data
     * @return transformers
    **/
    @JsonProperty("transformers")
    public List<com.amazon.ask.model.interfaces.alexa.presentation.html.Transformer> getTransformers() {
        return transformers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HandleMessageDirective interfacesAlexaPresentationHtmlHandleMessageDirective = (HandleMessageDirective) o;
        return Objects.equals(this.message, interfacesAlexaPresentationHtmlHandleMessageDirective.message) &&
            Objects.equals(this.transformers, interfacesAlexaPresentationHtmlHandleMessageDirective.transformers) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, transformers, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HandleMessageDirective {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    transformers: ").append(toIndentedString(transformers)).append("\n");
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
        private Object message;
        private List<com.amazon.ask.model.interfaces.alexa.presentation.html.Transformer> transformers;

        private Builder() {}

        @JsonProperty("message")
        public Builder withMessage(Object message) {
            this.message = message;
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

        public HandleMessageDirective build() {
            return new HandleMessageDirective(this);
        }
    }
}

