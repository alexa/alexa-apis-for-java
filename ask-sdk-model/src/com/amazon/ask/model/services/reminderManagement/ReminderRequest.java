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


package com.amazon.ask.model.services.reminderManagement;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input request for creating a reminder
 */

@JsonDeserialize(builder = ReminderRequest.Builder.class)
public final class ReminderRequest {

    @JsonProperty("requestTime")
    private OffsetDateTime requestTime = null;

    @JsonProperty("trigger")
    private com.amazon.ask.model.services.reminderManagement.Trigger trigger = null;

    @JsonProperty("alertInfo")
    private com.amazon.ask.model.services.reminderManagement.AlertInfo alertInfo = null;

    @JsonProperty("pushNotification")
    private com.amazon.ask.model.services.reminderManagement.PushNotification pushNotification = null;

    public static Builder builder() {
        return new Builder();
    }

    private ReminderRequest(Builder builder) {
        if (builder.requestTime != null) {
            this.requestTime = builder.requestTime;
        }
        if (builder.trigger != null) {
            this.trigger = builder.trigger;
        }
        if (builder.alertInfo != null) {
            this.alertInfo = builder.alertInfo;
        }
        if (builder.pushNotification != null) {
            this.pushNotification = builder.pushNotification;
        }
    }

    /**
     * Valid ISO 8601 format - Creation time of this reminder alert
     * @return requestTime
    **/
    @JsonProperty("requestTime")
    public OffsetDateTime getRequestTime() {
        return requestTime;
    }


    /**
     * Get trigger
     * @return trigger
    **/
    @JsonProperty("trigger")
    public com.amazon.ask.model.services.reminderManagement.Trigger getTrigger() {
        return trigger;
    }


    /**
     * Get alertInfo
     * @return alertInfo
    **/
    @JsonProperty("alertInfo")
    public com.amazon.ask.model.services.reminderManagement.AlertInfo getAlertInfo() {
        return alertInfo;
    }


    /**
     * Get pushNotification
     * @return pushNotification
    **/
    @JsonProperty("pushNotification")
    public com.amazon.ask.model.services.reminderManagement.PushNotification getPushNotification() {
        return pushNotification;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReminderRequest servicesReminderManagementReminderRequest = (ReminderRequest) o;
        return Objects.equals(this.requestTime, servicesReminderManagementReminderRequest.requestTime) &&
            Objects.equals(this.trigger, servicesReminderManagementReminderRequest.trigger) &&
            Objects.equals(this.alertInfo, servicesReminderManagementReminderRequest.alertInfo) &&
            Objects.equals(this.pushNotification, servicesReminderManagementReminderRequest.pushNotification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestTime, trigger, alertInfo, pushNotification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReminderRequest {\n");
        
        sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    alertInfo: ").append(toIndentedString(alertInfo)).append("\n");
        sb.append("    pushNotification: ").append(toIndentedString(pushNotification)).append("\n");
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
        private OffsetDateTime requestTime;
        private com.amazon.ask.model.services.reminderManagement.Trigger trigger;
        private com.amazon.ask.model.services.reminderManagement.AlertInfo alertInfo;
        private com.amazon.ask.model.services.reminderManagement.PushNotification pushNotification;

        private Builder() {}

        @JsonProperty("requestTime")

        public Builder withRequestTime(OffsetDateTime requestTime) {
            this.requestTime = requestTime;
            return this;
        }


        @JsonProperty("trigger")

        public Builder withTrigger(com.amazon.ask.model.services.reminderManagement.Trigger trigger) {
            this.trigger = trigger;
            return this;
        }


        @JsonProperty("alertInfo")

        public Builder withAlertInfo(com.amazon.ask.model.services.reminderManagement.AlertInfo alertInfo) {
            this.alertInfo = alertInfo;
            return this;
        }


        @JsonProperty("pushNotification")

        public Builder withPushNotification(com.amazon.ask.model.services.reminderManagement.PushNotification pushNotification) {
            this.pushNotification = pushNotification;
            return this;
        }


        public ReminderRequest build() {
            return new ReminderRequest(this);
        }
    }
}

