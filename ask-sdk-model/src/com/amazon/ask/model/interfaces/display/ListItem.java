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
 * ListItem
 */

@JsonDeserialize(builder = ListItem.Builder.class)
public final class ListItem{

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("image")
  private com.amazon.ask.model.interfaces.display.Image image = null;

  @JsonProperty("textContent")
  private com.amazon.ask.model.interfaces.display.TextContent textContent = null;

  public static Builder builder() {
    return new Builder();
  }

  private ListItem(Builder builder) {
    this.token = builder.token;
    this.image = builder.image;
    this.textContent = builder.textContent;
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
    * Get image
  * @return image
  **/
  @JsonProperty("image")
  public com.amazon.ask.model.interfaces.display.Image getImage() {
    return image;
  }

  /**
    * Get textContent
  * @return textContent
  **/
  @JsonProperty("textContent")
  public com.amazon.ask.model.interfaces.display.TextContent getTextContent() {
    return textContent;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListItem interfacesDisplayListItem = (ListItem) o;
    return Objects.equals(this.token, interfacesDisplayListItem.token) &&
        Objects.equals(this.image, interfacesDisplayListItem.image) &&
        Objects.equals(this.textContent, interfacesDisplayListItem.textContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, image, textContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListItem {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
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
    private com.amazon.ask.model.interfaces.display.Image image;
    private com.amazon.ask.model.interfaces.display.TextContent textContent;

    private Builder() { }

    @JsonProperty("token")
    public Builder withToken(String token) {
        this.token = token;
        return this;
    }


    @JsonProperty("image")
    public Builder withImage(com.amazon.ask.model.interfaces.display.Image image) {
        this.image = image;
        return this;
    }


    @JsonProperty("textContent")
    public Builder withTextContent(com.amazon.ask.model.interfaces.display.TextContent textContent) {
        this.textContent = textContent;
        return this;
    }


    public ListItem build() {
      return new ListItem(this);
    }
  }
}

