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
 * notification of the timer expiration.
 */

@JsonDeserialize(builder = NotificationConfig.Builder.class)
public final class NotificationConfig {

    @JsonProperty("playAudible")
    private Boolean playAudible = null;

    private NotificationConfig() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private NotificationConfig(Builder builder) {
        if (builder.playAudible != null) {
            this.playAudible = builder.playAudible;
        }
    }

    /**
     * Whether the native trigger CX is employed for this timer. By extension, this also denote whether an explicit ‘Stop’ is required.
     * @return playAudible
    **/
    @JsonProperty("playAudible")
    public Boolean getPlayAudible() {
        return playAudible;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NotificationConfig servicesTimerManagementNotificationConfig = (NotificationConfig) o;
        return Objects.equals(this.playAudible, servicesTimerManagementNotificationConfig.playAudible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playAudible);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationConfig {\n");
        
        sb.append("    playAudible: ").append(toIndentedString(playAudible)).append("\n");
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
        private Boolean playAudible;

        private Builder() {}

        @JsonProperty("playAudible")

        public Builder withPlayAudible(Boolean playAudible) {
            this.playAudible = playAudible;
            return this;
        }


        public NotificationConfig build() {
            return new NotificationConfig(this);
        }
    }
}

