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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Provides context about presentations at the time of the request.
 */

@JsonDeserialize(builder = PresentationState.Builder.class)
public final class PresentationState {

    @JsonProperty("contexts")
    private List<com.amazon.ask.model.interfaces.alexa.presentation.PresentationStateContext> contexts = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.PresentationStateContext>();

    private PresentationState() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private PresentationState(Builder builder) {
        if (builder.contexts != null) {
            this.contexts = builder.contexts;
        }
    }

    /**
     * Includes all presentation contexts owned by the skill which were perceptible at the time of the request.
     * @return contexts
    **/
    @JsonProperty("contexts")
    public List<com.amazon.ask.model.interfaces.alexa.presentation.PresentationStateContext> getContexts() {
        return contexts;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationState interfacesAlexaPresentationPresentationState = (PresentationState) o;
        return Objects.equals(this.contexts, interfacesAlexaPresentationPresentationState.contexts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contexts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationState {\n");
        
        sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
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
        private List<com.amazon.ask.model.interfaces.alexa.presentation.PresentationStateContext> contexts;

        private Builder() {}

        @JsonProperty("contexts")

        public Builder withContexts(List<com.amazon.ask.model.interfaces.alexa.presentation.PresentationStateContext> contexts) {
            this.contexts = contexts;
            return this;
        }

        public Builder addContextsItem(com.amazon.ask.model.interfaces.alexa.presentation.PresentationStateContext contextsItem) {
            if (this.contexts == null) {
                this.contexts = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.PresentationStateContext>();
            }
            this.contexts.add(contextsItem);
            return this;
        }

        public PresentationState build() {
            return new PresentationState(this);
        }
    }
}

