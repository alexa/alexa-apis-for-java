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


package com.amazon.ask.model.services.gadgetController;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AnimationStep
 */

@JsonDeserialize(builder = AnimationStep.Builder.class)
public final class AnimationStep{

  @JsonProperty("durationMs")
  private Integer durationMs = null;

  @JsonProperty("color")
  private String color = null;

  @JsonProperty("blend")
  private Boolean blend = null;

  public static Builder builder() {
    return new Builder();
  }

  private AnimationStep(Builder builder) {
    this.durationMs = builder.durationMs;
    this.color = builder.color;
    this.blend = builder.blend;
  }

  /**
    * The duration in milliseconds to render this step. 
    * minimum: 1
    * maximum: 65535
  * @return durationMs
  **/
  public Integer getDurationMs() {
    return durationMs;
  }

  /**
    * The color to render specified in RGB hexadecimal values. There are a number of Node.js libraries available for working with color. 
  * @return color
  **/
  public String getColor() {
    return color;
  }

  /**
    * A boolean that indicates whether to interpolate from the previous color into this one over the course of this directive's durationMs.
  * @return blend
  **/
  public Boolean getBlend() {
    return blend;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimationStep servicesGadgetControllerAnimationStep = (AnimationStep) o;
    return Objects.equals(this.durationMs, servicesGadgetControllerAnimationStep.durationMs) &&
        Objects.equals(this.color, servicesGadgetControllerAnimationStep.color) &&
        Objects.equals(this.blend, servicesGadgetControllerAnimationStep.blend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationMs, color, blend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimationStep {\n");
    
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    blend: ").append(toIndentedString(blend)).append("\n");
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
    private Integer durationMs;
    private String color;
    private Boolean blend;

    private Builder() { }

    @JsonProperty("durationMs")
    public Builder withDurationMs(Integer durationMs) {
      this.durationMs = durationMs;
      return this;
    }
      

    @JsonProperty("color")
    public Builder withColor(String color) {
      this.color = color;
      return this;
    }
      

    @JsonProperty("blend")
    public Builder withBlend(Boolean blend) {
      this.blend = blend;
      return this;
    }
      

    public AnimationStep build() {
      return new AnimationStep(this);
    }
  }
}

