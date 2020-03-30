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


package com.amazon.ask.smapi.model.v1.skill.validations;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * ValidationsApiRequest
 */

@JsonDeserialize(builder = ValidationsApiRequest.Builder.class)
public final class ValidationsApiRequest {

    @JsonProperty("locales")
    private List<String> locales = new ArrayList<String>();

    public static Builder builder() {
        return new Builder();
    }

    private ValidationsApiRequest(Builder builder) {
        if (builder.locales != null) {
            this.locales = builder.locales;
        }
    }

    /**
     * Get locales
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
        ValidationsApiRequest v1SkillValidationsValidationsApiRequest = (ValidationsApiRequest) o;
        return Objects.equals(this.locales, v1SkillValidationsValidationsApiRequest.locales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locales);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidationsApiRequest {\n");
        
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
        private List<String> locales;

        private Builder() {}

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

        public ValidationsApiRequest build() {
            return new ValidationsApiRequest(this);
        }
    }
}

