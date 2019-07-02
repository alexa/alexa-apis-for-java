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


package com.amazon.ask.model.interfaces.alexa.presentation.apl;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AnimatedOpacityProperty
 */

@JsonDeserialize(builder = AnimatedOpacityProperty.Builder.class)
public final class AnimatedOpacityProperty extends com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimatedProperty {

  @JsonProperty("from")
  private String from = null;

  @JsonProperty("to")
  private String to = null;

  public static Builder builder() {
    return new Builder();
  }

  private AnimatedOpacityProperty(Builder builder) {
    String discriminatorValue = "opacity";

    this.property = discriminatorValue;
    this.from = builder.from;
    this.to = builder.to;
  }

  /**
    * The starting value of the property.
  * @return from
  **/
  @JsonProperty("from")
  public String getFrom() {
    return from;
  }

  /**
    * The ending value of the property.
  * @return to
  **/
  @JsonProperty("to")
  public String getTo() {
    return to;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimatedOpacityProperty interfacesAlexaPresentationAplAnimatedOpacityProperty = (AnimatedOpacityProperty) o;
    return Objects.equals(this.from, interfacesAlexaPresentationAplAnimatedOpacityProperty.from) &&
        Objects.equals(this.to, interfacesAlexaPresentationAplAnimatedOpacityProperty.to) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimatedOpacityProperty {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
    private String from;
    private String to;

    private Builder() { }

    @JsonProperty("from")
    public Builder withFrom(Double from) {
        this.from = String.valueOf(from);
        return this;
    }

    public Builder withFrom(String fromExpression) {
        this.from = fromExpression;
        return this;
    }

    @JsonProperty("to")
    public Builder withTo(Double to) {
        this.to = String.valueOf(to);
        return this;
    }

    public Builder withTo(String toExpression) {
        this.to = toExpression;
        return this;
    }

    public AnimatedOpacityProperty build() {
      return new AnimatedOpacityProperty(this);
    }
  }
}

