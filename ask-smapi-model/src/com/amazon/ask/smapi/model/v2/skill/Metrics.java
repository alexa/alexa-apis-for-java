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


package com.amazon.ask.smapi.model.v2.skill;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metrics
 */

@JsonDeserialize(builder = Metrics.Builder.class)
public final class Metrics {

    @JsonProperty("skillExecutionTimeInMilliseconds")
    private Integer skillExecutionTimeInMilliseconds = null;

    private Metrics() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Metrics(Builder builder) {
        if (builder.skillExecutionTimeInMilliseconds != null) {
            this.skillExecutionTimeInMilliseconds = builder.skillExecutionTimeInMilliseconds;
        }
    }

    /**
     * How long, in milliseconds, it took the skill's Lambda or HTTPS endpoint to process the request. 
     * @return skillExecutionTimeInMilliseconds
    **/
    @JsonProperty("skillExecutionTimeInMilliseconds")
    public Integer getSkillExecutionTimeInMilliseconds() {
        return skillExecutionTimeInMilliseconds;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Metrics v2SkillMetrics = (Metrics) o;
        return Objects.equals(this.skillExecutionTimeInMilliseconds, v2SkillMetrics.skillExecutionTimeInMilliseconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillExecutionTimeInMilliseconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metrics {\n");
        
        sb.append("    skillExecutionTimeInMilliseconds: ").append(toIndentedString(skillExecutionTimeInMilliseconds)).append("\n");
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
        private Integer skillExecutionTimeInMilliseconds;

        private Builder() {}

        @JsonProperty("skillExecutionTimeInMilliseconds")

        public Builder withSkillExecutionTimeInMilliseconds(Integer skillExecutionTimeInMilliseconds) {
            this.skillExecutionTimeInMilliseconds = skillExecutionTimeInMilliseconds;
            return this;
        }


        public Metrics build() {
            return new Metrics(this);
        }
    }
}

