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
 * EvaluationResultOutput
 */

@JsonDeserialize(builder = EvaluationResultOutput.Builder.class)
public final class EvaluationResultOutput {

    @JsonProperty("transcription")
    private String transcription = null;

    private EvaluationResultOutput() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private EvaluationResultOutput(Builder builder) {
        if (builder.transcription != null) {
            this.transcription = builder.transcription;
        }
    }

    /**
     * actual transcription returned from ASR for the audio
     * @return transcription
    **/
    @JsonProperty("transcription")
    public String getTranscription() {
        return transcription;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EvaluationResultOutput v1SkillAsrEvaluationsEvaluationResultOutput = (EvaluationResultOutput) o;
        return Objects.equals(this.transcription, v1SkillAsrEvaluationsEvaluationResultOutput.transcription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transcription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationResultOutput {\n");
        
        sb.append("    transcription: ").append(toIndentedString(transcription)).append("\n");
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
        private String transcription;

        private Builder() {}

        @JsonProperty("transcription")

        public Builder withTranscription(String transcription) {
            this.transcription = transcription;
            return this;
        }


        public EvaluationResultOutput build() {
            return new EvaluationResultOutput(this);
        }
    }
}

