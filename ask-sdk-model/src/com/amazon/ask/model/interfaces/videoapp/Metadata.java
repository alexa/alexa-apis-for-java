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
 * Metadata
 */

@JsonDeserialize(builder = Metadata.Builder.class)
public final class Metadata{

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("subtitle")
  private String subtitle = null;

  public static Builder builder() {
    return new Builder();
  }

  private Metadata(Builder builder) {
    this.title = builder.title;
    this.subtitle = builder.subtitle;
  }

  /**
    * Get title
  * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  /**
    * Get subtitle
  * @return subtitle
  **/
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadata interfacesVideoappMetadata = (Metadata) o;
    return Objects.equals(this.title, interfacesVideoappMetadata.title) &&
        Objects.equals(this.subtitle, interfacesVideoappMetadata.subtitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, subtitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
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
    private String title;
    private String subtitle;

    private Builder() { }

    @JsonProperty("title")
    public Builder withTitle(String title) {
        this.title = title;
        return this;
    }


    @JsonProperty("subtitle")
    public Builder withSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }


    public Metadata build() {
      return new Metadata(this);
    }
  }
}

