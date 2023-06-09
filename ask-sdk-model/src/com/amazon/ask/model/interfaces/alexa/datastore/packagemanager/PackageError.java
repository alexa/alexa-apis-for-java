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


package com.amazon.ask.model.interfaces.alexa.datastore.packagemanager;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional information about the package installation/update error.
 */

@JsonDeserialize(builder = PackageError.Builder.class)
public final class PackageError {

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("content")
    private Object content = null;

    private PackageError() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private PackageError(Builder builder) {
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.content != null) {
            this.content = builder.content;
        }
    }

    /**
     * Get type
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getTypeAsString().
     *
     * @return type
    **/
    
    public com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.ErrorType getType() {
        return com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.ErrorType.fromValue(type);
    }

    /**
     * Get the underlying String value for type.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return type as a String value
    **/
    @JsonProperty("type")
    public String getTypeAsString() {
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
        PackageError interfacesAlexaDatastorePackagemanagerPackageError = (PackageError) o;
        return Objects.equals(this.type, interfacesAlexaDatastorePackagemanagerPackageError.type) &&
            Objects.equals(this.content, interfacesAlexaDatastorePackagemanagerPackageError.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageError {\n");
        
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

        public Builder withType(com.amazon.ask.model.interfaces.alexa.datastore.packagemanager.ErrorType type) {
            this.type = type != null ? type.toString() : null;
            return this;
        }


        @JsonProperty("content")

        public Builder withContent(Object content) {
            this.content = content;
            return this;
        }


        public PackageError build() {
            return new PackageError(this);
        }
    }
}

