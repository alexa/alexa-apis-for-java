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


package com.amazon.ask.model.interfaces.connections;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the directive that a skill can send as part of their response to a session based request to return a response to ConnectionsRequest.
 */

@JsonDeserialize(builder = SendResponseDirective.Builder.class)
public final class SendResponseDirective extends com.amazon.ask.model.Directive {

  @JsonProperty("status")
  private com.amazon.ask.model.interfaces.connections.ConnectionsStatus status = null;

  @JsonProperty("payload")
  private Map<String, Object> payload = new HashMap<String, Object>();

  public static Builder builder() {
    return new Builder();
  }

  private SendResponseDirective(Builder builder) {
    String discriminatorValue = "Connections.SendResponse";

    this.type = discriminatorValue;
    this.status = builder.status;
    this.payload = builder.payload;
  }

  /**
    * Get status
  * @return status
  **/
  public com.amazon.ask.model.interfaces.connections.ConnectionsStatus getStatus() {
    return status;
  }

  /**
    * This is an object sent to referrer skill as is.
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
    SendResponseDirective interfacesConnectionsSendResponseDirective = (SendResponseDirective) o;
    return Objects.equals(this.status, interfacesConnectionsSendResponseDirective.status) &&
        Objects.equals(this.payload, interfacesConnectionsSendResponseDirective.payload) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, payload, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendResponseDirective {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    private com.amazon.ask.model.interfaces.connections.ConnectionsStatus status;
    private Map<String, Object> payload;

    private Builder() { }
      

    @JsonProperty("status")
    public Builder withStatus(com.amazon.ask.model.interfaces.connections.ConnectionsStatus status) {
      this.status = status;
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

    public SendResponseDirective build() {
      return new SendResponseDirective(this);
    }
  }
}

