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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * This object encapsulates details about an Authorization object including the status, amount captured and fee charged.
 */

@JsonDeserialize(builder = AuthorizationDetails.Builder.class)
public final class AuthorizationDetails {

    @JsonProperty("amazonAuthorizationId")
    private String amazonAuthorizationId = null;

    @JsonProperty("authorizationReferenceId")
    private String authorizationReferenceId = null;

    @JsonProperty("sellerAuthorizationNote")
    private String sellerAuthorizationNote = null;

    @JsonProperty("authorizationAmount")
    private com.amazon.ask.model.interfaces.amazonpay.model.v1.Price authorizationAmount = null;

    @JsonProperty("capturedAmount")
    private com.amazon.ask.model.interfaces.amazonpay.model.v1.Price capturedAmount = null;

    @JsonProperty("authorizationFee")
    private com.amazon.ask.model.interfaces.amazonpay.model.v1.Price authorizationFee = null;

    @JsonProperty("idList")
    private List<String> idList = new ArrayList<String>();

    @JsonProperty("creationTimestamp")
    private OffsetDateTime creationTimestamp = null;

    @JsonProperty("expirationTimestamp")
    private OffsetDateTime expirationTimestamp = null;

    @JsonProperty("authorizationStatus")
    private com.amazon.ask.model.interfaces.amazonpay.model.v1.AuthorizationStatus authorizationStatus = null;

    @JsonProperty("softDecline")
    private Boolean softDecline = null;

    @JsonProperty("captureNow")
    private Boolean captureNow = null;

    @JsonProperty("softDescriptor")
    private String softDescriptor = null;

    public static Builder builder() {
        return new Builder();
    }

    private AuthorizationDetails(Builder builder) {
        if (builder.amazonAuthorizationId != null) {
            this.amazonAuthorizationId = builder.amazonAuthorizationId;
        }
        if (builder.authorizationReferenceId != null) {
            this.authorizationReferenceId = builder.authorizationReferenceId;
        }
        if (builder.sellerAuthorizationNote != null) {
            this.sellerAuthorizationNote = builder.sellerAuthorizationNote;
        }
        if (builder.authorizationAmount != null) {
            this.authorizationAmount = builder.authorizationAmount;
        }
        if (builder.capturedAmount != null) {
            this.capturedAmount = builder.capturedAmount;
        }
        if (builder.authorizationFee != null) {
            this.authorizationFee = builder.authorizationFee;
        }
        if (builder.idList != null) {
            this.idList = builder.idList;
        }
        if (builder.creationTimestamp != null) {
            this.creationTimestamp = builder.creationTimestamp;
        }
        if (builder.expirationTimestamp != null) {
            this.expirationTimestamp = builder.expirationTimestamp;
        }
        if (builder.authorizationStatus != null) {
            this.authorizationStatus = builder.authorizationStatus;
        }
        if (builder.softDecline != null) {
            this.softDecline = builder.softDecline;
        }
        if (builder.captureNow != null) {
            this.captureNow = builder.captureNow;
        }
        if (builder.softDescriptor != null) {
            this.softDescriptor = builder.softDescriptor;
        }
    }

    /**
     * This is AmazonPay generated identifier for this authorization transaction.
     * @return amazonAuthorizationId
    **/
    @JsonProperty("amazonAuthorizationId")
    public String getAmazonAuthorizationId() {
        return amazonAuthorizationId;
    }


    /**
     * This is 3P seller's identifier for this authorization transaction. This identifier must be unique for all of your authorization transactions.
     * @return authorizationReferenceId
    **/
    @JsonProperty("authorizationReferenceId")
    public String getAuthorizationReferenceId() {
        return authorizationReferenceId;
    }


    /**
     * A description for the transaction that is included in emails to the user. Appears only when AuthorizeAndCapture is chosen.
     * @return sellerAuthorizationNote
    **/
    @JsonProperty("sellerAuthorizationNote")
    public String getSellerAuthorizationNote() {
        return sellerAuthorizationNote;
    }


    /**
     * Get authorizationAmount
     * @return authorizationAmount
    **/
    @JsonProperty("authorizationAmount")
    public com.amazon.ask.model.interfaces.amazonpay.model.v1.Price getAuthorizationAmount() {
        return authorizationAmount;
    }


    /**
     * Get capturedAmount
     * @return capturedAmount
    **/
    @JsonProperty("capturedAmount")
    public com.amazon.ask.model.interfaces.amazonpay.model.v1.Price getCapturedAmount() {
        return capturedAmount;
    }


