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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AnimatedProperty
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "property", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimatedOpacityProperty.class, name = "opacity"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimatedTransformProperty.class, name = "transform"),
})

public abstract class AnimatedProperty {

    protected String property = null;

    protected AnimatedProperty() {
    }

    /**
     * The name of the property to animate
     * @return property
    **/
    @JsonIgnore
    public String getProperty() {
        return property;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnimatedProperty interfacesAlexaPresentationAplAnimatedProperty = (AnimatedProperty) o;
        return Objects.equals(this.property, interfacesAlexaPresentationAplAnimatedProperty.property);
    }

    @Override
    public int hashCode() {
        return Objects.hash(property);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnimatedProperty {\n");
        
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
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

