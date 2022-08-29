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


package com.amazon.ask.model.dynamicEndpoints;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Failure skill response for a Dynamic endpoint request.
 */

@JsonDeserialize(builder = FailureResponse.Builder.class)
public final class FailureResponse extends com.amazon.ask.model.dynamicEndpoints.BaseResponse  {

    @JsonProperty("errorCode")
    private String errorCode = null;

    @JsonProperty("errorMessage")
    private String errorMessage = null;

    private FailureResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private FailureResponse(Builder builder) {
        String discriminatorValue = "SkillResponseFailureMessage";

        if (builder.version != null) {
            this.version = builder.version;
        }
        this.type = discriminatorValue;
        if (builder.originalRequestId != null) {
            this.originalRequestId = builder.originalRequestId;
        }
        if (builder.errorCode != null) {
            this.errorCode = builder.errorCode;
        }
        if (builder.errorMessage != null) {
            this.errorMessage = builder.errorMessage;
        }
    }

    /**
     * The error code for the failure. Standard HTTP error codes will be used.
     * @return errorCode
    **/
    @JsonProperty("errorCode")
    public String getErrorCode() {
        return errorCode;
    }


    /**
     * Description of the failure.
     * @return errorMessage
    **/
    @JsonProperty("errorMessage")
    public String getErrorMessage() {
        return errorMessage;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FailureResponse dynamicEndpointsFailureResponse = (FailureResponse) o;
        return Objects.equals(this.errorCode, dynamicEndpointsFailureResponse.errorCode) &&
            Objects.equals(this.errorMessage, dynamicEndpointsFailureResponse.errorMessage) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMessage, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FailureResponse {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
        private String version;
        private String originalRequestId;
        private String errorCode;
        private String errorMessage;

        private Builder() {}

        @JsonProperty("version")

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        @JsonProperty("originalRequestId")

        public Builder withOriginalRequestId(String originalRequestId) {
            this.originalRequestId = originalRequestId;
            return this;
        }


        @JsonProperty("errorCode")

        public Builder withErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }


        @JsonProperty("errorMessage")

        public Builder withErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }


        public FailureResponse build() {
            return new FailureResponse(this);
        }
    }
}

