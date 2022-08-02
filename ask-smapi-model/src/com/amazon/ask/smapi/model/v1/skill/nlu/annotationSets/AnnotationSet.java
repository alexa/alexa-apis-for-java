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
 * AnnotationSet
 */

@JsonDeserialize(builder = AnnotationSet.Builder.class)
public final class AnnotationSet {

    @JsonProperty("locale")
    private String locale = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("numberOfEntries")
    private Integer numberOfEntries = null;

    @JsonProperty("updatedTimestamp")
    private OffsetDateTime updatedTimestamp = null;

    @JsonProperty("annotationId")
    private String annotationId = null;

    private AnnotationSet() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private AnnotationSet(Builder builder) {
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
        if (builder.annotationId != null) {
            this.annotationId = builder.annotationId;
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


    /**
     * Identifier of the NLU annotation set.
     * @return annotationId
    **/
    @JsonProperty("annotationId")
    public String getAnnotationId() {
        return annotationId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnnotationSet v1SkillNluAnnotationSetsAnnotationSet = (AnnotationSet) o;
        return Objects.equals(this.locale, v1SkillNluAnnotationSetsAnnotationSet.locale) &&
            Objects.equals(this.name, v1SkillNluAnnotationSetsAnnotationSet.name) &&
            Objects.equals(this.numberOfEntries, v1SkillNluAnnotationSetsAnnotationSet.numberOfEntries) &&
            Objects.equals(this.updatedTimestamp, v1SkillNluAnnotationSetsAnnotationSet.updatedTimestamp) &&
            Objects.equals(this.annotationId, v1SkillNluAnnotationSetsAnnotationSet.annotationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locale, name, numberOfEntries, updatedTimestamp, annotationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnnotationSet {\n");
        
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    numberOfEntries: ").append(toIndentedString(numberOfEntries)).append("\n");
        sb.append("    updatedTimestamp: ").append(toIndentedString(updatedTimestamp)).append("\n");
        sb.append("    annotationId: ").append(toIndentedString(annotationId)).append("\n");
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
        private String annotationId;

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


        @JsonProperty("annotationId")

        public Builder withAnnotationId(String annotationId) {
            this.annotationId = annotationId;
            return this;
        }


        public AnnotationSet build() {
            return new AnnotationSet(this);
        }
    }
}

