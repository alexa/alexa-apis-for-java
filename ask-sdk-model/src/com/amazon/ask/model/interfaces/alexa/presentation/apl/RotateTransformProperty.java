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
 * RotateTransformProperty
 */

@JsonDeserialize(builder = RotateTransformProperty.Builder.class)
public final class RotateTransformProperty extends com.amazon.ask.model.interfaces.alexa.presentation.apl.TransformProperty{

  @JsonProperty("rotate")
  private String rotate = String.valueOf(0.0d);

  public static Builder builder() {
    return new Builder();
  }

  private RotateTransformProperty(Builder builder) {
    this.rotate = builder.rotate;
  }

  /**
    * Rotation angle, in degrees. Positive angles rotate in the clockwise direction.
  * @return rotate
  **/
  public String getRotate() {
    return rotate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RotateTransformProperty interfacesAlexaPresentationAplRotateTransformProperty = (RotateTransformProperty) o;
    return Objects.equals(this.rotate, interfacesAlexaPresentationAplRotateTransformProperty.rotate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rotate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotateTransformProperty {\n");
    
    sb.append("    rotate: ").append(toIndentedString(rotate)).append("\n");
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
    private String rotate;

    private Builder() { }

    @JsonProperty("rotate")
    public Builder withRotate(Double rotate) {
        this.rotate = String.valueOf(rotate);
        return this;
    }

    public Builder withRotate(String rotateExpression) {
        this.rotate = rotateExpression;
        return this;
    }

    public RotateTransformProperty build() {
      return new RotateTransformProperty(this);
    }
  }
}

