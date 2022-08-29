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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents that a user made a request to an Alexa skill, but did not provide a specific intent.
 */

@JsonDeserialize(builder = LaunchRequest.Builder.class)
public final class LaunchRequest extends com.amazon.ask.model.Request  {

    @JsonProperty("task")
    private com.amazon.ask.model.Task task = null;

    private LaunchRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private LaunchRequest(Builder builder) {
        String discriminatorValue = "LaunchRequest";

        this.type = discriminatorValue;
        if (builder.requestId != null) {
            this.requestId = builder.requestId;
        }
        if (builder.timestamp != null) {
            this.timestamp = builder.timestamp;
        }
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
        if (builder.task != null) {
            this.task = builder.task;
        }
    }

    /**
     * Get task
     * @return task
    **/
    @JsonProperty("task")
    public com.amazon.ask.model.Task getTask() {
        return task;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LaunchRequest launchRequest = (LaunchRequest) o;
        return Objects.equals(this.task, launchRequest.task) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LaunchRequest {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
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
        private String requestId;
        private OffsetDateTime timestamp;
        private String locale;
        private com.amazon.ask.model.Task task;

        private Builder() {}

        @JsonProperty("requestId")

        public Builder withRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }


        @JsonProperty("timestamp")

        public Builder withTimestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }


        @JsonProperty("locale")

        public Builder withLocale(String locale) {
            this.locale = locale;
            return this;
        }


        @JsonProperty("task")

        public Builder withTask(com.amazon.ask.model.Task task) {
            this.task = task;
            return this;
        }


        public LaunchRequest build() {
            return new LaunchRequest(this);
        }
    }
}

