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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * ListNLUAnnotationSetsResponse
 */

@JsonDeserialize(builder = ListNLUAnnotationSetsResponse.Builder.class)
public final class ListNLUAnnotationSetsResponse {

    @JsonProperty("annotationSets")
    private List<com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.AnnotationSet> annotationSets = new ArrayList<com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.AnnotationSet>();

    @JsonProperty("paginationContext")
    private com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.PaginationContext paginationContext = null;

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.Links links = null;

    public static Builder builder() {
        return new Builder();
    }

    private ListNLUAnnotationSetsResponse(Builder builder) {
        if (builder.annotationSets != null) {
            this.annotationSets = builder.annotationSets;
        }
        if (builder.paginationContext != null) {
            this.paginationContext = builder.paginationContext;
        }
        if (builder.links != null) {
            this.links = builder.links;
        }
    }

    /**
     * Get annotationSets
     * @return annotationSets
    **/
    @JsonProperty("annotationSets")
    public List<com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.AnnotationSet> getAnnotationSets() {
        return annotationSets;
    }


    /**
     * Get paginationContext
     * @return paginationContext
    **/
    @JsonProperty("paginationContext")
    public com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.PaginationContext getPaginationContext() {
        return paginationContext;
    }


    /**
     * Get links
     * @return links
    **/
    @JsonProperty("_links")
    public com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.Links getLinks() {
        return links;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNLUAnnotationSetsResponse v1SkillNluAnnotationSetsListNLUAnnotationSetsResponse = (ListNLUAnnotationSetsResponse) o;
        return Objects.equals(this.annotationSets, v1SkillNluAnnotationSetsListNLUAnnotationSetsResponse.annotationSets) &&
            Objects.equals(this.paginationContext, v1SkillNluAnnotationSetsListNLUAnnotationSetsResponse.paginationContext) &&
            Objects.equals(this.links, v1SkillNluAnnotationSetsListNLUAnnotationSetsResponse.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(annotationSets, paginationContext, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNLUAnnotationSetsResponse {\n");
        
        sb.append("    annotationSets: ").append(toIndentedString(annotationSets)).append("\n");
        sb.append("    paginationContext: ").append(toIndentedString(paginationContext)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.AnnotationSet> annotationSets;
        private com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.PaginationContext paginationContext;
        private com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.Links links;

        private Builder() {}

        @JsonProperty("annotationSets")

        public Builder withAnnotationSets(List<com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.AnnotationSet> annotationSets) {
            this.annotationSets = annotationSets;
            return this;
        }

        public Builder addAnnotationSetsItem(com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.AnnotationSet annotationSetsItem) {
            if (this.annotationSets == null) {
                this.annotationSets = new ArrayList<com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.AnnotationSet>();
            }
            this.annotationSets.add(annotationSetsItem);
            return this;
        }

        @JsonProperty("paginationContext")

        public Builder withPaginationContext(com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.PaginationContext paginationContext) {
            this.paginationContext = paginationContext;
            return this;
        }


        @JsonProperty("_links")

        public Builder withLinks(com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.Links links) {
            this.links = links;
            return this;
        }


        public ListNLUAnnotationSetsResponse build() {
            return new ListNLUAnnotationSetsResponse(this);
        }
    }
}

