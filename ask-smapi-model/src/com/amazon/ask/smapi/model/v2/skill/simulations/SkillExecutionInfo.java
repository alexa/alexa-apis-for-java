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


package com.amazon.ask.smapi.model.v2.skill.simulations;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * SkillExecutionInfo
 */

@JsonDeserialize(builder = SkillExecutionInfo.Builder.class)
public final class SkillExecutionInfo {

    @JsonProperty("invocations")
    private List<com.amazon.ask.smapi.model.v2.skill.Invocation> invocations = new ArrayList<com.amazon.ask.smapi.model.v2.skill.Invocation>();

    public static Builder builder() {
        return new Builder();
    }

    private SkillExecutionInfo(Builder builder) {
        if (builder.invocations != null) {
            this.invocations = builder.invocations;
        }
    }

    /**
     * Get invocations
     * @return invocations
    **/
    @JsonProperty("invocations")
    public List<com.amazon.ask.smapi.model.v2.skill.Invocation> getInvocations() {
        return invocations;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillExecutionInfo v2SkillSimulationsSkillExecutionInfo = (SkillExecutionInfo) o;
        return Objects.equals(this.invocations, v2SkillSimulationsSkillExecutionInfo.invocations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invocations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillExecutionInfo {\n");
        
        sb.append("    invocations: ").append(toIndentedString(invocations)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v2.skill.Invocation> invocations;

        private Builder() {}

        @JsonProperty("invocations")

        public Builder withInvocations(List<com.amazon.ask.smapi.model.v2.skill.Invocation> invocations) {
            this.invocations = invocations;
            return this;
        }

        public Builder addInvocationsItem(com.amazon.ask.smapi.model.v2.skill.Invocation invocationsItem) {
            if (this.invocations == null) {
                this.invocations = new ArrayList<com.amazon.ask.smapi.model.v2.skill.Invocation>();
            }
            this.invocations.add(invocationsItem);
            return this;
        }

        public SkillExecutionInfo build() {
            return new SkillExecutionInfo(this);
        }
    }
}

