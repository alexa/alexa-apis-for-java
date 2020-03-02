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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.type;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * The body of the bad request exception.
 */

@JsonDeserialize(builder = BadRequest.Builder.class)
public final class BadRequest {

    @JsonProperty("errors")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Error> errors = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Error>();

    @JsonProperty("warnings")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Warning> warnings = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Warning>();

    public static Builder builder() {
        return new Builder();
    }

    private BadRequest(Builder builder) {
        if (builder.errors != null) {
            this.errors = builder.errors;
        }
        if (builder.warnings != null) {
            this.warnings = builder.warnings;
        }
    }

    /**
     * Get errors
     * @return errors
    **/
    @JsonProperty("errors")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Error> getErrors() {
        return errors;
    }

    /**
     * Get warnings
     * @return warnings
    **/
    @JsonProperty("warnings")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Warning> getWarnings() {
        return warnings;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BadRequest v1SkillInteractionModelTypeBadRequest = (BadRequest) o;
        return Objects.equals(this.errors, v1SkillInteractionModelTypeBadRequest.errors) &&
            Objects.equals(this.warnings, v1SkillInteractionModelTypeBadRequest.warnings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errors, warnings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BadRequest {\n");
        
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Error> errors;
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Warning> warnings;

        private Builder() {}

        @JsonProperty("errors")
        public Builder withErrors(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Error> errors) {
            this.errors = errors;
            return this;
        }

        public Builder addErrorsItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Error errorsItem) {
            if (this.errors == null) {
                this.errors = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Error>();
            }
            this.errors.add(errorsItem);
            return this;
        }

        @JsonProperty("warnings")
        public Builder withWarnings(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Warning> warnings) {
            this.warnings = warnings;
            return this;
        }

        public Builder addWarningsItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Warning warningsItem) {
            if (this.warnings == null) {
                this.warnings = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Warning>();
            }
            this.warnings.add(warningsItem);
            return this;
        }

        public BadRequest build() {
            return new BadRequest(this);
        }
    }
}

