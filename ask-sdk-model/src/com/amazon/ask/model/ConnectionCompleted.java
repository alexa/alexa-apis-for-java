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
 * Represents the status and result needed to resume a skill&#39;s suspended session.
 */

@JsonDeserialize(builder = ConnectionCompleted.Builder.class)
public final class ConnectionCompleted extends com.amazon.ask.model.Cause  {

    @JsonProperty("token")
    private String token = null;

    @JsonProperty("status")
    private com.amazon.ask.model.Status status = null;

    @JsonProperty("result")
    private Object result = null;

    public static Builder builder() {
        return new Builder();
    }

    private ConnectionCompleted(Builder builder) {
        String discriminatorValue = "ConnectionCompleted";

        this.type = discriminatorValue;
        if (builder.token != null) {
            this.token = builder.token;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.result != null) {
            this.result = builder.result;
        }
    }

    /**
     * This is an echo back string that skills send when during Connections.StartConnection directive. They will receive it when they get the SessionResumedRequest. It is never sent to the skill handling the request.
     * @return token
    **/
    @JsonProperty("token")
    public String getToken() {
        return token;
    }


    /**
     * Get status
     * @return status
    **/
    @JsonProperty("status")
    public com.amazon.ask.model.Status getStatus() {
        return status;
    }


    /**
     * This is the result object to resume the skill's suspended session.
     * @return result
    **/
    @JsonProperty("result")
    public Object getResult() {
        return result;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectionCompleted connectionCompleted = (ConnectionCompleted) o;
        return Objects.equals(this.token, connectionCompleted.token) &&
            Objects.equals(this.status, connectionCompleted.status) &&
            Objects.equals(this.result, connectionCompleted.result) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, status, result, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionCompleted {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
        private String token;
        private com.amazon.ask.model.Status status;
        private Object result;

        private Builder() {}

        @JsonProperty("token")

        public Builder withToken(String token) {
            this.token = token;
            return this;
        }


        @JsonProperty("status")

        public Builder withStatus(com.amazon.ask.model.Status status) {
            this.status = status;
            return this;
        }


        @JsonProperty("result")

        public Builder withResult(Object result) {
            this.result = result;
            return this;
        }


        public ConnectionCompleted build() {
            return new ConnectionCompleted(this);
        }
    }
}

