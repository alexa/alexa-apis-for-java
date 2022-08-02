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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetNLUAnnotationSetPropertiesResponse
 */

@JsonDeserialize(builder = GetNLUAnnotationSetPropertiesResponse.Builder.class)
public final class GetNLUAnnotationSetPropertiesResponse {

    @JsonProperty("locale")
    private String locale = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("numberOfEntries")
    private Integer numberOfEntries = null;

    @JsonProperty("updatedTimestamp")
    private OffsetDateTime updatedTimestamp = null;

    private GetNLUAnnotationSetPropertiesResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private GetNLUAnnotationSetPropertiesResponse(Builder builder) {
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.numberOfEntries != null) {
            this.numberOfEntries = builder.numberOfEntries;
        }
        if (builder.updatedTimestamp != null) {
            this.updatedTimestamp = builder.updatedTimestamp;
        }
    }

    /**
     * Get locale
     * @return locale
    **/
    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }


    /**
     * Name of the NLU annotation set
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Number of entries which represents number of utterances in each NLU annotation set content
     * @return numberOfEntries
    **/
    @JsonProperty("numberOfEntries")
    public Integer getNumberOfEntries() {
        return numberOfEntries;
    }


    /**
     * The lastest updated timestamp for the NLU annotation set
     * @return updatedTimestamp
    **/
    @JsonProperty("updatedTimestamp")
    public OffsetDateTime getUpdatedTimestamp() {
        return updatedTimestamp;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetNLUAnnotationSetPropertiesResponse v1SkillNluAnnotationSetsGetNLUAnnotationSetPropertiesResponse = (GetNLUAnnotationSetPropertiesResponse) o;
        return Objects.equals(this.locale, v1SkillNluAnnotationSetsGetNLUAnnotationSetPropertiesResponse.locale) &&
            Objects.equals(this.name, v1SkillNluAnnotationSetsGetNLUAnnotationSetPropertiesResponse.name) &&
            Objects.equals(this.numberOfEntries, v1SkillNluAnnotationSetsGetNLUAnnotationSetPropertiesResponse.numberOfEntries) &&
            Objects.equals(this.updatedTimestamp, v1SkillNluAnnotationSetsGetNLUAnnotationSetPropertiesResponse.updatedTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locale, name, numberOfEntries, updatedTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetNLUAnnotationSetPropertiesResponse {\n");
        
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    numberOfEntries: ").append(toIndentedString(numberOfEntries)).append("\n");
        sb.append("    updatedTimestamp: ").append(toIndentedString(updatedTimestamp)).append("\n");
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
        private Integer numberOfEntries;
        private OffsetDateTime updatedTimestamp;

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


        @JsonProperty("numberOfEntries")

        public Builder withNumberOfEntries(Integer numberOfEntries) {
            this.numberOfEntries = numberOfEntries;
            return this;
        }


        @JsonProperty("updatedTimestamp")

        public Builder withUpdatedTimestamp(OffsetDateTime updatedTimestamp) {
            this.updatedTimestamp = updatedTimestamp;
            return this;
        }


        public GetNLUAnnotationSetPropertiesResponse build() {
            return new GetNLUAnnotationSetPropertiesResponse(this);
        }
    }
}

