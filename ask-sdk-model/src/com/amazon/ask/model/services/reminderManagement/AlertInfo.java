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
 * Alert info for VUI / GUI
 */

@JsonDeserialize(builder = AlertInfo.Builder.class)
public final class AlertInfo {

    @JsonProperty("spokenInfo")
    private com.amazon.ask.model.services.reminderManagement.SpokenInfo spokenInfo = null;

    private AlertInfo() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private AlertInfo(Builder builder) {
        if (builder.spokenInfo != null) {
            this.spokenInfo = builder.spokenInfo;
        }
    }

    /**
     * Get spokenInfo
     * @return spokenInfo
    **/
    @JsonProperty("spokenInfo")
    public com.amazon.ask.model.services.reminderManagement.SpokenInfo getSpokenInfo() {
        return spokenInfo;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlertInfo servicesReminderManagementAlertInfo = (AlertInfo) o;
        return Objects.equals(this.spokenInfo, servicesReminderManagementAlertInfo.spokenInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spokenInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertInfo {\n");
        
        sb.append("    spokenInfo: ").append(toIndentedString(spokenInfo)).append("\n");
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
        private com.amazon.ask.model.services.reminderManagement.SpokenInfo spokenInfo;

        private Builder() {}

        @JsonProperty("spokenInfo")

        public Builder withSpokenInfo(com.amazon.ask.model.services.reminderManagement.SpokenInfo spokenInfo) {
            this.spokenInfo = spokenInfo;
            return this;
        }


        public AlertInfo build() {
            return new AlertInfo(this);
        }
    }
}

