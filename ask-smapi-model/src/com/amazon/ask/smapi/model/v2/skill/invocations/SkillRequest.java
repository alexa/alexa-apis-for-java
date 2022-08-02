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


package com.amazon.ask.smapi.model.v2.skill.invocations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SkillRequest
 */

@JsonDeserialize(builder = SkillRequest.Builder.class)
public final class SkillRequest {

    @JsonProperty("body")
    private Object body = null;

    private SkillRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SkillRequest(Builder builder) {
        if (builder.body != null) {
            this.body = builder.body;
        }
    }

    /**
     * ASK request body schema as defined in the public facing documentation (https://developer.amazon.com/en-US/docs/alexa/custom-skills/request-and-response-json-reference.html#request-body-syntax) 
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
        SkillRequest v2SkillInvocationsSkillRequest = (SkillRequest) o;
        return Objects.equals(this.body, v2SkillInvocationsSkillRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillRequest {\n");
        
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


        public SkillRequest build() {
            return new SkillRequest(this);
        }
    }
}

