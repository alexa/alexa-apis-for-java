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


package com.amazon.ask.model.interfaces.gadgetController;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Sends Alexa a command to modify the behavior of connected Echo Buttons.
 */

@JsonDeserialize(builder = SetLightDirective.Builder.class)
public final class SetLightDirective extends com.amazon.ask.model.Directive {

  @JsonProperty("version")
  private Integer version = null;

  @JsonProperty("targetGadgets")
  private List<String> targetGadgets = new ArrayList<String>();

  @JsonProperty("parameters")
  private com.amazon.ask.model.services.gadgetController.SetLightParameters parameters = null;

  public static Builder builder() {
    return new Builder();
  }

  private SetLightDirective(Builder builder) {
    String discriminatorValue = "GadgetController.SetLight";

    this.type = discriminatorValue;
    this.version = builder.version;
    this.targetGadgets = builder.targetGadgets;
    this.parameters = builder.parameters;
  }

  /**
    * The version of the directive. Must be set to 1.
  * @return version
  **/
  public Integer getVersion() {
    return version;
  }

  /**
    * The gadget IDs that will receive the command. An empty array, or leaving this parameter out, signifies that all gadgets will receive the command.
  * @return targetGadgets
  **/
  public List<String> getTargetGadgets() {
    return targetGadgets;
  }

  /**
    * Get parameters
  * @return parameters
  **/
  public com.amazon.ask.model.services.gadgetController.SetLightParameters getParameters() {
    return parameters;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetLightDirective interfacesGadgetControllerSetLightDirective = (SetLightDirective) o;
    return Objects.equals(this.version, interfacesGadgetControllerSetLightDirective.version) &&
        Objects.equals(this.targetGadgets, interfacesGadgetControllerSetLightDirective.targetGadgets) &&
        Objects.equals(this.parameters, interfacesGadgetControllerSetLightDirective.parameters) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, targetGadgets, parameters, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetLightDirective {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    targetGadgets: ").append(toIndentedString(targetGadgets)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
    private Integer version;
    private List<String> targetGadgets;
    private com.amazon.ask.model.services.gadgetController.SetLightParameters parameters;

    private Builder() { }

    @JsonProperty("version")
    public Builder withVersion(Integer version) {
        this.version = version;
        return this;
    }


    @JsonProperty("targetGadgets")
    public Builder withTargetGadgets(List<String> targetGadgets) {
        this.targetGadgets = targetGadgets;
        return this;
    }

    public Builder addTargetGadgetsItem(String targetGadgetsItem) {
      if (this.targetGadgets == null) {
        this.targetGadgets = new ArrayList<String>();
      }
      this.targetGadgets.add(targetGadgetsItem);
      return this;
    }

    @JsonProperty("parameters")
    public Builder withParameters(com.amazon.ask.model.services.gadgetController.SetLightParameters parameters) {
        this.parameters = parameters;
        return this;
    }


    public SetLightDirective build() {
      return new SetLightDirective(this);
    }
  }
}

