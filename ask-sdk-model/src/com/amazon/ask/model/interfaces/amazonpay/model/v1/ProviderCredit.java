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


package com.amazon.ask.model.interfaces.amazonpay.model.v1;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProviderCredit
 */

@JsonDeserialize(builder = ProviderCredit.Builder.class)
public final class ProviderCredit {

    @JsonProperty("providerId")
    private String providerId = null;

    @JsonProperty("credit")
    private com.amazon.ask.model.interfaces.amazonpay.model.v1.Price credit = null;

    public static Builder builder() {
        return new Builder();
    }

    private ProviderCredit(Builder builder) {
        if (builder.providerId != null) {
            this.providerId = builder.providerId;
        }
        if (builder.credit != null) {
            this.credit = builder.credit;
        }
    }

    /**
     * This is required only for Ecommerce provider (Solution provider) use cases.
     * @return providerId
    **/
    @JsonProperty("providerId")
    public String getProviderId() {
        return providerId;
    }

    /**
     * Get credit
     * @return credit
    **/
    @JsonProperty("credit")
    public com.amazon.ask.model.interfaces.amazonpay.model.v1.Price getCredit() {
        return credit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProviderCredit interfacesAmazonpayModelV1ProviderCredit = (ProviderCredit) o;
        return Objects.equals(this.providerId, interfacesAmazonpayModelV1ProviderCredit.providerId) &&
            Objects.equals(this.credit, interfacesAmazonpayModelV1ProviderCredit.credit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerId, credit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProviderCredit {\n");
        
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
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
        private String providerId;
        private com.amazon.ask.model.interfaces.amazonpay.model.v1.Price credit;

        private Builder() {}

        @JsonProperty("providerId")
        public Builder withProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }


        @JsonProperty("credit")
        public Builder withCredit(com.amazon.ask.model.interfaces.amazonpay.model.v1.Price credit) {
            this.credit = credit;
            return this;
        }


        public ProviderCredit build() {
            return new ProviderCredit(this);
        }
    }
}

