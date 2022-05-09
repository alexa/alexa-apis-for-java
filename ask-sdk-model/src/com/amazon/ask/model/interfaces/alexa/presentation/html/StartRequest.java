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


package com.amazon.ask.model.interfaces.alexa.presentation.html;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StartRequest
 */

@JsonDeserialize(builder = StartRequest.Builder.class)
public final class StartRequest {

    @JsonProperty("method")
    private String method = null;

    @JsonProperty("uri")
    private String uri = null;

    @JsonProperty("headers")
    private Object headers = null;

    public static Builder builder() {
        return new Builder();
    }

    private StartRequest(Builder builder) {
        if (builder.method != null) {
            this.method = builder.method;
        }
        if (builder.uri != null) {
            this.uri = builder.uri;
        }
        if (builder.headers != null) {
            this.headers = builder.headers;
        }
    }

    /**
     * Get method
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getMethodAsString().
     *
     * @return method
    **/
    
    public com.amazon.ask.model.interfaces.alexa.presentation.html.StartRequestMethod getMethod() {
        return com.amazon.ask.model.interfaces.alexa.presentation.html.StartRequestMethod.fromValue(method);
    }

    /**
     * Get the underlying String value for method.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return method as a String value
    **/
    @JsonProperty("method")
    public String getMethodAsString() {
      return method;
    }

    /**
     * HTTPS URI of the HTML page to load. This URI must abide by the [URI RFC 3986](https://tools.ietf.org/html/rfc3986). The HTML runtime must perform secure requests, using the HTTPS schema. Maximum size 8000 characters 
     * @return uri
    **/
    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }


    /**
     * HTTP headers that the HTML runtime requires to access resources. Only the Authorization header and custom headers are allowed
     * @return headers
    **/
    @JsonProperty("headers")
    public Object getHeaders() {
        return headers;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartRequest interfacesAlexaPresentationHtmlStartRequest = (StartRequest) o;
        return Objects.equals(this.method, interfacesAlexaPresentationHtmlStartRequest.method) &&
            Objects.equals(this.uri, interfacesAlexaPresentationHtmlStartRequest.uri) &&
            Objects.equals(this.headers, interfacesAlexaPresentationHtmlStartRequest.headers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, uri, headers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartRequest {\n");
        
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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
        private String method;
        private String uri;
        private Object headers;

        private Builder() {}

        @JsonProperty("method")

        public Builder withMethod(String method) {
          this.method = method;
          return this;
        }

        public Builder withMethod(com.amazon.ask.model.interfaces.alexa.presentation.html.StartRequestMethod method) {
            this.method = method != null ? method.toString() : null;
            return this;
        }


        @JsonProperty("uri")

        public Builder withUri(String uri) {
            this.uri = uri;
            return this;
        }


        @JsonProperty("headers")

        public Builder withHeaders(Object headers) {
            this.headers = headers;
            return this;
        }


        public StartRequest build() {
            return new StartRequest(this);
        }
    }
}

