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


package com.amazon.ask.smapi.model.v1.vendorManagement;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * List of Vendors.
 */

@JsonDeserialize(builder = Vendors.Builder.class)
public final class Vendors {

    @JsonProperty("vendors")
    private List<com.amazon.ask.smapi.model.v1.vendorManagement.Vendor> vendors = new ArrayList<com.amazon.ask.smapi.model.v1.vendorManagement.Vendor>();

    public static Builder builder() {
        return new Builder();
    }

    private Vendors(Builder builder) {
        if (builder.vendors != null) {
            this.vendors = builder.vendors;
        }
    }

    /**
     * Get vendors
     * @return vendors
    **/
    @JsonProperty("vendors")
    public List<com.amazon.ask.smapi.model.v1.vendorManagement.Vendor> getVendors() {
        return vendors;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vendors v1VendorManagementVendors = (Vendors) o;
        return Objects.equals(this.vendors, v1VendorManagementVendors.vendors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Vendors {\n");
        
        sb.append("    vendors: ").append(toIndentedString(vendors)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.vendorManagement.Vendor> vendors;

        private Builder() {}

        @JsonProperty("vendors")

        public Builder withVendors(List<com.amazon.ask.smapi.model.v1.vendorManagement.Vendor> vendors) {
            this.vendors = vendors;
            return this;
        }

        public Builder addVendorsItem(com.amazon.ask.smapi.model.v1.vendorManagement.Vendor vendorsItem) {
            if (this.vendors == null) {
                this.vendors = new ArrayList<com.amazon.ask.smapi.model.v1.vendorManagement.Vendor>();
            }
            this.vendors.add(vendorsItem);
            return this;
        }

        public Vendors build() {
            return new Vendors(this);
        }
    }
}

