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
 * Defines the structure for gadget buttons support in the skill manifest.
 */

@JsonDeserialize(builder = ManifestGadgetSupport.Builder.class)
public final class ManifestGadgetSupport {

    @JsonProperty("requirement")
    private String requirement = null;

    @JsonProperty("minGadgetButtons")
    private Integer minGadgetButtons = null;

    @JsonProperty("maxGadgetButtons")
    private Integer maxGadgetButtons = null;

    @JsonProperty("numPlayersMax")
    private Integer numPlayersMax = null;

    @JsonProperty("numPlayersMin")
    private Integer numPlayersMin = null;

    private ManifestGadgetSupport() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ManifestGadgetSupport(Builder builder) {
        if (builder.requirement != null) {
            this.requirement = builder.requirement;
        }
        if (builder.minGadgetButtons != null) {
            this.minGadgetButtons = builder.minGadgetButtons;
        }
        if (builder.maxGadgetButtons != null) {
            this.maxGadgetButtons = builder.maxGadgetButtons;
        }
        if (builder.numPlayersMax != null) {
            this.numPlayersMax = builder.numPlayersMax;
        }
        if (builder.numPlayersMin != null) {
            this.numPlayersMin = builder.numPlayersMin;
        }
    }

    /**
     * Get requirement
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getRequirementAsString().
     *
     * @return requirement
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Manifest.GadgetSupportRequirement getRequirement() {
        return com.amazon.ask.smapi.model.v1.skill.Manifest.GadgetSupportRequirement.fromValue(requirement);
    }

    /**
     * Get the underlying String value for requirement.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return requirement as a String value
    **/
    @JsonProperty("requirement")
    public String getRequirementAsString() {
      return requirement;
    }

    /**
     * Minimum number of gadget buttons required.
     * minimum: 1
     * maximum: 4
     * @return minGadgetButtons
    **/
    @JsonProperty("minGadgetButtons")
    public Integer getMinGadgetButtons() {
        return minGadgetButtons;
    }


    /**
     * Maximum number of gadget buttons required.
     * minimum: 1
     * maximum: 4
     * @return maxGadgetButtons
    **/
    @JsonProperty("maxGadgetButtons")
    public Integer getMaxGadgetButtons() {
        return maxGadgetButtons;
    }


    /**
     * Maximum number of players in the game.
     * minimum: 1
     * @return numPlayersMax
    **/
    @JsonProperty("numPlayersMax")
    public Integer getNumPlayersMax() {
        return numPlayersMax;
    }


    /**
     * Minimum number of players in the game.
     * minimum: 1
     * maximum: 16
     * @return numPlayersMin
    **/
    @JsonProperty("numPlayersMin")
    public Integer getNumPlayersMin() {
        return numPlayersMin;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ManifestGadgetSupport v1SkillManifestManifestGadgetSupport = (ManifestGadgetSupport) o;
        return Objects.equals(this.requirement, v1SkillManifestManifestGadgetSupport.requirement) &&
            Objects.equals(this.minGadgetButtons, v1SkillManifestManifestGadgetSupport.minGadgetButtons) &&
            Objects.equals(this.maxGadgetButtons, v1SkillManifestManifestGadgetSupport.maxGadgetButtons) &&
            Objects.equals(this.numPlayersMax, v1SkillManifestManifestGadgetSupport.numPlayersMax) &&
            Objects.equals(this.numPlayersMin, v1SkillManifestManifestGadgetSupport.numPlayersMin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requirement, minGadgetButtons, maxGadgetButtons, numPlayersMax, numPlayersMin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManifestGadgetSupport {\n");
        
        sb.append("    requirement: ").append(toIndentedString(requirement)).append("\n");
        sb.append("    minGadgetButtons: ").append(toIndentedString(minGadgetButtons)).append("\n");
        sb.append("    maxGadgetButtons: ").append(toIndentedString(maxGadgetButtons)).append("\n");
        sb.append("    numPlayersMax: ").append(toIndentedString(numPlayersMax)).append("\n");
        sb.append("    numPlayersMin: ").append(toIndentedString(numPlayersMin)).append("\n");
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
        private String requirement;
        private Integer minGadgetButtons;
        private Integer maxGadgetButtons;
        private Integer numPlayersMax;
        private Integer numPlayersMin;

        private Builder() {}

        @JsonProperty("requirement")

        public Builder withRequirement(String requirement) {
          this.requirement = requirement;
          return this;
        }

        public Builder withRequirement(com.amazon.ask.smapi.model.v1.skill.Manifest.GadgetSupportRequirement requirement) {
            this.requirement = requirement != null ? requirement.toString() : null;
            return this;
        }


        @JsonProperty("minGadgetButtons")

        public Builder withMinGadgetButtons(Integer minGadgetButtons) {
            this.minGadgetButtons = minGadgetButtons;
            return this;
        }


        @JsonProperty("maxGadgetButtons")

        public Builder withMaxGadgetButtons(Integer maxGadgetButtons) {
            this.maxGadgetButtons = maxGadgetButtons;
            return this;
        }


        @JsonProperty("numPlayersMax")

        public Builder withNumPlayersMax(Integer numPlayersMax) {
            this.numPlayersMax = numPlayersMax;
            return this;
        }


        @JsonProperty("numPlayersMin")

        public Builder withNumPlayersMin(Integer numPlayersMin) {
            this.numPlayersMin = numPlayersMin;
            return this;
        }


        public ManifestGadgetSupport build() {
            return new ManifestGadgetSupport(this);
        }
    }
}

