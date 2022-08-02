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
 * Payload of the connection.
 */

@JsonDeserialize(builder = ConnectionsPayload.Builder.class)
public final class ConnectionsPayload {

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("version")
    private String version = null;

    private ConnectionsPayload() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ConnectionsPayload(Builder builder) {
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.version != null) {
            this.version = builder.version;
        }
    }

    /**
     * Type of the payload.
     * @return type
    **/
    @JsonProperty("type")
    public String getType() {
        return type;
    }


    /**
     * Version of the payload.
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
        ConnectionsPayload v1SkillManifestConnectionsPayload = (ConnectionsPayload) o;
        return Objects.equals(this.type, v1SkillManifestConnectionsPayload.type) &&
            Objects.equals(this.version, v1SkillManifestConnectionsPayload.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionsPayload {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
        private String type;
        private String version;

        private Builder() {}

        @JsonProperty("type")

        public Builder withType(String type) {
            this.type = type;
            return this;
        }


        @JsonProperty("version")

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        public ConnectionsPayload build() {
            return new ConnectionsPayload(this);
        }
    }
}

