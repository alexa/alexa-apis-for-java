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
 * ReminderDeletedEvent
 */

@JsonDeserialize(builder = ReminderDeletedEvent.Builder.class)
public final class ReminderDeletedEvent {

    @JsonProperty("alertTokens")
    private List<String> alertTokens = new ArrayList<String>();

    public static Builder builder() {
        return new Builder();
    }

    private ReminderDeletedEvent(Builder builder) {
        if (builder.alertTokens != null) {
            this.alertTokens = builder.alertTokens;
        }
    }

    /**
     * Get alertTokens
     * @return alertTokens
    **/
    @JsonProperty("alertTokens")
    public List<String> getAlertTokens() {
        return alertTokens;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReminderDeletedEvent servicesReminderManagementReminderDeletedEvent = (ReminderDeletedEvent) o;
        return Objects.equals(this.alertTokens, servicesReminderManagementReminderDeletedEvent.alertTokens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alertTokens);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReminderDeletedEvent {\n");
        
        sb.append("    alertTokens: ").append(toIndentedString(alertTokens)).append("\n");
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
        private List<String> alertTokens;

        private Builder() {}

        @JsonProperty("alertTokens")
        public Builder withAlertTokens(List<String> alertTokens) {
            this.alertTokens = alertTokens;
            return this;
        }

        public Builder addAlertTokensItem(String alertTokensItem) {
            if (this.alertTokens == null) {
                this.alertTokens = new ArrayList<String>();
            }
            this.alertTokens.add(alertTokensItem);
            return this;
        }

        public ReminderDeletedEvent build() {
            return new ReminderDeletedEvent(this);
        }
    }
}

