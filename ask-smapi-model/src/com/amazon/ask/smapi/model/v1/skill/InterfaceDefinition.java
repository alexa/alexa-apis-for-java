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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Interface related objects.
 */

@JsonDeserialize(builder = InterfaceDefinition.Builder.class)
public final class InterfaceDefinition {

    @JsonProperty("isGlobal")
    private Boolean isGlobal = null;

    @JsonProperty("locales")
    private List<String> locales = new ArrayList<String>();

    @JsonProperty("intents")
    private List<com.amazon.ask.smapi.model.v1.skill.InterfaceIntent> intents = new ArrayList<com.amazon.ask.smapi.model.v1.skill.InterfaceIntent>();

    public static Builder builder() {
        return new Builder();
    }

    private InterfaceDefinition(Builder builder) {
        if (builder.isGlobal != null) {
            this.isGlobal = builder.isGlobal;
        }
        if (builder.locales != null) {
            this.locales = builder.locales;
        }
        if (builder.intents != null) {
            this.intents = builder.intents;
        }
    }

    /**
     * Whether this interface is available in all supported locales.
     * @return isGlobal
    **/
    @JsonProperty("isGlobal")
    public Boolean getIsGlobal() {
        return isGlobal;
    }


    /**
     * The locales of the interface.
     * @return locales
    **/
    @JsonProperty("locales")
    public List<String> getLocales() {
        return locales;
    }


    /**
     * The intents in the interface.
     * @return intents
    **/
    @JsonProperty("intents")
    public List<com.amazon.ask.smapi.model.v1.skill.InterfaceIntent> getIntents() {
        return intents;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InterfaceDefinition v1SkillInterfaceDefinition = (InterfaceDefinition) o;
        return Objects.equals(this.isGlobal, v1SkillInterfaceDefinition.isGlobal) &&
            Objects.equals(this.locales, v1SkillInterfaceDefinition.locales) &&
            Objects.equals(this.intents, v1SkillInterfaceDefinition.intents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isGlobal, locales, intents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InterfaceDefinition {\n");
        
        sb.append("    isGlobal: ").append(toIndentedString(isGlobal)).append("\n");
        sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
        sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
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
        private Boolean isGlobal;
        private List<String> locales;
        private List<com.amazon.ask.smapi.model.v1.skill.InterfaceIntent> intents;

        private Builder() {}

        @JsonProperty("isGlobal")

        public Builder withIsGlobal(Boolean isGlobal) {
            this.isGlobal = isGlobal;
            return this;
        }


        @JsonProperty("locales")

        public Builder withLocales(List<String> locales) {
            this.locales = locales;
            return this;
        }

        public Builder addLocalesItem(String localesItem) {
            if (this.locales == null) {
                this.locales = new ArrayList<String>();
            }
            this.locales.add(localesItem);
            return this;
        }

        @JsonProperty("intents")

        public Builder withIntents(List<com.amazon.ask.smapi.model.v1.skill.InterfaceIntent> intents) {
            this.intents = intents;
            return this;
        }

        public Builder addIntentsItem(com.amazon.ask.smapi.model.v1.skill.InterfaceIntent intentsItem) {
            if (this.intents == null) {
                this.intents = new ArrayList<com.amazon.ask.smapi.model.v1.skill.InterfaceIntent>();
            }
            this.intents.add(intentsItem);
            return this;
        }

        public InterfaceDefinition build() {
            return new InterfaceDefinition(this);
        }
    }
}

