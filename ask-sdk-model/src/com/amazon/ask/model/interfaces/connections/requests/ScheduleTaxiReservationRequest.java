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
 * ScheduleTaxiReservationRequest for booking taxi reservation
 */

@JsonDeserialize(builder = ScheduleTaxiReservationRequest.Builder.class)
public final class ScheduleTaxiReservationRequest extends com.amazon.ask.model.interfaces.connections.requests.BaseRequest  {

    @JsonProperty("pickupTime")
    private String pickupTime = null;

    @JsonProperty("partySize")
    private String partySize = null;

    @JsonProperty("pickupLocation")
    private com.amazon.ask.model.interfaces.connections.entities.PostalAddress pickupLocation = null;

    @JsonProperty("dropOffLocation")
    private com.amazon.ask.model.interfaces.connections.entities.PostalAddress dropOffLocation = null;

    public static Builder builder() {
        return new Builder();
    }

    private ScheduleTaxiReservationRequest(Builder builder) {
        String discriminatorValue = "ScheduleTaxiReservationRequest";

        this.type = discriminatorValue;
        if (builder.version != null) {
            this.version = builder.version;
        }
        if (builder.pickupTime != null) {
            this.pickupTime = builder.pickupTime;
        }
        if (builder.partySize != null) {
            this.partySize = builder.partySize;
        }
        if (builder.pickupLocation != null) {
            this.pickupLocation = builder.pickupLocation;
        }
        if (builder.dropOffLocation != null) {
            this.dropOffLocation = builder.dropOffLocation;
        }
    }

    /**
     * pickup time
     * @return pickupTime
    **/
    @JsonProperty("pickupTime")
    public String getPickupTime() {
        return pickupTime;
    }


    /**
     * party size
     * @return partySize
    **/
    @JsonProperty("partySize")
    public String getPartySize() {
        return partySize;
    }


    /**
     * pick up location
     * @return pickupLocation
    **/
    @JsonProperty("pickupLocation")
    public com.amazon.ask.model.interfaces.connections.entities.PostalAddress getPickupLocation() {
        return pickupLocation;
    }


    /**
     * drop off location
     * @return dropOffLocation
    **/
    @JsonProperty("dropOffLocation")
    public com.amazon.ask.model.interfaces.connections.entities.PostalAddress getDropOffLocation() {
        return dropOffLocation;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScheduleTaxiReservationRequest interfacesConnectionsRequestsScheduleTaxiReservationRequest = (ScheduleTaxiReservationRequest) o;
        return Objects.equals(this.pickupTime, interfacesConnectionsRequestsScheduleTaxiReservationRequest.pickupTime) &&
            Objects.equals(this.partySize, interfacesConnectionsRequestsScheduleTaxiReservationRequest.partySize) &&
            Objects.equals(this.pickupLocation, interfacesConnectionsRequestsScheduleTaxiReservationRequest.pickupLocation) &&
            Objects.equals(this.dropOffLocation, interfacesConnectionsRequestsScheduleTaxiReservationRequest.dropOffLocation) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pickupTime, partySize, pickupLocation, dropOffLocation, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleTaxiReservationRequest {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    pickupTime: ").append(toIndentedString(pickupTime)).append("\n");
        sb.append("    partySize: ").append(toIndentedString(partySize)).append("\n");
        sb.append("    pickupLocation: ").append(toIndentedString(pickupLocation)).append("\n");
        sb.append("    dropOffLocation: ").append(toIndentedString(dropOffLocation)).append("\n");
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
        private String pickupTime;
        private String partySize;
        private com.amazon.ask.model.interfaces.connections.entities.PostalAddress pickupLocation;
        private com.amazon.ask.model.interfaces.connections.entities.PostalAddress dropOffLocation;

        private Builder() {}

        @JsonProperty("@version")

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        @JsonProperty("pickupTime")

        public Builder withPickupTime(String pickupTime) {
            this.pickupTime = pickupTime;
            return this;
        }


        @JsonProperty("partySize")

        public Builder withPartySize(String partySize) {
            this.partySize = partySize;
            return this;
        }


        @JsonProperty("pickupLocation")

        public Builder withPickupLocation(com.amazon.ask.model.interfaces.connections.entities.PostalAddress pickupLocation) {
            this.pickupLocation = pickupLocation;
            return this;
        }


        @JsonProperty("dropOffLocation")

        public Builder withDropOffLocation(com.amazon.ask.model.interfaces.connections.entities.PostalAddress dropOffLocation) {
            this.dropOffLocation = dropOffLocation;
            return this;
        }


        public ScheduleTaxiReservationRequest build() {
            return new ScheduleTaxiReservationRequest(this);
        }
    }
}

