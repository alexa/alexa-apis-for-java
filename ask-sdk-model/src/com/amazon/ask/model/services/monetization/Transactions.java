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


package com.amazon.ask.model.services.monetization;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Transactions
 */

@JsonDeserialize(builder = Transactions.Builder.class)
public final class Transactions {

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("productId")
    private String productId = null;

    @JsonProperty("createdTime")
    private OffsetDateTime createdTime = null;

    @JsonProperty("lastModifiedTime")
    private OffsetDateTime lastModifiedTime = null;

    private Transactions() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Transactions(Builder builder) {
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.productId != null) {
            this.productId = builder.productId;
        }
        if (builder.createdTime != null) {
            this.createdTime = builder.createdTime;
        }
        if (builder.lastModifiedTime != null) {
            this.lastModifiedTime = builder.lastModifiedTime;
        }
    }

    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.model.services.monetization.Status getStatus() {
        return com.amazon.ask.model.services.monetization.Status.fromValue(status);
    }

    /**
     * Get the underlying String value for status.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return status as a String value
    **/
    @JsonProperty("status")
    public String getStatusAsString() {
      return status;
    }

    /**
     * Product Id
     * @return productId
    **/
    @JsonProperty("productId")
    public String getProductId() {
        return productId;
    }


    /**
     * Time at which transaction's was initiated in ISO 8601 format i.e. yyyy-MM-dd'T'HH:mm:ss.SSS'Z'
     * @return createdTime
    **/
    @JsonProperty("createdTime")
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }


    /**
     * Time at which transaction's status was last updated in ISO 8601 format i.e. yyyy-MM-dd'T'HH:mm:ss.SSS'Z'
     * @return lastModifiedTime
    **/
    @JsonProperty("lastModifiedTime")
    public OffsetDateTime getLastModifiedTime() {
        return lastModifiedTime;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Transactions servicesMonetizationTransactions = (Transactions) o;
        return Objects.equals(this.status, servicesMonetizationTransactions.status) &&
            Objects.equals(this.productId, servicesMonetizationTransactions.productId) &&
            Objects.equals(this.createdTime, servicesMonetizationTransactions.createdTime) &&
            Objects.equals(this.lastModifiedTime, servicesMonetizationTransactions.lastModifiedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, productId, createdTime, lastModifiedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Transactions {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
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
        private String status;
        private String productId;
        private OffsetDateTime createdTime;
        private OffsetDateTime lastModifiedTime;

        private Builder() {}

        @JsonProperty("status")

        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.model.services.monetization.Status status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("productId")

        public Builder withProductId(String productId) {
            this.productId = productId;
            return this;
        }


        @JsonProperty("createdTime")

        public Builder withCreatedTime(OffsetDateTime createdTime) {
            this.createdTime = createdTime;
            return this;
        }


        @JsonProperty("lastModifiedTime")

        public Builder withLastModifiedTime(OffsetDateTime lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }


        public Transactions build() {
            return new Transactions(this);
        }
    }
}

