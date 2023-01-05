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
 * Deletes an existing namespace. If the namespace doesn&#39;t exist, this command succeeds without any change.
 */

@JsonDeserialize(builder = RemoveNamespaceCommand.Builder.class)
public final class RemoveNamespaceCommand extends com.amazon.ask.model.services.datastore.v1.Command  {

    @JsonProperty("namespace")
    private String namespace = null;

    private RemoveNamespaceCommand() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private RemoveNamespaceCommand(Builder builder) {
        String discriminatorValue = "REMOVE_NAMESPACE";

        this.type = discriminatorValue;
        if (builder.namespace != null) {
            this.namespace = builder.namespace;
        }
    }

    /**
     * Namespace which needs to be removed. It's unique identifier within skill's DataStore.
     * @return namespace
    **/
    @JsonProperty("namespace")
    public String getNamespace() {
        return namespace;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RemoveNamespaceCommand servicesDatastoreV1RemoveNamespaceCommand = (RemoveNamespaceCommand) o;
        return Objects.equals(this.namespace, servicesDatastoreV1RemoveNamespaceCommand.namespace) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveNamespaceCommand {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

        private Builder() {}

        @JsonProperty("namespace")

        public Builder withNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }


        public RemoveNamespaceCommand build() {
            return new RemoveNamespaceCommand(this);
        }
    }
}

