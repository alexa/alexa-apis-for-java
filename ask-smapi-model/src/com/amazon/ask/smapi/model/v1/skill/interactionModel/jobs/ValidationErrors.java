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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * The list of errors.
 */

@JsonDeserialize(builder = ValidationErrors.Builder.class)
public final class ValidationErrors {

    @JsonProperty("errors")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.DynamicUpdateError> errors = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.DynamicUpdateError>();

    public static Builder builder() {
        return new Builder();
    }

    private ValidationErrors(Builder builder) {
        if (builder.errors != null) {
            this.errors = builder.errors;
        }
    }

    /**
     * The list of errors.
     * @return errors
    **/
    @JsonProperty("errors")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.DynamicUpdateError> getErrors() {
        return errors;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValidationErrors v1SkillInteractionModelJobsValidationErrors = (ValidationErrors) o;
        return Objects.equals(this.errors, v1SkillInteractionModelJobsValidationErrors.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidationErrors {\n");
        
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.DynamicUpdateError> errors;

        private Builder() {}

        @JsonProperty("errors")

        public Builder withErrors(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.DynamicUpdateError> errors) {
            this.errors = errors;
            return this;
        }

        public Builder addErrorsItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.DynamicUpdateError errorsItem) {
            if (this.errors == null) {
                this.errors = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.DynamicUpdateError>();
            }
            this.errors.add(errorsItem);
            return this;
        }

        public ValidationErrors build() {
            return new ValidationErrors(this);
        }
    }
}

