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


package com.amazon.ask.smapi.model.v1.catalog.upload;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request body for self-hosted catalog uploads
 */

@JsonDeserialize(builder = Location.Builder.class)
public final class Location extends com.amazon.ask.smapi.model.v1.catalog.upload.CatalogUploadBase {

    @JsonProperty("location")
    private String location = null;

    private Location() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Location(Builder builder) {
        super(builder);
        if (builder.location != null) {
            this.location = builder.location;
        }
    }

    /**
     * self hosted url location.
     * @return location
    **/
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Location v1CatalogUploadLocation = (Location) o;
        return Objects.equals(this.location, v1CatalogUploadLocation.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Location {\n");
        
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
  
    public static class Builder extends com.amazon.ask.smapi.model.v1.catalog.upload.CatalogUploadBase.Builder<Builder> {
        private String location;

        private Builder() {}

        @JsonProperty("location")

        public Builder withLocation(String location) {
            this.location = location;
            return this;
        }


        public Location build() {
            return new Location(this);
        }
    }
}

