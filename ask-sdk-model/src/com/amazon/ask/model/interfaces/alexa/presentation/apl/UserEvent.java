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


package com.amazon.ask.model.interfaces.alexa.presentation.apl;

import java.util.Objects;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * UserEvent
 */

@JsonDeserialize(builder = UserEvent.Builder.class)
public final class UserEvent extends com.amazon.ask.model.Request {

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("arguments")
  private List<Object> arguments = new ArrayList<Object>();

  @JsonProperty("source")
  private Object source = null;

  @JsonProperty("components")
  private Object components = null;

  public static Builder builder() {
    return new Builder();
  }

  private UserEvent(Builder builder) {
    String discriminatorValue = "Alexa.Presentation.APL.UserEvent";

    this.type = discriminatorValue;
    this.requestId = builder.requestId;
    this.timestamp = builder.timestamp;
    this.locale = builder.locale;
    this.token = builder.token;
    this.arguments = builder.arguments;
    this.source = builder.source;
    this.components = builder.components;
  }

  /**
    * A unique token for the active presentation.
  * @return token
  **/
  public String getToken() {
    return token;
  }

  /**
    * The array of argument data to pass to Alexa.
  * @return arguments
  **/
  public List<Object> getArguments() {
    return arguments;
  }

  /**
    * Meta-information about what caused the event to be generated.
  * @return source
  **/
  public Object getSource() {
    return source;
  }

  /**
    * Components associated with the request.
  * @return components
  **/
  public Object getComponents() {
    return components;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserEvent interfacesAlexaPresentationAplUserEvent = (UserEvent) o;
    return Objects.equals(this.token, interfacesAlexaPresentationAplUserEvent.token) &&
        Objects.equals(this.arguments, interfacesAlexaPresentationAplUserEvent.arguments) &&
        Objects.equals(this.source, interfacesAlexaPresentationAplUserEvent.source) &&
        Objects.equals(this.components, interfacesAlexaPresentationAplUserEvent.components) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, arguments, source, components, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
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
    private String token;
    private List<Object> arguments;
    private Object source;
    private Object components;

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
      

    @JsonProperty("token")
    public Builder withToken(String token) {
      this.token = token;
      return this;
    }
      

    @JsonProperty("arguments")
    public Builder withArguments(List<Object> arguments) {
      this.arguments = arguments;
      return this;
    }
      
    public Builder addArgumentsItem(Object argumentsItem) {
      if (this.arguments == null) {
        this.arguments = new ArrayList<Object>();
      }
      this.arguments.add(argumentsItem);
      return this;
    }

    @JsonProperty("source")
    public Builder withSource(Object source) {
      this.source = source;
      return this;
    }
      

    @JsonProperty("components")
    public Builder withComponents(Object components) {
      this.components = components;
      return this;
    }
      

    public UserEvent build() {
      return new UserEvent(this);
    }
  }
}

