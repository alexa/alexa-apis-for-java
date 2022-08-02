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


package com.amazon.ask.smapi.model.v1.skill.nlu.evaluations;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * ResolutionsPerAuthority
 */

@JsonDeserialize(builder = ResolutionsPerAuthority.Builder.class)
public final class ResolutionsPerAuthority {

    @JsonProperty("authority")
    private String authority = null;

    @JsonProperty("status")
    private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResolutionsPerAuthorityStatus status = null;

    @JsonProperty("values")
    private List<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResolutionsPerAuthorityValue> values = new ArrayList<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResolutionsPerAuthorityValue>();

    private ResolutionsPerAuthority() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ResolutionsPerAuthority(Builder builder) {
        if (builder.authority != null) {
            this.authority = builder.authority;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.values != null) {
            this.values = builder.values;
        }
    }

    /**
     * The name of the authority for the slot values. For custom slot types, this authority label incorporates your skill ID and the slot type name. 
     * @return authority
    **/
    @JsonProperty("authority")
    public String getAuthority() {
        return authority;
    }


    /**
     * Get status
     * @return status
    **/
    @JsonProperty("status")
    public com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResolutionsPerAuthorityStatus getStatus() {
        return status;
    }


    /**
     * An array of resolved values for the slot.
     * @return values
    **/
    @JsonProperty("values")
    public List<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResolutionsPerAuthorityValue> getValues() {
        return values;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResolutionsPerAuthority v1SkillNluEvaluationsResolutionsPerAuthority = (ResolutionsPerAuthority) o;
        return Objects.equals(this.authority, v1SkillNluEvaluationsResolutionsPerAuthority.authority) &&
            Objects.equals(this.status, v1SkillNluEvaluationsResolutionsPerAuthority.status) &&
            Objects.equals(this.values, v1SkillNluEvaluationsResolutionsPerAuthority.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authority, status, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResolutionsPerAuthority {\n");
        
        sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
        private String authority;
        private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResolutionsPerAuthorityStatus status;
        private List<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResolutionsPerAuthorityValue> values;

        private Builder() {}

        @JsonProperty("authority")

        public Builder withAuthority(String authority) {
            this.authority = authority;
            return this;
        }


        @JsonProperty("status")

        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResolutionsPerAuthorityStatus status) {
            this.status = status;
            return this;
        }


        @JsonProperty("values")

        public Builder withValues(List<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResolutionsPerAuthorityValue> values) {
            this.values = values;
            return this;
        }

        public Builder addValuesItem(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResolutionsPerAuthorityValue valuesItem) {
            if (this.values == null) {
                this.values = new ArrayList<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResolutionsPerAuthorityValue>();
            }
            this.values.add(valuesItem);
            return this;
        }

        public ResolutionsPerAuthority build() {
            return new ResolutionsPerAuthority(this);
        }
    }
}

