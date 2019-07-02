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


package com.amazon.ask.model.services.directive;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SpeakDirective
 */

@JsonDeserialize(builder = SpeakDirective.Builder.class)
public final class SpeakDirective extends com.amazon.ask.model.services.directive.Directive {

  @JsonProperty("speech")
  private String speech = null;

  public static Builder builder() {
    return new Builder();
  }

  private SpeakDirective(Builder builder) {
    String discriminatorValue = "VoicePlayer.Speak";

    this.type = discriminatorValue;
    this.speech = builder.speech;
  }

  /**
    * Get speech
  * @return speech
  **/
  @JsonProperty("speech")
  public String getSpeech() {
    return speech;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpeakDirective servicesDirectiveSpeakDirective = (SpeakDirective) o;
    return Objects.equals(this.speech, servicesDirectiveSpeakDirective.speech) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(speech, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpeakDirective {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    speech: ").append(toIndentedString(speech)).append("\n");
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
    private String speech;

    private Builder() { }

    @JsonProperty("speech")
    public Builder withSpeech(String speech) {
        this.speech = speech;
        return this;
    }


    public SpeakDirective build() {
      return new SpeakDirective(this);
    }
  }
}

