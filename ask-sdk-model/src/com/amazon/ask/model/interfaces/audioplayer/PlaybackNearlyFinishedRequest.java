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
 * PlaybackNearlyFinishedRequest
 */

@JsonDeserialize(builder = PlaybackNearlyFinishedRequest.Builder.class)
public final class PlaybackNearlyFinishedRequest extends com.amazon.ask.model.Request {

  @JsonProperty("offsetInMilliseconds")
  private Long offsetInMilliseconds = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("locale")
  private String locale = null;

  public static Builder builder() {
    return new Builder();
  }

  private PlaybackNearlyFinishedRequest(Builder builder) {
    String discriminatorValue = "AudioPlayer.PlaybackNearlyFinished";

    this.type = discriminatorValue;
    this.requestId = builder.requestId;
    this.timestamp = builder.timestamp;
    this.offsetInMilliseconds = builder.offsetInMilliseconds;
    this.token = builder.token;
    this.locale = builder.locale;
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
    PlaybackNearlyFinishedRequest interfacesAudioplayerPlaybackNearlyFinishedRequest = (PlaybackNearlyFinishedRequest) o;
    return Objects.equals(this.offsetInMilliseconds, interfacesAudioplayerPlaybackNearlyFinishedRequest.offsetInMilliseconds) &&
        Objects.equals(this.token, interfacesAudioplayerPlaybackNearlyFinishedRequest.token) &&
        Objects.equals(this.locale, interfacesAudioplayerPlaybackNearlyFinishedRequest.locale) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offsetInMilliseconds, token, locale, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaybackNearlyFinishedRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    offsetInMilliseconds: ").append(toIndentedString(offsetInMilliseconds)).append("\n");
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
    private Long offsetInMilliseconds;
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
      

    @JsonProperty("locale")
    public Builder withLocale(String locale) {
      this.locale = locale;
      return this;
    }
      

    public PlaybackNearlyFinishedRequest build() {
      return new PlaybackNearlyFinishedRequest(this);
    }
  }
}

