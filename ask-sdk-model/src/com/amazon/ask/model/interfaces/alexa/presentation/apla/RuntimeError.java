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


package com.amazon.ask.model.interfaces.alexa.presentation.apla;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A description of an error in APLA functionality.
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apla.AudioSourceRuntimeError.class, name = "AUDIO_SOURCE_ERROR"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apla.RenderRuntimeError.class, name = "RENDER_ERROR"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apla.DocumentRuntimeError.class, name = "DOCUMENT_ERROR"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apla.LinkRuntimeError.class, name = "LINK_ERROR"),
})
public abstract class RuntimeError {

    protected String type = null;

    @JsonProperty("message")
    protected String message = null;

    protected RuntimeError() {
    }

    /**
     * Defines the error type and dictates which properties must/can be included.
     * @return type
    **/
    @JsonIgnore
    public String getType() {
        return type;
    }


    /**
     * A human-readable description of the error.
     * @return message
    **/
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuntimeError interfacesAlexaPresentationAplaRuntimeError = (RuntimeError) o;
        return Objects.equals(this.type, interfacesAlexaPresentationAplaRuntimeError.type) &&
            Objects.equals(this.message, interfacesAlexaPresentationAplaRuntimeError.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuntimeError {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

