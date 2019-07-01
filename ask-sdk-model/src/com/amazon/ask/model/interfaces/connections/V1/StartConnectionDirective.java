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


package com.amazon.ask.model.interfaces.connections.V1;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the directive that a skill can send as part of their response to a session based request to start a connection. A response will be returned to the skill when the connection is handled.
 */

@JsonDeserialize(builder = StartConnectionDirective.Builder.class)
public final class StartConnectionDirective extends com.amazon.ask.model.Directive {

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("input")
  private Map<String, Object> input = new HashMap<String, Object>();

  @JsonProperty("token")
  private String token = null;

  public static Builder builder() {
    return new Builder();
  }

  private StartConnectionDirective(Builder builder) {
    String discriminatorValue = "Connections.StartConnection";

    this.type = discriminatorValue;
    this.uri = builder.uri;
    this.input = builder.input;
    this.token = builder.token;
  }

  /**
    * This defines the name and version of connection that the requester is trying to send. The format of the uri should follow this pattern: connection://connectionName/connectionVersion. Invalid uri will cause an error which will be sent back to the requester.
  * @return uri
  **/
  public String getUri() {
    return uri;
  }

  /**
    * This is the input to the connection that the requester is trying to send. It is predefined by the handler of the connection. If the input format is incorrect, an error will be sent to to the requester.
  * @return input
  **/
  public Map<String, Object> getInput() {
    return input;
  }

  /**
    * This is an echo back string that requester will receive it when it gets resumed. It is never sent to the handler of the connection.
  * @return token
  **/
  public String getToken() {
    return token;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartConnectionDirective interfacesConnectionsV1StartConnectionDirective = (StartConnectionDirective) o;
    return Objects.equals(this.uri, interfacesConnectionsV1StartConnectionDirective.uri) &&
        Objects.equals(this.input, interfacesConnectionsV1StartConnectionDirective.input) &&
        Objects.equals(this.token, interfacesConnectionsV1StartConnectionDirective.token) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, input, token, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartConnectionDirective {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
    private String uri;
    private Map<String, Object> input;
    private String token;

    private Builder() { }

    @JsonProperty("uri")
    public Builder withUri(String uri) {
        this.uri = uri;
        return this;
    }


    @JsonProperty("input")
    public Builder withInput(Map<String, Object> input) {
        this.input = input;
        return this;
    }

    public Builder putInputItem(String key, Object inputItem) {
      if (this.input == null) {
        this.input = new HashMap<String, Object>();
      }
      this.input.put(key, inputItem);
      return this;
    }

    @JsonProperty("token")
    public Builder withToken(String token) {
        this.token = token;
        return this;
    }


    public StartConnectionDirective build() {
      return new StartConnectionDirective(this);
    }
  }
}

