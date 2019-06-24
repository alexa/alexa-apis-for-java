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


package com.amazon.ask.model;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An IntentRequest is an object that represents a request made to a skill based on what the user wants to do.
 */

@JsonDeserialize(builder = IntentRequest.Builder.class)
public final class IntentRequest extends com.amazon.ask.model.Request {

  @JsonProperty("dialogState")
  private com.amazon.ask.model.DialogState dialogState = null;

  @JsonProperty("intent")
  private com.amazon.ask.model.Intent intent = null;

  public static Builder builder() {
    return new Builder();
  }

  private IntentRequest(Builder builder) {
    String discriminatorValue = "IntentRequest";

    this.type = discriminatorValue;
    this.requestId = builder.requestId;
    this.timestamp = builder.timestamp;
    this.locale = builder.locale;
    this.dialogState = builder.dialogState;
    this.intent = builder.intent;
  }

  /**
    * Enumeration indicating the status of the multi-turn dialog. This property is included if the skill meets the requirements to use the Dialog directives. Note that COMPLETED is only possible when you use the Dialog.Delegate directive. If you use intent confirmation, dialogState is considered COMPLETED if the user denies the entire intent (for instance, by answering “no” when asked the confirmation prompt). Be sure to also check the confirmationStatus property on the Intent object before fulfilling the user’s request.
  * @return dialogState
  **/
  public com.amazon.ask.model.DialogState getDialogState() {
    return dialogState;
  }

  /**
    * An object that represents what the user wants.
  * @return intent
  **/
  public com.amazon.ask.model.Intent getIntent() {
    return intent;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntentRequest intentRequest = (IntentRequest) o;
    return Objects.equals(this.dialogState, intentRequest.dialogState) &&
        Objects.equals(this.intent, intentRequest.intent) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dialogState, intent, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntentRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dialogState: ").append(toIndentedString(dialogState)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
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
    private com.amazon.ask.model.DialogState dialogState;
    private com.amazon.ask.model.Intent intent;

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


    @JsonProperty("dialogState")
    public Builder withDialogState(com.amazon.ask.model.DialogState dialogState) {
        this.dialogState = dialogState;
        return this;
    }


    @JsonProperty("intent")
    public Builder withIntent(com.amazon.ask.model.Intent intent) {
        this.intent = intent;
        return this;
    }


    public IntentRequest build() {
      return new IntentRequest(this);
    }
  }
}

