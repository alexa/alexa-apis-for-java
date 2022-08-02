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


package com.amazon.ask.smapi.model.v1.skill.invocations;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SkillExecutionInfo
 */

@JsonDeserialize(builder = SkillExecutionInfo.Builder.class)
public final class SkillExecutionInfo {

    @JsonProperty("invocationRequest")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.invocations.Request> invocationRequest = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.invocations.Request>();

    @JsonProperty("invocationResponse")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.invocations.Response> invocationResponse = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.invocations.Response>();

    @JsonProperty("metrics")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.invocations.Metrics> metrics = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.invocations.Metrics>();

    private SkillExecutionInfo() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SkillExecutionInfo(Builder builder) {
        if (builder.invocationRequest != null) {
            this.invocationRequest = builder.invocationRequest;
        }
        if (builder.invocationResponse != null) {
            this.invocationResponse = builder.invocationResponse;
        }
        if (builder.metrics != null) {
            this.metrics = builder.metrics;
        }
    }

    /**
     * Get invocationRequest
     * @return invocationRequest
    **/
    @JsonProperty("invocationRequest")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.invocations.Request> getInvocationRequest() {
        return invocationRequest;
    }


    /**
     * Get invocationResponse
     * @return invocationResponse
    **/
    @JsonProperty("invocationResponse")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.invocations.Response> getInvocationResponse() {
        return invocationResponse;
    }


    /**
     * Get metrics
     * @return metrics
    **/
    @JsonProperty("metrics")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.invocations.Metrics> getMetrics() {
        return metrics;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillExecutionInfo v1SkillInvocationsSkillExecutionInfo = (SkillExecutionInfo) o;
        return Objects.equals(this.invocationRequest, v1SkillInvocationsSkillExecutionInfo.invocationRequest) &&
            Objects.equals(this.invocationResponse, v1SkillInvocationsSkillExecutionInfo.invocationResponse) &&
            Objects.equals(this.metrics, v1SkillInvocationsSkillExecutionInfo.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invocationRequest, invocationResponse, metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillExecutionInfo {\n");
        
        sb.append("    invocationRequest: ").append(toIndentedString(invocationRequest)).append("\n");
        sb.append("    invocationResponse: ").append(toIndentedString(invocationResponse)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
        private Map<String, com.amazon.ask.smapi.model.v1.skill.invocations.Request> invocationRequest;
        private Map<String, com.amazon.ask.smapi.model.v1.skill.invocations.Response> invocationResponse;
        private Map<String, com.amazon.ask.smapi.model.v1.skill.invocations.Metrics> metrics;

        private Builder() {}

        @JsonProperty("invocationRequest")

        public Builder withInvocationRequest(Map<String, com.amazon.ask.smapi.model.v1.skill.invocations.Request> invocationRequest) {
            this.invocationRequest = invocationRequest;
            return this;
        }

        public Builder putInvocationRequestItem(String key, com.amazon.ask.smapi.model.v1.skill.invocations.Request invocationRequestItem) {
            if (this.invocationRequest == null) {
                this.invocationRequest = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.invocations.Request>();
            }
            this.invocationRequest.put(key, invocationRequestItem);
            return this;
        }

        @JsonProperty("invocationResponse")

        public Builder withInvocationResponse(Map<String, com.amazon.ask.smapi.model.v1.skill.invocations.Response> invocationResponse) {
            this.invocationResponse = invocationResponse;
            return this;
        }

        public Builder putInvocationResponseItem(String key, com.amazon.ask.smapi.model.v1.skill.invocations.Response invocationResponseItem) {
            if (this.invocationResponse == null) {
                this.invocationResponse = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.invocations.Response>();
            }
            this.invocationResponse.put(key, invocationResponseItem);
            return this;
        }

        @JsonProperty("metrics")

        public Builder withMetrics(Map<String, com.amazon.ask.smapi.model.v1.skill.invocations.Metrics> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder putMetricsItem(String key, com.amazon.ask.smapi.model.v1.skill.invocations.Metrics metricsItem) {
            if (this.metrics == null) {
                this.metrics = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.invocations.Metrics>();
            }
            this.metrics.put(key, metricsItem);
            return this;
        }

        public SkillExecutionInfo build() {
            return new SkillExecutionInfo(this);
        }
    }
}

