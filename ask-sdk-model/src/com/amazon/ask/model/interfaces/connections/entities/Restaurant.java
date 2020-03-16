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


package com.amazon.ask.model.interfaces.connections.entities;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Restaurant entity
 */

@JsonDeserialize(builder = Restaurant.Builder.class)
public final class Restaurant extends com.amazon.ask.model.interfaces.connections.entities.BaseEntity  {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("location")
    private com.amazon.ask.model.interfaces.connections.entities.PostalAddress location = null;

    public static Builder builder() {
        return new Builder();
    }

    private Restaurant(Builder builder) {
        String discriminatorValue = "Restaurant";

        this.type = discriminatorValue;
        if (builder.version != null) {
            this.version = builder.version;
        }
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.location != null) {
            this.location = builder.location;
        }
    }

    /**
     * name of the restaurant
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * location
     * @return location
    **/
    @JsonProperty("location")
    public com.amazon.ask.model.interfaces.connections.entities.PostalAddress getLocation() {
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
        Restaurant interfacesConnectionsEntitiesRestaurant = (Restaurant) o;
        return Objects.equals(this.name, interfacesConnectionsEntitiesRestaurant.name) &&
            Objects.equals(this.location, interfacesConnectionsEntitiesRestaurant.location) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Restaurant {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
  
    public static class Builder {
        private String version;
        private String name;
        private com.amazon.ask.model.interfaces.connections.entities.PostalAddress location;

        private Builder() {}

        @JsonProperty("@version")

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("location")

        public Builder withLocation(com.amazon.ask.model.interfaces.connections.entities.PostalAddress location) {
            this.location = location;
            return this;
        }


        public Restaurant build() {
            return new Restaurant(this);
        }
    }
}

