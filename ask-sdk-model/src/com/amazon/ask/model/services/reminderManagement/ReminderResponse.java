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
 * Response object for post/put/delete reminder request
 */

@JsonDeserialize(builder = ReminderResponse.Builder.class)
public final class ReminderResponse{

  @JsonProperty("alertToken")
  private String alertToken = null;

  @JsonProperty("createdTime")
  private String createdTime = null;

  @JsonProperty("updatedTime")
  private String updatedTime = null;

  @JsonProperty("status")
  private com.amazon.ask.model.services.reminderManagement.Status status = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("href")
  private String href = null;

  public static Builder builder() {
    return new Builder();
  }

  private ReminderResponse(Builder builder) {
    this.alertToken = builder.alertToken;
    this.createdTime = builder.createdTime;
    this.updatedTime = builder.updatedTime;
    this.status = builder.status;
    this.version = builder.version;
    this.href = builder.href;
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
  public String getCreatedTime() {
    return createdTime;
  }

  /**
    * Valid ISO 8601 format - Last updated time of this reminder alert
  * @return updatedTime
  **/
  public String getUpdatedTime() {
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
    * Version of reminder alert
  * @return version
  **/
  public String getVersion() {
    return version;
  }

  /**
    * URI to retrieve the created alert
  * @return href
  **/
  public String getHref() {
    return href;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReminderResponse servicesReminderManagementReminderResponse = (ReminderResponse) o;
    return Objects.equals(this.alertToken, servicesReminderManagementReminderResponse.alertToken) &&
        Objects.equals(this.createdTime, servicesReminderManagementReminderResponse.createdTime) &&
        Objects.equals(this.updatedTime, servicesReminderManagementReminderResponse.updatedTime) &&
        Objects.equals(this.status, servicesReminderManagementReminderResponse.status) &&
        Objects.equals(this.version, servicesReminderManagementReminderResponse.version) &&
        Objects.equals(this.href, servicesReminderManagementReminderResponse.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertToken, createdTime, updatedTime, status, version, href);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReminderResponse {\n");
    
    sb.append("    alertToken: ").append(toIndentedString(alertToken)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
    private String createdTime;
    private String updatedTime;
    private com.amazon.ask.model.services.reminderManagement.Status status;
    private String version;
    private String href;

    private Builder() { }

    @JsonProperty("alertToken")
    public Builder withAlertToken(String alertToken) {
      this.alertToken = alertToken;
      return this;
    }
      

    @JsonProperty("createdTime")
    public Builder withCreatedTime(String createdTime) {
      this.createdTime = createdTime;
      return this;
    }
      

    @JsonProperty("updatedTime")
    public Builder withUpdatedTime(String updatedTime) {
      this.updatedTime = updatedTime;
      return this;
    }
      

    @JsonProperty("status")
    public Builder withStatus(com.amazon.ask.model.services.reminderManagement.Status status) {
      this.status = status;
      return this;
    }
      

    @JsonProperty("version")
    public Builder withVersion(String version) {
      this.version = version;
      return this;
    }
      

    @JsonProperty("href")
    public Builder withHref(String href) {
      this.href = href;
      return this;
    }
      

    public ReminderResponse build() {
      return new ReminderResponse(this);
    }
  }
}

