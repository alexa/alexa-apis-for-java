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


package com.amazon.ask.smapi.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * InlineResponse400
 */

@JsonDeserialize(builder = InlineResponse400.Builder.class)
public final class InlineResponse400 {

    @JsonProperty("message")
    private String message = null;

    @JsonProperty("violations")
    private List<com.amazon.ask.smapi.model.v1.Error> violations = new ArrayList<com.amazon.ask.smapi.model.v1.Error>();

    public static Builder builder() {
        return new Builder();
    }

    private InlineResponse400(Builder builder) {
        if (builder.message != null) {
            this.message = builder.message;
        }
        if (builder.violations != null) {
            this.violations = builder.violations;
        }
    }

    /**
     * Human readable description of error.
     * @return message
    **/
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }


    /**
     * An array of violation messages.
     * @return violations
    **/
    @JsonProperty("violations")
    public List<com.amazon.ask.smapi.model.v1.Error> getViolations() {
        return violations;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InlineResponse400 inlineResponse400 = (InlineResponse400) o;
        return Objects.equals(this.message, inlineResponse400.message) &&
            Objects.equals(this.violations, inlineResponse400.violations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, violations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse400 {\n");
        
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    violations: ").append(toIndentedString(violations)).append("\n");
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
        private String message;
        private List<com.amazon.ask.smapi.model.v1.Error> violations;

        private Builder() {}

        @JsonProperty("message")

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }


        @JsonProperty("violations")

        public Builder withViolations(List<com.amazon.ask.smapi.model.v1.Error> violations) {
            this.violations = violations;
            return this;
        }

        public Builder addViolationsItem(com.amazon.ask.smapi.model.v1.Error violationsItem) {
            if (this.violations == null) {
                this.violations = new ArrayList<com.amazon.ask.smapi.model.v1.Error>();
            }
            this.violations.add(violationsItem);
            return this;
        }

        public InlineResponse400 build() {
            return new InlineResponse400(this);
        }
    }
}

