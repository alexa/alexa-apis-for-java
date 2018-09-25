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


package com.amazon.ask.model.interfaces.audioplayer;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PlaybackFailedRequest
 */

@JsonDeserialize(builder = PlaybackFailedRequest.Builder.class)
public final class PlaybackFailedRequest extends com.amazon.ask.model.Request {

  @JsonProperty("currentPlaybackState")
  private com.amazon.ask.model.interfaces.audioplayer.CurrentPlaybackState currentPlaybackState = null;

  @JsonProperty("error")
  private com.amazon.ask.model.interfaces.audioplayer.Error error = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("locale")
  private String locale = null;

  public static Builder builder() {
    return new Builder();
  }

  private PlaybackFailedRequest(Builder builder) {
    String discriminatorValue = "AudioPlayer.PlaybackFailed";

    this.type = discriminatorValue;
    this.requestId = builder.requestId;
    this.timestamp = builder.timestamp;
    this.currentPlaybackState = builder.currentPlaybackState;
    this.error = builder.error;
    this.token = builder.token;
    this.locale = builder.locale;
  }

  /**
    * Get currentPlaybackState
  * @return currentPlaybackState
  **/
  public com.amazon.ask.model.interfaces.audioplayer.CurrentPlaybackState getCurrentPlaybackState() {
    return currentPlaybackState;
  }

  /**
    * Get error
  * @return error
  **/
  public com.amazon.ask.model.interfaces.audioplayer.Error getError() {
    return error;
  }

  /**
    * Get token
  * @return token
  **/
  public String getToken() {
    return token;
  }

  /**
    * A string indicating the user’s locale. For example: en-US.
  * @return locale
  **/
  public String getLocale() {
    return locale;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaybackFailedRequest interfacesAudioplayerPlaybackFailedRequest = (PlaybackFailedRequest) o;
    return Objects.equals(this.currentPlaybackState, interfacesAudioplayerPlaybackFailedRequest.currentPlaybackState) &&
        Objects.equals(this.error, interfacesAudioplayerPlaybackFailedRequest.error) &&
        Objects.equals(this.token, interfacesAudioplayerPlaybackFailedRequest.token) &&
        Objects.equals(this.locale, interfacesAudioplayerPlaybackFailedRequest.locale) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPlaybackState, error, token, locale, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaybackFailedRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    currentPlaybackState: ").append(toIndentedString(currentPlaybackState)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
    private String requestId;
    private OffsetDateTime timestamp;
    private com.amazon.ask.model.interfaces.audioplayer.CurrentPlaybackState currentPlaybackState;
    private com.amazon.ask.model.interfaces.audioplayer.Error error;
    private String token;
    private String locale;

    private Builder() { }
      

    @JsonProperty("requestId")
    public Builder withRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }
      

    @JsonProperty("timestamp")
    public Builder withTimestamp(OffsetDateTime timestamp) {
      this.timestamp = timestamp;
      return this;
    }
      

    @JsonProperty("currentPlaybackState")
    public Builder withCurrentPlaybackState(com.amazon.ask.model.interfaces.audioplayer.CurrentPlaybackState currentPlaybackState) {
      this.currentPlaybackState = currentPlaybackState;
      return this;
    }
      

    @JsonProperty("error")
    public Builder withError(com.amazon.ask.model.interfaces.audioplayer.Error error) {
      this.error = error;
      return this;
    }
      

    @JsonProperty("token")
    public Builder withToken(String token) {
      this.token = token;
      return this;
    }
      

    @JsonProperty("locale")
    public Builder withLocale(String locale) {
      this.locale = locale;
      return this;
    }
      

    public PlaybackFailedRequest build() {
      return new PlaybackFailedRequest(this);
    }
  }
}

