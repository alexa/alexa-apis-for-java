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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object listing each interface that the device supports. For example, if supportedInterfaces includes AudioPlayer {}, then you know that the device supports streaming audio using the AudioPlayer interface.
 */

@JsonDeserialize(builder = SupportedInterfaces.Builder.class)
public final class SupportedInterfaces {

    @JsonProperty("Alexa.Presentation.APL")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.AlexaPresentationAplInterface alexaPresentationAPL = null;

    @JsonProperty("Alexa.Presentation.APLT")
    private com.amazon.ask.model.interfaces.alexa.presentation.aplt.AlexaPresentationApltInterface alexaPresentationAPLT = null;

    @JsonProperty("Alexa.Presentation.HTML")
    private com.amazon.ask.model.interfaces.alexa.presentation.html.AlexaPresentationHtmlInterface alexaPresentationHTML = null;

    @JsonProperty("AudioPlayer")
    private com.amazon.ask.model.interfaces.audioplayer.AudioPlayerInterface audioPlayer = null;

    @JsonProperty("Display")
    private com.amazon.ask.model.interfaces.display.DisplayInterface display = null;

    @JsonProperty("VideoApp")
    private com.amazon.ask.model.interfaces.videoapp.VideoAppInterface videoApp = null;

    @JsonProperty("Geolocation")
    private com.amazon.ask.model.interfaces.geolocation.GeolocationInterface geolocation = null;

    @JsonProperty("Navigation")
    private com.amazon.ask.model.interfaces.navigation.NavigationInterface navigation = null;

    public static Builder builder() {
        return new Builder();
    }

    private SupportedInterfaces(Builder builder) {
        if (builder.alexaPresentationAPL != null) {
            this.alexaPresentationAPL = builder.alexaPresentationAPL;
        }
        if (builder.alexaPresentationAPLT != null) {
            this.alexaPresentationAPLT = builder.alexaPresentationAPLT;
        }
        if (builder.alexaPresentationHTML != null) {
            this.alexaPresentationHTML = builder.alexaPresentationHTML;
        }
        if (builder.audioPlayer != null) {
            this.audioPlayer = builder.audioPlayer;
        }
        if (builder.display != null) {
            this.display = builder.display;
        }
        if (builder.videoApp != null) {
            this.videoApp = builder.videoApp;
        }
        if (builder.geolocation != null) {
            this.geolocation = builder.geolocation;
        }
        if (builder.navigation != null) {
            this.navigation = builder.navigation;
        }
    }

    /**
     * Get alexaPresentationAPL
     * @return alexaPresentationAPL
    **/
    @JsonProperty("Alexa.Presentation.APL")
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.AlexaPresentationAplInterface getAlexaPresentationAPL() {
        return alexaPresentationAPL;
    }

    /**
     * Get alexaPresentationAPLT
     * @return alexaPresentationAPLT
    **/
    @JsonProperty("Alexa.Presentation.APLT")
    public com.amazon.ask.model.interfaces.alexa.presentation.aplt.AlexaPresentationApltInterface getAlexaPresentationAPLT() {
        return alexaPresentationAPLT;
    }

    /**
     * Get alexaPresentationHTML
     * @return alexaPresentationHTML
    **/
    @JsonProperty("Alexa.Presentation.HTML")
    public com.amazon.ask.model.interfaces.alexa.presentation.html.AlexaPresentationHtmlInterface getAlexaPresentationHTML() {
        return alexaPresentationHTML;
    }

    /**
     * Get audioPlayer
     * @return audioPlayer
    **/
    @JsonProperty("AudioPlayer")
    public com.amazon.ask.model.interfaces.audioplayer.AudioPlayerInterface getAudioPlayer() {
        return audioPlayer;
    }

    /**
     * Get display
     * @return display
    **/
    @JsonProperty("Display")
    public com.amazon.ask.model.interfaces.display.DisplayInterface getDisplay() {
        return display;
    }

    /**
     * Get videoApp
     * @return videoApp
    **/
    @JsonProperty("VideoApp")
    public com.amazon.ask.model.interfaces.videoapp.VideoAppInterface getVideoApp() {
        return videoApp;
    }

    /**
     * Get geolocation
     * @return geolocation
    **/
    @JsonProperty("Geolocation")
    public com.amazon.ask.model.interfaces.geolocation.GeolocationInterface getGeolocation() {
        return geolocation;
    }

