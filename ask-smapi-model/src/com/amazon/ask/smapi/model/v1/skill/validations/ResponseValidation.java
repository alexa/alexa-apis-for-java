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
    private String importance = null;

    @JsonProperty("status")
    private String status = null;

    private ResponseValidation() {
    }

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
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getImportanceAsString().
     *
     * @return importance
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidationImportance getImportance() {
        return com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidationImportance.fromValue(importance);
    }

    /**
     * Get the underlying String value for importance.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return importance as a String value
    **/
    @JsonProperty("importance")
    public String getImportanceAsString() {
      return importance;
    }

    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidationStatus getStatus() {
        return com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidationStatus.fromValue(status);
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
        private String importance;
        private String status;

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

        public Builder withImportance(String importance) {
          this.importance = importance;
          return this;
        }

        public Builder withImportance(com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidationImportance importance) {
            this.importance = importance != null ? importance.toString() : null;
            return this;
        }


        @JsonProperty("status")

        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.validations.ResponseValidationStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        public ResponseValidation build() {
            return new ResponseValidation(this);
        }
    }
}

