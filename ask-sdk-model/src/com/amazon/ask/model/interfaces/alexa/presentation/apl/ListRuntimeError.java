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


package com.amazon.ask.model.interfaces.alexa.presentation.apl;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Reports an error with list functionality.
 */

@JsonDeserialize(builder = ListRuntimeError.Builder.class)
public final class ListRuntimeError extends com.amazon.ask.model.interfaces.alexa.presentation.apl.RuntimeError  {

    @JsonProperty("reason")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.ListRuntimeErrorReason reason = null;

    @JsonProperty("listId")
    private String listId = null;

    @JsonProperty("listVersion")
    private Integer listVersion = null;

    @JsonProperty("operationIndex")
    private Integer operationIndex = null;

    public static Builder builder() {
        return new Builder();
    }

    private ListRuntimeError(Builder builder) {
        String discriminatorValue = "LIST_ERROR";

        this.type = discriminatorValue;
        if (builder.message != null) {
            this.message = builder.message;
        }
        if (builder.token != null) {
            this.token = builder.token;
        }
        if (builder.reason != null) {
            this.reason = builder.reason;
        }
        if (builder.listId != null) {
            this.listId = builder.listId;
        }
        if (builder.listVersion != null) {
            this.listVersion = builder.listVersion;
        }
        if (builder.operationIndex != null) {
            this.operationIndex = builder.operationIndex;
        }
    }

    /**
     * Get reason
     * @return reason
    **/
    @JsonProperty("reason")
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.ListRuntimeErrorReason getReason() {
        return reason;
    }


    /**
     * The identifier of the list in which the error occurred.
     * @return listId
    **/
    @JsonProperty("listId")
    public String getListId() {
        return listId;
    }


    /**
     * The listVersion in which the error occurred.
     * @return listVersion
    **/
    @JsonProperty("listVersion")
    public Integer getListVersion() {
        return listVersion;
    }


    /**
     * The index of the operation which caused the error (if known)
     * @return operationIndex
    **/
    @JsonProperty("operationIndex")
    public Integer getOperationIndex() {
        return operationIndex;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRuntimeError interfacesAlexaPresentationAplListRuntimeError = (ListRuntimeError) o;
        return Objects.equals(this.reason, interfacesAlexaPresentationAplListRuntimeError.reason) &&
            Objects.equals(this.listId, interfacesAlexaPresentationAplListRuntimeError.listId) &&
            Objects.equals(this.listVersion, interfacesAlexaPresentationAplListRuntimeError.listVersion) &&
            Objects.equals(this.operationIndex, interfacesAlexaPresentationAplListRuntimeError.operationIndex) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, listId, listVersion, operationIndex, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRuntimeError {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
        sb.append("    listVersion: ").append(toIndentedString(listVersion)).append("\n");
        sb.append("    operationIndex: ").append(toIndentedString(operationIndex)).append("\n");
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
        private String token;
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.ListRuntimeErrorReason reason;
        private String listId;
        private Integer listVersion;
        private Integer operationIndex;

        private Builder() {}

        @JsonProperty("message")

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }


        @JsonProperty("token")

        public Builder withToken(String token) {
            this.token = token;
            return this;
        }


        @JsonProperty("reason")

        public Builder withReason(com.amazon.ask.model.interfaces.alexa.presentation.apl.ListRuntimeErrorReason reason) {
            this.reason = reason;
            return this;
        }


        @JsonProperty("listId")

        public Builder withListId(String listId) {
            this.listId = listId;
            return this;
        }


        @JsonProperty("listVersion")

        public Builder withListVersion(Integer listVersion) {
            this.listVersion = listVersion;
            return this;
        }


        @JsonProperty("operationIndex")

        public Builder withOperationIndex(Integer operationIndex) {
            this.operationIndex = operationIndex;
            return this;
        }


        public ListRuntimeError build() {
            return new ListRuntimeError(this);
        }
    }
}

