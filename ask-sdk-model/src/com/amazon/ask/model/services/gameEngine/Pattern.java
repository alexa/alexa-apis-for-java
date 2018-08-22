/*
* Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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


package com.amazon.ask.model.services.gameEngine;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object that provides all of the events that need to occur, in a specific order, for this recognizer to be true. Omitting any parameters in this object means \&quot;match anything\&quot;.
 */

@JsonDeserialize(builder = Pattern.Builder.class)
public final class Pattern{

  @JsonProperty("gadgetIds")
  private List<String> gadgetIds = new ArrayList<String>();

  @JsonProperty("colors")
  private List<String> colors = new ArrayList<String>();

  @JsonProperty("action")
  private com.amazon.ask.model.services.gameEngine.InputEventActionType action = null;

  public static Builder builder() {
    return new Builder();
  }

  private Pattern(Builder builder) {
    this.gadgetIds = builder.gadgetIds;
    this.colors = builder.colors;
    this.action = builder.action;
  }

  /**
    * A whitelist of gadgetIds that are eligible for this match.
  * @return gadgetIds
  **/
  public List<String> getGadgetIds() {
    return gadgetIds;
  }

  /**
    * A whitelist of colors that are eligible for this match.
  * @return colors
  **/
  public List<String> getColors() {
    return colors;
  }

  /**
    * Get action
  * @return action
  **/
  public com.amazon.ask.model.services.gameEngine.InputEventActionType getAction() {
    return action;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pattern servicesGameEnginePattern = (Pattern) o;
    return Objects.equals(this.gadgetIds, servicesGameEnginePattern.gadgetIds) &&
        Objects.equals(this.colors, servicesGameEnginePattern.colors) &&
        Objects.equals(this.action, servicesGameEnginePattern.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gadgetIds, colors, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pattern {\n");
    
    sb.append("    gadgetIds: ").append(toIndentedString(gadgetIds)).append("\n");
    sb.append("    colors: ").append(toIndentedString(colors)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
    private List<String> gadgetIds;
    private List<String> colors;
    private com.amazon.ask.model.services.gameEngine.InputEventActionType action;

    private Builder() { }

    @JsonProperty("gadgetIds")
    public Builder withGadgetIds(List<String> gadgetIds) {
      this.gadgetIds = gadgetIds;
      return this;
    }
      
    public Builder addGadgetIdsItem(String gadgetIdsItem) {
      if (this.gadgetIds == null) {
        this.gadgetIds = new ArrayList<String>();
      }
      this.gadgetIds.add(gadgetIdsItem);
      return this;
    }

    @JsonProperty("colors")
    public Builder withColors(List<String> colors) {
      this.colors = colors;
      return this;
    }
      
    public Builder addColorsItem(String colorsItem) {
      if (this.colors == null) {
        this.colors = new ArrayList<String>();
      }
      this.colors.add(colorsItem);
      return this;
    }

    @JsonProperty("action")
    public Builder withAction(com.amazon.ask.model.services.gameEngine.InputEventActionType action) {
      this.action = action;
      return this;
    }
      

    public Pattern build() {
      return new Pattern(this);
    }
  }
}

