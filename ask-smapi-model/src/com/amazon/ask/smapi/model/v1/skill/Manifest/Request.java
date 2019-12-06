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
 * Request
 */

@JsonDeserialize(builder = Request.Builder.class)
public final class Request {

    @JsonProperty("name")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.RequestName name = null;

    public static Builder builder() {
        return new Builder();
    }

    private Request(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
    }

    /**
     * Get name
     * @return name
    **/
    @JsonProperty("name")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.RequestName getName() {
        return name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Request v1SkillManifestRequest = (Request) o;
        return Objects.equals(this.name, v1SkillManifestRequest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Request {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.Manifest.RequestName name;

        private Builder() {}

        @JsonProperty("name")
        public Builder withName(com.amazon.ask.smapi.model.v1.skill.Manifest.RequestName name) {
            this.name = name;
            return this;
        }


        public Request build() {
            return new Request(this);
        }
    }
}

