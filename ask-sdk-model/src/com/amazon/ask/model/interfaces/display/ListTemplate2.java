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
 * ListTemplate2
 */

@JsonDeserialize(builder = ListTemplate2.Builder.class)
public final class ListTemplate2 extends com.amazon.ask.model.interfaces.display.Template {

  @JsonProperty("backgroundImage")
  private com.amazon.ask.model.interfaces.display.Image backgroundImage = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("listItems")
  private List<com.amazon.ask.model.interfaces.display.ListItem> listItems = new ArrayList<com.amazon.ask.model.interfaces.display.ListItem>();

  public static Builder builder() {
    return new Builder();
  }

  private ListTemplate2(Builder builder) {
    String discriminatorValue = "ListTemplate2";

    this.type = discriminatorValue;
    this.token = builder.token;
    this.backButton = builder.backButton;
    this.backgroundImage = builder.backgroundImage;
    this.title = builder.title;
    this.listItems = builder.listItems;
  }

  /**
    * Get backgroundImage
  * @return backgroundImage
  **/
  public com.amazon.ask.model.interfaces.display.Image getBackgroundImage() {
    return backgroundImage;
  }

  /**
    * Get title
  * @return title
  **/
  public String getTitle() {
    return title;
  }

  /**
    * Get listItems
  * @return listItems
  **/
  public List<com.amazon.ask.model.interfaces.display.ListItem> getListItems() {
    return listItems;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTemplate2 interfacesDisplayListTemplate2 = (ListTemplate2) o;
    return Objects.equals(this.backgroundImage, interfacesDisplayListTemplate2.backgroundImage) &&
        Objects.equals(this.title, interfacesDisplayListTemplate2.title) &&
        Objects.equals(this.listItems, interfacesDisplayListTemplate2.listItems) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundImage, title, listItems, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTemplate2 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    backgroundImage: ").append(toIndentedString(backgroundImage)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    listItems: ").append(toIndentedString(listItems)).append("\n");
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
    private String title;
    private List<com.amazon.ask.model.interfaces.display.ListItem> listItems;

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
      

    @JsonProperty("title")
    public Builder withTitle(String title) {
      this.title = title;
      return this;
    }
      

    @JsonProperty("listItems")
    public Builder withListItems(List<com.amazon.ask.model.interfaces.display.ListItem> listItems) {
      this.listItems = listItems;
      return this;
    }
      
    public Builder addListItemsItem(com.amazon.ask.model.interfaces.display.ListItem listItemsItem) {
      if (this.listItems == null) {
        this.listItems = new ArrayList<com.amazon.ask.model.interfaces.display.ListItem>();
      }
      this.listItems.add(listItemsItem);
      return this;
    }

    public ListTemplate2 build() {
      return new ListTemplate2(this);
    }
  }
}

