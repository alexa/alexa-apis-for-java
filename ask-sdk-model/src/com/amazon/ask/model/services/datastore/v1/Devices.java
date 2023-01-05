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


package com.amazon.ask.model.services.datastore.v1;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Devices
 */

@JsonDeserialize(builder = Devices.Builder.class)
public final class Devices extends com.amazon.ask.model.services.datastore.v1.Target  {

    @JsonProperty("items")
    private List<String> items = new ArrayList<String>();

    private Devices() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Devices(Builder builder) {
        String discriminatorValue = "DEVICES";

        this.type = discriminatorValue;
        if (builder.items != null) {
            this.items = builder.items;
        }
    }

    /**
     * Unordered array of device identifiers.
     * @return items
    **/
    @JsonProperty("items")
    public List<String> getItems() {
        return items;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Devices servicesDatastoreV1Devices = (Devices) o;
        return Objects.equals(this.items, servicesDatastoreV1Devices.items) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Devices {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
        private List<String> items;

        private Builder() {}

        @JsonProperty("items")

        public Builder withItems(List<String> items) {
            this.items = items;
            return this;
        }

        public Builder addItemsItem(String itemsItem) {
            if (this.items == null) {
                this.items = new ArrayList<String>();
            }
            this.items.add(itemsItem);
            return this;
        }

        public Devices build() {
            return new Devices(this);
        }
    }
}

