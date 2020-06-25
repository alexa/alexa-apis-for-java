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


package com.amazon.ask.smapi.model.v1.skill.invocations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response
 */

@JsonDeserialize(builder = Response.Builder.class)
public final class Response {

    @JsonProperty("body")
    private Object body = null;

    public static Builder builder() {
        return new Builder();
    }

    private Response(Builder builder) {
        if (builder.body != null) {
            this.body = builder.body;
        }
    }

    /**
     * Payload that was returned by the skill's Lambda or HTTPS endpoint. 
     * @return body
    **/
    @JsonProperty("body")
    public Object getBody() {
        return body;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Response v1SkillInvocationsResponse = (Response) o;
        return Objects.equals(this.body, v1SkillInvocationsResponse.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Response {\n");
        
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
        private Object body;

        private Builder() {}

        @JsonProperty("body")

        public Builder withBody(Object body) {
            this.body = body;
            return this;
        }


        public Response build() {
            return new Response(this);
        }
    }
}

