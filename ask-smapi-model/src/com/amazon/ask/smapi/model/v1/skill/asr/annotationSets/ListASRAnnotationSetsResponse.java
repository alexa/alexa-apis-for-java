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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * ListASRAnnotationSetsResponse
 */

@JsonDeserialize(builder = ListASRAnnotationSetsResponse.Builder.class)
public final class ListASRAnnotationSetsResponse {

    @JsonProperty("annotationSets")
    private List<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.AnnotationSetItems> annotationSets = new ArrayList<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.AnnotationSetItems>();

    @JsonProperty("paginationContext")
    private com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.PaginationContext paginationContext = null;

    private ListASRAnnotationSetsResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ListASRAnnotationSetsResponse(Builder builder) {
        if (builder.annotationSets != null) {
            this.annotationSets = builder.annotationSets;
        }
        if (builder.paginationContext != null) {
            this.paginationContext = builder.paginationContext;
        }
    }

    /**
     * Get annotationSets
     * @return annotationSets
    **/
    @JsonProperty("annotationSets")
    public List<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.AnnotationSetItems> getAnnotationSets() {
        return annotationSets;
    }


    /**
     * Get paginationContext
     * @return paginationContext
    **/
    @JsonProperty("paginationContext")
    public com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.PaginationContext getPaginationContext() {
        return paginationContext;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListASRAnnotationSetsResponse v1SkillAsrAnnotationSetsListASRAnnotationSetsResponse = (ListASRAnnotationSetsResponse) o;
        return Objects.equals(this.annotationSets, v1SkillAsrAnnotationSetsListASRAnnotationSetsResponse.annotationSets) &&
            Objects.equals(this.paginationContext, v1SkillAsrAnnotationSetsListASRAnnotationSetsResponse.paginationContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(annotationSets, paginationContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListASRAnnotationSetsResponse {\n");
        
        sb.append("    annotationSets: ").append(toIndentedString(annotationSets)).append("\n");
        sb.append("    paginationContext: ").append(toIndentedString(paginationContext)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.AnnotationSetItems> annotationSets;
        private com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.PaginationContext paginationContext;

        private Builder() {}

        @JsonProperty("annotationSets")

        public Builder withAnnotationSets(List<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.AnnotationSetItems> annotationSets) {
            this.annotationSets = annotationSets;
            return this;
        }

        public Builder addAnnotationSetsItem(com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.AnnotationSetItems annotationSetsItem) {
            if (this.annotationSets == null) {
                this.annotationSets = new ArrayList<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.AnnotationSetItems>();
            }
            this.annotationSets.add(annotationSetsItem);
            return this;
        }

        @JsonProperty("paginationContext")

        public Builder withPaginationContext(com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.PaginationContext paginationContext) {
            this.paginationContext = paginationContext;
            return this;
        }


        public ListASRAnnotationSetsResponse build() {
            return new ListASRAnnotationSetsResponse(this);
        }
    }
}

