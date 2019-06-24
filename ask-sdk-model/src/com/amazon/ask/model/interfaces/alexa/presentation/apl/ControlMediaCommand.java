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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Control a media player to play, pause, change tracks, or perform some other common action.
 */

@JsonDeserialize(builder = ControlMediaCommand.Builder.class)
public final class ControlMediaCommand extends com.amazon.ask.model.interfaces.alexa.presentation.apl.Command {

  @JsonProperty("command")
  private com.amazon.ask.model.interfaces.alexa.presentation.apl.MediaCommandType command = null;

  @JsonProperty("componentId")
  private String componentId = null;

  @JsonProperty("value")
  private String value = String.valueOf(null);

  public static Builder builder() {
    return new Builder();
  }

  private ControlMediaCommand(Builder builder) {
    String discriminatorValue = "ControlMedia";

    this.type = discriminatorValue;
    this.delay = builder.delay;
    this.description = builder.description;
    this.when = builder.when;
    this.command = builder.command;
    this.componentId = builder.componentId;
    this.value = builder.value;
  }

  /**
    * The command to issue on the media player
  * @return command
  **/
  public com.amazon.ask.model.interfaces.alexa.presentation.apl.MediaCommandType getCommand() {
    return command;
  }

  /**
    * The name of the media playing component
  * @return componentId
  **/
  public String getComponentId() {
    return componentId;
  }

  /**
    * Optional data value
  * @return value
  **/
  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControlMediaCommand interfacesAlexaPresentationAplControlMediaCommand = (ControlMediaCommand) o;
    return Objects.equals(this.command, interfacesAlexaPresentationAplControlMediaCommand.command) &&
        Objects.equals(this.componentId, interfacesAlexaPresentationAplControlMediaCommand.componentId) &&
        Objects.equals(this.value, interfacesAlexaPresentationAplControlMediaCommand.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, componentId, value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControlMediaCommand {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    private String delay;
    private String description;
    private Boolean when;
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.MediaCommandType command;
    private String componentId;
    private String value;

    private Builder() { }

    @JsonProperty("delay")
    public Builder withDelay(Integer delay) {
        this.delay = String.valueOf(delay);
        return this;
    }

    public Builder withDelay(String delayExpression) {
        this.delay = delayExpression;
        return this;
    }

    @JsonProperty("description")
    public Builder withDescription(String description) {
        this.description = description;
        return this;
    }


    @JsonProperty("when")
    public Builder withWhen(Boolean when) {
        this.when = when;
        return this;
    }


    @JsonProperty("command")
    public Builder withCommand(com.amazon.ask.model.interfaces.alexa.presentation.apl.MediaCommandType command) {
        this.command = command;
        return this;
    }


    @JsonProperty("componentId")
    public Builder withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }


    @JsonProperty("value")
    public Builder withValue(Integer value) {
        this.value = String.valueOf(value);
        return this;
    }

    public Builder withValue(String valueExpression) {
        this.value = valueExpression;
        return this;
    }

    public ControlMediaCommand build() {
      return new ControlMediaCommand(this);
    }
  }
}

