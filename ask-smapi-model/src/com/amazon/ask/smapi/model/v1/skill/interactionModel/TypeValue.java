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


package com.amazon.ask.smapi.model.v1.skill.interactionModel;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The value schema in type object of interaction model.
 */

@JsonDeserialize(builder = TypeValue.Builder.class)
public final class TypeValue {

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("name")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.TypeValueObject name = null;

    public static Builder builder() {
        return new Builder();
    }

    private TypeValue(Builder builder) {
        if (builder.id != null) {
            this.id = builder.id;
        }
        if (builder.name != null) {
            this.name = builder.name;
        }
    }

    /**
     * Get id
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Get name
     * @return name
    **/
    @JsonProperty("name")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.TypeValueObject getName() {
        return name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TypeValue v1SkillInteractionModelTypeValue = (TypeValue) o;
        return Objects.equals(this.id, v1SkillInteractionModelTypeValue.id) &&
            Objects.equals(this.name, v1SkillInteractionModelTypeValue.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeValue {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
        private String id;
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.TypeValueObject name;

        private Builder() {}

        @JsonProperty("id")
        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        @JsonProperty("name")
        public Builder withName(com.amazon.ask.smapi.model.v1.skill.interactionModel.TypeValueObject name) {
            this.name = name;
            return this;
        }


        public TypeValue build() {
            return new TypeValue(this);
        }
    }
}

