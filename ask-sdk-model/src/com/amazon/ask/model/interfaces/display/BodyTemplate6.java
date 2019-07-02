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
 * BodyTemplate6
 */

@JsonDeserialize(builder = BodyTemplate6.Builder.class)
public final class BodyTemplate6 extends com.amazon.ask.model.interfaces.display.Template {

  @JsonProperty("backgroundImage")
  private com.amazon.ask.model.interfaces.display.Image backgroundImage = null;

  @JsonProperty("textContent")
  private com.amazon.ask.model.interfaces.display.TextContent textContent = null;

  @JsonProperty("image")
  private com.amazon.ask.model.interfaces.display.Image image = null;

  public static Builder builder() {
    return new Builder();
  }

  private BodyTemplate6(Builder builder) {
    String discriminatorValue = "BodyTemplate6";

    this.type = discriminatorValue;
    this.token = builder.token;
    this.backButton = builder.backButton;
    this.backgroundImage = builder.backgroundImage;
    this.textContent = builder.textContent;
    this.image = builder.image;
  }

  /**
    * Get backgroundImage
  * @return backgroundImage
  **/
  @JsonProperty("backgroundImage")
  public com.amazon.ask.model.interfaces.display.Image getBackgroundImage() {
    return backgroundImage;
  }

  /**
    * Get textContent
  * @return textContent
  **/
  @JsonProperty("textContent")
  public com.amazon.ask.model.interfaces.display.TextContent getTextContent() {
    return textContent;
  }

  /**
    * Get image
  * @return image
  **/
  @JsonProperty("image")
  public com.amazon.ask.model.interfaces.display.Image getImage() {
    return image;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BodyTemplate6 interfacesDisplayBodyTemplate6 = (BodyTemplate6) o;
    return Objects.equals(this.backgroundImage, interfacesDisplayBodyTemplate6.backgroundImage) &&
        Objects.equals(this.textContent, interfacesDisplayBodyTemplate6.textContent) &&
        Objects.equals(this.image, interfacesDisplayBodyTemplate6.image) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundImage, textContent, image, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BodyTemplate6 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    backgroundImage: ").append(toIndentedString(backgroundImage)).append("\n");
    sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
    private String token;
    private com.amazon.ask.model.interfaces.display.BackButtonBehavior backButton;
    private com.amazon.ask.model.interfaces.display.Image backgroundImage;
    private com.amazon.ask.model.interfaces.display.TextContent textContent;
    private com.amazon.ask.model.interfaces.display.Image image;

    private Builder() { }

    @JsonProperty("token")
    public Builder withToken(String token) {
        this.token = token;
        return this;
    }


    @JsonProperty("backButton")
    public Builder withBackButton(com.amazon.ask.model.interfaces.display.BackButtonBehavior backButton) {
        this.backButton = backButton;
        return this;
    }


    @JsonProperty("backgroundImage")
    public Builder withBackgroundImage(com.amazon.ask.model.interfaces.display.Image backgroundImage) {
        this.backgroundImage = backgroundImage;
        return this;
    }


    @JsonProperty("textContent")
    public Builder withTextContent(com.amazon.ask.model.interfaces.display.TextContent textContent) {
        this.textContent = textContent;
        return this;
    }


    @JsonProperty("image")
    public Builder withImage(com.amazon.ask.model.interfaces.display.Image image) {
        this.image = image;
        return this;
    }


    public BodyTemplate6 build() {
      return new BodyTemplate6(this);
    }
  }
}

