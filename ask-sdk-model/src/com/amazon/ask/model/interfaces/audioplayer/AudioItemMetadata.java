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
 * Encapsulates the metadata about an AudioItem.
 */

@JsonDeserialize(builder = AudioItemMetadata.Builder.class)
public final class AudioItemMetadata{

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("subtitle")
  private String subtitle = null;

  @JsonProperty("art")
  private com.amazon.ask.model.interfaces.display.Image art = null;

  @JsonProperty("backgroundImage")
  private com.amazon.ask.model.interfaces.display.Image backgroundImage = null;

  public static Builder builder() {
    return new Builder();
  }

  private AudioItemMetadata(Builder builder) {
    this.title = builder.title;
    this.subtitle = builder.subtitle;
    this.art = builder.art;
    this.backgroundImage = builder.backgroundImage;
  }

  /**
    * An optional title of the audio item.
  * @return title
  **/
  public String getTitle() {
    return title;
  }

  /**
    * An optional subtitle of the audio item.
  * @return subtitle
  **/
  public String getSubtitle() {
    return subtitle;
  }

  /**
    * An optional cover art image for the audio item.
  * @return art
  **/
  public com.amazon.ask.model.interfaces.display.Image getArt() {
    return art;
  }

  /**
    * An optional background image for the audio item.
  * @return backgroundImage
  **/
  public com.amazon.ask.model.interfaces.display.Image getBackgroundImage() {
    return backgroundImage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioItemMetadata interfacesAudioplayerAudioItemMetadata = (AudioItemMetadata) o;
    return Objects.equals(this.title, interfacesAudioplayerAudioItemMetadata.title) &&
        Objects.equals(this.subtitle, interfacesAudioplayerAudioItemMetadata.subtitle) &&
        Objects.equals(this.art, interfacesAudioplayerAudioItemMetadata.art) &&
        Objects.equals(this.backgroundImage, interfacesAudioplayerAudioItemMetadata.backgroundImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, subtitle, art, backgroundImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioItemMetadata {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    art: ").append(toIndentedString(art)).append("\n");
    sb.append("    backgroundImage: ").append(toIndentedString(backgroundImage)).append("\n");
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
    private com.amazon.ask.model.interfaces.display.Image art;
    private com.amazon.ask.model.interfaces.display.Image backgroundImage;

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


    @JsonProperty("art")
    public Builder withArt(com.amazon.ask.model.interfaces.display.Image art) {
        this.art = art;
        return this;
    }


    @JsonProperty("backgroundImage")
    public Builder withBackgroundImage(com.amazon.ask.model.interfaces.display.Image backgroundImage) {
        this.backgroundImage = backgroundImage;
        return this;
    }


    public AudioItemMetadata build() {
      return new AudioItemMetadata(this);
    }
  }
}

