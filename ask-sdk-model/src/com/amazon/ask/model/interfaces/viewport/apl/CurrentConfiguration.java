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


package com.amazon.ask.model.interfaces.viewport.apl;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The viewport configuration at the time of the request.
 */

@JsonDeserialize(builder = CurrentConfiguration.Builder.class)
public final class CurrentConfiguration {

    @JsonProperty("mode")
    private com.amazon.ask.model.interfaces.viewport.Mode mode = null;

    @JsonProperty("video")
    private com.amazon.ask.model.interfaces.viewport.ViewportVideo video = null;

    @JsonProperty("size")
    private com.amazon.ask.model.interfaces.viewport.size.ViewportSize size = null;

    public static Builder builder() {
        return new Builder();
    }

    private CurrentConfiguration(Builder builder) {
        if (builder.mode != null) {
            this.mode = builder.mode;
        }
        if (builder.video != null) {
            this.video = builder.video;
        }
        if (builder.size != null) {
            this.size = builder.size;
        }
    }

    /**
     * Get mode
     * @return mode
    **/
    @JsonProperty("mode")
    public com.amazon.ask.model.interfaces.viewport.Mode getMode() {
        return mode;
    }

    /**
     * Get video
     * @return video
    **/
    @JsonProperty("video")
    public com.amazon.ask.model.interfaces.viewport.ViewportVideo getVideo() {
        return video;
    }

    /**
     * Get size
     * @return size
    **/
    @JsonProperty("size")
    public com.amazon.ask.model.interfaces.viewport.size.ViewportSize getSize() {
        return size;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CurrentConfiguration interfacesViewportAplCurrentConfiguration = (CurrentConfiguration) o;
        return Objects.equals(this.mode, interfacesViewportAplCurrentConfiguration.mode) &&
            Objects.equals(this.video, interfacesViewportAplCurrentConfiguration.video) &&
            Objects.equals(this.size, interfacesViewportAplCurrentConfiguration.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, video, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CurrentConfiguration {\n");
        
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    video: ").append(toIndentedString(video)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
        private com.amazon.ask.model.interfaces.viewport.Mode mode;
        private com.amazon.ask.model.interfaces.viewport.ViewportVideo video;
        private com.amazon.ask.model.interfaces.viewport.size.ViewportSize size;

        private Builder() {}

        @JsonProperty("mode")
        public Builder withMode(com.amazon.ask.model.interfaces.viewport.Mode mode) {
            this.mode = mode;
            return this;
        }


        @JsonProperty("video")
        public Builder withVideo(com.amazon.ask.model.interfaces.viewport.ViewportVideo video) {
            this.video = video;
            return this;
        }


        @JsonProperty("size")
        public Builder withSize(com.amazon.ask.model.interfaces.viewport.size.ViewportSize size) {
            this.size = size;
            return this;
        }


        public CurrentConfiguration build() {
            return new CurrentConfiguration(this);
        }
    }
}

