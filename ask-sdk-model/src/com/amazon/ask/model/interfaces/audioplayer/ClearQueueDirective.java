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


package com.amazon.ask.model.interfaces.audioplayer;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ClearQueueDirective
 */

@JsonDeserialize(builder = ClearQueueDirective.Builder.class)
public final class ClearQueueDirective extends com.amazon.ask.model.Directive {

  @JsonProperty("clearBehavior")
  private com.amazon.ask.model.interfaces.audioplayer.ClearBehavior clearBehavior = null;

  public static Builder builder() {
    return new Builder();
  }

  private ClearQueueDirective(Builder builder) {
    String discriminatorValue = "AudioPlayer.ClearQueue";

    this.type = discriminatorValue;
    this.clearBehavior = builder.clearBehavior;
  }

  /**
    * Get clearBehavior
  * @return clearBehavior
  **/
  @JsonProperty("clearBehavior")
  public com.amazon.ask.model.interfaces.audioplayer.ClearBehavior getClearBehavior() {
    return clearBehavior;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearQueueDirective interfacesAudioplayerClearQueueDirective = (ClearQueueDirective) o;
    return Objects.equals(this.clearBehavior, interfacesAudioplayerClearQueueDirective.clearBehavior) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clearBehavior, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearQueueDirective {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    clearBehavior: ").append(toIndentedString(clearBehavior)).append("\n");
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
    private com.amazon.ask.model.interfaces.audioplayer.ClearBehavior clearBehavior;

    private Builder() { }

    @JsonProperty("clearBehavior")
    public Builder withClearBehavior(com.amazon.ask.model.interfaces.audioplayer.ClearBehavior clearBehavior) {
        this.clearBehavior = clearBehavior;
        return this;
    }


    public ClearQueueDirective build() {
      return new ClearQueueDirective(this);
    }
  }
}

