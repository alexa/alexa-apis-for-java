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


package com.amazon.ask.model.interfaces.viewport;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * This object contains the characteristics related to the text device&#39;s viewport.
 */

@JsonDeserialize(builder = APLTViewportState.Builder.class)
public final class APLTViewportState extends com.amazon.ask.model.interfaces.viewport.TypedViewportState  {

    @JsonProperty("supportedProfiles")
    private List<com.amazon.ask.model.interfaces.viewport.aplt.ViewportProfile> supportedProfiles = new ArrayList<com.amazon.ask.model.interfaces.viewport.aplt.ViewportProfile>();

    @JsonProperty("lineLength")
    private Integer lineLength = null;

    @JsonProperty("lineCount")
    private Integer lineCount = null;

    @JsonProperty("characterFormat")
    private com.amazon.ask.model.interfaces.viewport.aplt.CharacterFormat characterFormat = null;

    @JsonProperty("interSegments")
    private List<com.amazon.ask.model.interfaces.viewport.aplt.InterSegment> interSegments = new ArrayList<com.amazon.ask.model.interfaces.viewport.aplt.InterSegment>();

    private APLTViewportState() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private APLTViewportState(Builder builder) {
        String discriminatorValue = "APLT";

        if (builder.id != null) {
            this.id = builder.id;
        }
        this.type = discriminatorValue;
        if (builder.supportedProfiles != null) {
            this.supportedProfiles = builder.supportedProfiles;
        }
        if (builder.lineLength != null) {
            this.lineLength = builder.lineLength;
        }
        if (builder.lineCount != null) {
            this.lineCount = builder.lineCount;
        }
        if (builder.characterFormat != null) {
            this.characterFormat = builder.characterFormat;
        }
        if (builder.interSegments != null) {
            this.interSegments = builder.interSegments;
        }
    }

    /**
     * List of profiles that device can emulate.
     * @return supportedProfiles
    **/
    @JsonProperty("supportedProfiles")
    public List<com.amazon.ask.model.interfaces.viewport.aplt.ViewportProfile> getSupportedProfiles() {
        return supportedProfiles;
    }


    /**
     * horizontal dimension of text display in number of characters
     * @return lineLength
    **/
    @JsonProperty("lineLength")
    public Integer getLineLength() {
        return lineLength;
    }


    /**
     * vertical dimension of text display in number of rows
     * @return lineCount
    **/
    @JsonProperty("lineCount")
    public Integer getLineCount() {
        return lineCount;
    }


    /**
     * Get characterFormat
     * @return characterFormat
    **/
    @JsonProperty("characterFormat")
    public com.amazon.ask.model.interfaces.viewport.aplt.CharacterFormat getCharacterFormat() {
        return characterFormat;
    }


    /**
     * list of inter-segment objects
     * @return interSegments
    **/
    @JsonProperty("interSegments")
    public List<com.amazon.ask.model.interfaces.viewport.aplt.InterSegment> getInterSegments() {
        return interSegments;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        APLTViewportState interfacesViewportAPLTViewportState = (APLTViewportState) o;
        return Objects.equals(this.supportedProfiles, interfacesViewportAPLTViewportState.supportedProfiles) &&
            Objects.equals(this.lineLength, interfacesViewportAPLTViewportState.lineLength) &&
            Objects.equals(this.lineCount, interfacesViewportAPLTViewportState.lineCount) &&
            Objects.equals(this.characterFormat, interfacesViewportAPLTViewportState.characterFormat) &&
            Objects.equals(this.interSegments, interfacesViewportAPLTViewportState.interSegments) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportedProfiles, lineLength, lineCount, characterFormat, interSegments, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class APLTViewportState {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    supportedProfiles: ").append(toIndentedString(supportedProfiles)).append("\n");
        sb.append("    lineLength: ").append(toIndentedString(lineLength)).append("\n");
        sb.append("    lineCount: ").append(toIndentedString(lineCount)).append("\n");
        sb.append("    characterFormat: ").append(toIndentedString(characterFormat)).append("\n");
        sb.append("    interSegments: ").append(toIndentedString(interSegments)).append("\n");
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
        private String id;
        private List<com.amazon.ask.model.interfaces.viewport.aplt.ViewportProfile> supportedProfiles;
        private Integer lineLength;
        private Integer lineCount;
        private com.amazon.ask.model.interfaces.viewport.aplt.CharacterFormat characterFormat;
        private List<com.amazon.ask.model.interfaces.viewport.aplt.InterSegment> interSegments;

        private Builder() {}

        @JsonProperty("id")

        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        @JsonProperty("supportedProfiles")

        public Builder withSupportedProfiles(List<com.amazon.ask.model.interfaces.viewport.aplt.ViewportProfile> supportedProfiles) {
            this.supportedProfiles = supportedProfiles;
            return this;
        }

        public Builder addSupportedProfilesItem(com.amazon.ask.model.interfaces.viewport.aplt.ViewportProfile supportedProfilesItem) {
            if (this.supportedProfiles == null) {
                this.supportedProfiles = new ArrayList<com.amazon.ask.model.interfaces.viewport.aplt.ViewportProfile>();
            }
            this.supportedProfiles.add(supportedProfilesItem);
            return this;
        }

        @JsonProperty("lineLength")

        public Builder withLineLength(Integer lineLength) {
            this.lineLength = lineLength;
            return this;
        }


        @JsonProperty("lineCount")

        public Builder withLineCount(Integer lineCount) {
            this.lineCount = lineCount;
            return this;
        }


        @JsonProperty("characterFormat")

        public Builder withCharacterFormat(com.amazon.ask.model.interfaces.viewport.aplt.CharacterFormat characterFormat) {
            this.characterFormat = characterFormat;
            return this;
        }


        @JsonProperty("interSegments")

        public Builder withInterSegments(List<com.amazon.ask.model.interfaces.viewport.aplt.InterSegment> interSegments) {
            this.interSegments = interSegments;
            return this;
        }

        public Builder addInterSegmentsItem(com.amazon.ask.model.interfaces.viewport.aplt.InterSegment interSegmentsItem) {
            if (this.interSegments == null) {
                this.interSegments = new ArrayList<com.amazon.ask.model.interfaces.viewport.aplt.InterSegment>();
            }
            this.interSegments.add(interSegmentsItem);
            return this;
        }

        public APLTViewportState build() {
            return new APLTViewportState(this);
        }
    }
}

