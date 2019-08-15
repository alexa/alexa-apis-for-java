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


package com.amazon.ask.model.interfaces.customInterfaceController;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The directive to be delivered to the gadgets. Each directive is targeted to one gadget  (that is, one endpointId). To target the same directive to multiple gadgets, include one  directive for each gadget in the response.
 */

@JsonDeserialize(builder = SendDirectiveDirective.Builder.class)
public final class SendDirectiveDirective extends com.amazon.ask.model.Directive {

  @JsonProperty("header")
  private com.amazon.ask.model.interfaces.customInterfaceController.Header header = null;

  @JsonProperty("payload")
  private Object payload = null;

  @JsonProperty("endpoint")
  private com.amazon.ask.model.interfaces.customInterfaceController.Endpoint endpoint = null;

  public static Builder builder() {
    return new Builder();
  }

  private SendDirectiveDirective(Builder builder) {
    String discriminatorValue = "CustomInterfaceController.SendDirective";

    this.type = discriminatorValue;
    this.header = builder.header;
    this.payload = builder.payload;
    this.endpoint = builder.endpoint;
  }

  /**
    * The object that contains the header of the directive.
  * @return header
  **/
  @JsonProperty("header")
  public com.amazon.ask.model.interfaces.customInterfaceController.Header getHeader() {
    return header;
  }

  /**
    * The free form JSON object.
  * @return payload
  **/
  @JsonProperty("payload")
  public Object getPayload() {
    return payload;
  }

  /**
    * Identifies the gadget where the directive should be sent to. Each directive is targeted to one gadget (that is, one endpointId). If the same directive is be sent to multiple gadgets,  include one directive for each gadget in the response.
  * @return endpoint
  **/
  @JsonProperty("endpoint")
  public com.amazon.ask.model.interfaces.customInterfaceController.Endpoint getEndpoint() {
    return endpoint;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendDirectiveDirective interfacesCustomInterfaceControllerSendDirectiveDirective = (SendDirectiveDirective) o;
    return Objects.equals(this.header, interfacesCustomInterfaceControllerSendDirectiveDirective.header) &&
        Objects.equals(this.payload, interfacesCustomInterfaceControllerSendDirectiveDirective.payload) &&
        Objects.equals(this.endpoint, interfacesCustomInterfaceControllerSendDirectiveDirective.endpoint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, payload, endpoint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendDirectiveDirective {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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
    private com.amazon.ask.model.interfaces.customInterfaceController.Header header;
    private Object payload;
    private com.amazon.ask.model.interfaces.customInterfaceController.Endpoint endpoint;

    private Builder() { }

    @JsonProperty("header")
    public Builder withHeader(com.amazon.ask.model.interfaces.customInterfaceController.Header header) {
        this.header = header;
        return this;
    }


    @JsonProperty("payload")
    public Builder withPayload(Object payload) {
        this.payload = payload;
        return this;
    }


    @JsonProperty("endpoint")
    public Builder withEndpoint(com.amazon.ask.model.interfaces.customInterfaceController.Endpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }


    public SendDirectiveDirective build() {
      return new SendDirectiveDirective(this);
    }
  }
}

