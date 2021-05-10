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


package com.amazon.ask.smapi.model.v1.skill.Manifest;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Defines the structure for endpoint information.
 */

@JsonDeserialize(builder = VideoRegion.Builder.class)
public final class VideoRegion {

    @JsonProperty("endpoint")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint endpoint = null;

    @JsonProperty("upchannel")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.UpChannelItems> upchannel = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.UpChannelItems>();

    public static Builder builder() {
        return new Builder();
    }

    private VideoRegion(Builder builder) {
        if (builder.endpoint != null) {
            this.endpoint = builder.endpoint;
        }
        if (builder.upchannel != null) {
            this.upchannel = builder.upchannel;
        }
    }

    /**
     * Get endpoint
     * @return endpoint
    **/
    @JsonProperty("endpoint")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint getEndpoint() {
        return endpoint;
    }


    /**
     * The channel through which the partner skill can communicate to Alexa.
     * @return upchannel
    **/
    @JsonProperty("upchannel")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.UpChannelItems> getUpchannel() {
        return upchannel;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoRegion v1SkillManifestVideoRegion = (VideoRegion) o;
        return Objects.equals(this.endpoint, v1SkillManifestVideoRegion.endpoint) &&
            Objects.equals(this.upchannel, v1SkillManifestVideoRegion.upchannel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint, upchannel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoRegion {\n");
        
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    upchannel: ").append(toIndentedString(upchannel)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint endpoint;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.UpChannelItems> upchannel;

        private Builder() {}

        @JsonProperty("endpoint")

        public Builder withEndpoint(com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }


        @JsonProperty("upchannel")

        public Builder withUpchannel(List<com.amazon.ask.smapi.model.v1.skill.Manifest.UpChannelItems> upchannel) {
            this.upchannel = upchannel;
            return this;
        }

        public Builder addUpchannelItem(com.amazon.ask.smapi.model.v1.skill.Manifest.UpChannelItems upchannelItem) {
            if (this.upchannel == null) {
                this.upchannel = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.UpChannelItems>();
            }
            this.upchannel.add(upchannelItem);
            return this;
        }

        public VideoRegion build() {
            return new VideoRegion(this);
        }
    }
}