    /**
     * Get navigation
     * @return navigation
    **/
    @JsonProperty("Navigation")
    public com.amazon.ask.model.interfaces.navigation.NavigationInterface getNavigation() {
        return navigation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SupportedInterfaces supportedInterfaces = (SupportedInterfaces) o;
        return Objects.equals(this.alexaPresentationAPL, supportedInterfaces.alexaPresentationAPL) &&
            Objects.equals(this.alexaPresentationAPLT, supportedInterfaces.alexaPresentationAPLT) &&
            Objects.equals(this.alexaPresentationHTML, supportedInterfaces.alexaPresentationHTML) &&
            Objects.equals(this.audioPlayer, supportedInterfaces.audioPlayer) &&
            Objects.equals(this.display, supportedInterfaces.display) &&
            Objects.equals(this.videoApp, supportedInterfaces.videoApp) &&
            Objects.equals(this.geolocation, supportedInterfaces.geolocation) &&
            Objects.equals(this.navigation, supportedInterfaces.navigation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alexaPresentationAPL, alexaPresentationAPLT, alexaPresentationHTML, audioPlayer, display, videoApp, geolocation, navigation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupportedInterfaces {\n");
        
        sb.append("    alexaPresentationAPL: ").append(toIndentedString(alexaPresentationAPL)).append("\n");
        sb.append("    alexaPresentationAPLT: ").append(toIndentedString(alexaPresentationAPLT)).append("\n");
        sb.append("    alexaPresentationHTML: ").append(toIndentedString(alexaPresentationHTML)).append("\n");
        sb.append("    audioPlayer: ").append(toIndentedString(audioPlayer)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    videoApp: ").append(toIndentedString(videoApp)).append("\n");
        sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
        sb.append("    navigation: ").append(toIndentedString(navigation)).append("\n");
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
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.AlexaPresentationAplInterface alexaPresentationAPL;
        private com.amazon.ask.model.interfaces.alexa.presentation.aplt.AlexaPresentationApltInterface alexaPresentationAPLT;
        private com.amazon.ask.model.interfaces.alexa.presentation.html.AlexaPresentationHtmlInterface alexaPresentationHTML;
        private com.amazon.ask.model.interfaces.audioplayer.AudioPlayerInterface audioPlayer;
        private com.amazon.ask.model.interfaces.display.DisplayInterface display;
        private com.amazon.ask.model.interfaces.videoapp.VideoAppInterface videoApp;
        private com.amazon.ask.model.interfaces.geolocation.GeolocationInterface geolocation;
        private com.amazon.ask.model.interfaces.navigation.NavigationInterface navigation;

        private Builder() {}

        @JsonProperty("Alexa.Presentation.APL")
        public Builder withAlexaPresentationAPL(com.amazon.ask.model.interfaces.alexa.presentation.apl.AlexaPresentationAplInterface alexaPresentationAPL) {
            this.alexaPresentationAPL = alexaPresentationAPL;
            return this;
        }


        @JsonProperty("Alexa.Presentation.APLT")
        public Builder withAlexaPresentationAPLT(com.amazon.ask.model.interfaces.alexa.presentation.aplt.AlexaPresentationApltInterface alexaPresentationAPLT) {
            this.alexaPresentationAPLT = alexaPresentationAPLT;
            return this;
        }


        @JsonProperty("Alexa.Presentation.HTML")
        public Builder withAlexaPresentationHTML(com.amazon.ask.model.interfaces.alexa.presentation.html.AlexaPresentationHtmlInterface alexaPresentationHTML) {
            this.alexaPresentationHTML = alexaPresentationHTML;
            return this;
        }


        @JsonProperty("AudioPlayer")
        public Builder withAudioPlayer(com.amazon.ask.model.interfaces.audioplayer.AudioPlayerInterface audioPlayer) {
            this.audioPlayer = audioPlayer;
            return this;
        }


        @JsonProperty("Display")
        public Builder withDisplay(com.amazon.ask.model.interfaces.display.DisplayInterface display) {
            this.display = display;
            return this;
        }


        @JsonProperty("VideoApp")
        public Builder withVideoApp(com.amazon.ask.model.interfaces.videoapp.VideoAppInterface videoApp) {
            this.videoApp = videoApp;
            return this;
        }


        @JsonProperty("Geolocation")
        public Builder withGeolocation(com.amazon.ask.model.interfaces.geolocation.GeolocationInterface geolocation) {
            this.geolocation = geolocation;
            return this;
        }


        @JsonProperty("Navigation")
        public Builder withNavigation(com.amazon.ask.model.interfaces.navigation.NavigationInterface navigation) {
            this.navigation = navigation;
            return this;
        }


        public SupportedInterfaces build() {
            return new SupportedInterfaces(this);
        }
    }
}

