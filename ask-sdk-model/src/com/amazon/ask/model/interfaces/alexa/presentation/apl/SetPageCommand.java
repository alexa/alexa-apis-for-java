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
 * Change the page displayed in a Pager component. The SetPage command finishes when the item is fully in view.
 */

@JsonDeserialize(builder = SetPageCommand.Builder.class)
public final class SetPageCommand extends com.amazon.ask.model.interfaces.alexa.presentation.apl.Command {

  @JsonProperty("componentId")
  private String componentId = null;

  @JsonProperty("position")
  private com.amazon.ask.model.interfaces.alexa.presentation.apl.Position position = null;

  @JsonProperty("value")
  private String value = null;

  public static Builder builder() {
    return new Builder();
  }

  private SetPageCommand(Builder builder) {
    String discriminatorValue = "SetPage";

    this.type = discriminatorValue;
    this.delay = builder.delay;
    this.description = builder.description;
    this.when = builder.when;
    this.componentId = builder.componentId;
    this.position = builder.position;
    this.value = builder.value;
  }

  /**
    * The id of the Pager component.
  * @return componentId
  **/
  @JsonProperty("componentId")
  public String getComponentId() {
    return componentId;
  }

  /**
    * Get position
  * @return position
  **/
  @JsonProperty("position")
  public com.amazon.ask.model.interfaces.alexa.presentation.apl.Position getPosition() {
    return position;
  }

  /**
    * The distance to move. May be an absolute value or a relative value.
  * @return value
  **/
  @JsonProperty("value")
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
    SetPageCommand interfacesAlexaPresentationAplSetPageCommand = (SetPageCommand) o;
    return Objects.equals(this.componentId, interfacesAlexaPresentationAplSetPageCommand.componentId) &&
        Objects.equals(this.position, interfacesAlexaPresentationAplSetPageCommand.position) &&
        Objects.equals(this.value, interfacesAlexaPresentationAplSetPageCommand.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentId, position, value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetPageCommand {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
    private String componentId;
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.Position position;
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


    @JsonProperty("componentId")
    public Builder withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }


    @JsonProperty("position")
    public Builder withPosition(com.amazon.ask.model.interfaces.alexa.presentation.apl.Position position) {
        this.position = position;
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

    public SetPageCommand build() {
      return new SetPageCommand(this);
    }
  }
}

