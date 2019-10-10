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


package com.amazon.ask.model.services.directive;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Header
 */

@JsonDeserialize(builder = Header.Builder.class)
public final class Header {

    @JsonProperty("requestId")
    private String requestId = null;

    public static Builder builder() {
        return new Builder();
    }

    private Header(Builder builder) {
        if (builder.requestId != null) {
            this.requestId = builder.requestId;
        }
    }

    /**
     * This represents the current requestId for what the skill/speechlet was invoked.
     * @return requestId
    **/
    @JsonProperty("requestId")
    public String getRequestId() {
        return requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Header servicesDirectiveHeader = (Header) o;
        return Objects.equals(this.requestId, servicesDirectiveHeader.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Header {\n");
        
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

        private Builder() {}

        @JsonProperty("requestId")
        public Builder withRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }


        public Header build() {
            return new Header(this);
        }
    }
}

