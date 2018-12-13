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
 * An object containing status and access.
 */

@JsonDeserialize(builder = LocationServices.Builder.class)
public final class LocationServices{

  @JsonProperty("status")
  private com.amazon.ask.model.interfaces.geolocation.Status status = null;

  @JsonProperty("access")
  private com.amazon.ask.model.interfaces.geolocation.Access access = null;

  public static Builder builder() {
    return new Builder();
  }

  private LocationServices(Builder builder) {
    this.status = builder.status;
    this.access = builder.access;
  }

  /**
    * A string representing the status of whether location services is currently running or not on the host OS of device.
  * @return status
  **/
  public com.amazon.ask.model.interfaces.geolocation.Status getStatus() {
    return status;
  }

  /**
    * A string representing if Alexa has access to location services running on the hostOS of device.
  * @return access
  **/
  public com.amazon.ask.model.interfaces.geolocation.Access getAccess() {
    return access;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationServices interfacesGeolocationLocationServices = (LocationServices) o;
    return Objects.equals(this.status, interfacesGeolocationLocationServices.status) &&
        Objects.equals(this.access, interfacesGeolocationLocationServices.access);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, access);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationServices {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
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
    private com.amazon.ask.model.interfaces.geolocation.Status status;
    private com.amazon.ask.model.interfaces.geolocation.Access access;

    private Builder() { }

    @JsonProperty("status")
    public Builder withStatus(com.amazon.ask.model.interfaces.geolocation.Status status) {
      this.status = status;
      return this;
    }
      

    @JsonProperty("access")
    public Builder withAccess(com.amazon.ask.model.interfaces.geolocation.Access access) {
      this.access = access;
      return this;
    }
      

    public LocationServices build() {
      return new LocationServices(this);
    }
  }
}

