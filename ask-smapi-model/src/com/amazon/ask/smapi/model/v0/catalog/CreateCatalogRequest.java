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


package com.amazon.ask.smapi.model.v0.catalog;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateCatalogRequest
 */

@JsonDeserialize(builder = CreateCatalogRequest.Builder.class)
public final class CreateCatalogRequest {

    @JsonProperty("title")
    private String title = null;

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("usage")
    private String usage = null;

    @JsonProperty("vendorId")
    private String vendorId = null;

    private CreateCatalogRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private CreateCatalogRequest(Builder builder) {
        if (builder.title != null) {
            this.title = builder.title;
        }
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.usage != null) {
            this.usage = builder.usage;
        }
        if (builder.vendorId != null) {
            this.vendorId = builder.vendorId;
        }
    }

    /**
     * Title of the catalog.
     * @return title
    **/
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }


    /**
     * Get type
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getTypeAsString().
     *
     * @return type
    **/
    
    public com.amazon.ask.smapi.model.v0.catalog.CatalogType getType() {
        return com.amazon.ask.smapi.model.v0.catalog.CatalogType.fromValue(type);
    }

    /**
     * Get the underlying String value for type.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return type as a String value
    **/
    @JsonProperty("type")
    public String getTypeAsString() {
      return type;
    }

    /**
     * Get usage
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getUsageAsString().
     *
     * @return usage
    **/
    
    public com.amazon.ask.smapi.model.v0.catalog.CatalogUsage getUsage() {
        return com.amazon.ask.smapi.model.v0.catalog.CatalogUsage.fromValue(usage);
    }

    /**
     * Get the underlying String value for usage.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return usage as a String value
    **/
    @JsonProperty("usage")
    public String getUsageAsString() {
      return usage;
    }

    /**
     * ID of the vendor owning the catalog.
     * @return vendorId
    **/
    @JsonProperty("vendorId")
    public String getVendorId() {
        return vendorId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCatalogRequest v0CatalogCreateCatalogRequest = (CreateCatalogRequest) o;
        return Objects.equals(this.title, v0CatalogCreateCatalogRequest.title) &&
            Objects.equals(this.type, v0CatalogCreateCatalogRequest.type) &&
            Objects.equals(this.usage, v0CatalogCreateCatalogRequest.usage) &&
            Objects.equals(this.vendorId, v0CatalogCreateCatalogRequest.vendorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, type, usage, vendorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCatalogRequest {\n");
        
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
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
        private String title;
        private String type;
        private String usage;
        private String vendorId;

        private Builder() {}

        @JsonProperty("title")

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }


        @JsonProperty("type")

        public Builder withType(String type) {
          this.type = type;
          return this;
        }

        public Builder withType(com.amazon.ask.smapi.model.v0.catalog.CatalogType type) {
            this.type = type != null ? type.toString() : null;
            return this;
        }


        @JsonProperty("usage")

        public Builder withUsage(String usage) {
          this.usage = usage;
          return this;
        }

        public Builder withUsage(com.amazon.ask.smapi.model.v0.catalog.CatalogUsage usage) {
            this.usage = usage != null ? usage.toString() : null;
            return this;
        }


        @JsonProperty("vendorId")

        public Builder withVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }


        public CreateCatalogRequest build() {
            return new CreateCatalogRequest(this);
        }
    }
}

