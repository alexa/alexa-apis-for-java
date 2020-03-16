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


package com.amazon.ask.model.interfaces.amazonpay.response;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error response for SetupAmazonPay and ChargeAmazonPay calls.
 */

@JsonDeserialize(builder = AmazonPayErrorResponse.Builder.class)
public final class AmazonPayErrorResponse {

    @JsonProperty("errorCode")
    private String errorCode = null;

    @JsonProperty("errorMessage")
    private String errorMessage = null;

    public static Builder builder() {
        return new Builder();
    }

    private AmazonPayErrorResponse(Builder builder) {
        if (builder.errorCode != null) {
            this.errorCode = builder.errorCode;
        }
        if (builder.errorMessage != null) {
            this.errorMessage = builder.errorMessage;
        }
    }

    /**
     * Error code indicating the succinct cause of error
     * @return errorCode
    **/
    @JsonProperty("errorCode")
    public String getErrorCode() {
        return errorCode;
    }


    /**
     * Description of the error.
     * @return errorMessage
    **/
    @JsonProperty("errorMessage")
    public String getErrorMessage() {
        return errorMessage;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AmazonPayErrorResponse interfacesAmazonpayResponseAmazonPayErrorResponse = (AmazonPayErrorResponse) o;
        return Objects.equals(this.errorCode, interfacesAmazonpayResponseAmazonPayErrorResponse.errorCode) &&
            Objects.equals(this.errorMessage, interfacesAmazonpayResponseAmazonPayErrorResponse.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AmazonPayErrorResponse {\n");
        
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
        private String errorCode;
        private String errorMessage;

        private Builder() {}

        @JsonProperty("errorCode")

        public Builder withErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }


        @JsonProperty("errorMessage")

        public Builder withErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }


        public AmazonPayErrorResponse build() {
            return new AmazonPayErrorResponse(this);
        }
    }
}

