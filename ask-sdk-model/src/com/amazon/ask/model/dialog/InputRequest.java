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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A request representing structured data used to provide dialog input to a dialog manager.
 */

@JsonDeserialize(builder = InputRequest.Builder.class)
public final class InputRequest extends com.amazon.ask.model.Request  {

    @JsonProperty("input")
    private com.amazon.ask.model.dialog.Input input = null;

    private InputRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private InputRequest(Builder builder) {
        String discriminatorValue = "Dialog.InputRequest";

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
        if (builder.input != null) {
            this.input = builder.input;
        }
    }

    /**
     * Get input
     * @return input
    **/
    @JsonProperty("input")
    public com.amazon.ask.model.dialog.Input getInput() {
        return input;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InputRequest dialogInputRequest = (InputRequest) o;
        return Objects.equals(this.input, dialogInputRequest.input) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InputRequest {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
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
        private com.amazon.ask.model.dialog.Input input;

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


        @JsonProperty("input")

        public Builder withInput(com.amazon.ask.model.dialog.Input input) {
            this.input = input;
            return this;
        }


        public InputRequest build() {
            return new InputRequest(this);
        }
    }
}

