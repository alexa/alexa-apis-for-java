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


package com.amazon.ask.smapi.model.v1.skill.experiment;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Configures the metrics that will be captured for the skill experiment. This is required by the system that collects metrics and generates the metric reports. 
 */

@JsonDeserialize(builder = MetricConfiguration.Builder.class)
public final class MetricConfiguration {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("metricTypes")
    private List<com.amazon.ask.smapi.model.v1.skill.experiment.MetricType> metricTypes = new ArrayList<com.amazon.ask.smapi.model.v1.skill.experiment.MetricType>();

    @JsonProperty("expectedChange")
    private String expectedChange = null;

    private MetricConfiguration() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private MetricConfiguration(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.metricTypes != null) {
            this.metricTypes = builder.metricTypes;
        }
        if (builder.expectedChange != null) {
            this.expectedChange = builder.expectedChange;
        }
    }

    /**
     * Unique name that identifies experiment metric.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * List of types that the metric has been assigned.
     * @return metricTypes
    **/
    @JsonProperty("metricTypes")
    public List<com.amazon.ask.smapi.model.v1.skill.experiment.MetricType> getMetricTypes() {
        return metricTypes;
    }


    /**
     * Get expectedChange
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getExpectedChangeAsString().
     *
     * @return expectedChange
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.experiment.MetricChangeDirection getExpectedChange() {
        return com.amazon.ask.smapi.model.v1.skill.experiment.MetricChangeDirection.fromValue(expectedChange);
    }

    /**
     * Get the underlying String value for expectedChange.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return expectedChange as a String value
    **/
    @JsonProperty("expectedChange")
    public String getExpectedChangeAsString() {
      return expectedChange;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricConfiguration v1SkillExperimentMetricConfiguration = (MetricConfiguration) o;
        return Objects.equals(this.name, v1SkillExperimentMetricConfiguration.name) &&
            Objects.equals(this.metricTypes, v1SkillExperimentMetricConfiguration.metricTypes) &&
            Objects.equals(this.expectedChange, v1SkillExperimentMetricConfiguration.expectedChange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, metricTypes, expectedChange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricConfiguration {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    metricTypes: ").append(toIndentedString(metricTypes)).append("\n");
        sb.append("    expectedChange: ").append(toIndentedString(expectedChange)).append("\n");
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
        private String name;
        private List<com.amazon.ask.smapi.model.v1.skill.experiment.MetricType> metricTypes;
        private String expectedChange;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("metricTypes")

        public Builder withMetricTypes(List<com.amazon.ask.smapi.model.v1.skill.experiment.MetricType> metricTypes) {
            this.metricTypes = metricTypes;
            return this;
        }

        public Builder addMetricTypesItem(com.amazon.ask.smapi.model.v1.skill.experiment.MetricType metricTypesItem) {
            if (this.metricTypes == null) {
                this.metricTypes = new ArrayList<com.amazon.ask.smapi.model.v1.skill.experiment.MetricType>();
            }
            this.metricTypes.add(metricTypesItem);
            return this;
        }

        @JsonProperty("expectedChange")

        public Builder withExpectedChange(String expectedChange) {
          this.expectedChange = expectedChange;
          return this;
        }

        public Builder withExpectedChange(com.amazon.ask.smapi.model.v1.skill.experiment.MetricChangeDirection expectedChange) {
            this.expectedChange = expectedChange != null ? expectedChange.toString() : null;
            return this;
        }


        public MetricConfiguration build() {
            return new MetricConfiguration(this);
        }
    }
}

