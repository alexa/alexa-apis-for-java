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


package com.amazon.ask.model.interfaces.display;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ImageInstance
 */

@JsonDeserialize(builder = ImageInstance.Builder.class)
public final class ImageInstance{

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("size")
  private com.amazon.ask.model.interfaces.display.ImageSize size = null;

  @JsonProperty("widthPixels")
  private Integer widthPixels = null;

  @JsonProperty("heightPixels")
  private Integer heightPixels = null;

  public static Builder builder() {
    return new Builder();
  }

  private ImageInstance(Builder builder) {
    this.url = builder.url;
    this.size = builder.size;
    this.widthPixels = builder.widthPixels;
    this.heightPixels = builder.heightPixels;
  }

  /**
    * Get url
  * @return url
  **/
  public String getUrl() {
    return url;
  }

  /**
    * Get size
  * @return size
  **/
  public com.amazon.ask.model.interfaces.display.ImageSize getSize() {
    return size;
  }

  /**
    * Get widthPixels
  * @return widthPixels
  **/
  public Integer getWidthPixels() {
    return widthPixels;
  }

  /**
    * Get heightPixels
  * @return heightPixels
  **/
  public Integer getHeightPixels() {
    return heightPixels;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageInstance interfacesDisplayImageInstance = (ImageInstance) o;
    return Objects.equals(this.url, interfacesDisplayImageInstance.url) &&
        Objects.equals(this.size, interfacesDisplayImageInstance.size) &&
        Objects.equals(this.widthPixels, interfacesDisplayImageInstance.widthPixels) &&
        Objects.equals(this.heightPixels, interfacesDisplayImageInstance.heightPixels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, size, widthPixels, heightPixels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageInstance {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    widthPixels: ").append(toIndentedString(widthPixels)).append("\n");
    sb.append("    heightPixels: ").append(toIndentedString(heightPixels)).append("\n");
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
    private String url;
    private com.amazon.ask.model.interfaces.display.ImageSize size;
    private Integer widthPixels;
    private Integer heightPixels;

    private Builder() { }

    @JsonProperty("url")
    public Builder withUrl(String url) {
        this.url = url;
        return this;
    }


    @JsonProperty("size")
    public Builder withSize(com.amazon.ask.model.interfaces.display.ImageSize size) {
        this.size = size;
        return this;
    }


    @JsonProperty("widthPixels")
    public Builder withWidthPixels(Integer widthPixels) {
        this.widthPixels = widthPixels;
        return this;
    }


    @JsonProperty("heightPixels")
    public Builder withHeightPixels(Integer heightPixels) {
        this.heightPixels = heightPixels;
        return this;
    }


    public ImageInstance build() {
      return new ImageInstance(this);
    }
  }
}

