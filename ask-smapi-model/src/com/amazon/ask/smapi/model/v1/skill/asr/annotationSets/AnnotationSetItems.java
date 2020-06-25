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


package com.amazon.ask.smapi.model.v1.skill.asr.annotationSets;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AnnotationSetItems
 */

@JsonDeserialize(builder = AnnotationSetItems.Builder.class)
public final class AnnotationSetItems {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("annotationCount")
    private Integer annotationCount = null;

    @JsonProperty("lastUpdatedTimestamp")
    private OffsetDateTime lastUpdatedTimestamp = null;

    @JsonProperty("id")
    private String id = null;

    public static Builder builder() {
        return new Builder();
    }

    private AnnotationSetItems(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.annotationCount != null) {
            this.annotationCount = builder.annotationCount;
        }
        if (builder.lastUpdatedTimestamp != null) {
            this.lastUpdatedTimestamp = builder.lastUpdatedTimestamp;
        }
        if (builder.id != null) {
            this.id = builder.id;
        }
    }

    /**
     * Name of the ASR annotation set
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Number of annotations within an annotation set
     * @return annotationCount
    **/
    @JsonProperty("annotationCount")
    public Integer getAnnotationCount() {
        return annotationCount;
    }


    /**
     * The timestamp for the most recent update of ASR annotation set
     * @return lastUpdatedTimestamp
    **/
    @JsonProperty("lastUpdatedTimestamp")
    public OffsetDateTime getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }


    /**
     * annotation set id
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnnotationSetItems v1SkillAsrAnnotationSetsAnnotationSetItems = (AnnotationSetItems) o;
        return Objects.equals(this.name, v1SkillAsrAnnotationSetsAnnotationSetItems.name) &&
            Objects.equals(this.annotationCount, v1SkillAsrAnnotationSetsAnnotationSetItems.annotationCount) &&
            Objects.equals(this.lastUpdatedTimestamp, v1SkillAsrAnnotationSetsAnnotationSetItems.lastUpdatedTimestamp) &&
            Objects.equals(this.id, v1SkillAsrAnnotationSetsAnnotationSetItems.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, annotationCount, lastUpdatedTimestamp, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnnotationSetItems {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    annotationCount: ").append(toIndentedString(annotationCount)).append("\n");
        sb.append("    lastUpdatedTimestamp: ").append(toIndentedString(lastUpdatedTimestamp)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
        private Integer annotationCount;
        private OffsetDateTime lastUpdatedTimestamp;
        private String id;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("annotationCount")

        public Builder withAnnotationCount(Integer annotationCount) {
            this.annotationCount = annotationCount;
            return this;
        }


        @JsonProperty("lastUpdatedTimestamp")

        public Builder withLastUpdatedTimestamp(OffsetDateTime lastUpdatedTimestamp) {
            this.lastUpdatedTimestamp = lastUpdatedTimestamp;
            return this;
        }


        @JsonProperty("id")

        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        public AnnotationSetItems build() {
            return new AnnotationSetItems(this);
        }
    }
}

