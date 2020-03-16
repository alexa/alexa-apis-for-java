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


package com.amazon.ask.model;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Status indicates a high level understanding of the result of an execution.
 */

@JsonDeserialize(builder = Status.Builder.class)
public final class Status {

    @JsonProperty("code")
    private String code = null;

    @JsonProperty("message")
    private String message = null;

    public static Builder builder() {
        return new Builder();
    }

    private Status(Builder builder) {
        if (builder.code != null) {
            this.code = builder.code;
        }
        if (builder.message != null) {
            this.message = builder.message;
        }
    }

    /**
     * This is a code signifying the status of the execution initiated by the skill. Protocol adheres to HTTP status codes.
     * @return code
    **/
    @JsonProperty("code")
    public String getCode() {
        return code;
    }


    /**
     * This is a message that goes along with response code that can provide more information about what occurred.
     * @return message
    **/
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Status status = (Status) o;
        return Objects.equals(this.code, status.code) &&
            Objects.equals(this.message, status.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Status {\n");
        
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

        private Builder() {}

        @JsonProperty("code")

        public Builder withCode(String code) {
            this.code = code;
            return this;
        }


        @JsonProperty("message")

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }


        public Status build() {
            return new Status(this);
        }
    }
}

