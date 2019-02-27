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


package com.amazon.ask.model.interfaces.connections;

import java.util.Objects;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the request object that a skill will receive as a result of Connections.SendRequest directive from sender skill.
 */

@JsonDeserialize(builder = ConnectionsRequest.Builder.class)
public final class ConnectionsRequest extends com.amazon.ask.model.Request {

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("payload")
  private Map<String, Object> payload = new HashMap<String, Object>();

  public static Builder builder() {
    return new Builder();
  }

  private ConnectionsRequest(Builder builder) {
    String discriminatorValue = "Connections.Request";

    this.type = discriminatorValue;
    this.requestId = builder.requestId;
    this.timestamp = builder.timestamp;
    this.locale = builder.locale;
    this.name = builder.name;
    this.payload = builder.payload;
  }

  /**
    * Name of the action sent by the referrer skill.
  * @return name
  **/
  public String getName() {
    return name;
  }

  /**
    * This is an object sent between the two skills for processing a ConnectionsRequest or ConnectionsResponse. This will always be a valid payload based on Action schema for the requester action.
  * @return payload
  **/
  public Map<String, Object> getPayload() {
    return payload;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionsRequest interfacesConnectionsConnectionsRequest = (ConnectionsRequest) o;
    return Objects.equals(this.name, interfacesConnectionsConnectionsRequest.name) &&
        Objects.equals(this.payload, interfacesConnectionsConnectionsRequest.payload) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, payload, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionsRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
    private String requestId;
    private OffsetDateTime timestamp;
    private String locale;
    private String name;
    private Map<String, Object> payload;

    private Builder() { }
      

    @JsonProperty("requestId")
    public Builder withRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }
      

    @JsonProperty("timestamp")
    public Builder withTimestamp(OffsetDateTime timestamp) {
      this.timestamp = timestamp;
      return this;
    }
      

    @JsonProperty("locale")
    public Builder withLocale(String locale) {
      this.locale = locale;
      return this;
    }
      

    @JsonProperty("name")
    public Builder withName(String name) {
      this.name = name;
      return this;
    }
      

    @JsonProperty("payload")
    public Builder withPayload(Map<String, Object> payload) {
      this.payload = payload;
      return this;
    }
      
    public Builder putPayloadItem(String key, Object payloadItem) {
      if (this.payload == null) {
        this.payload = new HashMap<String, Object>();
      }
      this.payload.put(key, payloadItem);
      return this;
    }

    public ConnectionsRequest build() {
      return new ConnectionsRequest(this);
    }
  }
}

