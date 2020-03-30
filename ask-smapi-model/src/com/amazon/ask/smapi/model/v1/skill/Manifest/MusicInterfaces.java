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
 * MusicInterfaces
 */

@JsonDeserialize(builder = MusicInterfaces.Builder.class)
public final class MusicInterfaces {

    @JsonProperty("namespace")
    private String namespace = null;

    @JsonProperty("version")
    private String version = null;

    @JsonProperty("requests")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicRequest> requests = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicRequest>();

    public static Builder builder() {
        return new Builder();
    }

    private MusicInterfaces(Builder builder) {
        if (builder.namespace != null) {
            this.namespace = builder.namespace;
        }
        if (builder.version != null) {
            this.version = builder.version;
        }
        if (builder.requests != null) {
            this.requests = builder.requests;
        }
    }

    /**
     * Name of the interface.
     * @return namespace
    **/
    @JsonProperty("namespace")
    public String getNamespace() {
        return namespace;
    }


    /**
     * Version of the interface.
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }


    /**
     * Contains a list of requests/messages that skill can handle.
     * @return requests
    **/
    @JsonProperty("requests")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicRequest> getRequests() {
        return requests;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MusicInterfaces v1SkillManifestMusicInterfaces = (MusicInterfaces) o;
        return Objects.equals(this.namespace, v1SkillManifestMusicInterfaces.namespace) &&
            Objects.equals(this.version, v1SkillManifestMusicInterfaces.version) &&
            Objects.equals(this.requests, v1SkillManifestMusicInterfaces.requests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, version, requests);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MusicInterfaces {\n");
        
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
        private String namespace;
        private String version;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicRequest> requests;

        private Builder() {}

        @JsonProperty("namespace")

        public Builder withNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }


        @JsonProperty("version")

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        @JsonProperty("requests")

        public Builder withRequests(List<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicRequest> requests) {
            this.requests = requests;
            return this;
        }

        public Builder addRequestsItem(com.amazon.ask.smapi.model.v1.skill.Manifest.MusicRequest requestsItem) {
            if (this.requests == null) {
                this.requests = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.MusicRequest>();
            }
            this.requests.add(requestsItem);
            return this;
        }

        public MusicInterfaces build() {
            return new MusicInterfaces(this);
        }
    }
}

