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


package com.amazon.ask.smapi.model.v1.skill;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Standardized structure which wraps machine parsable and human readable information about an error.
 */

@JsonDeserialize(builder = StandardizedError.Builder.class)
public final class StandardizedError {

    @JsonProperty("code")
    private String code = null;

    @JsonProperty("message")
    private String message = null;

    @JsonProperty("validationDetails")
    private com.amazon.ask.smapi.model.v1.skill.ValidationDetails validationDetails = null;

    public static Builder builder() {
        return new Builder();
    }

    private StandardizedError(Builder builder) {
        if (builder.code != null) {
            this.code = builder.code;
        }
        if (builder.message != null) {
            this.message = builder.message;
        }
        if (builder.validationDetails != null) {
            this.validationDetails = builder.validationDetails;
        }
    }

    /**
     * Standardized structure which wraps machine parsable and human readable information about an error.
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getCodeAsString().
     *
     * @return code
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.StandardizedErrorCode getCode() {
        return com.amazon.ask.smapi.model.v1.skill.StandardizedErrorCode.fromValue(code);
    }

    /**
     * Get the underlying String value for code.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return code as a String value
    **/
    @JsonProperty("code")
    public String getCodeAsString() {
      return code;
    }

    /**
     * A standardized, human readable message generated from the error code and validation details in ViolationStructure by the AskStandardizedErrorUtil library.
     * @return message
    **/
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }


    /**
     * Get validationDetails
     * @return validationDetails
    **/
    @JsonProperty("validationDetails")
    public com.amazon.ask.smapi.model.v1.skill.ValidationDetails getValidationDetails() {
        return validationDetails;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StandardizedError v1SkillStandardizedError = (StandardizedError) o;
        return Objects.equals(this.code, v1SkillStandardizedError.code) &&
            Objects.equals(this.message, v1SkillStandardizedError.message) &&
            Objects.equals(this.validationDetails, v1SkillStandardizedError.validationDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, validationDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardizedError {\n");
        
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    validationDetails: ").append(toIndentedString(validationDetails)).append("\n");
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
        private String code;
        private String message;
        private com.amazon.ask.smapi.model.v1.skill.ValidationDetails validationDetails;

        private Builder() {}

        @JsonProperty("code")
        public Builder withCode(String code) {
          this.code = code;
          return this;
        }

        public Builder withCode(com.amazon.ask.smapi.model.v1.skill.StandardizedErrorCode code) {
            this.code = code != null ? code.toString() : null;
            return this;
        }


        @JsonProperty("message")

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }


        @JsonProperty("validationDetails")

        public Builder withValidationDetails(com.amazon.ask.smapi.model.v1.skill.ValidationDetails validationDetails) {
            this.validationDetails = validationDetails;
            return this;
        }


        public StandardizedError build() {
            return new StandardizedError(this);
        }
    }
}

