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


package com.amazon.ask.smapi.model.v1.skill.betaTest.testers;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Tester information.
 */

@JsonDeserialize(builder = TesterWithDetails.Builder.class)
public final class TesterWithDetails {

    @JsonProperty("emailId")
    private String emailId = null;

    @JsonProperty("associationDate")
    private OffsetDateTime associationDate = null;

    @JsonProperty("isReminderAllowed")
    private Boolean isReminderAllowed = null;

    @JsonProperty("invitationStatus")
    private String invitationStatus = null;

    private TesterWithDetails() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private TesterWithDetails(Builder builder) {
        if (builder.emailId != null) {
            this.emailId = builder.emailId;
        }
        if (builder.associationDate != null) {
            this.associationDate = builder.associationDate;
        }
        if (builder.isReminderAllowed != null) {
            this.isReminderAllowed = builder.isReminderAllowed;
        }
        if (builder.invitationStatus != null) {
            this.invitationStatus = builder.invitationStatus;
        }
    }

    /**
     * Email address of the tester.
     * @return emailId
    **/
    @JsonProperty("emailId")
    public String getEmailId() {
        return emailId;
    }


    /**
     * Date and time when the tester is added to the beta test.
     * @return associationDate
    **/
    @JsonProperty("associationDate")
    public OffsetDateTime getAssociationDate() {
        return associationDate;
    }


    /**
     * Indicates whether the tester is allowed to be sent reminder.
     * @return isReminderAllowed
    **/
    @JsonProperty("isReminderAllowed")
    public Boolean getIsReminderAllowed() {
        return isReminderAllowed;
    }


    /**
     * Get invitationStatus
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getInvitationStatusAsString().
     *
     * @return invitationStatus
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.betaTest.testers.InvitationStatus getInvitationStatus() {
        return com.amazon.ask.smapi.model.v1.skill.betaTest.testers.InvitationStatus.fromValue(invitationStatus);
    }

    /**
     * Get the underlying String value for invitationStatus.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return invitationStatus as a String value
    **/
    @JsonProperty("invitationStatus")
    public String getInvitationStatusAsString() {
      return invitationStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TesterWithDetails v1SkillBetaTestTestersTesterWithDetails = (TesterWithDetails) o;
        return Objects.equals(this.emailId, v1SkillBetaTestTestersTesterWithDetails.emailId) &&
            Objects.equals(this.associationDate, v1SkillBetaTestTestersTesterWithDetails.associationDate) &&
            Objects.equals(this.isReminderAllowed, v1SkillBetaTestTestersTesterWithDetails.isReminderAllowed) &&
            Objects.equals(this.invitationStatus, v1SkillBetaTestTestersTesterWithDetails.invitationStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailId, associationDate, isReminderAllowed, invitationStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TesterWithDetails {\n");
        
        sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
        sb.append("    associationDate: ").append(toIndentedString(associationDate)).append("\n");
        sb.append("    isReminderAllowed: ").append(toIndentedString(isReminderAllowed)).append("\n");
        sb.append("    invitationStatus: ").append(toIndentedString(invitationStatus)).append("\n");
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
        private String emailId;
        private OffsetDateTime associationDate;
        private Boolean isReminderAllowed;
        private String invitationStatus;

        private Builder() {}

        @JsonProperty("emailId")

        public Builder withEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }


        @JsonProperty("associationDate")

        public Builder withAssociationDate(OffsetDateTime associationDate) {
            this.associationDate = associationDate;
            return this;
        }


        @JsonProperty("isReminderAllowed")

        public Builder withIsReminderAllowed(Boolean isReminderAllowed) {
            this.isReminderAllowed = isReminderAllowed;
            return this;
        }


        @JsonProperty("invitationStatus")

        public Builder withInvitationStatus(String invitationStatus) {
          this.invitationStatus = invitationStatus;
          return this;
        }

        public Builder withInvitationStatus(com.amazon.ask.smapi.model.v1.skill.betaTest.testers.InvitationStatus invitationStatus) {
            this.invitationStatus = invitationStatus != null ? invitationStatus.toString() : null;
            return this;
        }


        public TesterWithDetails build() {
            return new TesterWithDetails(this);
        }
    }
}

