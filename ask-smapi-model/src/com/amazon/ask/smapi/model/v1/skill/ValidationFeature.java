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
 * Structure representing a public feature.
 */

@JsonDeserialize(builder = ValidationFeature.Builder.class)
public final class ValidationFeature {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("contact")
    private String contact = null;

    public static Builder builder() {
        return new Builder();
    }

    private ValidationFeature(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.contact != null) {
            this.contact = builder.contact;
        }
    }

    /**
     * Name of the feature.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Contact URL or email for the feature.
     * @return contact
    **/
    @JsonProperty("contact")
    public String getContact() {
        return contact;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValidationFeature v1SkillValidationFeature = (ValidationFeature) o;
        return Objects.equals(this.name, v1SkillValidationFeature.name) &&
            Objects.equals(this.contact, v1SkillValidationFeature.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contact);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidationFeature {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
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
        private String name;
        private String contact;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("contact")

        public Builder withContact(String contact) {
            this.contact = contact;
            return this;
        }


        public ValidationFeature build() {
            return new ValidationFeature(this);
        }
    }
}

