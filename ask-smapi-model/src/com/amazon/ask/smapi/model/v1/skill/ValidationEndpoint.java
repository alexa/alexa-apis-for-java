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
 * Structure representing an endpoint.
 */

@JsonDeserialize(builder = ValidationEndpoint.Builder.class)
public final class ValidationEndpoint {

    @JsonProperty("propertyPath")
    private String propertyPath = null;

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("value")
    private String value = null;

    private ValidationEndpoint() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ValidationEndpoint(Builder builder) {
        if (builder.propertyPath != null) {
            this.propertyPath = builder.propertyPath;
        }
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.value != null) {
            this.value = builder.value;
        }
    }

    /**
     * Path to the endpoint URI in the resource.
     * @return propertyPath
    **/
    @JsonProperty("propertyPath")
    public String getPropertyPath() {
        return propertyPath;
    }


    /**
     * Type of the endpoint (https, http, arn etc).
     * @return type
    **/
    @JsonProperty("type")
    public String getType() {
        return type;
    }


    /**
     * Full URI of the endpoint.
     * @return value
    **/
    @JsonProperty("value")
    public String getValue() {
        return value;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValidationEndpoint v1SkillValidationEndpoint = (ValidationEndpoint) o;
        return Objects.equals(this.propertyPath, v1SkillValidationEndpoint.propertyPath) &&
            Objects.equals(this.type, v1SkillValidationEndpoint.type) &&
            Objects.equals(this.value, v1SkillValidationEndpoint.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyPath, type, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidationEndpoint {\n");
        
        sb.append("    propertyPath: ").append(toIndentedString(propertyPath)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
        private String propertyPath;
        private String type;
        private String value;

        private Builder() {}

        @JsonProperty("propertyPath")

        public Builder withPropertyPath(String propertyPath) {
            this.propertyPath = propertyPath;
            return this;
        }


        @JsonProperty("type")

        public Builder withType(String type) {
            this.type = type;
            return this;
        }


        @JsonProperty("value")

        public Builder withValue(String value) {
            this.value = value;
            return this;
        }


        public ValidationEndpoint build() {
            return new ValidationEndpoint(this);
        }
    }
}

