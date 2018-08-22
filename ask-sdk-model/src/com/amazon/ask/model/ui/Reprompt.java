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


package com.amazon.ask.model.ui;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Reprompt
 */

@JsonDeserialize(builder = Reprompt.Builder.class)
public final class Reprompt{

  @JsonProperty("outputSpeech")
  private com.amazon.ask.model.ui.OutputSpeech outputSpeech = null;

  public static Builder builder() {
    return new Builder();
  }

  private Reprompt(Builder builder) {
    this.outputSpeech = builder.outputSpeech;
  }

  /**
    * Get outputSpeech
  * @return outputSpeech
  **/
  public com.amazon.ask.model.ui.OutputSpeech getOutputSpeech() {
    return outputSpeech;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reprompt uiReprompt = (Reprompt) o;
    return Objects.equals(this.outputSpeech, uiReprompt.outputSpeech);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputSpeech);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reprompt {\n");
    
    sb.append("    outputSpeech: ").append(toIndentedString(outputSpeech)).append("\n");
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
    private com.amazon.ask.model.ui.OutputSpeech outputSpeech;

    private Builder() { }

    @JsonProperty("outputSpeech")
    public Builder withOutputSpeech(com.amazon.ask.model.ui.OutputSpeech outputSpeech) {
      this.outputSpeech = outputSpeech;
      return this;
    }
      

    public Reprompt build() {
      return new Reprompt(this);
    }
  }
}

