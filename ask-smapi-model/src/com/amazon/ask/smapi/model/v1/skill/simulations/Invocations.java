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


package com.amazon.ask.smapi.model.v1.skill.simulations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Invocations
 */

@JsonDeserialize(builder = Invocations.Builder.class)
public final class Invocations {

    @JsonProperty("invocationRequest")
    private com.amazon.ask.smapi.model.v1.skill.simulations.InvocationRequest invocationRequest = null;

    @JsonProperty("invocationResponse")
    private com.amazon.ask.smapi.model.v1.skill.simulations.InvocationResponse invocationResponse = null;

    @JsonProperty("metrics")
    private com.amazon.ask.smapi.model.v1.skill.simulations.Metrics metrics = null;

    public static Builder builder() {
        return new Builder();
    }

    private Invocations(Builder builder) {
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
    public com.amazon.ask.smapi.model.v1.skill.simulations.InvocationRequest getInvocationRequest() {
        return invocationRequest;
    }

    /**
     * Get invocationResponse
     * @return invocationResponse
    **/
    @JsonProperty("invocationResponse")
    public com.amazon.ask.smapi.model.v1.skill.simulations.InvocationResponse getInvocationResponse() {
        return invocationResponse;
    }

    /**
     * Get metrics
     * @return metrics
    **/
    @JsonProperty("metrics")
    public com.amazon.ask.smapi.model.v1.skill.simulations.Metrics getMetrics() {
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
        Invocations v1SkillSimulationsInvocations = (Invocations) o;
        return Objects.equals(this.invocationRequest, v1SkillSimulationsInvocations.invocationRequest) &&
            Objects.equals(this.invocationResponse, v1SkillSimulationsInvocations.invocationResponse) &&
            Objects.equals(this.metrics, v1SkillSimulationsInvocations.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invocationRequest, invocationResponse, metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Invocations {\n");
        
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
        private com.amazon.ask.smapi.model.v1.skill.simulations.InvocationRequest invocationRequest;
        private com.amazon.ask.smapi.model.v1.skill.simulations.InvocationResponse invocationResponse;
        private com.amazon.ask.smapi.model.v1.skill.simulations.Metrics metrics;

        private Builder() {}

        @JsonProperty("invocationRequest")
        public Builder withInvocationRequest(com.amazon.ask.smapi.model.v1.skill.simulations.InvocationRequest invocationRequest) {
            this.invocationRequest = invocationRequest;
            return this;
        }


        @JsonProperty("invocationResponse")
        public Builder withInvocationResponse(com.amazon.ask.smapi.model.v1.skill.simulations.InvocationResponse invocationResponse) {
            this.invocationResponse = invocationResponse;
            return this;
        }


        @JsonProperty("metrics")
        public Builder withMetrics(com.amazon.ask.smapi.model.v1.skill.simulations.Metrics metrics) {
            this.metrics = metrics;
            return this;
        }


        public Invocations build() {
            return new Invocations(this);
        }
    }
}

