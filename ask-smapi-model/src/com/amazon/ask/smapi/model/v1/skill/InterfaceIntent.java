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
 * InterfaceIntent
 */

@JsonDeserialize(builder = InterfaceIntent.Builder.class)
public final class InterfaceIntent {

    @JsonProperty("isExtensible")
    private Boolean isExtensible = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("isRequired")
    private Boolean isRequired = null;

    public static Builder builder() {
        return new Builder();
    }

    private InterfaceIntent(Builder builder) {
        if (builder.isExtensible != null) {
            this.isExtensible = builder.isExtensible;
        }
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.isRequired != null) {
            this.isRequired = builder.isRequired;
        }
    }

    /**
     * Whether the intent is extensible.
     * @return isExtensible
    **/
    @JsonProperty("isExtensible")
    public Boolean getIsExtensible() {
        return isExtensible;
    }


    /**
     * Name of the intent.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Whether the intent is required in the interface.
     * @return isRequired
    **/
    @JsonProperty("isRequired")
    public Boolean getIsRequired() {
        return isRequired;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InterfaceIntent v1SkillInterfaceIntent = (InterfaceIntent) o;
        return Objects.equals(this.isExtensible, v1SkillInterfaceIntent.isExtensible) &&
            Objects.equals(this.name, v1SkillInterfaceIntent.name) &&
            Objects.equals(this.isRequired, v1SkillInterfaceIntent.isRequired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isExtensible, name, isRequired);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InterfaceIntent {\n");
        
        sb.append("    isExtensible: ").append(toIndentedString(isExtensible)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
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
        private Boolean isExtensible;
        private String name;
        private Boolean isRequired;

        private Builder() {}

        @JsonProperty("isExtensible")

        public Builder withIsExtensible(Boolean isExtensible) {
            this.isExtensible = isExtensible;
            return this;
        }


        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("isRequired")

        public Builder withIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }


        public InterfaceIntent build() {
            return new InterfaceIntent(this);
        }
    }
}

