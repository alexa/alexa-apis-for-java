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
 * An object containing the altitude information of the device.
 */

@JsonDeserialize(builder = Altitude.Builder.class)
public final class Altitude {

    @JsonProperty("altitudeInMeters")
    private Double altitudeInMeters = null;

    @JsonProperty("accuracyInMeters")
    private Double accuracyInMeters = null;

    public static Builder builder() {
        return new Builder();
    }

    private Altitude(Builder builder) {
        if (builder.altitudeInMeters != null) {
            this.altitudeInMeters = builder.altitudeInMeters;
        }
        if (builder.accuracyInMeters != null) {
            this.accuracyInMeters = builder.accuracyInMeters;
        }
    }

    /**
     * A double representing the altitude of the device in meters.
     * @return altitudeInMeters
    **/
    @JsonProperty("altitudeInMeters")
    public Double getAltitudeInMeters() {
        return altitudeInMeters;
    }


    /**
     * A double representing the accuracy of the altitude measurement in meters.
     * @return accuracyInMeters
    **/
    @JsonProperty("accuracyInMeters")
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
        Altitude interfacesGeolocationAltitude = (Altitude) o;
        return Objects.equals(this.altitudeInMeters, interfacesGeolocationAltitude.altitudeInMeters) &&
            Objects.equals(this.accuracyInMeters, interfacesGeolocationAltitude.accuracyInMeters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(altitudeInMeters, accuracyInMeters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Altitude {\n");
        
        sb.append("    altitudeInMeters: ").append(toIndentedString(altitudeInMeters)).append("\n");
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
        private Double altitudeInMeters;
        private Double accuracyInMeters;

        private Builder() {}

        @JsonProperty("altitudeInMeters")

        public Builder withAltitudeInMeters(Double altitudeInMeters) {
            this.altitudeInMeters = altitudeInMeters;
            return this;
        }


        @JsonProperty("accuracyInMeters")

        public Builder withAccuracyInMeters(Double accuracyInMeters) {
            this.accuracyInMeters = accuracyInMeters;
            return this;
        }


        public Altitude build() {
            return new Altitude(this);
        }
    }
}