    /**
     * Get authorizationFee
     * @return authorizationFee
    **/
    @JsonProperty("authorizationFee")
    public com.amazon.ask.model.interfaces.amazonpay.model.v1.Price getAuthorizationFee() {
        return authorizationFee;
    }


    /**
     * list of AmazonCaptureId identifiers that have been requested on this Authorization object.
     * @return idList
    **/
    @JsonProperty("idList")
    public List<String> getIdList() {
        return idList;
    }


    /**
     * This is the time at which the authorization was created.
     * @return creationTimestamp
    **/
    @JsonProperty("creationTimestamp")
    public OffsetDateTime getCreationTimestamp() {
        return creationTimestamp;
    }


    /**
     * This is the time at which the authorization expires.
     * @return expirationTimestamp
    **/
    @JsonProperty("expirationTimestamp")
    public OffsetDateTime getExpirationTimestamp() {
        return expirationTimestamp;
    }


    /**
     * Get authorizationStatus
     * @return authorizationStatus
    **/
    @JsonProperty("authorizationStatus")
    public com.amazon.ask.model.interfaces.amazonpay.model.v1.AuthorizationStatus getAuthorizationStatus() {
        return authorizationStatus;
    }


    /**
     * This indicates whether an authorization resulted in a soft decline.
     * @return softDecline
    **/
    @JsonProperty("softDecline")
    public Boolean getSoftDecline() {
        return softDecline;
    }


    /**
     * This indicates whether a direct capture against the payment contract was specified.
     * @return captureNow
    **/
    @JsonProperty("captureNow")
    public Boolean getCaptureNow() {
        return captureNow;
    }


