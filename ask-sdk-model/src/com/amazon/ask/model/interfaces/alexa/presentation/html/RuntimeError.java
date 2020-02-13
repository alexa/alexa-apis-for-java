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


package com.amazon.ask.model.interfaces.alexa.presentation.html;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RuntimeError
 */

@JsonDeserialize(builder = RuntimeError.Builder.class)
public final class RuntimeError {

    @JsonProperty("reason")
    private com.amazon.ask.model.interfaces.alexa.presentation.html.RuntimeErrorReason reason = null;

    @JsonProperty("message")
    private String message = null;

    @JsonProperty("code")
    private String code = null;

    public static Builder builder() {
        return new Builder();
    }

    private RuntimeError(Builder builder) {
        if (builder.reason != null) {
            this.reason = builder.reason;
        }
        if (builder.message != null) {
            this.message = builder.message;
        }
        if (builder.code != null) {
            this.code = builder.code;
        }
    }

    /**
     * Get reason
     * @return reason
    **/
    @JsonProperty("reason")
    public com.amazon.ask.model.interfaces.alexa.presentation.html.RuntimeErrorReason getReason() {
        return reason;
    }

    /**
     * Details about why the error occurred
     * @return message
    **/
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Error code
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
        RuntimeError interfacesAlexaPresentationHtmlRuntimeError = (RuntimeError) o;
        return Objects.equals(this.reason, interfacesAlexaPresentationHtmlRuntimeError.reason) &&
            Objects.equals(this.message, interfacesAlexaPresentationHtmlRuntimeError.message) &&
            Objects.equals(this.code, interfacesAlexaPresentationHtmlRuntimeError.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, message, code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuntimeError {\n");
        
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
        private com.amazon.ask.model.interfaces.alexa.presentation.html.RuntimeErrorReason reason;
        private String message;
        private String code;

        private Builder() {}

        @JsonProperty("reason")
        public Builder withReason(com.amazon.ask.model.interfaces.alexa.presentation.html.RuntimeErrorReason reason) {
            this.reason = reason;
            return this;
        }


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


        public RuntimeError build() {
            return new RuntimeError(this);
        }
    }
}

