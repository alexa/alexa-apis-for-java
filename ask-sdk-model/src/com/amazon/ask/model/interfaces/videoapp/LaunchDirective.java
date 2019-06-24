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
 * LaunchDirective
 */

@JsonDeserialize(builder = LaunchDirective.Builder.class)
public final class LaunchDirective extends com.amazon.ask.model.Directive {

  @JsonProperty("videoItem")
  private com.amazon.ask.model.interfaces.videoapp.VideoItem videoItem = null;

  public static Builder builder() {
    return new Builder();
  }

  private LaunchDirective(Builder builder) {
    String discriminatorValue = "VideoApp.Launch";

    this.type = discriminatorValue;
    this.videoItem = builder.videoItem;
  }

  /**
    * Get videoItem
  * @return videoItem
  **/
  public com.amazon.ask.model.interfaces.videoapp.VideoItem getVideoItem() {
    return videoItem;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LaunchDirective interfacesVideoappLaunchDirective = (LaunchDirective) o;
    return Objects.equals(this.videoItem, interfacesVideoappLaunchDirective.videoItem) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoItem, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LaunchDirective {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    videoItem: ").append(toIndentedString(videoItem)).append("\n");
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
    private com.amazon.ask.model.interfaces.videoapp.VideoItem videoItem;

    private Builder() { }

    @JsonProperty("videoItem")
    public Builder withVideoItem(com.amazon.ask.model.interfaces.videoapp.VideoItem videoItem) {
        this.videoItem = videoItem;
        return this;
    }


    public LaunchDirective build() {
      return new LaunchDirective(this);
    }
  }
}

