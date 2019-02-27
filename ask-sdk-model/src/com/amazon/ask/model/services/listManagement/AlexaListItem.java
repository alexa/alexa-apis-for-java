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


package com.amazon.ask.model.services.listManagement;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AlexaListItem
 */

@JsonDeserialize(builder = AlexaListItem.Builder.class)
public final class AlexaListItem{

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("version")
  private Long version = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("status")
  private com.amazon.ask.model.services.listManagement.ListItemState status = null;

  @JsonProperty("createdTime")
  private String createdTime = null;

  @JsonProperty("updatedTime")
  private String updatedTime = null;

  @JsonProperty("href")
  private String href = null;

  public static Builder builder() {
    return new Builder();
  }

  private AlexaListItem(Builder builder) {
    this.id = builder.id;
    this.version = builder.version;
    this.value = builder.value;
    this.status = builder.status;
    this.createdTime = builder.createdTime;
    this.updatedTime = builder.updatedTime;
    this.href = builder.href;
  }

  /**
    * Get id
  * @return id
  **/
  public String getId() {
    return id;
  }

  /**
    * Get version
  * @return version
  **/
  public Long getVersion() {
    return version;
  }

  /**
    * Get value
  * @return value
  **/
  public String getValue() {
    return value;
  }

  /**
    * Get status
  * @return status
  **/
  public com.amazon.ask.model.services.listManagement.ListItemState getStatus() {
    return status;
  }

  /**
    * Get createdTime
  * @return createdTime
  **/
  public String getCreatedTime() {
    return createdTime;
  }

  /**
    * Get updatedTime
  * @return updatedTime
  **/
  public String getUpdatedTime() {
    return updatedTime;
  }

  /**
    * URL to retrieve the item from.
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
    AlexaListItem servicesListManagementAlexaListItem = (AlexaListItem) o;
    return Objects.equals(this.id, servicesListManagementAlexaListItem.id) &&
        Objects.equals(this.version, servicesListManagementAlexaListItem.version) &&
        Objects.equals(this.value, servicesListManagementAlexaListItem.value) &&
        Objects.equals(this.status, servicesListManagementAlexaListItem.status) &&
        Objects.equals(this.createdTime, servicesListManagementAlexaListItem.createdTime) &&
        Objects.equals(this.updatedTime, servicesListManagementAlexaListItem.updatedTime) &&
        Objects.equals(this.href, servicesListManagementAlexaListItem.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, value, status, createdTime, updatedTime, href);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlexaListItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
    private String id;
    private Long version;
    private String value;
    private com.amazon.ask.model.services.listManagement.ListItemState status;
    private String createdTime;
    private String updatedTime;
    private String href;

    private Builder() { }

    @JsonProperty("id")
    public Builder withId(String id) {
      this.id = id;
      return this;
    }
      

    @JsonProperty("version")
    public Builder withVersion(Long version) {
      this.version = version;
      return this;
    }
      

    @JsonProperty("value")
    public Builder withValue(String value) {
      this.value = value;
      return this;
    }
      

    @JsonProperty("status")
    public Builder withStatus(com.amazon.ask.model.services.listManagement.ListItemState status) {
      this.status = status;
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
      

    @JsonProperty("href")
    public Builder withHref(String href) {
      this.href = href;
      return this;
    }
      

    public AlexaListItem build() {
      return new AlexaListItem(this);
    }
  }
}

