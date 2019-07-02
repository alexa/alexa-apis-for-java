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
 * A message that can change the visual or audio presentation of the content on the screen.
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.SetPageCommand.class, name = "SetPage"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.ControlMediaCommand.class, name = "ControlMedia"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.SequentialCommand.class, name = "Sequential"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.SetStateCommand.class, name = "SetState"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.SpeakItemCommand.class, name = "SpeakItem"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.AutoPageCommand.class, name = "AutoPage"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.ParallelCommand.class, name = "Parallel"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.OpenUrlCommand.class, name = "OpenURL"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.PlayMediaCommand.class, name = "PlayMedia"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.ClearFocusCommand.class, name = "ClearFocus"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.ScrollToIndexCommand.class, name = "ScrollToIndex"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.ScrollCommand.class, name = "Scroll"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.IdleCommand.class, name = "Idle"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimateItemCommand.class, name = "AnimateItem"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.SetValueCommand.class, name = "SetValue"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.SetFocusCommand.class, name = "SetFocus"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.SendEventCommand.class, name = "SendEvent"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.SpeakListCommand.class, name = "SpeakList"),
})

public abstract class Command{

  protected String type = null;

  @JsonProperty("delay")
  protected String delay = null;

  @JsonProperty("description")
  protected String description = null;

  @JsonProperty("when")
  protected Boolean when = null;

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
  public String getDelay() {
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
    * If false, the execution of the command is skipped. Defaults to true.
  * @return when
  **/
  @JsonProperty("when")
  public Boolean getWhen() {
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
    Command interfacesAlexaPresentationAplCommand = (Command) o;
    return Objects.equals(this.type, interfacesAlexaPresentationAplCommand.type) &&
        Objects.equals(this.delay, interfacesAlexaPresentationAplCommand.delay) &&
        Objects.equals(this.description, interfacesAlexaPresentationAplCommand.description) &&
        Objects.equals(this.when, interfacesAlexaPresentationAplCommand.when);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, delay, description, when);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Command {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

