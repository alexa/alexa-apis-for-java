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


package com.amazon.ask.model.interfaces.customInterfaceController;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Endpoint Event header
 */

@JsonDeserialize(builder = Header.Builder.class)
public final class Header {

    @JsonProperty("namespace")
    private String namespace = null;

    @JsonProperty("name")
    private String name = null;

    private Header() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Header(Builder builder) {
        if (builder.namespace != null) {
            this.namespace = builder.namespace;
        }
        if (builder.name != null) {
            this.name = builder.name;
        }
    }

    /**
     * The developer-defined namespace for the custom interface.
     * @return namespace
    **/
    @JsonProperty("namespace")
    public String getNamespace() {
        return namespace;
    }


    /**
     * The developer-defined name of the custom interface.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Header interfacesCustomInterfaceControllerHeader = (Header) o;
        return Objects.equals(this.namespace, interfacesCustomInterfaceControllerHeader.namespace) &&
            Objects.equals(this.name, interfacesCustomInterfaceControllerHeader.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Header {\n");
        
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
        private String namespace;
        private String name;

        private Builder() {}

        @JsonProperty("namespace")

        public Builder withNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }


        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        public Header build() {
            return new Header(this);
        }
    }
}

