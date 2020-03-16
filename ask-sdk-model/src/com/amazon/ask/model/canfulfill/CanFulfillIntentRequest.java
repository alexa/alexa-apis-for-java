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


package com.amazon.ask.model.canfulfill;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object that represents a request made to skill to query whether the skill can understand and fulfill the intent request with detected slots, before actually asking the skill to take action. Skill should be aware this is not to actually take action, skill should handle this request without causing side-effect, skill should not modify some state outside its scope or has an observable interaction with its calling functions or the outside world besides returning a value, such as playing sound,turning on/off lights, committing a transaction or a charge.
 */

@JsonDeserialize(builder = CanFulfillIntentRequest.Builder.class)
public final class CanFulfillIntentRequest extends com.amazon.ask.model.Request  {

    @JsonProperty("dialogState")
    private com.amazon.ask.model.DialogState dialogState = null;

    @JsonProperty("intent")
    private com.amazon.ask.model.Intent intent = null;

    public static Builder builder() {
        return new Builder();
    }

    private CanFulfillIntentRequest(Builder builder) {
        String discriminatorValue = "CanFulfillIntentRequest";

        this.type = discriminatorValue;
        if (builder.requestId != null) {
            this.requestId = builder.requestId;
        }
        if (builder.timestamp != null) {
            this.timestamp = builder.timestamp;
        }
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
        if (builder.dialogState != null) {
            this.dialogState = builder.dialogState;
        }
        if (builder.intent != null) {
            this.intent = builder.intent;
        }
    }

    /**
     * Get dialogState
     * @return dialogState
    **/
    @JsonProperty("dialogState")
    public com.amazon.ask.model.DialogState getDialogState() {
        return dialogState;
    }


    /**
     * Get intent
     * @return intent
    **/
    @JsonProperty("intent")
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
        CanFulfillIntentRequest canfulfillCanFulfillIntentRequest = (CanFulfillIntentRequest) o;
        return Objects.equals(this.dialogState, canfulfillCanFulfillIntentRequest.dialogState) &&
            Objects.equals(this.intent, canfulfillCanFulfillIntentRequest.intent) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dialogState, intent, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CanFulfillIntentRequest {\n");
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

        private Builder() {}

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


        public CanFulfillIntentRequest build() {
            return new CanFulfillIntentRequest(this);
        }
    }
}

