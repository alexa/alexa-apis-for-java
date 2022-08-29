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
 * AudioItem
 */

@JsonDeserialize(builder = AudioItem.Builder.class)
public final class AudioItem {

    @JsonProperty("stream")
    private com.amazon.ask.model.interfaces.audioplayer.Stream stream = null;

    @JsonProperty("metadata")
    private com.amazon.ask.model.interfaces.audioplayer.AudioItemMetadata metadata = null;

    private AudioItem() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private AudioItem(Builder builder) {
        if (builder.stream != null) {
            this.stream = builder.stream;
        }
        if (builder.metadata != null) {
            this.metadata = builder.metadata;
        }
    }

    /**
     * Get stream
     * @return stream
    **/
    @JsonProperty("stream")
    public com.amazon.ask.model.interfaces.audioplayer.Stream getStream() {
        return stream;
    }


    /**
     * Get metadata
     * @return metadata
    **/
    @JsonProperty("metadata")
    public com.amazon.ask.model.interfaces.audioplayer.AudioItemMetadata getMetadata() {
        return metadata;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AudioItem interfacesAudioplayerAudioItem = (AudioItem) o;
        return Objects.equals(this.stream, interfacesAudioplayerAudioItem.stream) &&
            Objects.equals(this.metadata, interfacesAudioplayerAudioItem.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stream, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioItem {\n");
        
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
        private com.amazon.ask.model.interfaces.audioplayer.Stream stream;
        private com.amazon.ask.model.interfaces.audioplayer.AudioItemMetadata metadata;

        private Builder() {}

        @JsonProperty("stream")

        public Builder withStream(com.amazon.ask.model.interfaces.audioplayer.Stream stream) {
            this.stream = stream;
            return this;
        }


        @JsonProperty("metadata")

        public Builder withMetadata(com.amazon.ask.model.interfaces.audioplayer.AudioItemMetadata metadata) {
            this.metadata = metadata;
            return this;
        }


        public AudioItem build() {
            return new AudioItem(this);
        }
    }
}

