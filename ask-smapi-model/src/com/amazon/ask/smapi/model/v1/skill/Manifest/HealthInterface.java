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
 * HealthInterface
 */

@JsonDeserialize(builder = HealthInterface.Builder.class)
public final class HealthInterface {

    @JsonProperty("namespace")
    private String namespace = null;

    @JsonProperty("version")
    private String version = null;

    private HealthInterface() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private HealthInterface(Builder builder) {
        if (builder.namespace != null) {
            this.namespace = builder.namespace;
        }
        if (builder.version != null) {
            this.version = builder.version;
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
     * defines the version of skill interface.
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HealthInterface v1SkillManifestHealthInterface = (HealthInterface) o;
        return Objects.equals(this.namespace, v1SkillManifestHealthInterface.namespace) &&
            Objects.equals(this.version, v1SkillManifestHealthInterface.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthInterface {\n");
        
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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


        public HealthInterface build() {
            return new HealthInterface(this);
        }
    }
}

