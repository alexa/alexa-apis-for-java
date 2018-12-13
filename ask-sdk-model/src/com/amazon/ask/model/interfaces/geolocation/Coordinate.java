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
 * An object containing the location information of the device.
 */

@JsonDeserialize(builder = Coordinate.Builder.class)
public final class Coordinate{

  @JsonProperty("latitudeInDegrees")
  private Double latitudeInDegrees = null;

  @JsonProperty("longitudeInDegrees")
  private Double longitudeInDegrees = null;

  @JsonProperty("accuracyInMeters")
  private Double accuracyInMeters = null;

  public static Builder builder() {
    return new Builder();
  }

  private Coordinate(Builder builder) {
    this.latitudeInDegrees = builder.latitudeInDegrees;
    this.longitudeInDegrees = builder.longitudeInDegrees;
    this.accuracyInMeters = builder.accuracyInMeters;
  }

  /**
    * A double representing the latitude in degrees of the device.
  * @return latitudeInDegrees
  **/
  public Double getLatitudeInDegrees() {
    return latitudeInDegrees;
  }

  /**
    * A double representing the longitude in degrees of the device.
  * @return longitudeInDegrees
  **/
  public Double getLongitudeInDegrees() {
    return longitudeInDegrees;
  }

  /**
    * A double representing the accuracy of geolocation data in meters.
  * @return accuracyInMeters
  **/
  public Double getAccuracyInMeters() {
    return accuracyInMeters;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Coordinate interfacesGeolocationCoordinate = (Coordinate) o;
    return Objects.equals(this.latitudeInDegrees, interfacesGeolocationCoordinate.latitudeInDegrees) &&
        Objects.equals(this.longitudeInDegrees, interfacesGeolocationCoordinate.longitudeInDegrees) &&
        Objects.equals(this.accuracyInMeters, interfacesGeolocationCoordinate.accuracyInMeters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitudeInDegrees, longitudeInDegrees, accuracyInMeters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coordinate {\n");
    
    sb.append("    latitudeInDegrees: ").append(toIndentedString(latitudeInDegrees)).append("\n");
    sb.append("    longitudeInDegrees: ").append(toIndentedString(longitudeInDegrees)).append("\n");
    sb.append("    accuracyInMeters: ").append(toIndentedString(accuracyInMeters)).append("\n");
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
    private Double latitudeInDegrees;
    private Double longitudeInDegrees;
    private Double accuracyInMeters;

    private Builder() { }

    @JsonProperty("latitudeInDegrees")
    public Builder withLatitudeInDegrees(Double latitudeInDegrees) {
      this.latitudeInDegrees = latitudeInDegrees;
      return this;
    }
      

    @JsonProperty("longitudeInDegrees")
    public Builder withLongitudeInDegrees(Double longitudeInDegrees) {
      this.longitudeInDegrees = longitudeInDegrees;
      return this;
    }
      

    @JsonProperty("accuracyInMeters")
    public Builder withAccuracyInMeters(Double accuracyInMeters) {
      this.accuracyInMeters = accuracyInMeters;
      return this;
    }
      

    public Coordinate build() {
      return new Coordinate(this);
    }
  }
}

