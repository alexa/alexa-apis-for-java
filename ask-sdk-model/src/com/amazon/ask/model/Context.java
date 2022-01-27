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


package com.amazon.ask.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Context
 */

@JsonDeserialize(builder = Context.Builder.class)
public final class Context {

    @JsonProperty("System")
    private com.amazon.ask.model.interfaces.system.SystemState system = null;

    @JsonProperty("Alexa.Presentation.APL")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.RenderedDocumentState alexaPresentationAPL = null;

    @JsonProperty("AudioPlayer")
    private com.amazon.ask.model.interfaces.audioplayer.AudioPlayerState audioPlayer = null;

    @JsonProperty("Automotive")
    private com.amazon.ask.model.interfaces.automotive.AutomotiveState automotive = null;

    @JsonProperty("Display")
    private com.amazon.ask.model.interfaces.display.DisplayState display = null;

    @JsonProperty("Geolocation")
    private com.amazon.ask.model.interfaces.geolocation.GeolocationState geolocation = null;

    @JsonProperty("Viewport")
    private com.amazon.ask.model.interfaces.viewport.ViewportState viewport = null;

    @JsonProperty("Viewports")
    private List<com.amazon.ask.model.interfaces.viewport.TypedViewportState> viewports = new ArrayList<com.amazon.ask.model.interfaces.viewport.TypedViewportState>();

    @JsonProperty("Extensions")
    private com.amazon.ask.model.interfaces.alexa.extension.ExtensionsState extensions = null;

    @JsonProperty("AppLink")
    private com.amazon.ask.model.interfaces.applink.AppLinkState appLink = null;

    @JsonProperty("Experimentation")
    private com.amazon.ask.model.interfaces.alexa.experimentation.ExperimentationState experimentation = null;

    public static Builder builder() {
        return new Builder();
    }

    private Context(Builder builder) {
        if (builder.system != null) {
            this.system = builder.system;
        }
        if (builder.alexaPresentationAPL != null) {
            this.alexaPresentationAPL = builder.alexaPresentationAPL;
        }
        if (builder.audioPlayer != null) {
            this.audioPlayer = builder.audioPlayer;
        }
        if (builder.automotive != null) {
            this.automotive = builder.automotive;
        }
        if (builder.display != null) {
            this.display = builder.display;
        }
        if (builder.geolocation != null) {
            this.geolocation = builder.geolocation;
        }
        if (builder.viewport != null) {
            this.viewport = builder.viewport;
        }
        if (builder.viewports != null) {
            this.viewports = builder.viewports;
        }
        if (builder.extensions != null) {
            this.extensions = builder.extensions;
        }
        if (builder.appLink != null) {
            this.appLink = builder.appLink;
        }
        if (builder.experimentation != null) {
            this.experimentation = builder.experimentation;
        }
    }

    /**
     * Provides information about the current state of the Alexa service and the device interacting with your skill.
     * @return system
    **/
    @JsonProperty("System")
    public com.amazon.ask.model.interfaces.system.SystemState getSystem() {
        return system;
    }


    /**
     * Provides the current state for the Alexa.Presentation.APL interface.
     * @return alexaPresentationAPL
    **/
    @JsonProperty("Alexa.Presentation.APL")
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.RenderedDocumentState getAlexaPresentationAPL() {
        return alexaPresentationAPL;
    }


    /**
     * Provides the current state for the AudioPlayer interface.
     * @return audioPlayer
    **/
    @JsonProperty("AudioPlayer")
    public com.amazon.ask.model.interfaces.audioplayer.AudioPlayerState getAudioPlayer() {
        return audioPlayer;
    }


    /**
     * Provides the automotive specific information of the device.
     * @return automotive
    **/
    @JsonProperty("Automotive")
    public com.amazon.ask.model.interfaces.automotive.AutomotiveState getAutomotive() {
        return automotive;
    }


    /**
     * Provides the current state for the Display interface.
     * @return display
    **/
    @JsonProperty("Display")
    public com.amazon.ask.model.interfaces.display.DisplayState getDisplay() {
        return display;
    }


    /**
     * Provides the last gathered geolocation information of the device.
     * @return geolocation
    **/
    @JsonProperty("Geolocation")
    public com.amazon.ask.model.interfaces.geolocation.GeolocationState getGeolocation() {
        return geolocation;
    }


    /**
     * Provides the characteristics of a device's viewport.
     * @return viewport
    **/
    @JsonProperty("Viewport")
    public com.amazon.ask.model.interfaces.viewport.ViewportState getViewport() {
        return viewport;
    }


    /**
     * This object contains a list of viewports characteristics related to the device's viewports.
     * @return viewports
    **/
    @JsonProperty("Viewports")
    public List<com.amazon.ask.model.interfaces.viewport.TypedViewportState> getViewports() {
        return viewports;
    }


    /**
     * Provides the current state for Extensions interface
     * @return extensions
    **/
    @JsonProperty("Extensions")
    public com.amazon.ask.model.interfaces.alexa.extension.ExtensionsState getExtensions() {
        return extensions;
    }


    /**
     * Provides the current state for app link capability.
     * @return appLink
    **/
    @JsonProperty("AppLink")
    public com.amazon.ask.model.interfaces.applink.AppLinkState getAppLink() {
        return appLink;
    }


