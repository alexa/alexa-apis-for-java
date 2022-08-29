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


package com.amazon.ask.model;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object encapsulates a specific functionality.
 */

@JsonDeserialize(builder = Task.Builder.class)
public final class Task {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("version")
    private String version = null;

    @JsonProperty("input")
    private Object input = null;

    private Task() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Task(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.version != null) {
            this.version = builder.version;
        }
        if (builder.input != null) {
            this.input = builder.input;
        }
    }

    /**
     * Represents the name of the task.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Represents the version of the task.
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }


    /**
     * Represents the input to handle the task.
     * @return input
    **/
    @JsonProperty("input")
    public Object getInput() {
        return input;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task task = (Task) o;
        return Objects.equals(this.name, task.name) &&
            Objects.equals(this.version, task.version) &&
            Objects.equals(this.input, task.input);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version, input);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Task {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
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
        private String version;
        private Object input;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("version")

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        @JsonProperty("input")

        public Builder withInput(Object input) {
            this.input = input;
            return this;
        }


        public Task build() {
            return new Task(this);
        }
    }
}

