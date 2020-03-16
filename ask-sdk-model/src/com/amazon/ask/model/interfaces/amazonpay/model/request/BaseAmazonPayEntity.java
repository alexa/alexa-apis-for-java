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


package com.amazon.ask.model.interfaces.amazonpay.model.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BaseAmazonPayEntity
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.amazonpay.model.request.SellerBillingAgreementAttributes.class, name = "SellerBillingAgreementAttributes"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.amazonpay.model.request.Price.class, name = "Price"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.amazonpay.request.ChargeAmazonPayRequest.class, name = "ChargeAmazonPayRequest"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.amazonpay.model.request.BillingAgreementAttributes.class, name = "BillingAgreementAttributes"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.amazonpay.model.request.SellerOrderAttributes.class, name = "SellerOrderAttributes"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.amazonpay.model.request.ProviderAttributes.class, name = "ProviderAttributes"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.amazonpay.model.request.AuthorizeAttributes.class, name = "AuthorizeAttributes"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.amazonpay.request.SetupAmazonPayRequest.class, name = "SetupAmazonPayRequest"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.amazonpay.model.request.ProviderCredit.class, name = "ProviderCredit"),
})
public abstract class BaseAmazonPayEntity {

    protected String type = null;

    @JsonProperty("@version")
    protected String version = null;

    protected BaseAmazonPayEntity() {
    }

    /**
     * Get type
     * @return type
    **/
    @JsonIgnore
    public String getType() {
        return type;
    }


    /**
     * Version of the Amazon Pay Entity. Can be 1 or greater.
     * @return version
    **/
    @JsonProperty("@version")
    public String getVersion() {
        return version;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseAmazonPayEntity interfacesAmazonpayModelRequestBaseAmazonPayEntity = (BaseAmazonPayEntity) o;
        return Objects.equals(this.type, interfacesAmazonpayModelRequestBaseAmazonPayEntity.type) &&
            Objects.equals(this.version, interfacesAmazonpayModelRequestBaseAmazonPayEntity.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseAmazonPayEntity {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
  
}

