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


package com.amazon.ask.smapi.model.v1.skill.betaTest;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Beta test for an Alexa skill.
 */

@JsonDeserialize(builder = BetaTest.Builder.class)
public final class BetaTest {

    @JsonProperty("expiryDate")
    private OffsetDateTime expiryDate = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("feedbackEmail")
    private String feedbackEmail = null;

    @JsonProperty("invitationUrl")
    private String invitationUrl = null;

    @JsonProperty("invitesRemaining")
    private Integer invitesRemaining = null;

    public static Builder builder() {
        return new Builder();
    }

    private BetaTest(Builder builder) {
        if (builder.expiryDate != null) {
            this.expiryDate = builder.expiryDate;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.feedbackEmail != null) {
            this.feedbackEmail = builder.feedbackEmail;
        }
        if (builder.invitationUrl != null) {
            this.invitationUrl = builder.invitationUrl;
        }
        if (builder.invitesRemaining != null) {
            this.invitesRemaining = builder.invitesRemaining;
        }
    }

    /**
     * Expiry date of the beta test.
     * @return expiryDate
    **/
    @JsonProperty("expiryDate")
    public OffsetDateTime getExpiryDate() {
        return expiryDate;
    }


    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.betaTest.Status getStatus() {
        return com.amazon.ask.smapi.model.v1.skill.betaTest.Status.fromValue(status);
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
     * Email address for providing feedback
     * @return feedbackEmail
    **/
    @JsonProperty("feedbackEmail")
    public String getFeedbackEmail() {
        return feedbackEmail;
    }


    /**
     * Deeplinking for getting authorized to the beta test.
     * @return invitationUrl
    **/
    @JsonProperty("invitationUrl")
    public String getInvitationUrl() {
        return invitationUrl;
    }


    /**
     * Remaining invite count for the beta test.
     * @return invitesRemaining
    **/
    @JsonProperty("invitesRemaining")
    public Integer getInvitesRemaining() {
        return invitesRemaining;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BetaTest v1SkillBetaTestBetaTest = (BetaTest) o;
        return Objects.equals(this.expiryDate, v1SkillBetaTestBetaTest.expiryDate) &&
            Objects.equals(this.status, v1SkillBetaTestBetaTest.status) &&
            Objects.equals(this.feedbackEmail, v1SkillBetaTestBetaTest.feedbackEmail) &&
            Objects.equals(this.invitationUrl, v1SkillBetaTestBetaTest.invitationUrl) &&
            Objects.equals(this.invitesRemaining, v1SkillBetaTestBetaTest.invitesRemaining);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expiryDate, status, feedbackEmail, invitationUrl, invitesRemaining);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BetaTest {\n");
        
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    feedbackEmail: ").append(toIndentedString(feedbackEmail)).append("\n");
        sb.append("    invitationUrl: ").append(toIndentedString(invitationUrl)).append("\n");
        sb.append("    invitesRemaining: ").append(toIndentedString(invitesRemaining)).append("\n");
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
        private OffsetDateTime expiryDate;
        private String status;
        private String feedbackEmail;
        private String invitationUrl;
        private Integer invitesRemaining;

        private Builder() {}

        @JsonProperty("expiryDate")

        public Builder withExpiryDate(OffsetDateTime expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }


        @JsonProperty("status")

        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.betaTest.Status status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("feedbackEmail")

        public Builder withFeedbackEmail(String feedbackEmail) {
            this.feedbackEmail = feedbackEmail;
            return this;
        }


        @JsonProperty("invitationUrl")

        public Builder withInvitationUrl(String invitationUrl) {
            this.invitationUrl = invitationUrl;
            return this;
        }


        @JsonProperty("invitesRemaining")

        public Builder withInvitesRemaining(Integer invitesRemaining) {
            this.invitesRemaining = invitesRemaining;
            return this;
        }


        public BetaTest build() {
            return new BetaTest(this);
        }
    }
}

