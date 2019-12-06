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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ResponseValidation
 */

@JsonDeserialize(builder = ResponseValidation.Builder.class)
public final class ResponseValidation {

    @JsonProperty("title")
    private String title = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("category")
    private String category = null;

    @JsonProperty("locale")
    private String locale = null;

    @JsonProperty("importance")
    private com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidationImportance importance = null;

    @JsonProperty("status")
    private com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidationStatus status = null;

    public static Builder builder() {
        return new Builder();
    }

    private ResponseValidation(Builder builder) {
        if (builder.title != null) {
            this.title = builder.title;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
        if (builder.category != null) {
            this.category = builder.category;
        }
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
        if (builder.importance != null) {
            this.importance = builder.importance;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
    }

    /**
     * Short, human readable title of the validation performed. 
     * @return title
    **/
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Human readable description of the validation performed. May include instructions to address validation failure. 
     * @return description
    **/
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Dot-delimited category. 
     * @return category
    **/
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    /**
     * Locale of the validation. 
     * @return locale
    **/
    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    /**
     * Get importance
     * @return importance
    **/
    @JsonProperty("importance")
    public com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidationImportance getImportance() {
        return importance;
    }

    /**
     * Get status
     * @return status
    **/
    @JsonProperty("status")
    public com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidationStatus getStatus() {
        return status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseValidation v1SkillValidationsResponseValidation = (ResponseValidation) o;
        return Objects.equals(this.title, v1SkillValidationsResponseValidation.title) &&
            Objects.equals(this.description, v1SkillValidationsResponseValidation.description) &&
            Objects.equals(this.category, v1SkillValidationsResponseValidation.category) &&
            Objects.equals(this.locale, v1SkillValidationsResponseValidation.locale) &&
            Objects.equals(this.importance, v1SkillValidationsResponseValidation.importance) &&
            Objects.equals(this.status, v1SkillValidationsResponseValidation.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, category, locale, importance, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseValidation {\n");
        
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    importance: ").append(toIndentedString(importance)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
        private String title;
        private String description;
        private String category;
        private String locale;
        private com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidationImportance importance;
        private com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidationStatus status;

        private Builder() {}

        @JsonProperty("title")
        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }


        @JsonProperty("description")
        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        @JsonProperty("category")
        public Builder withCategory(String category) {
            this.category = category;
            return this;
        }


        @JsonProperty("locale")
        public Builder withLocale(String locale) {
            this.locale = locale;
            return this;
        }


        @JsonProperty("importance")
        public Builder withImportance(com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidationImportance importance) {
            this.importance = importance;
            return this;
        }


        @JsonProperty("status")
        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidationStatus status) {
            this.status = status;
            return this;
        }


        public ResponseValidation build() {
            return new ResponseValidation(this);
        }
    }
}

