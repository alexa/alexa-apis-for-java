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


package com.amazon.ask.model.interfaces.alexa.advertisement;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InjectAds
 */

@JsonDeserialize(builder = InjectAds.Builder.class)
public final class InjectAds extends com.amazon.ask.model.Directive  {

    @JsonProperty("expectedPreviousToken")
    private String expectedPreviousToken = null;

    private InjectAds() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private InjectAds(Builder builder) {
        String discriminatorValue = "Alexa.Advertisement.InjectAds";

        this.type = discriminatorValue;
        if (builder.expectedPreviousToken != null) {
            this.expectedPreviousToken = builder.expectedPreviousToken;
        }
    }

    /**
     * The optional expected previous token represents the content currently being played, and it is utilized to enqueue the advertisement after the ongoing audio content. More details: https://tiny.amazon.com/l9h6ejjr/wamazbinviewAlexTeamASKTInSk
     * @return expectedPreviousToken
    **/
    @JsonProperty("expectedPreviousToken")
    public String getExpectedPreviousToken() {
        return expectedPreviousToken;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InjectAds interfacesAlexaAdvertisementInjectAds = (InjectAds) o;
        return Objects.equals(this.expectedPreviousToken, interfacesAlexaAdvertisementInjectAds.expectedPreviousToken) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expectedPreviousToken, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InjectAds {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    expectedPreviousToken: ").append(toIndentedString(expectedPreviousToken)).append("\n");
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
        private String expectedPreviousToken;

        private Builder() {}

        @JsonProperty("expectedPreviousToken")

        public Builder withExpectedPreviousToken(String expectedPreviousToken) {
            this.expectedPreviousToken = expectedPreviousToken;
            return this;
        }


        public InjectAds build() {
            return new InjectAds(this);
        }
    }
}

