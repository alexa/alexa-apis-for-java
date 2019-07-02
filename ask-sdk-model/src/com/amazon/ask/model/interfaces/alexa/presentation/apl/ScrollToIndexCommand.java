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
 * Scroll forward or backward through a ScrollView or Sequence to ensure that a particular child component is in view.
 */

@JsonDeserialize(builder = ScrollToIndexCommand.Builder.class)
public final class ScrollToIndexCommand extends com.amazon.ask.model.interfaces.alexa.presentation.apl.Command {

  @JsonProperty("align")
  private com.amazon.ask.model.interfaces.alexa.presentation.apl.Align align = null;

  @JsonProperty("componentId")
  private String componentId = null;

  @JsonProperty("index")
  private String index = null;

  public static Builder builder() {
    return new Builder();
  }

  private ScrollToIndexCommand(Builder builder) {
    String discriminatorValue = "ScrollToIndex";

    this.type = discriminatorValue;
    this.delay = builder.delay;
    this.description = builder.description;
    this.when = builder.when;
    this.align = builder.align;
    this.componentId = builder.componentId;
    this.index = builder.index;
  }

  /**
    * Get align
  * @return align
  **/
  @JsonProperty("align")
  public com.amazon.ask.model.interfaces.alexa.presentation.apl.Align getAlign() {
    return align;
  }

  /**
    * The id of the component.
  * @return componentId
  **/
  @JsonProperty("componentId")
  public String getComponentId() {
    return componentId;
  }

  /**
    * The 0-based index of the child to display.
  * @return index
  **/
  @JsonProperty("index")
  public String getIndex() {
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
    ScrollToIndexCommand interfacesAlexaPresentationAplScrollToIndexCommand = (ScrollToIndexCommand) o;
    return Objects.equals(this.align, interfacesAlexaPresentationAplScrollToIndexCommand.align) &&
        Objects.equals(this.componentId, interfacesAlexaPresentationAplScrollToIndexCommand.componentId) &&
        Objects.equals(this.index, interfacesAlexaPresentationAplScrollToIndexCommand.index) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(align, componentId, index, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScrollToIndexCommand {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    align: ").append(toIndentedString(align)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
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

  public static class Builder {
    private String delay;
    private String description;
    private Boolean when;
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.Align align;
    private String componentId;
    private String index;

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


    @JsonProperty("align")
    public Builder withAlign(com.amazon.ask.model.interfaces.alexa.presentation.apl.Align align) {
        this.align = align;
        return this;
    }


    @JsonProperty("componentId")
    public Builder withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }


    @JsonProperty("index")
    public Builder withIndex(Integer index) {
        this.index = String.valueOf(index);
        return this;
    }

    public Builder withIndex(String indexExpression) {
        this.index = indexExpression;
        return this;
    }

    public ScrollToIndexCommand build() {
      return new ScrollToIndexCommand(this);
    }
  }
}

