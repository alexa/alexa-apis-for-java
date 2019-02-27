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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Template
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.display.ListTemplate2.class, name = "ListTemplate2"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.display.ListTemplate1.class, name = "ListTemplate1"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.display.BodyTemplate7.class, name = "BodyTemplate7"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.display.BodyTemplate6.class, name = "BodyTemplate6"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.display.BodyTemplate3.class, name = "BodyTemplate3"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.display.BodyTemplate2.class, name = "BodyTemplate2"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.display.BodyTemplate1.class, name = "BodyTemplate1"),
})

public abstract class Template{

  protected String type = null;

  @JsonProperty("token")
  protected String token = null;

  @JsonProperty("backButton")
  protected com.amazon.ask.model.interfaces.display.BackButtonBehavior backButton = null;

  protected Template() {
  }

  /**
    * Get type
  * @return type
  **/
  @JsonIgnore
  public String getType() {
    return type;
  }

  /**
    * Get token
  * @return token
  **/
  public String getToken() {
    return token;
  }

  /**
    * Get backButton
  * @return backButton
  **/
  public com.amazon.ask.model.interfaces.display.BackButtonBehavior getBackButton() {
    return backButton;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Template interfacesDisplayTemplate = (Template) o;
    return Objects.equals(this.type, interfacesDisplayTemplate.type) &&
        Objects.equals(this.token, interfacesDisplayTemplate.token) &&
        Objects.equals(this.backButton, interfacesDisplayTemplate.backButton);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, token, backButton);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Template {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    backButton: ").append(toIndentedString(backButton)).append("\n");
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

}

