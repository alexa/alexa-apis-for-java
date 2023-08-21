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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The skill receives this event when the ad cannot be displayed or played due to certain reasons. More details: https://tiny.amazon.com/16bnoj5db/wamazbinviewAlexTeamASKTInSk
 */

@JsonDeserialize(builder = AdNotRendered.Builder.class)
public final class AdNotRendered extends com.amazon.ask.model.Request  {

    @JsonProperty("reason")
    private com.amazon.ask.model.interfaces.alexa.advertisement.Reason reason = null;

    private AdNotRendered() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private AdNotRendered(Builder builder) {
        String discriminatorValue = "Alexa.Advertisement.AdNotRendered";

        this.type = discriminatorValue;
        if (builder.requestId != null) {
            this.requestId = builder.requestId;
        }
        if (builder.timestamp != null) {
            this.timestamp = builder.timestamp;
        }
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
        if (builder.reason != null) {
            this.reason = builder.reason;
        }
    }

    /**
     * The object encapsulates information regarding the reasons why the ad is not being rendered.
     * @return reason
    **/
    @JsonProperty("reason")
    public com.amazon.ask.model.interfaces.alexa.advertisement.Reason getReason() {
        return reason;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdNotRendered interfacesAlexaAdvertisementAdNotRendered = (AdNotRendered) o;
        return Objects.equals(this.reason, interfacesAlexaAdvertisementAdNotRendered.reason) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdNotRendered {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
        private String requestId;
        private OffsetDateTime timestamp;
        private String locale;
        private com.amazon.ask.model.interfaces.alexa.advertisement.Reason reason;

        private Builder() {}

        @JsonProperty("requestId")

        public Builder withRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }


        @JsonProperty("timestamp")

        public Builder withTimestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }


        @JsonProperty("locale")

        public Builder withLocale(String locale) {
            this.locale = locale;
            return this;
        }


        @JsonProperty("reason")

        public Builder withReason(com.amazon.ask.model.interfaces.alexa.advertisement.Reason reason) {
            this.reason = reason;
            return this;
        }


        public AdNotRendered build() {
            return new AdNotRendered(this);
        }
    }
}

