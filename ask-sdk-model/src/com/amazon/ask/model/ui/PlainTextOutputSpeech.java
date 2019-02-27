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


package com.amazon.ask.model.ui;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PlainTextOutputSpeech
 */

@JsonDeserialize(builder = PlainTextOutputSpeech.Builder.class)
public final class PlainTextOutputSpeech extends com.amazon.ask.model.ui.OutputSpeech {

  @JsonProperty("text")
  private String text = null;

  public static Builder builder() {
    return new Builder();
  }

  private PlainTextOutputSpeech(Builder builder) {
    String discriminatorValue = "PlainText";

    this.type = discriminatorValue;
    this.playBehavior = builder.playBehavior;
    this.text = builder.text;
  }

  /**
    * Get text
  * @return text
  **/
  public String getText() {
    return text;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlainTextOutputSpeech uiPlainTextOutputSpeech = (PlainTextOutputSpeech) o;
    return Objects.equals(this.text, uiPlainTextOutputSpeech.text) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlainTextOutputSpeech {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
    private com.amazon.ask.model.ui.PlayBehavior playBehavior;
    private String text;

    private Builder() { }
      

    @JsonProperty("playBehavior")
    public Builder withPlayBehavior(com.amazon.ask.model.ui.PlayBehavior playBehavior) {
      this.playBehavior = playBehavior;
      return this;
    }
      

    @JsonProperty("text")
    public Builder withText(String text) {
      this.text = text;
      return this;
    }
      

    public PlainTextOutputSpeech build() {
      return new PlainTextOutputSpeech(this);
    }
  }
}

