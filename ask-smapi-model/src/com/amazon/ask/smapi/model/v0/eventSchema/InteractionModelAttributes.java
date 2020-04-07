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
 * Represents a set of attributes specific to interaction model of an Alexa Skill. 
 */

@JsonDeserialize(builder = InteractionModelAttributes.Builder.class)
public final class InteractionModelAttributes {

    @JsonProperty("skillId")
    private String skillId = null;

    @JsonProperty("vendorId")
    private String vendorId = null;

    public static Builder builder() {
        return new Builder();
    }

    private InteractionModelAttributes(Builder builder) {
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
        InteractionModelAttributes v0EventSchemaInteractionModelAttributes = (InteractionModelAttributes) o;
        return Objects.equals(this.skillId, v0EventSchemaInteractionModelAttributes.skillId) &&
            Objects.equals(this.vendorId, v0EventSchemaInteractionModelAttributes.vendorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillId, vendorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InteractionModelAttributes {\n");
        
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


        public InteractionModelAttributes build() {
            return new InteractionModelAttributes(this);
        }
    }
}

