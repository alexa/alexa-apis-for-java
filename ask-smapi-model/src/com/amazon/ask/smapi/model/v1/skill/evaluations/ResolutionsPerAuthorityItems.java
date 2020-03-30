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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * ResolutionsPerAuthorityItems
 */

@JsonDeserialize(builder = ResolutionsPerAuthorityItems.Builder.class)
public final class ResolutionsPerAuthorityItems {

    @JsonProperty("authority")
    private String authority = null;

    @JsonProperty("status")
    private com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityStatus status = null;

    @JsonProperty("values")
    private List<com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityValueItems> values = new ArrayList<com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityValueItems>();

    public static Builder builder() {
        return new Builder();
    }

    private ResolutionsPerAuthorityItems(Builder builder) {
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
    public com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityStatus getStatus() {
        return status;
    }


    /**
     * An array of resolved values for the slot.
     * @return values
    **/
    @JsonProperty("values")
    public List<com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityValueItems> getValues() {
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
        ResolutionsPerAuthorityItems v1SkillEvaluationsResolutionsPerAuthorityItems = (ResolutionsPerAuthorityItems) o;
        return Objects.equals(this.authority, v1SkillEvaluationsResolutionsPerAuthorityItems.authority) &&
            Objects.equals(this.status, v1SkillEvaluationsResolutionsPerAuthorityItems.status) &&
            Objects.equals(this.values, v1SkillEvaluationsResolutionsPerAuthorityItems.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authority, status, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResolutionsPerAuthorityItems {\n");
        
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
        private com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityStatus status;
        private List<com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityValueItems> values;

        private Builder() {}

        @JsonProperty("authority")

        public Builder withAuthority(String authority) {
            this.authority = authority;
            return this;
        }


        @JsonProperty("status")

        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityStatus status) {
            this.status = status;
            return this;
        }


        @JsonProperty("values")

        public Builder withValues(List<com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityValueItems> values) {
            this.values = values;
            return this;
        }

        public Builder addValuesItem(com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityValueItems valuesItem) {
            if (this.values == null) {
                this.values = new ArrayList<com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityValueItems>();
            }
            this.values.add(valuesItem);
            return this;
        }

        public ResolutionsPerAuthorityItems build() {
            return new ResolutionsPerAuthorityItems(this);
        }
    }
}

