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
 * UpdatedInputRequest
 */

@JsonDeserialize(builder = UpdatedInputRequest.Builder.class)
public final class UpdatedInputRequest extends com.amazon.ask.model.dialog.UpdatedRequest  {

    @JsonProperty("input")
    private com.amazon.ask.model.dialog.Input input = null;

    public static Builder builder() {
        return new Builder();
    }

    private UpdatedInputRequest(Builder builder) {
        String discriminatorValue = "Dialog.InputRequest";

        this.type = discriminatorValue;
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
        UpdatedInputRequest dialogUpdatedInputRequest = (UpdatedInputRequest) o;
        return Objects.equals(this.input, dialogUpdatedInputRequest.input) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatedInputRequest {\n");
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
        private com.amazon.ask.model.dialog.Input input;

        private Builder() {}

        @JsonProperty("input")

        public Builder withInput(com.amazon.ask.model.dialog.Input input) {
            this.input = input;
            return this;
        }


        public UpdatedInputRequest build() {
            return new UpdatedInputRequest(this);
        }
    }
}

