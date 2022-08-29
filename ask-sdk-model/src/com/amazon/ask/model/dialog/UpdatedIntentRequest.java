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


package com.amazon.ask.model.dialog;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdatedIntentRequest
 */

@JsonDeserialize(builder = UpdatedIntentRequest.Builder.class)
public final class UpdatedIntentRequest extends com.amazon.ask.model.dialog.UpdatedRequest  {

    @JsonProperty("intent")
    private com.amazon.ask.model.Intent intent = null;

    private UpdatedIntentRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private UpdatedIntentRequest(Builder builder) {
        String discriminatorValue = "IntentRequest";

        this.type = discriminatorValue;
        if (builder.intent != null) {
            this.intent = builder.intent;
        }
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
        UpdatedIntentRequest dialogUpdatedIntentRequest = (UpdatedIntentRequest) o;
        return Objects.equals(this.intent, dialogUpdatedIntentRequest.intent) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intent, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatedIntentRequest {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
        private com.amazon.ask.model.Intent intent;

        private Builder() {}

        @JsonProperty("intent")

        public Builder withIntent(com.amazon.ask.model.Intent intent) {
            this.intent = intent;
            return this;
        }


        public UpdatedIntentRequest build() {
            return new UpdatedIntentRequest(this);
        }
    }
}

