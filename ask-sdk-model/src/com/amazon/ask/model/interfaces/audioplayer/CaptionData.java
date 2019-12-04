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


package com.amazon.ask.model.interfaces.audioplayer;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CaptionData
 */

@JsonDeserialize(builder = CaptionData.Builder.class)
public final class CaptionData {

    @JsonProperty("content")
    private String content = null;

    @JsonProperty("type")
    private com.amazon.ask.model.interfaces.audioplayer.CaptionType type = null;

    public static Builder builder() {
        return new Builder();
    }

    private CaptionData(Builder builder) {
        if (builder.content != null) {
            this.content = builder.content;
        }
        if (builder.type != null) {
            this.type = builder.type;
        }
    }

    /**
     * This contains the caption text.
     * @return content
    **/
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    /**
     * Type of the caption source.
     * @return type
    **/
    @JsonProperty("type")
    public com.amazon.ask.model.interfaces.audioplayer.CaptionType getType() {
        return type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CaptionData interfacesAudioplayerCaptionData = (CaptionData) o;
        return Objects.equals(this.content, interfacesAudioplayerCaptionData.content) &&
            Objects.equals(this.type, interfacesAudioplayerCaptionData.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaptionData {\n");
        
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
        private String content;
        private com.amazon.ask.model.interfaces.audioplayer.CaptionType type;

        private Builder() {}

        @JsonProperty("content")
        public Builder withContent(String content) {
            this.content = content;
            return this;
        }


        @JsonProperty("type")
        public Builder withType(com.amazon.ask.model.interfaces.audioplayer.CaptionType type) {
            this.type = type;
            return this;
        }


        public CaptionData build() {
            return new CaptionData(this);
        }
    }
}

