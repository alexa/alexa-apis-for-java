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


package com.amazon.ask.model.services.directive;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Send Directive Request payload.
 */

@JsonDeserialize(builder = SendDirectiveRequest.Builder.class)
public final class SendDirectiveRequest {

    @JsonProperty("header")
    private com.amazon.ask.model.services.directive.Header header = null;

    @JsonProperty("directive")
    private com.amazon.ask.model.services.directive.Directive directive = null;

    private SendDirectiveRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SendDirectiveRequest(Builder builder) {
        if (builder.header != null) {
            this.header = builder.header;
        }
        if (builder.directive != null) {
            this.directive = builder.directive;
        }
    }

    /**
     * contains the header attributes of the send directive request.
     * @return header
    **/
    @JsonProperty("header")
    public com.amazon.ask.model.services.directive.Header getHeader() {
        return header;
    }


    /**
     * Directive Content.
     * @return directive
    **/
    @JsonProperty("directive")
    public com.amazon.ask.model.services.directive.Directive getDirective() {
        return directive;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SendDirectiveRequest servicesDirectiveSendDirectiveRequest = (SendDirectiveRequest) o;
        return Objects.equals(this.header, servicesDirectiveSendDirectiveRequest.header) &&
            Objects.equals(this.directive, servicesDirectiveSendDirectiveRequest.directive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, directive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendDirectiveRequest {\n");
        
        sb.append("    header: ").append(toIndentedString(header)).append("\n");
        sb.append("    directive: ").append(toIndentedString(directive)).append("\n");
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
        private com.amazon.ask.model.services.directive.Header header;
        private com.amazon.ask.model.services.directive.Directive directive;

        private Builder() {}

        @JsonProperty("header")

        public Builder withHeader(com.amazon.ask.model.services.directive.Header header) {
            this.header = header;
            return this;
        }


        @JsonProperty("directive")

        public Builder withDirective(com.amazon.ask.model.services.directive.Directive directive) {
            this.directive = directive;
            return this;
        }


        public SendDirectiveRequest build() {
            return new SendDirectiveRequest(this);
        }
    }
}

