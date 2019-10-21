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


package com.amazon.ask.model.interfaces.alexa.presentation.aplt;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A message that can change the visual or audio presentation of the content on the screen.
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.aplt.SetValueCommand.class, name = "SetValue"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.aplt.IdleCommand.class, name = "Idle"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.aplt.AutoPageCommand.class, name = "AutoPage"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.aplt.ScrollCommand.class, name = "Scroll"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.aplt.SendEventCommand.class, name = "SendEvent"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.aplt.ParallelCommand.class, name = "Parallel"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.aplt.SetPageCommand.class, name = "SetPage"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.aplt.SequentialCommand.class, name = "Sequential"),
})

public abstract class Command {

    protected String type = null;

    @JsonProperty("delay")
    protected Integer delay = null;

    @JsonProperty("description")
    protected String description = null;

    @JsonProperty("screenLock")
    protected Boolean screenLock = null;

    @JsonProperty("when")
    protected String when = null;

    protected Command() {
    }

    /**
     * Defines the command type and dictates which properties must/can be included.
     * @return type
    **/
    @JsonIgnore
    public String getType() {
        return type;
    }

    /**
     * The delay in milliseconds before this command starts executing; must be non-negative. Defaults to 0.
     * @return delay
    **/
    @JsonProperty("delay")
    public Integer getDelay() {
        return delay;
    }

    /**
     * A user-provided description of this command.
     * @return description
    **/
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * If true, disable the Interaction Timer.
     * @return screenLock
    **/
    @JsonProperty("screenLock")
    public Boolean getScreenLock() {
        return screenLock;
    }

    /**
     * A conditional expression to be evaluated in device. If false, the execution of the command is skipped. Defaults to true.
     * @return when
    **/
    @JsonProperty("when")
    public String getWhen() {
        return when;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Command interfacesAlexaPresentationApltCommand = (Command) o;
        return Objects.equals(this.type, interfacesAlexaPresentationApltCommand.type) &&
            Objects.equals(this.delay, interfacesAlexaPresentationApltCommand.delay) &&
            Objects.equals(this.description, interfacesAlexaPresentationApltCommand.description) &&
            Objects.equals(this.screenLock, interfacesAlexaPresentationApltCommand.screenLock) &&
            Objects.equals(this.when, interfacesAlexaPresentationApltCommand.when);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, delay, description, screenLock, when);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Command {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    screenLock: ").append(toIndentedString(screenLock)).append("\n");
        sb.append("    when: ").append(toIndentedString(when)).append("\n");
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

