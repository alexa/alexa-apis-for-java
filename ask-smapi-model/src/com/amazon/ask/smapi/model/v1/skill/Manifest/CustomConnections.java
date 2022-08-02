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
 * Supported connections.
 */

@JsonDeserialize(builder = CustomConnections.Builder.class)
public final class CustomConnections {

    @JsonProperty("requires")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.Connection> requires = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.Connection>();

    @JsonProperty("provides")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.Connection> provides = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.Connection>();

    private CustomConnections() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private CustomConnections(Builder builder) {
        if (builder.requires != null) {
            this.requires = builder.requires;
        }
        if (builder.provides != null) {
            this.provides = builder.provides;
        }
    }

    /**
     * List of required connections.
     * @return requires
    **/
    @JsonProperty("requires")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.Connection> getRequires() {
        return requires;
    }


    /**
     * List of provided connections.
     * @return provides
    **/
    @JsonProperty("provides")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.Connection> getProvides() {
        return provides;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomConnections v1SkillManifestCustomConnections = (CustomConnections) o;
        return Objects.equals(this.requires, v1SkillManifestCustomConnections.requires) &&
            Objects.equals(this.provides, v1SkillManifestCustomConnections.provides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requires, provides);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomConnections {\n");
        
        sb.append("    requires: ").append(toIndentedString(requires)).append("\n");
        sb.append("    provides: ").append(toIndentedString(provides)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.Connection> requires;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.Connection> provides;

        private Builder() {}

        @JsonProperty("requires")

        public Builder withRequires(List<com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.Connection> requires) {
            this.requires = requires;
            return this;
        }

        public Builder addRequiresItem(com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.Connection requiresItem) {
            if (this.requires == null) {
                this.requires = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.Connection>();
            }
            this.requires.add(requiresItem);
            return this;
        }

        @JsonProperty("provides")

        public Builder withProvides(List<com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.Connection> provides) {
            this.provides = provides;
            return this;
        }

        public Builder addProvidesItem(com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.Connection providesItem) {
            if (this.provides == null) {
                this.provides = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.Connection>();
            }
            this.provides.add(providesItem);
            return this;
        }

        public CustomConnections build() {
            return new CustomConnections(this);
        }
    }
}

