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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * LightAnimation
 */

@JsonDeserialize(builder = LightAnimation.Builder.class)
public final class LightAnimation{

  @JsonProperty("repeat")
  private Integer repeat = null;

  @JsonProperty("targetLights")
  private List<String> targetLights = new ArrayList<String>();

  @JsonProperty("sequence")
  private List<com.amazon.ask.model.services.gadgetController.AnimationStep> sequence = new ArrayList<com.amazon.ask.model.services.gadgetController.AnimationStep>();

  public static Builder builder() {
    return new Builder();
  }

  private LightAnimation(Builder builder) {
    this.repeat = builder.repeat;
    this.targetLights = builder.targetLights;
    this.sequence = builder.sequence;
  }

  /**
    * The number of times to play this animation. 
    * minimum: 0
    * maximum: 255
  * @return repeat
  **/
  public Integer getRepeat() {
    return repeat;
  }

  /**
    * An array of strings that represent the light addresses on the target gadgets that this animation will be applied to. Because the Echo Button has one light only, use [\"1\"] to signify that this animation should be sent to light one.
  * @return targetLights
  **/
  public List<String> getTargetLights() {
    return targetLights;
  }

  /**
    * The animation steps to render in order. The maximum number of steps that you can define is 38. The minimum is 0. Each step must have the following fields, all of which are required.
  * @return sequence
  **/
  public List<com.amazon.ask.model.services.gadgetController.AnimationStep> getSequence() {
    return sequence;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LightAnimation servicesGadgetControllerLightAnimation = (LightAnimation) o;
    return Objects.equals(this.repeat, servicesGadgetControllerLightAnimation.repeat) &&
        Objects.equals(this.targetLights, servicesGadgetControllerLightAnimation.targetLights) &&
        Objects.equals(this.sequence, servicesGadgetControllerLightAnimation.sequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repeat, targetLights, sequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LightAnimation {\n");
    
    sb.append("    repeat: ").append(toIndentedString(repeat)).append("\n");
    sb.append("    targetLights: ").append(toIndentedString(targetLights)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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
    private Integer repeat;
    private List<String> targetLights;
    private List<com.amazon.ask.model.services.gadgetController.AnimationStep> sequence;

    private Builder() { }

    @JsonProperty("repeat")
    public Builder withRepeat(Integer repeat) {
      this.repeat = repeat;
      return this;
    }
      

    @JsonProperty("targetLights")
    public Builder withTargetLights(List<String> targetLights) {
      this.targetLights = targetLights;
      return this;
    }
      
    public Builder addTargetLightsItem(String targetLightsItem) {
      if (this.targetLights == null) {
        this.targetLights = new ArrayList<String>();
      }
      this.targetLights.add(targetLightsItem);
      return this;
    }

    @JsonProperty("sequence")
    public Builder withSequence(List<com.amazon.ask.model.services.gadgetController.AnimationStep> sequence) {
      this.sequence = sequence;
      return this;
    }
      
    public Builder addSequenceItem(com.amazon.ask.model.services.gadgetController.AnimationStep sequenceItem) {
      if (this.sequence == null) {
        this.sequence = new ArrayList<com.amazon.ask.model.services.gadgetController.AnimationStep>();
      }
      this.sequence.add(sequenceItem);
      return this;
    }

    public LightAnimation build() {
      return new LightAnimation(this);
    }
  }
}

