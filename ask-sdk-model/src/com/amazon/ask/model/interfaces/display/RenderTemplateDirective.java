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
 * RenderTemplateDirective
 */

@JsonDeserialize(builder = RenderTemplateDirective.Builder.class)
public final class RenderTemplateDirective extends com.amazon.ask.model.Directive {

  @JsonProperty("template")
  private com.amazon.ask.model.interfaces.display.Template template = null;

  public static Builder builder() {
    return new Builder();
  }

  private RenderTemplateDirective(Builder builder) {
    String discriminatorValue = "Display.RenderTemplate";

    this.type = discriminatorValue;
    this.template = builder.template;
  }

  /**
    * Get template
  * @return template
  **/
  @JsonProperty("template")
  public com.amazon.ask.model.interfaces.display.Template getTemplate() {
    return template;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenderTemplateDirective interfacesDisplayRenderTemplateDirective = (RenderTemplateDirective) o;
    return Objects.equals(this.template, interfacesDisplayRenderTemplateDirective.template) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(template, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenderTemplateDirective {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
    private com.amazon.ask.model.interfaces.display.Template template;

    private Builder() { }

    @JsonProperty("template")
    public Builder withTemplate(com.amazon.ask.model.interfaces.display.Template template) {
        this.template = template;
        return this;
    }


    public RenderTemplateDirective build() {
      return new RenderTemplateDirective(this);
    }
  }
}

