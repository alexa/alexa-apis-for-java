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
public final class StandardizedError extends com.amazon.ask.smapi.model.v1.Error {

    @JsonProperty("validationDetails")
    private com.amazon.ask.smapi.model.v1.skill.ValidationDetails validationDetails = null;

    public static Builder builder() {
        return new Builder();
    }

    private StandardizedError(Builder builder) {
        super(builder);
        if (builder.validationDetails != null) {
            this.validationDetails = builder.validationDetails;
        }
    }

    /**
     * Standardized, machine readable structure that wraps all the information about a specific occurrence of an error of the type specified by the code.
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
        return Objects.equals(this.validationDetails, v1SkillStandardizedError.validationDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validationDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardizedError {\n");
        
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
  
    public static class Builder extends com.amazon.ask.smapi.model.v1.Error.Builder<Builder> {
        private com.amazon.ask.smapi.model.v1.skill.ValidationDetails validationDetails;

        private Builder() {}

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