    /**
     * This is the description to be shown on the buyer's payment instrument statement if AuthorizeAndCapture was chosen.
     * @return softDescriptor
    **/
    @JsonProperty("softDescriptor")
    public String getSoftDescriptor() {
        return softDescriptor;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthorizationDetails interfacesAmazonpayModelV1AuthorizationDetails = (AuthorizationDetails) o;
        return Objects.equals(this.amazonAuthorizationId, interfacesAmazonpayModelV1AuthorizationDetails.amazonAuthorizationId) &&
            Objects.equals(this.authorizationReferenceId, interfacesAmazonpayModelV1AuthorizationDetails.authorizationReferenceId) &&
            Objects.equals(this.sellerAuthorizationNote, interfacesAmazonpayModelV1AuthorizationDetails.sellerAuthorizationNote) &&
            Objects.equals(this.authorizationAmount, interfacesAmazonpayModelV1AuthorizationDetails.authorizationAmount) &&
            Objects.equals(this.capturedAmount, interfacesAmazonpayModelV1AuthorizationDetails.capturedAmount) &&
            Objects.equals(this.authorizationFee, interfacesAmazonpayModelV1AuthorizationDetails.authorizationFee) &&
            Objects.equals(this.idList, interfacesAmazonpayModelV1AuthorizationDetails.idList) &&
            Objects.equals(this.creationTimestamp, interfacesAmazonpayModelV1AuthorizationDetails.creationTimestamp) &&
            Objects.equals(this.expirationTimestamp, interfacesAmazonpayModelV1AuthorizationDetails.expirationTimestamp) &&
            Objects.equals(this.authorizationStatus, interfacesAmazonpayModelV1AuthorizationDetails.authorizationStatus) &&
            Objects.equals(this.softDecline, interfacesAmazonpayModelV1AuthorizationDetails.softDecline) &&
            Objects.equals(this.captureNow, interfacesAmazonpayModelV1AuthorizationDetails.captureNow) &&
            Objects.equals(this.softDescriptor, interfacesAmazonpayModelV1AuthorizationDetails.softDescriptor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amazonAuthorizationId, authorizationReferenceId, sellerAuthorizationNote, authorizationAmount, capturedAmount, authorizationFee, idList, creationTimestamp, expirationTimestamp, authorizationStatus, softDecline, captureNow, softDescriptor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizationDetails {\n");
        
        sb.append("    amazonAuthorizationId: ").append(toIndentedString(amazonAuthorizationId)).append("\n");
        sb.append("    authorizationReferenceId: ").append(toIndentedString(authorizationReferenceId)).append("\n");
        sb.append("    sellerAuthorizationNote: ").append(toIndentedString(sellerAuthorizationNote)).append("\n");
        sb.append("    authorizationAmount: ").append(toIndentedString(authorizationAmount)).append("\n");
        sb.append("    capturedAmount: ").append(toIndentedString(capturedAmount)).append("\n");
        sb.append("    authorizationFee: ").append(toIndentedString(authorizationFee)).append("\n");
        sb.append("    idList: ").append(toIndentedString(idList)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    expirationTimestamp: ").append(toIndentedString(expirationTimestamp)).append("\n");
        sb.append("    authorizationStatus: ").append(toIndentedString(authorizationStatus)).append("\n");
        sb.append("    softDecline: ").append(toIndentedString(softDecline)).append("\n");
        sb.append("    captureNow: ").append(toIndentedString(captureNow)).append("\n");
        sb.append("    softDescriptor: ").append(toIndentedString(softDescriptor)).append("\n");
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
        private String amazonAuthorizationId;
        private String authorizationReferenceId;
        private String sellerAuthorizationNote;
        private com.amazon.ask.model.interfaces.amazonpay.model.v1.Price authorizationAmount;
        private com.amazon.ask.model.interfaces.amazonpay.model.v1.Price capturedAmount;
        private com.amazon.ask.model.interfaces.amazonpay.model.v1.Price authorizationFee;
        private List<String> idList;
        private OffsetDateTime creationTimestamp;
        private OffsetDateTime expirationTimestamp;
        private com.amazon.ask.model.interfaces.amazonpay.model.v1.AuthorizationStatus authorizationStatus;
        private Boolean softDecline;
        private Boolean captureNow;
        private String softDescriptor;

        private Builder() {}

        @JsonProperty("amazonAuthorizationId")

        public Builder withAmazonAuthorizationId(String amazonAuthorizationId) {
            this.amazonAuthorizationId = amazonAuthorizationId;
            return this;
        }


        @JsonProperty("authorizationReferenceId")

        public Builder withAuthorizationReferenceId(String authorizationReferenceId) {
            this.authorizationReferenceId = authorizationReferenceId;
            return this;
        }


        @JsonProperty("sellerAuthorizationNote")

        public Builder withSellerAuthorizationNote(String sellerAuthorizationNote) {
            this.sellerAuthorizationNote = sellerAuthorizationNote;
            return this;
        }


        @JsonProperty("authorizationAmount")

        public Builder withAuthorizationAmount(com.amazon.ask.model.interfaces.amazonpay.model.v1.Price authorizationAmount) {
            this.authorizationAmount = authorizationAmount;
            return this;
        }


        @JsonProperty("capturedAmount")

        public Builder withCapturedAmount(com.amazon.ask.model.interfaces.amazonpay.model.v1.Price capturedAmount) {
            this.capturedAmount = capturedAmount;
            return this;
        }


        @JsonProperty("authorizationFee")

        public Builder withAuthorizationFee(com.amazon.ask.model.interfaces.amazonpay.model.v1.Price authorizationFee) {
            this.authorizationFee = authorizationFee;
            return this;
        }


        @JsonProperty("idList")

        public Builder withIdList(List<String> idList) {
            this.idList = idList;
            return this;
        }

        public Builder addIdListItem(String idListItem) {
            if (this.idList == null) {
                this.idList = new ArrayList<String>();
            }
            this.idList.add(idListItem);
            return this;
        }

        @JsonProperty("creationTimestamp")

        public Builder withCreationTimestamp(OffsetDateTime creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }


        @JsonProperty("expirationTimestamp")

        public Builder withExpirationTimestamp(OffsetDateTime expirationTimestamp) {
            this.expirationTimestamp = expirationTimestamp;
            return this;
        }


        @JsonProperty("authorizationStatus")

        public Builder withAuthorizationStatus(com.amazon.ask.model.interfaces.amazonpay.model.v1.AuthorizationStatus authorizationStatus) {
            this.authorizationStatus = authorizationStatus;
            return this;
        }


        @JsonProperty("softDecline")

        public Builder withSoftDecline(Boolean softDecline) {
            this.softDecline = softDecline;
            return this;
        }


        @JsonProperty("captureNow")

        public Builder withCaptureNow(Boolean captureNow) {
            this.captureNow = captureNow;
            return this;
        }


        @JsonProperty("softDescriptor")

        public Builder withSoftDescriptor(String softDescriptor) {
            this.softDescriptor = softDescriptor;
            return this;
        }


        public AuthorizationDetails build() {
            return new AuthorizationDetails(this);
        }
    }
}

