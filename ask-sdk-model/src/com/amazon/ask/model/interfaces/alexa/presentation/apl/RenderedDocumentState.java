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


package com.amazon.ask.model.interfaces.alexa.presentation.apl;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Provides context for any APL content shown on screen.
 */

@JsonDeserialize(builder = RenderedDocumentState.Builder.class)
public final class RenderedDocumentState {

    @JsonProperty("token")
    private String token = null;

    @JsonProperty("version")
    private String version = null;

    @JsonProperty("componentsVisibleOnScreen")
    private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreen> componentsVisibleOnScreen = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreen>();

    public static Builder builder() {
        return new Builder();
    }

    private RenderedDocumentState(Builder builder) {
        if (builder.token != null) {
            this.token = builder.token;
        }
        if (builder.version != null) {
            this.version = builder.version;
        }
        if (builder.componentsVisibleOnScreen != null) {
            this.componentsVisibleOnScreen = builder.componentsVisibleOnScreen;
        }
    }

    /**
     * The token specified in the RenderDocument directive which rendered the content shown on screen.
     * @return token
    **/
    @JsonProperty("token")
    public String getToken() {
        return token;
    }


    /**
     * The APL version of the document which rendered the content shown on screen.
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }


    /**
     * List of the visible APL components currently shown on screen.
     * @return componentsVisibleOnScreen
    **/
    @JsonProperty("componentsVisibleOnScreen")
    public List<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreen> getComponentsVisibleOnScreen() {
        return componentsVisibleOnScreen;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RenderedDocumentState interfacesAlexaPresentationAplRenderedDocumentState = (RenderedDocumentState) o;
        return Objects.equals(this.token, interfacesAlexaPresentationAplRenderedDocumentState.token) &&
            Objects.equals(this.version, interfacesAlexaPresentationAplRenderedDocumentState.version) &&
            Objects.equals(this.componentsVisibleOnScreen, interfacesAlexaPresentationAplRenderedDocumentState.componentsVisibleOnScreen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, version, componentsVisibleOnScreen);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RenderedDocumentState {\n");
        
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    componentsVisibleOnScreen: ").append(toIndentedString(componentsVisibleOnScreen)).append("\n");
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
        private String token;
        private String version;
        private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreen> componentsVisibleOnScreen;

        private Builder() {}

        @JsonProperty("token")

        public Builder withToken(String token) {
            this.token = token;
            return this;
        }


        @JsonProperty("version")

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        @JsonProperty("componentsVisibleOnScreen")

        public Builder withComponentsVisibleOnScreen(List<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreen> componentsVisibleOnScreen) {
            this.componentsVisibleOnScreen = componentsVisibleOnScreen;
            return this;
        }

        public Builder addComponentsVisibleOnScreenItem(com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreen componentsVisibleOnScreenItem) {
            if (this.componentsVisibleOnScreen == null) {
                this.componentsVisibleOnScreen = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreen>();
            }
            this.componentsVisibleOnScreen.add(componentsVisibleOnScreenItem);
            return this;
        }

        public RenderedDocumentState build() {
            return new RenderedDocumentState(this);
        }
    }
}

