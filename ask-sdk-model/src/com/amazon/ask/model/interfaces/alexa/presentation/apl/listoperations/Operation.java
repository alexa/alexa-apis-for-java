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


package com.amazon.ask.model.interfaces.alexa.presentation.apl.listoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An operation which adds, removes or replaces item(s) defined in a dynamicIndexList.
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.listoperations.SetItemOperation.class, name = "SetItem"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.listoperations.InsertMultipleItemsOperation.class, name = "InsertMultipleItems"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.listoperations.DeleteMultipleItemsOperation.class, name = "DeleteMultipleItems"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.listoperations.InsertItemOperation.class, name = "InsertItem"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.listoperations.DeleteItemOperation.class, name = "DeleteItem"),
})
public abstract class Operation {

    protected String type = null;

    @JsonProperty("index")
    protected Integer index = null;

    protected Operation() {
    }

    /**
     * Defines the operation type and dictates which properties must/can be included.
     * @return type
    **/
    @JsonIgnore
    public String getType() {
        return type;
    }


    /**
     * The position of the item in the dynamicIndexList to which the operation is to be applied. For inserts and deletes that operate on multiple items, this value represents the starting index, with onward inserts/deletes applying to consecutively increasing positions.
     * @return index
    **/
    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Operation interfacesAlexaPresentationAplListoperationsOperation = (Operation) o;
        return Objects.equals(this.type, interfacesAlexaPresentationAplListoperationsOperation.type) &&
            Objects.equals(this.index, interfacesAlexaPresentationAplListoperationsOperation.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Operation {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

