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
 * AlexaForBusinessInterface
 */

@JsonDeserialize(builder = AlexaForBusinessInterface.Builder.class)
public final class AlexaForBusinessInterface {

    @JsonProperty("namespace")
    private String namespace = null;

    @JsonProperty("version")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.Version version = null;

    @JsonProperty("requests")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.Request> requests = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.Request>();

    public static Builder builder() {
        return new Builder();
    }

    private AlexaForBusinessInterface(Builder builder) {
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
     * Get version
     * @return version
    **/
    @JsonProperty("version")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.Version getVersion() {
        return version;
    }

    /**
     * Contains a list of requests/messages that skill can handle.
     * @return requests
    **/
    @JsonProperty("requests")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.Request> getRequests() {
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
        AlexaForBusinessInterface v1SkillManifestAlexaForBusinessInterface = (AlexaForBusinessInterface) o;
        return Objects.equals(this.namespace, v1SkillManifestAlexaForBusinessInterface.namespace) &&
            Objects.equals(this.version, v1SkillManifestAlexaForBusinessInterface.version) &&
            Objects.equals(this.requests, v1SkillManifestAlexaForBusinessInterface.requests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, version, requests);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlexaForBusinessInterface {\n");
        
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
        private com.amazon.ask.smapi.model.v1.skill.Manifest.Version version;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.Request> requests;

        private Builder() {}

        @JsonProperty("namespace")
        public Builder withNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }


        @JsonProperty("version")
        public Builder withVersion(com.amazon.ask.smapi.model.v1.skill.Manifest.Version version) {
            this.version = version;
            return this;
        }


        @JsonProperty("requests")
        public Builder withRequests(List<com.amazon.ask.smapi.model.v1.skill.Manifest.Request> requests) {
            this.requests = requests;
            return this;
        }

        public Builder addRequestsItem(com.amazon.ask.smapi.model.v1.skill.Manifest.Request requestsItem) {
            if (this.requests == null) {
                this.requests = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.Request>();
            }
            this.requests.add(requestsItem);
            return this;
        }

        public AlexaForBusinessInterface build() {
            return new AlexaForBusinessInterface(this);
        }
    }
}

