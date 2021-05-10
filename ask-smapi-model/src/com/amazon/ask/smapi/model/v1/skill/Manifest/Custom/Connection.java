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


package com.amazon.ask.smapi.model.v1.skill.Manifest.Custom;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Skill connection object.
 */

@JsonDeserialize(builder = Connection.Builder.class)
public final class Connection {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("payload")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.ConnectionsPayload payload = null;

    public static Builder builder() {
        return new Builder();
    }

    private Connection(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.payload != null) {
            this.payload = builder.payload;
        }
    }

    /**
     * Name of the connection.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Get payload
     * @return payload
    **/
    @JsonProperty("payload")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.ConnectionsPayload getPayload() {
        return payload;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Connection v1SkillManifestCustomConnection = (Connection) o;
        return Objects.equals(this.name, v1SkillManifestCustomConnection.name) &&
            Objects.equals(this.payload, v1SkillManifestCustomConnection.payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, payload);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Connection {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
        private String name;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.ConnectionsPayload payload;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("payload")

        public Builder withPayload(com.amazon.ask.smapi.model.v1.skill.Manifest.ConnectionsPayload payload) {
            this.payload = payload;
            return this;
        }


        public Connection build() {
            return new Connection(this);
        }
    }
}

