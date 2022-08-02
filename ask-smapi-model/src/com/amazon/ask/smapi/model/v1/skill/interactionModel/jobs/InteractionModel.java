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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Interaction model the job is applied on.
 */

@JsonDeserialize(builder = InteractionModel.Builder.class)
public final class InteractionModel extends com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ResourceObject  {

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("locales")
    private List<String> locales = new ArrayList<String>();

    private InteractionModel() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private InteractionModel(Builder builder) {
        String discriminatorValue = "InteractionModel";

        this.type = discriminatorValue;
        if (builder.id != null) {
            this.id = builder.id;
        }
        if (builder.locales != null) {
            this.locales = builder.locales;
        }
    }

    /**
     * Skill identifier.
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }


    /**
     * Locale identifier and default is empty list which means all available locales.
     * @return locales
    **/
    @JsonProperty("locales")
    public List<String> getLocales() {
        return locales;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InteractionModel v1SkillInteractionModelJobsInteractionModel = (InteractionModel) o;
        return Objects.equals(this.id, v1SkillInteractionModelJobsInteractionModel.id) &&
            Objects.equals(this.locales, v1SkillInteractionModelJobsInteractionModel.locales) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, locales, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InteractionModel {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
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
        private List<String> locales;

        private Builder() {}

        @JsonProperty("id")

        public Builder withId(String id) {
            this.id = id;
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

        public InteractionModel build() {
            return new InteractionModel(this);
        }
    }
}

