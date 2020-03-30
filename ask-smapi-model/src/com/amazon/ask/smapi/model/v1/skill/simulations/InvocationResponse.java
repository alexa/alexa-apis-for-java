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


package com.amazon.ask.smapi.model.v1.skill.simulations;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvocationResponse
 */

@JsonDeserialize(builder = InvocationResponse.Builder.class)
public final class InvocationResponse {

    @JsonProperty("body")
    private Map<String, Object> body = new HashMap<String, Object>();

    public static Builder builder() {
        return new Builder();
    }

    private InvocationResponse(Builder builder) {
        if (builder.body != null) {
            this.body = builder.body;
        }
    }

    /**
     * Payload that was returned by the skill's Lambda or HTTPS endpoint. 
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
        InvocationResponse v1SkillSimulationsInvocationResponse = (InvocationResponse) o;
        return Objects.equals(this.body, v1SkillSimulationsInvocationResponse.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvocationResponse {\n");
        
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
        private Map<String, Object> body;

        private Builder() {}

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

        public InvocationResponse build() {
            return new InvocationResponse(this);
        }
    }
}

