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


package com.amazon.ask.smapi.model.v2.skill;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvocationRequest
 */

@JsonDeserialize(builder = InvocationRequest.Builder.class)
public final class InvocationRequest {

    @JsonProperty("endpoint")
    private String endpoint = null;

    @JsonProperty("body")
    private Map<String, Object> body = new HashMap<String, Object>();

    private InvocationRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private InvocationRequest(Builder builder) {
        if (builder.endpoint != null) {
            this.endpoint = builder.endpoint;
        }
        if (builder.body != null) {
            this.body = builder.body;
        }
    }

    /**
     * Skill's Lambda or HTTPS endpoint.
     * @return endpoint
    **/
    @JsonProperty("endpoint")
    public String getEndpoint() {
        return endpoint;
    }


    /**
     * JSON payload that was sent to the skill's Lambda or HTTPS endpoint. 
     * @return body
    **/
    @JsonProperty("body")
    public Map<String, Object> getBody() {
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
        InvocationRequest v2SkillInvocationRequest = (InvocationRequest) o;
        return Objects.equals(this.endpoint, v2SkillInvocationRequest.endpoint) &&
            Objects.equals(this.body, v2SkillInvocationRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvocationRequest {\n");
        
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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
        private String endpoint;
        private Map<String, Object> body;

        private Builder() {}

        @JsonProperty("endpoint")

        public Builder withEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }


        @JsonProperty("body")

        public Builder withBody(Map<String, Object> body) {
            this.body = body;
            return this;
        }

        public Builder putBodyItem(String key, Object bodyItem) {
            if (this.body == null) {
                this.body = new HashMap<String, Object>();
            }
            this.body.put(key, bodyItem);
            return this;
        }

        public InvocationRequest build() {
            return new InvocationRequest(this);
        }
    }
}

