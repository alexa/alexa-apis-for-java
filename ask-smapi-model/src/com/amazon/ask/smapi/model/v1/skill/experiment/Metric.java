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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the metrics body.
 */

@JsonDeserialize(builder = Metric.Builder.class)
public final class Metric {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("treatmentId")
    private String treatmentId = null;

    @JsonProperty("values")
    private com.amazon.ask.smapi.model.v1.skill.experiment.MetricValues values = null;

    public static Builder builder() {
        return new Builder();
    }

    private Metric(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.treatmentId != null) {
            this.treatmentId = builder.treatmentId;
        }
        if (builder.values != null) {
            this.values = builder.values;
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
     * Get treatmentId
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getTreatmentIdAsString().
     *
     * @return treatmentId
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.experiment.TreatmentId getTreatmentId() {
        return com.amazon.ask.smapi.model.v1.skill.experiment.TreatmentId.fromValue(treatmentId);
    }

    /**
     * Get the underlying String value for treatmentId.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return treatmentId as a String value
    **/
    @JsonProperty("treatmentId")
    public String getTreatmentIdAsString() {
      return treatmentId;
    }

    /**
     * Get values
     * @return values
    **/
    @JsonProperty("values")
    public com.amazon.ask.smapi.model.v1.skill.experiment.MetricValues getValues() {
        return values;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Metric v1SkillExperimentMetric = (Metric) o;
        return Objects.equals(this.name, v1SkillExperimentMetric.name) &&
            Objects.equals(this.treatmentId, v1SkillExperimentMetric.treatmentId) &&
            Objects.equals(this.values, v1SkillExperimentMetric.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, treatmentId, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metric {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    treatmentId: ").append(toIndentedString(treatmentId)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
        private String treatmentId;
        private com.amazon.ask.smapi.model.v1.skill.experiment.MetricValues values;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("treatmentId")
        public Builder withTreatmentId(String treatmentId) {
          this.treatmentId = treatmentId;
          return this;
        }

        public Builder withTreatmentId(com.amazon.ask.smapi.model.v1.skill.experiment.TreatmentId treatmentId) {
            this.treatmentId = treatmentId != null ? treatmentId.toString() : null;
            return this;
        }


        @JsonProperty("values")

        public Builder withValues(com.amazon.ask.smapi.model.v1.skill.experiment.MetricValues values) {
            this.values = values;
            return this;
        }


        public Metric build() {
            return new Metric(this);
        }
    }
}

