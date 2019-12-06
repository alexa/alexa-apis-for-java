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


package com.amazon.ask.smapi.model.v1.skill.evaluations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object representing the status of entity resolution for the slot.
 */

@JsonDeserialize(builder = ResolutionsPerAuthorityStatus.Builder.class)
public final class ResolutionsPerAuthorityStatus {

    @JsonProperty("code")
    private com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityStatusCode code = null;

    public static Builder builder() {
        return new Builder();
    }

    private ResolutionsPerAuthorityStatus(Builder builder) {
        if (builder.code != null) {
            this.code = builder.code;
        }
    }

    /**
     * Get code
     * @return code
    **/
    @JsonProperty("code")
    public com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityStatusCode getCode() {
        return code;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResolutionsPerAuthorityStatus v1SkillEvaluationsResolutionsPerAuthorityStatus = (ResolutionsPerAuthorityStatus) o;
        return Objects.equals(this.code, v1SkillEvaluationsResolutionsPerAuthorityStatus.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResolutionsPerAuthorityStatus {\n");
        
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityStatusCode code;

        private Builder() {}

        @JsonProperty("code")
        public Builder withCode(com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityStatusCode code) {
            this.code = code;
            return this;
        }


        public ResolutionsPerAuthorityStatus build() {
            return new ResolutionsPerAuthorityStatus(this);
        }
    }
}

