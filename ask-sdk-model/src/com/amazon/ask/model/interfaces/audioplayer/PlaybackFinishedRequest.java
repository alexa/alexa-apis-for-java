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
 * PlaybackFinishedRequest
 */

@JsonDeserialize(builder = PlaybackFinishedRequest.Builder.class)
public final class PlaybackFinishedRequest extends com.amazon.ask.model.Request {

  @JsonProperty("offsetInMilliseconds")
  private Long offsetInMilliseconds = null;

  @JsonProperty("token")
  private String token = null;

  public static Builder builder() {
    return new Builder();
  }

  private PlaybackFinishedRequest(Builder builder) {
    String discriminatorValue = "AudioPlayer.PlaybackFinished";

    this.type = discriminatorValue;
    this.requestId = builder.requestId;
    this.timestamp = builder.timestamp;
    this.locale = builder.locale;
    this.offsetInMilliseconds = builder.offsetInMilliseconds;
    this.token = builder.token;
  }

  /**
    * Get offsetInMilliseconds
  * @return offsetInMilliseconds
  **/
  public Long getOffsetInMilliseconds() {
    return offsetInMilliseconds;
  }

  /**
    * Get token
  * @return token
  **/
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
    PlaybackFinishedRequest interfacesAudioplayerPlaybackFinishedRequest = (PlaybackFinishedRequest) o;
    return Objects.equals(this.offsetInMilliseconds, interfacesAudioplayerPlaybackFinishedRequest.offsetInMilliseconds) &&
        Objects.equals(this.token, interfacesAudioplayerPlaybackFinishedRequest.token) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offsetInMilliseconds, token, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaybackFinishedRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    offsetInMilliseconds: ").append(toIndentedString(offsetInMilliseconds)).append("\n");
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
    private String requestId;
    private OffsetDateTime timestamp;
    private String locale;
    private Long offsetInMilliseconds;
    private String token;

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
      

    @JsonProperty("locale")
    public Builder withLocale(String locale) {
      this.locale = locale;
      return this;
    }
      

    @JsonProperty("offsetInMilliseconds")
    public Builder withOffsetInMilliseconds(Long offsetInMilliseconds) {
      this.offsetInMilliseconds = offsetInMilliseconds;
      return this;
    }
      

    @JsonProperty("token")
    public Builder withToken(String token) {
      this.token = token;
      return this;
    }
      

    public PlaybackFinishedRequest build() {
      return new PlaybackFinishedRequest(this);
    }
  }
}

