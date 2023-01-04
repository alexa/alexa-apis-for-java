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
 * The common object to define the basic geolocation states
 */

@JsonDeserialize(builder = GeolocationCommonState.Builder.class)
public final class GeolocationCommonState {

    @JsonProperty("timestamp")
    private String timestamp = null;

    @JsonProperty("coordinate")
    private com.amazon.ask.model.interfaces.geolocation.Coordinate coordinate = null;

    @JsonProperty("altitude")
    private com.amazon.ask.model.interfaces.geolocation.Altitude altitude = null;

    @JsonProperty("heading")
    private com.amazon.ask.model.interfaces.geolocation.Heading heading = null;

    @JsonProperty("speed")
    private com.amazon.ask.model.interfaces.geolocation.Speed speed = null;

    private GeolocationCommonState() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private GeolocationCommonState(Builder builder) {
        if (builder.timestamp != null) {
            this.timestamp = builder.timestamp;
        }
        if (builder.coordinate != null) {
            this.coordinate = builder.coordinate;
        }
        if (builder.altitude != null) {
            this.altitude = builder.altitude;
        }
        if (builder.heading != null) {
            this.heading = builder.heading;
        }
        if (builder.speed != null) {
            this.speed = builder.speed;
        }
    }

    /**
     * Specifies the time when the geolocation data was last collected on the device.
     * @return timestamp
    **/
    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }


    /**
     * Get coordinate
     * @return coordinate
    **/
    @JsonProperty("coordinate")
    public com.amazon.ask.model.interfaces.geolocation.Coordinate getCoordinate() {
        return coordinate;
    }


    /**
     * Get altitude
     * @return altitude
    **/
    @JsonProperty("altitude")
    public com.amazon.ask.model.interfaces.geolocation.Altitude getAltitude() {
        return altitude;
    }


    /**
     * Get heading
     * @return heading
    **/
    @JsonProperty("heading")
    public com.amazon.ask.model.interfaces.geolocation.Heading getHeading() {
        return heading;
    }


    /**
     * Get speed
     * @return speed
    **/
    @JsonProperty("speed")
    public com.amazon.ask.model.interfaces.geolocation.Speed getSpeed() {
        return speed;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GeolocationCommonState interfacesGeolocationGeolocationCommonState = (GeolocationCommonState) o;
        return Objects.equals(this.timestamp, interfacesGeolocationGeolocationCommonState.timestamp) &&
            Objects.equals(this.coordinate, interfacesGeolocationGeolocationCommonState.coordinate) &&
            Objects.equals(this.altitude, interfacesGeolocationGeolocationCommonState.altitude) &&
            Objects.equals(this.heading, interfacesGeolocationGeolocationCommonState.heading) &&
            Objects.equals(this.speed, interfacesGeolocationGeolocationCommonState.speed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, coordinate, altitude, heading, speed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeolocationCommonState {\n");
        
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    coordinate: ").append(toIndentedString(coordinate)).append("\n");
        sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
        sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
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
        private String timestamp;
        private com.amazon.ask.model.interfaces.geolocation.Coordinate coordinate;
        private com.amazon.ask.model.interfaces.geolocation.Altitude altitude;
        private com.amazon.ask.model.interfaces.geolocation.Heading heading;
        private com.amazon.ask.model.interfaces.geolocation.Speed speed;

        private Builder() {}

        @JsonProperty("timestamp")

        public Builder withTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }


        @JsonProperty("coordinate")

        public Builder withCoordinate(com.amazon.ask.model.interfaces.geolocation.Coordinate coordinate) {
            this.coordinate = coordinate;
            return this;
        }


        @JsonProperty("altitude")

        public Builder withAltitude(com.amazon.ask.model.interfaces.geolocation.Altitude altitude) {
            this.altitude = altitude;
            return this;
        }


        @JsonProperty("heading")

        public Builder withHeading(com.amazon.ask.model.interfaces.geolocation.Heading heading) {
            this.heading = heading;
            return this;
        }


        @JsonProperty("speed")

        public Builder withSpeed(com.amazon.ask.model.interfaces.geolocation.Speed speed) {
            this.speed = speed;
            return this;
        }


        public GeolocationCommonState build() {
            return new GeolocationCommonState(this);
        }
    }
}

