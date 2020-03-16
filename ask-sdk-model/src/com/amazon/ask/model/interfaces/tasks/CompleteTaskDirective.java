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


package com.amazon.ask.model.interfaces.tasks;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the directive that a skill can send as part of their response to a session based request. The response will contain the result of the task that the skill is launched for.
 */

@JsonDeserialize(builder = CompleteTaskDirective.Builder.class)
public final class CompleteTaskDirective extends com.amazon.ask.model.Directive  {

    @JsonProperty("status")
    private com.amazon.ask.model.Status status = null;

    @JsonProperty("result")
    private Map<String, Object> result = new HashMap<String, Object>();

    public static Builder builder() {
        return new Builder();
    }

    private CompleteTaskDirective(Builder builder) {
        String discriminatorValue = "Tasks.CompleteTask";

        this.type = discriminatorValue;
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.result != null) {
            this.result = builder.result;
        }
    }

    /**
     * Get status
     * @return status
    **/
    @JsonProperty("status")
    public com.amazon.ask.model.Status getStatus() {
        return status;
    }


    /**
     * This is an object sent to the requester.
     * @return result
    **/
    @JsonProperty("result")
    public Map<String, Object> getResult() {
        return result;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompleteTaskDirective interfacesTasksCompleteTaskDirective = (CompleteTaskDirective) o;
        return Objects.equals(this.status, interfacesTasksCompleteTaskDirective.status) &&
            Objects.equals(this.result, interfacesTasksCompleteTaskDirective.result) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, result, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompleteTaskDirective {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
        private com.amazon.ask.model.Status status;
        private Map<String, Object> result;

        private Builder() {}

        @JsonProperty("status")

        public Builder withStatus(com.amazon.ask.model.Status status) {
            this.status = status;
            return this;
        }


        @JsonProperty("result")

        public Builder withResult(Map<String, Object> result) {
            this.result = result;
            return this;
        }

        public Builder putResultItem(String key, Object resultItem) {
            if (this.result == null) {
                this.result = new HashMap<String, Object>();
            }
            this.result.put(key, resultItem);
            return this;
        }

        public CompleteTaskDirective build() {
            return new CompleteTaskDirective(this);
        }
    }
}

