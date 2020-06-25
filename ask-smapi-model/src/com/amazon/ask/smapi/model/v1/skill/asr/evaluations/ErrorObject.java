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


package com.amazon.ask.smapi.model.v1.skill.asr.evaluations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object containing information about the error occurred during an evaluation run. This filed would present if an unexpected error occurred during an evaluatin run. 
 */

@JsonDeserialize(builder = ErrorObject.Builder.class)
public final class ErrorObject {

    @JsonProperty("message")
    private String message = null;

    @JsonProperty("code")
    private String code = null;

    public static Builder builder() {
        return new Builder();
    }

    private ErrorObject(Builder builder) {
        if (builder.message != null) {
            this.message = builder.message;
        }
        if (builder.code != null) {
            this.code = builder.code;
        }
    }

    /**
     * human-readable error message
     * @return message
    **/
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }


    /**
     * machine-readable error code
     * @return code
    **/
    @JsonProperty("code")
    public String getCode() {
        return code;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorObject v1SkillAsrEvaluationsErrorObject = (ErrorObject) o;
        return Objects.equals(this.message, v1SkillAsrEvaluationsErrorObject.message) &&
            Objects.equals(this.code, v1SkillAsrEvaluationsErrorObject.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorObject {\n");
        
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
        private String code;

        private Builder() {}

        @JsonProperty("message")

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }


        @JsonProperty("code")

        public Builder withCode(String code) {
            this.code = code;
            return this;
        }


        public ErrorObject build() {
            return new ErrorObject(this);
        }
    }
}

