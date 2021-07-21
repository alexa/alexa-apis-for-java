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
 * SimulationsApiRequest
 */

@JsonDeserialize(builder = SimulationsApiRequest.Builder.class)
public final class SimulationsApiRequest {

    @JsonProperty("input")
    private com.amazon.ask.smapi.model.v1.skill.simulations.Input input = null;

    @JsonProperty("device")
    private com.amazon.ask.smapi.model.v1.skill.simulations.Device device = null;

    @JsonProperty("session")
    private com.amazon.ask.smapi.model.v1.skill.simulations.Session session = null;

    @JsonProperty("simulation")
    private com.amazon.ask.smapi.model.v1.skill.simulations.Simulation simulation = null;

    public static Builder builder() {
        return new Builder();
    }

    private SimulationsApiRequest(Builder builder) {
        if (builder.input != null) {
            this.input = builder.input;
        }
        if (builder.device != null) {
            this.device = builder.device;
        }
        if (builder.session != null) {
            this.session = builder.session;
        }
        if (builder.simulation != null) {
            this.simulation = builder.simulation;
        }
    }

    /**
     * Get input
     * @return input
    **/
    @JsonProperty("input")
    public com.amazon.ask.smapi.model.v1.skill.simulations.Input getInput() {
        return input;
    }


    /**
     * Get device
     * @return device
    **/
    @JsonProperty("device")
    public com.amazon.ask.smapi.model.v1.skill.simulations.Device getDevice() {
        return device;
    }


    /**
     * Get session
     * @return session
    **/
    @JsonProperty("session")
    public com.amazon.ask.smapi.model.v1.skill.simulations.Session getSession() {
        return session;
    }


    /**
     * Get simulation
     * @return simulation
    **/
    @JsonProperty("simulation")
    public com.amazon.ask.smapi.model.v1.skill.simulations.Simulation getSimulation() {
        return simulation;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimulationsApiRequest v1SkillSimulationsSimulationsApiRequest = (SimulationsApiRequest) o;
        return Objects.equals(this.input, v1SkillSimulationsSimulationsApiRequest.input) &&
            Objects.equals(this.device, v1SkillSimulationsSimulationsApiRequest.device) &&
            Objects.equals(this.session, v1SkillSimulationsSimulationsApiRequest.session) &&
            Objects.equals(this.simulation, v1SkillSimulationsSimulationsApiRequest.simulation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, device, session, simulation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimulationsApiRequest {\n");
        
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    session: ").append(toIndentedString(session)).append("\n");
        sb.append("    simulation: ").append(toIndentedString(simulation)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.simulations.Input input;
        private com.amazon.ask.smapi.model.v1.skill.simulations.Device device;
        private com.amazon.ask.smapi.model.v1.skill.simulations.Session session;
        private com.amazon.ask.smapi.model.v1.skill.simulations.Simulation simulation;

        private Builder() {}

        @JsonProperty("input")

        public Builder withInput(com.amazon.ask.smapi.model.v1.skill.simulations.Input input) {
            this.input = input;
            return this;
        }


        @JsonProperty("device")

        public Builder withDevice(com.amazon.ask.smapi.model.v1.skill.simulations.Device device) {
            this.device = device;
            return this;
        }


        @JsonProperty("session")

        public Builder withSession(com.amazon.ask.smapi.model.v1.skill.simulations.Session session) {
            this.session = session;
            return this;
        }


        @JsonProperty("simulation")

        public Builder withSimulation(com.amazon.ask.smapi.model.v1.skill.simulations.Simulation simulation) {
            this.simulation = simulation;
            return this;
        }


        public SimulationsApiRequest build() {
            return new SimulationsApiRequest(this);
        }
    }
}

