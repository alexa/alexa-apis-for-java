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
 * Vendor Response Object.
 */

@JsonDeserialize(builder = Vendor.Builder.class)
public final class Vendor {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("roles")
    private List<String> roles = new ArrayList<String>();

    private Vendor() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Vendor(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.id != null) {
            this.id = builder.id;
        }
        if (builder.roles != null) {
            this.roles = builder.roles;
        }
    }

    /**
     * Name of vendor.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Unique identifier of vendor associated with the API caller account.
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }


    /**
     * Roles that user has for this vendor.
     * @return roles
    **/
    @JsonProperty("roles")
    public List<String> getRoles() {
        return roles;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vendor v1VendorManagementVendor = (Vendor) o;
        return Objects.equals(this.name, v1VendorManagementVendor.name) &&
            Objects.equals(this.id, v1VendorManagementVendor.id) &&
            Objects.equals(this.roles, v1VendorManagementVendor.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, roles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Vendor {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
        private String name;
        private String id;
        private List<String> roles;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("id")

        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        @JsonProperty("roles")

        public Builder withRoles(List<String> roles) {
            this.roles = roles;
            return this;
        }

        public Builder addRolesItem(String rolesItem) {
            if (this.roles == null) {
                this.roles = new ArrayList<String>();
            }
            this.roles.add(rolesItem);
            return this;
        }

        public Vendor build() {
            return new Vendor(this);
        }
    }
}