    /**
     * Provides the current experimentation state
     * @return experimentation
    **/
    @JsonProperty("Experimentation")
    public com.amazon.ask.model.interfaces.alexa.experimentation.ExperimentationState getExperimentation() {
        return experimentation;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Context context = (Context) o;
        return Objects.equals(this.system, context.system) &&
            Objects.equals(this.alexaPresentationAPL, context.alexaPresentationAPL) &&
            Objects.equals(this.audioPlayer, context.audioPlayer) &&
            Objects.equals(this.automotive, context.automotive) &&
            Objects.equals(this.display, context.display) &&
            Objects.equals(this.geolocation, context.geolocation) &&
            Objects.equals(this.viewport, context.viewport) &&
            Objects.equals(this.viewports, context.viewports) &&
            Objects.equals(this.extensions, context.extensions) &&
            Objects.equals(this.appLink, context.appLink) &&
            Objects.equals(this.experimentation, context.experimentation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(system, alexaPresentationAPL, audioPlayer, automotive, display, geolocation, viewport, viewports, extensions, appLink, experimentation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Context {\n");
        
        sb.append("    system: ").append(toIndentedString(system)).append("\n");
        sb.append("    alexaPresentationAPL: ").append(toIndentedString(alexaPresentationAPL)).append("\n");
        sb.append("    audioPlayer: ").append(toIndentedString(audioPlayer)).append("\n");
        sb.append("    automotive: ").append(toIndentedString(automotive)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
        sb.append("    viewport: ").append(toIndentedString(viewport)).append("\n");
        sb.append("    viewports: ").append(toIndentedString(viewports)).append("\n");
        sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
        sb.append("    appLink: ").append(toIndentedString(appLink)).append("\n");
        sb.append("    experimentation: ").append(toIndentedString(experimentation)).append("\n");
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
        private com.amazon.ask.model.interfaces.system.SystemState system;
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.RenderedDocumentState alexaPresentationAPL;
        private com.amazon.ask.model.interfaces.audioplayer.AudioPlayerState audioPlayer;
        private com.amazon.ask.model.interfaces.automotive.AutomotiveState automotive;
        private com.amazon.ask.model.interfaces.display.DisplayState display;
        private com.amazon.ask.model.interfaces.geolocation.GeolocationState geolocation;
        private com.amazon.ask.model.interfaces.viewport.ViewportState viewport;
        private List<com.amazon.ask.model.interfaces.viewport.TypedViewportState> viewports;
        private com.amazon.ask.model.interfaces.alexa.extension.ExtensionsState extensions;
        private com.amazon.ask.model.interfaces.applink.AppLinkState appLink;
        private com.amazon.ask.model.interfaces.alexa.experimentation.ExperimentationState experimentation;

        private Builder() {}

        @JsonProperty("System")

        public Builder withSystem(com.amazon.ask.model.interfaces.system.SystemState system) {
            this.system = system;
            return this;
        }


        @JsonProperty("Alexa.Presentation.APL")

        public Builder withAlexaPresentationAPL(com.amazon.ask.model.interfaces.alexa.presentation.apl.RenderedDocumentState alexaPresentationAPL) {
            this.alexaPresentationAPL = alexaPresentationAPL;
            return this;
        }


        @JsonProperty("AudioPlayer")

        public Builder withAudioPlayer(com.amazon.ask.model.interfaces.audioplayer.AudioPlayerState audioPlayer) {
            this.audioPlayer = audioPlayer;
            return this;
        }


        @JsonProperty("Automotive")

        public Builder withAutomotive(com.amazon.ask.model.interfaces.automotive.AutomotiveState automotive) {
            this.automotive = automotive;
            return this;
        }


        @JsonProperty("Display")

        public Builder withDisplay(com.amazon.ask.model.interfaces.display.DisplayState display) {
            this.display = display;
            return this;
        }


        @JsonProperty("Geolocation")

        public Builder withGeolocation(com.amazon.ask.model.interfaces.geolocation.GeolocationState geolocation) {
            this.geolocation = geolocation;
            return this;
        }


        @JsonProperty("Viewport")

        public Builder withViewport(com.amazon.ask.model.interfaces.viewport.ViewportState viewport) {
            this.viewport = viewport;
            return this;
        }


        @JsonProperty("Viewports")

        public Builder withViewports(List<com.amazon.ask.model.interfaces.viewport.TypedViewportState> viewports) {
            this.viewports = viewports;
            return this;
        }

        public Builder addViewportsItem(com.amazon.ask.model.interfaces.viewport.TypedViewportState viewportsItem) {
            if (this.viewports == null) {
                this.viewports = new ArrayList<com.amazon.ask.model.interfaces.viewport.TypedViewportState>();
            }
            this.viewports.add(viewportsItem);
            return this;
        }

        @JsonProperty("Extensions")

        public Builder withExtensions(com.amazon.ask.model.interfaces.alexa.extension.ExtensionsState extensions) {
            this.extensions = extensions;
            return this;
        }


        @JsonProperty("AppLink")

        public Builder withAppLink(com.amazon.ask.model.interfaces.applink.AppLinkState appLink) {
            this.appLink = appLink;
            return this;
        }


        @JsonProperty("Experimentation")

        public Builder withExperimentation(com.amazon.ask.model.interfaces.alexa.experimentation.ExperimentationState experimentation) {
            this.experimentation = experimentation;
            return this;
        }


        public Context build() {
            return new Context(this);
        }
    }
}

