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


package com.amazon.ask.smapi.model.v1.skill.nlu.evaluations;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Evaluation
 */

@JsonDeserialize(builder = Evaluation.Builder.class)
public final class Evaluation {

    @JsonProperty("startTimestamp")
    private OffsetDateTime startTimestamp = null;

    @JsonProperty("endTimestamp")
    private OffsetDateTime endTimestamp = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("errorMessage")
    private String errorMessage = null;

    @JsonProperty("inputs")
    private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.EvaluationInputs inputs = null;

    @JsonProperty("id")
    private String id = null;

    public static Builder builder() {
        return new Builder();
    }

    private Evaluation(Builder builder) {
        if (builder.startTimestamp != null) {
            this.startTimestamp = builder.startTimestamp;
        }
        if (builder.endTimestamp != null) {
            this.endTimestamp = builder.endTimestamp;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.errorMessage != null) {
            this.errorMessage = builder.errorMessage;
        }
        if (builder.inputs != null) {
            this.inputs = builder.inputs;
        }
        if (builder.id != null) {
            this.id = builder.id;
        }
    }

    /**
     * Get startTimestamp
     * @return startTimestamp
    **/
    @JsonProperty("startTimestamp")
    public OffsetDateTime getStartTimestamp() {
        return startTimestamp;
    }


    /**
     * Get endTimestamp
     * @return endTimestamp
    **/
    @JsonProperty("endTimestamp")
    public OffsetDateTime getEndTimestamp() {
        return endTimestamp;
    }


    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Status getStatus() {
        return com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Status.fromValue(status);
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
     * Error message when evaluation job fails
     * @return errorMessage
    **/
    @JsonProperty("errorMessage")
    public String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Get inputs
     * @return inputs
    **/
    @JsonProperty("inputs")
    public com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.EvaluationInputs getInputs() {
        return inputs;
    }


    /**
     * id of the job
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Evaluation v1SkillNluEvaluationsEvaluation = (Evaluation) o;
        return Objects.equals(this.startTimestamp, v1SkillNluEvaluationsEvaluation.startTimestamp) &&
            Objects.equals(this.endTimestamp, v1SkillNluEvaluationsEvaluation.endTimestamp) &&
            Objects.equals(this.status, v1SkillNluEvaluationsEvaluation.status) &&
            Objects.equals(this.errorMessage, v1SkillNluEvaluationsEvaluation.errorMessage) &&
            Objects.equals(this.inputs, v1SkillNluEvaluationsEvaluation.inputs) &&
            Objects.equals(this.id, v1SkillNluEvaluationsEvaluation.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTimestamp, endTimestamp, status, errorMessage, inputs, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Evaluation {\n");
        
        sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
        sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
        private OffsetDateTime startTimestamp;
        private OffsetDateTime endTimestamp;
        private String status;
        private String errorMessage;
        private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.EvaluationInputs inputs;
        private String id;

        private Builder() {}

        @JsonProperty("startTimestamp")

        public Builder withStartTimestamp(OffsetDateTime startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }


        @JsonProperty("endTimestamp")

        public Builder withEndTimestamp(OffsetDateTime endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }


        @JsonProperty("status")
        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Status status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("errorMessage")

        public Builder withErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }


        @JsonProperty("inputs")

        public Builder withInputs(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.EvaluationInputs inputs) {
            this.inputs = inputs;
            return this;
        }


        @JsonProperty("id")

        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        public Evaluation build() {
            return new Evaluation(this);
        }
    }
}

