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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvokeSkillRequest
 */

@JsonDeserialize(builder = InvokeSkillRequest.Builder.class)
public final class InvokeSkillRequest {

    @JsonProperty("endpointRegion")
    private String endpointRegion = null;

    @JsonProperty("skillRequest")
    private com.amazon.ask.smapi.model.v1.skill.invocations.SkillRequest skillRequest = null;

    public static Builder builder() {
        return new Builder();
    }

    private InvokeSkillRequest(Builder builder) {
        if (builder.endpointRegion != null) {
            this.endpointRegion = builder.endpointRegion;
        }
        if (builder.skillRequest != null) {
            this.skillRequest = builder.skillRequest;
        }
    }

    /**
     * Get endpointRegion
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getEndpointRegionAsString().
     *
     * @return endpointRegion
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.invocations.EndPointRegions getEndpointRegion() {
        return com.amazon.ask.smapi.model.v1.skill.invocations.EndPointRegions.fromValue(endpointRegion);
    }

    /**
     * Get the underlying String value for endpointRegion.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return endpointRegion as a String value
    **/
    @JsonProperty("endpointRegion")
    public String getEndpointRegionAsString() {
      return endpointRegion;
    }

    /**
     * Get skillRequest
     * @return skillRequest
    **/
    @JsonProperty("skillRequest")
    public com.amazon.ask.smapi.model.v1.skill.invocations.SkillRequest getSkillRequest() {
        return skillRequest;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvokeSkillRequest v1SkillInvocationsInvokeSkillRequest = (InvokeSkillRequest) o;
        return Objects.equals(this.endpointRegion, v1SkillInvocationsInvokeSkillRequest.endpointRegion) &&
            Objects.equals(this.skillRequest, v1SkillInvocationsInvokeSkillRequest.skillRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointRegion, skillRequest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvokeSkillRequest {\n");
        
        sb.append("    endpointRegion: ").append(toIndentedString(endpointRegion)).append("\n");
        sb.append("    skillRequest: ").append(toIndentedString(skillRequest)).append("\n");
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
        private String endpointRegion;
        private com.amazon.ask.smapi.model.v1.skill.invocations.SkillRequest skillRequest;

        private Builder() {}

        @JsonProperty("endpointRegion")

        public Builder withEndpointRegion(String endpointRegion) {
          this.endpointRegion = endpointRegion;
          return this;
        }

        public Builder withEndpointRegion(com.amazon.ask.smapi.model.v1.skill.invocations.EndPointRegions endpointRegion) {
            this.endpointRegion = endpointRegion != null ? endpointRegion.toString() : null;
            return this;
        }


        @JsonProperty("skillRequest")

        public Builder withSkillRequest(com.amazon.ask.smapi.model.v1.skill.invocations.SkillRequest skillRequest) {
            this.skillRequest = skillRequest;
            return this;
        }


        public InvokeSkillRequest build() {
            return new InvokeSkillRequest(this);
        }
    }
}

