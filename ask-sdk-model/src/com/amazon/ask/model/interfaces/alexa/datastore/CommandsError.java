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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataStore error object payload.
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.datastore.DeviceUnavailableError.class, name = "DEVICE_UNAVAILABLE"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.datastore.DevicePermanantlyUnavailableError.class, name = "DEVICE_PERMANENTLY_UNAVAILABLE"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.datastore.DataStoreInternalError.class, name = "DATASTORE_INTERNAL_ERROR"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.datastore.StorageLimitExeceededError.class, name = "STORAGE_LIMIT_EXCEEDED"),
})
public abstract class CommandsError {

    protected String type = null;

    protected CommandsError() {
    }

    /**
     * Describes the type of the error.
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
        CommandsError interfacesAlexaDatastoreCommandsError = (CommandsError) o;
        return Objects.equals(this.type, interfacesAlexaDatastoreCommandsError.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommandsError {\n");
        
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

