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


package com.amazon.ask.model.interfaces.connections.requests;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ScheduleFoodEstablishmentReservationRequest for booking restaurant reservation
 */

@JsonDeserialize(builder = ScheduleFoodEstablishmentReservationRequest.Builder.class)
public final class ScheduleFoodEstablishmentReservationRequest extends com.amazon.ask.model.interfaces.connections.requests.BaseRequest {

  @JsonProperty("startTime")
  private String startTime = null;

  @JsonProperty("partySize")
  private String partySize = null;

  @JsonProperty("restaurant")
  private com.amazon.ask.model.interfaces.connections.entities.Restaurant restaurant = null;

  public static Builder builder() {
    return new Builder();
  }

  private ScheduleFoodEstablishmentReservationRequest(Builder builder) {
    String discriminatorValue = "ScheduleFoodEstablishmentReservationRequest";

    this.type = discriminatorValue;
    this.version = builder.version;
    this.startTime = builder.startTime;
    this.partySize = builder.partySize;
    this.restaurant = builder.restaurant;
  }

  /**
    * start time of the reservation
  * @return startTime
  **/
  public String getStartTime() {
    return startTime;
  }

  /**
    * party size
  * @return partySize
  **/
  public String getPartySize() {
    return partySize;
  }

  /**
    * restaurant
  * @return restaurant
  **/
  public com.amazon.ask.model.interfaces.connections.entities.Restaurant getRestaurant() {
    return restaurant;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleFoodEstablishmentReservationRequest interfacesConnectionsRequestsScheduleFoodEstablishmentReservationRequest = (ScheduleFoodEstablishmentReservationRequest) o;
    return Objects.equals(this.startTime, interfacesConnectionsRequestsScheduleFoodEstablishmentReservationRequest.startTime) &&
        Objects.equals(this.partySize, interfacesConnectionsRequestsScheduleFoodEstablishmentReservationRequest.partySize) &&
        Objects.equals(this.restaurant, interfacesConnectionsRequestsScheduleFoodEstablishmentReservationRequest.restaurant) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, partySize, restaurant, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleFoodEstablishmentReservationRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    partySize: ").append(toIndentedString(partySize)).append("\n");
    sb.append("    restaurant: ").append(toIndentedString(restaurant)).append("\n");
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
    private String version;
    private String startTime;
    private String partySize;
    private com.amazon.ask.model.interfaces.connections.entities.Restaurant restaurant;

    private Builder() { }

    @JsonProperty("@version")
    public Builder withVersion(String version) {
        this.version = version;
        return this;
    }


    @JsonProperty("startTime")
    public Builder withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    @JsonProperty("partySize")
    public Builder withPartySize(String partySize) {
        this.partySize = partySize;
        return this;
    }


    @JsonProperty("restaurant")
    public Builder withRestaurant(com.amazon.ask.model.interfaces.connections.entities.Restaurant restaurant) {
        this.restaurant = restaurant;
        return this;
    }


    public ScheduleFoodEstablishmentReservationRequest build() {
      return new ScheduleFoodEstablishmentReservationRequest(this);
    }
  }
}

