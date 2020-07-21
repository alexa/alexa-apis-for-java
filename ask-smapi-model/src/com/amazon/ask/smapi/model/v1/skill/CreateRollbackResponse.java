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


package com.amazon.ask.smapi.model.v1.skill;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * defines the response body when a rollback request is created
 */

@JsonDeserialize(builder = CreateRollbackResponse.Builder.class)
public final class CreateRollbackResponse {

    @JsonProperty("rollbackRequestId")
    private String rollbackRequestId = null;

    public static Builder builder() {
        return new Builder();
    }

    private CreateRollbackResponse(Builder builder) {
        if (builder.rollbackRequestId != null) {
            this.rollbackRequestId = builder.rollbackRequestId;
        }
    }

    /**
     * defines the identifier for a rollback request.
     * @return rollbackRequestId
    **/
    @JsonProperty("rollbackRequestId")
    public String getRollbackRequestId() {
        return rollbackRequestId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRollbackResponse v1SkillCreateRollbackResponse = (CreateRollbackResponse) o;
        return Objects.equals(this.rollbackRequestId, v1SkillCreateRollbackResponse.rollbackRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollbackRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRollbackResponse {\n");
        
        sb.append("    rollbackRequestId: ").append(toIndentedString(rollbackRequestId)).append("\n");
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
        private String rollbackRequestId;

        private Builder() {}

        @JsonProperty("rollbackRequestId")

        public Builder withRollbackRequestId(String rollbackRequestId) {
            this.rollbackRequestId = rollbackRequestId;
            return this;
        }


        public CreateRollbackResponse build() {
            return new CreateRollbackResponse(this);
        }
    }
}

