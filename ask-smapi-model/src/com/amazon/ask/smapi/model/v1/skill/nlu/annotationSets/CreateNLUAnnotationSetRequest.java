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


package com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateNLUAnnotationSetRequest
 */

@JsonDeserialize(builder = CreateNLUAnnotationSetRequest.Builder.class)
public final class CreateNLUAnnotationSetRequest {

    @JsonProperty("locale")
    private String locale = null;

    @JsonProperty("name")
    private String name = null;

    private CreateNLUAnnotationSetRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private CreateNLUAnnotationSetRequest(Builder builder) {
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
        if (builder.name != null) {
            this.name = builder.name;
        }
    }

    /**
     * The locale of the NLU annotation set
     * @return locale
    **/
    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }


    /**
     * The name of NLU annotation set provided by customer
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
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
        CreateNLUAnnotationSetRequest v1SkillNluAnnotationSetsCreateNLUAnnotationSetRequest = (CreateNLUAnnotationSetRequest) o;
        return Objects.equals(this.locale, v1SkillNluAnnotationSetsCreateNLUAnnotationSetRequest.locale) &&
            Objects.equals(this.name, v1SkillNluAnnotationSetsCreateNLUAnnotationSetRequest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locale, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNLUAnnotationSetRequest {\n");
        
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
        private String locale;
        private String name;

        private Builder() {}

        @JsonProperty("locale")

        public Builder withLocale(String locale) {
            this.locale = locale;
            return this;
        }


        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        public CreateNLUAnnotationSetRequest build() {
            return new CreateNLUAnnotationSetRequest(this);
        }
    }
}

