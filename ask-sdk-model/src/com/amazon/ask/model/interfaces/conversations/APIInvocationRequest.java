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


package com.amazon.ask.model.interfaces.conversations;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * APIInvocationRequest
 */

@JsonDeserialize(builder = APIInvocationRequest.Builder.class)
public final class APIInvocationRequest extends com.amazon.ask.model.Request  {

    @JsonProperty("apiRequest")
    private com.amazon.ask.model.interfaces.conversations.APIRequest apiRequest = null;

    private APIInvocationRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private APIInvocationRequest(Builder builder) {
        String discriminatorValue = "Dialog.API.Invoked";

        this.type = discriminatorValue;
        if (builder.requestId != null) {
            this.requestId = builder.requestId;
        }
        if (builder.timestamp != null) {
            this.timestamp = builder.timestamp;
        }
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
        if (builder.apiRequest != null) {
            this.apiRequest = builder.apiRequest;
        }
    }

    /**
     * Get apiRequest
     * @return apiRequest
    **/
    @JsonProperty("apiRequest")
    public com.amazon.ask.model.interfaces.conversations.APIRequest getApiRequest() {
        return apiRequest;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        APIInvocationRequest interfacesConversationsAPIInvocationRequest = (APIInvocationRequest) o;
        return Objects.equals(this.apiRequest, interfacesConversationsAPIInvocationRequest.apiRequest) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiRequest, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class APIInvocationRequest {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    apiRequest: ").append(toIndentedString(apiRequest)).append("\n");
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
        private String requestId;
        private OffsetDateTime timestamp;
        private String locale;
        private com.amazon.ask.model.interfaces.conversations.APIRequest apiRequest;

        private Builder() {}

        @JsonProperty("requestId")

        public Builder withRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }


        @JsonProperty("timestamp")

        public Builder withTimestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }


        @JsonProperty("locale")

        public Builder withLocale(String locale) {
            this.locale = locale;
            return this;
        }


        @JsonProperty("apiRequest")

        public Builder withApiRequest(com.amazon.ask.model.interfaces.conversations.APIRequest apiRequest) {
            this.apiRequest = apiRequest;
            return this;
        }


        public APIInvocationRequest build() {
            return new APIInvocationRequest(this);
        }
    }
}

