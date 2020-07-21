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
 * Success response for a Dynamic endpoint request.
 */

@JsonDeserialize(builder = SuccessResponse.Builder.class)
public final class SuccessResponse extends com.amazon.ask.model.dynamicEndpoints.BaseResponse  {

    @JsonProperty("responsePayload")
    private String responsePayload = null;

    public static Builder builder() {
        return new Builder();
    }

    private SuccessResponse(Builder builder) {
        String discriminatorValue = "SkillResponseSuccessMessage";

        if (builder.version != null) {
            this.version = builder.version;
        }
        this.type = discriminatorValue;
        if (builder.originalRequestId != null) {
            this.originalRequestId = builder.originalRequestId;
        }
        if (builder.responsePayload != null) {
            this.responsePayload = builder.responsePayload;
        }
    }

    /**
     * The response payload.
     * @return responsePayload
    **/
    @JsonProperty("responsePayload")
    public String getResponsePayload() {
        return responsePayload;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SuccessResponse dynamicEndpointsSuccessResponse = (SuccessResponse) o;
        return Objects.equals(this.responsePayload, dynamicEndpointsSuccessResponse.responsePayload) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responsePayload, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SuccessResponse {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    responsePayload: ").append(toIndentedString(responsePayload)).append("\n");
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
        private String responsePayload;

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


        @JsonProperty("responsePayload")

        public Builder withResponsePayload(String responsePayload) {
            this.responsePayload = responsePayload;
            return this;
        }


        public SuccessResponse build() {
            return new SuccessResponse(this);
        }
    }
}

