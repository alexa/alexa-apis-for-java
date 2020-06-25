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


package com.amazon.ask.smapi.model.v1.skill.asr.evaluations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostAsrEvaluationsRequestObject
 */

@JsonDeserialize(builder = PostAsrEvaluationsRequestObject.Builder.class)
public final class PostAsrEvaluationsRequestObject {

    @JsonProperty("skill")
    private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.Skill skill = null;

    @JsonProperty("annotationSetId")
    private String annotationSetId = null;

    public static Builder builder() {
        return new Builder();
    }

    private PostAsrEvaluationsRequestObject(Builder builder) {
        if (builder.skill != null) {
            this.skill = builder.skill;
        }
        if (builder.annotationSetId != null) {
            this.annotationSetId = builder.annotationSetId;
        }
    }

    /**
     * Get skill
     * @return skill
    **/
    @JsonProperty("skill")
    public com.amazon.ask.smapi.model.v1.skill.asr.evaluations.Skill getSkill() {
        return skill;
    }


    /**
     * ID for annotation set
     * @return annotationSetId
    **/
    @JsonProperty("annotationSetId")
    public String getAnnotationSetId() {
        return annotationSetId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostAsrEvaluationsRequestObject v1SkillAsrEvaluationsPostAsrEvaluationsRequestObject = (PostAsrEvaluationsRequestObject) o;
        return Objects.equals(this.skill, v1SkillAsrEvaluationsPostAsrEvaluationsRequestObject.skill) &&
            Objects.equals(this.annotationSetId, v1SkillAsrEvaluationsPostAsrEvaluationsRequestObject.annotationSetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skill, annotationSetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostAsrEvaluationsRequestObject {\n");
        
        sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
        sb.append("    annotationSetId: ").append(toIndentedString(annotationSetId)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.Skill skill;
        private String annotationSetId;

        private Builder() {}

        @JsonProperty("skill")

        public Builder withSkill(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.Skill skill) {
            this.skill = skill;
            return this;
        }


        @JsonProperty("annotationSetId")

        public Builder withAnnotationSetId(String annotationSetId) {
            this.annotationSetId = annotationSetId;
            return this;
        }


        public PostAsrEvaluationsRequestObject build() {
            return new PostAsrEvaluationsRequestObject(this);
        }
    }
}

