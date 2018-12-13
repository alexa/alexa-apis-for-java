/*
* Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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


package com.amazon.ask.model.interfaces.geolocation;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object containing the heading direction information of the device.
 */

@JsonDeserialize(builder = Heading.Builder.class)
public final class Heading{

  @JsonProperty("directionInDegrees")
  private Double directionInDegrees = null;

  @JsonProperty("accuracyInDegrees")
  private Double accuracyInDegrees = null;

  public static Builder builder() {
    return new Builder();
  }

  private Heading(Builder builder) {
    this.directionInDegrees = builder.directionInDegrees;
    this.accuracyInDegrees = builder.accuracyInDegrees;
  }

  /**
    * A double representing the direction of the device in degrees.
  * @return directionInDegrees
  **/
  public Double getDirectionInDegrees() {
    return directionInDegrees;
  }

  /**
    * A double representing the accuracy of the heading measurement in degrees.
  * @return accuracyInDegrees
  **/
  public Double getAccuracyInDegrees() {
    return accuracyInDegrees;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Heading interfacesGeolocationHeading = (Heading) o;
    return Objects.equals(this.directionInDegrees, interfacesGeolocationHeading.directionInDegrees) &&
        Objects.equals(this.accuracyInDegrees, interfacesGeolocationHeading.accuracyInDegrees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directionInDegrees, accuracyInDegrees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Heading {\n");
    
    sb.append("    directionInDegrees: ").append(toIndentedString(directionInDegrees)).append("\n");
    sb.append("    accuracyInDegrees: ").append(toIndentedString(accuracyInDegrees)).append("\n");
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
    private Double directionInDegrees;
    private Double accuracyInDegrees;

    private Builder() { }

    @JsonProperty("directionInDegrees")
    public Builder withDirectionInDegrees(Double directionInDegrees) {
      this.directionInDegrees = directionInDegrees;
      return this;
    }
      

    @JsonProperty("accuracyInDegrees")
    public Builder withAccuracyInDegrees(Double accuracyInDegrees) {
      this.accuracyInDegrees = accuracyInDegrees;
      return this;
    }
      

    public Heading build() {
      return new Heading(this);
    }
  }
}

