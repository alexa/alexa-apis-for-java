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
 * Defines the body of the metric result values.
 */

@JsonDeserialize(builder = MetricValues.Builder.class)
public final class MetricValues {

    @JsonProperty("mean")
    private Double mean = null;

    @JsonProperty("percentDiff")
    private Double percentDiff = null;

    @JsonProperty("confidenceIntervalLower")
    private Double confidenceIntervalLower = null;

    @JsonProperty("confidenceIntervalUpper")
    private Double confidenceIntervalUpper = null;

    @JsonProperty("pValue")
    private Double pValue = null;

    @JsonProperty("userCount")
    private Long userCount = null;

    public static Builder builder() {
        return new Builder();
    }

    private MetricValues(Builder builder) {
        if (builder.mean != null) {
            this.mean = builder.mean;
        }
        if (builder.percentDiff != null) {
            this.percentDiff = builder.percentDiff;
        }
        if (builder.confidenceIntervalLower != null) {
            this.confidenceIntervalLower = builder.confidenceIntervalLower;
        }
        if (builder.confidenceIntervalUpper != null) {
            this.confidenceIntervalUpper = builder.confidenceIntervalUpper;
        }
        if (builder.pValue != null) {
            this.pValue = builder.pValue;
        }
        if (builder.userCount != null) {
            this.userCount = builder.userCount;
        }
    }

    /**
     * The mean (average) of each sample (T1 or C group).
     * @return mean
    **/
    @JsonProperty("mean")
    public Double getMean() {
        return mean;
    }


    /**
     * The relative percent difference between the mean of the T1 group and the mean of the C group.
     * @return percentDiff
    **/
    @JsonProperty("percentDiff")
    public Double getPercentDiff() {
        return percentDiff;
    }


    /**
     * The lower limit number of the confidence interval range. Confidence interval measures the probability that the mean falls within a range. 
     * @return confidenceIntervalLower
    **/
    @JsonProperty("confidenceIntervalLower")
    public Double getConfidenceIntervalLower() {
        return confidenceIntervalLower;
    }


    /**
     * The upper limit number of the confidence interval range.
     * @return confidenceIntervalUpper
    **/
    @JsonProperty("confidenceIntervalUpper")
    public Double getConfidenceIntervalUpper() {
        return confidenceIntervalUpper;
    }


    /**
     * The probability that the difference between the two means (from T1 and C) is due to random sampling error.
     * @return pValue
    **/
    @JsonProperty("pValue")
    public Double getPValue() {
        return pValue;
    }


    /**
     * Count of users in the treatment sample.
     * @return userCount
    **/
    @JsonProperty("userCount")
    public Long getUserCount() {
        return userCount;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricValues v1SkillExperimentMetricValues = (MetricValues) o;
        return Objects.equals(this.mean, v1SkillExperimentMetricValues.mean) &&
            Objects.equals(this.percentDiff, v1SkillExperimentMetricValues.percentDiff) &&
            Objects.equals(this.confidenceIntervalLower, v1SkillExperimentMetricValues.confidenceIntervalLower) &&
            Objects.equals(this.confidenceIntervalUpper, v1SkillExperimentMetricValues.confidenceIntervalUpper) &&
            Objects.equals(this.pValue, v1SkillExperimentMetricValues.pValue) &&
            Objects.equals(this.userCount, v1SkillExperimentMetricValues.userCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mean, percentDiff, confidenceIntervalLower, confidenceIntervalUpper, pValue, userCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricValues {\n");
        
        sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
        sb.append("    percentDiff: ").append(toIndentedString(percentDiff)).append("\n");
        sb.append("    confidenceIntervalLower: ").append(toIndentedString(confidenceIntervalLower)).append("\n");
        sb.append("    confidenceIntervalUpper: ").append(toIndentedString(confidenceIntervalUpper)).append("\n");
        sb.append("    pValue: ").append(toIndentedString(pValue)).append("\n");
        sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
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
        private Double mean;
        private Double percentDiff;
        private Double confidenceIntervalLower;
        private Double confidenceIntervalUpper;
        private Double pValue;
        private Long userCount;

        private Builder() {}

        @JsonProperty("mean")

        public Builder withMean(Double mean) {
            this.mean = mean;
            return this;
        }


        @JsonProperty("percentDiff")

        public Builder withPercentDiff(Double percentDiff) {
            this.percentDiff = percentDiff;
            return this;
        }


        @JsonProperty("confidenceIntervalLower")

        public Builder withConfidenceIntervalLower(Double confidenceIntervalLower) {
            this.confidenceIntervalLower = confidenceIntervalLower;
            return this;
        }


        @JsonProperty("confidenceIntervalUpper")

        public Builder withConfidenceIntervalUpper(Double confidenceIntervalUpper) {
            this.confidenceIntervalUpper = confidenceIntervalUpper;
            return this;
        }


        @JsonProperty("pValue")

        public Builder withPValue(Double pValue) {
            this.pValue = pValue;
            return this;
        }


        @JsonProperty("userCount")

        public Builder withUserCount(Long userCount) {
            this.userCount = userCount;
            return this;
        }


        public MetricValues build() {
            return new MetricValues(this);
        }
    }
}

