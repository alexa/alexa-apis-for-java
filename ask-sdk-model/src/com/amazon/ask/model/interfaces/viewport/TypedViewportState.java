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


package com.amazon.ask.model.interfaces.viewport;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TypedViewportState
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.viewport.APLViewportState.class, name = "APL"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.viewport.APLTViewportState.class, name = "APLT"),
})
public abstract class TypedViewportState {

    @JsonProperty("id")
    protected String id = null;

    protected String type = null;

    protected TypedViewportState() {
    }

    /**
     * unique identifier of a viewport object
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * name of the type of a viewport object
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
        TypedViewportState interfacesViewportTypedViewportState = (TypedViewportState) o;
        return Objects.equals(this.id, interfacesViewportTypedViewportState.id) &&
            Objects.equals(this.type, interfacesViewportTypedViewportState.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypedViewportState {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

