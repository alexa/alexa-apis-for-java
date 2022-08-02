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
 * Defines the request body for updating the exposure of an experiment.
 */

@JsonDeserialize(builder = UpdateExposureRequest.Builder.class)
public final class UpdateExposureRequest {

    @JsonProperty("exposurePercentage")
    private Integer exposurePercentage = null;

    private UpdateExposureRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private UpdateExposureRequest(Builder builder) {
        if (builder.exposurePercentage != null) {
            this.exposurePercentage = builder.exposurePercentage;
        }
    }

    /**
     * The percentage of unique customers that will be part of the skill experiment while the experiment is running.
     * minimum: 0
     * maximum: 100
     * @return exposurePercentage
    **/
    @JsonProperty("exposurePercentage")
    public Integer getExposurePercentage() {
        return exposurePercentage;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateExposureRequest v1SkillExperimentUpdateExposureRequest = (UpdateExposureRequest) o;
        return Objects.equals(this.exposurePercentage, v1SkillExperimentUpdateExposureRequest.exposurePercentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exposurePercentage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateExposureRequest {\n");
        
        sb.append("    exposurePercentage: ").append(toIndentedString(exposurePercentage)).append("\n");
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
        private Integer exposurePercentage;

        private Builder() {}

        @JsonProperty("exposurePercentage")

        public Builder withExposurePercentage(Integer exposurePercentage) {
            this.exposurePercentage = exposurePercentage;
            return this;
        }


        public UpdateExposureRequest build() {
            return new UpdateExposureRequest(this);
        }
    }
}

