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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Response object for get reminders request
 */

@JsonDeserialize(builder = GetRemindersResponse.Builder.class)
public final class GetRemindersResponse {

    @JsonProperty("totalCount")
    private String totalCount = null;

    @JsonProperty("alerts")
    private List<com.amazon.ask.model.services.reminderManagement.Reminder> alerts = new ArrayList<com.amazon.ask.model.services.reminderManagement.Reminder>();

    @JsonProperty("links")
    private String links = null;

    private GetRemindersResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private GetRemindersResponse(Builder builder) {
        if (builder.totalCount != null) {
            this.totalCount = builder.totalCount;
        }
        if (builder.alerts != null) {
            this.alerts = builder.alerts;
        }
        if (builder.links != null) {
            this.links = builder.links;
        }
    }

    /**
     * Total count of reminders returned
     * @return totalCount
    **/
    @JsonProperty("totalCount")
    public String getTotalCount() {
        return totalCount;
    }


    /**
     * List of reminders
     * @return alerts
    **/
    @JsonProperty("alerts")
    public List<com.amazon.ask.model.services.reminderManagement.Reminder> getAlerts() {
        return alerts;
    }


    /**
     * Link to retrieve next set of alerts if total count is greater than max results
     * @return links
    **/
    @JsonProperty("links")
    public String getLinks() {
        return links;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetRemindersResponse servicesReminderManagementGetRemindersResponse = (GetRemindersResponse) o;
        return Objects.equals(this.totalCount, servicesReminderManagementGetRemindersResponse.totalCount) &&
            Objects.equals(this.alerts, servicesReminderManagementGetRemindersResponse.alerts) &&
            Objects.equals(this.links, servicesReminderManagementGetRemindersResponse.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, alerts, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetRemindersResponse {\n");
        
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    alerts: ").append(toIndentedString(alerts)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
        private String totalCount;
        private List<com.amazon.ask.model.services.reminderManagement.Reminder> alerts;
        private String links;

        private Builder() {}

        @JsonProperty("totalCount")

        public Builder withTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        @JsonProperty("alerts")

        public Builder withAlerts(List<com.amazon.ask.model.services.reminderManagement.Reminder> alerts) {
            this.alerts = alerts;
            return this;
        }

        public Builder addAlertsItem(com.amazon.ask.model.services.reminderManagement.Reminder alertsItem) {
            if (this.alerts == null) {
                this.alerts = new ArrayList<com.amazon.ask.model.services.reminderManagement.Reminder>();
            }
            this.alerts.add(alertsItem);
            return this;
        }

        @JsonProperty("links")

        public Builder withLinks(String links) {
            this.links = links;
            return this;
        }


        public GetRemindersResponse build() {
            return new GetRemindersResponse(this);
        }
    }
}

