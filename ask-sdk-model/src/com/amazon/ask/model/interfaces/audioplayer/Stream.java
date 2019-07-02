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
 * Stream
 */

@JsonDeserialize(builder = Stream.Builder.class)
public final class Stream{

  @JsonProperty("expectedPreviousToken")
  private String expectedPreviousToken = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("offsetInMilliseconds")
  private Long offsetInMilliseconds = null;

  public static Builder builder() {
    return new Builder();
  }

  private Stream(Builder builder) {
    this.expectedPreviousToken = builder.expectedPreviousToken;
    this.token = builder.token;
    this.url = builder.url;
    this.offsetInMilliseconds = builder.offsetInMilliseconds;
  }

  /**
    * Get expectedPreviousToken
  * @return expectedPreviousToken
  **/
  @JsonProperty("expectedPreviousToken")
  public String getExpectedPreviousToken() {
    return expectedPreviousToken;
  }

  /**
    * Get token
  * @return token
  **/
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  /**
    * Get url
  * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  /**
    * Get offsetInMilliseconds
  * @return offsetInMilliseconds
  **/
  @JsonProperty("offsetInMilliseconds")
  public Long getOffsetInMilliseconds() {
    return offsetInMilliseconds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stream interfacesAudioplayerStream = (Stream) o;
    return Objects.equals(this.expectedPreviousToken, interfacesAudioplayerStream.expectedPreviousToken) &&
        Objects.equals(this.token, interfacesAudioplayerStream.token) &&
        Objects.equals(this.url, interfacesAudioplayerStream.url) &&
        Objects.equals(this.offsetInMilliseconds, interfacesAudioplayerStream.offsetInMilliseconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedPreviousToken, token, url, offsetInMilliseconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stream {\n");
    
    sb.append("    expectedPreviousToken: ").append(toIndentedString(expectedPreviousToken)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    offsetInMilliseconds: ").append(toIndentedString(offsetInMilliseconds)).append("\n");
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
    private String expectedPreviousToken;
    private String token;
    private String url;
    private Long offsetInMilliseconds;

    private Builder() { }

    @JsonProperty("expectedPreviousToken")
    public Builder withExpectedPreviousToken(String expectedPreviousToken) {
        this.expectedPreviousToken = expectedPreviousToken;
        return this;
    }


    @JsonProperty("token")
    public Builder withToken(String token) {
        this.token = token;
        return this;
    }


    @JsonProperty("url")
    public Builder withUrl(String url) {
        this.url = url;
        return this;
    }


    @JsonProperty("offsetInMilliseconds")
    public Builder withOffsetInMilliseconds(Long offsetInMilliseconds) {
        this.offsetInMilliseconds = offsetInMilliseconds;
        return this;
    }


    public Stream build() {
      return new Stream(this);
    }
  }
}

