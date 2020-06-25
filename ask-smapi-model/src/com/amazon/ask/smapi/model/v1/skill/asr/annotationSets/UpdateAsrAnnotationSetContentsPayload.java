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
 * This is the payload shema for updating asr annotation set contents. Note for text/csv content type, the  csv header definitions need to follow the properties of &#39;#/definitions/Annotaion&#39; 
 */

@JsonDeserialize(builder = UpdateAsrAnnotationSetContentsPayload.Builder.class)
public final class UpdateAsrAnnotationSetContentsPayload {

    @JsonProperty("annotations")
    private List<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.Annotation> annotations = new ArrayList<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.Annotation>();

    public static Builder builder() {
        return new Builder();
    }

    private UpdateAsrAnnotationSetContentsPayload(Builder builder) {
        if (builder.annotations != null) {
            this.annotations = builder.annotations;
        }
    }

    /**
     * Get annotations
     * @return annotations
    **/
    @JsonProperty("annotations")
    public List<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.Annotation> getAnnotations() {
        return annotations;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAsrAnnotationSetContentsPayload v1SkillAsrAnnotationSetsUpdateAsrAnnotationSetContentsPayload = (UpdateAsrAnnotationSetContentsPayload) o;
        return Objects.equals(this.annotations, v1SkillAsrAnnotationSetsUpdateAsrAnnotationSetContentsPayload.annotations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(annotations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAsrAnnotationSetContentsPayload {\n");
        
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.Annotation> annotations;

        private Builder() {}

        @JsonProperty("annotations")

        public Builder withAnnotations(List<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.Annotation> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder addAnnotationsItem(com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.Annotation annotationsItem) {
            if (this.annotations == null) {
                this.annotations = new ArrayList<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.Annotation>();
            }
            this.annotations.add(annotationsItem);
            return this;
        }

        public UpdateAsrAnnotationSetContentsPayload build() {
            return new UpdateAsrAnnotationSetContentsPayload(this);
        }
    }
}

