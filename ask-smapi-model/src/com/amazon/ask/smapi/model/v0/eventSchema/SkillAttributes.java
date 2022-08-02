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


package com.amazon.ask.smapi.model.v0.eventSchema;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a set of attributes specific to an Alexa Skill. 
 */

@JsonDeserialize(builder = SkillAttributes.Builder.class)
public final class SkillAttributes {

    @JsonProperty("skillId")
    private String skillId = null;

    @JsonProperty("vendorId")
    private String vendorId = null;

    private SkillAttributes() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SkillAttributes(Builder builder) {
        if (builder.skillId != null) {
            this.skillId = builder.skillId;
        }
        if (builder.vendorId != null) {
            this.vendorId = builder.vendorId;
        }
    }

    /**
     * Unique identifier of an Alexa skill. 
     * @return skillId
    **/
    @JsonProperty("skillId")
    public String getSkillId() {
        return skillId;
    }


    /**
     * Unique identifier of vendor account to which this skill belongs. 
     * @return vendorId
    **/
    @JsonProperty("vendorId")
    public String getVendorId() {
        return vendorId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillAttributes v0EventSchemaSkillAttributes = (SkillAttributes) o;
        return Objects.equals(this.skillId, v0EventSchemaSkillAttributes.skillId) &&
            Objects.equals(this.vendorId, v0EventSchemaSkillAttributes.vendorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillId, vendorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillAttributes {\n");
        
        sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
        sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
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
        private String vendorId;

        private Builder() {}

        @JsonProperty("skillId")

        public Builder withSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }


        @JsonProperty("vendorId")

        public Builder withVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }


        public SkillAttributes build() {
            return new SkillAttributes(this);
        }
    }
}

