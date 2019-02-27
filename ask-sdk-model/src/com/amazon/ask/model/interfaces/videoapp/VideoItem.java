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


package com.amazon.ask.model.interfaces.videoapp;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VideoItem
 */

@JsonDeserialize(builder = VideoItem.Builder.class)
public final class VideoItem{

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("metadata")
  private com.amazon.ask.model.interfaces.videoapp.Metadata metadata = null;

  public static Builder builder() {
    return new Builder();
  }

  private VideoItem(Builder builder) {
    this.source = builder.source;
    this.metadata = builder.metadata;
  }

  /**
    * Get source
  * @return source
  **/
  public String getSource() {
    return source;
  }

  /**
    * Get metadata
  * @return metadata
  **/
  public com.amazon.ask.model.interfaces.videoapp.Metadata getMetadata() {
    return metadata;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoItem interfacesVideoappVideoItem = (VideoItem) o;
    return Objects.equals(this.source, interfacesVideoappVideoItem.source) &&
        Objects.equals(this.metadata, interfacesVideoappVideoItem.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoItem {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    private String source;
    private com.amazon.ask.model.interfaces.videoapp.Metadata metadata;

    private Builder() { }

    @JsonProperty("source")
    public Builder withSource(String source) {
      this.source = source;
      return this;
    }
      

    @JsonProperty("metadata")
    public Builder withMetadata(com.amazon.ask.model.interfaces.videoapp.Metadata metadata) {
      this.metadata = metadata;
      return this;
    }
      

    public VideoItem build() {
      return new VideoItem(this);
    }
  }
}

