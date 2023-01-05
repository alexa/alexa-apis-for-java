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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataStore command which will run in DataStore.
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.model.services.datastore.v1.RemoveNamespaceCommand.class, name = "REMOVE_NAMESPACE"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.services.datastore.v1.RemoveObjectCommand.class, name = "REMOVE_OBJECT"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.services.datastore.v1.PutObjectCommand.class, name = "PUT_OBJECT"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.services.datastore.v1.ClearCommand.class, name = "CLEAR"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.services.datastore.v1.PutNamespaceCommand.class, name = "PUT_NAMESPACE"),
})
public abstract class Command {

    protected String type = null;

    protected Command() {
    }

    /**
     * The type of the component. Allowed values are * `PUT_OBJECT` - Creates or updates an object. * `PUT_NAMESPACE` - Creates a new namespace. If the namespace already exists, the command succeeds without any change. * `REMOVE_OBJECT` - Deletes an existing object. If the object doesn't exist, this command succeeds without any change. * `REMOVE_NAMESPACE` - Deletes an existing namespace. If the namespace doesn't exist, this command succeeds without any change. * `CLEAR` - Remove all existing data in skill's DataStore. 
     * @return type
    **/
    @JsonIgnore
    public String getType() {
        return type;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Command servicesDatastoreV1Command = (Command) o;
        return Objects.equals(this.type, servicesDatastoreV1Command.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Command {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
  
}

