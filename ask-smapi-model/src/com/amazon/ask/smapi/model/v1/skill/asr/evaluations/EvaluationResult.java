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


package com.amazon.ask.smapi.model.v1.skill.asr.evaluations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * evaluation detailed result
 */

@JsonDeserialize(builder = EvaluationResult.Builder.class)
public final class EvaluationResult {

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("annotation")
    private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.AnnotationWithAudioAsset annotation = null;

    @JsonProperty("output")
    private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationResultOutput output = null;

    @JsonProperty("error")
    private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.ErrorObject error = null;

    public static Builder builder() {
        return new Builder();
    }

    private EvaluationResult(Builder builder) {
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.annotation != null) {
            this.annotation = builder.annotation;
        }
        if (builder.output != null) {
            this.output = builder.output;
        }
        if (builder.error != null) {
            this.error = builder.error;
        }
    }

    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationResultStatus getStatus() {
        return com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationResultStatus.fromValue(status);
    }

    /**
     * Get the underlying String value for status.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return status as a String value
    **/
    @JsonProperty("status")
    public String getStatusAsString() {
      return status;
    }

    /**
     * Get annotation
     * @return annotation
    **/
    @JsonProperty("annotation")
    public com.amazon.ask.smapi.model.v1.skill.asr.evaluations.AnnotationWithAudioAsset getAnnotation() {
        return annotation;
    }


    /**
     * Get output
     * @return output
    **/
    @JsonProperty("output")
    public com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationResultOutput getOutput() {
        return output;
    }


    /**
     * Get error
     * @return error
    **/
    @JsonProperty("error")
    public com.amazon.ask.smapi.model.v1.skill.asr.evaluations.ErrorObject getError() {
        return error;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EvaluationResult v1SkillAsrEvaluationsEvaluationResult = (EvaluationResult) o;
        return Objects.equals(this.status, v1SkillAsrEvaluationsEvaluationResult.status) &&
            Objects.equals(this.annotation, v1SkillAsrEvaluationsEvaluationResult.annotation) &&
            Objects.equals(this.output, v1SkillAsrEvaluationsEvaluationResult.output) &&
            Objects.equals(this.error, v1SkillAsrEvaluationsEvaluationResult.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, annotation, output, error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationResult {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
        private String status;
        private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.AnnotationWithAudioAsset annotation;
        private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationResultOutput output;
        private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.ErrorObject error;

        private Builder() {}

        @JsonProperty("status")
        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationResultStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("annotation")

        public Builder withAnnotation(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.AnnotationWithAudioAsset annotation) {
            this.annotation = annotation;
            return this;
        }


        @JsonProperty("output")

        public Builder withOutput(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationResultOutput output) {
            this.output = output;
            return this;
        }


        @JsonProperty("error")

        public Builder withError(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.ErrorObject error) {
            this.error = error;
            return this;
        }


        public EvaluationResult build() {
            return new EvaluationResult(this);
        }
    }
}

