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
 * This is the payload schema for annotation set contents. Note that when uploadId and filePathInUpload is present, and the payload content type is &#39;application/json&#39;, audioAsset is included in the returned annotation set content payload. For &#39;text/csv&#39; annotation set content type, audioAssetDownloadUrl and audioAssetDownloadUrlExpiryTime are included in the csv headers for representing the audio download url and the expiry time of the presigned audio download. 
 */

@JsonDeserialize(builder = GetAsrAnnotationSetAnnotationsResponse.Builder.class)
public final class GetAsrAnnotationSetAnnotationsResponse {

    @JsonProperty("annotations")
    private List<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.AnnotationWithAudioAsset> annotations = new ArrayList<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.AnnotationWithAudioAsset>();

    @JsonProperty("paginationContext")
    private com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.PaginationContext paginationContext = null;

    private GetAsrAnnotationSetAnnotationsResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private GetAsrAnnotationSetAnnotationsResponse(Builder builder) {
        if (builder.annotations != null) {
            this.annotations = builder.annotations;
        }
        if (builder.paginationContext != null) {
            this.paginationContext = builder.paginationContext;
        }
    }

    /**
     * Get annotations
     * @return annotations
    **/
    @JsonProperty("annotations")
    public List<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.AnnotationWithAudioAsset> getAnnotations() {
        return annotations;
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
        GetAsrAnnotationSetAnnotationsResponse v1SkillAsrAnnotationSetsGetAsrAnnotationSetAnnotationsResponse = (GetAsrAnnotationSetAnnotationsResponse) o;
        return Objects.equals(this.annotations, v1SkillAsrAnnotationSetsGetAsrAnnotationSetAnnotationsResponse.annotations) &&
            Objects.equals(this.paginationContext, v1SkillAsrAnnotationSetsGetAsrAnnotationSetAnnotationsResponse.paginationContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(annotations, paginationContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAsrAnnotationSetAnnotationsResponse {\n");
        
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.AnnotationWithAudioAsset> annotations;
        private com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.PaginationContext paginationContext;

        private Builder() {}

        @JsonProperty("annotations")

        public Builder withAnnotations(List<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.AnnotationWithAudioAsset> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder addAnnotationsItem(com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.AnnotationWithAudioAsset annotationsItem) {
            if (this.annotations == null) {
                this.annotations = new ArrayList<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.AnnotationWithAudioAsset>();
            }
            this.annotations.add(annotationsItem);
            return this;
        }

        @JsonProperty("paginationContext")

        public Builder withPaginationContext(com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.PaginationContext paginationContext) {
            this.paginationContext = paginationContext;
            return this;
        }


        public GetAsrAnnotationSetAnnotationsResponse build() {
            return new GetAsrAnnotationSetAnnotationsResponse(this);
        }
    }
}

