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


package com.amazon.ask.model.interfaces.amazonpay.model.response;

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
public final class AuthorizationDetails{

  @JsonProperty("amazonAuthorizationId")
  private String amazonAuthorizationId = null;

  @JsonProperty("authorizationReferenceId")
  private String authorizationReferenceId = null;

  @JsonProperty("sellerAuthorizationNote")
  private String sellerAuthorizationNote = null;

  @JsonProperty("authorizationAmount")
  private com.amazon.ask.model.interfaces.amazonpay.model.response.Price authorizationAmount = null;

  @JsonProperty("capturedAmount")
  private com.amazon.ask.model.interfaces.amazonpay.model.response.Price capturedAmount = null;

  @JsonProperty("authorizationFee")
  private com.amazon.ask.model.interfaces.amazonpay.model.response.Price authorizationFee = null;

  @JsonProperty("idList")
  private List<String> idList = new ArrayList<String>();

  @JsonProperty("creationTimestamp")
  private OffsetDateTime creationTimestamp = null;

  @JsonProperty("expirationTimestamp")
  private OffsetDateTime expirationTimestamp = null;

  @JsonProperty("authorizationStatus")
  private com.amazon.ask.model.interfaces.amazonpay.model.response.AuthorizationStatus authorizationStatus = null;

  @JsonProperty("softDecline")
  private Boolean softDecline = null;

  @JsonProperty("captureNow")
  private Boolean captureNow = null;

  @JsonProperty("softDescriptor")
  private String softDescriptor = null;

  @JsonProperty("authorizationBillingAddress")
  private com.amazon.ask.model.interfaces.amazonpay.model.response.Destination authorizationBillingAddress = null;

  public static Builder builder() {
    return new Builder();
  }

  private AuthorizationDetails(Builder builder) {
    this.amazonAuthorizationId = builder.amazonAuthorizationId;
    this.authorizationReferenceId = builder.authorizationReferenceId;
    this.sellerAuthorizationNote = builder.sellerAuthorizationNote;
    this.authorizationAmount = builder.authorizationAmount;
    this.capturedAmount = builder.capturedAmount;
    this.authorizationFee = builder.authorizationFee;
    this.idList = builder.idList;
    this.creationTimestamp = builder.creationTimestamp;
    this.expirationTimestamp = builder.expirationTimestamp;
    this.authorizationStatus = builder.authorizationStatus;
    this.softDecline = builder.softDecline;
    this.captureNow = builder.captureNow;
    this.softDescriptor = builder.softDescriptor;
    this.authorizationBillingAddress = builder.authorizationBillingAddress;
  }

  /**
    * This is AmazonPay generated identifier for this authorization transaction.
  * @return amazonAuthorizationId
  **/
  public String getAmazonAuthorizationId() {
    return amazonAuthorizationId;
  }

  /**
    * This is 3P seller's identifier for this authorization transaction. This identifier must be unique for all of your authorization transactions.
  * @return authorizationReferenceId
  **/
  public String getAuthorizationReferenceId() {
    return authorizationReferenceId;
  }

  /**
    * A description for the transaction that is included in emails to the user. Appears only when AuthorizeAndCapture is chosen.
  * @return sellerAuthorizationNote
  **/
  public String getSellerAuthorizationNote() {
    return sellerAuthorizationNote;
  }

  /**
    * Get authorizationAmount
  * @return authorizationAmount
  **/
  public com.amazon.ask.model.interfaces.amazonpay.model.response.Price getAuthorizationAmount() {
    return authorizationAmount;
  }

  /**
    * Get capturedAmount
  * @return capturedAmount
  **/
  public com.amazon.ask.model.interfaces.amazonpay.model.response.Price getCapturedAmount() {
    return capturedAmount;
  }

  /**
    * Get authorizationFee
  * @return authorizationFee
  **/
  public com.amazon.ask.model.interfaces.amazonpay.model.response.Price getAuthorizationFee() {
    return authorizationFee;
  }

  /**
    * list of AmazonCaptureId identifiers that have been requested on this Authorization object.
  * @return idList
  **/
  public List<String> getIdList() {
    return idList;
  }

  /**
    * This is the time at which the authorization was created.
  * @return creationTimestamp
  **/
  public OffsetDateTime getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
    * This is the time at which the authorization expires.
  * @return expirationTimestamp
  **/
  public OffsetDateTime getExpirationTimestamp() {
    return expirationTimestamp;
  }

  /**
    * Get authorizationStatus
  * @return authorizationStatus
  **/
  public com.amazon.ask.model.interfaces.amazonpay.model.response.AuthorizationStatus getAuthorizationStatus() {
    return authorizationStatus;
  }

  /**
    * This indicates whether an authorization resulted in a soft decline.
  * @return softDecline
  **/
  public Boolean getSoftDecline() {
    return softDecline;
  }

