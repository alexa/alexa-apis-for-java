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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a request to automatically initialize an extension by a runtime.
 */

@JsonDeserialize(builder = ExtensionInitializationRequest.Builder.class)
public final class ExtensionInitializationRequest {

    @JsonProperty("uri")
    private String uri = null;

    @JsonProperty("settings")
    private Object settings = null;

    public static Builder builder() {
        return new Builder();
    }

    private ExtensionInitializationRequest(Builder builder) {
        if (builder.uri != null) {
            this.uri = builder.uri;
        }
        if (builder.settings != null) {
            this.settings = builder.settings;
        }
    }

    /**
     * The extension's URI.
     * @return uri
    **/
    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }


    /**
     * Default initialization extension settings.
     * @return settings
    **/
    @JsonProperty("settings")
    public Object getSettings() {
        return settings;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtensionInitializationRequest v1SkillManifestExtensionInitializationRequest = (ExtensionInitializationRequest) o;
        return Objects.equals(this.uri, v1SkillManifestExtensionInitializationRequest.uri) &&
            Objects.equals(this.settings, v1SkillManifestExtensionInitializationRequest.settings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri, settings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionInitializationRequest {\n");
        
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
        private String uri;
        private Object settings;

        private Builder() {}

        @JsonProperty("uri")

        public Builder withUri(String uri) {
            this.uri = uri;
            return this;
        }


        @JsonProperty("settings")

        public Builder withSettings(Object settings) {
            this.settings = settings;
            return this;
        }


        public ExtensionInitializationRequest build() {
            return new ExtensionInitializationRequest(this);
        }
    }
}

