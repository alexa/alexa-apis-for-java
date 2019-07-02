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
 * CurrentPlaybackState
 */

@JsonDeserialize(builder = CurrentPlaybackState.Builder.class)
public final class CurrentPlaybackState{

  @JsonProperty("offsetInMilliseconds")
  private Long offsetInMilliseconds = null;

  @JsonProperty("playerActivity")
  private com.amazon.ask.model.interfaces.audioplayer.PlayerActivity playerActivity = null;

  @JsonProperty("token")
  private String token = null;

  public static Builder builder() {
    return new Builder();
  }

  private CurrentPlaybackState(Builder builder) {
    this.offsetInMilliseconds = builder.offsetInMilliseconds;
    this.playerActivity = builder.playerActivity;
    this.token = builder.token;
  }

  /**
    * Get offsetInMilliseconds
  * @return offsetInMilliseconds
  **/
  @JsonProperty("offsetInMilliseconds")
  public Long getOffsetInMilliseconds() {
    return offsetInMilliseconds;
  }

  /**
    * Get playerActivity
  * @return playerActivity
  **/
  @JsonProperty("playerActivity")
  public com.amazon.ask.model.interfaces.audioplayer.PlayerActivity getPlayerActivity() {
    return playerActivity;
  }

  /**
    * Get token
  * @return token
  **/
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentPlaybackState interfacesAudioplayerCurrentPlaybackState = (CurrentPlaybackState) o;
    return Objects.equals(this.offsetInMilliseconds, interfacesAudioplayerCurrentPlaybackState.offsetInMilliseconds) &&
        Objects.equals(this.playerActivity, interfacesAudioplayerCurrentPlaybackState.playerActivity) &&
        Objects.equals(this.token, interfacesAudioplayerCurrentPlaybackState.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offsetInMilliseconds, playerActivity, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentPlaybackState {\n");
    
    sb.append("    offsetInMilliseconds: ").append(toIndentedString(offsetInMilliseconds)).append("\n");
    sb.append("    playerActivity: ").append(toIndentedString(playerActivity)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
    private Long offsetInMilliseconds;
    private com.amazon.ask.model.interfaces.audioplayer.PlayerActivity playerActivity;
    private String token;

    private Builder() { }

    @JsonProperty("offsetInMilliseconds")
    public Builder withOffsetInMilliseconds(Long offsetInMilliseconds) {
        this.offsetInMilliseconds = offsetInMilliseconds;
        return this;
    }


    @JsonProperty("playerActivity")
    public Builder withPlayerActivity(com.amazon.ask.model.interfaces.audioplayer.PlayerActivity playerActivity) {
        this.playerActivity = playerActivity;
        return this;
    }


    @JsonProperty("token")
    public Builder withToken(String token) {
        this.token = token;
        return this;
    }


    public CurrentPlaybackState build() {
      return new CurrentPlaybackState(this);
    }
  }
}