  /**
    * This indicates whether a direct capture against the payment contract was specified.
  * @return captureNow
  **/
  public Boolean getCaptureNow() {
    return captureNow;
  }

  /**
    * This is the description to be shown on the buyer's payment instrument statement if AuthorizeAndCapture was chosen.
  * @return softDescriptor
  **/
  public String getSoftDescriptor() {
    return softDescriptor;
  }

  /**
    * Get authorizationBillingAddress
  * @return authorizationBillingAddress
  **/
  public com.amazon.ask.model.interfaces.amazonpay.model.response.Destination getAuthorizationBillingAddress() {
    return authorizationBillingAddress;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationDetails interfacesAmazonpayModelResponseAuthorizationDetails = (AuthorizationDetails) o;
    return Objects.equals(this.amazonAuthorizationId, interfacesAmazonpayModelResponseAuthorizationDetails.amazonAuthorizationId) &&
        Objects.equals(this.authorizationReferenceId, interfacesAmazonpayModelResponseAuthorizationDetails.authorizationReferenceId) &&
        Objects.equals(this.sellerAuthorizationNote, interfacesAmazonpayModelResponseAuthorizationDetails.sellerAuthorizationNote) &&
        Objects.equals(this.authorizationAmount, interfacesAmazonpayModelResponseAuthorizationDetails.authorizationAmount) &&
        Objects.equals(this.capturedAmount, interfacesAmazonpayModelResponseAuthorizationDetails.capturedAmount) &&
        Objects.equals(this.authorizationFee, interfacesAmazonpayModelResponseAuthorizationDetails.authorizationFee) &&
        Objects.equals(this.idList, interfacesAmazonpayModelResponseAuthorizationDetails.idList) &&
        Objects.equals(this.creationTimestamp, interfacesAmazonpayModelResponseAuthorizationDetails.creationTimestamp) &&
        Objects.equals(this.expirationTimestamp, interfacesAmazonpayModelResponseAuthorizationDetails.expirationTimestamp) &&
        Objects.equals(this.authorizationStatus, interfacesAmazonpayModelResponseAuthorizationDetails.authorizationStatus) &&
        Objects.equals(this.softDecline, interfacesAmazonpayModelResponseAuthorizationDetails.softDecline) &&
        Objects.equals(this.captureNow, interfacesAmazonpayModelResponseAuthorizationDetails.captureNow) &&
        Objects.equals(this.softDescriptor, interfacesAmazonpayModelResponseAuthorizationDetails.softDescriptor) &&
        Objects.equals(this.authorizationBillingAddress, interfacesAmazonpayModelResponseAuthorizationDetails.authorizationBillingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amazonAuthorizationId, authorizationReferenceId, sellerAuthorizationNote, authorizationAmount, capturedAmount, authorizationFee, idList, creationTimestamp, expirationTimestamp, authorizationStatus, softDecline, captureNow, softDescriptor, authorizationBillingAddress);
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
    sb.append("    authorizationBillingAddress: ").append(toIndentedString(authorizationBillingAddress)).append("\n");
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
    private com.amazon.ask.model.interfaces.amazonpay.model.response.Price authorizationAmount;
    private com.amazon.ask.model.interfaces.amazonpay.model.response.Price capturedAmount;
    private com.amazon.ask.model.interfaces.amazonpay.model.response.Price authorizationFee;
    private List<String> idList;
    private OffsetDateTime creationTimestamp;
    private OffsetDateTime expirationTimestamp;
    private com.amazon.ask.model.interfaces.amazonpay.model.response.AuthorizationStatus authorizationStatus;
    private Boolean softDecline;
    private Boolean captureNow;
    private String softDescriptor;
    private com.amazon.ask.model.interfaces.amazonpay.model.response.Destination authorizationBillingAddress;

    private Builder() { }

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
    public Builder withAuthorizationAmount(com.amazon.ask.model.interfaces.amazonpay.model.response.Price authorizationAmount) {
        this.authorizationAmount = authorizationAmount;
        return this;
    }


    @JsonProperty("capturedAmount")
    public Builder withCapturedAmount(com.amazon.ask.model.interfaces.amazonpay.model.response.Price capturedAmount) {
        this.capturedAmount = capturedAmount;
        return this;
    }


    @JsonProperty("authorizationFee")
    public Builder withAuthorizationFee(com.amazon.ask.model.interfaces.amazonpay.model.response.Price authorizationFee) {
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
    public Builder withAuthorizationStatus(com.amazon.ask.model.interfaces.amazonpay.model.response.AuthorizationStatus authorizationStatus) {
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


    @JsonProperty("authorizationBillingAddress")
    public Builder withAuthorizationBillingAddress(com.amazon.ask.model.interfaces.amazonpay.model.response.Destination authorizationBillingAddress) {
        this.authorizationBillingAddress = authorizationBillingAddress;
        return this;
    }


    public AuthorizationDetails build() {
      return new AuthorizationDetails(this);
    }
  }
}

