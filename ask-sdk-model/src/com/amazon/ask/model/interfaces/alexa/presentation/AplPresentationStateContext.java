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


package com.amazon.ask.model.interfaces.alexa.presentation;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AplPresentationStateContext
 */

@JsonDeserialize(builder = AplPresentationStateContext.Builder.class)
public final class AplPresentationStateContext extends com.amazon.ask.model.interfaces.alexa.presentation.PresentationStateContext  {

    @JsonProperty("context")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.RenderedDocumentState context = null;

    private AplPresentationStateContext() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private AplPresentationStateContext(Builder builder) {
        String discriminatorValue = "Alexa.Presentation.APL";

        this.type = discriminatorValue;
        if (builder.context != null) {
            this.context = builder.context;
        }
    }

    /**
     * Get context
     * @return context
    **/
    @JsonProperty("context")
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.RenderedDocumentState getContext() {
        return context;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AplPresentationStateContext interfacesAlexaPresentationAplPresentationStateContext = (AplPresentationStateContext) o;
        return Objects.equals(this.context, interfacesAlexaPresentationAplPresentationStateContext.context) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(context, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AplPresentationStateContext {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
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
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.RenderedDocumentState context;

        private Builder() {}

        @JsonProperty("context")

        public Builder withContext(com.amazon.ask.model.interfaces.alexa.presentation.apl.RenderedDocumentState context) {
            this.context = context;
            return this;
        }


        public AplPresentationStateContext build() {
            return new AplPresentationStateContext(this);
        }
    }
}

