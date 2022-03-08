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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HideOverlay Command used by television shopping skill.
 */

@JsonDeserialize(builder = HideOverlayCommand.Builder.class)
public final class HideOverlayCommand extends com.amazon.ask.model.interfaces.alexa.presentation.apl.Command  {

    @JsonProperty("overlayLayoutId")
    private String overlayLayoutId = null;

    @JsonProperty("underlyingLayoutId")
    private String underlyingLayoutId = null;

    @JsonProperty("overlayWidth")
    private String overlayWidth = null;

    @JsonProperty("duration")
    private Integer duration = null;

    public static Builder builder() {
        return new Builder();
    }

    private HideOverlayCommand(Builder builder) {
        String discriminatorValue = "HideOverlay";

        this.type = discriminatorValue;
        if (builder.delay != null) {
            this.delay = builder.delay;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
        if (builder.screenLock != null) {
            this.screenLock = builder.screenLock;
        }
        if (builder.sequencer != null) {
            this.sequencer = builder.sequencer;
        }
        if (builder.when != null) {
            this.when = builder.when;
        }
        if (builder.overlayLayoutId != null) {
            this.overlayLayoutId = builder.overlayLayoutId;
        }
        if (builder.underlyingLayoutId != null) {
            this.underlyingLayoutId = builder.underlyingLayoutId;
        }
        if (builder.overlayWidth != null) {
            this.overlayWidth = builder.overlayWidth;
        }
        if (builder.duration != null) {
            this.duration = builder.duration;
        }
    }

    /**
     * The id of overlay Layout.
     * @return overlayLayoutId
    **/
    @JsonProperty("overlayLayoutId")
    public String getOverlayLayoutId() {
        return overlayLayoutId;
    }


    /**
     * The id of underlying Layout.
     * @return underlyingLayoutId
    **/
    @JsonProperty("underlyingLayoutId")
    public String getUnderlyingLayoutId() {
        return underlyingLayoutId;
    }


    /**
     * The overlay width.
     * @return overlayWidth
    **/
    @JsonProperty("overlayWidth")
    public String getOverlayWidth() {
        return overlayWidth;
    }


    /**
     * The duration of HideOverlay Command.
     * @return duration
    **/
    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HideOverlayCommand interfacesAlexaPresentationAplHideOverlayCommand = (HideOverlayCommand) o;
        return Objects.equals(this.overlayLayoutId, interfacesAlexaPresentationAplHideOverlayCommand.overlayLayoutId) &&
            Objects.equals(this.underlyingLayoutId, interfacesAlexaPresentationAplHideOverlayCommand.underlyingLayoutId) &&
            Objects.equals(this.overlayWidth, interfacesAlexaPresentationAplHideOverlayCommand.overlayWidth) &&
            Objects.equals(this.duration, interfacesAlexaPresentationAplHideOverlayCommand.duration) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(overlayLayoutId, underlyingLayoutId, overlayWidth, duration, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HideOverlayCommand {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    overlayLayoutId: ").append(toIndentedString(overlayLayoutId)).append("\n");
        sb.append("    underlyingLayoutId: ").append(toIndentedString(underlyingLayoutId)).append("\n");
        sb.append("    overlayWidth: ").append(toIndentedString(overlayWidth)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
        private String delay;
        private String description;
        private Boolean screenLock;
        private String sequencer;
        private Boolean when;
        private String overlayLayoutId;
        private String underlyingLayoutId;
        private String overlayWidth;
        private Integer duration;

        private Builder() {}

        @JsonProperty("delay")

        public Builder withDelay(Integer delay) {
            this.delay = String.valueOf(delay);
            return this;
        }

        public Builder withDelay(String delayExpression) {
            this.delay = delayExpression;
            return this;
        }

        @JsonProperty("description")

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        @JsonProperty("screenLock")

        public Builder withScreenLock(Boolean screenLock) {
            this.screenLock = screenLock;
            return this;
        }


        @JsonProperty("sequencer")

        public Builder withSequencer(String sequencer) {
            this.sequencer = sequencer;
            return this;
        }


        @JsonProperty("when")

        public Builder withWhen(Boolean when) {
            this.when = when;
            return this;
        }


        @JsonProperty("overlayLayoutId")

        public Builder withOverlayLayoutId(String overlayLayoutId) {
            this.overlayLayoutId = overlayLayoutId;
            return this;
        }


        @JsonProperty("underlyingLayoutId")

        public Builder withUnderlyingLayoutId(String underlyingLayoutId) {
            this.underlyingLayoutId = underlyingLayoutId;
            return this;
        }


        @JsonProperty("overlayWidth")

        public Builder withOverlayWidth(String overlayWidth) {
            this.overlayWidth = overlayWidth;
            return this;
        }


        @JsonProperty("duration")

        public Builder withDuration(Integer duration) {
            this.duration = duration;
            return this;
        }


        public HideOverlayCommand build() {
            return new HideOverlayCommand(this);
        }
    }
}

