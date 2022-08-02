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
 * SkillId information.
 */

@JsonDeserialize(builder = CreateSkillResponse.Builder.class)
public final class CreateSkillResponse {

    @JsonProperty("skillId")
    private String skillId = null;

    private CreateSkillResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private CreateSkillResponse(Builder builder) {
        if (builder.skillId != null) {
            this.skillId = builder.skillId;
        }
    }

    /**
     * ID of the skill created.
     * @return skillId
    **/
    @JsonProperty("skillId")
    public String getSkillId() {
        return skillId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSkillResponse v1SkillCreateSkillResponse = (CreateSkillResponse) o;
        return Objects.equals(this.skillId, v1SkillCreateSkillResponse.skillId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSkillResponse {\n");
        
        sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
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
        private String skillId;

        private Builder() {}

        @JsonProperty("skillId")

        public Builder withSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }


        public CreateSkillResponse build() {
            return new CreateSkillResponse(this);
        }
    }
}

