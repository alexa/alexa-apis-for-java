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


package com.amazon.ask.model.interfaces.alexa.datastore;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Type of error. Modules can also use this event to report global error like permission denied. Supported values [STORAGE_LIMIT_EXCEEDED, PERMISSION_DENIED, VALIDATION_ERROR, DATASTORE_INTERNAL_ERROR]
 */

@JsonDeserialize(builder = Error.Builder.class)
public final class Error {

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("content")
    private Object content = null;

    private Error() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Error(Builder builder) {
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.content != null) {
            this.content = builder.content;
        }
    }

    /**
     * Type of error. Modules can also use this event to report global error like permission denied
     * @return type
    **/
    @JsonProperty("type")
    public String getType() {
        return type;
    }


    /**
     * Opaque payload which will contain additional details about error.
     * @return content
    **/
    @JsonProperty("content")
    public Object getContent() {
        return content;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Error interfacesAlexaDatastoreError = (Error) o;
        return Objects.equals(this.type, interfacesAlexaDatastoreError.type) &&
            Objects.equals(this.content, interfacesAlexaDatastoreError.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Error {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
        private String type;
        private Object content;

        private Builder() {}

        @JsonProperty("type")

        public Builder withType(String type) {
            this.type = type;
            return this;
        }


        @JsonProperty("content")

        public Builder withContent(Object content) {
            this.content = content;
            return this;
        }


        public Error build() {
            return new Error(this);
        }
    }
}

