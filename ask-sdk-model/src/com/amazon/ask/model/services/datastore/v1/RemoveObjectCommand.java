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


package com.amazon.ask.model.services.datastore.v1;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deletes an existing object. If the object doesn&#39;t exist, this command succeeds without any change.
 */

@JsonDeserialize(builder = RemoveObjectCommand.Builder.class)
public final class RemoveObjectCommand extends com.amazon.ask.model.services.datastore.v1.Command  {

    @JsonProperty("namespace")
    private String namespace = null;

    @JsonProperty("key")
    private String key = null;

    private RemoveObjectCommand() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private RemoveObjectCommand(Builder builder) {
        String discriminatorValue = "REMOVE_OBJECT";

        this.type = discriminatorValue;
        if (builder.namespace != null) {
            this.namespace = builder.namespace;
        }
        if (builder.key != null) {
            this.key = builder.key;
        }
    }

    /**
     * Namespace where the object is stored. Its unique identifier within skill's DataStore.
     * @return namespace
    **/
    @JsonProperty("namespace")
    public String getNamespace() {
        return namespace;
    }


    /**
     * Unique identifier of the objects. Needs to be unique only within client's namespace not globally unique.
     * @return key
    **/
    @JsonProperty("key")
    public String getKey() {
        return key;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RemoveObjectCommand servicesDatastoreV1RemoveObjectCommand = (RemoveObjectCommand) o;
        return Objects.equals(this.namespace, servicesDatastoreV1RemoveObjectCommand.namespace) &&
            Objects.equals(this.key, servicesDatastoreV1RemoveObjectCommand.key) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, key, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveObjectCommand {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
        private String key;

        private Builder() {}

        @JsonProperty("namespace")

        public Builder withNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }


        @JsonProperty("key")

        public Builder withKey(String key) {
            this.key = key;
            return this;
        }


        public RemoveObjectCommand build() {
            return new RemoveObjectCommand(this);
        }
    }
}

