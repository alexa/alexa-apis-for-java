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
 * Enable / disable reminders push notifications to Alexa mobile apps
 */

@JsonDeserialize(builder = PushNotification.Builder.class)
public final class PushNotification{

  @JsonProperty("status")
  private com.amazon.ask.model.services.reminderManagement.PushNotificationStatus status = null;

  public static Builder builder() {
    return new Builder();
  }

  private PushNotification(Builder builder) {
    this.status = builder.status;
  }

  /**
    * Get status
  * @return status
  **/
  @JsonProperty("status")
  public com.amazon.ask.model.services.reminderManagement.PushNotificationStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushNotification servicesReminderManagementPushNotification = (PushNotification) o;
    return Objects.equals(this.status, servicesReminderManagementPushNotification.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushNotification {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    private com.amazon.ask.model.services.reminderManagement.PushNotificationStatus status;

    private Builder() { }

    @JsonProperty("status")
    public Builder withStatus(com.amazon.ask.model.services.reminderManagement.PushNotificationStatus status) {
        this.status = status;
        return this;
    }


    public PushNotification build() {
      return new PushNotification(this);
    }
  }
}

