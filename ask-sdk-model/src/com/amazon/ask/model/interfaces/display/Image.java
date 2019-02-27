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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Image
 */

@JsonDeserialize(builder = Image.Builder.class)
public final class Image{

  @JsonProperty("contentDescription")
  private String contentDescription = null;

  @JsonProperty("sources")
  private List<com.amazon.ask.model.interfaces.display.ImageInstance> sources = new ArrayList<com.amazon.ask.model.interfaces.display.ImageInstance>();

  public static Builder builder() {
    return new Builder();
  }

  private Image(Builder builder) {
    this.contentDescription = builder.contentDescription;
    this.sources = builder.sources;
  }

  /**
    * Get contentDescription
  * @return contentDescription
  **/
  public String getContentDescription() {
    return contentDescription;
  }

  /**
    * Get sources
  * @return sources
  **/
  public List<com.amazon.ask.model.interfaces.display.ImageInstance> getSources() {
    return sources;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image interfacesDisplayImage = (Image) o;
    return Objects.equals(this.contentDescription, interfacesDisplayImage.contentDescription) &&
        Objects.equals(this.sources, interfacesDisplayImage.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentDescription, sources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    
    sb.append("    contentDescription: ").append(toIndentedString(contentDescription)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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
    private String contentDescription;
    private List<com.amazon.ask.model.interfaces.display.ImageInstance> sources;

    private Builder() { }

    @JsonProperty("contentDescription")
    public Builder withContentDescription(String contentDescription) {
      this.contentDescription = contentDescription;
      return this;
    }
      

    @JsonProperty("sources")
    public Builder withSources(List<com.amazon.ask.model.interfaces.display.ImageInstance> sources) {
      this.sources = sources;
      return this;
    }
      
    public Builder addSourcesItem(com.amazon.ask.model.interfaces.display.ImageInstance sourcesItem) {
      if (this.sources == null) {
        this.sources = new ArrayList<com.amazon.ask.model.interfaces.display.ImageInstance>();
      }
      this.sources.add(sourcesItem);
      return this;
    }

    public Image build() {
      return new Image(this);
    }
  }
}

