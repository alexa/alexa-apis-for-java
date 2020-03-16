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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Event
 */

@JsonDeserialize(builder = Event.Builder.class)
public final class Event {

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("alertToken")
    private String alertToken = null;

    public static Builder builder() {
        return new Builder();
    }

    private Event(Builder builder) {
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.alertToken != null) {
            this.alertToken = builder.alertToken;
        }
    }

    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.model.services.reminderManagement.Status getStatus() {
        return com.amazon.ask.model.services.reminderManagement.Status.fromValue(status);
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
     * Get alertToken
     * @return alertToken
    **/
    @JsonProperty("alertToken")
    public String getAlertToken() {
        return alertToken;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Event servicesReminderManagementEvent = (Event) o;
        return Objects.equals(this.status, servicesReminderManagementEvent.status) &&
            Objects.equals(this.alertToken, servicesReminderManagementEvent.alertToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, alertToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    alertToken: ").append(toIndentedString(alertToken)).append("\n");
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
        private String status;
        private String alertToken;

        private Builder() {}

        @JsonProperty("status")
        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.model.services.reminderManagement.Status status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("alertToken")

        public Builder withAlertToken(String alertToken) {
            this.alertToken = alertToken;
            return this;
        }


        public Event build() {
            return new Event(this);
        }
    }
}

