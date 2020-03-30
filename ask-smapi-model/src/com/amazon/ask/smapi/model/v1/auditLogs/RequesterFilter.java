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


package com.amazon.ask.smapi.model.v1.auditLogs;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Filter for the requester of the operation.
 */

@JsonDeserialize(builder = RequesterFilter.Builder.class)
public final class RequesterFilter {

    @JsonProperty("userId")
    private String userId = null;

    public static Builder builder() {
        return new Builder();
    }

    private RequesterFilter(Builder builder) {
        if (builder.userId != null) {
            this.userId = builder.userId;
        }
    }

    /**
     * LoginWithAmazon User ID.
     * @return userId
    **/
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RequesterFilter v1AuditLogsRequesterFilter = (RequesterFilter) o;
        return Objects.equals(this.userId, v1AuditLogsRequesterFilter.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequesterFilter {\n");
        
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
        private String userId;

        private Builder() {}

        @JsonProperty("userId")

        public Builder withUserId(String userId) {
            this.userId = userId;
            return this;
        }


        public RequesterFilter build() {
            return new RequesterFilter(this);
        }
    }
}

