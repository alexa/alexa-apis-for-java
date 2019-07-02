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


package com.amazon.ask.model.interfaces.geolocation;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object containing the speed information of the device.
 */

@JsonDeserialize(builder = Speed.Builder.class)
public final class Speed{

  @JsonProperty("speedInMetersPerSecond")
  private Double speedInMetersPerSecond = null;

  @JsonProperty("accuracyInMetersPerSecond")
  private Double accuracyInMetersPerSecond = null;

  public static Builder builder() {
    return new Builder();
  }

  private Speed(Builder builder) {
    this.speedInMetersPerSecond = builder.speedInMetersPerSecond;
    this.accuracyInMetersPerSecond = builder.accuracyInMetersPerSecond;
  }

  /**
    * A double representing the speed of the device in meters.
  * @return speedInMetersPerSecond
  **/
  @JsonProperty("speedInMetersPerSecond")
  public Double getSpeedInMetersPerSecond() {
    return speedInMetersPerSecond;
  }

  /**
    * A double representing the accuracy of the speed measurement in meters.
  * @return accuracyInMetersPerSecond
  **/
  @JsonProperty("accuracyInMetersPerSecond")
  public Double getAccuracyInMetersPerSecond() {
    return accuracyInMetersPerSecond;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Speed interfacesGeolocationSpeed = (Speed) o;
    return Objects.equals(this.speedInMetersPerSecond, interfacesGeolocationSpeed.speedInMetersPerSecond) &&
        Objects.equals(this.accuracyInMetersPerSecond, interfacesGeolocationSpeed.accuracyInMetersPerSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(speedInMetersPerSecond, accuracyInMetersPerSecond);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Speed {\n");
    
    sb.append("    speedInMetersPerSecond: ").append(toIndentedString(speedInMetersPerSecond)).append("\n");
    sb.append("    accuracyInMetersPerSecond: ").append(toIndentedString(accuracyInMetersPerSecond)).append("\n");
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
    private Double speedInMetersPerSecond;
    private Double accuracyInMetersPerSecond;

    private Builder() { }

    @JsonProperty("speedInMetersPerSecond")
    public Builder withSpeedInMetersPerSecond(Double speedInMetersPerSecond) {
        this.speedInMetersPerSecond = speedInMetersPerSecond;
        return this;
    }


    @JsonProperty("accuracyInMetersPerSecond")
    public Builder withAccuracyInMetersPerSecond(Double accuracyInMetersPerSecond) {
        this.accuracyInMetersPerSecond = accuracyInMetersPerSecond;
        return this;
    }


    public Speed build() {
      return new Speed(this);
    }
  }
}

