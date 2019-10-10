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
 * Details of the technologies which are available for playing video on the device.
 */

@JsonDeserialize(builder = ViewportStateVideo.Builder.class)
public final class ViewportStateVideo {

    @JsonProperty("codecs")
    private List<com.amazon.ask.model.interfaces.viewport.video.Codecs> codecs = new ArrayList<com.amazon.ask.model.interfaces.viewport.video.Codecs>();

    public static Builder builder() {
        return new Builder();
    }

    private ViewportStateVideo(Builder builder) {
        if (builder.codecs != null) {
            this.codecs = builder.codecs;
        }
    }

    /**
     * Codecs which are available for playing video on the device.
     * @return codecs
    **/
    @JsonProperty("codecs")
    public List<com.amazon.ask.model.interfaces.viewport.video.Codecs> getCodecs() {
        return codecs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViewportStateVideo interfacesViewportViewportStateVideo = (ViewportStateVideo) o;
        return Objects.equals(this.codecs, interfacesViewportViewportStateVideo.codecs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codecs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ViewportStateVideo {\n");
        
        sb.append("    codecs: ").append(toIndentedString(codecs)).append("\n");
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
        private List<com.amazon.ask.model.interfaces.viewport.video.Codecs> codecs;

        private Builder() {}

        @JsonProperty("codecs")
        public Builder withCodecs(List<com.amazon.ask.model.interfaces.viewport.video.Codecs> codecs) {
            this.codecs = codecs;
            return this;
        }

        public Builder addCodecsItem(com.amazon.ask.model.interfaces.viewport.video.Codecs codecsItem) {
            if (this.codecs == null) {
                this.codecs = new ArrayList<com.amazon.ask.model.interfaces.viewport.video.Codecs>();
            }
            this.codecs.add(codecsItem);
            return this;
        }

        public ViewportStateVideo build() {
            return new ViewportStateVideo(this);
        }
    }
}

