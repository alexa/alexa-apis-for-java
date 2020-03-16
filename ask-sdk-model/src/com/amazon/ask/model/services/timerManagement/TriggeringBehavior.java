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


package com.amazon.ask.model.services.timerManagement;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The triggering behavior upon Timer Expired.
 */

@JsonDeserialize(builder = TriggeringBehavior.Builder.class)
public final class TriggeringBehavior {

    @JsonProperty("operation")
    private com.amazon.ask.model.services.timerManagement.Operation operation = null;

    @JsonProperty("notificationConfig")
    private com.amazon.ask.model.services.timerManagement.NotificationConfig notificationConfig = null;

    public static Builder builder() {
        return new Builder();
    }

    private TriggeringBehavior(Builder builder) {
        if (builder.operation != null) {
            this.operation = builder.operation;
        }
        if (builder.notificationConfig != null) {
            this.notificationConfig = builder.notificationConfig;
        }
    }

    /**
     * Get operation
     * @return operation
    **/
    @JsonProperty("operation")
    public com.amazon.ask.model.services.timerManagement.Operation getOperation() {
        return operation;
    }


    /**
     * Get notificationConfig
     * @return notificationConfig
    **/
    @JsonProperty("notificationConfig")
    public com.amazon.ask.model.services.timerManagement.NotificationConfig getNotificationConfig() {
        return notificationConfig;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TriggeringBehavior servicesTimerManagementTriggeringBehavior = (TriggeringBehavior) o;
        return Objects.equals(this.operation, servicesTimerManagementTriggeringBehavior.operation) &&
            Objects.equals(this.notificationConfig, servicesTimerManagementTriggeringBehavior.notificationConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, notificationConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggeringBehavior {\n");
        
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    notificationConfig: ").append(toIndentedString(notificationConfig)).append("\n");
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
        private com.amazon.ask.model.services.timerManagement.Operation operation;
        private com.amazon.ask.model.services.timerManagement.NotificationConfig notificationConfig;

        private Builder() {}

        @JsonProperty("operation")

        public Builder withOperation(com.amazon.ask.model.services.timerManagement.Operation operation) {
            this.operation = operation;
            return this;
        }


        @JsonProperty("notificationConfig")

        public Builder withNotificationConfig(com.amazon.ask.model.services.timerManagement.NotificationConfig notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }


        public TriggeringBehavior build() {
            return new TriggeringBehavior(this);
        }
    }
}

