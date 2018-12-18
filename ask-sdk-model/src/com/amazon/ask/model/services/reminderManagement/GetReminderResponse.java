/*
* Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Response object for get reminder request
 */

@JsonDeserialize(builder = GetReminderResponse.Builder.class)
public final class GetReminderResponse{

  @JsonProperty("alertToken")
  private String alertToken = null;

  @JsonProperty("createdTime")
  private OffsetDateTime createdTime = null;

  @JsonProperty("updatedTime")
  private OffsetDateTime updatedTime = null;

  @JsonProperty("status")
  private com.amazon.ask.model.services.reminderManagement.Status status = null;

  @JsonProperty("trigger")
  private com.amazon.ask.model.services.reminderManagement.Trigger trigger = null;

  @JsonProperty("alertInfo")
  private com.amazon.ask.model.services.reminderManagement.AlertInfo alertInfo = null;

  @JsonProperty("pushNotification")
  private com.amazon.ask.model.services.reminderManagement.PushNotification pushNotification = null;

  @JsonProperty("version")
  private String version = null;

  public static Builder builder() {
    return new Builder();
  }

  private GetReminderResponse(Builder builder) {
    this.alertToken = builder.alertToken;
    this.createdTime = builder.createdTime;
    this.updatedTime = builder.updatedTime;
    this.status = builder.status;
    this.trigger = builder.trigger;
    this.alertInfo = builder.alertInfo;
    this.pushNotification = builder.pushNotification;
    this.version = builder.version;
  }

  /**
    * Unique id of this reminder alert
  * @return alertToken
  **/
  public String getAlertToken() {
    return alertToken;
  }

  /**
    * Valid ISO 8601 format - Creation time of this reminder alert
  * @return createdTime
  **/
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  /**
    * Valid ISO 8601 format - Last updated time of this reminder alert
  * @return updatedTime
  **/
  public OffsetDateTime getUpdatedTime() {
    return updatedTime;
  }

  /**
    * Get status
  * @return status
  **/
  public com.amazon.ask.model.services.reminderManagement.Status getStatus() {
    return status;
  }

  /**
    * Get trigger
  * @return trigger
  **/
  public com.amazon.ask.model.services.reminderManagement.Trigger getTrigger() {
    return trigger;
  }

  /**
    * Get alertInfo
  * @return alertInfo
  **/
  public com.amazon.ask.model.services.reminderManagement.AlertInfo getAlertInfo() {
    return alertInfo;
  }

  /**
    * Get pushNotification
  * @return pushNotification
  **/
  public com.amazon.ask.model.services.reminderManagement.PushNotification getPushNotification() {
    return pushNotification;
  }

  /**
    * Version of reminder alert
  * @return version
  **/
  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetReminderResponse servicesReminderManagementGetReminderResponse = (GetReminderResponse) o;
    return Objects.equals(this.alertToken, servicesReminderManagementGetReminderResponse.alertToken) &&
        Objects.equals(this.createdTime, servicesReminderManagementGetReminderResponse.createdTime) &&
        Objects.equals(this.updatedTime, servicesReminderManagementGetReminderResponse.updatedTime) &&
        Objects.equals(this.status, servicesReminderManagementGetReminderResponse.status) &&
        Objects.equals(this.trigger, servicesReminderManagementGetReminderResponse.trigger) &&
        Objects.equals(this.alertInfo, servicesReminderManagementGetReminderResponse.alertInfo) &&
        Objects.equals(this.pushNotification, servicesReminderManagementGetReminderResponse.pushNotification) &&
        Objects.equals(this.version, servicesReminderManagementGetReminderResponse.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertToken, createdTime, updatedTime, status, trigger, alertInfo, pushNotification, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReminderResponse {\n");
    
    sb.append("    alertToken: ").append(toIndentedString(alertToken)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    alertInfo: ").append(toIndentedString(alertInfo)).append("\n");
    sb.append("    pushNotification: ").append(toIndentedString(pushNotification)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    private String alertToken;
    private OffsetDateTime createdTime;
    private OffsetDateTime updatedTime;
    private com.amazon.ask.model.services.reminderManagement.Status status;
    private com.amazon.ask.model.services.reminderManagement.Trigger trigger;
    private com.amazon.ask.model.services.reminderManagement.AlertInfo alertInfo;
    private com.amazon.ask.model.services.reminderManagement.PushNotification pushNotification;
    private String version;

    private Builder() { }

    @JsonProperty("alertToken")
    public Builder withAlertToken(String alertToken) {
      this.alertToken = alertToken;
      return this;
    }
      

    @JsonProperty("createdTime")
    public Builder withCreatedTime(OffsetDateTime createdTime) {
      this.createdTime = createdTime;
      return this;
    }
      

    @JsonProperty("updatedTime")
    public Builder withUpdatedTime(OffsetDateTime updatedTime) {
      this.updatedTime = updatedTime;
      return this;
    }
      

    @JsonProperty("status")
    public Builder withStatus(com.amazon.ask.model.services.reminderManagement.Status status) {
      this.status = status;
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
      

    @JsonProperty("version")
    public Builder withVersion(String version) {
      this.version = version;
      return this;
    }
      

    public GetReminderResponse build() {
      return new GetReminderResponse(this);
    }
  }
}

