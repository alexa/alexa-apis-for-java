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
 * PlayDirective
 */

@JsonDeserialize(builder = PlayDirective.Builder.class)
public final class PlayDirective extends com.amazon.ask.model.Directive {

  @JsonProperty("playBehavior")
  private com.amazon.ask.model.interfaces.audioplayer.PlayBehavior playBehavior = null;

  @JsonProperty("audioItem")
  private com.amazon.ask.model.interfaces.audioplayer.AudioItem audioItem = null;

  public static Builder builder() {
    return new Builder();
  }

  private PlayDirective(Builder builder) {
    String discriminatorValue = "AudioPlayer.Play";

    this.type = discriminatorValue;
    this.playBehavior = builder.playBehavior;
    this.audioItem = builder.audioItem;
  }

  /**
    * Get playBehavior
  * @return playBehavior
  **/
  public com.amazon.ask.model.interfaces.audioplayer.PlayBehavior getPlayBehavior() {
    return playBehavior;
  }

  /**
    * Get audioItem
  * @return audioItem
  **/
  public com.amazon.ask.model.interfaces.audioplayer.AudioItem getAudioItem() {
    return audioItem;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayDirective interfacesAudioplayerPlayDirective = (PlayDirective) o;
    return Objects.equals(this.playBehavior, interfacesAudioplayerPlayDirective.playBehavior) &&
        Objects.equals(this.audioItem, interfacesAudioplayerPlayDirective.audioItem) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playBehavior, audioItem, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayDirective {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    playBehavior: ").append(toIndentedString(playBehavior)).append("\n");
    sb.append("    audioItem: ").append(toIndentedString(audioItem)).append("\n");
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
    private com.amazon.ask.model.interfaces.audioplayer.PlayBehavior playBehavior;
    private com.amazon.ask.model.interfaces.audioplayer.AudioItem audioItem;

    private Builder() { }
      

    @JsonProperty("playBehavior")
    public Builder withPlayBehavior(com.amazon.ask.model.interfaces.audioplayer.PlayBehavior playBehavior) {
      this.playBehavior = playBehavior;
      return this;
    }
      

    @JsonProperty("audioItem")
    public Builder withAudioItem(com.amazon.ask.model.interfaces.audioplayer.AudioItem audioItem) {
      this.audioItem = audioItem;
      return this;
    }
      

    public PlayDirective build() {
      return new PlayDirective(this);
    }
  }
}

