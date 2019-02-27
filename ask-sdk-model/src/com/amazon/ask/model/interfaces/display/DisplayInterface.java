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
 * DisplayInterface
 */

@JsonDeserialize(builder = DisplayInterface.Builder.class)
public final class DisplayInterface{

  @JsonProperty("templateVersion")
  private String templateVersion = null;

  @JsonProperty("markupVersion")
  private String markupVersion = null;

  public static Builder builder() {
    return new Builder();
  }

  private DisplayInterface(Builder builder) {
    this.templateVersion = builder.templateVersion;
    this.markupVersion = builder.markupVersion;
  }

  /**
    * Get templateVersion
  * @return templateVersion
  **/
  public String getTemplateVersion() {
    return templateVersion;
  }

  /**
    * Get markupVersion
  * @return markupVersion
  **/
  public String getMarkupVersion() {
    return markupVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayInterface interfacesDisplayDisplayInterface = (DisplayInterface) o;
    return Objects.equals(this.templateVersion, interfacesDisplayDisplayInterface.templateVersion) &&
        Objects.equals(this.markupVersion, interfacesDisplayDisplayInterface.markupVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateVersion, markupVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayInterface {\n");
    
    sb.append("    templateVersion: ").append(toIndentedString(templateVersion)).append("\n");
    sb.append("    markupVersion: ").append(toIndentedString(markupVersion)).append("\n");
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
    private String templateVersion;
    private String markupVersion;

    private Builder() { }

    @JsonProperty("templateVersion")
    public Builder withTemplateVersion(String templateVersion) {
      this.templateVersion = templateVersion;
      return this;
    }
      

    @JsonProperty("markupVersion")
    public Builder withMarkupVersion(String markupVersion) {
      this.markupVersion = markupVersion;
      return this;
    }
      

    public DisplayInterface build() {
      return new DisplayInterface(this);
    }
  }
}

