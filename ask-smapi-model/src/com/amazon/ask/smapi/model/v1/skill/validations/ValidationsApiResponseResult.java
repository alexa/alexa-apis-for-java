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


package com.amazon.ask.smapi.model.v1.skill.validations;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * ValidationsApiResponseResult
 */

@JsonDeserialize(builder = ValidationsApiResponseResult.Builder.class)
public final class ValidationsApiResponseResult {

    @JsonProperty("validations")
    private List<com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidation> validations = new ArrayList<com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidation>();

    @JsonProperty("error")
    private com.amazon.ask.smapi.model.v1.Error error = null;

    public static Builder builder() {
        return new Builder();
    }

    private ValidationsApiResponseResult(Builder builder) {
        if (builder.validations != null) {
            this.validations = builder.validations;
        }
        if (builder.error != null) {
            this.error = builder.error;
        }
    }

    /**
     * Get validations
     * @return validations
    **/
    @JsonProperty("validations")
    public List<com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidation> getValidations() {
        return validations;
    }


    /**
     * Get error
     * @return error
    **/
    @JsonProperty("error")
    public com.amazon.ask.smapi.model.v1.Error getError() {
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
        ValidationsApiResponseResult v1SkillValidationsValidationsApiResponseResult = (ValidationsApiResponseResult) o;
        return Objects.equals(this.validations, v1SkillValidationsValidationsApiResponseResult.validations) &&
            Objects.equals(this.error, v1SkillValidationsValidationsApiResponseResult.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validations, error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidationsApiResponseResult {\n");
        
        sb.append("    validations: ").append(toIndentedString(validations)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidation> validations;
        private com.amazon.ask.smapi.model.v1.Error error;

        private Builder() {}

        @JsonProperty("validations")

        public Builder withValidations(List<com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidation> validations) {
            this.validations = validations;
            return this;
        }

        public Builder addValidationsItem(com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidation validationsItem) {
            if (this.validations == null) {
                this.validations = new ArrayList<com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidation>();
            }
            this.validations.add(validationsItem);
            return this;
        }

        @JsonProperty("error")

        public Builder withError(com.amazon.ask.smapi.model.v1.Error error) {
            this.error = error;
            return this;
        }


        public ValidationsApiResponseResult build() {
            return new ValidationsApiResponseResult(this);
        }
    }
}

