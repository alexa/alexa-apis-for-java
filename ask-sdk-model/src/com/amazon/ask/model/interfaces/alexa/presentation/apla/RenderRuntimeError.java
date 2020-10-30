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


package com.amazon.ask.model.interfaces.alexa.presentation.apla;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This error type occurs when the the cloud based audio mixing service fails to render the audio due to service or user failure.
 */

@JsonDeserialize(builder = RenderRuntimeError.Builder.class)
public final class RenderRuntimeError extends com.amazon.ask.model.interfaces.alexa.presentation.apla.RuntimeError  {

    @JsonProperty("reason")
    private com.amazon.ask.model.interfaces.alexa.presentation.apla.RenderErrorReason reason = null;

    public static Builder builder() {
        return new Builder();
    }

    private RenderRuntimeError(Builder builder) {
        String discriminatorValue = "RENDER_ERROR";

        this.type = discriminatorValue;
        if (builder.message != null) {
            this.message = builder.message;
        }
        if (builder.reason != null) {
            this.reason = builder.reason;
        }
    }

    /**
     * Get reason
     * @return reason
    **/
    @JsonProperty("reason")
    public com.amazon.ask.model.interfaces.alexa.presentation.apla.RenderErrorReason getReason() {
        return reason;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RenderRuntimeError interfacesAlexaPresentationAplaRenderRuntimeError = (RenderRuntimeError) o;
        return Objects.equals(this.reason, interfacesAlexaPresentationAplaRenderRuntimeError.reason) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RenderRuntimeError {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
        private String message;
        private com.amazon.ask.model.interfaces.alexa.presentation.apla.RenderErrorReason reason;

        private Builder() {}

        @JsonProperty("message")

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }


        @JsonProperty("reason")

        public Builder withReason(com.amazon.ask.model.interfaces.alexa.presentation.apla.RenderErrorReason reason) {
            this.reason = reason;
            return this;
        }


        public RenderRuntimeError build() {
            return new RenderRuntimeError(this);
        }
    }
}

