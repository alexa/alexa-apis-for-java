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


package com.amazon.ask.smapi.model.v1.skill;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Contains array which describes steps involved in a build. Elements (or build steps) are added to this array as they become IN_PROGRESS. 
 */

@JsonDeserialize(builder = BuildDetails.Builder.class)
public final class BuildDetails {

    @JsonProperty("steps")
    private List<com.amazon.ask.smapi.model.v1.skill.BuildStep> steps = new ArrayList<com.amazon.ask.smapi.model.v1.skill.BuildStep>();

    public static Builder builder() {
        return new Builder();
    }

    private BuildDetails(Builder builder) {
        if (builder.steps != null) {
            this.steps = builder.steps;
        }
    }

    /**
     * An array where each element represents a build step.
     * @return steps
    **/
    @JsonProperty("steps")
    public List<com.amazon.ask.smapi.model.v1.skill.BuildStep> getSteps() {
        return steps;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BuildDetails v1SkillBuildDetails = (BuildDetails) o;
        return Objects.equals(this.steps, v1SkillBuildDetails.steps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(steps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuildDetails {\n");
        
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.BuildStep> steps;

        private Builder() {}

        @JsonProperty("steps")
        public Builder withSteps(List<com.amazon.ask.smapi.model.v1.skill.BuildStep> steps) {
            this.steps = steps;
            return this;
        }

        public Builder addStepsItem(com.amazon.ask.smapi.model.v1.skill.BuildStep stepsItem) {
            if (this.steps == null) {
                this.steps = new ArrayList<com.amazon.ask.smapi.model.v1.skill.BuildStep>();
            }
            this.steps.add(stepsItem);
            return this;
        }

        public BuildDetails build() {
            return new BuildDetails(this);
        }
    }
}

