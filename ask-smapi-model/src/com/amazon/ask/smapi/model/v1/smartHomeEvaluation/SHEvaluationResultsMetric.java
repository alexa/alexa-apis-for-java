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


package com.amazon.ask.smapi.model.v1.smartHomeEvaluation;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SHEvaluationResultsMetric
 */

@JsonDeserialize(builder = SHEvaluationResultsMetric.Builder.class)
public final class SHEvaluationResultsMetric {

    @JsonProperty("errorTestCases")
    private Integer errorTestCases = null;

    @JsonProperty("failedTestCases")
    private Integer failedTestCases = null;

    @JsonProperty("passedTestCases")
    private Integer passedTestCases = null;

    @JsonProperty("totalTestCases")
    private Integer totalTestCases = null;

    public static Builder builder() {
        return new Builder();
    }

    private SHEvaluationResultsMetric(Builder builder) {
        if (builder.errorTestCases != null) {
            this.errorTestCases = builder.errorTestCases;
        }
        if (builder.failedTestCases != null) {
            this.failedTestCases = builder.failedTestCases;
        }
        if (builder.passedTestCases != null) {
            this.passedTestCases = builder.passedTestCases;
        }
        if (builder.totalTestCases != null) {
            this.totalTestCases = builder.totalTestCases;
        }
    }

    /**
     * Get errorTestCases
     * @return errorTestCases
    **/
    @JsonProperty("errorTestCases")
    public Integer getErrorTestCases() {
        return errorTestCases;
    }


    /**
     * Get failedTestCases
     * @return failedTestCases
    **/
    @JsonProperty("failedTestCases")
    public Integer getFailedTestCases() {
        return failedTestCases;
    }


    /**
     * Get passedTestCases
     * @return passedTestCases
    **/
    @JsonProperty("passedTestCases")
    public Integer getPassedTestCases() {
        return passedTestCases;
    }


    /**
     * Get totalTestCases
     * @return totalTestCases
    **/
    @JsonProperty("totalTestCases")
    public Integer getTotalTestCases() {
        return totalTestCases;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SHEvaluationResultsMetric v1SmartHomeEvaluationSHEvaluationResultsMetric = (SHEvaluationResultsMetric) o;
        return Objects.equals(this.errorTestCases, v1SmartHomeEvaluationSHEvaluationResultsMetric.errorTestCases) &&
            Objects.equals(this.failedTestCases, v1SmartHomeEvaluationSHEvaluationResultsMetric.failedTestCases) &&
            Objects.equals(this.passedTestCases, v1SmartHomeEvaluationSHEvaluationResultsMetric.passedTestCases) &&
            Objects.equals(this.totalTestCases, v1SmartHomeEvaluationSHEvaluationResultsMetric.totalTestCases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorTestCases, failedTestCases, passedTestCases, totalTestCases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SHEvaluationResultsMetric {\n");
        
        sb.append("    errorTestCases: ").append(toIndentedString(errorTestCases)).append("\n");
        sb.append("    failedTestCases: ").append(toIndentedString(failedTestCases)).append("\n");
        sb.append("    passedTestCases: ").append(toIndentedString(passedTestCases)).append("\n");
        sb.append("    totalTestCases: ").append(toIndentedString(totalTestCases)).append("\n");
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
        private Integer errorTestCases;
        private Integer failedTestCases;
        private Integer passedTestCases;
        private Integer totalTestCases;

        private Builder() {}

        @JsonProperty("errorTestCases")

        public Builder withErrorTestCases(Integer errorTestCases) {
            this.errorTestCases = errorTestCases;
            return this;
        }


        @JsonProperty("failedTestCases")

        public Builder withFailedTestCases(Integer failedTestCases) {
            this.failedTestCases = failedTestCases;
            return this;
        }


        @JsonProperty("passedTestCases")

        public Builder withPassedTestCases(Integer passedTestCases) {
            this.passedTestCases = passedTestCases;
            return this;
        }


        @JsonProperty("totalTestCases")

        public Builder withTotalTestCases(Integer totalTestCases) {
            this.totalTestCases = totalTestCases;
            return this;
        }


        public SHEvaluationResultsMetric build() {
            return new SHEvaluationResultsMetric(this);
        }
    }
}

