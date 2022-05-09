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
 * SimulationsApiResponse
 */

@JsonDeserialize(builder = SimulationsApiResponse.Builder.class)
public final class SimulationsApiResponse {

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("result")
    private com.amazon.ask.smapi.model.v1.skill.simulations.SimulationResult result = null;

    public static Builder builder() {
        return new Builder();
    }

    private SimulationsApiResponse(Builder builder) {
        if (builder.id != null) {
            this.id = builder.id;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.result != null) {
            this.result = builder.result;
        }
    }

    /**
     * Id of the simulation resource.
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }


    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiResponseStatus getStatus() {
        return com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiResponseStatus.fromValue(status);
    }

    /**
     * Get the underlying String value for status.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return status as a String value
    **/
    @JsonProperty("status")
    public String getStatusAsString() {
      return status;
    }

    /**
     * Get result
     * @return result
    **/
    @JsonProperty("result")
    public com.amazon.ask.smapi.model.v1.skill.simulations.SimulationResult getResult() {
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
        SimulationsApiResponse v1SkillSimulationsSimulationsApiResponse = (SimulationsApiResponse) o;
        return Objects.equals(this.id, v1SkillSimulationsSimulationsApiResponse.id) &&
            Objects.equals(this.status, v1SkillSimulationsSimulationsApiResponse.status) &&
            Objects.equals(this.result, v1SkillSimulationsSimulationsApiResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimulationsApiResponse {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
        private String id;
        private String status;
        private com.amazon.ask.smapi.model.v1.skill.simulations.SimulationResult result;

        private Builder() {}

        @JsonProperty("id")

        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        @JsonProperty("status")

        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiResponseStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("result")

        public Builder withResult(com.amazon.ask.smapi.model.v1.skill.simulations.SimulationResult result) {
            this.result = result;
            return this;
        }


        public SimulationsApiResponse build() {
            return new SimulationsApiResponse(this);
        }
    }
}

